package calculadorapromedial;
/**
 *
 * @author Felipe Reyes {Nekosor}
 */
public class Promedio  {
    

   private double nota_EVA1;
   private double nota_EVA2;
   private double nota_AA3;
   private double p_Activa;
   private double nota_AA4;
   private double cuest;

// Constructor

    public Promedio(double nota_EVA1, double nota_EVA2, double nota_AA3, double p_Activa, double nota_AA4, double cuest) {
        this.nota_EVA1 = nota_EVA1;
        this.nota_EVA2 = nota_EVA2;
        this.nota_AA3 = nota_AA3;
        this.p_Activa = p_Activa;
        this.nota_AA4 = nota_AA4;
        this.cuest = cuest;
    }

       
    
    
    
  //FUNCIÓN PROMEDIO EVA 3
      public double CalcularEva3 (){
      return (this.nota_AA3*0.70) + (this.p_Activa*0.30);
    }
 
   
    //FUNCIÓN PROMEDIO EVA4
      public double CalcularEva4 (){
      return (this.nota_AA4*0.70) + (this.cuest*0.30);
      }
    //FUNCIÓN PROMEDIO FINAL
      public double PromedioFinal (){
          return ((this.nota_EVA1*0.15) + (this.nota_EVA2*0.20) + (((this.nota_AA3*0.70) + (this.p_Activa*0.30))*0.30) + (((this.nota_AA4*0.70) + (this.cuest*0.30))*0.35));
      }
      
      // get and set
    
    public double getNota_EVA1() {
        return nota_EVA1;
    }

    public void setNota_EVA1(double nota_EVA1) {
        this.nota_EVA1 = nota_EVA1;
    }

    public double getNota_EVA2() {
        return nota_EVA2;
    }

    public void setNota_EVA2(double nota_EVA2) {
        this.nota_EVA2 = nota_EVA2;
    }

    public double getNota_AA3() {
        return nota_AA3;
    }

    public void setNota_AA3(double nota_AA3) {
        this.nota_AA3 = nota_AA3;
    }

    public double getP_Activa() {
        return p_Activa;
    }

    public void setP_Activa(double p_Activa) {
        this.p_Activa = p_Activa;
    }

    public double getNota_AA4() {
        return nota_AA4;
    }

    public void setNota_AA4(double nota_AA4) {
        this.nota_AA4 = nota_AA4;
    }

    public double getCuest() {
        return cuest;
    }

    public void setCuest(double cuest) {
        this.cuest = cuest;
    }



    
  
      }