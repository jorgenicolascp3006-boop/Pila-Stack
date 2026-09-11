void main() {
    System.out.println("=== Prueba de ListStack ===");
    ListStack listStack = new ListStack();
    System.out.println("¿Está vacía? " + listStack.isEmpty());

    listStack.push(1);
    listStack.push("Juan");
    listStack.push(true);
    System.out.println(listStack.toString());
    System.out.println("Tamaño: " + listStack.getSize());
    System.out.println("Peek: " + listStack.peek());

    Object desapilado = listStack.pop();
    System.out.println("Se desapiló: " + desapilado);
    System.out.println(listStack.toString());
    System.out.println("Tamaño: " + listStack.getSize());
//termine
    listStack.clear();
    System.out.println("Después de clear: " + listStack.toString());
    System.out.println("¿Está vacía? " + listStack.isEmpty());

    System.out.println();
    System.out.println("=== Prueba de ArrayStack ===");
    ArrayStack arrayStack = new ArrayStack(5);
    System.out.println("¿Está vacía? " + arrayStack.isEmpty());

    arrayStack.push(1);
    arrayStack.push("Juan");
    arrayStack.push(true);
    System.out.println(arrayStack.toString());
    System.out.println("Tamaño: " + arrayStack.getSize());
    System.out.println("Peek: " + arrayStack.peek());

    Object desapiladoArray = arrayStack.pop();
    System.out.println("Se desapiló: " + desapiladoArray);
    System.out.println(arrayStack.toString());
    System.out.println("Tamaño: " + arrayStack.getSize());

    arrayStack.push("A");
    arrayStack.push("B");
    arrayStack.push("C");
    System.out.println(arrayStack.toString());
    System.out.println("¿Está llena? " + arrayStack.isFull());
    boolean resultado = arrayStack.push("D");
    System.out.println("¿Se pudo agregar 'D'? " + resultado);

    arrayStack.clear();
    System.out.println("Después de clear: " + arrayStack.toString());
    System.out.println("¿Está vacía? " + arrayStack.isEmpty());
}
