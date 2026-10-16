package T5;

import A.e0;
import E5.o0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import f6.C2584N;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class z implements J5.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f11734a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11735b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11736c;

    /* renamed from: d, reason: collision with root package name */
    public final Y4.b f11737d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f11738e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f11739f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f11740g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f11741h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f11742i;

    /* renamed from: j, reason: collision with root package name */
    public final u f11743j;
    public M5.a k;

    /* renamed from: l, reason: collision with root package name */
    public J5.m f11744l;

    /* renamed from: m, reason: collision with root package name */
    public int f11745m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11746n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11747o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11748p;

    /* renamed from: q, reason: collision with root package name */
    public C f11749q;

    /* renamed from: r, reason: collision with root package name */
    public int f11750r;

    /* renamed from: s, reason: collision with root package name */
    public int f11751s;

    public z() {
        u6.t tVar = new u6.t(0L);
        this.f11739f = new e0(21);
        this.f11735b = 112800;
        this.f11734a = 1;
        this.f11736c = Collections.singletonList(tVar);
        this.f11737d = new Y4.b(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f11741h = sparseBooleanArray;
        this.f11742i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f11740g = sparseArray;
        this.f11738e = new SparseIntArray();
        this.f11743j = new u(1);
        this.f11744l = J5.m.f5654N8;
        this.f11751s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseArray.put(sparseArray2.keyAt(i5), (C) sparseArray2.valueAt(i5));
        }
        sparseArray.put(0, new y(new S3.c(this)));
        this.f11749q = null;
    }

    @Override // J5.k
    public final void a(long j8, long j10) {
        M5.a aVar;
        AbstractC4256a.i(this.f11734a != 2);
        List list = this.f11736c;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            u6.t tVar = (u6.t) list.get(i5);
            boolean z2 = tVar.d() == -9223372036854775807L;
            if (!z2) {
                long jC = tVar.c();
                z2 = (jC == -9223372036854775807L || jC == 0 || jC == j10) ? false : true;
            }
            if (z2) {
                tVar.e(j10);
            }
        }
        if (j10 != 0 && (aVar = this.k) != null) {
            aVar.D(j10);
        }
        this.f11737d.x(0);
        this.f11738e.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f11740g;
            if (i10 >= sparseArray.size()) {
                this.f11750r = 0;
                return;
            } else {
                ((C) sparseArray.valueAt(i10)).a();
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // J5.k
    public final int g(J5.l lVar, J5.n nVar) throws o0, EOFException, InterruptedIOException {
        ?? r22;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        long jK;
        long j8;
        long j10 = ((J5.h) lVar).f5645c;
        boolean z10 = this.f11746n;
        int i14 = this.f11734a;
        if (z10) {
            u uVar = this.f11743j;
            if (j10 != -1 && i14 != 2 && !uVar.f11705d) {
                int i15 = this.f11751s;
                if (i15 <= 0) {
                    uVar.a((J5.h) lVar);
                    return 0;
                }
                boolean z11 = uVar.f11707f;
                Y4.b bVar = uVar.f11704c;
                if (!z11) {
                    J5.h hVar = (J5.h) lVar;
                    long j11 = hVar.f5645c;
                    int iMin = (int) Math.min(112800, j11);
                    long j12 = j11 - iMin;
                    if (hVar.f5646d != j12) {
                        nVar.f5655a = j12;
                        return 1;
                    }
                    bVar.x(iMin);
                    hVar.f5648f = 0;
                    hVar.c(bVar.f16679a, 0, iMin, false);
                    int i16 = bVar.f16680b;
                    int i17 = bVar.f16681c;
                    int i18 = i17 - 188;
                    while (true) {
                        if (i18 < i16) {
                            j8 = -9223372036854775807L;
                            break;
                        }
                        byte[] bArr = bVar.f16679a;
                        int i19 = -4;
                        int i20 = 0;
                        while (true) {
                            if (i19 > 4) {
                                break;
                            }
                            int i21 = (i19 * 188) + i18;
                            if (i21 < i16 || i21 >= i17 || bArr[i21] != 71) {
                                i20 = 0;
                            } else {
                                i20++;
                                if (i20 == 5) {
                                    long jK2 = ic.d.K(bVar, i18, i15);
                                    if (jK2 != -9223372036854775807L) {
                                        j8 = jK2;
                                        break;
                                    }
                                }
                            }
                            i19++;
                        }
                        i18--;
                    }
                    uVar.f11709h = j8;
                    uVar.f11707f = true;
                    return 0;
                }
                if (uVar.f11709h == -9223372036854775807L) {
                    uVar.a((J5.h) lVar);
                    return 0;
                }
                if (uVar.f11706e) {
                    long j13 = uVar.f11708g;
                    if (j13 == -9223372036854775807L) {
                        uVar.a((J5.h) lVar);
                        return 0;
                    }
                    u6.t tVar = uVar.f11703b;
                    long jB = tVar.b(uVar.f11709h) - tVar.b(j13);
                    uVar.f11710i = jB;
                    if (jB < 0) {
                        AbstractC4256a.E("TsDurationReader", "Invalid duration: " + uVar.f11710i + ". Using TIME_UNSET instead.");
                        uVar.f11710i = -9223372036854775807L;
                    }
                    uVar.a((J5.h) lVar);
                    return 0;
                }
                J5.h hVar2 = (J5.h) lVar;
                int iMin2 = (int) Math.min(112800, hVar2.f5645c);
                long j14 = 0;
                if (hVar2.f5646d != j14) {
                    nVar.f5655a = j14;
                    return 1;
                }
                bVar.x(iMin2);
                hVar2.f5648f = 0;
                hVar2.c(bVar.f16679a, 0, iMin2, false);
                int i22 = bVar.f16680b;
                int i23 = bVar.f16681c;
                while (true) {
                    if (i22 >= i23) {
                        jK = -9223372036854775807L;
                        break;
                    }
                    if (bVar.f16679a[i22] == 71) {
                        jK = ic.d.K(bVar, i22, i15);
                        if (jK != -9223372036854775807L) {
                            break;
                        }
                    }
                    i22++;
                }
                uVar.f11708g = jK;
                uVar.f11706e = true;
                return 0;
            }
            if (this.f11747o) {
                z2 = false;
                i10 = i14;
            } else {
                this.f11747o = true;
                long j15 = uVar.f11710i;
                if (j15 != -9223372036854775807L) {
                    i10 = i14;
                    z2 = false;
                    M5.a aVar = new M5.a(new Xd.c(20), new M2.d(this.f11751s, uVar.f11703b, this.f11735b), j15, 1 + j15, 0L, j10, 188L, 940);
                    this.k = aVar;
                    this.f11744l.x((J5.a) aVar.f5634c);
                } else {
                    i10 = i14;
                    z2 = false;
                    this.f11744l.x(new J5.o(j15));
                }
            }
            if (this.f11748p) {
                this.f11748p = z2;
                a(0L, 0L);
                if (((J5.h) lVar).f5646d != 0) {
                    nVar.f5655a = 0L;
                    return 1;
                }
            }
            i5 = 1;
            M5.a aVar2 = this.k;
            r22 = z2;
            if (aVar2 != null) {
                r22 = z2;
                if (((J5.b) aVar2.f5636e) != null) {
                    return aVar2.u((J5.h) lVar, nVar);
                }
            }
        } else {
            r22 = 0;
            i5 = 1;
            i10 = i14;
        }
        Y4.b bVar2 = this.f11737d;
        byte[] bArr2 = bVar2.f16679a;
        if (9400 - bVar2.f16680b < 188) {
            int iA = bVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, bVar2.f16680b, bArr2, r22, iA);
            }
            bVar2.y(iA, bArr2);
        }
        while (bVar2.a() < 188) {
            int i24 = bVar2.f16681c;
            int i25 = ((J5.h) lVar).read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                return -1;
            }
            bVar2.z(i24 + i25);
        }
        int i26 = bVar2.f16680b;
        int i27 = bVar2.f16681c;
        byte[] bArr3 = bVar2.f16679a;
        int i28 = i26;
        while (i28 < i27 && bArr3[i28] != 71) {
            i28++;
        }
        bVar2.A(i28);
        int i29 = i28 + 188;
        if (i29 > i27) {
            int i30 = (i28 - i26) + this.f11750r;
            this.f11750r = i30;
            i11 = i10;
            i12 = 2;
            if (i11 == 2 && i30 > 376) {
                throw o0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            i12 = 2;
            this.f11750r = r22;
        }
        int i31 = bVar2.f16681c;
        if (i29 > i31) {
            return r22;
        }
        int iD = bVar2.d();
        if ((8388608 & iD) != 0) {
            bVar2.A(i29);
            return r22;
        }
        int i32 = (4194304 & iD) != 0 ? i5 : r22;
        int i33 = (2096896 & iD) >> 8;
        int i34 = (iD & 32) != 0 ? i5 : r22;
        C c10 = (iD & 16) != 0 ? (C) this.f11740g.get(i33) : null;
        if (c10 == null) {
            bVar2.A(i29);
            return r22;
        }
        if (i11 != i12) {
            int i35 = iD & 15;
            SparseIntArray sparseIntArray = this.f11738e;
            i13 = i5;
            int i36 = sparseIntArray.get(i33, i35 - 1);
            sparseIntArray.put(i33, i35);
            if (i36 == i35) {
                bVar2.A(i29);
                return r22;
            }
            if (i35 != ((i36 + 1) & 15)) {
                c10.a();
            }
        } else {
            i13 = i5;
        }
        if (i34 != 0) {
            int iQ = bVar2.q();
            i32 |= (bVar2.q() & 64) != 0 ? i12 : r22;
            bVar2.B(iQ - 1);
        }
        boolean z12 = this.f11746n;
        if (i11 == i12 || z12 || !this.f11742i.get(i33, r22)) {
            bVar2.z(i29);
            c10.b(i32, bVar2);
            bVar2.z(i31);
        }
        if (i11 != i12 && !z12 && this.f11746n && j10 != -1) {
            this.f11748p = i13;
        }
        bVar2.A(i29);
        return r22;
    }

    @Override // J5.k
    public final void h(C2584N c2584n) {
        this.f11744l = c2584n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // J5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(J5.l r7) {
        /*
            r6 = this;
            Y4.b r0 = r6.f11737d
            byte[] r0 = r0.f16679a
            J5.h r7 = (J5.h) r7
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
        throw new UnsupportedOperationException("Method not decompiled: T5.z.i(J5.l):boolean");
    }

    @Override // J5.k
    public final void release() {
    }
}
