package f6;

import A7.B1;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o2.C3643a;
import t6.C4133a;

/* loaded from: classes3.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34970a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f34971b;

    /* renamed from: c, reason: collision with root package name */
    public long f34972c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f34973d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f34974e;

    /* renamed from: f, reason: collision with root package name */
    public Object f34975f;

    /* renamed from: g, reason: collision with root package name */
    public Object f34976g;

    /* renamed from: h, reason: collision with root package name */
    public Object f34977h;

    public S(o2.e eVar) {
        this.f34973d = eVar;
        int i5 = eVar.f41282c;
        this.f34971b = i5;
        this.f34974e = new Q1.o(32);
        B1 b12 = new B1(i5, 4, 0L);
        this.f34975f = b12;
        this.f34976g = b12;
        this.f34977h = b12;
    }

    private final void c(long j8) {
        B1 b12;
        if (j8 == -1) {
            return;
        }
        while (true) {
            b12 = (B1) this.f34975f;
            if (j8 < b12.f424c) {
                break;
            }
            o2.e eVar = (o2.e) this.f34973d;
            C4133a c4133a = (C4133a) b12.f425d;
            synchronized (eVar) {
                C4133a[] c4133aArr = (C4133a[]) eVar.f41286g;
                int i5 = eVar.f41285f;
                eVar.f41285f = i5 + 1;
                c4133aArr[i5] = c4133a;
                eVar.f41284e--;
                eVar.notifyAll();
            }
            B1 b13 = (B1) this.f34975f;
            b13.f425d = null;
            B1 b14 = (B1) b13.f426e;
            b13.f426e = null;
            this.f34975f = b14;
        }
        if (((B1) this.f34976g).f423b < b12.f423b) {
            this.f34976g = b12;
        }
    }

    private final int e(int i5) {
        C4133a c4133a;
        B1 b12 = (B1) this.f34977h;
        if (((C4133a) b12.f425d) == null) {
            o2.e eVar = (o2.e) this.f34973d;
            synchronized (eVar) {
                try {
                    int i10 = eVar.f41284e + 1;
                    eVar.f41284e = i10;
                    int i11 = eVar.f41285f;
                    if (i11 > 0) {
                        C4133a[] c4133aArr = (C4133a[]) eVar.f41286g;
                        int i12 = i11 - 1;
                        eVar.f41285f = i12;
                        c4133a = c4133aArr[i12];
                        c4133a.getClass();
                        ((C4133a[]) eVar.f41286g)[eVar.f41285f] = null;
                    } else {
                        C4133a c4133a2 = new C4133a(new byte[eVar.f41282c], 0);
                        C4133a[] c4133aArr2 = (C4133a[]) eVar.f41286g;
                        if (i10 > c4133aArr2.length) {
                            eVar.f41286g = (C4133a[]) Arrays.copyOf(c4133aArr2, c4133aArr2.length * 2);
                        }
                        c4133a = c4133a2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            B1 b13 = new B1(this.f34971b, 3, ((B1) this.f34977h).f424c);
            b12.f425d = c4133a;
            b12.f426e = b13;
        }
        return Math.min(i5, (int) (((B1) this.f34977h).f424c - this.f34972c));
    }

    public static B1 f(B1 b12, long j8, ByteBuffer byteBuffer, int i5) {
        while (j8 >= b12.f424c) {
            b12 = (B1) b12.f426e;
        }
        while (i5 > 0) {
            int iMin = Math.min(i5, (int) (b12.f424c - j8));
            C4133a c4133a = (C4133a) b12.f425d;
            byteBuffer.put(c4133a.f45852a, ((int) (j8 - b12.f423b)) + c4133a.f45853b, iMin);
            i5 -= iMin;
            j8 += iMin;
            if (j8 == b12.f424c) {
                b12 = (B1) b12.f426e;
            }
        }
        return b12;
    }

    public static B1 g(B1 b12, long j8, byte[] bArr, int i5) {
        while (j8 >= b12.f424c) {
            b12 = (B1) b12.f426e;
        }
        int i10 = i5;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (b12.f424c - j8));
            C4133a c4133a = (C4133a) b12.f425d;
            System.arraycopy(c4133a.f45852a, ((int) (j8 - b12.f423b)) + c4133a.f45853b, bArr, i5 - i10, iMin);
            i10 -= iMin;
            j8 += iMin;
            if (j8 == b12.f424c) {
                b12 = (B1) b12.f426e;
            }
        }
        return b12;
    }

    public static B1 h(B1 b12, long j8, ByteBuffer byteBuffer, int i5) {
        while (j8 >= b12.f424c) {
            b12 = (B1) b12.f426e;
        }
        while (i5 > 0) {
            int iMin = Math.min(i5, (int) (b12.f424c - j8));
            C3643a c3643a = (C3643a) b12.f425d;
            byteBuffer.put(c3643a.f41270a, ((int) (j8 - b12.f423b)) + c3643a.f41271b, iMin);
            i5 -= iMin;
            j8 += iMin;
            if (j8 == b12.f424c) {
                b12 = (B1) b12.f426e;
            }
        }
        return b12;
    }

    public static B1 i(B1 b12, long j8, byte[] bArr, int i5) {
        while (j8 >= b12.f424c) {
            b12 = (B1) b12.f426e;
        }
        int i10 = i5;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (b12.f424c - j8));
            C3643a c3643a = (C3643a) b12.f425d;
            System.arraycopy(c3643a.f41270a, ((int) (j8 - b12.f423b)) + c3643a.f41271b, bArr, i5 - i10, iMin);
            i10 -= iMin;
            j8 += iMin;
            if (j8 == b12.f424c) {
                b12 = (B1) b12.f426e;
            }
        }
        return b12;
    }

    public static B1 j(B1 b12, H5.h hVar, c2.g gVar, Y4.b bVar) {
        int iV;
        if (hVar.h(1073741824)) {
            long j8 = gVar.f19562b;
            bVar.x(1);
            B1 b1G = g(b12, j8, bVar.f16679a, 1);
            long j10 = j8 + 1;
            byte b5 = bVar.f16679a[0];
            boolean z2 = (b5 & 128) != 0;
            int i5 = b5 & 127;
            H5.c cVar = hVar.f4916c;
            byte[] bArr = cVar.f4894a;
            if (bArr == null) {
                cVar.f4894a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            b12 = g(b1G, j10, cVar.f4894a, i5);
            long j11 = j10 + i5;
            if (z2) {
                bVar.x(2);
                b12 = g(b12, j11, bVar.f16679a, 2);
                j11 += 2;
                iV = bVar.v();
            } else {
                iV = 1;
            }
            int[] iArr = cVar.f4897d;
            if (iArr == null || iArr.length < iV) {
                iArr = new int[iV];
            }
            int[] iArr2 = cVar.f4898e;
            if (iArr2 == null || iArr2.length < iV) {
                iArr2 = new int[iV];
            }
            if (z2) {
                int i10 = iV * 6;
                bVar.x(i10);
                b12 = g(b12, j11, bVar.f16679a, i10);
                j11 += i10;
                bVar.A(0);
                for (int i11 = 0; i11 < iV; i11++) {
                    iArr[i11] = bVar.v();
                    iArr2[i11] = bVar.t();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f19561a - ((int) (j11 - gVar.f19562b));
            }
            J5.v vVar = (J5.v) gVar.f19563c;
            int i12 = u6.v.f46721a;
            byte[] bArr2 = vVar.f5684b;
            byte[] bArr3 = cVar.f4894a;
            cVar.f4899f = iV;
            cVar.f4897d = iArr;
            cVar.f4898e = iArr2;
            cVar.f4895b = bArr2;
            cVar.f4894a = bArr3;
            int i13 = vVar.f5683a;
            cVar.f4896c = i13;
            int i14 = vVar.f5685c;
            cVar.f4900g = i14;
            int i15 = vVar.f5686d;
            cVar.f4901h = i15;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f4902i;
            cryptoInfo.numSubSamples = iV;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (u6.v.f46721a >= 24) {
                S3.c cVar2 = (S3.c) cVar.f4903j;
                cVar2.getClass();
                ((MediaCodec.CryptoInfo.Pattern) cVar2.f10937c).set(i14, i15);
                ((MediaCodec.CryptoInfo) cVar2.f10936b).setPattern((MediaCodec.CryptoInfo.Pattern) cVar2.f10937c);
            }
            long j12 = gVar.f19562b;
            int i16 = (int) (j11 - j12);
            gVar.f19562b = j12 + i16;
            gVar.f19561a -= i16;
        }
        if (!hVar.h(268435456)) {
            hVar.r(gVar.f19561a);
            return f(b12, gVar.f19562b, hVar.f4917d, gVar.f19561a);
        }
        bVar.x(4);
        B1 b1G2 = g(b12, gVar.f19562b, bVar.f16679a, 4);
        int iT = bVar.t();
        gVar.f19562b += 4;
        gVar.f19561a -= 4;
        hVar.r(iT);
        B1 b1F = f(b1G2, gVar.f19562b, hVar.f4917d, iT);
        gVar.f19562b += iT;
        int i17 = gVar.f19561a - iT;
        gVar.f19561a = i17;
        ByteBuffer byteBuffer = hVar.f4920g;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            hVar.f4920g = ByteBuffer.allocate(i17);
        } else {
            hVar.f4920g.clear();
        }
        return f(b1F, gVar.f19562b, hVar.f4920g, gVar.f19561a);
    }

    public static B1 k(B1 b12, T1.d dVar, c2.g gVar, Q1.o oVar) {
        int iA;
        if (dVar.h(1073741824)) {
            long j8 = gVar.f19562b;
            oVar.D(1);
            B1 b1I = i(b12, j8, oVar.f9702a, 1);
            long j10 = j8 + 1;
            byte b5 = oVar.f9702a[0];
            boolean z2 = (b5 & 128) != 0;
            int i5 = b5 & 127;
            H5.c cVar = dVar.f11357d;
            byte[] bArr = cVar.f4894a;
            if (bArr == null) {
                cVar.f4894a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            b12 = i(b1I, j10, cVar.f4894a, i5);
            long j11 = j10 + i5;
            if (z2) {
                oVar.D(2);
                b12 = i(b12, j11, oVar.f9702a, 2);
                j11 += 2;
                iA = oVar.A();
            } else {
                iA = 1;
            }
            int[] iArr = cVar.f4897d;
            if (iArr == null || iArr.length < iA) {
                iArr = new int[iA];
            }
            int[] iArr2 = cVar.f4898e;
            if (iArr2 == null || iArr2.length < iA) {
                iArr2 = new int[iA];
            }
            if (z2) {
                int i10 = iA * 6;
                oVar.D(i10);
                b12 = i(b12, j11, oVar.f9702a, i10);
                j11 += i10;
                oVar.G(0);
                for (int i11 = 0; i11 < iA; i11++) {
                    iArr[i11] = oVar.A();
                    iArr2[i11] = oVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = gVar.f19561a - ((int) (j11 - gVar.f19562b));
            }
            s2.B b10 = (s2.B) gVar.f19563c;
            int i12 = Q1.x.f9724a;
            byte[] bArr2 = b10.f44828b;
            byte[] bArr3 = cVar.f4894a;
            cVar.f4899f = iA;
            cVar.f4897d = iArr;
            cVar.f4898e = iArr2;
            cVar.f4895b = bArr2;
            cVar.f4894a = bArr3;
            int i13 = b10.f44827a;
            cVar.f4896c = i13;
            int i14 = b10.f44829c;
            cVar.f4900g = i14;
            int i15 = b10.f44830d;
            cVar.f4901h = i15;
            MediaCodec.CryptoInfo cryptoInfo = cVar.f4902i;
            cryptoInfo.numSubSamples = iA;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Q1.x.f9724a >= 24) {
                S3.e eVar = (S3.e) cVar.f4903j;
                eVar.getClass();
                ((MediaCodec.CryptoInfo.Pattern) eVar.f10942c).set(i14, i15);
                ((MediaCodec.CryptoInfo) eVar.f10941b).setPattern((MediaCodec.CryptoInfo.Pattern) eVar.f10942c);
            }
            long j12 = gVar.f19562b;
            int i16 = (int) (j11 - j12);
            gVar.f19562b = j12 + i16;
            gVar.f19561a -= i16;
        }
        if (!dVar.h(268435456)) {
            dVar.r(gVar.f19561a);
            return h(b12, gVar.f19562b, dVar.f11358e, gVar.f19561a);
        }
        oVar.D(4);
        B1 b1I2 = i(b12, gVar.f19562b, oVar.f9702a, 4);
        int iY = oVar.y();
        gVar.f19562b += 4;
        gVar.f19561a -= 4;
        dVar.r(iY);
        B1 b1H = h(b1I2, gVar.f19562b, dVar.f11358e, iY);
        gVar.f19562b += iY;
        int i17 = gVar.f19561a - iY;
        gVar.f19561a = i17;
        ByteBuffer byteBuffer = dVar.f11361h;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            dVar.f11361h = ByteBuffer.allocate(i17);
        } else {
            dVar.f11361h.clear();
        }
        return h(b1H, gVar.f19562b, dVar.f11361h, gVar.f19561a);
    }

    public void a(B1 b12) {
        if (((C3643a) b12.f425d) == null) {
            return;
        }
        o2.e eVar = (o2.e) this.f34973d;
        synchronized (eVar) {
            B1 b13 = b12;
            while (b13 != null) {
                try {
                    C3643a[] c3643aArr = (C3643a[]) eVar.f41286g;
                    int i5 = eVar.f41285f;
                    eVar.f41285f = i5 + 1;
                    C3643a c3643a = (C3643a) b13.f425d;
                    c3643a.getClass();
                    c3643aArr[i5] = c3643a;
                    eVar.f41284e--;
                    b13 = (B1) b13.f426e;
                    if (b13 == null || ((C3643a) b13.f425d) == null) {
                        b13 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar.notifyAll();
        }
        b12.f425d = null;
        b12.f426e = null;
    }

    public final void b(long j8) {
        switch (this.f34970a) {
            case 0:
                c(j8);
                return;
            default:
                if (j8 == -1) {
                    return;
                }
                while (true) {
                    B1 b12 = (B1) this.f34975f;
                    if (j8 < b12.f424c) {
                        if (((B1) this.f34976g).f423b < b12.f423b) {
                            this.f34976g = b12;
                            return;
                        }
                        return;
                    }
                    o2.e eVar = (o2.e) this.f34973d;
                    C3643a c3643a = (C3643a) b12.f425d;
                    synchronized (eVar) {
                        C3643a[] c3643aArr = (C3643a[]) eVar.f41286g;
                        int i5 = eVar.f41285f;
                        eVar.f41285f = i5 + 1;
                        c3643aArr[i5] = c3643a;
                        eVar.f41284e--;
                        eVar.notifyAll();
                    }
                    B1 b13 = (B1) this.f34975f;
                    b13.f425d = null;
                    B1 b14 = (B1) b13.f426e;
                    b13.f426e = null;
                    this.f34975f = b14;
                }
        }
    }

    public final int d(int i5) {
        C3643a c3643a;
        switch (this.f34970a) {
            case 0:
                return e(i5);
            default:
                B1 b12 = (B1) this.f34977h;
                if (((C3643a) b12.f425d) == null) {
                    o2.e eVar = (o2.e) this.f34973d;
                    synchronized (eVar) {
                        try {
                            int i10 = eVar.f41284e + 1;
                            eVar.f41284e = i10;
                            int i11 = eVar.f41285f;
                            if (i11 > 0) {
                                C3643a[] c3643aArr = (C3643a[]) eVar.f41286g;
                                int i12 = i11 - 1;
                                eVar.f41285f = i12;
                                c3643a = c3643aArr[i12];
                                c3643a.getClass();
                                ((C3643a[]) eVar.f41286g)[eVar.f41285f] = null;
                            } else {
                                C3643a c3643a2 = new C3643a(new byte[eVar.f41282c], 0);
                                C3643a[] c3643aArr2 = (C3643a[]) eVar.f41286g;
                                if (i10 > c3643aArr2.length) {
                                    eVar.f41286g = (C3643a[]) Arrays.copyOf(c3643aArr2, c3643aArr2.length * 2);
                                }
                                c3643a = c3643a2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    B1 b13 = new B1(this.f34971b, 4, ((B1) this.f34977h).f424c);
                    b12.f425d = c3643a;
                    b12.f426e = b13;
                }
                return Math.min(i5, (int) (((B1) this.f34977h).f424c - this.f34972c));
        }
    }

    public S(o2.e eVar, byte b5) {
        this.f34973d = eVar;
        int i5 = eVar.f41282c;
        this.f34971b = i5;
        this.f34974e = new Y4.b(32);
        B1 b12 = new B1(i5, 3, 0L);
        this.f34975f = b12;
        this.f34976g = b12;
        this.f34977h = b12;
    }
}
