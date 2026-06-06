import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new HashSet<>(cards);
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> copy = new HashSet<>(theirCollection);
        copy.removeAll(myCollection);
        if(theirCollection.containsAll(myCollection)){
            return false;
        }
        if(myCollection.isEmpty() || copy.isEmpty()){
            return false;
        }
        
        return true;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet(collections.get(0));
        for(Set<String> collection : collections){
            common.retainAll(collection);
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet(collections.get(0));
        for(Set<String> collection : collections){
            all.addAll(collection);
        }
        return all;
        
    }
}
