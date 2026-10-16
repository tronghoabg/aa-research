package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sdq extends sei {
    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc bcVar = (bc) getContext();
        View viewInflate = layoutInflater.inflate(R.layout.car_frx_incompatible, viewGroup, false);
        qrv.s(layoutInflater, (ViewGroup) viewInflate);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.illustration);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        Button button = (Button) viewInflate.findViewById(R.id.right_button);
        button.setOnClickListener(new sdo((Object) this, 2));
        textView.setText(R.string.car_frx_device_incompatible_no_vanagon_title);
        button.setVisibility(0);
        button.setText(R.string.car_setup_exit);
        imageView.setImageDrawable(bcVar.getDrawable(2131231117));
        qst.a(bcVar).h();
        return viewInflate;
    }
}
