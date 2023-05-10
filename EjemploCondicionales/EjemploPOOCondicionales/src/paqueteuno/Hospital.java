
package paqueteuno;

public class Hospital {
    
    private String nombreHospital;
    private String ciudadHospital;
    private int numeroCamas;
    private int numeroDoctores;
    private double presupuestoAnual;
    
    // constructores 
    // Objetos para opción 1
    
    // métodos establecer para asignar valores a 
    // cada atributo

    public Hospital(String nombreHospital, int numeroCamas, int numeroDoctores, double presupuestoAnual) {
        this.nombreHospital = nombreHospital;
        this.numeroCamas = numeroCamas;
        this.numeroDoctores = numeroDoctores;
        this.presupuestoAnual = presupuestoAnual;
        this.ciudadHospital = "UIO";
    }

    public Hospital(String nombreHospital, int numeroCamas, int numeroDoctores) {
        this.nombreHospital = nombreHospital;
        this.numeroCamas = numeroCamas;
        this.numeroDoctores = numeroDoctores;
        this.ciudadHospital = "UIO";
        this.presupuestoAnual = 100000.5;
    }

    public Hospital(String nombreHospital, String ciudadHospital, int numeroCamas, int numeroDoctores, double presupuestoAnual) {
        this.nombreHospital = nombreHospital;
        this.ciudadHospital = ciudadHospital;
        this.numeroCamas = numeroCamas;
        this.numeroDoctores = numeroDoctores;
        this.presupuestoAnual = presupuestoAnual;
    }
    
    
    public void establecerNombreHospital(String n){
        nombreHospital = n;
    }
    
    public void establecerCiudadHospital(String n){
        ciudadHospital = n;
    }
    
    public void establecerNumeroCamas(int n){
        numeroCamas = n;
    }
    
    public void establecerNumeroDoctores(int n){
        numeroDoctores = n;
    }
    
    public void establecerPresupuestoAnual(double n){
        presupuestoAnual = n;
    }
    
    // métodos obtener, que permitan acceder a los valores de
    // cada atributo
    
    public String obtenerNombreHospital(){
        return nombreHospital;
    }
    
    public String obtenerCiudadHospital(){
        return ciudadHospital;
    }
    
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    
    public int obtenerNumeroDoctores(){
        return numeroDoctores;
    }
    
    public double obtenerPresupuestoAnual(){
        return presupuestoAnual;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombreHospital=" + nombreHospital + ", ciudadHospital=" + ciudadHospital + ", numeroCamas=" + numeroCamas + ", numeroDoctores=" + numeroDoctores + ", presupuestoAnual=" + presupuestoAnual + '}';
    }
    
    
    
    
}
