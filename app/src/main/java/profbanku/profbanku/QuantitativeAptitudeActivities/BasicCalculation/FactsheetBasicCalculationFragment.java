package profbanku.profbanku.QuantitativeAptitudeActivities.BasicCalculation;

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

public class FactsheetBasicCalculationFragment extends Fragment {

    private ImageView img1,img2,img3;
    private Drawable draw1,draw2,draw3;
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_factsheet_basic_calculation_fragment,container,false);
        img1 = (ImageView) rootView.findViewById(R.id.imgbc1);
        img2 = (ImageView) rootView.findViewById(R.id.imgbc2);
        img3 = (ImageView) rootView.findViewById(R.id.imgbc3);
        img1.setImageResource(0);
        img2.setImageResource(0);
        img3.setImageResource(0);
        draw1 = getResources().getDrawable(R.drawable.page0bc);
        draw2 = getResources().getDrawable(R.drawable.page1bc);
        draw3 = getResources().getDrawable(R.drawable.page2bc);
        draw1 = resize(draw1);
        draw2 = resize(draw2);
        draw3 = resize(draw3);
        img1.setImageDrawable(draw1);
        img2.setImageDrawable(draw2);
        img3.setImageDrawable(draw3);
        return rootView;

    }

    private Drawable resize(Drawable image) {
        Bitmap bitmap = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(bitmap,
                (int) (bitmap.getWidth() * 0.3), (int) (bitmap.getHeight() * 0.3), false);
        return new BitmapDrawable(getResources(), bitmapResized);
    }
}
