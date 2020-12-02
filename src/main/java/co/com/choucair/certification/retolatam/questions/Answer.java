package co.com.choucair.certification.retolatam.questions;

import co.com.choucair.certification.retolatam.userinterface.ValidateSize;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private int size;

    public Answer(int size) {
        this.size = size;
    }

    public static Answer theSize(int size) {
        return new Answer(size);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message= Text.of(ValidateSize.CODIGO_RESERVACION).viewedBy(actor).asString();
        //System.out.println("Messaaggeeeeeee: "+message);
        message=message.split("\n")[1];
        String vMessage[]=message.split(" ");
        String word =vMessage[vMessage.length-1];
        word=word.replace(".","");
        int sizeM=word.length();

        if(sizeM==size) {
           result=true;
        }
        else{
            result=false;
        }
        return result;
    }
}
