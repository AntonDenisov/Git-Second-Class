public class FormatXML implements Converter{
    String start;
    String end;

    @Override
    public String convert(String textToConvert) {
        StringBuilder sb = new StringBuilder();
        start = "<testXML>\n";
        end = "\n</testXML>\n";
        return sb.append(start).append(textToConvert).append(end).toString();
    }
}
