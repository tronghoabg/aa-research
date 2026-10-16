package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aedi {
    public final defpackage.ajny a;
    defpackage.aedg[] b;
    int c;
    public int d;
    private int e;

    public aedi(defpackage.ajny ajnyVar) {
        defpackage.aedg[] aedgVarArr = new defpackage.aedg[8];
        this.b = aedgVarArr;
        this.d = aedgVarArr.length - 1;
        this.a = ajnyVar;
    }

    public final void a(defpackage.aedg aedgVar) {
        int i;
        int i2 = aedgVar.h;
        if (i2 > 4096) {
            java.util.Arrays.fill(this.b, (java.lang.Object) null);
            this.d = this.b.length - 1;
            this.c = 0;
            this.e = 0;
            return;
        }
        int i3 = (this.e + i2) - 4096;
        if (i3 > 0) {
            int length = this.b.length - 1;
            int i4 = 0;
            while (true) {
                i = this.d;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = this.b[length].h;
                i3 -= i5;
                this.e -= i5;
                this.c--;
                i4++;
                length--;
            }
            defpackage.aedg[] aedgVarArr = this.b;
            int i6 = i + 1;
            java.lang.System.arraycopy(aedgVarArr, i6, aedgVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        defpackage.aedg[] aedgVarArr2 = this.b;
        int length2 = aedgVarArr2.length;
        if (i7 > length2) {
            defpackage.aedg[] aedgVarArr3 = new defpackage.aedg[length2 + length2];
            java.lang.System.arraycopy(aedgVarArr2, 0, aedgVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = aedgVarArr3;
            aedgVarArr2 = aedgVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        aedgVarArr2[i8] = aedgVar;
        this.c++;
        this.e += i2;
    }

    final void b(defpackage.ajob ajobVar) throws java.io.IOException {
        c(ajobVar.c(), 127, 0);
        this.a.K(ajobVar);
    }

    final void c(int i, int i2, int i3) throws java.io.IOException {
        defpackage.ajny ajnyVar = this.a;
        if (i < i2) {
            ajnyVar.N(i | i3);
            return;
        }
        ajnyVar.N(i3 | i2);
        int i4 = i - i2;
        if (i4 > 268435455) {
            throw new java.io.IOException("Varint would overflow reader");
        }
        while (i4 >= 128) {
            ajnyVar.N(128 | (i4 & 127));
            i4 >>>= 7;
        }
        ajnyVar.N(i4);
    }
}
