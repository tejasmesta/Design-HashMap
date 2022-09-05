class MyHashMap {
    ArrayList<Integer> l1;
    ArrayList<Integer> l2;
    
    public MyHashMap() 
    {
        this.l1 = new ArrayList<>();
        this.l2 = new ArrayList<>();
    }
    
    public void put(int key, int value) 
    {
        if(l1.contains(key))
        {
            int index = l1.indexOf(key);
            l2.set(index,value);
        }
        else
        {
            l1.add(key);
            l2.add(value);
        }
    }
    
    public int get(int key) 
    {
        if(l1.contains(key))
        {
            int index = l1.indexOf(key);
            return l2.get(index);
        }
        return -1;
    }
    
    public void remove(int key) 
    {
        if(l1.contains(key))
        {
            int index = l1.indexOf(key);
            l1.remove(index);
            l2.remove(index);
        }
    }
}
