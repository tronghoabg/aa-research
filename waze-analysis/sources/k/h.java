package k;

import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.muxer.MuxerUtil;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class h implements Cloneable, ByteChannel, j, i {

    /* renamed from: a, reason: collision with root package name */
    public ai f50841a;

    /* renamed from: b, reason: collision with root package name */
    private long f50842b;

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final h clone() {
        h hVar = new h();
        if (this.f50842b == 0) {
            return hVar;
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        ai aiVarB = aiVar.b();
        hVar.f50841a = aiVarB;
        aiVarB.f50812g = aiVarB;
        aiVarB.f50811f = aiVarB.f50812g;
        for (ai aiVar2 = aiVar.f50811f; aiVar2 != aiVar; aiVar2 = aiVar2.f50811f) {
            ai aiVar3 = aiVarB.f50812g;
            h.g.b.x.c(aiVar3);
            h.g.b.x.c(aiVar2);
            aiVar3.d(aiVar2.b());
        }
        hVar.f50842b = this.f50842b;
        return hVar;
    }

    @Override // k.i
    public final /* bridge */ /* synthetic */ i C(byte[] bArr) {
        ap(bArr);
        return this;
    }

    @Override // k.i
    public final /* bridge */ /* synthetic */ i D(long j2) {
        as(j2);
        return this;
    }

    @Override // k.i
    public final /* bridge */ /* synthetic */ i E(String str) {
        ar(str);
        return this;
    }

    @Override // k.j
    public final j F() {
        return aq.f(new ac(this));
    }

    public final k G() {
        return H(this.f50842b);
    }

    @Override // k.j
    public final k H(long j2) throws EOFException {
        if (j2 < 0 || j2 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(o.b(j2, "byteCount: "));
        }
        if (this.f50842b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new k(U(j2));
        }
        k kVarJ = J((int) j2);
        Q(j2);
        return kVarJ;
    }

    public final k I() {
        long j2 = this.f50842b;
        if (j2 <= SieveCacheKt.NodeLinkMask) {
            return J((int) j2);
        }
        throw new IllegalStateException(o.b(j2, "size > Int.MAX_VALUE: "));
    }

    public final k J(int i2) {
        if (i2 == 0) {
            return k.f50843a;
        }
        okhttp3.internal.publicsuffix.a.g(this.f50842b, 0L, i2);
        ai aiVar = this.f50841a;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            h.g.b.x.c(aiVar);
            int i6 = aiVar.f50808c;
            int i7 = aiVar.f50807b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            aiVar = aiVar.f50811f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 + i5];
        ai aiVar2 = this.f50841a;
        int i8 = 0;
        while (i3 < i2) {
            h.g.b.x.c(aiVar2);
            bArr[i8] = aiVar2.f50806a;
            i3 += aiVar2.f50808c - aiVar2.f50807b;
            iArr[i8] = Math.min(i3, i2);
            iArr[bArr.length + i8] = aiVar2.f50807b;
            aiVar2.f50809d = true;
            i8++;
            aiVar2 = aiVar2.f50811f;
        }
        return new ak(bArr, iArr);
    }

    public final ai K(int i2) {
        if (i2 <= 0 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        ai aiVar = this.f50841a;
        if (aiVar == null) {
            ai aiVarA = aj.a();
            this.f50841a = aiVarA;
            aiVarA.f50812g = aiVarA;
            aiVarA.f50811f = aiVarA;
            return aiVarA;
        }
        ai aiVar2 = aiVar.f50812g;
        h.g.b.x.c(aiVar2);
        if (aiVar2.f50808c + i2 <= 8192 && aiVar2.f50810e) {
            return aiVar2;
        }
        ai aiVarA2 = aj.a();
        aiVar2.d(aiVarA2);
        return aiVarA2;
    }

    @Override // k.j
    public final short L() throws EOFException {
        int iC;
        if (this.f50842b < 2) {
            throw new EOFException();
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        int i2 = aiVar.f50807b;
        int i3 = aiVar.f50808c;
        if (i3 - i2 < 2) {
            iC = (c() & 255) | ((c() & 255) << 8);
        } else {
            byte[] bArr = aiVar.f50806a;
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = bArr[i2 + 1] & 255;
            this.f50842b -= 2;
            int i6 = i2 + 2;
            if (i6 == i3) {
                this.f50841a = aiVar.a();
                aj.b(aiVar);
            } else {
                aiVar.f50807b = i6;
            }
            iC = i4 | i5;
        }
        return (short) iC;
    }

    @Override // k.j
    public final short M() throws EOFException {
        short sL = L();
        int i2 = sL >>> 8;
        return (short) (((sL & 255) << 8) | (i2 & 255));
    }

    public final void N() {
        Q(this.f50842b);
    }

    @Override // k.j
    public final void O(long j2) throws EOFException {
        if (this.f50842b < j2) {
            throw new EOFException();
        }
    }

    public final void P(long j2) {
        this.f50842b = j2;
    }

    @Override // k.j
    public final void Q(long j2) {
        while (j2 > 0) {
            ai aiVar = this.f50841a;
            if (aiVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, aiVar.f50808c - aiVar.f50807b);
            long j3 = iMin;
            this.f50842b -= j3;
            j2 -= j3;
            int i2 = aiVar.f50807b + iMin;
            aiVar.f50807b = i2;
            if (i2 == aiVar.f50808c) {
                this.f50841a = aiVar.a();
                aj.b(aiVar);
            }
        }
    }

    @Override // k.j
    public final boolean R() {
        return this.f50842b == 0;
    }

    @Override // k.j
    public final boolean S(long j2) {
        return this.f50842b >= j2;
    }

    @Override // k.j
    public final byte[] T() {
        return U(this.f50842b);
    }

    @Override // k.j
    public final byte[] U(long j2) throws EOFException {
        if (j2 < 0 || j2 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(o.b(j2, "byteCount: "));
        }
        if (this.f50842b < j2) {
            throw new EOFException();
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        h.g.b.x.f(bArr, "sink");
        int i3 = 0;
        while (i3 < i2) {
            int iD = d(bArr, i3, i2 - i3);
            if (iD == -1) {
                throw new EOFException();
            }
            i3 += iD;
        }
        return bArr;
    }

    public final void V(h hVar, long j2, long j3) {
        h.g.b.x.f(hVar, "out");
        long j4 = j2;
        okhttp3.internal.publicsuffix.a.g(this.f50842b, j4, j3);
        if (j3 == 0) {
            return;
        }
        hVar.f50842b += j3;
        ai aiVar = this.f50841a;
        while (true) {
            h.g.b.x.c(aiVar);
            long j5 = aiVar.f50808c - aiVar.f50807b;
            if (j4 < j5) {
                break;
            }
            aiVar = aiVar.f50811f;
            j4 -= j5;
        }
        long j6 = j3;
        while (j6 > 0) {
            h.g.b.x.c(aiVar);
            ai aiVarB = aiVar.b();
            int i2 = aiVarB.f50807b + ((int) j4);
            aiVarB.f50807b = i2;
            aiVarB.f50808c = Math.min(i2 + ((int) j6), aiVarB.f50808c);
            ai aiVar2 = hVar.f50841a;
            if (aiVar2 == null) {
                aiVarB.f50812g = aiVarB;
                aiVarB.f50811f = aiVarB.f50812g;
                hVar.f50841a = aiVarB.f50811f;
            } else {
                ai aiVar3 = aiVar2.f50812g;
                h.g.b.x.c(aiVar3);
                aiVar3.d(aiVarB);
            }
            j6 -= aiVarB.f50808c - aiVarB.f50807b;
            aiVar = aiVar.f50811f;
            j4 = 0;
        }
    }

    public final boolean W(k kVar) {
        h.g.b.x.f(kVar, "bytes");
        return X(0L, kVar, kVar.d());
    }

    public final boolean X(long j2, k kVar, int i2) {
        h.g.b.x.f(kVar, "bytes");
        if (i2 >= 0 && j2 >= 0 && i2 + j2 <= this.f50842b && i2 <= kVar.d()) {
            return i2 == 0 || k.a.a.e(this, kVar, j2, j2 + 1, i2) != -1;
        }
        return false;
    }

    @Override // k.i
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final void Z(k kVar) {
        h.g.b.x.f(kVar, "byteString");
        kVar.x(this, kVar.d());
    }

    @Override // k.am
    public final long a(h hVar, long j2) {
        h.g.b.x.f(hVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "byteCount < 0: "));
        }
        long j3 = this.f50842b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        hVar.l(this, j2);
        return j2;
    }

    public final void aa(byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "source");
        long j2 = i3;
        okhttp3.internal.publicsuffix.a.g(bArr.length, i2, j2);
        int i4 = i2;
        while (true) {
            int i5 = i2 + i3;
            if (i4 >= i5) {
                this.f50842b += j2;
                return;
            }
            ai aiVarK = K(1);
            int iMin = Math.min(i5 - i4, 8192 - aiVarK.f50808c);
            int i6 = i4 + iMin;
            h.a.c.an(bArr, aiVarK.f50806a, aiVarK.f50808c, i4, i6);
            aiVarK.f50808c += iMin;
            i4 = i6;
        }
    }

    @Override // k.i
    public final /* bridge */ /* synthetic */ void ab(byte[] bArr, int i2) {
        aa(bArr, 0, i2);
    }

    @Override // k.i
    public final void ac(am amVar) {
        h.g.b.x.f(amVar, "source");
        while (amVar.a(this, 8192L) != -1) {
        }
    }

    @Override // k.i
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final void ae(int i2) {
        ai aiVarK = K(1);
        byte[] bArr = aiVarK.f50806a;
        int i3 = aiVarK.f50808c;
        aiVarK.f50808c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f50842b++;
    }

    @Override // k.i
    /* renamed from: ag, reason: merged with bridge method [inline-methods] */
    public final void ah(int i2) {
        ai aiVarK = K(4);
        byte[] bArr = aiVarK.f50806a;
        int i3 = aiVarK.f50808c;
        bArr[i3] = (byte) (i2 >> 24);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        aiVarK.f50808c = i3 + 4;
        this.f50842b += 4;
    }

    @Override // k.i
    /* renamed from: ai, reason: merged with bridge method [inline-methods] */
    public final void aj(int i2) {
        ai aiVarK = K(2);
        byte[] bArr = aiVarK.f50806a;
        int i3 = aiVarK.f50808c;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        aiVarK.f50808c = i3 + 2;
        this.f50842b += 2;
    }

    public final void ak(OutputStream outputStream, long j2) throws IOException {
        h.g.b.x.f(outputStream, "out");
        okhttp3.internal.publicsuffix.a.g(this.f50842b, 0L, j2);
        ai aiVar = this.f50841a;
        long j3 = j2;
        while (j3 > 0) {
            h.g.b.x.c(aiVar);
            int iMin = (int) Math.min(j3, aiVar.f50808c - aiVar.f50807b);
            outputStream.write(aiVar.f50806a, aiVar.f50807b, iMin);
            int i2 = aiVar.f50807b + iMin;
            aiVar.f50807b = i2;
            long j4 = iMin;
            this.f50842b -= j4;
            j3 -= j4;
            if (i2 == aiVar.f50808c) {
                ai aiVarA = aiVar.a();
                this.f50841a = aiVarA;
                aj.b(aiVar);
                aiVar = aiVarA;
            }
        }
    }

    @Override // k.i
    /* renamed from: am, reason: merged with bridge method [inline-methods] */
    public final void an(String str, int i2, int i3) {
        h.g.b.x.f(str, TypedValues.Custom.S_STRING);
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i2);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                ai aiVarK = K(1);
                byte[] bArr = aiVarK.f50806a;
                int i5 = aiVarK.f50808c - i2;
                int iMin = Math.min(i3, 8192 - i5);
                bArr[i2 + i5] = (byte) cCharAt;
                i2 = i4;
                while (i2 < iMin) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i2 + i5] = (byte) cCharAt2;
                    i2++;
                }
                int i6 = aiVarK.f50808c;
                int i7 = (i5 + i2) - i6;
                aiVarK.f50808c = i6 + i7;
                this.f50842b += i7;
            } else {
                if (cCharAt < 2048) {
                    ai aiVarK2 = K(2);
                    byte[] bArr2 = aiVarK2.f50806a;
                    int i8 = aiVarK2.f50808c;
                    bArr2[i8] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((cCharAt & '?') | 128);
                    aiVarK2.f50808c = i8 + 2;
                    this.f50842b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    ai aiVarK3 = K(3);
                    byte[] bArr3 = aiVarK3.f50806a;
                    int i9 = aiVarK3.f50808c;
                    bArr3[i9] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt & '?') | 128);
                    aiVarK3.f50808c = i9 + 3;
                    this.f50842b += 3;
                } else {
                    char cCharAt3 = i4 < i3 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        ae(63);
                    } else {
                        ai aiVarK4 = K(4);
                        byte[] bArr4 = aiVarK4.f50806a;
                        int i10 = aiVarK4.f50808c;
                        int i11 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i10] = (byte) ((i11 >> 18) | 240);
                        bArr4[i10 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i10 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i10 + 3] = (byte) ((i11 & 63) | 128);
                        aiVarK4.f50808c = i10 + 4;
                        this.f50842b += 4;
                        i2 += 2;
                    }
                }
                i2 = i4;
            }
        }
    }

    public final void ao(int i2) {
        if (i2 < 128) {
            ae(i2);
            return;
        }
        if (i2 < 2048) {
            ai aiVarK = K(2);
            byte[] bArr = aiVarK.f50806a;
            int i3 = aiVarK.f50808c;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            aiVarK.f50808c = i3 + 2;
            this.f50842b += 2;
            return;
        }
        if (i2 >= 55296 && i2 < 57344) {
            ae(63);
            return;
        }
        if (i2 < 65536) {
            ai aiVarK2 = K(3);
            byte[] bArr2 = aiVarK2.f50806a;
            int i4 = aiVarK2.f50808c;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            aiVarK2.f50808c = i4 + 3;
            this.f50842b += 3;
            return;
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(okhttp3.internal.publicsuffix.a.f(i2)));
        }
        ai aiVarK3 = K(4);
        byte[] bArr3 = aiVarK3.f50806a;
        int i5 = aiVarK3.f50808c;
        bArr3[i5] = (byte) ((i2 >> 18) | 240);
        bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
        bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
        bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
        aiVarK3.f50808c = i5 + 4;
        this.f50842b += 4;
    }

    public final void ap(byte[] bArr) {
        h.g.b.x.f(bArr, "source");
        aa(bArr, 0, bArr.length);
    }

    @Override // k.i
    /* renamed from: aq, reason: merged with bridge method [inline-methods] */
    public final void af(long j2) {
        if (j2 == 0) {
            ae(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) >> 2);
        ai aiVarK = K(i2);
        byte[] bArr = aiVarK.f50806a;
        int i3 = aiVarK.f50808c;
        int i4 = i3 + i2;
        while (true) {
            i4--;
            if (i4 < i3) {
                aiVarK.f50808c += i2;
                this.f50842b += i2;
                return;
            } else {
                bArr[i4] = k.a.a.d()[(int) (15 & j2)];
                j2 >>>= 4;
            }
        }
    }

    public final void ar(String str) {
        h.g.b.x.f(str, TypedValues.Custom.S_STRING);
        an(str, 0, str.length());
    }

    public final void as(long j2) {
        boolean z;
        if (j2 == 0) {
            ae(48);
            return;
        }
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                ar("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        int iA = k.a.a.a(j2);
        if (z) {
            iA++;
        }
        ai aiVarK = K(iA);
        byte[] bArr = aiVarK.f50806a;
        int i2 = aiVarK.f50808c + iA;
        while (j2 != 0) {
            i2--;
            bArr[i2] = k.a.a.d()[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z) {
            bArr[i2 - 1] = StylePropertiesKt.FontSynthesisId;
        }
        aiVarK.f50808c += iA;
        this.f50842b += iA;
    }

    public final byte b(long j2) {
        okhttp3.internal.publicsuffix.a.g(this.f50842b, j2, 1L);
        ai aiVar = this.f50841a;
        if (aiVar == null) {
            h.g.b.x.c(null);
            throw null;
        }
        long j3 = this.f50842b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                aiVar = aiVar.f50812g;
                h.g.b.x.c(aiVar);
                j3 -= aiVar.f50808c - aiVar.f50807b;
            }
            h.g.b.x.c(aiVar);
            return aiVar.f50806a[(int) ((aiVar.f50807b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            long j5 = (aiVar.f50808c - aiVar.f50807b) + j4;
            if (j5 > j2) {
                h.g.b.x.c(aiVar);
                return aiVar.f50806a[(int) ((aiVar.f50807b + j2) - j4)];
            }
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
            j4 = j5;
        }
    }

    @Override // k.j
    public final byte c() {
        if (this.f50842b == 0) {
            throw new EOFException();
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        int i2 = aiVar.f50807b;
        int i3 = aiVar.f50808c;
        int i4 = i2 + 1;
        byte b2 = aiVar.f50806a[i2];
        this.f50842b--;
        if (i4 != i3) {
            aiVar.f50807b = i4;
            return b2;
        }
        this.f50841a = aiVar.a();
        aj.b(aiVar);
        return b2;
    }

    public final int d(byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "sink");
        okhttp3.internal.publicsuffix.a.g(bArr.length, i2, i3);
        ai aiVar = this.f50841a;
        if (aiVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, aiVar.f50808c - aiVar.f50807b);
        int i4 = aiVar.f50807b;
        h.a.c.an(aiVar.f50806a, bArr, i2, i4, i4 + iMin);
        int i5 = aiVar.f50807b + iMin;
        aiVar.f50807b = i5;
        this.f50842b -= iMin;
        if (i5 != aiVar.f50808c) {
            return iMin;
        }
        this.f50841a = aiVar.a();
        aj.b(aiVar);
        return iMin;
    }

    @Override // k.j
    public final int e() throws EOFException {
        if (this.f50842b < 4) {
            throw new EOFException();
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        int i2 = aiVar.f50807b;
        int i3 = aiVar.f50808c;
        if (i3 - i2 < 4) {
            return (c() & 255) | ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8);
        }
        byte[] bArr = aiVar.f50806a;
        int i4 = (bArr[i2] & 255) << 24;
        int i5 = (bArr[i2 + 1] & 255) << 16;
        int i6 = (bArr[i2 + 2] & 255) << 8;
        this.f50842b -= 4;
        int i7 = (bArr[i2 + 3] & 255) | i5 | i4 | i6;
        int i8 = i2 + 4;
        if (i8 != i3) {
            aiVar.f50807b = i8;
            return i7;
        }
        this.f50841a = aiVar.a();
        aj.b(aiVar);
        return i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        long j2 = this.f50842b;
        h hVar = (h) obj;
        if (j2 != hVar.f50842b) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        ai aiVar2 = hVar.f50841a;
        h.g.b.x.c(aiVar2);
        int i2 = aiVar.f50807b;
        int i3 = aiVar2.f50807b;
        long j3 = 0;
        while (j3 < this.f50842b) {
            long jMin = Math.min(aiVar.f50808c - i2, aiVar2.f50808c - i3);
            long j4 = 0;
            while (j4 < jMin) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (aiVar.f50806a[i2] != aiVar2.f50806a[i3]) {
                    return false;
                }
                j4++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == aiVar.f50808c) {
                aiVar = aiVar.f50811f;
                h.g.b.x.c(aiVar);
                i2 = aiVar.f50807b;
            }
            if (i3 == aiVar2.f50808c) {
                aiVar2 = aiVar2.f50811f;
                h.g.b.x.c(aiVar2);
                i3 = aiVar2.f50807b;
            }
            j3 += jMin;
        }
        return true;
    }

    @Override // k.j
    public final int f() throws EOFException {
        int iE = e();
        int i2 = iE >>> 24;
        int i3 = 16711680 & iE;
        int i4 = 65280 & iE;
        return ((iE & 255) << 24) | i2 | (i3 >>> 8) | (i4 << 8);
    }

    @Override // k.j
    public final int g(z zVar) {
        h.g.b.x.f(zVar, "options");
        int iB = k.a.a.b(this, zVar, false);
        if (iB == -1) {
            return -1;
        }
        Q(zVar.b()[iB].d());
        return iB;
    }

    @Override // k.am
    public final ao h() {
        return ao.f50818c;
    }

    public final int hashCode() {
        ai aiVar = this.f50841a;
        if (aiVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = aiVar.f50808c;
            for (int i4 = aiVar.f50807b; i4 < i3; i4++) {
                i2 = (i2 * 31) + aiVar.f50806a[i4];
            }
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
        } while (aiVar != this.f50841a);
        return i2;
    }

    public final long i() {
        long j2 = this.f50842b;
        if (j2 == 0) {
            return 0L;
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        ai aiVar2 = aiVar.f50812g;
        h.g.b.x.c(aiVar2);
        return (aiVar2.f50808c >= 8192 || !aiVar2.f50810e) ? j2 : j2 - (r2 - aiVar2.f50807b);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // k.j
    public final long j(k kVar) {
        h.g.b.x.f(kVar, "bytes");
        h.g.b.x.f(kVar, "bytes");
        h.g.b.x.f(kVar, "bytes");
        int i2 = k.a.a.f50743a;
        return k.a.a.e(this, kVar, 0L, Long.MAX_VALUE, kVar.d());
    }

    public final long k(byte b2, long j2, long j3) {
        ai aiVar;
        long j4 = j2;
        long j5 = j3;
        long j6 = 0;
        if (j4 < 0 || j4 > j5) {
            throw new IllegalArgumentException("size=" + this.f50842b + " fromIndex=" + j4 + " toIndex=" + j5);
        }
        long j7 = this.f50842b;
        if (j5 > j7) {
            j5 = j7;
        }
        long j8 = -1;
        if (j4 == j5 || (aiVar = this.f50841a) == null) {
            return -1L;
        }
        if (j7 - j4 < j4) {
            while (j7 > j4) {
                aiVar = aiVar.f50812g;
                h.g.b.x.c(aiVar);
                j7 -= aiVar.f50808c - aiVar.f50807b;
            }
            if (aiVar == null) {
                return -1L;
            }
            while (j7 < j5) {
                byte[] bArr = aiVar.f50806a;
                long j9 = j8;
                int iMin = (int) Math.min(aiVar.f50808c, (aiVar.f50807b + j5) - j7);
                for (int i2 = (int) ((aiVar.f50807b + j4) - j7); i2 < iMin; i2++) {
                    if (bArr[i2] == b2) {
                        return (i2 - aiVar.f50807b) + j7;
                    }
                }
                j7 += aiVar.f50808c - aiVar.f50807b;
                aiVar = aiVar.f50811f;
                h.g.b.x.c(aiVar);
                j8 = j9;
                j4 = j7;
            }
            return j8;
        }
        while (true) {
            long j10 = (aiVar.f50808c - aiVar.f50807b) + j6;
            if (j10 > j4) {
                break;
            }
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
            j6 = j10;
        }
        if (aiVar == null) {
            return -1L;
        }
        while (j6 < j5) {
            byte[] bArr2 = aiVar.f50806a;
            int iMin2 = (int) Math.min(aiVar.f50808c, (aiVar.f50807b + j5) - j6);
            for (int i3 = (int) ((aiVar.f50807b + j4) - j6); i3 < iMin2; i3++) {
                if (bArr2[i3] == b2) {
                    return (i3 - aiVar.f50807b) + j6;
                }
            }
            j6 += aiVar.f50808c - aiVar.f50807b;
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
            j4 = j6;
        }
        return -1L;
    }

    @Override // k.al
    public final void l(h hVar, long j2) {
        ai aiVarB;
        h.g.b.x.f(hVar, "source");
        if (hVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        okhttp3.internal.publicsuffix.a.g(hVar.f50842b, 0L, j2);
        while (j2 > 0) {
            ai aiVar = hVar.f50841a;
            h.g.b.x.c(aiVar);
            int i2 = aiVar.f50808c;
            ai aiVar2 = hVar.f50841a;
            h.g.b.x.c(aiVar2);
            long j3 = i2 - aiVar2.f50807b;
            int i3 = 0;
            if (j2 < j3) {
                ai aiVar3 = this.f50841a;
                ai aiVar4 = aiVar3 != null ? aiVar3.f50812g : null;
                int i4 = (int) j2;
                if (aiVar4 != null && aiVar4.f50810e) {
                    if ((aiVar4.f50808c + j2) - (aiVar4.f50809d ? 0 : aiVar4.f50807b) <= 8192) {
                        ai aiVar5 = hVar.f50841a;
                        h.g.b.x.c(aiVar5);
                        aiVar5.c(aiVar4, i4);
                        hVar.f50842b -= j2;
                        this.f50842b += j2;
                        return;
                    }
                }
                ai aiVar6 = hVar.f50841a;
                h.g.b.x.c(aiVar6);
                if (i4 > aiVar6.f50808c - aiVar6.f50807b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    aiVarB = aiVar6.b();
                } else {
                    byte[] bArr = aiVar6.f50806a;
                    ai aiVarA = aj.a();
                    byte[] bArr2 = aiVarA.f50806a;
                    int i5 = aiVar6.f50807b;
                    h.a.c.an(bArr, bArr2, 0, i5, i5 + i4);
                    aiVarB = aiVarA;
                }
                aiVarB.f50808c = aiVarB.f50807b + i4;
                aiVar6.f50807b += i4;
                ai aiVar7 = aiVar6.f50812g;
                h.g.b.x.c(aiVar7);
                aiVar7.d(aiVarB);
                hVar.f50841a = aiVarB;
            }
            ai aiVar8 = hVar.f50841a;
            h.g.b.x.c(aiVar8);
            int i6 = aiVar8.f50808c - aiVar8.f50807b;
            hVar.f50841a = aiVar8.a();
            ai aiVar9 = this.f50841a;
            if (aiVar9 == null) {
                this.f50841a = aiVar8;
                aiVar8.f50812g = aiVar8;
                aiVar8.f50811f = aiVar8.f50812g;
            } else {
                ai aiVar10 = aiVar9.f50812g;
                h.g.b.x.c(aiVar10);
                aiVar10.d(aiVar8);
                ai aiVar11 = aiVar8.f50812g;
                if (aiVar11 == aiVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                h.g.b.x.c(aiVar11);
                if (aiVar11.f50810e) {
                    int i7 = aiVar8.f50808c - aiVar8.f50807b;
                    ai aiVar12 = aiVar8.f50812g;
                    h.g.b.x.c(aiVar12);
                    int i8 = 8192 - aiVar12.f50808c;
                    ai aiVar13 = aiVar8.f50812g;
                    h.g.b.x.c(aiVar13);
                    if (!aiVar13.f50809d) {
                        ai aiVar14 = aiVar8.f50812g;
                        h.g.b.x.c(aiVar14);
                        i3 = aiVar14.f50807b;
                    }
                    if (i7 <= i8 + i3) {
                        ai aiVar15 = aiVar8.f50812g;
                        h.g.b.x.c(aiVar15);
                        aiVar8.c(aiVar15, i7);
                        aiVar8.a();
                        aj.b(aiVar8);
                    }
                }
            }
            long j4 = i6;
            hVar.f50842b -= j4;
            this.f50842b += j4;
            j2 -= j4;
        }
    }

    @Override // k.j
    public final long m(k kVar) {
        h.g.b.x.f(kVar, "targetBytes");
        return n(kVar, 0L);
    }

    public final long n(k kVar, long j2) {
        h.g.b.x.f(kVar, "targetBytes");
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "fromIndex < 0: "));
        }
        ai aiVar = this.f50841a;
        if (aiVar == null) {
            return -1L;
        }
        long j4 = this.f50842b;
        if (j4 - j2 < j2) {
            while (j4 > j2) {
                aiVar = aiVar.f50812g;
                h.g.b.x.c(aiVar);
                j4 -= aiVar.f50808c - aiVar.f50807b;
            }
            if (aiVar == null) {
                return -1L;
            }
            if (kVar.d() == 2) {
                byte bA = kVar.a(0);
                byte bA2 = kVar.a(1);
                while (j4 < this.f50842b) {
                    byte[] bArr = aiVar.f50806a;
                    long j5 = aiVar.f50807b + j2;
                    int i2 = aiVar.f50808c;
                    for (int i3 = (int) (j5 - j4); i3 < i2; i3++) {
                        byte b2 = bArr[i3];
                        if (b2 == bA || b2 == bA2) {
                            return (i3 - aiVar.f50807b) + j4;
                        }
                    }
                    j4 += aiVar.f50808c - aiVar.f50807b;
                    aiVar = aiVar.f50811f;
                    h.g.b.x.c(aiVar);
                    j2 = j4;
                }
                return -1L;
            }
            byte[] bArrQ = kVar.q();
            while (j4 < this.f50842b) {
                byte[] bArr2 = aiVar.f50806a;
                long j6 = aiVar.f50807b + j2;
                int i4 = aiVar.f50808c;
                for (int i5 = (int) (j6 - j4); i5 < i4; i5++) {
                    byte b3 = bArr2[i5];
                    for (byte b4 : bArrQ) {
                        if (b3 == b4) {
                            return (i5 - aiVar.f50807b) + j4;
                        }
                    }
                }
                j4 += aiVar.f50808c - aiVar.f50807b;
                aiVar = aiVar.f50811f;
                h.g.b.x.c(aiVar);
                j2 = j4;
            }
            return -1L;
        }
        while (true) {
            long j7 = (aiVar.f50808c - aiVar.f50807b) + j3;
            if (j7 > j2) {
                break;
            }
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
            j3 = j7;
        }
        if (aiVar == null) {
            return -1L;
        }
        if (kVar.d() == 2) {
            byte bA3 = kVar.a(0);
            byte bA4 = kVar.a(1);
            while (j3 < this.f50842b) {
                byte[] bArr3 = aiVar.f50806a;
                long j8 = aiVar.f50807b + j2;
                int i6 = aiVar.f50808c;
                for (int i7 = (int) (j8 - j3); i7 < i6; i7++) {
                    byte b5 = bArr3[i7];
                    if (b5 == bA3 || b5 == bA4) {
                        return (i7 - aiVar.f50807b) + j3;
                    }
                }
                j3 += aiVar.f50808c - aiVar.f50807b;
                aiVar = aiVar.f50811f;
                h.g.b.x.c(aiVar);
                j2 = j3;
            }
            return -1L;
        }
        byte[] bArrQ2 = kVar.q();
        while (j3 < this.f50842b) {
            byte[] bArr4 = aiVar.f50806a;
            long j9 = aiVar.f50807b + j2;
            int i8 = aiVar.f50808c;
            for (int i9 = (int) (j9 - j3); i9 < i8; i9++) {
                byte b6 = bArr4[i9];
                for (byte b7 : bArrQ2) {
                    if (b6 == b7) {
                        return (i9 - aiVar.f50807b) + j3;
                    }
                }
            }
            j3 += aiVar.f50808c - aiVar.f50807b;
            aiVar = aiVar.f50811f;
            h.g.b.x.c(aiVar);
            j2 = j3;
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[EDGE_INSN: B:45:0x00a9->B:39:0x00a9 BREAK  A[LOOP:0: B:5:0x000c->B:47:?], SYNTHETIC] */
    @Override // k.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f50842b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            k.ai r7 = r15.f50841a
            h.g.b.x.c(r7)
            byte[] r8 = r7.f50806a
            int r9 = r7.f50807b
            int r10 = r7.f50808c
        L17:
            if (r9 >= r10) goto L93
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r1 = r1 + 1
            int r9 = r9 + 1
            goto L17
        L4b:
            k.h r15 = new k.h
            r15.<init>()
            r15.af(r4)
            r15.ae(r11)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r15 = r15.v()
            java.lang.String r1 = "Number too large: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L93
        L6a:
            int r15 = r11 >> 4
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            char[] r2 = k.a.b.a()
            r15 = r15 & 15
            char r15 = r2[r15]
            r2 = r11 & 15
            char[] r3 = k.a.b.a()
            char r2 = r3[r2]
            r3 = 2
            char[] r3 = new char[r3]
            r3[r0] = r15
            r3[r6] = r2
            java.lang.String r15 = h.n.o.i(r3)
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r15 = r0.concat(r15)
            r1.<init>(r15)
            throw r1
        L93:
            if (r9 != r10) goto L9f
            k.ai r8 = r7.a()
            r15.f50841a = r8
            k.aj.b(r7)
            goto La1
        L9f:
            r7.f50807b = r9
        La1:
            if (r6 != 0) goto La9
            k.ai r7 = r15.f50841a
            if (r7 == 0) goto La9
            goto Lc
        La9:
            long r2 = r15.f50842b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f50842b = r2
            return r4
        Lb0:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h.o():long");
    }

    @Override // k.j
    public final long p() throws EOFException {
        char c2;
        char c3;
        char c4;
        char c5;
        long j2;
        long jE;
        if (this.f50842b < 8) {
            throw new EOFException();
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        int i2 = aiVar.f50807b;
        int i3 = aiVar.f50808c;
        if (i3 - i2 < 8) {
            jE = ((e() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) << 32) | (e() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            c4 = '8';
            j2 = 255;
            c2 = 24;
            c3 = '(';
            c5 = '\b';
        } else {
            byte[] bArr = aiVar.f50806a;
            long j3 = (bArr[i2] & 255) << 56;
            c2 = 24;
            c3 = '(';
            long j4 = bArr[i2 + 1] & 255;
            c4 = '8';
            c5 = '\b';
            long j5 = (bArr[i2 + 2] & 255) << 40;
            j2 = 255;
            long j6 = (bArr[i2 + 3] & 255) << 32;
            long j7 = (bArr[i2 + 4] & 255) << 24;
            long j8 = bArr[i2 + 5] & 255;
            long j9 = (bArr[i2 + 6] & 255) << 8;
            this.f50842b -= 8;
            long j10 = (j4 << 48) | j3 | j5 | j6 | j7 | (j8 << 16) | j9 | (bArr[i2 + 7] & 255);
            int i4 = i2 + 8;
            if (i4 == i3) {
                this.f50841a = aiVar.a();
                aj.b(aiVar);
            } else {
                aiVar.f50807b = i4;
            }
            jE = j10;
        }
        return ((jE & (-72057594037927936L)) >>> c4) | ((jE & 71776119061217280L) >>> c3) | ((280375465082880L & jE) >>> c2) | ((1095216660480L & jE) >>> c5) | ((4278190080L & jE) << c5) | ((16711680 & jE) << c2) | ((65280 & jE) << c3) | ((jE & j2) << c4);
    }

    public final long q() {
        return this.f50842b;
    }

    @Override // k.j
    public final InputStream r() {
        return new f(this);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        h.g.b.x.f(byteBuffer, "sink");
        ai aiVar = this.f50841a;
        if (aiVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), aiVar.f50808c - aiVar.f50807b);
        byteBuffer.put(aiVar.f50806a, aiVar.f50807b, iMin);
        int i2 = aiVar.f50807b + iMin;
        aiVar.f50807b = i2;
        this.f50842b -= iMin;
        if (i2 == aiVar.f50808c) {
            this.f50841a = aiVar.a();
            aj.b(aiVar);
        }
        return iMin;
    }

    @Override // k.i
    public final OutputStream s() {
        return new g(this);
    }

    @Override // k.j
    public final String t(Charset charset) {
        h.g.b.x.f(charset, "charset");
        return u(this.f50842b, charset);
    }

    public final String toString() {
        return I().toString();
    }

    public final String u(long j2, Charset charset) throws EOFException {
        h.g.b.x.f(charset, "charset");
        if (j2 < 0 || j2 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(o.b(j2, "byteCount: "));
        }
        if (this.f50842b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        ai aiVar = this.f50841a;
        h.g.b.x.c(aiVar);
        int i2 = aiVar.f50807b;
        int i3 = aiVar.f50808c;
        if (i2 + j2 > i3) {
            return new String(U(j2), charset);
        }
        int i4 = (int) j2;
        String str = new String(aiVar.f50806a, i2, i4, charset);
        int i5 = i2 + i4;
        aiVar.f50807b = i5;
        this.f50842b -= j2;
        if (i5 == i3) {
            this.f50841a = aiVar.a();
            aj.b(aiVar);
        }
        return str;
    }

    public final String v() {
        return u(this.f50842b, h.n.a.f48221b);
    }

    @Override // k.j
    public final String w(long j2) {
        return u(j2, h.n.a.f48221b);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        h.g.b.x.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            ai aiVarK = K(1);
            int iMin = Math.min(i2, 8192 - aiVarK.f50808c);
            byteBuffer.get(aiVarK.f50806a, aiVarK.f50808c, iMin);
            i2 -= iMin;
            aiVarK.f50808c += iMin;
        }
        this.f50842b += iRemaining;
        return iRemaining;
    }

    @Override // k.j
    public final String x() {
        return y(Long.MAX_VALUE);
    }

    @Override // k.j
    public final String y(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "limit < 0: "));
        }
        long j3 = j2 != Long.MAX_VALUE ? 1 + j2 : Long.MAX_VALUE;
        long jK = k((byte) 10, 0L, j3);
        if (jK != -1) {
            return k.a.a.c(this, jK);
        }
        if (j3 < this.f50842b && b(j3 - 1) == 13 && b(j3) == 10) {
            return k.a.a.c(this, j3);
        }
        h hVar = new h();
        V(hVar, 0L, Math.min(32L, this.f50842b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f50842b, j2) + " content=" + hVar.G().h() + "…");
    }

    @Override // k.j
    public final h B() {
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, k.am
    public final void close() {
    }

    @Override // k.i, k.al, java.io.Flushable
    public final void flush() {
    }

    @Override // k.j
    public final h z() {
        return this;
    }
}
