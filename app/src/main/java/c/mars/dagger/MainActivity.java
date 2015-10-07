package c.mars.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

import javax.inject.Inject;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Inject
    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new Timber.DebugTree());

        Component component = DaggerComponent.builder().build();
        Model model = component.model();


        Timber.d(model.desc());

//        Random random=new Random();
//        for(int i=0;i<10;i++){
//            Timber.d(String.valueOf(random.nextInt(50)/10.0f));
//        }
//        timeDemo();
    }

    private void timeDemo(){
        DateTime now=new DateTime();
        Slots slots = Slots.initSlots(now);
        String f="hh:mm";
        Timber.d("o: " + now.toString(f) + ", s:" + slots.start.toString(f) + ", e:" + slots.end.toString(f));
    }

    static class Slots {
        MutableDateTime start, end;

        public static Slots initSlots(DateTime now){
            Slots slots=new Slots();
            slots.start = new MutableDateTime(now.getChronology());
            slots.start.setMinuteOfHour((int) (Math.round((double) now.getMinuteOfHour() / 10) * 10));
            slots.end = slots.start.copy();
            slots.end.addHours(1);
            return slots;
        }
    }
}
