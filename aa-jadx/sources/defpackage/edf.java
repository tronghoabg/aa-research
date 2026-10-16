package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class edf {
    public static final defpackage.edf a;
    public final defpackage.edc b;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            a = defpackage.eda.h;
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            a = defpackage.ecy.g;
        } else {
            a = defpackage.edc.i;
        }
    }

    public edf(defpackage.edf edfVar) {
        if (edfVar == null) {
            this.b = new defpackage.edc(this);
            return;
        }
        defpackage.edc edcVar = edfVar.b;
        if (android.os.Build.VERSION.SDK_INT >= 35 && (edcVar instanceof defpackage.edb)) {
            this.b = new defpackage.edb(this, (defpackage.edb) edcVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 34 && (edcVar instanceof defpackage.eda)) {
            this.b = new defpackage.eda(this, (defpackage.eda) edcVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 31 && (edcVar instanceof defpackage.ecz)) {
            this.b = new defpackage.ecz(this, (defpackage.ecz) edcVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 30 && (edcVar instanceof defpackage.ecy)) {
            this.b = new defpackage.ecy(this, (defpackage.ecy) edcVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 29 && (edcVar instanceof defpackage.ecx)) {
            this.b = new defpackage.ecx(this, (defpackage.ecx) edcVar);
        } else if (edcVar instanceof defpackage.ecw) {
            this.b = new defpackage.ecw(this, (defpackage.ecw) edcVar);
        } else if (edcVar instanceof defpackage.ecv) {
            this.b = new defpackage.ecv(this, (defpackage.ecv) edcVar);
        } else if (edcVar instanceof defpackage.ecu) {
            this.b = new defpackage.ecu(this, (defpackage.ecu) edcVar);
        } else {
            this.b = new defpackage.edc(this);
        }
        edcVar.i(this);
    }

    public static defpackage.dvl j(defpackage.dvl dvlVar, int i, int i2, int i3, int i4) {
        int iMax = java.lang.Math.max(0, dvlVar.b - i);
        int iMax2 = java.lang.Math.max(0, dvlVar.c - i2);
        int iMax3 = java.lang.Math.max(0, dvlVar.d - i3);
        int iMax4 = java.lang.Math.max(0, dvlVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? dvlVar : defpackage.dvl.e(iMax, iMax2, iMax3, iMax4);
    }

    public static defpackage.edf q(android.view.WindowInsets windowInsets, android.view.View view) {
        windowInsets.getClass();
        defpackage.edf edfVar = new defpackage.edf(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = defpackage.ebt.a;
            edfVar.u(defpackage.ebm.a(view));
            edfVar.r(view.getRootView());
            edfVar.v(view.getWindowSystemUiVisibility());
        }
        return edfVar;
    }

    @java.lang.Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @java.lang.Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @java.lang.Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @java.lang.Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final android.view.WindowInsets e() {
        defpackage.edc edcVar = this.b;
        if (edcVar instanceof defpackage.ecu) {
            return ((defpackage.ecu) edcVar).a;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.edf) {
            return j$.util.Objects.equals(this.b, ((defpackage.edf) obj).b);
        }
        return false;
    }

    public final defpackage.dvl f(int i) {
        return this.b.a(i);
    }

    public final defpackage.dvl g(int i) {
        return this.b.c(i);
    }

    @java.lang.Deprecated
    public final defpackage.dvl h() {
        return this.b.w();
    }

    public final int hashCode() {
        defpackage.edc edcVar = this.b;
        if (edcVar == null) {
            return 0;
        }
        return edcVar.hashCode();
    }

    @java.lang.Deprecated
    public final defpackage.dvl i() {
        return this.b.d();
    }

    public final defpackage.eag k() {
        return this.b.B();
    }

    @java.lang.Deprecated
    public final defpackage.edf l() {
        return this.b.C();
    }

    @java.lang.Deprecated
    public final defpackage.edf m() {
        return this.b.x();
    }

    @java.lang.Deprecated
    public final defpackage.edf n() {
        return this.b.y();
    }

    public final defpackage.edf o(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    @java.lang.Deprecated
    public final defpackage.edf p(int i, int i2, int i3, int i4) {
        defpackage.ect ecnVar;
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            ecnVar = new defpackage.ecs(this);
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            ecnVar = new defpackage.ecr(this);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            ecnVar = new defpackage.ecq(this);
        } else if (android.os.Build.VERSION.SDK_INT >= 31) {
            ecnVar = new defpackage.ecp(this);
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            ecnVar = new defpackage.eco(this);
        } else {
            ecnVar = android.os.Build.VERSION.SDK_INT >= 29 ? new defpackage.ecn(this) : new defpackage.ecm(this);
        }
        ecnVar.c(defpackage.dvl.e(i, i2, i3, i4));
        return ecnVar.a();
    }

    final void r(android.view.View view) {
        defpackage.edc edcVar = this.b;
        edcVar.h(view);
        edcVar.j(view);
        edcVar.k();
    }

    final void s(defpackage.eai eaiVar) {
        this.b.l(eaiVar);
    }

    final void t(defpackage.dvl[] dvlVarArr) {
        this.b.m(dvlVarArr);
    }

    final void u(defpackage.edf edfVar) {
        this.b.o(edfVar);
    }

    final void v(int i) {
        this.b.p(i);
    }

    final void w(android.graphics.Rect[][] rectArr) {
        this.b.q(rectArr);
    }

    final void x(android.graphics.Rect[][] rectArr) {
        this.b.r(rectArr);
    }

    public final boolean y() {
        return this.b.A();
    }

    public final boolean z(int i) {
        return this.b.u(i);
    }

    public edf(android.view.WindowInsets windowInsets) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.b = new defpackage.edb(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            this.b = new defpackage.eda(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.b = new defpackage.ecz(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.b = new defpackage.ecy(this, windowInsets);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.b = new defpackage.ecx(this, windowInsets);
        } else {
            this.b = new defpackage.ecw(this, windowInsets);
        }
    }
}
