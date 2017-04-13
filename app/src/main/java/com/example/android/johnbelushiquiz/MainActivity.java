import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.android.johnbelushiquiz.R;

/**
 * This app displays is a quiz about John Belushi
 */
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;
import static com.example.android.johnbelushiquiz.R.id.what_Year_Was_John_Belushi_Born;

public class MainActivity extends AppCompatActivity {

	int score = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	public void radioButtonClicked(View view) {
		boolean checked = ((RadioButton) view).isChecked();

		switch (view.getId()) {
			case R.id.radio_one_correct:
				if (checked) break;

			case R.id.radio_one_b:
				if (checked) break;

			case R.id.radio_one_c:
				if (checked) break;

			case R.id.radio_one_d:
				if (checked) break;

			case R.id.radio_two_a:
				if (checked) break;

			case R.id.radio_two_b:
				if (checked) break;

			case R.id.radio_two_correct:
				if (checked) break;

			case R.id.radio_two_d:
				if (checked) break;

		}

	}


	private int calculateScore(boolean answerOne, boolean answerTwo,
							   boolean answerThreeB, boolean answerThreeC,
							   boolean answerFour, Editable answerSix) {
		score = 100;

		if (answerOne) {


		} else {

			score = score - 100 / 6;
		}

		if (answerTwo) {


		} else {

			score = score - 100 / 6;
		}


		if (answerThreeB && answerThreeC) {

		} else {

			score = score - 100 / 6;
		}


		if (answerFour) {


		} else {

			score = score - 100 / 6;
		}


		if (answerSix.toString().equals("")) {

			score = score - 100 / 6;

		} else {


		}

		return score;

	}


	public void submitScore(View view) {
		RadioButton answerOne = (RadioButton) findViewById(R.id.radio_one_correct);
		boolean correctAnswerOne = answerOne.isChecked();

		RadioButton answerTwo = (RadioButton) findViewById(R.id.radio_two_correct);
		boolean correctAnswerTwo = answerTwo.isChecked();

		CheckBox answerThreeA = (CheckBox) findViewById(R.id.checkbox_three_a);
		boolean incorrectAnswerThreeA = answerThreeA.isChecked();

		CheckBox answerThreeB = (CheckBox) findViewById(R.id.checkbox_three_b_correct);
		boolean correctAnswerThreeB = answerThreeB.isChecked();

		CheckBox answerThreeD = (CheckBox) findViewById(R.id.checkbox_three_d);
		boolean incorrectAnswerThreeD = answerThreeD.isChecked();

		CheckBox answerThreeC = (CheckBox) findViewById(R.id.checkbox_three_c);
		boolean incorrectAnswerThreeC = answerThreeC.isChecked();

		EditText answerSix = (1949) findViewById(R.id.what_Year_Was_John_Belushi_Born);
		Editable correctAnswerSix = answerSix.getEditableText();

		int finalScore = calculateScore(correctAnswerOne, correctAnswerTwo,
				correctAnswerThreeB, incorrectAnswerThreeC,
				incorrectAnswerThreeD, correctAnswerSix);

		Toast.makeText(this, "Congratulations! You have a score of " + finalScore + " out of " +
				"100", Toast.LENGTH_LONG).show();
	}

}