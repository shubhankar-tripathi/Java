import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings("serial")
public class Table<K, V> extends ArrayList<Map.Entry<K, V>> {

	@SuppressWarnings("hiding")
	public <K,V> void gett(K k, Table<K, V> table) {
		for(Entry<K,V> entry : table) {
			if(entry.getKey().equals(k)) System.out.println(entry.getValue());
		}
	}

	@SuppressWarnings("hiding")
	public <K,V> void put(K k, V v, Table<K,V> table) {
		table.add(new AbstractMap.SimpleEntry<>(k,v));
	}
	
	@SuppressWarnings("hiding")
	public <K,V> void removee(K k, Table<K,V> table) {
		Entry<K,V> removable = null;
		for(Entry<K,V> entry : table) {
			if(entry.getKey().equals(k)) removable = entry; 
		}
		table.remove(removable);
	}


}
