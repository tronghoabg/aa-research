package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.projection.gearhead.R;
import defpackage.mhr;
import defpackage.mlt;
import defpackage.mlu;
import defpackage.mlv;
import defpackage.mlx;
import defpackage.ols;
import defpackage.yxi;

/* loaded from: classes2.dex */
public final class ProjectionFragment extends mlt implements mlv {
    public mlx h;
    private Handler i;
    private Runnable j;

    @Override // defpackage.mlt
    public final void a() {
        this.a.setImageResource(R.drawable.gs_android_auto_vd_theme_24);
        this.b.setText(R.string.projection_step_title);
        this.d.setImageResource(R.drawable.usb_cable_checking);
        this.c.setVisibility(8);
        this.e.setVisibility(0);
    }

    @Override // defpackage.mlv
    public final void b(mlu mluVar) {
        if (mluVar.c) {
            ols.M(requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_PROJECTION_STARTED);
            NavHostFragment.b(this).f(R.id.action_projectionFragment_to_projectionEstablishedFragment, null);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        ols.M(requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_PROJECTION_STAGE);
        this.j = new mhr(this, 9);
        this.i = new Handler(Looper.getMainLooper());
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        this.h.c(this);
        this.i.removeCallbacks(this.j);
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.i.postDelayed(this.j, 10000L);
        this.h.b(this);
    }
}
