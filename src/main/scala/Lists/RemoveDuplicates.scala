package Lists


object RemoveDuplicates {
  
    def removeDuplicates(list: LinkedList[Int]) : LinkedList[Int] =

        var curr = list.head
        //println(curr)
        while 
            curr.next.isDefined 
        do
            if curr.value == curr.next.get.value then
                curr.next =  curr.next.get.next
            
            else
                curr = curr.next.get
        //println(list)
        list


}
