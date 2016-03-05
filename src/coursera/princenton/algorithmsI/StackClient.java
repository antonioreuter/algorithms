package coursera.princenton.algorithmsI;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by aandra1 on 27/02/16.
 */
public class StackClient {

  private List<Node> stack = new LinkedList<>();

  class Node {
    String item;
    Node next;

    Node(String value, Node node) {
      item = value;
      next = node;
    }
  }


  public String pop() {
    if (stack.size() == 0)
      throw new IllegalStateException("The stack is empty!");

    return stack.remove(stack.size() - 1).item;
  }

  public void push(String value) {
    Node newNode = new Node(value, null);
    if (!stack.isEmpty()) {
      Node previous = stack.get(stack.size() - 1);
      previous.next = newNode;
    }
    stack.add(newNode);
  }


  public static void main(String args[]) throws Exception {
    StackClient stack = new StackClient();
    String[] text = "to be or not to - be - or - not - be to - - question is that - - -".split(" ");
    for (String value : text) {
      if (value.equals("-"))
        System.out.print(stack.pop() + " ");
      else
        stack.push(value);
    }
  }

}
