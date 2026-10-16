package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xbw extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc activity = getActivity();
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_car_moving, viewGroup, false);
        roc.bq(layoutInflater, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        imageView.setImageDrawable(activity.getDrawable(2131231123));
        textView.setText(activity.getString(R.string.frx_car_moving_title));
        textView2.setText(activity.getString(R.string.frx_car_moving_message));
        Button button = (Button) viewInflate.findViewById(R.id.right_button);
        button.setVisibility(0);
        button.setText(getString(R.string.frx_exit));
        button.setOnClickListener(new xao(this, 11));
        return viewInflate;
    }
}
