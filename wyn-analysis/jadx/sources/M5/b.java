package M5;

import E5.o0;
import J5.h;
import J5.k;
import J5.l;
import J5.n;
import J5.o;
import J5.p;
import J5.t;
import J5.w;
import J5.y;
import S3.e;
import U8.v0;
import W5.c;
import a.AbstractC1304a;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import l8.AbstractC3409K;
import org.apache.tika.fork.ForkServer;
import u6.v;
import y3.C4552j;

/* loaded from: classes3.dex */
public final class b implements k {

    /* renamed from: e, reason: collision with root package name */
    public C2584N f7505e;

    /* renamed from: f, reason: collision with root package name */
    public w f7506f;

    /* renamed from: h, reason: collision with root package name */
    public c f7508h;

    /* renamed from: i, reason: collision with root package name */
    public p f7509i;

    /* renamed from: j, reason: collision with root package name */
    public int f7510j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public a f7511l;

    /* renamed from: m, reason: collision with root package name */
    public int f7512m;

    /* renamed from: n, reason: collision with root package name */
    public long f7513n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7501a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final Y4.b f7502b = new Y4.b(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7503c = false;

    /* renamed from: d, reason: collision with root package name */
    public final n f7504d = new n();

    /* renamed from: g, reason: collision with root package name */
    public int f7507g = 0;

    @Override // J5.k
    public final void a(long j8, long j10) {
        if (j8 == 0) {
            this.f7507g = 0;
        } else {
            a aVar = this.f7511l;
            if (aVar != null) {
                aVar.D(j10);
            }
        }
        this.f7513n = j10 != 0 ? -1L : 0L;
        this.f7512m = 0;
        this.f7502b.x(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, byte, int] */
    @Override // J5.k
    public final int g(l lVar, n nVar) throws o0, EOFException, InterruptedIOException {
        int i5;
        p pVar;
        c cVar;
        int i10;
        t oVar;
        long j8;
        long j10;
        boolean z2;
        long j11;
        boolean zO;
        boolean z10 = true;
        int i11 = this.f7507g;
        c cVar2 = null;
        if (i11 == 0) {
            ((h) lVar).f5648f = 0;
            h hVar = (h) lVar;
            long jG = hVar.g();
            c cVarO = new C4552j(13).o(hVar, !this.f7503c ? null : b6.h.f19349c);
            if (cVarO != null && cVarO.f15149a.length != 0) {
                cVar2 = cVarO;
            }
            hVar.j((int) (hVar.g() - jG));
            this.f7508h = cVar2;
            this.f7507g = 1;
            return 0;
        }
        byte[] bArr = this.f7501a;
        if (i11 == 1) {
            ((h) lVar).c(bArr, 0, bArr.length, false);
            ((h) lVar).f5648f = 0;
            this.f7507g = 2;
            return 0;
        }
        int i12 = 24;
        if (i11 == 2) {
            ((h) lVar).f(new byte[4], 0, 4, false);
            if ((((r1[2] & 255) << 8) | ((r1[0] & 255) << 24) | ((r1[1] & 255) << 16) | (r1[3] & 255)) != 1716281667) {
                throw o0.a("Failed to read FLAC stream marker.", null);
            }
            this.f7507g = 3;
            return 0;
        }
        int i13 = 7;
        if (i11 == 3) {
            ?? r15 = 0;
            p pVar2 = this.f7509i;
            boolean z11 = false;
            while (!z11) {
                ((h) lVar).f5648f = r15;
                byte[] bArr2 = new byte[4];
                y yVar = new y(bArr2, 4, 6, (byte) r15);
                h hVar2 = (h) lVar;
                hVar2.c(bArr2, r15, 4, r15);
                boolean zH = yVar.h();
                int i14 = yVar.i(i13);
                int i15 = yVar.i(i12) + 4;
                if (i14 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.f(bArr3, r15, 38, r15);
                    pVar2 = new p(bArr3, 4, r15);
                    i5 = i12;
                } else {
                    if (pVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i14 == 3) {
                        Y4.b bVar = new Y4.b(i15);
                        hVar2.f(bVar.f16679a, r15, i15, r15);
                        i5 = i12;
                        pVar = new p(pVar2.f5660b, pVar2.f5661c, pVar2.f5662d, pVar2.f5663e, pVar2.f5664f, pVar2.f5666h, pVar2.f5667i, pVar2.k, AbstractC1304a.H(bVar), (c) pVar2.f5670m);
                    } else {
                        i5 = i12;
                        c cVarC = (c) pVar2.f5670m;
                        if (i14 == 4) {
                            Y4.b bVar2 = new Y4.b(i15);
                            hVar2.f(bVar2.f16679a, 0, i15, false);
                            bVar2.B(4);
                            c cVarM0 = android.support.v4.media.session.b.m0(Arrays.asList((String[]) android.support.v4.media.session.b.p0(bVar2, false, false).f10967a));
                            if (cVarC == null) {
                                cVar = cVarM0;
                            } else {
                                if (cVarM0 != null) {
                                    cVarC = cVarC.c(cVarM0.f15149a);
                                }
                                cVar = cVarC;
                            }
                            pVar = new p(pVar2.f5660b, pVar2.f5661c, pVar2.f5662d, pVar2.f5663e, pVar2.f5664f, pVar2.f5666h, pVar2.f5667i, pVar2.k, (e) pVar2.f5669l, cVar);
                        } else if (i14 == 6) {
                            Y4.b bVar3 = new Y4.b(i15);
                            hVar2.f(bVar3.f16679a, 0, i15, false);
                            bVar3.B(4);
                            c cVar3 = new c(AbstractC3409K.n(Z5.a.c(bVar3)));
                            if (cVarC != null) {
                                cVar3 = cVarC.c(cVar3.f15149a);
                            }
                            pVar = new p(pVar2.f5660b, pVar2.f5661c, pVar2.f5662d, pVar2.f5663e, pVar2.f5664f, pVar2.f5666h, pVar2.f5667i, pVar2.k, (e) pVar2.f5669l, cVar3);
                        } else {
                            hVar2.j(i15);
                        }
                    }
                    pVar2 = pVar;
                }
                int i16 = v.f46721a;
                this.f7509i = pVar2;
                z11 = zH;
                i12 = i5;
                i13 = 7;
                r15 = 0;
            }
            this.f7509i.getClass();
            this.f7510j = Math.max(this.f7509i.f5662d, 6);
            w wVar = this.f7506f;
            int i17 = v.f46721a;
            wVar.a(this.f7509i.d(bArr, this.f7508h));
            this.f7507g = 4;
            return 0;
        }
        long j12 = 0;
        if (i11 == 4) {
            ((h) lVar).f5648f = 0;
            byte[] bArr4 = new byte[2];
            h hVar3 = (h) lVar;
            hVar3.c(bArr4, 0, 2, false);
            int i18 = (bArr4[1] & ForkServer.ERROR) | ((bArr4[0] & ForkServer.ERROR) << 8);
            if ((i18 >> 2) != 16382) {
                hVar3.f5648f = 0;
                throw o0.a("First frame does not start with sync code.", null);
            }
            hVar3.f5648f = 0;
            this.k = i18;
            C2584N c2584n = this.f7505e;
            int i19 = v.f46721a;
            long j13 = hVar3.f5646d;
            this.f7509i.getClass();
            p pVar3 = this.f7509i;
            if (((e) pVar3.f5669l) != null) {
                oVar = new o(pVar3, j13, 0);
                i10 = 0;
            } else {
                long j14 = hVar3.f5645c;
                if (j14 == -1 || pVar3.k <= 0) {
                    i10 = 0;
                    oVar = new o(pVar3.c());
                } else {
                    int i20 = this.k;
                    B8.b bVar4 = new B8.b(pVar3, 22);
                    E4.n nVar2 = new E4.n(pVar3, i20);
                    long jC = pVar3.c();
                    int i21 = pVar3.f5662d;
                    int i22 = pVar3.f5663e;
                    if (i22 > 0) {
                        i10 = 0;
                        j8 = j13;
                        j10 = ((i22 + i21) / 2) + 1;
                    } else {
                        i10 = 0;
                        j8 = j13;
                        int i23 = pVar3.f5661c;
                        int i24 = pVar3.f5660b;
                        j10 = 64 + (((((i24 != i23 || i24 <= 0) ? 4096L : i24) * pVar3.f5666h) * pVar3.f5667i) / 8);
                    }
                    a aVar = new a(bVar4, nVar2, jC, pVar3.k, j8, j14, j10, Math.max(6, i21));
                    this.f7511l = aVar;
                    oVar = (J5.a) aVar.f5634c;
                }
            }
            c2584n.x(oVar);
            this.f7507g = 5;
            return i10;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f7506f.getClass();
        this.f7509i.getClass();
        a aVar2 = this.f7511l;
        if (aVar2 != null && ((J5.b) aVar2.f5636e) != null) {
            return aVar2.u((h) lVar, nVar);
        }
        if (this.f7513n == -1) {
            p pVar4 = this.f7509i;
            ((h) lVar).f5648f = 0;
            h hVar4 = (h) lVar;
            hVar4.b(1, false);
            byte[] bArr5 = new byte[1];
            hVar4.c(bArr5, 0, 1, false);
            boolean z12 = (bArr5[0] & 1) == 1;
            hVar4.b(2, false);
            int i25 = z12 ? 7 : 6;
            Y4.b bVar5 = new Y4.b(i25);
            byte[] bArr6 = bVar5.f16679a;
            int i26 = 0;
            while (i26 < i25) {
                int iM = hVar4.m(i26, i25 - i26, bArr6);
                if (iM == -1) {
                    break;
                }
                i26 += iM;
            }
            bVar5.z(i26);
            hVar4.f5648f = 0;
            try {
                long jW = bVar5.w();
                if (!z12) {
                    jW *= pVar4.f5661c;
                }
                j12 = jW;
            } catch (NumberFormatException unused) {
                z10 = false;
            }
            if (!z10) {
                throw o0.a(null, null);
            }
            this.f7513n = j12;
        } else {
            Y4.b bVar6 = this.f7502b;
            int i27 = bVar6.f16681c;
            if (i27 < 32768) {
                int i28 = ((h) lVar).read(bVar6.f16679a, i27, 32768 - i27);
                z2 = i28 == -1;
                if (!z2) {
                    bVar6.z(i27 + i28);
                } else if (bVar6.a() == 0) {
                    long j15 = this.f7513n * 1000000;
                    p pVar5 = this.f7509i;
                    int i29 = v.f46721a;
                    this.f7506f.b(j15 / pVar5.f5664f, 1, this.f7512m, 0, null);
                    return -1;
                }
            } else {
                z2 = false;
            }
            int i30 = bVar6.f16680b;
            int i31 = this.f7512m;
            int i32 = this.f7510j;
            if (i31 < i32) {
                bVar6.B(Math.min(i32 - i31, bVar6.a()));
            }
            this.f7509i.getClass();
            int i33 = bVar6.f16680b;
            while (true) {
                int i34 = bVar6.f16681c - 16;
                n nVar3 = this.f7504d;
                if (i33 <= i34) {
                    bVar6.A(i33);
                    if (v0.o(bVar6, this.f7509i, this.k, nVar3)) {
                        bVar6.A(i33);
                        j11 = nVar3.f5655a;
                        break;
                    }
                    i33++;
                } else {
                    if (z2) {
                        while (true) {
                            int i35 = bVar6.f16681c;
                            if (i33 > i35 - this.f7510j) {
                                bVar6.A(i35);
                                break;
                            }
                            bVar6.A(i33);
                            try {
                                zO = v0.o(bVar6, this.f7509i, this.k, nVar3);
                            } catch (IndexOutOfBoundsException unused2) {
                                zO = false;
                            }
                            if (bVar6.f16680b > bVar6.f16681c) {
                                zO = false;
                            }
                            if (zO) {
                                bVar6.A(i33);
                                j11 = nVar3.f5655a;
                                break;
                            }
                            i33++;
                        }
                    } else {
                        bVar6.A(i33);
                    }
                    j11 = -1;
                }
            }
            int i36 = bVar6.f16680b - i30;
            bVar6.A(i30);
            this.f7506f.c(i36, bVar6);
            int i37 = this.f7512m + i36;
            this.f7512m = i37;
            if (j11 != -1) {
                long j16 = this.f7513n * 1000000;
                p pVar6 = this.f7509i;
                int i38 = v.f46721a;
                this.f7506f.b(j16 / pVar6.f5664f, 1, i37, 0, null);
                this.f7512m = 0;
                this.f7513n = j11;
            }
            if (bVar6.a() < 16) {
                int iA = bVar6.a();
                byte[] bArr7 = bVar6.f16679a;
                System.arraycopy(bArr7, bVar6.f16680b, bArr7, 0, iA);
                bVar6.A(0);
                bVar6.z(iA);
            }
        }
        return 0;
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f7505e = c2584n;
        this.f7506f = c2584n.m(0, 1);
        c2584n.l();
    }

    @Override // J5.k
    public final boolean i(l lVar) throws EOFException, InterruptedIOException {
        h hVar = (h) lVar;
        c cVarO = new C4552j(13).o(hVar, b6.h.f19349c);
        if (cVarO != null) {
            int length = cVarO.f15149a.length;
        }
        byte[] bArr = new byte[4];
        hVar.c(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    @Override // J5.k
    public final void release() {
    }
}
