package defpackage;

import android.os.Handler;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public abstract class nwk implements nsg {
    public static final yph f = yph.c("GH.HunPresenterBase");
    public static final nvs g = new nvs();
    private boolean b;
    public boolean i;
    public nwf k;
    protected final Handler h = new Handler();
    private Runnable a = new iqz(7);
    public nwr j = nwr.a;
    public final eqm l = new eqm(null);

    @Override // defpackage.nsg
    public final void a(qrn qrnVar, nso nsoVar) {
        if (!f()) {
            c();
        } else {
            ((ype) f.l().ai((char) 5496)).u("onLayoutChanged, removing HUN when it has attached");
            this.b = true;
        }
    }

    protected abstract void c();

    protected abstract void d();

    protected abstract boolean f();

    public boolean g() {
        throw null;
    }

    protected abstract boolean h();

    public final void i() {
        nwf nwfVar;
        if (!lbh.d().gN() || (nwfVar = this.k) == null) {
            return;
        }
        nwfVar.b(this.j);
        nwfVar.d.getClass();
        View view = nwfVar.b;
        view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        leh.a();
        view.animate().alpha(1.0f);
    }

    final void j(nwr nwrVar) {
        String str = nwrVar.b;
        this.j = nwrVar;
        if (true == nwr.a.equals(nwrVar)) {
            str = null;
        }
        this.l.m(str);
        k();
    }

    public final void k() {
        yph yphVar = f;
        ((ype) yphVar.l().ai(5499)).R("update viewTearingDown=%b view=%s model=%s", Boolean.valueOf(this.i), this.k, this.j);
        if (f()) {
            ((ype) yphVar.l().ai((char) 5510)).u("waiting for host to finish initialization");
            return;
        }
        if (this.b) {
            ((ype) yphVar.l().ai((char) 5509)).u("Removing host due to layout change");
            c();
            if (acxa.T()) {
                this.b = false;
                return;
            }
            return;
        }
        if (this.i) {
            ((ype) yphVar.l().ai((char) 5508)).u("waiting for view animate out to complete");
            return;
        }
        nwr nwrVar = nwr.a;
        if (nwrVar.equals(this.j)) {
            nwf nwfVar = this.k;
            if (nwfVar == null || nwrVar.equals(nwfVar.c)) {
                woy.Z(!f());
                d();
                return;
            } else {
                this.i = true;
                this.j = nwrVar;
                this.k.a(new nqw(this, 9));
                return;
            }
        }
        if (h()) {
            ((ype) yphVar.l().ai((char) 5506)).u("Host not initialized.");
            return;
        }
        nwf nwfVar2 = this.k;
        nwfVar2.getClass();
        nwr nwrVar2 = nwfVar2.c;
        if (this.j.equals(nwrVar2)) {
            return;
        }
        if (g()) {
            ((ype) yphVar.l().ai((char) 5504)).u("waiting for host recycle to complete");
            return;
        }
        nwr nwrVar3 = this.j;
        if (nwrVar3.b.equals(nwrVar2.b)) {
            this.k.b(nwrVar3);
        } else {
            Handler handler = this.h;
            handler.removeCallbacks(this.a);
            this.a = new nqw(nwrVar3, 11);
            if (nwrVar3.u != 2) {
                handler.postDelayed(this.a, acxa.h());
            }
            if (nwrVar.equals(nwrVar2)) {
                i();
            } else {
                this.k.a(new nqw(this, 10));
            }
        }
        mcd.J(this.j, yzy.nW);
    }
}
