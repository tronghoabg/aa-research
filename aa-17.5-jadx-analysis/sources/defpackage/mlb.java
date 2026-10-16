package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mlb extends wmf {
    public static void h(yzy yzyVar) {
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CONNECT_A_CAR_PAIR_BLUETOOTH, yzyVar).l());
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h(yzy.f);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material3_dialog_connect_a_car_options, viewGroup, false);
        viewGroup2.findViewById(android.R.id.button1).setOnClickListener(new mli(this, 1));
        return viewGroup2;
    }
}
