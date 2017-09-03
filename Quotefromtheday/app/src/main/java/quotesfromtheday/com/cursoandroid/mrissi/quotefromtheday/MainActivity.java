package quotesfromtheday.com.cursoandroid.mrissi.quotefromtheday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView quoteFromTheDay;
    private Button btnquote;

    private String[] quotes = {"Don't cry because it's over, smile because it happened.",
            "Be yourself; everyone else is already taken.",
            "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
            "Be who you are and say what you feel, because those who mind don't matter, and those who matter don't mind.",
            "You know you're in love when you can't fall asleep because reality is finally better than your dreams.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "In three words I can sum up everything I've learned about life: it goes on.",
            "No one can make you feel inferior without your consent.",
            "If you tell the truth, you don't have to remember anything.",
            "A friend is someone who knows all about you and still loves you.",
            "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.",
            "Always forgive your enemies; nothing annoys them so much.",
            "Live as if you were to die tomorrow. Learn as if you were to live forever.",
            "To live is the rarest thing in the world. Most people exist, that is all.",
            "Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteFromTheDay = (TextView) findViewById(R.id.txt_quote_id);
        btnquote = (Button) findViewById(R.id.button_quote_id);

        final Random random = new Random();

        if (quotes != null) {
            quoteFromTheDay.setText(quotes[random.nextInt(quotes.length)]);

            btnquote.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int randomNumber = random.nextInt(quotes.length);
                    quoteFromTheDay.setText(quotes[randomNumber]);
                }
            });
        }
    }
}
