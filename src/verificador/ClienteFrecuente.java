package verificador;

import Servicios.TCliente;
import java.sql.SQLException;

public class ClienteFrecuente extends Parametros {
    private static TCliente Cliente;
    private static String Tarjeta;
    
    public ClienteFrecuente(String tarjeta) throws SQLException{
        Tarjeta = tarjeta;
        Cliente = tarjetaCliente(getCFSucursal(),getCFPos(),getCFOperador(),"0001",Tarjeta,getCFIp(),getCFPort(),getCFTimeout());
    }
    
    public boolean TarjetaValida(){
        if (getTipoEmp() == 1){ //Cambiar a 1
           return true;
        }else{
            return false;
        }
    }
    
    public boolean ErrorTarjeta(){
        if (Cliente.getMensaje().substring(0, 3).equals("ERR") || Cliente.getMensaje().equals("Fuera de Linea")){
            return true;
        }else{
            return false;
        }  
    }
    
    public double getImporte(){
        return Cliente.getImporte();
    }
    public int getSaldo(){
        return Cliente.getSaldo();
    }
    public int getTipoEmp(){
        return Cliente.getTipoEmp();
    }
    public String getMensaje(){
        return Cliente.getMensaje();
    }
    public String getTarjeta(){
        return Tarjeta;
    }

    private static TCliente tarjetaCliente(String sucursal, String pos, String operador, String secuencia, String tarjeta, String ip, String puerto, String timeout) {
        Servicios.Service service = new Servicios.Service();
        Servicios.ServiceSoap port = service.getServiceSoap();
        return port.tarjetaCliente(sucursal, pos, operador, secuencia, tarjeta, ip, puerto, timeout);
    }
}
