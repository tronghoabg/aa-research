package od;

import A7.C0237b0;

/* renamed from: od.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3743z0 extends md.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42133a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final md.K f42134b;

    public C3743z0(Throwable th) {
        md.k0 k0VarG = md.k0.f40681m.h("Panic! This is a bug!").g(th);
        md.K k = md.K.f40583e;
        Fe.e.p("drop status shouldn't be OK", !k0VarG.f());
        this.f42134b = new md.K(null, null, k0VarG, true);
    }

    @Override // md.M
    public final md.K a(C3709n1 c3709n1) {
        switch (this.f42133a) {
        }
        return this.f42134b;
    }

    public final String toString() {
        switch (this.f42133a) {
            case 0:
                C0237b0 c0237b0 = new C0237b0(C3743z0.class.getSimpleName());
                c0237b0.f(this.f42134b, "panicPickResult");
                return c0237b0.toString();
            default:
                return "FixedResultPicker(" + this.f42134b + ")";
        }
    }

    public C3743z0(md.K k) {
        Fe.e.t(k, "result");
        this.f42134b = k;
    }
}
