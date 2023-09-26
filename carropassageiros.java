
public class carropassageiros extends veiculo {
 private int numeroPortas;
  private String corExterna;
  private String corInterna;
  private String tipoCombustivel;
  private String motor; 
  private double quilometragem; 
  private double consumoMedio;
  private int numeroPassageiros;
public int getNumeroPortas() {
    return numeroPortas;
}
public void setNumeroPortas(int numeroPortas) {
    this.numeroPortas = numeroPortas;
}
public String getCorExterna() {
    return corExterna;
}
public void setCorExterna(String corExterna) {
    this.corExterna = corExterna;
}
public String getCorInterna() {
    return corInterna;
}
public void setCorInterna(String corInterna) {
    this.corInterna = corInterna;
}
public String getTipoCombustivel() {
    return tipoCombustivel;
}
public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
}
public String getMotor() {
    return motor;
}
public void setMotor(String motor) {
    this.motor = motor;
}
public double getQuilometragem() {
    return quilometragem;
}
public void setQuilometragem(double quilometragem) {
    this.quilometragem = quilometragem;
}
public double getConsumoMedio() {
    return consumoMedio;
}
public void setConsumoMedio(double consumoMedio) {
    this.consumoMedio = consumoMedio;
}
public int getNumeroPassageiros() {
    return numeroPassageiros;
}
public void setNumeroPassageiros(int numeroPassageiros) {
    this.numeroPassageiros = numeroPassageiros;
}  
    public carropassageiros(String marca, String modelo, int anoFabricacao, int numeroPortas){
        super(marca,modelo,anoFabricacao);
        this.numeroPortas=numeroPortas;
  }
  @Override
  public String toString() {
      return super.toString()
              + "\n - Número de Portas: " + this.numeroPortas;
  }
}



