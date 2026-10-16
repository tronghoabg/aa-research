package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.projection.gearhead.R;
import defpackage.mlt;
import defpackage.mlu;
import defpackage.mlv;
import defpackage.mlx;
import defpackage.oit;
import defpackage.ols;
import defpackage.rxu;
import defpackage.whk;
import defpackage.xya;
import defpackage.xyi;
import defpackage.yxi;
import j$.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ChargeOnlyFragment extends mlt implements mlv {
    public static final Duration h = Duration.ofSeconds(3);
    static final Duration i = Duration.ofSeconds(4);
    public final Handler j = new Handler(Looper.getMainLooper());
    public mlx k;
    private rxu l;

    @Override // defpackage.mlt
    public final void a() {
        this.b.setText(R.string.charge_only_step_title);
        this.d.setImageResource(R.drawable.usb_cable_checking);
        this.a.setImageResource(R.drawable.cable_logo);
        this.c.setVisibility(8);
        this.e.setVisibility(0);
    }

    @Override // defpackage.mlv
    public final void b(mlu mluVar) {
        this.l.c(mluVar.a);
        this.l.b(mluVar.b);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        ols.M(requireContext(), yxi.INTERACTIVE_TROUBLESHOOTER_CHARGE_ONLY_STAGE);
        Context contextRequireContext = requireContext();
        Handler handler = new Handler(Looper.getMainLooper());
        Executors.newSingleThreadExecutor();
        this.l = new rxu(contextRequireContext, handler, i.toMillis());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        xya xyaVarB = xya.b((xyi) oit.a().b);
        this.l.g = new whk(this, atomicBoolean, xyaVarB, null);
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        rxu rxuVar = this.l;
        rxuVar.g = null;
        rxuVar.e();
        this.k.c(this);
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.l.d();
        this.k.b(this);
    }
}
