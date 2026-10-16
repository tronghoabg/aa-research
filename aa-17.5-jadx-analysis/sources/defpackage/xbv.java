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
public final class xbv extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc activity = getActivity();
        View viewInflate = layoutInflater.inflate(R.layout.frx_car_dock_prompt, viewGroup, false);
        roc.bq(layoutInflater, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        imageView.setImageDrawable(activity.getDrawable(R.drawable.android_auto_icon_large));
        textView.setText(activity.getString(R.string.frx_cardock_prompt_title));
        textView2.setText(activity.getString(R.string.frx_cardock_prompt_body, new Object[]{activity.getString(R.string.app_name)}));
        Button button = (Button) viewInflate.findViewById(R.id.right_button);
        button.setVisibility(0);
        button.setText(getString(R.string.frx_next));
        button.setOnClickListener(new xao(this, 10));
        return viewInflate;
    }
}
