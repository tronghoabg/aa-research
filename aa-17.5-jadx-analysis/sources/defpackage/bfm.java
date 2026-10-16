package defpackage;

/* loaded from: classes.dex */
final class bfm implements djn {
    private final djn a;
    private final int b;
    private final int c;

    public bfm(djn djnVar, int i, int i2) {
        this.a = djnVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.djn
    public final int a(int i) {
        int iA = this.a.a(i);
        if (i >= 0 && i <= this.b) {
            bfn.a(iA, this.c, i);
        }
        return iA;
    }

    @Override // defpackage.djn
    public final int b(int i) {
        int iB = this.a.b(i);
        if (i >= 0 && i <= this.c) {
            bfn.b(iB, this.b, i);
        }
        return iB;
    }
}
