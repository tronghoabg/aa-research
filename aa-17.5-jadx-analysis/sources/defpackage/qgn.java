package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gearhead.appdecor.StatusBarView;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class qgn extends qgz {
    private static final yph a = yph.c("ADU.StatusBarController");
    private final qhb b;
    private final StatusBarView c;
    private final View d;
    private final CarRegionId e;
    private qtu f;
    private boolean g;
    private boolean h;
    private boolean i = true;
    private boolean j = true;
    private boolean k = true;
    private boolean l = true;
    private boolean m;

    public qgn(qhb qhbVar, StatusBarView statusBarView, View view, CarRegionId carRegionId) {
        this.b = qhbVar;
        this.c = statusBarView;
        this.d = view;
        this.e = carRegionId;
    }

    private final void C() throws Resources.NotFoundException {
        if (!this.j || this.h || this.f == null) {
            StatusBarView statusBarView = this.c;
            ((ype) StatusBarView.a.l().ai((char) 7232)).u("hideMicButton");
            statusBarView.n = false;
            statusBarView.f();
            return;
        }
        StatusBarView statusBarView2 = this.c;
        ((ype) StatusBarView.a.l().ai((char) 7239)).u("showMicButton");
        statusBarView2.n = true;
        statusBarView2.f();
    }

    private final void D() throws Resources.NotFoundException {
        boolean z = this.i;
        StatusBarView statusBarView = this.c;
        if (z) {
            statusBarView.e();
        } else {
            statusBarView.a();
        }
    }

    @Override // defpackage.qgz
    public final void B() {
        this.b.a();
    }

    @Override // defpackage.qgz
    public final void a(qtu qtuVar) throws Resources.NotFoundException {
        this.f = qtuVar;
        try {
            qtuVar.getClass();
            Bundle bundleE = qtuVar.e();
            if (bundleE == null) {
                ((ype) ((ype) a.h()).ai((char) 7190)).u("appDecorService.getConfigParams() returned null");
            } else {
                if (bundleE.getBoolean("hide_mic_button", false)) {
                    this.h = true;
                }
                StatusBarView statusBarView = this.c;
                statusBarView.o = bundleE.getBoolean("status_bar_buttons_focusable", false);
                statusBarView.f();
            }
        } catch (RemoteException | RuntimeException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7191)).u("appDecorService.getConfigParams() threw an exception");
        }
        p(this.k, this.l);
        C();
    }

    @Override // defpackage.qgz
    public final void b() {
        this.f = null;
    }

    @Override // defpackage.qgz
    public final void c(Bundle bundle) throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7197)).y("onRestoreInstanceState %s", bundle);
        this.g = bundle.getBoolean("com.google.android.gearhead.appdecor.StatusBarController.BLOCK_MIC_BUTTON_FOCUSABILITY", this.g);
        this.h = bundle.getBoolean("com.google.android.gearhead.appdecor.StatusBarController.ALWAYS_HIDE_MIC_BUTTON", this.h);
        this.i = bundle.getBoolean("com.google.android.gearhead.appdecor.StatusBarController.REQUEST_SHOW_TITLE", this.i);
        this.j = bundle.getBoolean("com.google.android.gearhead.appdecor.StatusBarController.REQUEST_SHOW_MIC_BUTTON", this.j);
        D();
        C();
    }

    @Override // defpackage.qgz
    public final void d(Bundle bundle) {
        ((ype) a.l().ai((char) 7198)).y("onSaveInstanceState %s", bundle);
        bundle.putBoolean("com.google.android.gearhead.appdecor.StatusBarController.BLOCK_MIC_BUTTON_FOCUSABILITY", this.g);
        bundle.putBoolean("com.google.android.gearhead.appdecor.StatusBarController.ALWAYS_HIDE_MIC_BUTTON", this.h);
        bundle.putBoolean("com.google.android.gearhead.appdecor.StatusBarController.REQUEST_SHOW_TITLE", this.i);
        bundle.putBoolean("com.google.android.gearhead.appdecor.StatusBarController.REQUEST_SHOW_MIC_BUTTON", this.j);
    }

    @Override // defpackage.ovz
    @Deprecated
    public final void e() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7192)).u("hideAppHeaderDeprecated");
        j();
        i();
    }

    @Override // defpackage.ovz
    public final void i() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7193)).u("hideMicButton");
        this.j = false;
        C();
    }

    @Override // defpackage.ovz
    public final void j() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7194)).u("hideTitle");
        this.i = false;
        D();
    }

    @Override // defpackage.ovz
    public final void k(float f) {
        ((ype) a.l().ai((char) 7199)).u("setAppBarAlpha");
        this.d.setAlpha(f);
    }

    @Override // defpackage.ovz
    public final void l(int i) {
        ((ype) a.l().ai((char) 7200)).u("setAppBarBackgroundColor");
        this.d.setBackgroundColor(i);
    }

    @Override // defpackage.ovz
    public final void m(int i) {
        this.c.j = i;
    }

    @Override // defpackage.ovz
    public final void n(int i) {
        ((ype) a.l().ai((char) 7201)).w("setDayNightStyle %d", i);
        this.b.b(i);
    }

    @Override // defpackage.ovz
    public final void o(boolean z) {
        this.m = z;
    }

    @Override // defpackage.ovz
    public final void p(boolean z, boolean z2) {
        ((ype) a.l().ai(7203)).Q("setStatusBarBackgroundVisibility() hasBackground: %b, opaque: %b", z, z2);
        if (this.f != null) {
            try {
                if (!this.m && z()) {
                    this.f.i(z, z2);
                }
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7204)).u("Error setting status bar background");
            }
        }
        this.k = z;
        this.l = z2;
    }

    @Override // defpackage.ovz
    public final void q(CharSequence charSequence) throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7205)).y("setTitle %s", charSequence);
        String string = charSequence == null ? null : charSequence.toString();
        StatusBarView statusBarView = this.c;
        ((ype) StatusBarView.a.l().ai((char) 7238)).y("setTitle %s", string);
        statusBarView.l = string;
        statusBarView.m = null;
        statusBarView.f();
    }

    @Override // defpackage.ovz
    @Deprecated
    public final void r() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7206)).u("showAppHeaderDeprecated");
        t();
        s();
    }

    @Override // defpackage.ovz
    public final void s() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7207)).u("showMicButton");
        this.j = true;
        C();
    }

    @Override // defpackage.ovz
    public final void t() throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7208)).u("showTitle");
        this.i = true;
        D();
    }

    @Override // defpackage.ovz
    public final boolean u() {
        ((ype) a.l().ai((char) 7195)).u("isTitleVisible");
        ((ype) StatusBarView.a.l().ai((char) 7234)).u("isTitleVisible");
        return this.c.k;
    }

    @Override // defpackage.qgz
    public final void x(boolean z) throws Resources.NotFoundException {
        ((ype) a.l().ai((char) 7202)).y("setMicButtonFocusabilityBlocked(%b)", Boolean.valueOf(z));
        this.g = z;
        StatusBarView statusBarView = this.c;
        statusBarView.p = z;
        statusBarView.f();
    }

    @Override // defpackage.qgz
    public final boolean y() {
        return this.m;
    }

    @Override // defpackage.qgz
    public final boolean z() {
        return this.e.a();
    }

    @Override // defpackage.qgz
    public final void A() {
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

    @Override // defpackage.qgz
    public final void v() {
    }

    @Override // defpackage.qgz
    public final void w() {
    }
}
