package Y2;

import a9.C1341a;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class v implements s2.m {

    /* renamed from: e, reason: collision with root package name */
    public boolean f16597e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16598f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16599g;

    /* renamed from: h, reason: collision with root package name */
    public long f16600h;

    /* renamed from: i, reason: collision with root package name */
    public s f16601i;

    /* renamed from: j, reason: collision with root package name */
    public s2.o f16602j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final Q1.u f16593a = new Q1.u(0);

    /* renamed from: c, reason: collision with root package name */
    public final Q1.o f16595c = new Q1.o(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f16594b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final t f16596d = new t(0);

    @Override // s2.m
    public final void a(long j8, long j10) {
        Q1.u uVar = this.f16593a;
        boolean z2 = uVar.e() == -9223372036854775807L;
        if (!z2) {
            long jD = uVar.d();
            z2 = (jD == -9223372036854775807L || jD == 0 || jD == j10) ? false : true;
        }
        if (z2) {
            uVar.g(j10);
        }
        s sVar = this.f16601i;
        if (sVar != null) {
            sVar.D(j10);
        }
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.f16594b;
            if (i5 >= sparseArray.size()) {
                return;
            }
            u uVar2 = (u) sparseArray.valueAt(i5);
            uVar2.f16591f = false;
            uVar2.f16586a.a();
            i5++;
        }
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        this.f16602j = oVar;
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(s2.n nVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        s2.j jVar = (s2.j) nVar;
        jVar.c(bArr, 0, 14, false);
        if (442 == (((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            jVar.b(bArr[13] & 7, false);
            jVar.c(bArr, 0, 3, false);
            if (1 == (((bArr[0] & ForkServer.ERROR) << 16) | ((bArr[1] & ForkServer.ERROR) << 8) | (bArr[2] & ForkServer.ERROR))) {
                return true;
            }
        }
        return false;
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    @Override // s2.m
    public final int k(s2.n nVar, J5.n nVar2) throws EOFException, InterruptedIOException {
        int i5;
        ?? r22;
        Q1.o oVar;
        h jVar;
        Q1.k.h(this.f16602j);
        long j8 = ((s2.j) nVar).f44897c;
        int i10 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
        long j10 = -9223372036854775807L;
        t tVar = this.f16596d;
        if (i10 != 0 && !tVar.f16580d) {
            boolean z2 = tVar.f16582f;
            Q1.o oVar2 = tVar.f16579c;
            if (!z2) {
                s2.j jVar2 = (s2.j) nVar;
                long j11 = jVar2.f44897c;
                int iMin = (int) Math.min(20000L, j11);
                long j12 = j11 - iMin;
                if (jVar2.f44898d != j12) {
                    nVar2.f5655a = j12;
                    return 1;
                }
                oVar2.D(iMin);
                jVar2.f44900f = 0;
                jVar2.c(oVar2.f9702a, 0, iMin, false);
                int i11 = oVar2.f9703b;
                int i12 = oVar2.f9704c - 4;
                while (true) {
                    if (i12 < i11) {
                        break;
                    }
                    if (t.b(i12, oVar2.f9702a) == 442) {
                        oVar2.G(i12 + 4);
                        long jC = t.c(oVar2);
                        if (jC != -9223372036854775807L) {
                            j10 = jC;
                            break;
                        }
                    }
                    i12--;
                }
                tVar.f16584h = j10;
                tVar.f16582f = true;
                return 0;
            }
            if (tVar.f16584h == -9223372036854775807L) {
                tVar.a((s2.j) nVar);
                return 0;
            }
            if (tVar.f16581e) {
                long j13 = tVar.f16583g;
                if (j13 == -9223372036854775807L) {
                    tVar.a((s2.j) nVar);
                    return 0;
                }
                Q1.u uVar = tVar.f16578b;
                tVar.f16585i = uVar.c(tVar.f16584h) - uVar.b(j13);
                tVar.a((s2.j) nVar);
                return 0;
            }
            s2.j jVar3 = (s2.j) nVar;
            int iMin2 = (int) Math.min(20000L, jVar3.f44897c);
            long j14 = 0;
            if (jVar3.f44898d != j14) {
                nVar2.f5655a = j14;
                return 1;
            }
            oVar2.D(iMin2);
            jVar3.f44900f = 0;
            jVar3.c(oVar2.f9702a, 0, iMin2, false);
            int i13 = oVar2.f9703b;
            int i14 = oVar2.f9704c;
            while (true) {
                if (i13 >= i14 - 3) {
                    break;
                }
                if (t.b(i13, oVar2.f9702a) == 442) {
                    oVar2.G(i13 + 4);
                    long jC2 = t.c(oVar2);
                    if (jC2 != -9223372036854775807L) {
                        j10 = jC2;
                        break;
                    }
                }
                i13++;
            }
            tVar.f16583g = j10;
            tVar.f16581e = true;
            return 0;
        }
        if (this.k) {
            i5 = i10;
            r22 = 0;
        } else {
            this.k = true;
            long j15 = tVar.f16585i;
            if (j15 != -9223372036854775807L) {
                i5 = i10;
                r22 = 0;
                s sVar = new s(new C1341a(), new X2.j(tVar.f16578b), j15, j15 + 1, 0L, j8, 188L, 1000);
                this.f16601i = sVar;
                this.f16602j.s((s2.d) sVar.f5634c);
            } else {
                i5 = i10;
                r22 = 0;
                this.f16602j.s(new s2.q(j15));
            }
        }
        s sVar2 = this.f16601i;
        if (sVar2 != null && ((J5.b) sVar2.f5636e) != null) {
            return sVar2.v((s2.j) nVar, nVar2);
        }
        s2.j jVar4 = (s2.j) nVar;
        jVar4.f44900f = r22;
        long jG = i5 != 0 ? j8 - jVar4.g() : -1L;
        if (jG != -1 && jG < 4) {
            return -1;
        }
        Q1.o oVar3 = this.f16595c;
        if (!jVar4.c(oVar3.f9702a, r22, 4, true)) {
            return -1;
        }
        oVar3.G(r22);
        int iH = oVar3.h();
        if (iH == 441) {
            return -1;
        }
        if (iH == 442) {
            jVar4.c(oVar3.f9702a, r22, 10, r22);
            oVar3.G(9);
            jVar4.j((oVar3.u() & 7) + 14);
            return r22;
        }
        if (iH == 443) {
            jVar4.c(oVar3.f9702a, r22, 2, r22);
            oVar3.G(r22);
            jVar4.j(oVar3.A() + 6);
            return r22;
        }
        if (((iH & (-256)) >> 8) != 1) {
            jVar4.j(1);
            return r22;
        }
        int i15 = iH & 255;
        SparseArray sparseArray = this.f16594b;
        u uVar2 = (u) sparseArray.get(i15);
        if (!this.f16597e) {
            if (uVar2 == null) {
                if (i15 == 189) {
                    jVar = new C1294b();
                    this.f16598f = true;
                    this.f16600h = jVar4.f44898d;
                } else if ((iH & Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE) == 192) {
                    jVar = new o(null, r22);
                    this.f16598f = true;
                    this.f16600h = jVar4.f44898d;
                } else if ((iH & 240) == 224) {
                    jVar = new j(null);
                    this.f16599g = true;
                    this.f16600h = jVar4.f44898d;
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    jVar.f(this.f16602j, new T5.B(i15, 256, 1, (byte) 0));
                    uVar2 = new u(jVar, this.f16593a);
                    sparseArray.put(i15, uVar2);
                }
            }
            if (jVar4.f44898d > ((this.f16598f && this.f16599g) ? this.f16600h + 8192 : 1048576L)) {
                this.f16597e = true;
                this.f16602j.l();
            }
        }
        jVar4.c(oVar3.f9702a, r22, 2, r22);
        oVar3.G(r22);
        int iA = oVar3.A() + 6;
        if (uVar2 == null) {
            jVar4.j(iA);
            return r22;
        }
        oVar3.D(iA);
        jVar4.f(oVar3.f9702a, r22, iA, r22);
        oVar3.G(6);
        J5.y yVar = uVar2.f16588c;
        oVar3.f(r22, 3, yVar.f5695b);
        yVar.q(r22);
        yVar.t(8);
        uVar2.f16589d = yVar.h();
        uVar2.f16590e = yVar.h();
        yVar.t(6);
        oVar3.f(r22, yVar.i(8), yVar.f5695b);
        yVar.q(r22);
        uVar2.f16592g = 0L;
        if (uVar2.f16589d) {
            yVar.t(4);
            yVar.t(1);
            yVar.t(1);
            long jI = (yVar.i(3) << 30) | (yVar.i(15) << 15) | yVar.i(15);
            yVar.t(1);
            boolean z10 = uVar2.f16591f;
            Q1.u uVar3 = uVar2.f16587b;
            if (z10 || !uVar2.f16590e) {
                oVar = oVar3;
            } else {
                yVar.t(4);
                yVar.t(1);
                oVar = oVar3;
                yVar.t(1);
                yVar.t(1);
                uVar3.b((yVar.i(15) << 15) | (yVar.i(3) << 30) | yVar.i(15));
                uVar2.f16591f = true;
            }
            uVar2.f16592g = uVar3.b(jI);
        } else {
            oVar = oVar3;
        }
        long j16 = uVar2.f16592g;
        h hVar = uVar2.f16586a;
        hVar.d(4, j16);
        hVar.e(oVar);
        hVar.h(false);
        oVar.F(oVar.f9702a.length);
        return 0;
    }

    @Override // s2.m
    public final void release() {
    }
}
