"use strict"; // 문법이 틀리면 에러를 내줘라 
var app = app || {}; // 기존에 app이 있으면 그걸 사용하고 없으면 새로 만들어라. 
app = (()=>{
	const WHEN_ERR = '호출하는 js 파일을 찾을 수 없습니다.';
	let _,js,authjs;
	let run =x=> $.getScript(x+ '/resources/js/cmm/router.js',
			()=>{$.extend(new Session(x));
			onCreate()
	})
	
	let init =()=>{
		_ = $.ctx();
		js = $.js();
		authjs = js+'/cmm/auth.js';
	}
	let onCreate =()=>{
		init()
		$.when(
			$.getScript(authjs)	
		)
		.done(()=>{
			auth.onCreate()
		})
		.fail(()=>{
			alert(WHEN_ERR)
		})
	}
	return {run:run}
})();