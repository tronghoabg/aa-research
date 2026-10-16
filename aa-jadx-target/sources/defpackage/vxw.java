package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxw {
    public int b;
    private final defpackage.vta d;
    private static final defpackage.tmy c = new defpackage.tnc();
    public static final defpackage.vxw a = new defpackage.vxw();

    public vxw(long j, long j2) {
        defpackage.ysr.be(j2 >= j, "End time %s is before start time %s.", j2, j);
        this.d = new defpackage.vta(new defpackage.vtb(j, j), new defpackage.vtb(j2, j2));
        this.b = 0;
    }

    public static boolean d(defpackage.vxw vxwVar) {
        return vxwVar == null || vxwVar == a;
    }

    final long a() {
        defpackage.vta vtaVar = this.d;
        return vtaVar.b.a - vtaVar.a.a;
    }

    final long b() {
        defpackage.vta vtaVar = this.d;
        return vtaVar.b.b - vtaVar.a.b;
    }

    public final void c() {
        this.d.b = defpackage.vtb.a(c);
    }

    public vxw() {
        this.d = new defpackage.vta(c);
    }
}
