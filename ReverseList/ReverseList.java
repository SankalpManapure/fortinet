public static Node reverseList(Node currentNode)
 {
  Node previousNode=null;
  Node nextNode;
  while(currentNode!=null)
  {
   nextNode=currentNode.next;
   currentNode.next=previousNode;
   previousNode=currentNode;
   currentNode=nextNode;
  }
  return previousNode;
 }
