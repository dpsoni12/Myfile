import java.util.Scanner;
public class Singly_LinkedList
{
    static class node
    {
        int data;
        node next;
    }
    node head = null;
    Scanner input = new Scanner(System.in);

    public void start_insert()
    {
        node new_node = new node();
        System.out.println("Enter new node value : ");
        new_node.data = input.nextInt();

        if (head == null)
        {
            System.out.println("LinkedList is empty. New node is inserted which value is : " + new_node.data);
            head = new_node;
        }
        else
        {
            new_node.next = head;
            head = new_node;
            System.out.println("new node insert at start of the linked list which value is : " + new_node.data);
        }
    }

    public void last_insert()
    {
        node new_node = new node();
        System.out.println("Enter new node value : ");
        new_node.data = input.nextInt();

        if (head == null)
        {
            System.out.println("LinkedList is empty. New node is inserted which value is : " + new_node.data);
            head = new_node;
        }
        else
        {
            node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
            System.out.println("new node insert at last of the linked list which value is : " + new_node.data);
        }
    }

    public void insert_before_given_position()
    {
        node new_node = new node();
        System.out.println("Enter new node value : ");
        new_node.data = input.nextInt();

        System.out.println("Enter position to enter a new value : ");
        int no = input.nextInt();
        if (head == null)
        {
            System.out.println("LinkedList is empty. New node is inserted which value is : " + new_node.data);
            head = new_node;
        }
        else if (head.data == no)
        {
            new_node.next = head;
            head = new_node;
            System.out.println("new node insert at start of the linked list which value is : " + new_node.data);
        }
        else
        {
            node temp = head, pre_temp = temp;
            boolean flag = false;
            while (temp != null)
            {
                if (no == temp.data)
                {
                    flag = true;
                    break;
                }
                pre_temp = temp;
                temp = temp.next;
            }
            if(!flag)
            {
                System.out.println("Searching value not found. So, new node not insert");
            }
            else
            {
                pre_temp.next = new_node;
                new_node.next = temp;
                System.out.println("New node insert which value is : " + new_node.data);
            }
        }
    }

    public void insert_after_given_position()
    {
        node new_node = new node();
        System.out.println("Enter new node value : ");
        new_node.data = input.nextInt();

        System.out.println("Enter position to enter a new value : ");
        int no = input.nextInt();
        if (head == null)
        {
            System.out.println("LinkedList is empty. New node is inserted which value is : " + new_node.data);
            head = new_node;
        }
        else if (head.data == no)
        {
            new_node.next = head.next;
            head.next = new_node;
            System.out.println("New node insert which value is : " + new_node.data);
        }
        else
        {
            node temp = head;
            int flag = 0;

            while(temp != null)
            {
                if(temp.data == no)
                {
                    flag = 1;
                    break;
                }
                temp = temp.next;
            }

            if(flag == 0)
            {
                System.out.println("Searching value not found. So, new node not insert");
            }
            else
            {
                new_node.next = temp.next;
                temp.next = new_node;
                System.out.println("New node insert which value is : " + new_node.data);
            }
        }
    }

    public void start_delete()
    {
        if (head == null)
        {
            System.out.println("LinkedList is empty.");
        }
        else
        {
                System.out.println("node deleted which value is : " + head.data);
                head = head.next;
        }
    }

    public void last_delete()
    {
        if (head == null)
        {
            System.out.println("LinkedList is empty.");
        }
        else
        {
            if (head.next == null)
            {
                System.out.println("Node deleted which value is : " + head.data);
                head = null;
            }
            else
            {
                node temp = head, pre_temp= temp;
                while (temp.next != null)
                {
                    pre_temp = temp;
                    temp = temp.next;
                }
                pre_temp.next = null;
                System.out.println("Node deleted which value is : " + temp.data);
            }
        }
    }

    public void delete_position()
    {
        if (head == null)
        {
            System.out.println("LinkedList is empty.");
        }
        else
        {
            System.out.println("Enter value you want to delete : ");
            int no = input.nextInt();
            if (head.data == no)
            {
                System.out.println("node deleted which value is : " + no);
                head = head.next;
            }
            else
            {
                node temp = head, pre_temp = temp;
                boolean flag = false;
                while (temp != null)
                {
                    if (no == temp.data)
                    {
                        flag = true;
                        break;
                    }
                    pre_temp = temp;
                    temp = temp.next;
                }
                if (!flag)
                {
                    System.out.println(no + " is not present in LinkedList.");
                }
                else
                {
                    pre_temp.next = temp.next;
                    System.out.println("node deleted which value is : " + no);
                }
            }
        }
    }

    public void search()
    {
        if (head == null)
        {
            System.out.println("LinkedList is empty.");
        }
        else
        {
            System.out.println("Enter value you want to search : ");
            int no = input.nextInt();
            node temp = head;
            boolean flag = false;
            while (temp != null)
            {
                if (no == temp.data)
                {
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (!flag)
            {
                System.out.println(no + " is not present in LinkedList.");
            }
            else
            {
                System.out.println(no + " is present in the LinkedList");
            }
        }
    }

    public void display()
    {
        if (head == null)
        {
            System.out.println("LinkedList is empty.");
        }
        else
        {
            node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Singly_LinkedList obj = new Singly_LinkedList();
        while (true)
        {
            System.out.println("\npress 1 for insert at start.");
            System.out.println("press 2 for insert at last.");
            System.out.println("press 3 for insert after given position.");
            System.out.println("press 4 for insert before given position.");
            System.out.println("press 5 for delete at start.");
            System.out.println("press 6 for delete at last.");
            System.out.println("press 7 for delete given position.");
            System.out.println("press 8 for search.");
            System.out.println("press 9 for display.");
            System.out.println("press 0 for exit.");

            String str = input.nextLine();
            char choice = str.charAt(0);
            switch (choice)
            {
                case '1' -> obj.start_insert();
                case '2' -> obj.last_insert();
                case '3' -> obj.insert_after_given_position();
                case '4' -> obj.insert_before_given_position();
                case '5' -> obj.start_delete();
                case '6' -> obj.last_delete();
                case '7' -> obj.delete_position();
                case '8' -> obj.search();
                case '9' -> obj.display();
                case '0' -> System.exit(0);
                default -> System.out.println("Something went wrong. Please enter valid choice.");
            }
        }
    }
}
