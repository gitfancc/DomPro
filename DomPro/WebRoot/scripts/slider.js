window.onload=function(){
	var box = document.getElementById("container");
	var imgs = document.getElementsByTagName("img");
	
	var imgwidth = imgs[0].offsetWidth;
	var exposeWidth = 100;
	box.style.width = imgwidth+(imgs.length-1)*exposeWidth+'px';
	
	function setImgPos(){
		for(var i=1;i<imgs.length;i++){
			imgs[i].style.left = imgwidth+exposeWidth*(i-1)+'px';
		}
	}
	setImgPos();	
	
	var diff = imgwidth - exposeWidth;
	for(var i=0; i<imgs.length; i++){
		(function(i){
			imgs[i].onmouseover = function(){
				setImgPos();
				for (var j = 1; j <= i; j++) {
					imgs[j].style.left = parseInt(imgs[j].style.left, 10) - diff + 'px';
				}
			}
		})(i);
	}
}