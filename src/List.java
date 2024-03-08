public class List {
    private Order[] order;
    private int nextIndex;

    public List() {
        this.nextIndex =0;
        order = new Order[0];
    }
    public void extendArray(){
        int size = order.length + 10;
        Order[] temp = new Order[size];
        for(int i=0;i<order.length;i++){
            temp[i] = order[i];
        }
        order = temp;
    }

    public boolean isFull(){
        return nextIndex >= order.length;
    }

    public boolean isEmpty(){
        return nextIndex <=0;
    }

    public void add(Order obj){
        if(isFull()){extendArray();}
        order[nextIndex++] = obj;
    }

    public void remove(int index){
        if(isEmpty()){
            System.out.println("The Array is Empty");
        }else{
            for(int i=index;i< order.length-1;i++){
                order[i] = order[i+1];
            }
        }
    }

    public Order get(int index){
        if(isEmpty()){return null;}
        return order[index];
    }

    public int size(){
        return nextIndex;
    }
}
