package defpackage;

/* loaded from: classes.dex */
public final class bkh {
    public final int a;
    public final int b;
    public final int c;
    public final dft d;

    public bkh(int i, int i2, int i3, dft dftVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = dftVar;
    }

    public final bkj a(int i) {
        return new bkj(czz.aC(this.d, i), i);
    }

    public final String b() {
        return this.d.a.a.b;
    }

    public final int c() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            return 2;
        }
        return i > i2 ? 1 : 3;
    }

    public final String toString() {
        dft dftVar = this.d;
        int i = this.b;
        int i2 = this.a;
        return "SelectionInfo(id=1, range=(" + i2 + "-" + ((Object) dka.e(czz.aC(dftVar, i2))) + "," + i + "-" + ((Object) dka.e(czz.aC(dftVar, i))) + "), prevOffset=" + this.c + ")";
    }
}
