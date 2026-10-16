package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class aech {
    public final ajna b;
    int f;
    public final List a = new ArrayList();
    aecg[] e = new aecg[8];
    int g = 0;
    int h = 0;
    public int c = 4096;
    public int d = 4096;

    public aech(ajoc ajocVar) {
        this.f = r0.length - 1;
        this.b = ahfm.b(ajocVar);
    }

    public static final boolean g(int i) {
        if (i < 0) {
            return false;
        }
        int length = aecj.b.length;
        return i <= 60;
    }

    private final int h() throws IOException {
        return this.b.d() & 255;
    }

    private final void i() {
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private final void j(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].h;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
                length--;
            }
            aecg[] aecgVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(aecgVarArr, i5, aecgVarArr, i5 + i3, this.g);
            this.f += i3;
        }
    }

    public final int a(int i) {
        return this.f + 1 + i;
    }

    final int b(int i, int i2) throws IOException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        do {
            int iH = h();
            if ((iH & 128) == 0) {
                return i2 + (iH << i4);
            }
            i2 += (iH & 127) << i4;
            i4 += 7;
        } while (i4 < 28);
        throw new IOException("Varint overflowed");
    }

    public final ajnb c(int i) throws IOException {
        if (g(i)) {
            return aecj.b[i].f;
        }
        int length = aecj.b.length;
        int iA = a(i - 61);
        if (iA >= 0) {
            aecg[] aecgVarArr = this.e;
            if (iA < aecgVarArr.length) {
                return aecgVarArr[iA].f;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    final ajnb d() throws IOException {
        int i;
        int i2;
        int iH = h();
        int i3 = iH & 128;
        long jB = b(iH, 127);
        ajna ajnaVar = this.b;
        if (i3 != 128) {
            return ajnaVar.s(jB);
        }
        aecp aecpVar = aecp.a;
        ajnw ajnwVar = (ajnw) ajnaVar;
        ajnwVar.z(jB);
        byte[] bArrE = ajnwVar.b.E(jB);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ajll ajllVar = aecpVar.b;
        int i4 = 0;
        ajll ajllVar2 = ajllVar;
        int i5 = 0;
        int i6 = 0;
        while (i4 < bArrE.length) {
            int i7 = bArrE[i4] & 255;
            int i8 = i5 << 8;
            i6 += 8;
            while (true) {
                i2 = i8 | i7;
                if (i6 >= 8) {
                    int i9 = i6 - 8;
                    ajllVar2 = ((ajll[]) ajllVar2.c)[(i2 >>> i9) & 255];
                    if (ajllVar2.c == null) {
                        byteArrayOutputStream.write(ajllVar2.a);
                        i6 -= ajllVar2.b;
                        ajllVar2 = ajllVar;
                    } else {
                        i6 = i9;
                    }
                }
            }
            i4++;
            i5 = i2;
        }
        while (i6 > 0) {
            ajll ajllVar3 = ((ajll[]) ajllVar2.c)[(i5 << (8 - i6)) & 255];
            if (ajllVar3.c != null || (i = ajllVar3.b) > i6) {
                break;
            }
            byteArrayOutputStream.write(ajllVar3.a);
            i6 -= i;
            ajllVar2 = ajllVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ajnb ajnbVar = ajnb.a;
        return ahfd.c(byteArray);
    }

    public final void e() {
        int i = this.d;
        int i2 = this.h;
        if (i < i2) {
            if (i == 0) {
                i();
            } else {
                j(i2 - i);
            }
        }
    }

    public final void f(aecg aecgVar) {
        this.a.add(aecgVar);
        int i = aecgVar.h;
        int i2 = this.d;
        if (i > i2) {
            i();
            return;
        }
        j((this.h + i) - i2);
        int i3 = this.g + 1;
        aecg[] aecgVarArr = this.e;
        int length = aecgVarArr.length;
        if (i3 > length) {
            aecg[] aecgVarArr2 = new aecg[length + length];
            System.arraycopy(aecgVarArr, 0, aecgVarArr2, length, length);
            this.f = this.e.length - 1;
            this.e = aecgVarArr2;
            aecgVarArr = aecgVarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        aecgVarArr[i4] = aecgVar;
        this.g++;
        this.h += i;
    }
}
