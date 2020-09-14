import java.util.stream.Stream;

public class Mommifier {
    public String convert(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        int count = 0;
        int i ;
        char myChar[]=s.toCharArray();
        for (i=0;i<s.length();i+=1){
            if (myChar[i]>='a' && myChar[i]<='e'){
                count+=1;
                if(count>=s.length()*0.3){
                    if (myChar[i]== myChar[i + 1]){
                        stringBuffer.insert(i,"妈妈");
                        return stringBuffer.toString();
                    }
                    return String.valueOf(s);
                }
            }

        }
        return String.valueOf(s);
    }

}

