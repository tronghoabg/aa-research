package com.google.android.apps.auto.components.settings.interactivetroubleshooter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.mlt;
import defpackage.mlu;
import defpackage.mlv;
import defpackage.mlx;
import defpackage.ohe;
import defpackage.ols;
import defpackage.ryc;
import defpackage.yxi;

/* loaded from: classes2.dex */
public final class UsbConfigFragment extends mlt implements mlv {
    public mlx h;
    public ohe i;
    private ryc j;

    @Override // defpackage.mlt
    public final void a() {
        this.b.setText(R.string.usb_config_title);
        this.d.setImageResource(R.drawable.usb_cable_checking);
        this.a.setImageResource(R.drawable.cable_logo);
        this.e.setVisibility(0);
        this.c.setVisibility(8);
    }

    @Override // defpackage.mlv
    public final void b(mlu mluVar) {
        this.j.c(mluVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        yxi yxiVar;
        Long l = (Long) ryc.b.get(i);
        if (l.longValue() == 4) {
            yxiVar = yxi.INTERACTIVE_TROUBLESHOOTER_STAGE_MTP;
        } else if (l.longValue() == 16) {
            yxiVar = yxi.INTERACTIVE_TROUBLESHOOTER_STAGE_PTP;
        } else if (l.longValue() != 0) {
            return;
        } else {
            yxiVar = yxi.INTERACTIVE_TROUBLESHOOTER_STAGE_NONE;
        }
        ols.M(requireContext(), yxiVar);
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.j = new ryc(requireContext(), new Handler(Looper.getMainLooper()), false, 5000L, -1L, 0, false, 0, false);
        c(0);
        this.j.r = new ajmd(this, null);
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        this.h.c(this);
        this.j.e();
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        this.j.d();
        this.h.b(this);
    }
}
