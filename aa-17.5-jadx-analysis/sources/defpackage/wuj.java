package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class wuj {
    public wtz a;
    public wtz b;
    public wtz c;
    public wtz d;
    public wub e;
    public wub f;
    public wub g;
    public wub h;
    public wub i;
    public wub j;
    public wub k;
    public wub l;

    public wuj(wuk wukVar) {
        this.i = new wuh();
        this.j = new wuh();
        this.k = new wuh();
        this.l = new wuh();
        this.a = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.b = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.c = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.d = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.e = new wub();
        this.f = new wub();
        this.g = new wub();
        this.h = new wub();
        this.i = wukVar.j;
        this.j = wukVar.k;
        this.k = wukVar.l;
        this.l = wukVar.m;
        this.a = wukVar.b;
        this.b = wukVar.c;
        this.c = wukVar.d;
        this.d = wukVar.e;
        this.e = wukVar.f;
        this.f = wukVar.g;
        this.g = wukVar.h;
        this.h = wukVar.i;
    }

    private static void l(wub wubVar) {
        if (wubVar instanceof wuh) {
            float f = ((wuh) wubVar).a;
        } else if (wubVar instanceof wua) {
            float f2 = ((wua) wubVar).a;
        }
    }

    public final void a(float f) {
        this.d = new wtw(f);
    }

    public final void b(float f) {
        this.c = new wtw(f);
    }

    public final void c(float f) {
        this.a = new wtw(f);
    }

    public final void d(float f) {
        this.b = new wtw(f);
    }

    public final void e(float f) {
        c(f);
        d(f);
        b(f);
        a(f);
    }

    public final void f(wtz wtzVar) {
        this.a = wtzVar;
        this.b = wtzVar;
        this.c = wtzVar;
        this.d = wtzVar;
    }

    public final void g(wub wubVar) {
        this.l = wubVar;
        l(wubVar);
    }

    public final void h(wub wubVar) {
        this.k = wubVar;
        l(wubVar);
    }

    public final void i(wub wubVar) {
        this.i = wubVar;
        l(wubVar);
    }

    public final void j(wub wubVar) {
        this.j = wubVar;
        l(wubVar);
    }

    public final void k(wub wubVar) {
        i(wubVar);
        j(wubVar);
        h(wubVar);
        g(wubVar);
    }

    public wuj() {
        this.i = new wuh();
        this.j = new wuh();
        this.k = new wuh();
        this.l = new wuh();
        this.a = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.b = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.c = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.d = new wtw(BitmapDescriptorFactory.HUE_RED);
        this.e = new wub();
        this.f = new wub();
        this.g = new wub();
        this.h = new wub();
    }
}
