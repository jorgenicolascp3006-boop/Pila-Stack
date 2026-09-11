public class ArrayStack {
//     NOTA: Si vas a implementar la pila con la opcion 2: Lista simplemente enlazada (ListStack) puedes borrar este archivo.

    int size;
    Object[] array;
    int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int size) {
        this.size = size;
        this.array = new Object[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }

    public int getSize() {
        return this.top + 1;
    }

    public boolean push(Object object) {
        if (isFull()) {
            System.out.println("La pila está llena");
            return false;
        }
        this.top++;
        this.array[this.top] = object;
        return true;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        Object dato = this.array[this.top];
        this.array[this.top] = null;
        this.top--;
        return dato;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.array[this.top];
    }

    public void clear() {
        for (int i = 0; i <= this.top; i++) {
            this.array[i] = null;
        }
        this.top = -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ArrayStack{top->");
        for (int i = this.top; i >= 0; i--) {
            sb.append(this.array[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
