package Lists

import org.scalatest.flatspec.AnyFlatSpec

class RemoveDuplicatesTest extends AnyFlatSpec {


    "RemoveDuplicate" should "return the unmodifed list of one element" in {
        var mylist = LinkedList(LinkedListNode(1, None))
        
        mylist = RemoveDuplicates.removeDuplicates(mylist)
       
        val _list = mylist.toList()

        assert(_list.last == 1 && _list.length == 1)
    } 

    "RemoveDuplicate" should "remove one 0 and one 2 from the list" in {
        var mylist = LinkedList(LinkedListNode(0, None))

        mylist.append(0).append(1).append(2).append(2).append(3)

        mylist = RemoveDuplicates.removeDuplicates(mylist)
        
        val _list = mylist.toList()
        
        assert(_list.length == 4 && _list.filter(x => x == 2).length == 1 && _list.filter(x => x == 0).length == 1)
    } 
     
  
}
