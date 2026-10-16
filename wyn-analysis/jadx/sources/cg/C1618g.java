package cg;

import A7.AbstractC0279p0;
import Cd.C0351t;
import Va.M6;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* renamed from: cg.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1618g implements InterfaceC1620i, InterfaceC1619h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public C1611C f19901a;

    /* renamed from: b, reason: collision with root package name */
    public long f19902b;

    public final C1621j D() {
        long j8 = this.f19902b;
        if (j8 <= 2147483647L) {
            return J((int) j8);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f19902b).toString());
    }

    @Override // cg.F
    public final void E(C1618g source, long j8) {
        C1611C c1611cB;
        AbstractC3340k.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1613b.f(source.f19902b, 0L, j8);
        while (j8 > 0) {
            C1611C c1611c = source.f19901a;
            AbstractC3340k.b(c1611c);
            int i5 = c1611c.f19868c;
            C1611C c1611c2 = source.f19901a;
            AbstractC3340k.b(c1611c2);
            long j10 = i5 - c1611c2.f19867b;
            int i10 = 0;
            if (j8 < j10) {
                C1611C c1611c3 = this.f19901a;
                C1611C c1611c4 = c1611c3 != null ? c1611c3.f19872g : null;
                if (c1611c4 != null && c1611c4.f19870e) {
                    if ((c1611c4.f19868c + j8) - (c1611c4.f19869d ? 0 : c1611c4.f19867b) <= 8192) {
                        C1611C c1611c5 = source.f19901a;
                        AbstractC3340k.b(c1611c5);
                        c1611c5.d(c1611c4, (int) j8);
                        source.f19902b -= j8;
                        this.f19902b += j8;
                        return;
                    }
                }
                C1611C c1611c6 = source.f19901a;
                AbstractC3340k.b(c1611c6);
                int i11 = (int) j8;
                if (i11 <= 0 || i11 > c1611c6.f19868c - c1611c6.f19867b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    c1611cB = c1611c6.c();
                } else {
                    c1611cB = D.b();
                    int i12 = c1611c6.f19867b;
                    ff.m.f0(0, i12, i12 + i11, c1611c6.f19866a, c1611cB.f19866a);
                }
                c1611cB.f19868c = c1611cB.f19867b + i11;
                c1611c6.f19867b += i11;
                C1611C c1611c7 = c1611c6.f19872g;
                AbstractC3340k.b(c1611c7);
                c1611c7.b(c1611cB);
                source.f19901a = c1611cB;
            }
            C1611C c1611c8 = source.f19901a;
            AbstractC3340k.b(c1611c8);
            long j11 = c1611c8.f19868c - c1611c8.f19867b;
            source.f19901a = c1611c8.a();
            C1611C c1611c9 = this.f19901a;
            if (c1611c9 == null) {
                this.f19901a = c1611c8;
                c1611c8.f19872g = c1611c8;
                c1611c8.f19871f = c1611c8;
            } else {
                C1611C c1611c10 = c1611c9.f19872g;
                AbstractC3340k.b(c1611c10);
                c1611c10.b(c1611c8);
                C1611C c1611c11 = c1611c8.f19872g;
                if (c1611c11 == c1611c8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC3340k.b(c1611c11);
                if (c1611c11.f19870e) {
                    int i13 = c1611c8.f19868c - c1611c8.f19867b;
                    C1611C c1611c12 = c1611c8.f19872g;
                    AbstractC3340k.b(c1611c12);
                    int i14 = 8192 - c1611c12.f19868c;
                    C1611C c1611c13 = c1611c8.f19872g;
                    AbstractC3340k.b(c1611c13);
                    if (!c1611c13.f19869d) {
                        C1611C c1611c14 = c1611c8.f19872g;
                        AbstractC3340k.b(c1611c14);
                        i10 = c1611c14.f19867b;
                    }
                    if (i13 <= i14 + i10) {
                        C1611C c1611c15 = c1611c8.f19872g;
                        AbstractC3340k.b(c1611c15);
                        c1611c8.d(c1611c15, i13);
                        c1611c8.a();
                        D.a(c1611c8);
                    }
                }
            }
            source.f19902b -= j11;
            this.f19902b += j11;
            j8 -= j11;
        }
    }

    @Override // cg.InterfaceC1620i
    public final long F(InterfaceC1619h interfaceC1619h) {
        long j8 = this.f19902b;
        if (j8 > 0) {
            interfaceC1619h.E(this, j8);
        }
        return j8;
    }

    public final C1621j J(int i5) {
        if (i5 == 0) {
            return C1621j.f19903d;
        }
        AbstractC1613b.f(this.f19902b, 0L, i5);
        C1611C c1611c = this.f19901a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i5) {
            AbstractC3340k.b(c1611c);
            int i13 = c1611c.f19868c;
            int i14 = c1611c.f19867b;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            c1611c = c1611c.f19871f;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        C1611C c1611c2 = this.f19901a;
        int i15 = 0;
        while (i10 < i5) {
            AbstractC3340k.b(c1611c2);
            bArr[i15] = c1611c2.f19866a;
            i10 += c1611c2.f19868c - c1611c2.f19867b;
            iArr[i15] = Math.min(i10, i5);
            iArr[i15 + i12] = c1611c2.f19867b;
            c1611c2.f19869d = true;
            i15++;
            c1611c2 = c1611c2.f19871f;
        }
        return new E(bArr, iArr);
    }

    @Override // cg.InterfaceC1619h
    public final /* bridge */ /* synthetic */ InterfaceC1619h L(int i5, int i10, String str) {
        c0(i5, i10, str);
        return this;
    }

    public final C1611C P(int i5) {
        if (i5 < 1 || i5 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C1611C c1611c = this.f19901a;
        if (c1611c == null) {
            C1611C c1611cB = D.b();
            this.f19901a = c1611cB;
            c1611cB.f19872g = c1611cB;
            c1611cB.f19871f = c1611cB;
            return c1611cB;
        }
        C1611C c1611c2 = c1611c.f19872g;
        AbstractC3340k.b(c1611c2);
        if (c1611c2.f19868c + i5 <= 8192 && c1611c2.f19870e) {
            return c1611c2;
        }
        C1611C c1611cB2 = D.b();
        c1611c2.b(c1611cB2);
        return c1611cB2;
    }

    public final void Q(C1621j byteString) {
        AbstractC3340k.e(byteString, "byteString");
        byteString.u(this, byteString.d());
    }

    @Override // cg.InterfaceC1619h
    public final /* bridge */ /* synthetic */ InterfaceC1619h T(int i5, int i10, byte[] bArr) {
        W(bArr, i5, i10);
        return this;
    }

    public final void V(byte[] source) {
        AbstractC3340k.e(source, "source");
        W(source, 0, source.length);
    }

    public final void W(byte[] source, int i5, int i10) {
        AbstractC3340k.e(source, "source");
        long j8 = i10;
        AbstractC1613b.f(source.length, i5, j8);
        int i11 = i10 + i5;
        while (i5 < i11) {
            C1611C c1611cP = P(1);
            int iMin = Math.min(i11 - i5, 8192 - c1611cP.f19868c);
            int i12 = i5 + iMin;
            ff.m.f0(c1611cP.f19868c, i5, i12, source, c1611cP.f19866a);
            c1611cP.f19868c += iMin;
            i5 = i12;
        }
        this.f19902b += j8;
    }

    public final void X(int i5) {
        C1611C c1611cP = P(1);
        int i10 = c1611cP.f19868c;
        c1611cP.f19868c = i10 + 1;
        c1611cP.f19866a[i10] = (byte) i5;
        this.f19902b++;
    }

    public final void Y(long j8) {
        boolean z2;
        byte[] bArr;
        if (j8 == 0) {
            X(48);
            return;
        }
        int i5 = 1;
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                d0("-9223372036854775808");
                return;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j8 >= 100000000) {
            i5 = j8 < 1000000000000L ? j8 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j8 < 1000000000 ? 9 : 10 : j8 < 100000000000L ? 11 : 12 : j8 < 1000000000000000L ? j8 < 10000000000000L ? 13 : j8 < 100000000000000L ? 14 : 15 : j8 < 100000000000000000L ? j8 < 10000000000000000L ? 16 : 17 : j8 < 1000000000000000000L ? 18 : 19;
        } else if (j8 >= 10000) {
            i5 = j8 < 1000000 ? j8 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH ? 5 : 6 : j8 < 10000000 ? 7 : 8;
        } else if (j8 >= 100) {
            i5 = j8 < 1000 ? 3 : 4;
        } else if (j8 >= 10) {
            i5 = 2;
        }
        if (z2) {
            i5++;
        }
        C1611C c1611cP = P(i5);
        int i10 = c1611cP.f19868c + i5;
        while (true) {
            bArr = c1611cP.f19866a;
            if (j8 == 0) {
                break;
            }
            long j10 = 10;
            i10--;
            bArr[i10] = dg.a.f34288a[(int) (j8 % j10)];
            j8 /= j10;
        }
        if (z2) {
            bArr[i10 - 1] = 45;
        }
        c1611cP.f19868c += i5;
        this.f19902b += i5;
    }

    public final void Z(long j8) {
        if (j8 == 0) {
            X(48);
            return;
        }
        long j10 = (j8 >>> 1) | j8;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i5 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        C1611C c1611cP = P(i5);
        int i10 = c1611cP.f19868c;
        for (int i11 = (i10 + i5) - 1; i11 >= i10; i11--) {
            c1611cP.f19866a[i11] = dg.a.f34288a[(int) (15 & j8)];
            j8 >>>= 4;
        }
        c1611cP.f19868c += i5;
        this.f19902b += i5;
    }

    public final void a() throws EOFException {
        skip(this.f19902b);
    }

    public final void a0(int i5) {
        C1611C c1611cP = P(4);
        int i10 = c1611cP.f19868c;
        byte[] bArr = c1611cP.f19866a;
        bArr[i10] = (byte) ((i5 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i5 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i5 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i5 & 255);
        c1611cP.f19868c = i10 + 4;
        this.f19902b += 4;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1618g clone() {
        C1618g c1618g = new C1618g();
        if (this.f19902b == 0) {
            return c1618g;
        }
        C1611C c1611c = this.f19901a;
        AbstractC3340k.b(c1611c);
        C1611C c1611cC = c1611c.c();
        c1618g.f19901a = c1611cC;
        c1611cC.f19872g = c1611cC;
        c1611cC.f19871f = c1611cC;
        for (C1611C c1611c2 = c1611c.f19871f; c1611c2 != c1611c; c1611c2 = c1611c2.f19871f) {
            C1611C c1611c3 = c1611cC.f19872g;
            AbstractC3340k.b(c1611c3);
            AbstractC3340k.b(c1611c2);
            c1611c3.b(c1611c2.c());
        }
        c1618g.f19902b = this.f19902b;
        return c1618g;
    }

    public final void b0(int i5) {
        C1611C c1611cP = P(2);
        int i10 = c1611cP.f19868c;
        byte[] bArr = c1611cP.f19866a;
        bArr[i10] = (byte) ((i5 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i5 & 255);
        c1611cP.f19868c = i10 + 2;
        this.f19902b += 2;
    }

    public final void c0(int i5, int i10, String string) {
        char cCharAt;
        AbstractC3340k.e(string, "string");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "beginIndex < 0: ").toString());
        }
        if (i10 < i5) {
            throw new IllegalArgumentException(R8.v.e(i10, i5, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder sbL = pd.f.l(i10, "endIndex > string.length: ", " > ");
            sbL.append(string.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        while (i5 < i10) {
            char cCharAt2 = string.charAt(i5);
            if (cCharAt2 < 128) {
                C1611C c1611cP = P(1);
                int i11 = c1611cP.f19868c - i5;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i5 + 1;
                byte[] bArr = c1611cP.f19866a;
                bArr[i5 + i11] = (byte) cCharAt2;
                while (true) {
                    i5 = i12;
                    if (i5 >= iMin || (cCharAt = string.charAt(i5)) >= 128) {
                        break;
                    }
                    i12 = i5 + 1;
                    bArr[i5 + i11] = (byte) cCharAt;
                }
                int i13 = c1611cP.f19868c;
                int i14 = (i11 + i5) - i13;
                c1611cP.f19868c = i13 + i14;
                this.f19902b += i14;
            } else {
                if (cCharAt2 < 2048) {
                    C1611C c1611cP2 = P(2);
                    int i15 = c1611cP2.f19868c;
                    byte[] bArr2 = c1611cP2.f19866a;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c1611cP2.f19868c = i15 + 2;
                    this.f19902b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C1611C c1611cP3 = P(3);
                    int i16 = c1611cP3.f19868c;
                    byte b5 = (byte) ((cCharAt2 >> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
                    byte[] bArr3 = c1611cP3.f19866a;
                    bArr3[i16] = b5;
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c1611cP3.f19868c = i16 + 3;
                    this.f19902b += 3;
                } else {
                    int i17 = i5 + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        X(63);
                        i5 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C1611C c1611cP4 = P(4);
                        int i19 = c1611cP4.f19868c;
                        byte[] bArr4 = c1611cP4.f19866a;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        c1611cP4.f19868c = i19 + 4;
                        this.f19902b += 4;
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
    }

    public final long d() {
        long j8 = this.f19902b;
        if (j8 == 0) {
            return 0L;
        }
        C1611C c1611c = this.f19901a;
        AbstractC3340k.b(c1611c);
        C1611C c1611c2 = c1611c.f19872g;
        AbstractC3340k.b(c1611c2);
        return (c1611c2.f19868c >= 8192 || !c1611c2.f19870e) ? j8 : j8 - (r3 - c1611c2.f19867b);
    }

    public final void d0(String string) {
        AbstractC3340k.e(string, "string");
        c0(0, string.length(), string);
    }

    @Override // cg.InterfaceC1620i
    public final boolean e(long j8, C1621j bytes) {
        AbstractC3340k.e(bytes, "bytes");
        byte[] bArr = bytes.f19904a;
        int length = bArr.length;
        if (j8 >= 0 && length >= 0 && this.f19902b - j8 >= length && bArr.length >= length) {
            for (int i5 = 0; i5 < length; i5++) {
                if (o(i5 + j8) == bArr[i5]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void e0(int i5) {
        String strZ;
        int i10 = 0;
        if (i5 < 128) {
            X(i5);
            return;
        }
        if (i5 < 2048) {
            C1611C c1611cP = P(2);
            int i11 = c1611cP.f19868c;
            byte[] bArr = c1611cP.f19866a;
            bArr[i11] = (byte) ((i5 >> 6) | 192);
            bArr[1 + i11] = (byte) ((i5 & 63) | 128);
            c1611cP.f19868c = i11 + 2;
            this.f19902b += 2;
            return;
        }
        if (55296 <= i5 && i5 < 57344) {
            X(63);
            return;
        }
        if (i5 < 65536) {
            C1611C c1611cP2 = P(3);
            int i12 = c1611cP2.f19868c;
            byte b5 = (byte) ((i5 >> 12) | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
            byte[] bArr2 = c1611cP2.f19866a;
            bArr2[i12] = b5;
            bArr2[1 + i12] = (byte) (((i5 >> 6) & 63) | 128);
            bArr2[2 + i12] = (byte) ((i5 & 63) | 128);
            c1611cP2.f19868c = i12 + 3;
            this.f19902b += 3;
            return;
        }
        if (i5 <= 1114111) {
            C1611C c1611cP3 = P(4);
            int i13 = c1611cP3.f19868c;
            byte[] bArr3 = c1611cP3.f19866a;
            bArr3[i13] = (byte) ((i5 >> 18) | 240);
            bArr3[1 + i13] = (byte) (((i5 >> 12) & 63) | 128);
            bArr3[2 + i13] = (byte) (((i5 >> 6) & 63) | 128);
            bArr3[3 + i13] = (byte) ((i5 & 63) | 128);
            c1611cP3.f19868c = i13 + 4;
            this.f19902b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i5 != 0) {
            char[] cArr = dg.b.f34289a;
            char[] cArr2 = {cArr[(i5 >> 28) & 15], cArr[(i5 >> 24) & 15], cArr[(i5 >> 20) & 15], cArr[(i5 >> 16) & 15], cArr[(i5 >> 12) & 15], cArr[(i5 >> 8) & 15], cArr[(i5 >> 4) & 15], cArr[i5 & 15]};
            while (i10 < 8 && cArr2[i10] == '0') {
                i10++;
            }
            strZ = Bf.r.Z(cArr2, i10, 8);
        } else {
            strZ = "0";
        }
        sb2.append(strZ);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        boolean z2 = true;
        if (this == obj) {
            return true;
        }
        boolean z10 = false;
        if (!(obj instanceof C1618g)) {
            return false;
        }
        long j8 = this.f19902b;
        C1618g c1618g = (C1618g) obj;
        if (j8 != c1618g.f19902b) {
            return false;
        }
        if (j8 == 0) {
            return true;
        }
        C1611C c1611c = this.f19901a;
        AbstractC3340k.b(c1611c);
        C1611C c1611c2 = c1618g.f19901a;
        AbstractC3340k.b(c1611c2);
        int i5 = c1611c.f19867b;
        int i10 = c1611c2.f19867b;
        long j10 = 0;
        while (j10 < this.f19902b) {
            long jMin = Math.min(c1611c.f19868c - i5, c1611c2.f19868c - i10);
            long j11 = 0;
            while (j11 < jMin) {
                int i11 = i5 + 1;
                boolean z11 = z2;
                byte b5 = c1611c.f19866a[i5];
                int i12 = i10 + 1;
                boolean z12 = z10;
                if (b5 != c1611c2.f19866a[i10]) {
                    return z12;
                }
                j11++;
                i10 = i12;
                i5 = i11;
                z2 = z11;
                z10 = z12;
            }
            boolean z13 = z2;
            boolean z14 = z10;
            if (i5 == c1611c.f19868c) {
                C1611C c1611c3 = c1611c.f19871f;
                AbstractC3340k.b(c1611c3);
                i5 = c1611c3.f19867b;
                c1611c = c1611c3;
            }
            if (i10 == c1611c2.f19868c) {
                c1611c2 = c1611c2.f19871f;
                AbstractC3340k.b(c1611c2);
                i10 = c1611c2.f19867b;
            }
            j10 += jMin;
            z2 = z13;
            z10 = z14;
        }
        return z2;
    }

    public final boolean exhausted() {
        return this.f19902b == 0;
    }

    public final void h(C1618g out, long j8, long j10) {
        AbstractC3340k.e(out, "out");
        long j11 = j8;
        AbstractC1613b.f(this.f19902b, j11, j10);
        if (j10 == 0) {
            return;
        }
        out.f19902b += j10;
        C1611C c1611c = this.f19901a;
        while (true) {
            AbstractC3340k.b(c1611c);
            long j12 = c1611c.f19868c - c1611c.f19867b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            c1611c = c1611c.f19871f;
        }
        C1611C c1611c2 = c1611c;
        long j13 = j10;
        while (j13 > 0) {
            AbstractC3340k.b(c1611c2);
            C1611C c1611cC = c1611c2.c();
            int i5 = c1611cC.f19867b + ((int) j11);
            c1611cC.f19867b = i5;
            c1611cC.f19868c = Math.min(i5 + ((int) j13), c1611cC.f19868c);
            C1611C c1611c3 = out.f19901a;
            if (c1611c3 == null) {
                c1611cC.f19872g = c1611cC;
                c1611cC.f19871f = c1611cC;
                out.f19901a = c1611cC;
            } else {
                C1611C c1611c4 = c1611c3.f19872g;
                AbstractC3340k.b(c1611c4);
                c1611c4.b(c1611cC);
            }
            j13 -= c1611cC.f19868c - c1611cC.f19867b;
            c1611c2 = c1611c2.f19871f;
            j11 = 0;
        }
    }

    public final int hashCode() {
        C1611C c1611c = this.f19901a;
        if (c1611c == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i10 = c1611c.f19868c;
            for (int i11 = c1611c.f19867b; i11 < i10; i11++) {
                i5 = (i5 * 31) + c1611c.f19866a[i11];
            }
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
        } while (c1611c != this.f19901a);
        return i5;
    }

    public final long indexOf(byte b5, long j8, long j10) {
        C1611C c1611c;
        long j11 = 0;
        if (0 > j8 || j8 > j10) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f19902b);
            M6.A(sb2, " fromIndex=", j8, " toIndex=");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j12 = this.f19902b;
        if (j10 > j12) {
            j10 = j12;
        }
        if (j8 == j10 || (c1611c = this.f19901a) == null) {
            return -1L;
        }
        if (j12 - j8 < j8) {
            while (j12 > j8) {
                c1611c = c1611c.f19872g;
                AbstractC3340k.b(c1611c);
                j12 -= c1611c.f19868c - c1611c.f19867b;
            }
            while (j12 < j10) {
                int iMin = (int) Math.min(c1611c.f19868c, (c1611c.f19867b + j10) - j12);
                for (int i5 = (int) ((c1611c.f19867b + j8) - j12); i5 < iMin; i5++) {
                    if (c1611c.f19866a[i5] == b5) {
                        return (i5 - c1611c.f19867b) + j12;
                    }
                }
                j12 += c1611c.f19868c - c1611c.f19867b;
                c1611c = c1611c.f19871f;
                AbstractC3340k.b(c1611c);
                j8 = j12;
            }
            return -1L;
        }
        while (true) {
            long j13 = (c1611c.f19868c - c1611c.f19867b) + j11;
            if (j13 > j8) {
                break;
            }
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j11 = j13;
        }
        while (j11 < j10) {
            int iMin2 = (int) Math.min(c1611c.f19868c, (c1611c.f19867b + j10) - j11);
            for (int i10 = (int) ((c1611c.f19867b + j8) - j11); i10 < iMin2; i10++) {
                if (c1611c.f19866a[i10] == b5) {
                    return (i10 - c1611c.f19867b) + j11;
                }
            }
            j11 += c1611c.f19868c - c1611c.f19867b;
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j8 = j11;
        }
        return -1L;
    }

    @Override // cg.InterfaceC1620i
    public final InputStream inputStream() {
        return new C0351t(this, 2);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // cg.InterfaceC1620i
    public final long m(C1621j targetBytes) {
        AbstractC3340k.e(targetBytes, "targetBytes");
        return y(0L, targetBytes);
    }

    public final byte o(long j8) {
        AbstractC1613b.f(this.f19902b, j8, 1L);
        C1611C c1611c = this.f19901a;
        if (c1611c == null) {
            AbstractC3340k.b(null);
            throw null;
        }
        long j10 = this.f19902b;
        if (j10 - j8 < j8) {
            while (j10 > j8) {
                c1611c = c1611c.f19872g;
                AbstractC3340k.b(c1611c);
                j10 -= c1611c.f19868c - c1611c.f19867b;
            }
            return c1611c.f19866a[(int) ((c1611c.f19867b + j8) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i5 = c1611c.f19868c;
            int i10 = c1611c.f19867b;
            long j12 = (i5 - i10) + j11;
            if (j12 > j8) {
                return c1611c.f19866a[(int) ((i10 + j8) - j11)];
            }
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j11 = j12;
        }
    }

    @Override // cg.InterfaceC1619h
    public final long q(H source) {
        AbstractC3340k.e(source, "source");
        long j8 = 0;
        while (true) {
            long j10 = source.read(this, 8192L);
            if (j10 == -1) {
                return j8;
            }
            j8 += j10;
        }
    }

    @Override // cg.InterfaceC1620i
    public final int r(x options) throws EOFException {
        AbstractC3340k.e(options, "options");
        int iC = dg.a.c(this, options, false);
        if (iC == -1) {
            return -1;
        }
        skip(options.f19935a[iC].d());
        return iC;
    }

    @Override // cg.H
    public final long read(C1618g sink, long j8) {
        AbstractC3340k.e(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        long j10 = this.f19902b;
        if (j10 == 0) {
            return -1L;
        }
        if (j8 > j10) {
            j8 = j10;
        }
        sink.E(this, j8);
        return j8;
    }

    public final byte readByte() throws EOFException {
        if (this.f19902b == 0) {
            throw new EOFException();
        }
        C1611C c1611c = this.f19901a;
        AbstractC3340k.b(c1611c);
        int i5 = c1611c.f19867b;
        int i10 = c1611c.f19868c;
        int i11 = i5 + 1;
        byte b5 = c1611c.f19866a[i5];
        this.f19902b--;
        if (i11 != i10) {
            c1611c.f19867b = i11;
            return b5;
        }
        this.f19901a = c1611c.a();
        D.a(c1611c);
        return b5;
    }

    @Override // cg.InterfaceC1620i
    public final byte[] readByteArray() {
        return readByteArray(this.f19902b);
    }

    @Override // cg.InterfaceC1620i
    public final C1621j readByteString() {
        return z(this.f19902b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r1 = new cg.C1618g();
        r1.Y(r9);
        r1.X(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r12 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.readUtf8()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.C1618g.readDecimalLong():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4 A[EDGE_INSN: B:43:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r2 = 48
            r3 = 0
            r4 = 1
            long r5 = r0.f19902b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Lab
            r9 = r3
            r10 = r9
            r5 = r7
        L12:
            cg.C r11 = r0.f19901a
            kotlin.jvm.internal.AbstractC3340k.b(r11)
            int r12 = r11.f19867b
            int r13 = r11.f19868c
        L1b:
            if (r12 >= r13) goto L90
            byte[] r14 = r11.f19866a
            r14 = r14[r12]
            if (r14 < r2) goto L2a
            r15 = 57
            if (r14 > r15) goto L2a
            int r15 = r14 + (-48)
            goto L3f
        L2a:
            r15 = 97
            if (r14 < r15) goto L35
            r15 = 102(0x66, float:1.43E-43)
            if (r14 > r15) goto L35
            int r15 = r14 + (-87)
            goto L3f
        L35:
            r15 = 65
            if (r14 < r15) goto L68
            r15 = 70
            if (r14 > r15) goto L68
            int r15 = r14 + (-55)
        L3f:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r5 & r16
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 != 0) goto L4d
            long r5 = r5 << r1
            long r14 = (long) r15
            long r5 = r5 | r14
            int r12 = r12 + r4
            int r9 = r9 + r4
            goto L1b
        L4d:
            cg.g r1 = new cg.g
            r1.<init>()
            r1.Z(r5)
            r1.X(r14)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.readUtf8()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L68:
            if (r9 == 0) goto L6c
            r10 = r4
            goto L90
        L6c:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            char[] r5 = dg.b.f34289a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r5[r1]
            r6 = r14 & 15
            char r5 = r5[r6]
            r6 = 2
            char[] r6 = new char[r6]
            r6[r3] = r1
            r6[r4] = r5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L90:
            if (r12 != r13) goto L9c
            cg.C r12 = r11.a()
            r0.f19901a = r12
            cg.D.a(r11)
            goto L9e
        L9c:
            r11.f19867b = r12
        L9e:
            if (r10 != 0) goto La4
            cg.C r11 = r0.f19901a
            if (r11 != 0) goto L12
        La4:
            long r1 = r0.f19902b
            long r3 = (long) r9
            long r1 = r1 - r3
            r0.f19902b = r1
            return r5
        Lab:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.C1618g.readHexadecimalUnsignedLong():long");
    }

    public final int readInt() throws EOFException {
        if (this.f19902b < 4) {
            throw new EOFException();
        }
        C1611C c1611c = this.f19901a;
        AbstractC3340k.b(c1611c);
        int i5 = c1611c.f19867b;
        int i10 = c1611c.f19868c;
        if (i10 - i5 < 4) {
            return ((readByte() & ForkServer.ERROR) << 24) | ((readByte() & ForkServer.ERROR) << 16) | ((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR);
        }
        byte[] bArr = c1611c.f19866a;
        int i11 = i5 + 3;
        int i12 = ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
        int i13 = i5 + 4;
        int i14 = i12 | (bArr[i11] & ForkServer.ERROR);
        this.f19902b -= 4;
        if (i13 != i10) {
            c1611c.f19867b = i13;
            return i14;
        }
        this.f19901a = c1611c.a();
        D.a(c1611c);
        return i14;
    }

    public final short readShort() throws EOFException {
        if (this.f19902b < 2) {
            throw new EOFException();
        }
        C1611C c1611c = this.f19901a;
        AbstractC3340k.b(c1611c);
        int i5 = c1611c.f19867b;
        int i10 = c1611c.f19868c;
        if (i10 - i5 < 2) {
            return (short) (((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR));
        }
        int i11 = i5 + 1;
        byte[] bArr = c1611c.f19866a;
        int i12 = (bArr[i5] & ForkServer.ERROR) << 8;
        int i13 = i5 + 2;
        int i14 = (bArr[i11] & ForkServer.ERROR) | i12;
        this.f19902b -= 2;
        if (i13 == i10) {
            this.f19901a = c1611c.a();
            D.a(c1611c);
        } else {
            c1611c.f19867b = i13;
        }
        return (short) i14;
    }

    public final short readShortLe() throws EOFException {
        short s10 = readShort();
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    @Override // cg.InterfaceC1620i
    public final String readString(Charset charset) {
        return readString(this.f19902b, charset);
    }

    public final String readUtf8() {
        return readString(this.f19902b, Bf.a.f1670a);
    }

    @Override // cg.InterfaceC1620i
    public final boolean request(long j8) {
        return this.f19902b >= j8;
    }

    @Override // cg.InterfaceC1620i
    public final long s(C1621j bytes) {
        AbstractC3340k.e(bytes, "bytes");
        return w(0L, bytes);
    }

    @Override // cg.InterfaceC1620i
    public final void skip(long j8) throws EOFException {
        while (j8 > 0) {
            C1611C c1611c = this.f19901a;
            if (c1611c == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j8, c1611c.f19868c - c1611c.f19867b);
            long j10 = iMin;
            this.f19902b -= j10;
            j8 -= j10;
            int i5 = c1611c.f19867b + iMin;
            c1611c.f19867b = i5;
            if (i5 == c1611c.f19868c) {
                this.f19901a = c1611c.a();
                D.a(c1611c);
            }
        }
    }

    @Override // cg.H
    public final J timeout() {
        return J.f19879d;
    }

    public final String toString() {
        return D().toString();
    }

    @Override // cg.InterfaceC1619h
    public final /* bridge */ /* synthetic */ InterfaceC1619h u(C1621j c1621j) {
        Q(c1621j);
        return this;
    }

    public final long w(long j8, C1621j bytes) {
        AbstractC3340k.e(bytes, "bytes");
        byte[] bArr = bytes.f19904a;
        if (bArr.length <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j10 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "fromIndex < 0: ").toString());
        }
        C1611C c1611c = this.f19901a;
        if (c1611c == null) {
            return -1L;
        }
        long j11 = this.f19902b;
        if (j11 - j8 < j8) {
            while (j11 > j8) {
                c1611c = c1611c.f19872g;
                AbstractC3340k.b(c1611c);
                j11 -= c1611c.f19868c - c1611c.f19867b;
            }
            byte b5 = bArr[0];
            int length = bArr.length;
            long j12 = (this.f19902b - length) + 1;
            while (j11 < j12) {
                int iMin = (int) Math.min(c1611c.f19868c, (c1611c.f19867b + j12) - j11);
                for (int i5 = (int) ((c1611c.f19867b + j8) - j11); i5 < iMin; i5++) {
                    if (c1611c.f19866a[i5] == b5 && dg.a.a(c1611c, i5 + 1, bArr, length)) {
                        return (i5 - c1611c.f19867b) + j11;
                    }
                }
                j11 += c1611c.f19868c - c1611c.f19867b;
                c1611c = c1611c.f19871f;
                AbstractC3340k.b(c1611c);
                j8 = j11;
            }
            return -1L;
        }
        while (true) {
            long j13 = (c1611c.f19868c - c1611c.f19867b) + j10;
            if (j13 > j8) {
                break;
            }
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j10 = j13;
        }
        byte b10 = bArr[0];
        int length2 = bArr.length;
        long j14 = (this.f19902b - length2) + 1;
        while (j10 < j14) {
            int iMin2 = (int) Math.min(c1611c.f19868c, (c1611c.f19867b + j14) - j10);
            for (int i10 = (int) ((c1611c.f19867b + j8) - j10); i10 < iMin2; i10++) {
                if (c1611c.f19866a[i10] == b10 && dg.a.a(c1611c, i10 + 1, bArr, length2)) {
                    return (i10 - c1611c.f19867b) + j10;
                }
            }
            j10 += c1611c.f19868c - c1611c.f19867b;
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j8 = j10;
        }
        return -1L;
    }

    @Override // cg.InterfaceC1619h
    public final /* bridge */ /* synthetic */ InterfaceC1619h write(byte[] bArr) {
        V(bArr);
        return this;
    }

    @Override // cg.InterfaceC1619h
    public final /* bridge */ /* synthetic */ InterfaceC1619h writeByte(int i5) {
        X(i5);
        return this;
    }

    @Override // cg.InterfaceC1619h
    public final /* bridge */ /* synthetic */ InterfaceC1619h writeDecimalLong(long j8) {
        Y(j8);
        return this;
    }

    @Override // cg.InterfaceC1619h
    public final /* bridge */ /* synthetic */ InterfaceC1619h writeUtf8(String str) {
        d0(str);
        return this;
    }

    public final long y(long j8, C1621j targetBytes) {
        AbstractC3340k.e(targetBytes, "targetBytes");
        long j10 = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "fromIndex < 0: ").toString());
        }
        C1611C c1611c = this.f19901a;
        if (c1611c == null) {
            return -1L;
        }
        long j11 = this.f19902b;
        long j12 = j11 - j8;
        byte[] bArr = targetBytes.f19904a;
        if (j12 < j8) {
            while (j11 > j8) {
                c1611c = c1611c.f19872g;
                AbstractC3340k.b(c1611c);
                j11 -= c1611c.f19868c - c1611c.f19867b;
            }
            if (bArr.length == 2) {
                byte b5 = bArr[0];
                byte b10 = bArr[1];
                while (j11 < this.f19902b) {
                    int i5 = c1611c.f19868c;
                    for (int i10 = (int) ((c1611c.f19867b + j8) - j11); i10 < i5; i10++) {
                        byte b11 = c1611c.f19866a[i10];
                        if (b11 == b5 || b11 == b10) {
                            return (i10 - c1611c.f19867b) + j11;
                        }
                    }
                    j11 += c1611c.f19868c - c1611c.f19867b;
                    c1611c = c1611c.f19871f;
                    AbstractC3340k.b(c1611c);
                    j8 = j11;
                }
                return -1L;
            }
            while (j11 < this.f19902b) {
                int i11 = c1611c.f19868c;
                for (int i12 = (int) ((c1611c.f19867b + j8) - j11); i12 < i11; i12++) {
                    byte b12 = c1611c.f19866a[i12];
                    for (byte b13 : bArr) {
                        if (b12 == b13) {
                            return (i12 - c1611c.f19867b) + j11;
                        }
                    }
                }
                j11 += c1611c.f19868c - c1611c.f19867b;
                c1611c = c1611c.f19871f;
                AbstractC3340k.b(c1611c);
                j8 = j11;
            }
            return -1L;
        }
        while (true) {
            long j13 = (c1611c.f19868c - c1611c.f19867b) + j10;
            if (j13 > j8) {
                break;
            }
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j10 = j13;
        }
        if (bArr.length == 2) {
            byte b14 = bArr[0];
            byte b15 = bArr[1];
            while (j10 < this.f19902b) {
                int i13 = c1611c.f19868c;
                for (int i14 = (int) ((c1611c.f19867b + j8) - j10); i14 < i13; i14++) {
                    byte b16 = c1611c.f19866a[i14];
                    if (b16 == b14 || b16 == b15) {
                        return (i14 - c1611c.f19867b) + j10;
                    }
                }
                j10 += c1611c.f19868c - c1611c.f19867b;
                c1611c = c1611c.f19871f;
                AbstractC3340k.b(c1611c);
                j8 = j10;
            }
            return -1L;
        }
        while (j10 < this.f19902b) {
            int i15 = c1611c.f19868c;
            for (int i16 = (int) ((c1611c.f19867b + j8) - j10); i16 < i15; i16++) {
                byte b17 = c1611c.f19866a[i16];
                for (byte b18 : bArr) {
                    if (b17 == b18) {
                        return (i16 - c1611c.f19867b) + j10;
                    }
                }
            }
            j10 += c1611c.f19868c - c1611c.f19867b;
            c1611c = c1611c.f19871f;
            AbstractC3340k.b(c1611c);
            j8 = j10;
        }
        return -1L;
    }

    public final C1621j z(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        if (this.f19902b < j8) {
            throw new EOFException();
        }
        if (j8 < 4096) {
            return new C1621j(readByteArray(j8));
        }
        C1621j c1621jJ = J((int) j8);
        skip(j8);
        return c1621jJ;
    }

    public final String readString(long j8, Charset charset) throws EOFException {
        AbstractC3340k.e(charset, "charset");
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        if (this.f19902b < j8) {
            throw new EOFException();
        }
        if (j8 == 0) {
            return "";
        }
        C1611C c1611c = this.f19901a;
        AbstractC3340k.b(c1611c);
        int i5 = c1611c.f19867b;
        if (i5 + j8 > c1611c.f19868c) {
            return new String(readByteArray(j8), charset);
        }
        int i10 = (int) j8;
        String str = new String(c1611c.f19866a, i5, i10, charset);
        int i11 = c1611c.f19867b + i10;
        c1611c.f19867b = i11;
        this.f19902b -= j8;
        if (i11 == c1611c.f19868c) {
            this.f19901a = c1611c.a();
            D.a(c1611c);
        }
        return str;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC3340k.e(source, "source");
        int iRemaining = source.remaining();
        int i5 = iRemaining;
        while (i5 > 0) {
            C1611C c1611cP = P(1);
            int iMin = Math.min(i5, 8192 - c1611cP.f19868c);
            source.get(c1611cP.f19866a, c1611cP.f19868c, iMin);
            i5 -= iMin;
            c1611cP.f19868c += iMin;
        }
        this.f19902b += iRemaining;
        return iRemaining;
    }

    public final byte[] readByteArray(long j8) throws EOFException {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        if (this.f19902b >= j8) {
            byte[] sink = new byte[(int) j8];
            AbstractC3340k.e(sink, "sink");
            int i5 = 0;
            while (i5 < sink.length) {
                int i10 = read(sink, i5, sink.length - i5);
                if (i10 == -1) {
                    throw new EOFException();
                }
                i5 += i10;
            }
            return sink;
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC3340k.e(sink, "sink");
        C1611C c1611c = this.f19901a;
        if (c1611c == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c1611c.f19868c - c1611c.f19867b);
        sink.put(c1611c.f19866a, c1611c.f19867b, iMin);
        int i5 = c1611c.f19867b + iMin;
        c1611c.f19867b = i5;
        this.f19902b -= iMin;
        if (i5 == c1611c.f19868c) {
            this.f19901a = c1611c.a();
            D.a(c1611c);
        }
        return iMin;
    }

    public final int read(byte[] sink, int i5, int i10) {
        AbstractC3340k.e(sink, "sink");
        AbstractC1613b.f(sink.length, i5, i10);
        C1611C c1611c = this.f19901a;
        if (c1611c == null) {
            return -1;
        }
        int iMin = Math.min(i10, c1611c.f19868c - c1611c.f19867b);
        int i11 = c1611c.f19867b;
        ff.m.f0(i5, i11, i11 + iMin, c1611c.f19866a, sink);
        int i12 = c1611c.f19867b + iMin;
        c1611c.f19867b = i12;
        this.f19902b -= iMin;
        if (i12 == c1611c.f19868c) {
            this.f19901a = c1611c.a();
            D.a(c1611c);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, cg.F
    public final void close() {
    }

    @Override // cg.InterfaceC1619h, cg.F, java.io.Flushable
    public final void flush() {
    }

    @Override // cg.InterfaceC1620i
    public final C1618g getBuffer() {
        return this;
    }
}
