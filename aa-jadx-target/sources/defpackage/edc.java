package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class edc {
    static final defpackage.edf i;
    final defpackage.edf j;

    static {
        ecs ecnVar;
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            ecnVar = new ecs();
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            ecnVar = new ecr();
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            ecnVar = new ecq();
        } else if (android.os.Build.VERSION.SDK_INT >= 31) {
            ecnVar = new defpackage.ecp();
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            ecnVar = new defpackage.eco();
        } else {
            ecnVar = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.ecn() : new ecm();
        }
        i = ecnVar.a().l().m().n();
    }

    public edc(defpackage.edf edfVar) {
        this.j = edfVar;
    }

    public boolean A() {
        return false;
    }

    public defpackage.eag B() {
        return null;
    }

    public defpackage.edf C() {
        return this.j;
    }

    public defpackage.dvl D() {
        return d();
    }

    public defpackage.dvl E() {
        return d();
    }

    public defpackage.dvl F() {
        return d();
    }

    public defpackage.dvl a(int i2) {
        return defpackage.dvl.a;
    }

    public defpackage.dvl c(int i2) {
        if ((i2 & 8) == 0) {
            return defpackage.dvl.a;
        }
        throw new java.lang.IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public defpackage.dvl d() {
        return defpackage.dvl.a;
    }

    public defpackage.edf e(int i2, int i3, int i4, int i5) {
        return i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.edc)) {
            return false;
        }
        defpackage.edc edcVar = (defpackage.edc) obj;
        return s() == edcVar.s() && A() == edcVar.A() && j$.util.Objects.equals(d(), edcVar.d()) && j$.util.Objects.equals(w(), edcVar.w()) && j$.util.Objects.equals(B(), edcVar.B());
    }

    public java.util.List<android.graphics.Rect> f(int i2) {
        return java.util.Collections.EMPTY_LIST;
    }

    public java.util.List<android.graphics.Rect> g(int i2) {
        return java.util.Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(s()), java.lang.Boolean.valueOf(A()), d(), w(), B()});
    }

    public boolean s() {
        return false;
    }

    public boolean u(int i2) {
        return true;
    }

    public defpackage.dvl w() {
        return defpackage.dvl.a;
    }

    public defpackage.edf x() {
        return this.j;
    }

    public defpackage.edf y() {
        return this.j;
    }

    public void k() {
    }

    public void h(android.view.View view) {
    }

    public void i(defpackage.edf edfVar) {
    }

    public void j(android.view.View view) {
    }

    public void l(defpackage.eai eaiVar) {
    }

    public void m(defpackage.dvl[] dvlVarArr) {
    }

    public void n(defpackage.dvl dvlVar) {
    }

    public void o(defpackage.edf edfVar) {
    }

    public void p(int i2) {
    }

    public void q(android.graphics.Rect[][] rectArr) {
    }

    public void r(android.graphics.Rect[][] rectArr) {
    }

    public void z(defpackage.dvl dvlVar) {
    }
}
