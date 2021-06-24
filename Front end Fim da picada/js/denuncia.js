const limpaendereco = (endereco) => {
    document.getElementById('estado').value = "";
    document.getElementById('cidade').value = "";
    document.getElementById('bairro').value = "";
    document.getElementById('rua').value = "";
    document.getElementById('complemento').value = "";
}

const preencherendereco = (endereco) => {
    document.getElementById('estado').value = endereco.uf;
    document.getElementById('cidade').value = endereco.localidade;
    document.getElementById('bairro').value = endereco.bairro;
    document.getElementById('rua').value = endereco.logradouro;
    document.getElementById('complemento').value = endereco.complemento;
}


const pesquisarCep = async () => {
    limpaendereco();
    const cep = document.getElementById('cep').value;
    const url = 'https://viacep.com.br/ws/' + cep + '/json/';

    const dados = await fetch(url);
    const endereco = await dados.json();

    if (endereco.hasOwnProperty('erro')) {
        alert("Cep não existe")
    } else {
        preencherendereco(endereco);
    }
}

document.getElementById('cep').addEventListener('focusout', pesquisarCep);

function executaPost(url, dadosPost) {
    let request = new XMLHttpRequest();
    request.open("POST", url, true);

    request.setRequestHeader("Content-type", "application/json");
    request.send(JSON.stringify(dadosPost));
    
    request.onload = function () {
        console.log(this.responseText);
    }

    return request.responseText;

}

ValidarDenuncia = async() => {
    if(document.getElementById('cep').value != "", document.getElementById('estado').value != "",
    document.getElementById('cidade').value != "", document.getElementById('bairro').value != "",
    document.getElementById('rua').value != "") {
        await CadastrarDenuncia();
        alert("Denúncia realizada com sucesso");
        window.location.reload();
    }else{
        alert("Dados incompletos");
    }
}

function CadastrarDenuncia() {        
    let url = "http://localhost:8080/denuncia";
    let cep = document.getElementById("cep").value;
    let estado = document.getElementById("estado").value;
    let cidade = document.getElementById("cidade").value;
    let bairro = document.getElementById("bairro").value;
    let rua = document.getElementById("rua").value;
    let numero = document.getElementById("numero").value;
    let complemento = document.getElementById("complemento").value;
    let descricao = document.getElementById("descricao").value;

    dadosPost = {
        "cep": cep,
        "estado": estado,
        "cidade": cidade,
        "bairro": bairro,
        "rua": rua,
        "numero": numero,
        "complemento": complemento,
        "descricao": descricao,
    }
    executaPost(url, dadosPost);
    return null;
}

