
import java.util.Date;

public class Cliente extends Persona {
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegistro,boolean vip){
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

//    public void setIdCliente(int idCliente) {
//        this.idCliente = idCliente;
//    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getContadorCliente() {
        return contadorCliente;
    }

//    public void setContadorCliente(int contadorCliente) {
//        this.contadorCliente = contadorCliente;
//    }

    @Override
    public String toString() {
        return super.toString() + "\nCliente:" + "\nidCliente=" + idCliente + ", \nfechaRegistro=" + fechaRegistro + ", \nvip=" + vip + ", \ncontadorCliente=" + contadorCliente;
    }
    
    
    
    
}
