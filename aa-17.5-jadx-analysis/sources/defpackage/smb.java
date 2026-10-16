package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class smb extends slv {
    public final yy e;
    private final smi g;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public smb(smo smoVar, smi smiVar) {
        super(smoVar, sjv.a);
        this.e = new yy(0);
        this.g = smiVar;
        adzp adzpVar = ((sna) this.f).b;
        ?? r4 = adzpVar.a;
        if (r4.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        r4.put("ConnectionlessLifecycleHelper", this);
        if (adzpVar.b > 0) {
            new sss(Looper.getMainLooper()).post(new rdz(adzpVar, this, 4));
        }
    }

    @Override // defpackage.slv
    protected final void e(ConnectionResult connectionResult, int i) {
        this.g.d(connectionResult, i);
    }

    @Override // defpackage.slv
    protected final void f() {
        this.g.e();
    }

    @Override // defpackage.smn
    public final void h() {
        k();
    }

    @Override // defpackage.smn
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.smn
    public final void j() {
        this.a = false;
        Object obj = smi.c;
        smi smiVar = this.g;
        synchronized (obj) {
            if (smiVar.l == this) {
                smiVar.l = null;
                smiVar.m.clear();
            }
        }
    }

    public final void k() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.f(this);
    }
}
