/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complejo;

/**
 *
 * @author Usuario
 */
public class Complejo implements Operciones_Complejos{

    private float parte_real;
    private float parte_imaginaria;
    
    public float respuesta;

    public Complejo(){
    }
    public Complejo(float parte_real, float parte_imaginaria) {
        this.parte_real = parte_real;
        this.parte_imaginaria = parte_imaginaria;
    }

    public float getParte_real() {
        return parte_real;
    }

    public void setParte_real(float parte_real) {
        this.parte_real = parte_real;
    }

    public float getParte_imaginaria() {
        return parte_imaginaria;
    }

    public void setParte_imaginaria(float parte_imaginaria) {
        this.parte_imaginaria = parte_imaginaria;
    }

    public float getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(float respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public Complejo Sumar(Complejo suma) {
        float sumreal=this.parte_real+ suma.getParte_real();
        float  sumaimg= this.parte_imaginaria+ suma.getParte_imaginaria();
        
        Complejo respuesta= new Complejo(sumreal,sumaimg);
        return respuesta;
    }

    @Override
    public Complejo Restar(Complejo restar) {
        float restarReal=this.parte_real- restar.getParte_real();
        float restarimg= this.parte_imaginaria- restar.getParte_imaginaria();
        
        Complejo respuesta= new Complejo(parte_real, parte_imaginaria);
        return respuesta;
    }

    @Override
    public String toFloatString() {
          return String.format("(%.2f,%.2f)",parte_real,parte_imaginaria);
    }
}
