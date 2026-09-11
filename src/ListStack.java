public class ListStack {

//     NOTA: Si vas a implementar la pila con la opcion1: array (ArrayStack) puedes borrar este archivo.

    StackNode top;
    int size = 0;

    public boolean isEmpty() {
        return this.top == null;
    }

    public int getSize() {
        return this.size;
    }

    public boolean push(Object object) {
        try {
            StackNode nuevo = new StackNode(object);
            nuevo.above = this.top;
            this.top = nuevo;
            this.size++;
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            return false;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        StackNode nodoBorrado = this.top;
        this.top = this.top.above;
        this.size--;
        return nodoBorrado.object;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.top.object;
    }

    public void clear() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ListStack{top->");
        StackNode iterador = this.top;
        while (iterador != null) {
            sb.append(iterador.object);
            if (iterador.above != null) {
                sb.append(", ");
            }
            iterador = iterador.above;
        }
        sb.append("}");
        return sb.toString();
    }
}