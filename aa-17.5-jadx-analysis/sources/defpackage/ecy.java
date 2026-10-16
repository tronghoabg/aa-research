package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class ecy {
    public static final ecy a;
    public final ecv b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = ect.h;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = ecr.g;
        } else {
            a = ecv.i;
        }
    }

    public ecy(ecy ecyVar) {
        if (ecyVar == null) {
            this.b = new ecv(this);
            return;
        }
        ecv ecvVar = ecyVar.b;
        if (Build.VERSION.SDK_INT >= 35 && (ecvVar instanceof ecu)) {
            this.b = new ecu(this, (ecu) ecvVar);
        } else if (Build.VERSION.SDK_INT >= 34 && (ecvVar instanceof ect)) {
            this.b = new ect(this, (ect) ecvVar);
        } else if (Build.VERSION.SDK_INT >= 31 && (ecvVar instanceof ecs)) {
            this.b = new ecs(this, (ecs) ecvVar);
        } else if (Build.VERSION.SDK_INT >= 30 && (ecvVar instanceof ecr)) {
            this.b = new ecr(this, (ecr) ecvVar);
        } else if (Build.VERSION.SDK_INT >= 29 && (ecvVar instanceof ecq)) {
            this.b = new ecq(this, (ecq) ecvVar);
        } else if (ecvVar instanceof ecp) {
            this.b = new ecp(this, (ecp) ecvVar);
        } else if (ecvVar instanceof eco) {
            this.b = new eco(this, (eco) ecvVar);
        } else if (ecvVar instanceof ecn) {
            this.b = new ecn(this, (ecn) ecvVar);
        } else {
            this.b = new ecv(this);
        }
        ecvVar.i(this);
    }

    public static dve j(dve dveVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, dveVar.b - i);
        int iMax2 = Math.max(0, dveVar.c - i2);
        int iMax3 = Math.max(0, dveVar.d - i3);
        int iMax4 = Math.max(0, dveVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? dveVar : dve.e(iMax, iMax2, iMax3, iMax4);
    }

    public static ecy q(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        ecy ecyVar = new ecy(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = ebm.a;
            ecyVar.u(ebf.a(view));
            ecyVar.r(view.getRootView());
            ecyVar.v(view.getWindowSystemUiVisibility());
        }
        return ecyVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        ecv ecvVar = this.b;
        if (ecvVar instanceof ecn) {
            return ((ecn) ecvVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ecy) {
            return Objects.equals(this.b, ((ecy) obj).b);
        }
        return false;
    }

    public final dve f(int i) {
        return this.b.a(i);
    }

    public final dve g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final dve h() {
        return this.b.w();
    }

    public final int hashCode() {
        ecv ecvVar = this.b;
        if (ecvVar == null) {
            return 0;
        }
        return ecvVar.hashCode();
    }

    @Deprecated
    public final dve i() {
        return this.b.d();
    }

    public final dzz k() {
        return this.b.B();
    }

    @Deprecated
    public final ecy l() {
        return this.b.C();
    }

    @Deprecated
    public final ecy m() {
        return this.b.x();
    }

    @Deprecated
    public final ecy n() {
        return this.b.y();
    }

    public final ecy o(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    @Deprecated
    public final ecy p(int i, int i2, int i3, int i4) {
        ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl(this) : Build.VERSION.SDK_INT >= 35 ? new eck(this) : Build.VERSION.SDK_INT >= 34 ? new ecj(this) : Build.VERSION.SDK_INT >= 31 ? new eci(this) : Build.VERSION.SDK_INT >= 30 ? new ech(this) : Build.VERSION.SDK_INT >= 29 ? new ecg(this) : new ecf(this);
        eclVar.c(dve.e(i, i2, i3, i4));
        return eclVar.a();
    }

    final void r(View view) {
        ecv ecvVar = this.b;
        ecvVar.h(view);
        ecvVar.j(view);
        ecvVar.k();
    }

    final void s(eab eabVar) {
        this.b.l(eabVar);
    }

    final void t(dve[] dveVarArr) {
        this.b.m(dveVarArr);
    }

    final void u(ecy ecyVar) {
        this.b.o(ecyVar);
    }

    final void v(int i) {
        this.b.p(i);
    }

    final void w(Rect[][] rectArr) {
        this.b.q(rectArr);
    }

    final void x(Rect[][] rectArr) {
        this.b.r(rectArr);
    }

    public final boolean y() {
        return this.b.A();
    }

    public final boolean z(int i) {
        return this.b.u(i);
    }

    public ecy(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.b = new ecu(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new ect(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.b = new ecs(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new ecr(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.b = new ecq(this, windowInsets);
        } else {
            this.b = new ecp(this, windowInsets);
        }
    }
}
