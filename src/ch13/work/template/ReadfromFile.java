package ch13.work.template;

public class ReadfromFile extends BookReader{
    @Override
    void initialize() {
        System.out.println("Open an input file");
    }

    @Override
    void startReading() {
        System.out.println("Loop writing out each record");
        FileInput file = new FileInput("prideprejudice");
        String line;
        String[] fields;
        while ((line = file.fileReadLine()) != null) {
            fields = line.split(" ");
            for (String fld : fields) {
                System.out.println(fld);
            }
        }
        file.fileClose();
    }

    @Override
    void stopReading() {
        System.out.println("Close input file");
    }
}
