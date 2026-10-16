package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class ajnz extends ajnb {
    public final transient byte[][] e;
    public final transient int[] f;

    public ajnz(byte[][] bArr, int[] iArr) {
        super(ajnb.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final ajnb u() {
        return new ajnb(o());
    }

    private final Object writeReplace() {
        return u();
    }

    @Override // defpackage.ajnb
    public final byte a(int i) {
        byte[][] bArr = this.e;
        int length = bArr.length;
        int[] iArr = this.f;
        ahfd.g(iArr[length - 1], i, 1L);
        int iB = ahfw.b(this, i);
        return bArr[iB][(i - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[length + iB]];
    }

    @Override // defpackage.ajnb
    public final int c() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.ajnb
    public final int e(byte[] bArr, int i) {
        bArr.getClass();
        return u().e(bArr, i);
    }

    @Override // defpackage.ajnb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajnb) {
            ajnb ajnbVar = (ajnb) obj;
            return ajnbVar.c() == c() && p(0, ajnbVar, c());
        }
        return false;
    }

    @Override // defpackage.ajnb
    public final String g() {
        return u().g();
    }

    @Override // defpackage.ajnb
    public final String h(Charset charset) {
        charset.getClass();
        return u().h(charset);
    }

    @Override // defpackage.ajnb
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.c = i3;
                return i3;
            }
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.ajnb
    public final ajnb j(int i, int i2) {
        int iD = ahfd.d(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "beginIndex=", " < 0"));
        }
        if (iD > c()) {
            throw new IllegalArgumentException("endIndex=" + iD + " > length(" + c() + ")");
        }
        int i3 = iD - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(a.bo(i, iD, "endIndex=", " < beginIndex="));
        }
        if (i == 0 && iD == c()) {
            return this;
        }
        if (i == iD) {
            return ajnb.a;
        }
        int iB = ahfw.b(this, i);
        int iB2 = ahfw.b(this, iD - 1);
        byte[][] bArr = this.e;
        byte[][] bArr2 = (byte[][]) woy.cI(bArr, iB, iB2 + 1);
        int length = bArr2.length;
        int[] iArr = new int[length + length];
        if (iB <= iB2) {
            int i4 = iB;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f;
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iB2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iB != 0 ? this.f[iB - 1] : 0;
        int length2 = bArr2.length;
        iArr[length2] = iArr[length2] + (i - i7);
        return new ajnz(bArr2, iArr);
    }

    @Override // defpackage.ajnb
    public final ajnb k() {
        return u().k();
    }

    @Override // defpackage.ajnb
    public final boolean l(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int iB = ahfw.b(this, i);
        while (i < i5) {
            if (iB == 0) {
                iB = 0;
                i4 = 0;
            } else {
                i4 = this.f[iB - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iB] - i4;
            byte[][] bArr2 = this.e;
            int i7 = iArr[bArr2.length + iB];
            int iMin = Math.min(i5, i6 + i4) - i;
            if (!ahfd.h(bArr2[iB], i7 + (i - i4), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iB++;
        }
        return true;
    }

    @Override // defpackage.ajnb
    public final byte[] n() {
        return o();
    }

    @Override // defpackage.ajnb
    public final byte[] o() {
        byte[] bArr = new byte[c()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            woy.dn(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.ajnb
    public final boolean p(int i, ajnb ajnbVar, int i2) {
        int i3;
        ajnbVar.getClass();
        if (i < 0 || i > c() - i2) {
            return false;
        }
        int i4 = i2 + i;
        int iB = ahfw.b(this, i);
        int i5 = 0;
        while (i < i4) {
            if (iB == 0) {
                iB = 0;
                i3 = 0;
            } else {
                i3 = this.f[iB - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[iB] - i3;
            byte[][] bArr = this.e;
            int i7 = iArr[bArr.length + iB];
            int iMin = Math.min(i4, i6 + i3) - i;
            if (!ajnbVar.l(i5, bArr[iB], i7 + (i - i3), iMin)) {
                return false;
            }
            i5 += iMin;
            i += iMin;
            iB++;
        }
        return true;
    }

    @Override // defpackage.ajnb
    public final void q(ajmy ajmyVar, int i) {
        int i2;
        int iB = ahfw.b(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (iB == 0) {
                iB = 0;
                i2 = 0;
            } else {
                i2 = this.f[iB - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[iB] - i2;
            byte[][] bArr = this.e;
            int i5 = iArr[bArr.length + iB];
            int iMin = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            ajnx ajnxVar = new ajnx(bArr[iB], i6, i6 + iMin, true);
            ajnx ajnxVar2 = ajmyVar.a;
            if (ajnxVar2 == null) {
                ajnxVar.g = ajnxVar;
                ajnxVar.f = ajnxVar.g;
                ajmyVar.a = ajnxVar.f;
            } else {
                ajnx ajnxVar3 = ajnxVar2.g;
                ajnxVar3.getClass();
                ajnxVar3.d(ajnxVar);
            }
            i3 += iMin;
            iB++;
        }
        ajmyVar.b += i;
    }

    @Override // defpackage.ajnb
    public final int t(byte[] bArr) {
        bArr.getClass();
        return u().t(bArr);
    }

    @Override // defpackage.ajnb
    public final String toString() {
        return u().toString();
    }
}
