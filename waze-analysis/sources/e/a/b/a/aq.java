package e.a.b.a;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import e.a.d.dn;
import e.a.ee;
import e.a.ef;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aq implements e.a.d.af {

    /* renamed from: a, reason: collision with root package name */
    private final o f46354a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f46355b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f46356c;

    /* renamed from: d, reason: collision with root package name */
    private e.a.ad f46357d;

    aq(o oVar, ai aiVar) {
        this.f46354a = oVar;
        this.f46355b = aiVar;
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
        o oVar = this.f46354a;
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
            ai aiVar = this.f46355b;
            synchronized (aiVar) {
                e.a.ad adVar = this.f46357d;
                if (adVar != null) {
                    aiVar.b(adVar);
                }
                aiVar.e();
                InputStream inputStream = this.f46356c;
                if (inputStream != null) {
                    aiVar.d(inputStream);
                }
                aiVar.f();
                aiVar.g();
            }
        } catch (ef e2) {
            o oVar = this.f46354a;
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
        o oVar = this.f46354a;
        synchronized (oVar) {
            oVar.m(i2);
        }
    }

    @Override // e.a.d.ju
    public final void h(e.a.s sVar) {
    }

    @Override // e.a.d.af
    public final void i(e.a.ad adVar) {
        this.f46357d = adVar;
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
        o oVar = this.f46354a;
        synchronized (oVar) {
            oVar.k(this.f46355b, ahVar);
        }
        if (this.f46355b.h()) {
            ahVar.f();
        }
    }

    @Override // e.a.d.ju
    public final void n(InputStream inputStream) {
        if (this.f46356c == null) {
            this.f46356c = inputStream;
            return;
        }
        o oVar = this.f46354a;
        synchronized (oVar) {
            oVar.g(ee.f47410j.g("too many messages"));
        }
    }

    @Override // e.a.d.ju
    public final boolean o() {
        return this.f46355b.h();
    }

    public final String toString() {
        ai aiVar = this.f46355b;
        return "SingleMessageClientStream[" + this.f46354a.toString() + DomExceptionUtils.SEPARATOR + aiVar.toString() + "]";
    }
}
