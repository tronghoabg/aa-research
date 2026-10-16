package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xcq extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc activity = getActivity();
        View viewInflate = layoutInflater.inflate(R.layout.frx_unplug_replug, viewGroup, false);
        ((ImageView) viewInflate.findViewById(R.id.illustration)).setImageDrawable(activity.getDrawable(2131232976));
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.body);
        textView.setText(getString(R.string.car_setup_unplug_replug_title));
        textView2.setText(getString(R.string.car_setup_unplug_replug_message));
        return viewInflate;
    }
}
