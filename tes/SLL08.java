public class SLL08 {
    NodePasien08 head;
    NodePasien08 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void enqueue(Pasien08 pasien) {
        NodePasien08 newNode = new NodePasien08(pasien, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; 
            tail = newNode;
        }
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }

    public Pasien08 dequeue() {
        if (isEmpty()) {
            System.out.println();
        }
        Pasien08 temp = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }

    public Pasien08 peek() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian pasien kosong.");
            return;
        }
        NodePasien08 tmp = head;
        while (tmp != null) {
            tmp.data.tampilkanInformasi();
            System.out.println();
            tmp = tmp.next;
        }
    }
    
    public int size() {
        int jumlahPasien = 0;
        NodePasien08 tmp = head; 
        while (tmp != null) {
            jumlahPasien++;
            tmp = tmp.next;
        }
        return jumlahPasien;
    }
}
