package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajkr {
    public final ajna c;
    public int e;
    public int f;
    private int g;
    public int a = 4096;
    public final List b = new ArrayList();
    public ajkq[] d = new ajkq[8];

    public ajkr(ajoc ajocVar) {
        this.c = ahfm.b(ajocVar);
        this.g = r2.length - 1;
    }

    public static final boolean h(int i) {
        if (i < 0) {
            return false;
        }
        ajkq[] ajkqVarArr = ajkt.a;
        int length = ajkt.a.length;
        return i <= 60;
    }

    private final int i() throws IOException {
        byte bD = this.c.d();
        int i = ajiq.a;
        return bD & 255;
    }

    public final int a(int i) {
        return this.g + 1 + i;
    }

    public final int b(int i, int i2) throws IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int i5 = i();
            if ((i5 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (i5 & 127) << i4;
            i4 += 7;
        }
    }

    public final ajnb c(int i) throws IOException {
        if (h(i)) {
            ajkq[] ajkqVarArr = ajkt.a;
            return ajkt.a[i].g;
        }
        ajkq[] ajkqVarArr2 = ajkt.a;
        int length = ajkt.a.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            ajkq[] ajkqVarArr3 = this.d;
            if (iA < ajkqVarArr3.length) {
                ajkq ajkqVar = ajkqVarArr3[iA];
                ajkqVar.getClass();
                return ajkqVar.g;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final ajnb d() throws IOException {
        int i;
        int i2;
        int i3 = i();
        int i4 = i3 & 128;
        long jB = b(i3, 127);
        if (i4 != 128) {
            return this.c.s(jB);
        }
        ajmy ajmyVar = new ajmy();
        int[] iArr = ajlm.a;
        ajna ajnaVar = this.c;
        ajll ajllVar = ajlm.c;
        int i5 = 0;
        ajll ajllVar2 = ajllVar;
        long j = 0;
        int i6 = 0;
        while (j < jB) {
            byte bD = ajnaVar.d();
            int i7 = ajiq.a;
            int i8 = bD & 255;
            int i9 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i9 | i8;
                if (i6 >= 8) {
                    int i10 = i6 - 8;
                    Object obj = ajllVar2.c;
                    obj.getClass();
                    ajllVar2 = ((ajll[]) obj)[(i2 >>> i10) & 255];
                    ajllVar2.getClass();
                    if (ajllVar2.c == null) {
                        ajmyVar.N(ajllVar2.a);
                        i6 -= ajllVar2.b;
                        ajllVar2 = ajllVar;
                    } else {
                        i6 = i10;
                    }
                }
            }
            j++;
            i5 = i2;
        }
        while (i6 > 0) {
            Object obj2 = ajllVar2.c;
            obj2.getClass();
            ajll ajllVar3 = ((ajll[]) obj2)[(i5 << (8 - i6)) & 255];
            ajllVar3.getClass();
            if (ajllVar3.c != null || (i = ajllVar3.b) > i6) {
                break;
            }
            ajmyVar.N(ajllVar3.a);
            i6 -= i;
            ajllVar2 = ajllVar;
        }
        return ajmyVar.r();
    }

    public final void e() {
        ajkq[] ajkqVarArr = this.d;
        woy.cE(ajkqVarArr, null, 0, ajkqVarArr.length);
        this.g = this.d.length - 1;
        this.e = 0;
        this.f = 0;
    }

    public final void f(int i) {
        int i2;
        if (i > 0) {
            int length = this.d.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.g;
                if (length < i2 || i <= 0) {
                    break;
                }
                ajkq ajkqVar = this.d[length];
                ajkqVar.getClass();
                int i4 = this.f;
                int i5 = ajkqVar.i;
                this.f = i4 - i5;
                this.e--;
                i3++;
                i -= i5;
                length--;
            }
            ajkq[] ajkqVarArr = this.d;
            int i6 = i2 + 1;
            System.arraycopy(ajkqVarArr, i6, ajkqVarArr, i6 + i3, this.e);
            this.g += i3;
        }
    }

    public final void g(ajkq ajkqVar) {
        this.b.add(ajkqVar);
        int i = ajkqVar.i;
        int i2 = this.a;
        if (i > i2) {
            e();
            return;
        }
        f((this.f + i) - i2);
        int i3 = this.e + 1;
        ajkq[] ajkqVarArr = this.d;
        int length = ajkqVarArr.length;
        if (i3 > length) {
            ajkq[] ajkqVarArr2 = new ajkq[length + length];
            System.arraycopy(ajkqVarArr, 0, ajkqVarArr2, length, length);
            this.g = this.d.length - 1;
            this.d = ajkqVarArr2;
            ajkqVarArr = ajkqVarArr2;
        }
        int i4 = this.g;
        this.g = i4 - 1;
        ajkqVarArr[i4] = ajkqVar;
        this.e++;
        this.f += i;
    }
}
