package entidades;


public class Producto implements Comparable<Producto>{
     private int codigo;
    private String descripcion;
    private Double precio;
    private int stock;
    private Categoria categorias;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, Double precio, int stock, Categoria categorias) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categorias = categorias;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategorias() {
        return categorias;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }

    @Override
    public int compareTo(Producto t) {
        if (this.codigo == t.codigo) {
            return 0;
        } else if (this.codigo > t.codigo) {
            return 1;
        }else {
            return -1;
        }
    }
}
