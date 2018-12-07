public class RomanNumbersConverter {
    //This code was meant to be unflexible so all roman symbols are inside the method

    public String Convert(int number){
        // 5000 upper limit can be removed then the code will just append more M for each 1000 above(not correct)
        if(number<=0 || number>=5000) {
            return null;
        }

        String romanNumber = "";
        while(number>0){
            if(number>=1000){
                number -= 1000;
                romanNumber += "M";
            }
            else if(number>=900){
                number -= 900;
                romanNumber += "CM";
            }
            else if(number>=500){
                number -= 500;
                romanNumber += "D";
            }
            else if(number>=400){
                number -= 400;
                romanNumber += "CD";
            }
            else if(number>=100){
                number -= 100;
                romanNumber += "C";
            }
            else if(number>=90){
                number -= 90;
                romanNumber += "XC";
            }
            else if(number>=50){
                number -= 50;
                romanNumber += "L";
            }
            else if(number>=40){
                number -= 40;
                romanNumber += "XL";
            }
            else if(number>=10){
                number -= 10;
                romanNumber += "X";
            }
            else if(number>=9){
                number -= 9;
                romanNumber += "IX";
            }
            else if(number>=5){
                number -= 5;
                romanNumber += "V";
            }
            else if(number>=4){
                number -= 4;
                romanNumber += "IV";
            }
            else{
                number -= 1;
                romanNumber += "I";
            }
        }
        return romanNumber;
    }
}
