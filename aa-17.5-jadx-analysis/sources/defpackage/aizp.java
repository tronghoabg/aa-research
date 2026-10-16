package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class aizp extends ajah implements aizk, aiye, ajay {
    public Object[] a;
    public long b;
    public long c;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private final int j;

    public aizp(int i, int i2, int i3) {
        this.f = i;
        this.g = i2;
        this.j = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [aiyl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object g(defpackage.aizp r17, defpackage.aiyl r18, defpackage.afck r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aizp.g(aizp, aiyl, afck):java.lang.Object");
    }

    private final int p() {
        return (int) ((e() + this.h) - this.b);
    }

    private final int q() {
        return this.h + this.i;
    }

    private final long r(aizr aizrVar) {
        long j = aizrVar.a;
        if (j >= d() && (this.g > 0 || j > e() || this.i == 0)) {
            return -1L;
        }
        return j;
    }

    private final void s() {
        ajaj[] ajajVarArr;
        Object[] objArr = this.a;
        objArr.getClass();
        aizq.b(objArr, e(), null);
        this.h--;
        long jE = e() + 1;
        if (this.b < jE) {
            this.b = jE;
        }
        if (this.c < jE) {
            if (this.e != 0 && (ajajVarArr = this.d) != null) {
                for (ajaj ajajVar : ajajVarArr) {
                    if (ajajVar != null) {
                        aizr aizrVar = (aizr) ajajVar;
                        long j = aizrVar.a;
                        if (j >= 0 && j < jE) {
                            aizrVar.a = jE;
                        }
                    }
                }
            }
            this.c = jE;
        }
        boolean z = aitz.a;
    }

    private final void t(Object obj) {
        int iQ = q();
        Object[] objArrV = this.a;
        if (objArrV == null) {
            objArrV = v(null, 0, 2);
        } else {
            int length = objArrV.length;
            if (iQ >= length) {
                objArrV = v(objArrV, iQ, length + length);
            }
        }
        objArrV[(objArrV.length - 1) & ((int) (e() + iQ))] = obj;
    }

    private final boolean u(Object obj) {
        if (this.e == 0) {
            boolean z = aitz.a;
            if (this.f != 0) {
                t(obj);
                int i = this.h + 1;
                this.h = i;
                if (i > 1) {
                    s();
                }
                this.c = e() + this.h;
            }
            return true;
        }
        int i2 = this.h;
        int i3 = this.g;
        if (i2 >= i3 && this.c <= this.b) {
            int i4 = this.j;
            if (i4 == 0) {
                throw null;
            }
            int i5 = i4 - 1;
            if (i5 == 0) {
                return false;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    return true;
                }
                throw new aezs();
            }
        }
        t(obj);
        int i6 = this.h + 1;
        this.h = i6;
        if (i6 > i3) {
            s();
        }
        if (p() > this.f) {
            k(this.b + 1, this.c, d(), f());
        }
        return true;
    }

    private final Object[] v(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.a = objArr2;
        if (objArr != null) {
            long jE = e();
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = (int) (i3 + jE);
                objArr2[i4 & (i2 - 1)] = objArr[i4 & (objArr.length - 1)];
            }
        }
        return objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.lang.Object[]] */
    private final afck[] w(afck[] afckVarArr) {
        ajaj[] ajajVarArr;
        aizr aizrVar;
        afck afckVar;
        if (this.e != 0 && (ajajVarArr = this.d) != null) {
            int length = afckVarArr.length;
            int i = 0;
            afckVarArr = afckVarArr;
            while (i < ajajVarArr.length) {
                ajaj ajajVar = ajajVarArr[i];
                if (ajajVar != null && (afckVar = (aizrVar = (aizr) ajajVar).b) != null && r(aizrVar) >= 0) {
                    int length2 = afckVarArr.length;
                    afckVarArr = afckVarArr;
                    if (length >= length2) {
                        ?? CopyOf = Arrays.copyOf(afckVarArr, Math.max(2, length2 + length2));
                        CopyOf.getClass();
                        afckVarArr = CopyOf;
                    }
                    afckVarArr[length] = afckVar;
                    aizrVar.b = null;
                    length++;
                }
                i++;
                afckVarArr = afckVarArr;
            }
        }
        return afckVarArr;
    }

    @Override // defpackage.aizk, defpackage.aiyl
    public final Object a(Object obj, afck afckVar) throws Throwable {
        aizp aizpVar;
        Throwable th;
        afck[] afckVarArrW;
        aizn aiznVar;
        if (c(obj)) {
            return afak.a;
        }
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        afck[] afckVarArrW2 = ajai.a;
        synchronized (this) {
            try {
                if (u(obj)) {
                    try {
                        aitgVar.w(afak.a);
                        afckVarArrW = w(afckVarArrW2);
                        aiznVar = null;
                        aizpVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        aizpVar = this;
                        throw th;
                    }
                } else {
                    aizpVar = this;
                    try {
                        aiznVar = new aizn(aizpVar, e() + q(), obj, aitgVar);
                        aizpVar.t(aiznVar);
                        aizpVar.i++;
                        if (aizpVar.g == 0) {
                            afckVarArrW2 = aizpVar.w(afckVarArrW2);
                        }
                        afckVarArrW = afckVarArrW2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aiznVar != null) {
                    aitgVar.A(new aiup(aiznVar, 0));
                }
                for (afck afckVar2 : afckVarArrW) {
                    if (afckVar2 != null) {
                        afckVar2.w(afak.a);
                    }
                }
                Object objK = aitgVar.k();
                afcr afcrVar = afcr.a;
                if (objK == afcrVar) {
                    afckVar.getClass();
                }
                return objK != afcrVar ? afak.a : objK;
            } catch (Throwable th4) {
                th = th4;
                aizpVar = this;
            }
        }
    }

    @Override // defpackage.aizk
    public final boolean c(Object obj) {
        int i;
        boolean z;
        afck[] afckVarArrW = ajai.a;
        synchronized (this) {
            if (u(obj)) {
                afckVarArrW = w(afckVarArrW);
                z = true;
            } else {
                z = false;
            }
        }
        for (afck afckVar : afckVarArrW) {
            if (afckVar != null) {
                afckVar.w(afak.a);
            }
        }
        return z;
    }

    public final long d() {
        return e() + this.h;
    }

    public final long e() {
        return Math.min(this.c, this.b);
    }

    public final long f() {
        return e() + this.h + this.i;
    }

    protected final Object h() {
        Object[] objArr = this.a;
        objArr.getClass();
        return aizq.a(objArr, (this.b + p()) - 1);
    }

    @Override // defpackage.ajay
    public final aiyk hQ(afco afcoVar, int i, int i2) {
        return aizq.c(this, afcoVar, i, i2);
    }

    @Override // defpackage.aizm, defpackage.aiyk
    public final Object hR(aiyl aiylVar, afck afckVar) {
        return g(this, aiylVar, afckVar);
    }

    @Override // defpackage.ajah
    public final /* synthetic */ ajaj i() {
        return new aizr();
    }

    public final void j() {
        if (this.g != 0 || this.i > 1) {
            Object[] objArr = this.a;
            objArr.getClass();
            while (this.i > 0) {
                long jE = e() + q();
                int length = objArr.length - 1;
                if (objArr[((int) (jE - 1)) & length] != aizq.a) {
                    return;
                }
                this.i--;
                objArr[((int) (e() + q())) & length] = null;
            }
        }
    }

    public final void k(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        boolean z = aitz.a;
        for (long jE = e(); jE < jMin; jE++) {
            Object[] objArr = this.a;
            objArr.getClass();
            objArr[((int) jE) & (objArr.length - 1)] = null;
        }
        this.b = j;
        this.c = j2;
        this.h = (int) (j3 - jMin);
        this.i = (int) (j4 - j3);
    }

    public final afck[] l(long j) {
        long j2;
        int i;
        long j3;
        ajaj[] ajajVarArr;
        boolean z = aitz.a;
        if (j <= this.c) {
            long jE = e();
            long j4 = this.h + jE;
            int i2 = this.g;
            if (i2 == 0 && this.i > 0) {
                j4++;
            }
            int i3 = 0;
            if (this.e != 0 && (ajajVarArr = this.d) != null) {
                for (ajaj ajajVar : ajajVarArr) {
                    if (ajajVar != null) {
                        long j5 = ((aizr) ajajVar).a;
                        if (j5 >= 0 && j5 < j4) {
                            j4 = j5;
                        }
                    }
                }
            }
            if (j4 > this.c) {
                long jD = d();
                int i4 = this.e;
                int iMin = this.i;
                if (i4 > 0) {
                    iMin = Math.min(iMin, i2 - ((int) (jD - j4)));
                }
                afck[] afckVarArr = ajai.a;
                long j6 = this.i + jD;
                if (iMin > 0) {
                    afckVarArr = new afck[iMin];
                    Object[] objArr = this.a;
                    objArr.getClass();
                    j3 = 1;
                    long j7 = jD;
                    while (true) {
                        if (jD >= j6) {
                            j2 = j4;
                            i = i2;
                            jD = j7;
                            break;
                        }
                        j2 = j4;
                        int length = objArr.length - 1;
                        int i5 = ((int) jD) & length;
                        Object obj = objArr[i5];
                        ajcz ajczVar = aizq.a;
                        if (obj != ajczVar) {
                            obj.getClass();
                            int i6 = i3 + 1;
                            aizn aiznVar = (aizn) obj;
                            i = i2;
                            afckVarArr[i3] = aiznVar.d;
                            objArr[i5] = ajczVar;
                            objArr[((int) j7) & length] = aiznVar.c;
                            long j8 = j7 + 1;
                            if (i6 >= iMin) {
                                jD = j8;
                                break;
                            }
                            i3 = i6;
                            j7 = j8;
                        } else {
                            i = i2;
                        }
                        jD++;
                        j4 = j2;
                        i2 = i;
                    }
                } else {
                    j2 = j4;
                    i = i2;
                    j3 = 1;
                }
                afck[] afckVarArr2 = afckVarArr;
                long jMax = Math.max(this.b, Math.max(jE, jD - this.f));
                if (i == 0 && jMax < j6) {
                    Object[] objArr2 = this.a;
                    objArr2.getClass();
                    if (affa.f(objArr2[((int) jMax) & (objArr2.length - 1)], aizq.a)) {
                        jD += j3;
                        jMax += j3;
                    }
                }
                long j9 = jD;
                k(jMax, this.e == 0 ? j9 : j2, j9, j6);
                j();
                return afckVarArr2.length == 0 ? afckVarArr2 : w(afckVarArr2);
            }
        }
        return ajai.a;
    }

    @Override // defpackage.ajah
    public final /* bridge */ /* synthetic */ ajaj[] m() {
        return new aizr[2];
    }
}
