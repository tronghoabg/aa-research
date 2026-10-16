package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.projection.gearhead.R;
import defpackage.mlt;
import defpackage.mlu;
import defpackage.mlv;
import defpackage.mlx;
import defpackage.ryv;

/* loaded from: classes2.dex */
public final class ConnectCarFragment extends mlt implements mlv {
    public mlx h;
    private boolean i = true;
    private boolean j = false;

    @Override // defpackage.mlt
    public final void a() {
        this.a.setImageResource(R.drawable.gs_android_auto_vd_theme_24);
        this.b.setText(R.string.connection_help_title);
        this.c.setVisibility(0);
        this.e.setVisibility(8);
    }

    @Override // defpackage.mlv
    public final void b(mlu mluVar) {
        boolean z = this.i;
        if (!z) {
            ryv ryvVar = mluVar.b;
            if (ryvVar == null) {
                return;
            }
            if (ryvVar.a == this.j) {
                return;
            }
        }
        boolean z2 = mluVar.b.a;
        this.j = z2;
        if (!z2) {
            this.c.setText(R.string.connect_usb_continue_message);
            this.d.setImageResource(R.drawable.usb_cable_connect);
        } else if (z) {
            this.c.setText(R.string.disconnect_usb_message);
            this.d.setImageResource(R.drawable.usb_cable_disconnect);
        } else {
            NavHostFragment.b(this).f(R.id.action_connectCarFragment_to_chargeOnlyFragment, null);
        }
        this.i = false;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.i = true;
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        this.h.c(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.h.b(this);
    }
}
