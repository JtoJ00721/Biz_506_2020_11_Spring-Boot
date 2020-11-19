# Spring-boot thymeleaf view
* HTML, CSS, JS가 적용된 static web HTML 파일에 controller로 부터 전달되어온 데이터를
기본 모양을 흐트러뜨리지 않는 범위에서 자유롭게 표현하는 view
* JSP와 비교했을때 jsp는 서버를 거쳐서 랜더링이 되지 않으면 
어떻게 화면이 구성되는지 그 결과를 알기가 어렵다
* 표준 web brouwser에서 open을 했을때는 마치 static HTML처럼 보여지고
서버에서 데이터가 전달되면 실제 데이터를 포함하여 rendering한후 보여지기 때문에
개발자와 디자이너가 협업하기에 매우 좋은 view 이다.

* Spring-boot was에서 거의 표준처럼 사용되는 view이다.