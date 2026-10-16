package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wl {
    final java.util.Set a;
    final java.util.Set b;
    final java.util.Set c;
    public int d;
    int e;
    public int f;
    boolean g;
    boolean h;
    public boolean i;
    boolean j;
    defpackage.wp k;

    public wl(defpackage.wm wmVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.a = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        this.b = hashSet2;
        java.util.HashSet hashSet3 = new java.util.HashSet();
        this.c = hashSet3;
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = defpackage.wp.b;
        wmVar.getClass();
        this.d = wmVar.h;
        this.e = wmVar.i;
        this.f = wmVar.j;
        this.k = wmVar.o;
        hashSet.addAll(wmVar.p);
        hashSet2.addAll(wmVar.q);
        hashSet3.addAll(wmVar.r);
        this.g = wmVar.k;
        this.h = wmVar.l;
        this.i = wmVar.m;
        this.j = wmVar.n;
    }

    public final void a(int i) {
        this.c.add(java.lang.Integer.valueOf(i));
    }

    public final void b() {
        this.e = 1;
    }

    public final void c() {
        this.g = true;
    }

    public final void d() {
        this.j = true;
    }

    public wl() {
        this.a = new java.util.HashSet();
        this.b = new java.util.HashSet();
        this.c = new java.util.HashSet();
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = defpackage.wp.b;
    }
}
