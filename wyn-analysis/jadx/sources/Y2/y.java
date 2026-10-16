package Y2;

import N1.D;
import U8.v0;
import a9.C1341a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class y implements s2.m {

    /* renamed from: a, reason: collision with root package name */
    public final int f16609a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16610b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16611c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.o f16612d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f16613e;

    /* renamed from: f, reason: collision with root package name */
    public final f f16614f;

    /* renamed from: g, reason: collision with root package name */
    public final P2.j f16615g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f16616h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f16617i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f16618j;
    public final t k;

    /* renamed from: l, reason: collision with root package name */
    public s f16619l;

    /* renamed from: m, reason: collision with root package name */
    public s2.o f16620m;

    /* renamed from: n, reason: collision with root package name */
    public int f16621n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16622o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16623p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16624q;

    /* renamed from: r, reason: collision with root package name */
    public A f16625r;

    /* renamed from: s, reason: collision with root package name */
    public int f16626s;

    /* renamed from: t, reason: collision with root package name */
    public int f16627t;

    public y(int i5, int i10, P2.j jVar, Q1.u uVar, f fVar) {
        this.f16614f = fVar;
        this.f16609a = i5;
        this.f16610b = i10;
        this.f16615g = jVar;
        if (i5 == 1 || i5 == 2) {
            this.f16611c = Collections.singletonList(uVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f16611c = arrayList;
            arrayList.add(uVar);
        }
        this.f16612d = new Q1.o(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f16617i = sparseBooleanArray;
        this.f16618j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f16616h = sparseArray;
        this.f16613e = new SparseIntArray();
        this.k = new t(1);
        this.f16620m = s2.o.f44913f9;
        this.f16627t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (A) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new x(new S3.e(this)));
        this.f16625r = null;
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        s sVar;
        Q1.k.g(this.f16609a != 2);
        List list = this.f16611c;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Q1.u uVar = (Q1.u) list.get(i5);
            boolean z2 = uVar.e() == -9223372036854775807L;
            if (!z2) {
                long jD = uVar.d();
                z2 = (jD == -9223372036854775807L || jD == 0 || jD == j10) ? false : true;
            }
            if (z2) {
                uVar.g(j10);
            }
        }
        if (j10 != 0 && (sVar = this.f16619l) != null) {
            sVar.D(j10);
        }
        this.f16612d.D(0);
        this.f16613e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f16616h;
            if (i10 >= sparseArray.size()) {
                this.f16626s = 0;
                return;
            } else {
                ((A) sparseArray.valueAt(i10)).a();
                i10++;
            }
        }
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        if ((this.f16610b & 1) == 0) {
            oVar = new Dd.c(oVar, this.f16615g);
        }
        this.f16620m = oVar;
    }

    @Override // s2.m
    public final s2.m h() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(s2.n r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            Q1.o r0 = r6.f16612d
            byte[] r0 = r0.f9702a
            s2.j r7 = (s2.j) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.c(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.j(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.y.i(s2.n):boolean");
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s2.m
    public final int k(s2.n nVar, J5.n nVar2) throws EOFException, InterruptedIOException, D {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        long jJ0;
        long j8;
        long j10 = ((s2.j) nVar).f44897c;
        int i14 = this.f16609a;
        boolean z2 = i14 == 2;
        if (this.f16622o) {
            t tVar = this.k;
            if (j10 != -1 && !z2 && !tVar.f16580d) {
                int i15 = this.f16627t;
                if (i15 <= 0) {
                    tVar.a((s2.j) nVar);
                    return 0;
                }
                boolean z10 = tVar.f16582f;
                Q1.o oVar = tVar.f16579c;
                if (z10) {
                    if (tVar.f16584h == -9223372036854775807L) {
                        tVar.a((s2.j) nVar);
                        return 0;
                    }
                    if (tVar.f16581e) {
                        long j11 = tVar.f16583g;
                        if (j11 == -9223372036854775807L) {
                            tVar.a((s2.j) nVar);
                            return 0;
                        }
                        Q1.u uVar = tVar.f16578b;
                        tVar.f16585i = uVar.c(tVar.f16584h) - uVar.b(j11);
                        tVar.a((s2.j) nVar);
                        return 0;
                    }
                    s2.j jVar = (s2.j) nVar;
                    int iMin = (int) Math.min(112800, jVar.f44897c);
                    long j12 = 0;
                    if (jVar.f44898d != j12) {
                        nVar2.f5655a = j12;
                        return 1;
                    }
                    oVar.D(iMin);
                    jVar.f44900f = 0;
                    jVar.c(oVar.f9702a, 0, iMin, false);
                    int i16 = oVar.f9703b;
                    int i17 = oVar.f9704c;
                    while (true) {
                        if (i16 >= i17) {
                            jJ0 = -9223372036854775807L;
                            break;
                        }
                        if (oVar.f9702a[i16] == 71) {
                            jJ0 = v0.j0(oVar, i16, i15);
                            if (jJ0 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i16++;
                    }
                    tVar.f16583g = jJ0;
                    tVar.f16581e = true;
                    return 0;
                }
                s2.j jVar2 = (s2.j) nVar;
                long j13 = jVar2.f44897c;
                int iMin2 = (int) Math.min(112800, j13);
                long j14 = j13 - iMin2;
                if (jVar2.f44898d != j14) {
                    nVar2.f5655a = j14;
                    return 1;
                }
                oVar.D(iMin2);
                jVar2.f44900f = 0;
                jVar2.c(oVar.f9702a, 0, iMin2, false);
                int i18 = oVar.f9703b;
                int i19 = oVar.f9704c;
                int i20 = i19 - 188;
                while (true) {
                    if (i20 < i18) {
                        j8 = -9223372036854775807L;
                        break;
                    }
                    byte[] bArr = oVar.f9702a;
                    int i21 = -4;
                    int i22 = 0;
                    while (true) {
                        if (i21 > 4) {
                            break;
                        }
                        int i23 = (i21 * 188) + i20;
                        if (i23 < i18 || i23 >= i19 || bArr[i23] != 71) {
                            i22 = 0;
                        } else {
                            i22++;
                            if (i22 == 5) {
                                long jJ02 = v0.j0(oVar, i20, i15);
                                if (jJ02 != -9223372036854775807L) {
                                    j8 = jJ02;
                                    break;
                                }
                            }
                        }
                        i21++;
                    }
                    i20--;
                }
                tVar.f16584h = j8;
                tVar.f16582f = true;
                return 0;
            }
            if (this.f16623p) {
                i10 = i14;
            } else {
                this.f16623p = true;
                long j15 = tVar.f16585i;
                if (j15 != -9223372036854775807L) {
                    i10 = i14;
                    s sVar = new s(new C1341a(), new E4.n(this.f16627t, tVar.f16578b), j15, 1 + j15, 0L, j10, 188L, 940);
                    this.f16619l = sVar;
                    this.f16620m.s((s2.d) sVar.f5634c);
                } else {
                    i10 = i14;
                    this.f16620m.s(new s2.q(j15));
                }
            }
            if (this.f16624q) {
                this.f16624q = false;
                a(0L, 0L);
                if (((s2.j) nVar).f44898d != 0) {
                    nVar2.f5655a = 0L;
                    return 1;
                }
            }
            i5 = 1;
            s sVar2 = this.f16619l;
            if (sVar2 != null && ((J5.b) sVar2.f5636e) != null) {
                return sVar2.v((s2.j) nVar, nVar2);
            }
        } else {
            i5 = 1;
            i10 = i14;
        }
        Q1.o oVar2 = this.f16612d;
        byte[] bArr2 = oVar2.f9702a;
        if (9400 - oVar2.f9703b < 188) {
            int iA = oVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, oVar2.f9703b, bArr2, 0, iA);
            }
            oVar2.E(iA, bArr2);
        }
        while (true) {
            int iA2 = oVar2.a();
            SparseArray sparseArray = this.f16616h;
            if (iA2 >= 188) {
                int i24 = oVar2.f9703b;
                int i25 = oVar2.f9704c;
                byte[] bArr3 = oVar2.f9702a;
                int i26 = i24;
                while (i26 < i25 && bArr3[i26] != 71) {
                    i26++;
                }
                oVar2.G(i26);
                int i27 = i26 + 188;
                if (i27 > i25) {
                    int i28 = (i26 - i24) + this.f16626s;
                    this.f16626s = i28;
                    i11 = i10;
                    i12 = 2;
                    if (i11 == 2 && i28 > 376) {
                        throw D.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i11 = i10;
                    i12 = 2;
                    this.f16626s = 0;
                }
                int i29 = oVar2.f9704c;
                if (i27 > i29) {
                    return 0;
                }
                int iH = oVar2.h();
                if ((8388608 & iH) != 0) {
                    oVar2.G(i27);
                    return 0;
                }
                int i30 = (4194304 & iH) != 0 ? i5 : 0;
                int i31 = (2096896 & iH) >> 8;
                int i32 = (iH & 32) != 0 ? i5 : 0;
                A a5 = (iH & 16) != 0 ? (A) sparseArray.get(i31) : null;
                if (a5 == null) {
                    oVar2.G(i27);
                    return 0;
                }
                if (i11 != i12) {
                    int i33 = iH & 15;
                    SparseIntArray sparseIntArray = this.f16613e;
                    i13 = i5;
                    int i34 = sparseIntArray.get(i31, i33 - 1);
                    sparseIntArray.put(i31, i33);
                    if (i34 == i33) {
                        oVar2.G(i27);
                        return 0;
                    }
                    if (i33 != ((i34 + 1) & 15)) {
                        a5.a();
                    }
                } else {
                    i13 = i5;
                }
                if (i32 != 0) {
                    int iU = oVar2.u();
                    i30 |= (oVar2.u() & 64) != 0 ? i12 : 0;
                    oVar2.H(iU - 1);
                }
                boolean z11 = this.f16622o;
                if (i11 == i12 || z11 || !this.f16618j.get(i31, false)) {
                    oVar2.F(i27);
                    a5.c(i30, oVar2);
                    oVar2.F(i29);
                }
                if (i11 != i12 && !z11 && this.f16622o && j10 != -1) {
                    this.f16624q = i13;
                }
                oVar2.G(i27);
                return 0;
            }
            int i35 = oVar2.f9704c;
            int i36 = ((s2.j) nVar).read(bArr2, i35, 9400 - i35);
            if (i36 == -1) {
                for (int i37 = 0; i37 < sparseArray.size(); i37++) {
                    A a10 = (A) sparseArray.valueAt(i37);
                    if (a10 instanceof r) {
                        r rVar = (r) a10;
                        if (rVar.f16568c == 3 && rVar.f16575j == -1 && (!z2 || !(rVar.f16566a instanceof j))) {
                            rVar.c(i5, new Q1.o());
                        }
                    }
                }
                return -1;
            }
            oVar2.F(i35 + i36);
        }
    }

    @Override // s2.m
    public final void release() {
    }
}
