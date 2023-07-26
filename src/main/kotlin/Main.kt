abstract class Animal{
    var name : String = ""
    abstract fun move()
}


class Tiger : Animal(){
    var age : Int = 3
    override fun move(){
        println("네 발로 이동한다.")
    }
}

class Eagle : Animal(){
    var age : Int = 0
    override fun move(){
        println("날개로 날아간다.")
    }
    fun cry(){
        println("삐이이이익")
    }
}

fun main(args: Array<String>) {
//  var tiger1 : Tiger = Tiger()
//  var eagle1 : Eagle = Eagle()
//    tiger1.move()
//    eagle1.move()
    var animal : Animal
    // 다형성: 서브 클래스에서 생성한 인스턴스를 슈퍼 클래스 변수에 대입할 수 있는 것, 하나의 변수에 여러 종류 인스턴스 대입 가능

    animal = Tiger()
    animal.move()
    println("Tiger age is: ${animal.age}")

    animal = Eagle()
    animal.move()
    print("Eagle cry is: ")
    animal.cry()

}


