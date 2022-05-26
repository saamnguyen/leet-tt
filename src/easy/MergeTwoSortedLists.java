package easy;

public class MergeTwoSortedLists {

//      Definition for singly-linked list.
    //Khoi tao node
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      //Ham in
      public static void print(ListNode head){
          while (head != null){
              System.out.println(head.val + " ");
              head = head.next;
          }
          return;
      }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
          //Neu l1 null
          if(l1 == null) return  l2;

          //l2 null
          if(l2 == null) return l1;

          //neu gia tri thu nhat cua l1 nho hon gt t1 cua l2 thi de quy roi tro node next se bang mergeTwoList(l1.next, l2))
          if(l1.val < l2.val){
              l1.next = mergeTwoLists(l1.next, l2);
              return l1;
          }else{
              l2.next = mergeTwoLists(l1, l2.next);
              return l2;
          }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

        MergeTwoSortedLists.ListNode listNode1 = mergeTwoSortedLists.new ListNode();
        listNode1.val = 1;
        listNode1.next = mergeTwoSortedLists.new ListNode(2);
        listNode1.next.next = mergeTwoSortedLists.new ListNode(4);

        MergeTwoSortedLists.ListNode listNode2 = mergeTwoSortedLists.new ListNode(1);
        listNode2.next = mergeTwoSortedLists.new ListNode(2);
        listNode2.next.next = mergeTwoSortedLists.new ListNode(3);

        print(mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2));
    }
}
