package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Optional;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class sft extends sfw {
    public static final /* synthetic */ int e = 0;
    private static final ypf g = ols.R("CAR.SETUP.FRX");
    final Handler a;
    public final sfs b;
    public boolean c;
    final Runnable d;
    private final Optional h;
    private Function i;
    private final boolean j;

    public sft(Optional optional) {
        this.a = new sss(Looper.getMainLooper());
        this.b = new sfs();
        this.i = new ric(7);
        this.c = false;
        this.j = false;
        this.d = new rzy(this, 11, null);
        this.h = optional;
    }

    @Override // defpackage.sfw
    public final yzz b() {
        return yzz.FRX_PRESETUP_RESET_USB;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.f(getChildFragmentManager(), "reset_usb_connection_dialog");
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ryg] */
    @Override // defpackage.sfw, android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.j) {
            Context context = getContext();
            spu.aw(context);
            ols.M(context, yxi.RESET_FRAGMENT_CREATED_BY_SYSTEM);
        }
        bc bcVar = (bc) getContext();
        spu.aw(bcVar);
        adai adaiVar = adai.a;
        if (adaiVar.gu().d()) {
            g.f().ai(8875).u("Attempting usb connection reset");
            c().g.L(yzz.FRX_PRESETUP_RESET_USB, yzy.bY);
            Optional optional = this.h;
            if (optional.isPresent()) {
                optional.get().d(bcVar, 1, 5, ryf.f);
            } else {
                ((rza) this.i.apply(bcVar)).b();
            }
        } else {
            g.f().ai(8874).u("Skipping usb connection reset attempt");
        }
        this.a.postDelayed(this.d, adaiVar.gu().b());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ryg] */
    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        super.onStop();
        Optional optional = this.h;
        if (optional.isPresent() && !this.c) {
            ?? r0 = optional.get();
            Context context = getContext();
            spu.aw(context);
            r0.c(context, SystemClock.elapsedRealtime());
        }
        this.a.removeCallbacksAndMessages(null);
    }

    public sft() {
        this(Optional.empty());
        this.j = true;
    }
}
