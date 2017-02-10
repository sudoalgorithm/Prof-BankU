package profbanku.profbanku.QuantitativeAptitudeActivities.PercentageBasic;

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

public class FactsheetPercentageBasicFragment extends Fragment {

    private ImageView img1,img2,img3,img4,img5,img6;
    private Drawable draw1,draw2,draw3,draw4,draw5,draw6;
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.activity_factsheet_percentage_basic_fragment, container,false);
        img1 = (ImageView) rootView.findViewById(R.id.img1);
        img2 = (ImageView) rootView.findViewById(R.id.img2);
        img3 = (ImageView) rootView.findViewById(R.id.img3);
        img4 = (ImageView) rootView.findViewById(R.id.img4);
        img5 = (ImageView) rootView.findViewById(R.id.img5);
        img6 = (ImageView) rootView.findViewById(R.id.img6);
        img1.setImageResource(0);
        img2.setImageResource(0);
        img3.setImageResource(0);
        img4.setImageResource(0);
        img5.setImageResource(0);
        img6.setImageResource(0);
        draw1 = getResources().getDrawable(R.drawable.page0p);
        draw2 = getResources().getDrawable(R.drawable.page1p);
        draw3 = getResources().getDrawable(R.drawable.page2p);
        draw4 = getResources().getDrawable(R.drawable.page4p);
        draw5 = getResources().getDrawable(R.drawable.page5p);
        draw6 = getResources().getDrawable(R.drawable.page6p);
        draw1 = resize(draw1);
        draw2 = resize(draw2);
        draw3 = resize(draw3);
        draw4 = resize(draw4);
        draw5 = resize(draw5);
        draw6 = resize(draw6);
        img1.setImageDrawable(draw1);
        img2.setImageDrawable(draw2);
        img3.setImageDrawable(draw3);
        img4.setImageDrawable(draw4);
        img5.setImageDrawable(draw5);
        img6.setImageDrawable(draw6);
        return rootView;
    }

    private Drawable resize(Drawable image) {
        Bitmap bitmap = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(bitmap,
                (int) (bitmap.getWidth() * 0.3), (int) (bitmap.getHeight() * 0.3), false);
        return new BitmapDrawable(getResources(), bitmapResized);
    }

}
