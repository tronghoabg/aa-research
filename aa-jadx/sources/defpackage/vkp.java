package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vkp {
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public boolean k = true;
    public boolean l = false;
    public double m = 0.0d;
    public final double a = 100.0d;
    public final double b = 18.0d;
    public final java.util.concurrent.CopyOnWriteArrayList c = new java.util.concurrent.CopyOnWriteArrayList();

    public static boolean d(double d, double d2, double d3) {
        if (d2 < d3) {
            return d > d3;
        }
        return d < d3;
    }

    public final boolean a() {
        return java.lang.Math.abs(this.g) <= 0.005d && java.lang.Math.abs(this.j - this.f) <= 0.005d;
    }

    public final void b(double d) {
        if (d != this.j) {
            this.j = d;
            this.i = this.f;
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((defpackage.vjx) it.next()).f(this);
            }
        }
    }

    public final void c(double d) {
        if (d != this.f) {
            this.f = d;
            this.i = d;
            for (defpackage.vjx vjxVar : this.c) {
                vjxVar.f(this);
                vjxVar.g(d);
            }
        }
    }

    public final void e(defpackage.vjx vjxVar) {
        this.c.add(vjxVar);
    }
}
