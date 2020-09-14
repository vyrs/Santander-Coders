package conta;
public class ContaCorrente extends Conta{
	private Double limiteChequeEspecial;
	public ContaCorrente() {
		super();
	}
	public ContaCorrente(Double limiteChequeEspecial) {
		super();
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	//Sacar dinheiro: o cliente pode sacar dinheiro e, caso não tenha saldo
	//suficiente, usar seu cheque especial.
	//Cheque Especial - R$ 200,00
	//R$ 100 - R$ 120,00
	//R$ 100 - R$ 80,00
	//R$ 100 - R$ 320,00
	@Override
	public void sacar(double valor) {
		double limite = getSaldo() - valor;
		
		if((limite + limiteChequeEspecial) >= 0) {
			super.sacar(valor);
			if(limite < 0) {
				limiteChequeEspecial = limiteChequeEspecial - limite;
			}			
		}else {
			System.out.println("Valor superou seu saldo disponível!");
		}
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
	}
	//Depositar cheques: o cliente pode depositar cheques. Um cheque tem
	//um valor, um banco emissor e uma data de pagamento.
	public void depositarCheques(Cheque cheque) {
		depositar(cheque.getValor());
	}
}