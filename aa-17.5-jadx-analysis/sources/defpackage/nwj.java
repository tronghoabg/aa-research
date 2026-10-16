package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class nwj extends nwk implements nwm {
    public static final /* synthetic */ int e = 0;
    private static final yph m = yph.c("GH.HunPresenter");
    public noh a;
    public boolean b;
    public boolean c;
    public final eqa d;
    private boolean n;
    private Runnable o = new iqz(6);

    public nwj(eqa eqaVar) {
        this.d = eqaVar;
    }

    public final void b() {
        if (this.d != null) {
            this.n = true;
            this.a = (noh) kgq.c(new kiz(this, 5), "GH.HunPresenter", yzz.SYSTEM_UI_NOTIFICATION, yzy.of, true, "Unable to create fragment host for HUN", new Object[0]);
        }
    }

    @Override // defpackage.nwk
    protected final void c() {
        if (this.a == null) {
            ((ype) m.l().ai((char) 5495)).u("recycleHost, nothing currently showing");
            this.b = false;
            return;
        }
        Handler handler = this.h;
        handler.removeCallbacks(this.o);
        nqw nqwVar = new nqw(this, 8);
        this.o = nqwVar;
        handler.post(nqwVar);
        this.c = true;
    }

    @Override // defpackage.nwk
    protected final void d() {
        this.b = true;
        c();
    }

    @Override // defpackage.nwm
    public final void e(nwf nwfVar) {
        this.k = nwfVar;
        this.n = false;
        k();
    }

    @Override // defpackage.nwk
    protected final boolean f() {
        return this.n;
    }

    @Override // defpackage.nwk
    public final boolean g() {
        return this.c;
    }

    @Override // defpackage.nwk
    protected final boolean h() {
        if (this.a != null) {
            return false;
        }
        b();
        nsr.c().b().w(this);
        return true;
    }
}
