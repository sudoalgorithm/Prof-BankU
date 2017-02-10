package profbanku.profbanku.QuantitativeAptitudeActivities.ProfitLoss;

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

public class FactsheetProfitLossFragment extends Fragment {

    private View rootView;
    private ImageView img1;
    private Drawable draw;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView =  inflater.inflate(R.layout.activity_factsheet_profit_loss_fragment,container,false);
        img1 = (ImageView) rootView.findViewById(R.id.imgProfitLoss);
        img1.setImageResource(0);
        draw = getResources().getDrawable(R.drawable.page0pl);
        draw = resize(draw);
        img1.setImageDrawable(draw);
        return rootView;

    }

    private Drawable resize(Drawable image) {
        Bitmap bitmap = ((BitmapDrawable) image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(bitmap,
                (int) (bitmap.getWidth() * 0.3), (int) (bitmap.getHeight() * 0.3), false);
        return new BitmapDrawable(getResources(), bitmapResized);
    }
}
