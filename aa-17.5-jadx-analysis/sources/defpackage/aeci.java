package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class aeci {
    public final ajmy a;
    aecg[] b = new aecg[8];
    int c;
    public int d;
    private int e;

    public aeci(ajmy ajmyVar) {
        this.d = r0.length - 1;
        this.a = ajmyVar;
    }

    public final void a(aecg aecgVar) {
        int i;
        int i2 = aecgVar.h;
        if (i2 > 4096) {
            Arrays.fill(this.b, (Object) null);
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
            aecg[] aecgVarArr = this.b;
            int i6 = i + 1;
            System.arraycopy(aecgVarArr, i6, aecgVarArr, i6 + i4, this.c);
            this.d += i4;
        }
        int i7 = this.c + 1;
        aecg[] aecgVarArr2 = this.b;
        int length2 = aecgVarArr2.length;
        if (i7 > length2) {
            aecg[] aecgVarArr3 = new aecg[length2 + length2];
            System.arraycopy(aecgVarArr2, 0, aecgVarArr3, length2, length2);
            this.d = this.b.length - 1;
            this.b = aecgVarArr3;
            aecgVarArr2 = aecgVarArr3;
        }
        int i8 = this.d;
        this.d = i8 - 1;
        aecgVarArr2[i8] = aecgVar;
        this.c++;
        this.e += i2;
    }

    final void b(ajnb ajnbVar) throws IOException {
        c(ajnbVar.c(), 127, 0);
        this.a.K(ajnbVar);
    }

    final void c(int i, int i2, int i3) throws IOException {
        ajmy ajmyVar = this.a;
        if (i < i2) {
            ajmyVar.N(i | i3);
            return;
        }
        ajmyVar.N(i3 | i2);
        int i4 = i - i2;
        if (i4 > 268435455) {
            throw new IOException("Varint would overflow reader");
        }
        while (i4 >= 128) {
            ajmyVar.N(128 | (i4 & 127));
            i4 >>>= 7;
        }
        ajmyVar.N(i4);
    }
}
