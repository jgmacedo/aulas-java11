public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    private double totalAbastecido;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.totalAbastecido = 0.0;
    }

    public void abastecerPorValor(double valor) {
        double litros = valor / this.valorLitro;
        if (litros > this.quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente para essa operação.");
            return;
        }
        this.quantidadeCombustivel -= litros;
        this.totalAbastecido += valor;
        System.out.println("Foram abastecidos " + litros + " litros.");
    }

    public void abastecerPorLitro(double litros) {
        double valor = litros * this.valorLitro;
        if (litros > this.quantidadeCombustivel) {
            System.out.println("Não há combustível suficiente para essa operação.");
            return;
        }
        this.quantidadeCombustivel -= litros;
        this.totalAbastecido += valor;
        System.out.println("O valor a ser pago é de R$ " + valor);
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoTipo) {
        this.tipoCombustivel = novoTipo;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public double getTotalAbastecido() {
        return totalAbastecido;
    }
}
