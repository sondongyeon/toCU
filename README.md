# StudySpring
  - 김영한의 Spring강좌 정리 및 내용 학습

##스프링 1일차

IOC, DI
스프링 핵심 가치 -> 객체 지향 프로그래밍
자바 ORM 표준 JPA
spring도 논 블로킹, node.js의 기능을 끌어와서 사용할 수 있다.

SRP(단일 책임 원칙)

1. 한 클래스는 하나의 책임만 가져야 한다
2. 하나의 책임이라는것은 모호하다
   - 클 수도 있고, 작을 수도 있다.
   - 문맥과 상황에 따라 다르다.
3. 중요한 기준은 변경, 변경이 있을때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것

OCP 개방 -폐쇄 원칙

1. 소프트웨어 요소는 확장에는 열려 있으나, 변경에는 닫혀 있어야 한다.
2. 분명 다형성을 사용했지만 OCP원칙을 지킬 수 없다.
3. 객체를 생성하고, 연관관계를 맺어주는 별도의 조립, 설정자 필요

LSP 리스코프 치환 원칙

1. 프로그램의 객체는 프로그램의 정확성을 깨지 않으면서 하위타입의 인스턴스로 바꿀 수 있어야한다.

ISP 인터페이스 분리 원칙

1. 특정 클라이언트를 위한 인터페이스 여러개가 범용 인터페이스 하나보다 낫다.
   - 인터페이스가 명확해지고, 대체 가능성이 높아진다.


DIP 의존 관계 역전 원칙

1. 프로그래머는 추상화에 의존해야지, 구체화에 의존하면 안된다. 의존성 주입은 이 원칙을 따르는 방법 중 하나이다.
   - 구현 클래스에 의존하지말고, 인터페이스에 의존해야한다.
쉽게 역할에 의존해야지, 다른부분에 의존하게 하면 변경이 어려워진다.
클라이언트가 인터페이스에 의존하게끔 만들어라!


정리

1. 객체 지향의 핵심은 다형성!
2. 다형성 만으로는 쉽게 부품 갈아 끼우듯이 개발할 수 없다
3. 다형성만으로는 ocp, dip 지킬 수 없다.
4. 뭔가 더 필요하다!
※ 다형성 : 어떤 객체의 속성이나 기능이 상황에 따라 여러 가지 형태를 가질 수 있는 성질

그래서 스프링이란?
DI : 의존관계, 의존성 주입
순수자바로 개발을 하다보면 일이 너무 많아서 프레임워크가 필요해짐

정리

모든 설계에 역할과 구현을 분리하자
자동차, 공연의 예를 떠올려보자.
애플리케이션 설계는 배역만 만들어 주고, 배우는 언제든지 유연하게 변경할 수 있도록 만드는게 좋은 객체 지향 설계이다.
이상적으로는 모든 설계에 인터페이스를 부여하자.

실무 고민 내용
인터페이스를 도입하면 추상화라는 비용이 발생
기능을 확장할 가능성이 없다면, 구체 클래스를 직접 사용하고, 향후 꼭 필요할 때 리팩터링해서 인터페이스를 도입하는 것도 방법이다.스프링 1일차

IOC, DI
스프링 핵심 가치 -> 객체 지향 프로그래밍
자바 ORM 표준 JPA
spring도 논 블로킹, node.js의 기능을 끌어와서 사용할 수 있다.

SRP(단일 책임 원칙)

1. 한 클래스는 하나의 책임만 가져야 한다
2. 하나의 책임이라는것은 모호하다
   - 클 수도 있고, 작을 수도 있다.
   - 문맥과 상황에 따라 다르다.
3. 중요한 기준은 변경, 변경이 있을때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것

OCP 개방 -폐쇄 원칙

1. 소프트웨어 요소는 확장에는 열려 있으나, 변경에는 닫혀 있어야 한다.
2. 분명 다형성을 사용했지만 OCP원칙을 지킬 수 없다.
3. 객체를 생성하고, 연관관계를 맺어주는 별도의 조립, 설정자 필요

LSP 리스코프 치환 원칙

1. 프로그램의 객체는 프로그램의 정확성을 깨지 않으면서 하위타입의 인스턴스로 바꿀 수 있어야한다.

ISP 인터페이스 분리 원칙

1. 특정 클라이언트를 위한 인터페이스 여러개가 범용 인터페이스 하나보다 낫다.
   - 인터페이스가 명확해지고, 대체 가능성이 높아진다.


DIP 의존 관계 역전 원칙

1. 프로그래머는 추상화에 의존해야지, 구체화에 의존하면 안된다. 의존성 주입은 이 원칙을 따르는 방법 중 하나이다.
   - 구현 클래스에 의존하지말고, 인터페이스에 의존해야한다.
쉽게 역할에 의존해야지, 다른부분에 의존하게 하면 변경이 어려워진다.
클라이언트가 인터페이스에 의존하게끔 만들어라!


정리

1. 객체 지향의 핵심은 다형성!
2. 다형성 만으로는 쉽게 부품 갈아 끼우듯이 개발할 수 없다
3. 다형성만으로는 ocp, dip 지킬 수 없다.
4. 뭔가 더 필요하다!
※ 다형성 : 어떤 객체의 속성이나 기능이 상황에 따라 여러 가지 형태를 가질 수 있는 성질

그래서 스프링이란?
DI : 의존관계, 의존성 주입
순수자바로 개발을 하다보면 일이 너무 많아서 프레임워크가 필요해짐

정리

모든 설계에 역할과 구현을 분리하자
자동차, 공연의 예를 떠올려보자.
애플리케이션 설계는 배역만 만들어 주고, 배우는 언제든지 유연하게 변경할 수 있도록 만드는게 좋은 객체 지향 설계이다.
이상적으로는 모든 설계에 인터페이스를 부여하자.

실무 고민 내용
인터페이스를 도입하면 추상화라는 비용이 발생
기능을 확장할 가능성이 없다면, 구체 클래스를 직접 사용하고, 향후 꼭 필요할 때 리팩터링해서 인터페이스를 도입하는 것도 방법이다.

##스프링 2일차

-> 코드 작성 및 비즈니스 모델 구현
