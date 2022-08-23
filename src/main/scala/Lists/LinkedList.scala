package Lists


import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.List



case class LinkedListNode[T](var value: T, var next: Option[LinkedListNode[T]]) 
case class LinkedList[T](var head: LinkedListNode[T]):
    
    var tail = head 

    // return linked list to allow chaining    
    def append(_value: T) : LinkedList[T] = 
        tail.next = Some(LinkedListNode(_value, None))
        tail = tail.next.get
        this

    def prepend(_value: T) : LinkedList[T] =
        val tmp = head
        head = LinkedListNode(_value, None)
        head.next = Some(tmp)
        this

    def toList() : List[T] =
        val l = ArrayBuffer[T]()

        var curr  = Option(this.head)
        while curr.isDefined do
            l.append(curr.get.value) 
            curr = curr.get.next

        l.toList
    
    //def remove(node: LinkedListNode[T]) =


    

        
