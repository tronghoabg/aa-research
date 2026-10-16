package androidx.datastore.preferences.protobuf;

import A7.AbstractC0279p0;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391h {

    /* renamed from: a, reason: collision with root package name */
    public int f18210a;

    /* renamed from: b, reason: collision with root package name */
    public G4.f f18211b;

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f18212c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f18213d;

    /* renamed from: e, reason: collision with root package name */
    public int f18214e;

    /* renamed from: f, reason: collision with root package name */
    public int f18215f;

    /* renamed from: g, reason: collision with root package name */
    public int f18216g;

    /* renamed from: h, reason: collision with root package name */
    public int f18217h;

    /* renamed from: i, reason: collision with root package name */
    public int f18218i;

    /* renamed from: j, reason: collision with root package name */
    public int f18219j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C1391h(FileInputStream fileInputStream) {
        Charset charset = AbstractC1407y.f18274a;
        this.f18212c = fileInputStream;
        this.f18213d = new byte[4096];
        this.f18214e = 0;
        this.f18216g = 0;
        this.f18218i = 0;
    }

    public final int A() {
        return s();
    }

    public final long B() {
        return t();
    }

    public final void C() {
        int i5 = this.f18214e + this.f18215f;
        this.f18214e = i5;
        int i10 = this.f18218i + i5;
        int i11 = this.f18219j;
        if (i10 <= i11) {
            this.f18215f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f18215f = i12;
        this.f18214e = i5 - i12;
    }

    public final void D(int i5) {
        if (G(i5)) {
            return;
        }
        if (i5 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f18218i) - this.f18216g) {
            throw A.f();
        }
        throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i5) throws A {
        int iZ;
        int i10 = i5 & 7;
        int i11 = 0;
        if (i10 == 0) {
            int i12 = this.f18214e - this.f18216g;
            byte[] bArr = this.f18213d;
            if (i12 >= 10) {
                while (i11 < 10) {
                    int i13 = this.f18216g;
                    this.f18216g = i13 + 1;
                    if (bArr[i13] < 0) {
                        i11++;
                    }
                }
                throw A.c();
            }
            while (i11 < 10) {
                if (this.f18216g == this.f18214e) {
                    D(1);
                }
                int i14 = this.f18216g;
                this.f18216g = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            }
            throw A.c();
            return true;
        }
        if (i10 == 1) {
            F(8);
            return true;
        }
        if (i10 == 2) {
            F(s());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw A.b();
            }
            F(4);
            return true;
        }
        do {
            iZ = z();
            if (iZ == 0) {
                break;
            }
        } while (E(iZ));
        a(((i5 >>> 3) << 3) | 4);
        return true;
    }

    public final void F(int i5) throws A {
        int i10 = this.f18214e;
        int i11 = this.f18216g;
        int i12 = i10 - i11;
        if (i5 <= i12 && i5 >= 0) {
            this.f18216g = i11 + i5;
            return;
        }
        FileInputStream fileInputStream = this.f18212c;
        if (i5 < 0) {
            throw A.d();
        }
        int i13 = this.f18218i;
        int i14 = i13 + i11;
        int i15 = i14 + i5;
        int i16 = this.f18219j;
        if (i15 > i16) {
            F((i16 - i13) - i11);
            throw A.f();
        }
        this.f18218i = i14;
        this.f18214e = 0;
        this.f18216g = 0;
        while (i12 < i5) {
            long j8 = i5 - i12;
            try {
                long jSkip = fileInputStream.skip(j8);
                if (jSkip < 0 || jSkip > j8) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i12 += (int) jSkip;
                }
            } finally {
                this.f18218i += i12;
                C();
            }
        }
        if (i12 >= i5) {
            return;
        }
        int i17 = this.f18214e;
        int i18 = i17 - this.f18216g;
        this.f18216g = i17;
        D(1);
        while (true) {
            int i19 = i5 - i18;
            int i20 = this.f18214e;
            if (i19 <= i20) {
                this.f18216g = i19;
                return;
            } else {
                i18 += i20;
                this.f18216g = i20;
                D(1);
            }
        }
    }

    public final boolean G(int i5) throws IOException {
        int i10 = this.f18216g;
        int i11 = i10 + i5;
        int i12 = this.f18214e;
        if (i11 <= i12) {
            throw new IllegalStateException(AbstractC0279p0.i(i5, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f18218i;
        if (i5 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i13) - i10 && i13 + i10 + i5 <= this.f18219j) {
            byte[] bArr = this.f18213d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f18218i += i10;
                this.f18214e -= i10;
                this.f18216g = 0;
            }
            int i14 = this.f18214e;
            int iMin = Math.min(bArr.length - i14, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f18218i) - i14);
            FileInputStream fileInputStream = this.f18212c;
            int i15 = fileInputStream.read(bArr, i14, iMin);
            if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 > 0) {
                this.f18214e += i15;
                C();
                if (this.f18214e >= i5) {
                    return true;
                }
                return G(i5);
            }
        }
        return false;
    }

    public final void a(int i5) {
        if (this.f18217h != i5) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.f18218i + this.f18216g;
    }

    public final boolean c() {
        return this.f18216g == this.f18214e && !G(1);
    }

    public final void d(int i5) {
        this.f18219j = i5;
        C();
    }

    public final int e(int i5) {
        if (i5 < 0) {
            throw A.d();
        }
        int i10 = this.f18218i + this.f18216g + i5;
        int i11 = this.f18219j;
        if (i10 > i11) {
            throw A.f();
        }
        this.f18219j = i10;
        C();
        return i11;
    }

    public final boolean f() {
        return t() != 0;
    }

    public final double g() {
        return Double.longBitsToDouble(r());
    }

    public final int h() {
        return s();
    }

    public final int i() {
        return q();
    }

    public final long j() {
        return r();
    }

    public final float k() {
        return Float.intBitsToFloat(q());
    }

    public final int l() {
        return s();
    }

    public final long m() {
        return t();
    }

    public final byte[] n(int i5) {
        byte[] bArrO = o(i5);
        if (bArrO != null) {
            return bArrO;
        }
        int i10 = this.f18216g;
        int i11 = this.f18214e;
        int length = i11 - i10;
        this.f18218i += i11;
        this.f18216g = 0;
        this.f18214e = 0;
        ArrayList arrayListP = p(i5 - length);
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f18213d, i10, bArr, 0, length);
        Iterator it = arrayListP.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] o(int i5) {
        if (i5 == 0) {
            return AbstractC1407y.f18275b;
        }
        if (i5 < 0) {
            throw A.d();
        }
        int i10 = this.f18218i;
        int i11 = this.f18216g;
        int i12 = i10 + i11 + i5;
        if (i12 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER > 0) {
            throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f18219j;
        if (i12 > i13) {
            F((i13 - i10) - i11);
            throw A.f();
        }
        int i14 = this.f18214e - i11;
        int i15 = i5 - i14;
        FileInputStream fileInputStream = this.f18212c;
        if (i15 >= 4096 && i15 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f18213d, this.f18216g, bArr, 0, i14);
        this.f18218i += this.f18214e;
        this.f18216g = 0;
        this.f18214e = 0;
        while (i14 < i5) {
            int i16 = fileInputStream.read(bArr, i14, i5 - i14);
            if (i16 == -1) {
                throw A.f();
            }
            this.f18218i += i16;
            i14 += i16;
        }
        return bArr;
    }

    public final ArrayList p(int i5) {
        ArrayList arrayList = new ArrayList();
        while (i5 > 0) {
            int iMin = Math.min(i5, 4096);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f18212c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw A.f();
                }
                this.f18218i += i11;
                i10 += i11;
            }
            i5 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int q() {
        int i5 = this.f18216g;
        if (this.f18214e - i5 < 4) {
            D(4);
            i5 = this.f18216g;
        }
        this.f18216g = i5 + 4;
        byte[] bArr = this.f18213d;
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    public final long r() {
        int i5 = this.f18216g;
        if (this.f18214e - i5 < 8) {
            D(8);
            i5 = this.f18216g;
        }
        this.f18216g = i5 + 8;
        byte[] bArr = this.f18213d;
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public final int s() {
        int i5;
        int i10 = this.f18216g;
        int i11 = this.f18214e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f18213d;
            byte b5 = bArr[i10];
            if (b5 >= 0) {
                this.f18216g = i12;
                return b5;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b5;
                if (i14 < 0) {
                    i5 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i5 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i5 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i5 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = i19;
                            }
                            i5 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f18216g = i13;
                return i5;
            }
        }
        return (int) u();
    }

    public final long t() {
        long j8;
        long j10;
        long j11;
        long j12;
        int i5 = this.f18216g;
        int i10 = this.f18214e;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.f18213d;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                this.f18216g = i11;
                return b5;
            }
            if (i10 - i11 >= 9) {
                int i12 = i5 + 2;
                int i13 = (bArr[i11] << 7) ^ b5;
                if (i13 < 0) {
                    j8 = i13 ^ (-128);
                } else {
                    int i14 = i5 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j8 = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i5 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i5 + 5;
                            long j14 = j13 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i5 + 6;
                                long j15 = j14 ^ (bArr[i12] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i5 + 7;
                                    j14 = j15 ^ (bArr[i16] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i5 + 8;
                                        j15 = j14 ^ (bArr[i12] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i5 + 9;
                                            long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i5 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j8 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j8 = j11 ^ j14;
                        }
                        i12 = i16;
                        j8 = j12;
                    }
                }
                this.f18216g = i12;
                return j8;
            }
        }
        return u();
    }

    public final long u() throws A {
        long j8 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            if (this.f18216g == this.f18214e) {
                D(1);
            }
            int i10 = this.f18216g;
            this.f18216g = i10 + 1;
            j8 |= (r3 & 127) << i5;
            if ((this.f18213d[i10] & 128) == 0) {
                return j8;
            }
        }
        throw A.c();
    }

    public final int v() {
        return q();
    }

    public final long w() {
        return r();
    }

    public final int x() {
        int iS = s();
        return (-(iS & 1)) ^ (iS >>> 1);
    }

    public final long y() {
        long jT = t();
        return (-(jT & 1)) ^ (jT >>> 1);
    }

    public final int z() {
        if (c()) {
            this.f18217h = 0;
            return 0;
        }
        int iS = s();
        this.f18217h = iS;
        if ((iS >>> 3) != 0) {
            return iS;
        }
        throw new A("Protocol message contained an invalid tag (zero).");
    }
}
