## Ajax (Asyncronous) : 비동기 통신

** 동기 통신 (화면이 전환되는 것)
요청 -> controller -> forwarding : 화면이 바뀜 
요청 -> controller -> redirect : 같은 화면으로 바뀜


** 비동기 통신 (같은 화면, 데이터를 주고 받음)
- 화면을 요청하지 않고 data를 요청 
- Map, text 객체 등을 보냄. 보낼 때 text, map 등으로 보내야 함 (JSON 파일로)
- 받는 것은 화면이 아닌 데이터임 
- 서버와 통신하므로 url에 대한 정보 입력 필수임 (https://api.jquery.com/jQuery.ajax/)
- JQuery.ajax({url[,setting]})
    - url
    - context
    - async :  비동기 (default:true) ,  동기(false)
    - beforeSend
    - cache
    - ...


## [고객 관리]

### Customer 추가
- 입력창 두개, 추가 버튼 
- 추가 버튼 클릭시 pk생성
- jpa의 save() 메소드: return 타입이 Entity 객체임
- 화면에 추가

### Customer 삭제
- 화면, DB 모두 삭제
- deleteById()

### Customer 수정
- findById() -> set..

