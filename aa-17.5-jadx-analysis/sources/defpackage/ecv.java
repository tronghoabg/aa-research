package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ecv {
    static final ecy i;
    final ecy j;

    static {
        i = (Build.VERSION.SDK_INT >= 36 ? new ecl() : Build.VERSION.SDK_INT >= 35 ? new eck() : Build.VERSION.SDK_INT >= 34 ? new ecj() : Build.VERSION.SDK_INT >= 31 ? new eci() : Build.VERSION.SDK_INT >= 30 ? new ech() : Build.VERSION.SDK_INT >= 29 ? new ecg() : new ecf()).a().l().m().n();
    }

    public ecv(ecy ecyVar) {
        this.j = ecyVar;
    }

    public boolean A() {
        return false;
    }

    public dzz B() {
        return null;
    }

    public ecy C() {
        return this.j;
    }

    public dve D() {
        return d();
    }

    public dve E() {
        return d();
    }

    public dve F() {
        return d();
    }

    public dve a(int i2) {
        return dve.a;
    }

    public dve c(int i2) {
        if ((i2 & 8) == 0) {
            return dve.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public dve d() {
        return dve.a;
    }

    public ecy e(int i2, int i3, int i4, int i5) {
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecv)) {
            return false;
        }
        ecv ecvVar = (ecv) obj;
        return s() == ecvVar.s() && A() == ecvVar.A() && Objects.equals(d(), ecvVar.d()) && Objects.equals(w(), ecvVar.w()) && Objects.equals(B(), ecvVar.B());
    }

    public List<Rect> f(int i2) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i2) {
        return Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(A()), d(), w(), B());
    }

    public boolean s() {
        return false;
    }

    public boolean u(int i2) {
        return true;
    }

    public dve w() {
        return dve.a;
    }

    public ecy x() {
        return this.j;
    }

    public ecy y() {
        return this.j;
    }

    public void k() {
    }

    public void h(View view) {
    }

    public void i(ecy ecyVar) {
    }

    public void j(View view) {
    }

    public void l(eab eabVar) {
    }

    public void m(dve[] dveVarArr) {
    }

    public void n(dve dveVar) {
    }

    public void o(ecy ecyVar) {
    }

    public void p(int i2) {
    }

    public void q(Rect[][] rectArr) {
    }

    public void r(Rect[][] rectArr) {
    }

    public void z(dve dveVar) {
    }
}
