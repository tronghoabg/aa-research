package cg;

import A7.AbstractC0279p0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class E extends C1621j {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f19876e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f19877f;

    public E(byte[][] bArr, int[] iArr) {
        super(C1621j.f19903d.f19904a);
        this.f19876e = bArr;
        this.f19877f = iArr;
    }

    @Override // cg.C1621j
    public final String a() {
        throw null;
    }

    @Override // cg.C1621j
    public final C1621j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f19876e;
        int length = bArr.length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            int[] iArr = this.f19877f;
            int i11 = iArr[length + i5];
            int i12 = iArr[i5];
            messageDigest.update(bArr[i5], i11, i12 - i10);
            i5++;
            i10 = i12;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC3340k.b(bArrDigest);
        return new C1621j(bArrDigest);
    }

    @Override // cg.C1621j
    public final int d() {
        return this.f19877f[this.f19876e.length - 1];
    }

    @Override // cg.C1621j
    public final String e() {
        return v().e();
    }

    @Override // cg.C1621j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1621j) {
            C1621j c1621j = (C1621j) obj;
            if (c1621j.d() == d() && m(0, c1621j, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // cg.C1621j
    public final int f(byte[] other, int i5) {
        AbstractC3340k.e(other, "other");
        return v().f(other, i5);
    }

    @Override // cg.C1621j
    public final byte[] h() {
        return s();
    }

    @Override // cg.C1621j
    public final int hashCode() {
        int i5 = this.f19905b;
        if (i5 != 0) {
            return i5;
        }
        byte[][] bArr = this.f19876e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f19877f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f19905b = i11;
        return i11;
    }

    @Override // cg.C1621j
    public final byte i(int i5) {
        byte[][] bArr = this.f19876e;
        int length = bArr.length - 1;
        int[] iArr = this.f19877f;
        AbstractC1613b.f(iArr[length], i5, 1L);
        int iG = dg.b.g(this, i5);
        return bArr[iG][(i5 - (iG == 0 ? 0 : iArr[iG - 1])) + iArr[bArr.length + iG]];
    }

    @Override // cg.C1621j
    public final int j(byte[] other) {
        AbstractC3340k.e(other, "other");
        return v().j(other);
    }

    @Override // cg.C1621j
    public final boolean m(int i5, C1621j other, int i10) {
        AbstractC3340k.e(other, "other");
        if (i5 >= 0 && i5 <= d() - i10) {
            int i11 = i10 + i5;
            int iG = dg.b.g(this, i5);
            int i12 = 0;
            while (i5 < i11) {
                int[] iArr = this.f19877f;
                int i13 = iG == 0 ? 0 : iArr[iG - 1];
                int i14 = iArr[iG] - i13;
                byte[][] bArr = this.f19876e;
                int i15 = iArr[bArr.length + iG];
                int iMin = Math.min(i11, i14 + i13) - i5;
                if (other.n(i12, bArr[iG], (i5 - i13) + i15, iMin)) {
                    i12 += iMin;
                    i5 += iMin;
                    iG++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // cg.C1621j
    public final boolean n(int i5, byte[] other, int i10, int i11) {
        AbstractC3340k.e(other, "other");
        if (i5 < 0 || i5 > d() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i5;
        int iG = dg.b.g(this, i5);
        while (i5 < i12) {
            int[] iArr = this.f19877f;
            int i13 = iG == 0 ? 0 : iArr[iG - 1];
            int i14 = iArr[iG] - i13;
            byte[][] bArr = this.f19876e;
            int i15 = iArr[bArr.length + iG];
            int iMin = Math.min(i12, i14 + i13) - i5;
            if (!AbstractC1613b.b(bArr[iG], (i5 - i13) + i15, other, i10, iMin)) {
                return false;
            }
            i10 += iMin;
            i5 += iMin;
            iG++;
        }
        return true;
    }

    @Override // cg.C1621j
    public final C1621j p(int i5, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "beginIndex=", " < 0").toString());
        }
        if (i10 > d()) {
            StringBuilder sbL = pd.f.l(i10, "endIndex=", " > length(");
            sbL.append(d());
            sbL.append(')');
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        int i11 = i10 - i5;
        if (i11 < 0) {
            throw new IllegalArgumentException(R8.v.e(i10, i5, "endIndex=", " < beginIndex=").toString());
        }
        if (i5 == 0 && i10 == d()) {
            return this;
        }
        if (i5 == i10) {
            return C1621j.f19903d;
        }
        int iG = dg.b.g(this, i5);
        int iG2 = dg.b.g(this, i10 - 1);
        byte[][] bArr = this.f19876e;
        byte[][] bArr2 = (byte[][]) ff.m.m0(bArr, iG, iG2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f19877f;
        if (iG <= iG2) {
            int i12 = iG;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(iArr2[i12] - i5, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr2.length] = iArr2[bArr.length + i12];
                if (i12 == iG2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = iG != 0 ? iArr2[iG - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i5 - i15) + iArr[length];
        return new E(bArr2, iArr);
    }

    @Override // cg.C1621j
    public final C1621j r() {
        return v().r();
    }

    @Override // cg.C1621j
    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f19876e;
        int length = bArr2.length;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i5 < length) {
            int[] iArr = this.f19877f;
            int i12 = iArr[length + i5];
            int i13 = iArr[i5];
            int i14 = i13 - i10;
            ff.m.f0(i11, i12, i12 + i14, bArr2[i5], bArr);
            i11 += i14;
            i5++;
            i10 = i13;
        }
        return bArr;
    }

    @Override // cg.C1621j
    public final String toString() {
        return v().toString();
    }

    @Override // cg.C1621j
    public final void u(C1618g buffer, int i5) {
        AbstractC3340k.e(buffer, "buffer");
        int iG = dg.b.g(this, 0);
        int i10 = 0;
        while (i10 < i5) {
            int[] iArr = this.f19877f;
            int i11 = iG == 0 ? 0 : iArr[iG - 1];
            int i12 = iArr[iG] - i11;
            byte[][] bArr = this.f19876e;
            int i13 = iArr[bArr.length + iG];
            int iMin = Math.min(i5, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            C1611C c1611c = new C1611C(bArr[iG], i14, i14 + iMin, true, false);
            C1611C c1611c2 = buffer.f19901a;
            if (c1611c2 == null) {
                c1611c.f19872g = c1611c;
                c1611c.f19871f = c1611c;
                buffer.f19901a = c1611c;
            } else {
                C1611C c1611c3 = c1611c2.f19872g;
                AbstractC3340k.b(c1611c3);
                c1611c3.b(c1611c);
            }
            i10 += iMin;
            iG++;
        }
        buffer.f19902b += i5;
    }

    public final C1621j v() {
        return new C1621j(s());
    }
}
