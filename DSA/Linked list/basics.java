import org.w3c.dom.Node;

class solution {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        node head = null;
        node tail = null;
        int size = 0;

        void Addfirst(int data) {
            node temp = new node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;

            }
            size++;
        }

        void addatend(int data) {
            node temp = new node(data);
            if (head == null) {
                Addfirst(data);
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void addat(int data, int index) {
            node t = new node(data);
            node temp = head;
            if (index < 0 || index > size) {
                System.out.println("invalid index");
            } else if (size == index) {
                addatend(data);
            } else if (index == 0) {
                Addfirst(data);
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
            System.out.println();
        }

        void delete(int index) {
            node temp = head;
            if (index < 0 || index > size) {
                System.out.println("invalid index");
                return;

            } else if (index == 0) {
                head = head.next;
                return;
            } else {
                for (int i = 1; i <= index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                return;

            }

        }

        int size() {
            int count = 0;
            node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String args[]) {
        linkedlist ll = new linkedlist();
        ll.Addfirst(45);
        ll.addatend(56);
        ll.display();
        ll.addatend(69);
        ll.display();
        ll.addat(34, 2);
        ll.display();
        ll.delete(3);
        ll.display();
        System.out.println(ll.size());

    }
}