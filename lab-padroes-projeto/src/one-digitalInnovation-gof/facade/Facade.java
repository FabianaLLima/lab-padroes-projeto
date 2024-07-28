public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String Estado = CepApi.getInstancia().recuperarEstado(cep);


        CrmService.gravarCliente(nome, cep, cidade, Estado);

    }

}
