package x2;

import G2.i;
import J5.b;
import J5.n;
import J5.p;
import J5.y;
import N1.B;
import N1.D;
import Q1.x;
import Y2.s;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import o1.C3641c;
import s2.AbstractC3991a;
import s2.C;
import s2.d;
import s2.j;
import s2.m;
import s2.o;
import s2.q;
import s2.w;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4457a implements m {

    /* renamed from: e, reason: collision with root package name */
    public o f47662e;

    /* renamed from: f, reason: collision with root package name */
    public C f47663f;

    /* renamed from: h, reason: collision with root package name */
    public B f47665h;

    /* renamed from: i, reason: collision with root package name */
    public p f47666i;

    /* renamed from: j, reason: collision with root package name */
    public int f47667j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public s f47668l;

    /* renamed from: m, reason: collision with root package name */
    public int f47669m;

    /* renamed from: n, reason: collision with root package name */
    public long f47670n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f47658a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final Q1.o f47659b = new Q1.o(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47660c = false;

    /* renamed from: d, reason: collision with root package name */
    public final n f47661d = new n();

    /* renamed from: g, reason: collision with root package name */
    public int f47664g = 0;

    @Override // s2.m
    public final void a(long j8, long j10) {
        if (j8 == 0) {
            this.f47664g = 0;
        } else {
            s sVar = this.f47668l;
            if (sVar != null) {
                sVar.D(j10);
            }
        }
        this.f47670n = j10 != 0 ? -1L : 0L;
        this.f47669m = 0;
        this.f47659b.D(0);
    }

    @Override // s2.m
    public final void g(o oVar) {
        this.f47662e = oVar;
        this.f47663f = oVar.mo0m(0, 1);
        oVar.l();
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) throws EOFException, InterruptedIOException {
        j jVar = (j) nVar;
        B bA = new X2.a(1).a(jVar, i.f4183c);
        if (bA != null) {
            int length = bA.f8023a.length;
        }
        Q1.o oVar = new Q1.o(4);
        jVar.c(oVar.f9702a, 0, 4, false);
        return oVar.w() == 1716281667;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    @Override // s2.m
    public final int k(s2.n nVar, n nVar2) throws EOFException, InterruptedIOException, D {
        p pVar;
        int i5;
        w qVar;
        long j8;
        long j10;
        boolean z2;
        long j11;
        boolean zD;
        int i10 = 1;
        int i11 = this.f47664g;
        B b5 = null;
        if (i11 == 0) {
            ((j) nVar).f44900f = 0;
            j jVar = (j) nVar;
            long jG = jVar.g();
            B bA = new X2.a(1).a(jVar, !this.f47660c ? null : i.f4183c);
            if (bA != null && bA.f8023a.length != 0) {
                b5 = bA;
            }
            jVar.j((int) (jVar.g() - jG));
            this.f47665h = b5;
            this.f47664g = 1;
            return 0;
        }
        byte[] bArr = this.f47658a;
        if (i11 == 1) {
            ((j) nVar).c(bArr, 0, bArr.length, false);
            ((j) nVar).f44900f = 0;
            this.f47664g = 2;
            return 0;
        }
        if (i11 == 2) {
            Q1.o oVar = new Q1.o(4);
            ((j) nVar).f(oVar.f9702a, 0, 4, false);
            if (oVar.w() != 1716281667) {
                throw D.a(null, "Failed to read FLAC stream marker.");
            }
            this.f47664g = 3;
            return 0;
        }
        if (i11 == 3) {
            ?? r12 = 0;
            p pVar2 = this.f47666i;
            boolean z10 = false;
            while (!z10) {
                ((j) nVar).f44900f = r12;
                byte[] bArr2 = new byte[4];
                y yVar = new y(bArr2, 4, i10, (byte) r12);
                j jVar2 = (j) nVar;
                jVar2.c(bArr2, r12, 4, r12);
                boolean zH = yVar.h();
                int i12 = yVar.i(i);
                int i13 = yVar.i(24) + 4;
                if (i12 == 0) {
                    byte[] bArr3 = new byte[38];
                    jVar2.f(bArr3, r12, 38, r12);
                    pVar2 = new p(bArr3, 4, i10);
                } else {
                    if (pVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i12 == 3) {
                        Q1.o oVar2 = new Q1.o(i13);
                        jVar2.f(oVar2.f9702a, 0, i13, false);
                        pVar2 = new p(pVar2.f5660b, pVar2.f5661c, pVar2.f5662d, pVar2.f5663e, pVar2.f5664f, pVar2.f5666h, pVar2.f5667i, pVar2.k, AbstractC3991a.w(oVar2), (B) pVar2.f5670m);
                    } else {
                        B b10 = (B) pVar2.f5670m;
                        if (i12 == 4) {
                            Q1.o oVar3 = new Q1.o(i13);
                            jVar2.f(oVar3.f9702a, 0, i13, false);
                            oVar3.H(4);
                            B bU = AbstractC3991a.u(Arrays.asList(AbstractC3991a.x(oVar3, false, false).f44222b));
                            if (b10 != null) {
                                bU = b10.e(bU);
                            }
                            pVar = new p(pVar2.f5660b, pVar2.f5661c, pVar2.f5662d, pVar2.f5663e, pVar2.f5664f, pVar2.f5666h, pVar2.f5667i, pVar2.k, (Y2.B) pVar2.f5669l, bU);
                        } else if (i12 == 6) {
                            Q1.o oVar4 = new Q1.o(i13);
                            jVar2.f(oVar4.f9702a, 0, i13, false);
                            oVar4.H(4);
                            B b11 = new B(AbstractC3409K.n(E2.a.c(oVar4)));
                            if (b10 != null) {
                                b11 = b10.e(b11);
                            }
                            pVar = new p(pVar2.f5660b, pVar2.f5661c, pVar2.f5662d, pVar2.f5663e, pVar2.f5664f, pVar2.f5666h, pVar2.f5667i, pVar2.k, (Y2.B) pVar2.f5669l, b11);
                        } else {
                            jVar2.j(i13);
                        }
                        pVar2 = pVar;
                    }
                }
                int i14 = x.f9724a;
                this.f47666i = pVar2;
                z10 = zH;
                r12 = 0;
                i10 = 1;
                i = 7;
            }
            this.f47666i.getClass();
            this.f47667j = Math.max(this.f47666i.f5662d, 6);
            C c10 = this.f47663f;
            int i15 = x.f9724a;
            c10.c(this.f47666i.e(bArr, this.f47665h));
            this.f47664g = 4;
            return 0;
        }
        long j12 = 0;
        if (i11 == 4) {
            ((j) nVar).f44900f = 0;
            Q1.o oVar5 = new Q1.o(2);
            j jVar3 = (j) nVar;
            jVar3.c(oVar5.f9702a, 0, 2, false);
            int iA = oVar5.A();
            if ((iA >> 2) != 16382) {
                jVar3.f44900f = 0;
                throw D.a(null, "First frame does not start with sync code.");
            }
            jVar3.f44900f = 0;
            this.k = iA;
            o oVar6 = this.f47662e;
            int i16 = x.f9724a;
            long j13 = jVar3.f44898d;
            this.f47666i.getClass();
            p pVar3 = this.f47666i;
            if (((Y2.B) pVar3.f5669l) != null) {
                qVar = new q(pVar3, j13, 0);
                i5 = 0;
            } else {
                long j14 = jVar3.f44897c;
                if (j14 == -1 || pVar3.k <= 0) {
                    i5 = 0;
                    qVar = new q(pVar3.c());
                } else {
                    int i17 = this.k;
                    C3641c c3641c = new C3641c(pVar3, 9);
                    E4.n nVar3 = new E4.n(pVar3, i17, (byte) 0);
                    long jC = pVar3.c();
                    int i18 = pVar3.f5662d;
                    int i19 = pVar3.f5663e;
                    if (i19 > 0) {
                        i5 = 0;
                        j8 = j13;
                        j10 = ((i19 + i18) / 2) + 1;
                    } else {
                        i5 = 0;
                        j8 = j13;
                        int i20 = pVar3.f5661c;
                        int i21 = pVar3.f5660b;
                        j10 = 64 + (((((i21 != i20 || i21 <= 0) ? 4096L : i21) * pVar3.f5666h) * pVar3.f5667i) / 8);
                    }
                    s sVar = new s(c3641c, nVar3, jC, pVar3.k, j8, j14, j10, Math.max(6, i18));
                    this.f47668l = sVar;
                    qVar = (d) sVar.f5634c;
                }
            }
            oVar6.s(qVar);
            this.f47664g = 5;
            return i5;
        }
        if (i11 != 5) {
            throw new IllegalStateException();
        }
        this.f47663f.getClass();
        this.f47666i.getClass();
        s sVar2 = this.f47668l;
        if (sVar2 != null && ((b) sVar2.f5636e) != null) {
            return sVar2.v((j) nVar, nVar2);
        }
        if (this.f47670n == -1) {
            p pVar4 = this.f47666i;
            ((j) nVar).f44900f = 0;
            j jVar4 = (j) nVar;
            jVar4.b(1, false);
            byte[] bArr4 = new byte[1];
            jVar4.c(bArr4, 0, 1, false);
            boolean z11 = (bArr4[0] & 1) == 1;
            jVar4.b(2, false);
            i = z11 ? 7 : 6;
            Q1.o oVar7 = new Q1.o(i);
            byte[] bArr5 = oVar7.f9702a;
            int i22 = 0;
            while (i22 < i) {
                int iM = jVar4.m(i22, i - i22, bArr5);
                if (iM == -1) {
                    break;
                }
                i22 += iM;
            }
            oVar7.F(i22);
            jVar4.f44900f = 0;
            try {
                long jB = oVar7.B();
                if (!z11) {
                    jB *= pVar4.f5661c;
                }
                j12 = jB;
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                throw D.a(null, null);
            }
            this.f47670n = j12;
        } else {
            Q1.o oVar8 = this.f47659b;
            int i23 = oVar8.f9704c;
            if (i23 < 32768) {
                int i24 = ((j) nVar).read(oVar8.f9702a, i23, 32768 - i23);
                z2 = i24 == -1;
                if (!z2) {
                    oVar8.F(i23 + i24);
                } else if (oVar8.a() == 0) {
                    long j15 = this.f47670n * 1000000;
                    p pVar5 = this.f47666i;
                    int i25 = x.f9724a;
                    this.f47663f.a(j15 / pVar5.f5664f, 1, this.f47669m, 0, null);
                    return -1;
                }
            } else {
                z2 = false;
            }
            int i26 = oVar8.f9703b;
            int i27 = this.f47669m;
            int i28 = this.f47667j;
            if (i27 < i28) {
                oVar8.H(Math.min(i28 - i27, oVar8.a()));
            }
            this.f47666i.getClass();
            int i29 = oVar8.f9703b;
            while (true) {
                int i30 = oVar8.f9704c - 16;
                n nVar4 = this.f47661d;
                if (i29 <= i30) {
                    oVar8.G(i29);
                    if (AbstractC3991a.d(oVar8, this.f47666i, this.k, nVar4)) {
                        oVar8.G(i29);
                        j11 = nVar4.f5655a;
                        break;
                    }
                    i29++;
                } else {
                    if (z2) {
                        while (true) {
                            int i31 = oVar8.f9704c;
                            if (i29 > i31 - this.f47667j) {
                                oVar8.G(i31);
                                break;
                            }
                            oVar8.G(i29);
                            try {
                                zD = AbstractC3991a.d(oVar8, this.f47666i, this.k, nVar4);
                            } catch (IndexOutOfBoundsException unused2) {
                                zD = false;
                            }
                            if (oVar8.f9703b > oVar8.f9704c) {
                                zD = false;
                            }
                            if (zD) {
                                oVar8.G(i29);
                                j11 = nVar4.f5655a;
                                break;
                            }
                            i29++;
                        }
                    } else {
                        oVar8.G(i29);
                    }
                    j11 = -1;
                }
            }
            int i32 = oVar8.f9703b - i26;
            oVar8.G(i26);
            this.f47663f.e(i32, oVar8);
            int i33 = this.f47669m + i32;
            this.f47669m = i33;
            if (j11 != -1) {
                long j16 = this.f47670n * 1000000;
                p pVar6 = this.f47666i;
                int i34 = x.f9724a;
                this.f47663f.a(j16 / pVar6.f5664f, 1, i33, 0, null);
                this.f47669m = 0;
                this.f47670n = j11;
            }
            if (oVar8.a() < 16) {
                int iA2 = oVar8.a();
                byte[] bArr6 = oVar8.f9702a;
                System.arraycopy(bArr6, oVar8.f9703b, bArr6, 0, iA2);
                oVar8.G(0);
                oVar8.F(iA2);
            }
        }
        return 0;
    }

    @Override // s2.m
    public final void release() {
    }
}
