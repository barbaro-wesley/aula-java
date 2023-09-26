public class veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private String procedencia;
    private double capacidadeCargaKg;
    private double altura;
    private double largura;
    private double profundidade;
    public veiculo(String marca2, String modelo2, int anoFabricacao2) {
    }
    public veiculo(String marca2, String modelo2, int anoFabricacao2, double capacidadeCargaKg2, double largura2,
            double altura2, double profundidade2) {
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getRenavam() {
        return renavam;
    }
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
    public String getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }
    public void setCapacidadeCargaKg(double capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
     void ligar() {
        System.out.println("O veículo está ligando");
    }
    void desligar() {
        System.out.println("O veículo está desligando");
    }
    @Override
    public String toString() {
        return "Veículo: " + this.marca + " - " + this.modelo + " - Ano: " + this.anoFabricacao + "Chassi:"+ chassi;
    }
}
