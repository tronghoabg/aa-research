package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class qfg extends qgz {
    private static final yph a = yph.c("ADU.BWStatusBarCtrl");
    private final CarRegionId b;
    private final qhe c;
    private qtu d;
    private boolean e = true;
    private boolean f = true;
    private boolean g;

    public qfg(CarRegionId carRegionId, qhe qheVar) {
        this.b = carRegionId;
        this.c = qheVar;
    }

    @Override // defpackage.qgz
    public final void a(qtu qtuVar) {
        this.d = qtuVar;
        p(this.e, this.f);
    }

    @Override // defpackage.qgz
    public final void b() {
        this.d = null;
    }

    @Override // defpackage.ovz
    public final void m(int i) {
        this.c.b = i;
    }

    @Override // defpackage.ovz
    public final void o(boolean z) {
        this.g = z;
    }

    @Override // defpackage.ovz
    public final void p(boolean z, boolean z2) {
        ((ype) a.l().ai(7041)).Q("setStatusBarBackgroundVisibility() hasBackground: %b, opaque: %b", z, z2);
        if (this.d != null) {
            try {
                if (!this.g && z()) {
                    this.d.i(z, z2);
                }
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7042)).u("Error setting status bar background");
            }
        }
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.ovz
    public final boolean u() {
        return false;
    }

    @Override // defpackage.qgz
    public final boolean y() {
        return this.g;
    }

    @Override // defpackage.qgz
    public final boolean z() {
        return this.b.a();
    }

    @Override // defpackage.qgz
    public final void A() {
    }

    @Override // defpackage.qgz
    public final void B() {
    }

    @Override // defpackage.ovz
    @Deprecated
    public final void e() {
    }

    @Override // defpackage.ovz
    @Deprecated
    public final void f() {
    }

    @Override // defpackage.ovz
    @Deprecated
    public final void g() {
    }

    @Override // defpackage.ovz
    @Deprecated
    public final void h() {
    }

    @Override // defpackage.ovz
    public final void i() {
    }

    @Override // defpackage.ovz
    public final void j() {
    }

    @Override // defpackage.ovz
    @Deprecated
    public final void r() {
    }

    @Override // defpackage.ovz
    public final void s() {
    }

    @Override // defpackage.ovz
    public final void t() {
    }

    @Override // defpackage.qgz
    public final void v() {
    }

    @Override // defpackage.qgz
    public final void w() {
    }

    @Override // defpackage.qgz
    public final void c(Bundle bundle) {
    }

    @Override // defpackage.qgz
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.ovz
    public final void k(float f) {
    }

    @Override // defpackage.ovz
    public final void l(int i) {
    }

    @Override // defpackage.ovz
    public final void n(int i) {
    }

    @Override // defpackage.ovz
    public final void q(CharSequence charSequence) {
    }

    @Override // defpackage.qgz
    public final void x(boolean z) {
    }
}
