package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.projection.gearhead.R;
import defpackage.mhr;
import defpackage.mlt;
import defpackage.mlu;
import defpackage.mlv;
import defpackage.mlx;
import defpackage.ols;
import defpackage.yxi;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class DisableAdbFragment extends mlt implements mlv {
    public static final Duration h = Duration.ofSeconds(10);
    static final Duration i = Duration.ofSeconds(2);
    public Runnable k;
    public Runnable m;
    public mlx n;
    public boolean j = false;
    public final Handler l = new Handler(Looper.getMainLooper());

    @Override // defpackage.mlt
    public final void a() {
        this.a.setImageResource(R.drawable.gs_android_auto_vd_theme_24);
        this.b.setText(R.string.disable_adb_title);
        this.d.setImageResource(R.drawable.usb_cable_checking);
        this.c.setVisibility(8);
        this.e.setVisibility(0);
    }

    @Override // defpackage.mlv
    public final void b(mlu mluVar) {
        if (mluVar.c) {
            ols.M(requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_ADB_DISABLE_RESOLVED);
            this.l.removeCallbacks(this.m);
            NavHostFragment.b(this).f(R.id.action_disableAdbFragment_to_projectionEstablishedFragment, null);
        }
    }

    public final void c() {
        NavHostFragment.b(this).f(R.id.action_disableAdbFragment_to_usbConfigFragment, null);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        ols.M(requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_DISABLE_ADB_STAGE);
        this.m = new mhr(this, 7);
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        this.n.c(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.n.b(this);
        if (this.j) {
            this.j = false;
            Runnable runnable = this.k;
            if (runnable != null) {
                runnable.run();
                this.k = null;
            }
        }
    }

    @Override // defpackage.mlt, android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.l.postDelayed(new mhr(this, 8), i.toMillis());
    }
}
