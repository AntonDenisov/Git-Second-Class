public class FormatJSON implements Converter{
    String start;
    String end;

    @Override
    public String convert(String textToConvert) {
        StringBuilder sb = new StringBuilder();
        start = "{\n" +
                "\"text\""+":";
        end = "\n}\n";
        return sb.append(start).append("\""+ textToConvert + "\"").append(end).toString();
    }
}
