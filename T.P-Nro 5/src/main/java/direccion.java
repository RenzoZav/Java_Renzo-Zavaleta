public class direccion {
    private String calle;
    private String localidad; 
    private int num;
    private String pisoDTO;
    
    public direccion(String calle, int num, String localidad, String pisoDTO){
      
        this.calle = calle;
        this.num = num;
        this.localidad = localidad;
        this.pisoDTO = pisoDTO;
    }

    public String getPisoDTO() {
        return pisoDTO;
    }

    public String datosDir(){
        String datos = "\n Calle: "+ this.calle+" "+this.num + "\nLocalidad: " + this.localidad;
        return datos;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}