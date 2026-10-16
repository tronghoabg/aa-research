package e.a.b.a;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import e.a.d.dn;
import e.a.ee;
import e.a.ef;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad implements e.a.d.af {

    /* renamed from: a, reason: collision with root package name */
    private final o f46308a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f46309b;

    ad(o oVar, ai aiVar) {
        this.f46308a = oVar;
        this.f46309b = aiVar;
    }

    @Override // e.a.d.af
    public final e.a.c a() {
        throw null;
    }

    @Override // e.a.d.af
    public final void b(dn dnVar) {
    }

    @Override // e.a.d.af
    public final void c(ee eeVar) {
        o oVar = this.f46308a;
        synchronized (oVar) {
            oVar.h(eeVar);
        }
    }

    @Override // e.a.d.ju
    public final void d() {
    }

    @Override // e.a.d.af
    public final void e() {
        try {
            ai aiVar = this.f46309b;
            synchronized (aiVar) {
                aiVar.f();
                aiVar.g();
            }
        } catch (ef e2) {
            o oVar = this.f46308a;
            synchronized (oVar) {
                oVar.g(e2.b());
            }
        }
    }

    @Override // e.a.d.ju
    public final void f() {
    }

    @Override // e.a.d.ju
    public final void g(int i2) {
        o oVar = this.f46308a;
        synchronized (oVar) {
            oVar.m(i2);
        }
    }

    @Override // e.a.d.ju
    public final void h(e.a.s sVar) {
    }

    @Override // e.a.d.af
    public final void i(e.a.ad adVar) {
        ai aiVar = this.f46309b;
        synchronized (aiVar) {
            aiVar.b(adVar);
        }
    }

    @Override // e.a.d.af
    public final void j(e.a.ag agVar) {
    }

    @Override // e.a.d.af
    public final void k(int i2) {
    }

    @Override // e.a.d.af
    public final void l(int i2) {
    }

    @Override // e.a.d.af
    public final void m(e.a.d.ah ahVar) {
        o oVar = this.f46308a;
        synchronized (oVar) {
            oVar.k(this.f46309b, ahVar);
        }
        ai aiVar = this.f46309b;
        if (aiVar.h()) {
            ahVar.f();
        }
        try {
            synchronized (aiVar) {
                aiVar.e();
                aiVar.g();
            }
        } catch (ef e2) {
            o oVar2 = this.f46308a;
            synchronized (oVar2) {
                oVar2.g(e2.b());
            }
        }
    }

    @Override // e.a.d.ju
    public final void n(InputStream inputStream) {
        try {
            ai aiVar = this.f46309b;
            synchronized (aiVar) {
                aiVar.d(inputStream);
                aiVar.g();
            }
        } catch (ef e2) {
            o oVar = this.f46308a;
            synchronized (oVar) {
                oVar.g(e2.b());
            }
        }
    }

    @Override // e.a.d.ju
    public final boolean o() {
        return this.f46309b.h();
    }

    public final String toString() {
        ai aiVar = this.f46309b;
        return "MultiMessageClientStream[" + this.f46308a.toString() + DomExceptionUtils.SEPARATOR + aiVar.toString() + "]";
    }
}
