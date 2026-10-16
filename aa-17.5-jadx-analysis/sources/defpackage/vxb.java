package defpackage;

/* loaded from: classes.dex */
public final class vxb {
    public int b;
    private final vse d;
    private static final tmb c = new tme();
    public static final vxb a = new vxb();

    public vxb(long j, long j2) {
        woy.U(j2 >= j, "End time %s is before start time %s.", j2, j);
        this.d = new vse(new vsf(j, j), new vsf(j2, j2));
        this.b = 0;
    }

    public static boolean d(vxb vxbVar) {
        return vxbVar == null || vxbVar == a;
    }

    final long a() {
        vse vseVar = this.d;
        return vseVar.b.a - vseVar.a.a;
    }

    final long b() {
        vse vseVar = this.d;
        return vseVar.b.b - vseVar.a.b;
    }

    public final void c() {
        this.d.b = vsf.a(c);
    }

    public vxb() {
        this.d = new vse(c);
    }
}
