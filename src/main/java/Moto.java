public class Moto {

    private String cor;
    private String modelo;
    private String fabricante;
    private int cilindradas;
    private int qtdMarcha;
    private int ano;
    private boolean automatica;
    private boolean ligado;
    private double velocidadeAtual;
    private double velocidadeMaxima;

    public Moto(String cor, int cilindradas, String modelo, String fabricante, double velocidadeMaxima) {
        this.cor = cor;
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligaEDesliga() {
        this.ligado = !ligado;
    }

    public void acelerar(double velocidade) {
        if (ligado) {
            Double velocidadeNova = this.velocidadeAtual + velocidade;
            if (velocidadeNova < this.velocidadeMaxima) {
                this.velocidadeAtual = velocidadeNova;
            }
        }
    }

    public void parar() {
        velocidadeAtual = 0;
    }

    public String getCor() {
        return cor;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int getQtdMarcha() {
        return qtdMarcha;
    }

    public boolean isAutomatica() {
        return automatica;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setQtdMarcha(int qtdMarcha) {
        this.qtdMarcha = qtdMarcha;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }
}


