package profbanku.profbanku.QuantitativeAptitudeActivities.Algebra;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import profbanku.profbanku.R;

public class QuestionsFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView =  inflater.inflate(R.layout.activity_questions_algebra,container,false);
        return rootView;
    }

    private Drawable resize(Drawable image) {
        Bitmap bitmap = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(bitmap,
                (int) (bitmap.getWidth() * 0.3), (int) (bitmap.getHeight() * 0.3), false);
        return new BitmapDrawable(getResources(), bitmapResized);
    }
}
