package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class jve implements ggk {
    public final gdv a;
    public final Context b;
    private final aezr c;
    private final aezr d;
    private final aezr e;

    public jve(gdv gdvVar, Context context) {
        gdvVar.getClass();
        this.a = gdvVar;
        this.b = context;
        this.c = woy.dG(new jtw(this, 8));
        this.d = woy.dG(new jtw(this, 9));
        this.e = woy.dG(new jtw(this, 10));
    }

    private final boolean O(abru abruVar, String str) {
        if (str == null) {
            return false;
        }
        return new tgw(this.b, abruVar).a(str);
    }

    @Override // defpackage.ggk
    public final boolean A() {
        return lnm.G() || acob.I();
    }

    @Override // defpackage.ggk
    public final boolean B() {
        return acob.M();
    }

    @Override // defpackage.ggk
    public final boolean C(String str) {
        return !((tgw) this.d.a()).a(str);
    }

    @Override // defpackage.ggk
    public final boolean D() {
        return acob.N();
    }

    @Override // defpackage.ggk
    public final boolean E() {
        return aclu.l();
    }

    @Override // defpackage.ggk
    public final boolean F() {
        return acob.S();
    }

    @Override // defpackage.ggk
    public final boolean G(String str) {
        return O(acob.k(), str);
    }

    @Override // defpackage.ggk
    public final boolean H() {
        return acob.T();
    }

    @Override // defpackage.ggk
    public final boolean I() {
        return acob.U();
    }

    @Override // defpackage.ggk
    public final boolean J() {
        return acob.X();
    }

    @Override // defpackage.ggk
    public final boolean K() {
        return acob.Y();
    }

    @Override // defpackage.ggk
    public final boolean L() {
        return acob.Z();
    }

    @Override // defpackage.ggk
    public final boolean M() {
        return acob.ac();
    }

    @Override // defpackage.ggk
    public final void N() {
        leh.a.a();
    }

    @Override // defpackage.ggk
    public final long a() {
        return acob.b();
    }

    @Override // defpackage.ggk
    public final long b() {
        return acob.c();
    }

    @Override // defpackage.ggk
    public final long c() {
        return acob.d();
    }

    @Override // defpackage.ggk
    public final long d() {
        return acob.e();
    }

    @Override // defpackage.ggk
    public final boolean e() {
        return acob.s();
    }

    @Override // defpackage.ggk
    public final boolean f() {
        return acob.t() || lej.a.a().e() || lnm.G();
    }

    @Override // defpackage.ggk
    public final boolean g() {
        return acqd.p();
    }

    @Override // defpackage.ggk
    public final boolean h() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // defpackage.ggk
    public final boolean i() {
        return acob.x();
    }

    @Override // defpackage.ggk
    public final boolean j() {
        return acob.y();
    }

    @Override // defpackage.ggk
    public final boolean k() {
        return acob.z();
    }

    @Override // defpackage.ggk
    public final boolean l(String str) {
        return O(acob.p(), str);
    }

    @Override // defpackage.ggk
    public final boolean m() {
        return ldz.a.a().b();
    }

    @Override // defpackage.ggk
    public final boolean n() {
        return false;
    }

    @Override // defpackage.ggk
    public final boolean o() {
        return acob.A();
    }

    @Override // defpackage.ggk
    public final boolean p() {
        return true;
    }

    @Override // defpackage.ggk
    public final boolean q() {
        return acob.C();
    }

    @Override // defpackage.ggk
    public final boolean r() {
        return acob.E();
    }

    @Override // defpackage.ggk
    public final boolean s() {
        return acob.F();
    }

    @Override // defpackage.ggk
    public final boolean t() {
        return ((tgw) this.e.a()).a(((gmh) this.a).a.getPackageName());
    }

    @Override // defpackage.ggk
    public final boolean u() {
        return leh.a.a().b() || lej.a.a().e();
    }

    @Override // defpackage.ggk
    public final boolean v() {
        return true;
    }

    @Override // defpackage.ggk
    public final boolean w() {
        return true;
    }

    @Override // defpackage.ggk
    public final boolean x() {
        return lel.a.a().b();
    }

    @Override // defpackage.ggk
    public final boolean y() {
        return lmi.a.a().b();
    }

    @Override // defpackage.ggk
    public final boolean z(String str) {
        return O(acob.o(), str);
    }
}
