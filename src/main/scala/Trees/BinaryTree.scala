package Trees

sealed trait BinaryTree[+A]
case class Leaf[A](value: A) extends BinaryTree[A]
case class Branch[A](left: BinaryTree[A], value: A, right: BinaryTree[A]) extends BinaryTree[A]

