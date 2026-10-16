package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cux implements defpackage.cuc {
    public int a;
    public int b;
    public long c = 0;
    public long d = defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public long e = 0;

    private final void dV() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = defpackage.afqt.g((int) j, defpackage.dlm.d(j2), defpackage.dlm.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        int iG = defpackage.afqt.g((int) j3, defpackage.dlm.c(j4), defpackage.dlm.a(j4));
        this.b = iG;
        int i = this.a;
        long j5 = this.c;
        this.e = (((long) ((i - ((int) (j5 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iG - ((int) (j5 & 4294967295L))) / 2)));
    }

    protected final void A(long j) {
        if (this.d == j) {
            return;
        }
        this.d = j;
        dV();
    }

    public abstract void dD(long j, float f, defpackage.affc affcVar);

    @Override // defpackage.cuc
    public int dK() {
        return (int) (this.c & 4294967295L);
    }

    public /* synthetic */ java.lang.Object g() {
        return null;
    }

    public int x() {
        return (int) (this.c >> 32);
    }

    public void y(long j, float f, defpackage.cmq cmqVar) {
        dD(j, f, null);
    }

    protected final void z(long j) {
        if (this.c == j) {
            return;
        }
        this.c = j;
        dV();
    }
}
