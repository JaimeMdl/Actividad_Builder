public class Pantalla {

    private String titulo;
    private String cabecera;
    private String contenido;
    private String botonPrincipal;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCabecera(String cabecera) {
        this.cabecera = cabecera;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setBotonPrincipal(String botonPrincipal) {
        this.botonPrincipal = botonPrincipal;
    }

    public void mostrar() {
        System.out.println("------------------------");
        System.out.println(titulo.toUpperCase());
        System.out.println("------------------------");
        System.out.println(cabecera);
        System.out.println(contenido);
        System.out.println("[ " + botonPrincipal + " ]");
        System.out.println("------------------------");
    }
}
