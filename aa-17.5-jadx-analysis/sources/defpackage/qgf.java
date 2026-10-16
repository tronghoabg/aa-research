package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.widget.ImageView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.apps.auto.components.drawer.MotionFilteringDrawerLayout;
import com.google.android.gearhead.appdecor.CarUiEntry;
import com.google.android.gearhead.appdecor.DrawerContentLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qgf extends qga {
    private static final yph b = yph.c("ADU.DrawerController");
    public final DrawerContentLayout a;
    private final qhb c;
    private final DrawerLayout d;
    private final ImageView e;
    private final moi f;
    private boolean g;
    private int h;
    private boolean i = false;
    private ovf j;
    private qfn k;

    public qgf(qhb qhbVar, DrawerLayout drawerLayout, DrawerContentLayout drawerContentLayout, ImageView imageView, moi moiVar) {
        this.c = qhbVar;
        this.d = drawerLayout;
        this.a = drawerContentLayout;
        this.f = moiVar;
        this.e = imageView;
        imageView.setImageDrawable(moiVar);
        this.h = 0;
        drawerLayout.h(1);
        if (drawerLayout.f == null) {
            drawerLayout.f = new ArrayList();
        }
        drawerLayout.f.add(this);
    }

    private final void r() {
        ((ype) b.l().ai((char) 7122)).u("notifyDrawerOpened");
        try {
            this.j.g();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 7123)).u("Error notifying onDrawerOpened");
        }
    }

    private final void s() {
        ((ype) b.l().ai((char) 7124)).u("notifyDrawerOpening");
        try {
            this.j.h();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 7125)).u("Error notifying onDrawerOpening");
        }
        CarUiEntry carUiEntry = this.k.d;
        carUiEntry.searchController.m();
        carUiEntry.menuController.p();
        carUiEntry.statusBarController.A();
        carUiEntry.statusBarController.x(true);
        carUiEntry.interactionModerator.k(gsn.h, yzz.DRAWER);
        if (carUiEntry.isTouchpadNavEnabled()) {
            carUiEntry.carAppLayout.c(false);
        }
    }

    @Override // defpackage.elr
    public final void a(View view) {
        ((ype) b.l().ai((char) 7127)).u("onDrawerOpened");
        this.f.a(1.0f);
        this.d.h(0);
        view.requestFocus();
        r();
    }

    @Override // defpackage.elr
    public final void b(int i) {
        if (i == 0) {
            this.g = i();
        } else if (i == 2) {
            if (this.g) {
                ((ype) b.l().ai((char) 7120)).u("notifyDrawerClosing");
                try {
                    this.j.f();
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 7121)).u("Error notifying onDrawerClosing");
                }
                qfn qfnVar = this.k;
                lay layVar = qfnVar.a;
                if (layVar.d()) {
                    layVar.a();
                }
                CarUiEntry carUiEntry = qfnVar.d;
                carUiEntry.searchController.l();
                carUiEntry.statusBarController.A();
                carUiEntry.statusBarController.x(false);
                qfnVar.b.setVisibility(8);
                if (carUiEntry.isTouchpadNavEnabled()) {
                    carUiEntry.carAppLayout.c(true);
                }
                this.d.p();
            } else {
                s();
            }
        }
        this.h = i;
    }

    @Override // defpackage.elr
    public final void c() {
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 7126)).u("onDrawerClosed");
        this.f.a(BitmapDescriptorFactory.HUE_RED);
        this.d.h(1);
        ((ype) yphVar.l().ai((char) 7118)).u("notifyDrawerClosed");
        try {
            this.j.e();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 7119)).u("Error notifying onDrawerClosed");
        }
        CarUiEntry carUiEntry = this.k.d;
        carUiEntry.menuController.o();
        carUiEntry.interactionModerator.k(gsn.i, yzz.DRAWER);
    }

    @Override // defpackage.elr
    public final void d(float f) {
        this.f.a(f);
        qhb qhbVar = this.k.c;
        qhbVar.b = f;
        qhbVar.c(f);
    }

    @Override // defpackage.qga, defpackage.ovi
    public final void e() {
        int i = this.h;
        yph yphVar = b;
        boolean z = i == 0;
        ((ype) yphVar.l().ai((char) 7115)).y("closeDrawer isIdle: %b", Boolean.valueOf(z));
        if (z) {
            this.d.p();
        }
    }

    @Override // defpackage.ovi
    public final void f() {
        int i = this.h;
        yph yphVar = b;
        boolean z = i == 0;
        ((ype) yphVar.l().ai((char) 7130)).y("openDrawer isIdle: %b", Boolean.valueOf(z));
        if (z) {
            DrawerLayout drawerLayout = this.d;
            View viewC = drawerLayout.c(8388611);
            if (viewC == null) {
                throw new IllegalArgumentException("No drawer view found with gravity ".concat(String.valueOf(DrawerLayout.f(8388611))));
            }
            drawerLayout.v(viewC);
        }
    }

    @Override // defpackage.ovi
    public final void g(ovf ovfVar) {
        ((ype) b.l().ai((char) 7131)).y("setDrawerCallback %s", ovfVar);
        this.j = ovfVar;
    }

    @Override // defpackage.ovi
    public final void h(int i) {
        ((ype) b.l().ai((char) 7132)).w("setScrimColor %d", i);
        qhb qhbVar = this.c;
        qhbVar.c = mlq.U().O(qhbVar.a, i);
        this.d.k(i);
    }

    @Override // defpackage.ovi
    public final boolean i() {
        boolean zS = this.d.s();
        ((ype) b.l().ai((char) 7116)).y("isDrawerOpen %b", Boolean.valueOf(zS));
        return zS;
    }

    @Override // defpackage.qga, defpackage.ovi
    public final boolean j() {
        boolean zU = this.d.u();
        ((ype) b.l().ai((char) 7117)).y("isDrawerVisible %b", Boolean.valueOf(zU));
        return zU;
    }

    @Override // defpackage.qga
    public final void k() {
        if (this.i || mki.a == null) {
            return;
        }
        ebf.j().e(lbh.c().f() != null ? yzy.bB : yzy.bC);
        this.i = true;
    }

    @Override // defpackage.qga
    public final void l() {
        this.i = false;
    }

    @Override // defpackage.qga
    public final void m(Bundle bundle) {
        ((ype) b.l().ai((char) 7129)).y("onSaveInstanceState %s", bundle);
    }

    @Override // defpackage.qga
    public final void n() {
        if (i()) {
            d(1.0f);
        } else if (!j()) {
            d(BitmapDescriptorFactory.HUE_RED);
        }
        this.g = i();
    }

    @Override // defpackage.qga
    public final void o(Bundle bundle) {
        DrawerLayout drawerLayout = this.d;
        if (drawerLayout instanceof MotionFilteringDrawerLayout) {
            ((MotionFilteringDrawerLayout) drawerLayout).y(5.0f);
            if (bundle.getBoolean("status_bar_buttons_focusable")) {
                drawerLayout.setFocusable(false);
            }
        }
    }

    @Override // defpackage.qga
    public final void p(qfn qfnVar) {
        this.k = qfnVar;
    }

    @Override // defpackage.qga
    public final void q() {
        if (i()) {
            s();
            r();
            this.g = true;
            d(1.0f);
        }
    }
}
