package Java.Projects.list_1.src;

public class List<item> {
    private item[] items;
    private int size;
    private int capacity;

    public List() {
        this.capacity = 10;
        this.size = 0;
        this.items = (item[]) new Object[this.capacity];
    }

    public void add(item newItem) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.items[this.size] = newItem;
        this.size++;
    }

    public item get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        return this.items[index];
    }

    public void set(int index, item val){
        this.items[index] = val;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        System.arraycopy(this.items, index + 1, this.items, index, this.size - index - 1);
        this.items[this.size - 1] = null; 
        this.size--;
    }
    
    public int size() {
        return this.size;
    }

    private void resize() {
        this.capacity *= 2;
        item[] newItems = (item[]) new Object[this.capacity];
        System.arraycopy(this.items, 0, newItems, 0, this.size);
        this.items = newItems;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.size; i++){
            sb.append(this.items[i]);
            if(i < this.size - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
