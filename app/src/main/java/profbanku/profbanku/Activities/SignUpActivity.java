package profbanku.profbanku.Activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import profbanku.profbanku.R;

public class SignUpActivity extends AppCompatActivity {

    private ImageView mImageView;
    private EditText mEditText1,mEditText2,mEditText3,mEditText4;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mImageView = (ImageView) findViewById(R.id.sign_up_logo_iv);
        Picasso.with(this)
                .load(R.drawable.logo_red)
                .fit()
                .into(mImageView);

        mEditText1 = (EditText) findViewById(R.id.sign_up_name_et);
        mEditText2 = (EditText) findViewById(R.id.sign_up_name_et2);
        mEditText3 = (EditText) findViewById(R.id.email_et);
        mEditText4 = (EditText) findViewById(R.id.password_et);

        mButton = (Button) findViewById(R.id.sign_up_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, MainActivity.class));
            }
        });
    }


    private Drawable resize(Drawable image) {
        Bitmap bitmap = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(bitmap,
                (int) (bitmap.getWidth() * 0.3), (int) (bitmap.getHeight() * 0.3), false);
        return new BitmapDrawable(getResources(), bitmapResized);
    }
}
