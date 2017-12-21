import java.util.ArrayList;

@SuppressWarnings("serial")
public class Table<K,V> extends ArrayList<Table<K,V>.Entry> {
	public class Entry{
		private K k;
		private V v;
		private String entry;
		public Entry(K k, V v){
			this.k = k;
			this.v = v;
			entry = "{"+k+"="+v+"}";
		}
		
		public K getKey() {
			return k ;
		}
		public V getValue() {
			return v;
		}
	}
	@SuppressWarnings("hiding")
	public <K,V> V get(K k, Table<K,V> table) {
		V vret = null;
		for( Table<K,V>.Entry entry : table) {
			if(entry.getKey().equals(k)) vret = entry.getValue();
		}
		return vret;
	}

	@SuppressWarnings("hiding")
	public <K,V> void put(K k, V v, Table<K,V> table) {
		table.add(table.new Entry(k,v));
	}
	@SuppressWarnings("hiding")
	public <K,V> void remove(K k, Table<K,V> table) {
		Table<K,V>.Entry removable = null;
		for(Table<K,V>.Entry entry : table) {
			if(entry.getKey().equals(k)) removable = entry; 
		}
		table.remove(removable);
	}
}
