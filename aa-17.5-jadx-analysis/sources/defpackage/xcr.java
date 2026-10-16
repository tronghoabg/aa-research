package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xcr extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc activity = getActivity();
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_intro, viewGroup, false);
        roc.bq(layoutInflater, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        imageView.setImageDrawable(activity.getDrawable(2131231118));
        textView.setText(R.string.frx_intro_title);
        textView2.setText(TextUtils.concat((acvh.v() || !kmu.b().d("device_supported")) ? activity.getText(R.string.frx_intro_body_projected_unsupported) : activity.getText(R.string.frx_intro_body), "\n\n", activity.getText(R.string.frx_tos)));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        Button button = (Button) viewInflate.findViewById(R.id.right_button);
        button.setVisibility(0);
        button.setText(R.string.frx_intro_setup);
        button.setOnClickListener(new xae(this, activity, 5, null));
        return viewInflate;
    }
}
