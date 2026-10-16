package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bfp implements defpackage.djv {
    private final defpackage.djv a;
    private final int b;
    private final int c;

    public bfp(defpackage.djv djvVar, int i, int i2) {
        this.a = djvVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.djv
    public final int a(int i) {
        int iA = this.a.a(i);
        if (i >= 0 && i <= this.b) {
            defpackage.bfq.a(iA, this.c, i);
        }
        return iA;
    }

    @Override // defpackage.djv
    public final int b(int i) {
        int iB = this.a.b(i);
        if (i >= 0 && i <= this.c) {
            defpackage.bfq.b(iB, this.b, i);
        }
        return iB;
    }
}
