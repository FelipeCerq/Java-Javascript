function fnImpedeTexto(){
	valor = document.getElementById("ProdCodBI").value;
	if (valor != "") {
		var regra = /^[0-9]+$/;
		if (!valor.match(regra)) {
			alert("Valor inválido. O campo Código aceita apenas valores numéricos.");
		}
	}
}
// Faz a mesma coisa pórem não tem o alert
// pode usar ao invez do alert um swal. fire // swal 
// {onkeypress="return event.charCode >= 48 && event.charCode <= 57"}

