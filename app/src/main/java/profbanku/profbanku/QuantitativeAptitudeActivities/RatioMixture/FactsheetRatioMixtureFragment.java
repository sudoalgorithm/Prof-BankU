package profbanku.profbanku.QuantitativeAptitudeActivities.RatioMixture;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import profbanku.profbanku.R;

public class FactsheetRatioMixtureFragment extends Fragment {

    private View rootView;
    private ImageView img;
    private Drawable draw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_factsheet_ratio_mixture_fragment,container,false);
        img = (ImageView) rootView.findViewById(R.id.imgRM);
        img.setImageResource(0);
        draw = getResources().getDrawable(R.drawable.pagerm);
        draw = resize(draw);
        img.setImageDrawable(draw);
        return rootView;
    }

    private Drawable resize(Drawable image) {
        Bitmap bitmap = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(bitmap,
                (int) (bitmap.getWidth() * 0.3), (int) (bitmap.getHeight() * 0.3), false);
        return new BitmapDrawable(getResources(), bitmapResized);
    }
}
