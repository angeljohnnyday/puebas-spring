$(document).ready(function(){
	
	lstLibros().done(function(data){
		console.log(data);
	});
	
	getLibro(1).done(function(data){
		console.log(data);
	})
	
})

function lstLibros() {
	return $.ajax({
		url : "http://localhost:9092/LibrosRest/lstLibros",
		type : 'GET',
		async: false
	});
}

function getLibro(cdSecuencia) {
	return $.ajax({
		url : "http://localhost:9092/LibrosRest/getLibro/"+ cdSecuencia,
		type : 'GET',
		async: false
	});
}