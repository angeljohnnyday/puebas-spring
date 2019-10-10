function btnGuardar(){
	
	var maestroDTO = new Object();
	maestroDTO.nbMaestro = $("#nbMaestro").val();
	maestroDTO.nbApPaterno = $("#nbApPaterno").val();
	maestroDTO.nbApMaterno = $("#nbApMaterno").val();
	maestroDTO.fhNacimiento = new Date($("#fhNacimiento").val());
	maestroDTO.nuEdad = $("#nuEdad").val();
	maestroDTO.cdMatricula = $("#cdMatricula").val();
	
	guardar(maestroDTO).done(function(data){
		console.log(data);
	})
}

function guardar(objectDTO){
	return $.ajax({
		url : "http://localhost:9092/MaestroRest/guardar",
		type : 'POST',
		contentType: 'application/json',
		dataType: 'JSON',
		data: JSON.stringify(objectDTO),
		async: false
	});
}