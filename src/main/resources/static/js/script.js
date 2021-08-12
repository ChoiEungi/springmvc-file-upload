//par를 받아서 scroll하는 function
function WindowScrollTo(par){
  console.log(par)
  window.scrollTo({top:par, behavior:'smooth'})
}
//section3에 대한 위치 받기
let loc_3 = document.querySelector('#sec_3').offsetTop;
let go_3 = document.querySelector('#goto_3')

let loc_1 = document.querySelector('#sec_1').offsetTop;
let go_1 = document.querySelector('#goto_1')

let loc_2 = document.querySelector('#sec_2').offsetTop;
let go_2 = document.querySelector('#goto_2')

let loc_4 = document.querySelector('#sec_4').offsetTop;
let go_4 = document.querySelector('#goto_4')

let loc_5 = document.querySelector('#sec_5').offsetTop;
let go_5 = document.querySelector('#goto_5')

let loc_6 = document.querySelector('#sec_6').offsetTop;
let go_6 = document.querySelector('#goto_6')
//함수 실행
go_3.addEventListener("click",function(){WindowScrollTo(loc_3)})
go_2.addEventListener("click",function(){WindowScrollTo(loc_2)})
go_1.addEventListener("click",function(){WindowScrollTo(loc_1)})
go_4.addEventListener("click",function(){WindowScrollTo(loc_4)})
go_5.addEventListener("click",function(){WindowScrollTo(loc_5)})
go_6.addEventListener("click",function(){WindowScrollTo(loc_6)})
