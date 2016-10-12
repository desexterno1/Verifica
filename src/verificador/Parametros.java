package verificador;

import java.sql.*;

public class Parametros {
    //Parametros Cliente Frecuente
    private static String cfip;
    private static String cfport;
    private static String cftimeout;
    private static String cfsucursal;
    private static String cfpos;
    private static String cfoperador;
    //Parametros Tarjeta Amiga
    private static String tacomercio;
    private static String taterminal;
    private static String taip;
    //Parametros Base de Datos
    private static String bdnombre;
    private static String bdservidor;
    private static String bdpuerto;
    private static String bdusuario;
    private static String bdpassword;
    
    public Parametros() throws SQLException{
        ResultSet Result = datos.conexion.execquery("Select * From Parametros");
        String Param,Value;
        
        while(Result.next()) {
            Param = Result.getString("parameter");
            Value = Result.getString("value");
            
            SetParam(Param,Value);
        }
    }
    
    public void InsertCliente() throws SQLException{
        InsertParam("cfip");
        InsertParam("cfport");
        InsertParam("cftimeout");
        InsertParam("cfsucursal");
        InsertParam("cfpos");
        InsertParam("cfoperador");   
    }
    
    public void InsertTarjetaAmiga() throws SQLException{
        InsertParam("tacomercio");
        InsertParam("taterminal"); 
        InsertParam("taip"); 
    }
    public void InsertBaseDatos() throws SQLException{
        InsertParam("bdnombre");
        InsertParam("bdservidor");
        InsertParam("bdpuerto");
        InsertParam("bdusuario");
        InsertParam("bdpassword");
    }
    
    private void InsertParam(String Param) throws SQLException{
        String Err = new String();
        String[] Values = new String[2];
        String[] Types = new String[2];
                
        Values[0] = Param;
        Values[1] = GetParam(Param);
        Types[0] = "s";
        Types[1] = "s";
        
        datos.conexion.exec_sp("EXEC SP_InsertParam ?,?",Values,Types,Err);
    }
    
    private String GetParam(String Param){
        
        if (Param.equals("cfip")){
            return getCFIp();
        } else if (Param.equals("cfport")){
            return getCFPort();
        } else if (Param.equals("cftimeout")){
            return getCFTimeout();
        } else if (Param.equals("cfsucursal")){
            return getCFSucursal();
        } else if (Param.equals("cfpos")){
            return getCFPos();
        } else if (Param.equals("cfoperador")){
            return getCFOperador();
        } else if (Param.equals("tacomercio")){
            return getTAComercio();
        } else if (Param.equals("taterminal")){
            return getTATerminal();
        } else if (Param.equals("taip")){
            return getTAIp();
        } else if (Param.equals("bdnombre")){
            return getBDNombre();
        } else if (Param.equals("bdservidor")){
            return getBDServidor();
        } else if (Param.equals("bdpuerto")){
            return getBDPuerto();
        } else if (Param.equals("bdusuario")){
            return getBDUsuario();
        } else if (Param.equals("bdpassword")){
            return getBDPassword();
        } else {
            return "";
        }
    }
    
    private void SetParam(String Param, String Value){
        if (Param.equals("cfip")){
            cfip = Value;
        } else if (Param.equals("cfport")){
            cfport = Value;
        } else if (Param.equals("cftimeout")){
            cftimeout = Value;
        } else if (Param.equals("cfsucursal")){
            cfsucursal = Value;
        } else if (Param.equals("cfpos")){
            cfpos = Value;
        } else if (Param.equals("cfoperador")){
            cfoperador = Value;
        } else if (Param.equals("tacomercio")){
            tacomercio = Value;
        } else if (Param.equals("taterminal")){
            taterminal = Value;
        } else if (Param.equals("taip")){
            taip = Value;
        } else if (Param.equals("bdnombre")){
            bdnombre = Value;
        } else if (Param.equals("bdservidor")){
            bdservidor = Value;
        } else if (Param.equals("bdpuerto")){
            bdpuerto = Value;
        } else if (Param.equals("bdusuario")){
            bdusuario = Value;
        } else if (Param.equals("bdpassword")){
            bdpassword = Value;
        }
    }
    
    //Get Cliente Frecuente
    public String getCFIp(){
        return cfip;
    }
    public String getCFPort(){
        return cfport;
    }
    public String getCFTimeout(){
        return cftimeout;
    }
    public String getCFSucursal(){
        return cfsucursal;
    }
    public String getCFPos(){
        return cfpos;
    }
    public String getCFOperador(){
        return cfoperador;
    }
    
    //Get Tarjeta Amiga
    public String getTAComercio(){
        return tacomercio;
    }
    public String getTATerminal(){
        return taterminal;
    }
    public String getTAIp(){
        return taip;
    }
    
    //Get Base de Datos
    public String getBDNombre(){
        return bdnombre;
    }
    public String getBDServidor(){
        return bdservidor;
    }
    public String getBDPuerto(){
        return bdpuerto;
    }
    public String getBDUsuario(){
        return bdusuario;
    }
    public String getBDPassword(){
        return bdpassword;
    }
    
   
    
    
    //Set Cliente Frecuente
    public void setCFIp(String pIp){
        cfip = pIp;
    }
    public void setCFPort(String pPort){
        cfport = pPort;
    }
    public void setCFTimeout(String pTimeout){
        cftimeout = pTimeout;
    }
    public void setCFSucursal(String pSucursal){
        cfsucursal = pSucursal;
    }
    public void setCFPos(String pPos){
        cfpos = pPos;
    }
    public void setCFOperador(String pOperador){
        cfoperador = pOperador;
    }
    
    //Set Tarjeta Amiga
    public void setTAcomercio(String pComercio){
        tacomercio = pComercio;
    }
    public void setTAterminal(String pTerminal){
        taterminal = pTerminal;
    }
    public void setTAip(String pIp){
        taip = pIp;
    }
    
    //Set Base de Datos
    public void setBDnombre(String pNombre){
        bdnombre = pNombre;
    }
    public void setBDservidor(String pServidor){
        bdservidor = pServidor;
    }
    public void setBDpuerto(String pPuerto){
        bdpuerto = pPuerto;
    }
    public void setBDusuario(String pUsuario){
        bdusuario = pUsuario;
    }
    public void setBDpassword(String pPassword){
        bdpassword = pPassword;
    }
}
