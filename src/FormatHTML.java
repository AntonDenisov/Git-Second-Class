public class FormatHTML implements Converter {
    String start;
    String end;

    @Override
    public String convert(String textToConvert) {
        StringBuilder sb = new StringBuilder();
        start = "\n<title>\n";
        end = "\n</title>\n";
        return sb.append(start).append(textToConvert).append(end).toString();
    }
}
