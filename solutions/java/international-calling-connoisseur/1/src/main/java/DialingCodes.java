import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private final Map<Integer, String> codes;

    public DialingCodes(){
        this.codes = new HashMap<>();
    }
    
    public Map<Integer, String> getCodes() {
        return this.codes;
    }

    public void setDialingCode(Integer code, String country) {
        Map<Integer, String> codes = this.getCodes();
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.getCodes().get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!this.getCodes().containsKey(code) && !this.getCodes().containsValue(country)){
            this.setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        Map<Integer, String> mapCodes = this.getCodes();
        for(Map.Entry<Integer, String> code : mapCodes.entrySet()){
            if(code.getValue().equals(country)){
                return code.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = this.findDialingCode(country);
        if (oldCode != null){
            this.getCodes().remove(oldCode);
            this.addNewDialingCode(code, country);
            
        }
    }
}
