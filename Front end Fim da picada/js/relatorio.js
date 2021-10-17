function executaGet(url) {
    let request = new XMLHttpRequest();
    request.open("GET", url, false);
    request.send();
    return request.responseText;

}


/*function executaPut(url, dados_retornados) {
    let request = new XMLHttpRequest();
    request.open("PUT", url, true);
    request.setRequestHeader("mime-type", "multipart/form-data");
    request.send(dados_retornados);
    request.onload = function () {
        alert(this.responseText);
    }
    return request.responseText;
}*/





function principal() {

    let dados_retornados = executaGet("http://localhost:8080/Relatorio");
    let relatorio = JSON.parse(dados_retornados);

    let tb = document.getElementById('tabela_relatorio');

    relatorio.forEach(element => {

        linha = document.createElement("tr");

        tdId = document.createElement("td");
        tdData_inicio = document.createElement("td");
        tdData_termino = document.createElement("td");
        tdDenuncia = document.createElement("td");
        tdDescricao = document.createElement("td");
        tdNome_empresa = document.createElement("td");

        tdId.innerHTML = element.id;
        tdData_inicio.innerHTML = element.data_inicio;
        tdData_termino.innerHTML = element.data_termino;
        tdDenuncia.innerHTML = element.denuncia;
        tdDescricao.innerHTML = element.descricao;
        tdNome_empresa.innerHTML = element.nome_empresa;
        /*tdVisualizar.innerHTML = "<button type=\"submit\" onclick=\"formVisualizar(" + element.id + ")\">Visualizar</button>";
        tdAlterar.innerHTML = "<button type=\"submit\" onclick=\"formAlterar(" + element.id + ")\">Alterar</button>";
        tdExcluir.innerHTML = "<button type=\"submit\" onclick=\"formExcluir(" + element.id + ")\">Excluir</button>";*/

        linha.appendChild(tdId);
        linha.appendChild(tdData_inicio);
        linha.appendChild(tdData_termino);
        linha.appendChild(tdDenuncia);
        linha.appendChild(tdDescricao);
        linha.appendChild(tdNome_empresa);
        /* linha.appendChild(tdVisualizar);
         linha.appendChild(tdAlterar);
         linha.appendChild(tdExcluir);*/
        tb.appendChild(linha);



    });

   /* function alterarRelatorio() {
        event.preventDefault();
        var dados = new FormData();
        let id = document.getElementById("id2").value;
        let data_inicio = document.getElementById("data_inicio2").value;
        let data_termino = document.getElementById("data_termino2").value;
        let denuncia = document.getElementById("denuncia2").value;
        let descricao = document.getElementById("descricao2").value;
        let nome_empresa = document.getElementById("nome_empresa").value;


        dados.append("id", id);
        dados.append("data_inicio", data_inicio);
        dados.append("data_termino", data_termino);
        dados.append("denuncia", denuncia);
        dados.append("descricao", descricao);
        dados.append("descricao", nome_empresa);

        let url = "http://localhost:8080/relatorio/update";
        executaPut(url, dados);





        function formAlterar(idRelatorio) {
            event.preventDefault();
            let dados_retornados = executaGet("http://localhost:8080/relatorio/" + idRelatorio);
            let relatorio = JSON.parse(dados_retornados);
            document.getElementById("id2").value = relatorio.id;
            document.getElementById("data_inicio").value = relatorio.data_inicio;
            document.getElementById("data_termino").value = relatorio.data_termino;
            document.getElementById("denuncia").value = relatorio.denuncia;
            document.getElementById("descricao").value = relatorio.descricao;
            document.getElementById("nome_empresa").value = relatorio.nome_empresa;
        }

    }*/

}
principal()