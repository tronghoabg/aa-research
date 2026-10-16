package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
final class esr extends esy implements Runnable {
    boolean a;
    final /* synthetic */ ess b;

    public esr(ess essVar) {
        this.b = essVar;
    }

    @Override // defpackage.esy
    public final Object a() {
        try {
            return this.b.a();
        } catch (dwc e) {
            if (this.f()) {
                return null;
            }
            throw e;
        }
    }

    @Override // defpackage.esy
    protected final void b(Object obj) {
        this.b.c(this, obj);
    }

    @Override // defpackage.esy
    protected final void c(Object obj) {
        ess essVar = this.b;
        if (essVar.a != this) {
            essVar.c(this, obj);
            return;
        }
        if (essVar.f) {
            essVar.f(obj);
            return;
        }
        essVar.i = false;
        SystemClock.uptimeMillis();
        essVar.a = null;
        essVar.k(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.e();
    }
}
