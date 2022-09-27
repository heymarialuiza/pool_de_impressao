package pool_de_impressao;

import java.awt.List;
import java.util.ArrayList;

public class BufferImpressao {
	
	// Lista que armazena os documentos
	List buffer = new ArrayList();
	
	public synchronized void adicionarDocumento(Documento doc) {
		buffer.add(doc);
	}
	
	public synchronized Object removeDocumento() {
		return buffer.remove(0);
	}
}
