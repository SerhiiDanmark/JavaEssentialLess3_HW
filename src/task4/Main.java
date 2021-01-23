package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть ключ доступу: ");
        String key = input.next();

        DocumentWorker documentWorker;

        if (key.equals("exp")){
            documentWorker = new ExpertDocumentWorker();
        } else if (key.equals("pro")){
            documentWorker = new ProDocumentWorker();
        } else {
            documentWorker = new DocumentWorker();
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
