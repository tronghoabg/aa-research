package kotlinx.coroutines.b;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class bt<T> extends kotlinx.coroutines.b.a.b<bv> implements bm, k, kotlinx.coroutines.b.a.y {

    /* renamed from: a, reason: collision with root package name */
    private final int f51608a;

    /* renamed from: b, reason: collision with root package name */
    private final int f51609b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.a.a f51610c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f51611d;

    /* renamed from: e, reason: collision with root package name */
    private long f51612e;

    /* renamed from: f, reason: collision with root package name */
    private long f51613f;

    /* renamed from: g, reason: collision with root package name */
    private int f51614g;

    /* renamed from: h, reason: collision with root package name */
    private int f51615h;

    public bt(int i2, int i3, kotlinx.coroutines.a.a aVar) {
        this.f51608a = i2;
        this.f51609b = i3;
        this.f51610c = aVar;
    }

    private final boolean A(Object obj) {
        if (m() == 0) {
            int i2 = kotlinx.coroutines.ai.f51347a;
            int i3 = this.f51608a;
            if (i3 != 0) {
                y(obj);
                int i4 = this.f51614g + 1;
                this.f51614g = i4;
                if (i4 > i3) {
                    x();
                }
                this.f51613f = t() + this.f51614g;
            }
            return true;
        }
        int i5 = this.f51614g;
        int i6 = this.f51609b;
        if (i5 >= i6 && this.f51613f <= this.f51612e) {
            kotlinx.coroutines.a.a aVar = this.f51610c;
            kotlinx.coroutines.a.a aVar2 = kotlinx.coroutines.a.a.f51271a;
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                throw new h.i();
            }
        }
        y(obj);
        int i7 = this.f51614g + 1;
        this.f51614g = i7;
        if (i7 > i6) {
            x();
        }
        if (d() > this.f51608a) {
            z(this.f51612e + 1, this.f51613f, s(), u());
        }
        return true;
    }

    private final Object[] B(Object[] objArr, int i2, int i3) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i3];
        this.f51611d = objArr2;
        if (objArr != null) {
            long jT = t();
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (int) (i4 + jT);
                objArr2[i5 & (i3 - 1)] = objArr[i5 & (objArr.length - 1)];
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.lang.Object[]] */
    private final h.c.e[] C(h.c.e[] eVarArr) {
        kotlinx.coroutines.b.a.d[] dVarArr;
        bv bvVar;
        h.c.e eVar;
        bt<T> btVar = this;
        if (((kotlinx.coroutines.b.a.b) btVar).f51400b != 0 && (dVarArr = ((kotlinx.coroutines.b.a.b) btVar).f51399a) != null) {
            int length = eVarArr.length;
            int i2 = 0;
            eVarArr = eVarArr;
            while (i2 < dVarArr.length) {
                kotlinx.coroutines.b.a.d dVar = dVarArr[i2];
                if (dVar != null && (eVar = (bvVar = (bv) dVar).f51618b) != null && v(bvVar) >= 0) {
                    int length2 = eVarArr.length;
                    eVarArr = eVarArr;
                    if (length >= length2) {
                        ?? CopyOf = Arrays.copyOf(eVarArr, Math.max(2, length2 + length2));
                        h.g.b.x.e(CopyOf, "copyOf(...)");
                        eVarArr = CopyOf;
                    }
                    eVarArr[length] = eVar;
                    bvVar.f51618b = null;
                    length++;
                }
                i2++;
                eVarArr = eVarArr;
            }
        }
        return eVarArr;
    }

    private final int d() {
        return (int) ((t() + this.f51614g) - this.f51612e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object f(kotlinx.coroutines.b.bt r17, kotlinx.coroutines.b.l r18, h.c.e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.bt.f(kotlinx.coroutines.b.bt, kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void i(bt btVar, br brVar) {
        synchronized (btVar) {
            long j2 = brVar.f51598b;
            if (j2 >= btVar.t()) {
                Object[] objArr = btVar.f51611d;
                h.g.b.x.c(objArr);
                if (bu.a(objArr, j2) == brVar) {
                    bu.d(objArr, j2, bu.f51616a);
                    btVar.w();
                }
            }
        }
    }

    private final int r() {
        return this.f51614g + this.f51615h;
    }

    private final long s() {
        return t() + this.f51614g;
    }

    private final long t() {
        return Math.min(this.f51613f, this.f51612e);
    }

    private final long u() {
        return t() + this.f51614g + this.f51615h;
    }

    private final long v(bv bvVar) {
        long j2 = bvVar.f51617a;
        if (j2 >= s() && (this.f51609b > 0 || j2 > t() || this.f51615h == 0)) {
            return -1L;
        }
        return j2;
    }

    private final void w() {
        if (this.f51609b != 0 || this.f51615h > 1) {
            Object[] objArr = this.f51611d;
            if (objArr == null) {
                h.g.b.x.g();
            }
            while (this.f51615h > 0) {
                long jT = t() + r();
                int length = objArr.length - 1;
                if (objArr[((int) (jT - 1)) & length] != bu.f51616a) {
                    return;
                }
                this.f51615h--;
                objArr[((int) (t() + r())) & length] = null;
            }
        }
    }

    private final void x() {
        kotlinx.coroutines.b.a.d[] dVarArr;
        Object[] objArr = this.f51611d;
        h.g.b.x.c(objArr);
        bu.d(objArr, t(), null);
        this.f51614g--;
        long jT = t() + 1;
        if (this.f51612e < jT) {
            this.f51612e = jT;
        }
        if (this.f51613f < jT) {
            bt<T> btVar = this;
            if (((kotlinx.coroutines.b.a.b) btVar).f51400b != 0 && (dVarArr = ((kotlinx.coroutines.b.a.b) btVar).f51399a) != null) {
                for (kotlinx.coroutines.b.a.d dVar : dVarArr) {
                    if (dVar != null) {
                        bv bvVar = (bv) dVar;
                        long j2 = bvVar.f51617a;
                        if (j2 >= 0 && j2 < jT) {
                            bvVar.f51617a = jT;
                        }
                    }
                }
            }
            this.f51613f = jT;
        }
        int i2 = kotlinx.coroutines.ai.f51347a;
    }

    private final void y(Object obj) {
        int iR = r();
        Object[] objArrB = this.f51611d;
        if (objArrB == null) {
            objArrB = B(null, 0, 2);
        } else {
            int length = objArrB.length;
            if (iR >= length) {
                objArrB = B(objArrB, iR, length + length);
            }
        }
        objArrB[(objArrB.length - 1) & ((int) (t() + iR))] = obj;
    }

    private final void z(long j2, long j3, long j4, long j5) {
        long jMin = Math.min(j3, j2);
        int i2 = kotlinx.coroutines.ai.f51347a;
        for (long jT = t(); jT < jMin; jT++) {
            Object[] objArr = this.f51611d;
            if (objArr == null) {
                h.g.b.x.g();
            }
            objArr[(objArr.length - 1) & ((int) jT)] = null;
        }
        this.f51612e = j2;
        this.f51613f = j3;
        this.f51614g = (int) (j4 - jMin);
        this.f51615h = (int) (j5 - j4);
    }

    @Override // kotlinx.coroutines.b.bm
    public final void b() throws Throwable {
        bt<T> btVar;
        synchronized (this) {
            try {
                btVar = this;
                try {
                    btVar.z(s(), this.f51613f, s(), u());
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                btVar = this;
            }
        }
    }

    @Override // kotlinx.coroutines.b.bm
    public final boolean c(Object obj) {
        int i2;
        boolean z;
        h.c.e[] eVarArrC = kotlinx.coroutines.b.a.c.f51403a;
        synchronized (this) {
            if (A(obj)) {
                eVarArrC = C(eVarArrC);
                z = true;
            } else {
                z = false;
            }
        }
        for (h.c.e eVar : eVarArrC) {
            if (eVar != null) {
                eVar.resumeWith(h.ab.f48028a);
            }
        }
        return z;
    }

    @Override // kotlinx.coroutines.b.a.y
    public final k cc(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return bu.b(this, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.bq, kotlinx.coroutines.b.k
    public final Object collect(l<? super T> lVar, h.c.e<?> eVar) {
        return f(this, lVar, eVar);
    }

    public final long e() {
        long j2 = this.f51612e;
        if (j2 < this.f51613f) {
            this.f51613f = j2;
        }
        return j2;
    }

    @Override // kotlinx.coroutines.b.bm, kotlinx.coroutines.b.l
    public final Object emit(T t, h.c.e<? super h.ab> eVar) throws Throwable {
        bt<T> btVar;
        Throwable th;
        h.c.e[] eVarArrC;
        br brVar;
        if (c(t)) {
            return h.ab.f48028a;
        }
        kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar.u();
        kotlinx.coroutines.l lVar2 = lVar;
        h.c.e[] eVarArrC2 = kotlinx.coroutines.b.a.c.f51403a;
        synchronized (this) {
            try {
                if (A(t)) {
                    try {
                        lVar2.resumeWith(h.ab.f48028a);
                        eVarArrC = C(eVarArrC2);
                        brVar = null;
                        btVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        btVar = this;
                        throw th;
                    }
                } else {
                    btVar = this;
                    try {
                        br brVar2 = new br(btVar, t() + r(), t, lVar2);
                        btVar.y(brVar2);
                        btVar.f51615h++;
                        if (btVar.f51609b == 0) {
                            eVarArrC2 = btVar.C(eVarArrC2);
                        }
                        eVarArrC = eVarArrC2;
                        brVar = brVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (brVar != null) {
                    kotlinx.coroutines.bo.l(lVar2, brVar);
                }
                for (h.c.e eVar2 : eVarArrC) {
                    if (eVar2 != null) {
                        eVar2.resumeWith(h.ab.f48028a);
                    }
                }
                Object objJ = lVar.j();
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (objJ == aVar) {
                    h.d.b.c(eVar);
                }
                if (objJ != aVar) {
                    objJ = h.ab.f48028a;
                }
                return objJ != aVar ? h.ab.f48028a : objJ;
            } catch (Throwable th4) {
                th = th4;
                btVar = this;
            }
        }
    }

    protected final Object g() {
        Object[] objArr = this.f51611d;
        h.g.b.x.c(objArr);
        return bu.a(objArr, (this.f51612e + d()) - 1);
    }

    @Override // kotlinx.coroutines.b.a.b
    public final /* synthetic */ kotlinx.coroutines.b.a.d h() {
        return new bv();
    }

    public final h.c.e[] j(long j2) {
        long j3;
        int i2;
        long j4;
        kotlinx.coroutines.b.a.d[] dVarArr;
        int i3 = kotlinx.coroutines.ai.f51347a;
        if (j2 <= this.f51613f) {
            long jT = t();
            long j5 = this.f51614g + jT;
            int i4 = this.f51609b;
            if (i4 == 0 && this.f51615h > 0) {
                j5++;
            }
            bt<T> btVar = this;
            int i5 = 0;
            if (((kotlinx.coroutines.b.a.b) btVar).f51400b != 0 && (dVarArr = ((kotlinx.coroutines.b.a.b) btVar).f51399a) != null) {
                for (kotlinx.coroutines.b.a.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j6 = ((bv) dVar).f51617a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.f51613f) {
                long jS = s();
                int iM = m();
                int iMin = this.f51615h;
                if (iM > 0) {
                    iMin = Math.min(iMin, i4 - ((int) (jS - j5)));
                }
                h.c.e[] eVarArr = kotlinx.coroutines.b.a.c.f51403a;
                long j7 = this.f51615h + jS;
                if (iMin > 0) {
                    eVarArr = new h.c.e[iMin];
                    Object[] objArr = this.f51611d;
                    if (objArr == null) {
                        h.g.b.x.g();
                    }
                    j4 = 1;
                    long j8 = jS;
                    while (true) {
                        if (jS >= j7) {
                            j3 = j5;
                            i2 = i4;
                            break;
                        }
                        j3 = j5;
                        int length = objArr.length - 1;
                        int i6 = ((int) jS) & length;
                        Object obj = objArr[i6];
                        kotlinx.coroutines.e.ak akVar = bu.f51616a;
                        if (obj != akVar) {
                            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            br brVar = (br) obj;
                            int i7 = i5 + 1;
                            i2 = i4;
                            eVarArr[i5] = brVar.f51600d;
                            objArr[i6] = akVar;
                            objArr[((int) j8) & length] = brVar.f51599c;
                            j8++;
                            if (i7 >= iMin) {
                                break;
                            }
                            i5 = i7;
                        } else {
                            i2 = i4;
                        }
                        jS++;
                        j5 = j3;
                        i4 = i2;
                    }
                    jS = j8;
                } else {
                    j3 = j5;
                    i2 = i4;
                    j4 = 1;
                }
                long jMax = Math.max(this.f51612e, Math.max(jT, jS - this.f51608a));
                if (i2 == 0 && jMax < j7) {
                    Object[] objArr2 = this.f51611d;
                    if (objArr2 == null) {
                        h.g.b.x.g();
                    }
                    if (h.g.b.x.n(objArr2[(objArr2.length - 1) & ((int) jMax)], bu.f51616a)) {
                        jS += j4;
                        jMax += j4;
                    }
                }
                long j9 = jS;
                z(jMax, m() == 0 ? j9 : j3, j9, j7);
                w();
                return eVarArr.length == 0 ? eVarArr : C(eVarArr);
            }
        }
        return kotlinx.coroutines.b.a.c.f51403a;
    }

    @Override // kotlinx.coroutines.b.a.b
    public final /* bridge */ /* synthetic */ kotlinx.coroutines.b.a.d[] k() {
        return new bv[2];
    }
}
