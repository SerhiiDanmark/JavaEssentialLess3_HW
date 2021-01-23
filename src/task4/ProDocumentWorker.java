package task4;

public class ProDocumentWorker extends DocumentWorker{

    @Override
    void editDocument() {
        System.out.println("Документ відредагований");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ збережено в старому форматі, збереження в інших форматах доступне в версії Pro");
    }
}
