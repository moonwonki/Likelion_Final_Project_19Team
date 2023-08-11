# Final Project 19Team

LikeLion 백엔드 스쿨 5기 - 프로젝트 매칭 서비스

<details>
<summary>커밋 컨벤션</summary>
<div markdown="1">

# 커밋 컨벤션

커밋을 보낼 때 지켜야할 양식.

커밋은 제목 + 내용 + (이슈 번호)로 이루어져 있다.

<br/>
<br/>

## 제목

제목은 다음과 같은 방식으로 작성한다.
type: title

type에는 커밋의 종류에 따라 다음과 같이 나뉜다.


Type | 내용 설명
-- | --
feat | 기능 추가/수정 등
fix | 버그 수정
docs | 문서 수정
Comment | 필요한 주석 추가 및 변경
style | 스타일 변경 (형식, 세미콜론 누락 등)
refactor | 리팩토링
test | 테스트
chore | 빌드, 패키지 관련 (업데이트 등)
Rename | 파일 혹은 폴더명을 수정하거나 옮기는 작업만인 경우



> feat: User 엔티티 수정

<br/>
<br/>


## 내용

내용에는 세부적인 변경 내용을 줄마다 -로 시작하는 형태로 적는다.

>  - User 엔티티에 email, location, phone 필드 추가
>  - User 엔티티에 Getter, Setter 범위 설정


내용은 한 줄 당 72자 내로 작성합니다.
내용은 양에 구애받지 않고 최대한 상세히 작성합니다.
내용은 어떻게 변경했는지 보다 무엇을 변경했는지 또는 왜 변경했는지를 설명합니다.


<br/>
<br/>

## 이슈 번호

이슈 번호에는 만약 해당 커밋이 특정 이슈과 관련된 경우 "유형: #이슈 번호"의 형태로 작성한다.
관련된 이슈가 없다면 생략이 가능하다.
여러 개의 이슈 번호를 적을 때는 쉼표로 구분합니다.


유형 | 이슈번호
-- | --
Fixes | 이슈 관련 내용 수정중 (아직 해결되지 않은 경우)
Resolves | 이슈 관련 내용 수정 완료
Ref | 참고할 이슈가 있을 때 사용
Related to | 해당 커밋에 관련된 이슈번호 (아직 해결되지 않은 경우)





> Resolves: #123
> Ref: #456
> Related to: #48, #45

<br/>
<br/>

## 전체 예시

```
Feat: 추가 로그인 함수

- 로그인 API 개발

Resolves: #123    # 이슈 해결했을 때 사용
Ref: #456    # 참고할 이슈가 있을 때
```

</div>
</details>

