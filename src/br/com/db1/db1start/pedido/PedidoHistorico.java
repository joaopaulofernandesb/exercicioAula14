package br.com.db1.db1start.pedido;

import java.time.LocalDateTime;

public class PedidoHistorico {
	
	private LocalDateTime data;
	
	private PedidoStatus status;

	public PedidoHistorico(PedidoStatus status) {
		Verificador.naoNulo(status, "status");
		this.status = status;
		this.data = LocalDateTime.now();
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}
}