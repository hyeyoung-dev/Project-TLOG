$(function() {
	const fileInput = document.getElementById('imgFile');
	const handleFiles = () => {
		const selectedFile = [...fileInput.files];
		const fileReader = new FileReader();
		
		fileReader.readAsDataURL(selectedFile[0]);
		fileReader.onload = function() {
			document.getElementById("previewImg").src = fileReader.result;
		};
	};
	fileInput.addEventListener("change", handleFiles);
	// 이미지제거 클릭시 기본 이미지로 프로필 사진 변경
	$('#defaultProfile').click(function() {
		$('#previewImg').attr('src', '/img/profile/default_profile.png');
		$('#imgFile').val('');
		$('#profileImg').val('/img/profile/default_profile.png');
	});
});
//top bottom 안보이게 하기
document.addEventListener("DOMContentLoaded", function(event){
    document.getElementById('top').style.display = "none";
    document.getElementById('bottom').style.display = "none";
    console.log()
    for(let i = 0; i < $("#allTagCnt").children().length; i++){
		for(let j = 0; j < $("#myTagCnt").children().length; j++){
			if($('#tagvalue'+i).val()==$('.myTag'+j).html()){
				console.log($('#tagvalue'+i).val()+ " / " + $('.myTag'+j).html())
				$('#tagWord'+$('#tagvalue'+i).val()).trigger("click");
			}
		}
	}
});

//태그 토글
$('.tagWord').click(function(){
	var tagStatus = $('#tagStatus'+$(this).children(".tagvalue").val());
	var tagvalue = $(this).children(".tagvalue");
	if(tagStatus.val() == "N"){
		tagStatus.val("Y");
		tagvalue.attr("checked",true);
	}else{
		tagStatus.val("N");
		tagvalue.removeAttr("checked");
	}
	$(this).toggleClass("checked");
});