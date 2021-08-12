package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        boolean result = false;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'g') {
                if (str.charAt(i+1) == 'g') {
                    result = true;
                    i++;
                } else return false;
            }
        }

        return result;
    }
}
