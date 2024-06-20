public class Grafo extends Principal {
    private int vertices;
    private int aristas;

    public Grafo(int vertices, int aristas) {
        super(0); // El valor no es relevante para el grafo, así que se puede pasar 0
        this.vertices = vertices;
        this.aristas = aristas;
    }

    public void agregarVertice() {
    }

    public void agregarArista() {
    }

    public void eliminarVertice() {
    }

    public void eliminarArista() {
    }

    public void recorrer() {
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int getAristas() {
        return aristas;
    }

    public void setAristas(int aristas) {
        this.aristas = aristas;
    }
}