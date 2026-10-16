package O0;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f8764p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f8765q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final e f8768c;

    /* renamed from: f, reason: collision with root package name */
    public b[] f8771f;

    /* renamed from: l, reason: collision with root package name */
    public final G9.e f8776l;

    /* renamed from: o, reason: collision with root package name */
    public b f8779o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8766a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f8767b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8769d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f8770e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8772g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f8773h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f8774i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f8775j = 0;
    public int k = 32;

    /* renamed from: m, reason: collision with root package name */
    public f[] f8777m = new f[f8765q];

    /* renamed from: n, reason: collision with root package name */
    public int f8778n = 0;

    public c() {
        this.f8771f = null;
        this.f8771f = new b[32];
        s();
        G9.e eVar = new G9.e(10);
        eVar.f4685b = new d();
        eVar.f4686c = new d();
        eVar.f4687d = new f[32];
        this.f8776l = eVar;
        e eVar2 = new e(eVar);
        eVar2.f8782f = new f[128];
        eVar2.f8783g = new f[128];
        eVar2.f8784h = 0;
        eVar2.f8785i = new S3.c(eVar2, 15);
        this.f8768c = eVar2;
        this.f8779o = new b(eVar);
    }

    public static int n(Object obj) {
        f fVar = ((Q0.c) obj).f9514i;
        if (fVar != null) {
            return (int) (fVar.f8790e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f a(int i5) {
        d dVar = (d) this.f8776l.f4686c;
        int i10 = dVar.f8781b;
        f fVar = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = dVar.f8780a;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            dVar.f8781b = i11;
            fVar = r42;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i5);
            fVar2.f8796l = i5;
        } else {
            fVar2.c();
            fVar2.f8796l = i5;
        }
        int i12 = this.f8778n;
        int i13 = f8765q;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f8765q = i14;
            this.f8777m = (f[]) Arrays.copyOf(this.f8777m, i14);
        }
        f[] fVarArr = this.f8777m;
        int i15 = this.f8778n;
        this.f8778n = i15 + 1;
        fVarArr[i15] = fVar2;
        return fVar2;
    }

    public final void b(f fVar, f fVar2, int i5, float f10, f fVar3, f fVar4, int i10, int i11) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f8762d.g(fVar, 1.0f);
            bVarL.f8762d.g(fVar4, 1.0f);
            bVarL.f8762d.g(fVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f8762d.g(fVar, 1.0f);
            bVarL.f8762d.g(fVar2, -1.0f);
            bVarL.f8762d.g(fVar3, -1.0f);
            bVarL.f8762d.g(fVar4, 1.0f);
            if (i5 > 0 || i10 > 0) {
                bVarL.f8760b = (-i5) + i10;
            }
        } else if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            bVarL.f8762d.g(fVar, -1.0f);
            bVarL.f8762d.g(fVar2, 1.0f);
            bVarL.f8760b = i5;
        } else if (f10 >= 1.0f) {
            bVarL.f8762d.g(fVar4, -1.0f);
            bVarL.f8762d.g(fVar3, 1.0f);
            bVarL.f8760b = -i10;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f8762d.g(fVar, f11 * 1.0f);
            bVarL.f8762d.g(fVar2, f11 * (-1.0f));
            bVarL.f8762d.g(fVar3, (-1.0f) * f10);
            bVarL.f8762d.g(fVar4, 1.0f * f10);
            if (i5 > 0 || i10 > 0) {
                bVarL.f8760b = (i10 * f10) + ((-i5) * f11);
            }
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(O0.b r18) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.c(O0.b):void");
    }

    public final void d(f fVar, int i5) {
        int i10 = fVar.f8788c;
        if (i10 == -1) {
            fVar.d(this, i5);
            for (int i11 = 0; i11 < this.f8767b + 1; i11++) {
                f fVar2 = ((f[]) this.f8776l.f4687d)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b bVarL = l();
            bVarL.f8759a = fVar;
            float f10 = i5;
            fVar.f8790e = f10;
            bVarL.f8760b = f10;
            bVarL.f8763e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f8771f[i10];
        if (bVar.f8763e) {
            bVar.f8760b = i5;
            return;
        }
        if (bVar.f8762d.d() == 0) {
            bVar.f8763e = true;
            bVar.f8760b = i5;
            return;
        }
        b bVarL2 = l();
        if (i5 < 0) {
            bVarL2.f8760b = i5 * (-1);
            bVarL2.f8762d.g(fVar, 1.0f);
        } else {
            bVarL2.f8760b = i5;
            bVarL2.f8762d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i5, int i10) {
        if (i10 == 8 && fVar2.f8791f && fVar.f8788c == -1) {
            fVar.d(this, fVar2.f8790e + i5);
            return;
        }
        b bVarL = l();
        boolean z2 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z2 = true;
            }
            bVarL.f8760b = i5;
        }
        if (z2) {
            bVarL.f8762d.g(fVar, 1.0f);
            bVarL.f8762d.g(fVar2, -1.0f);
        } else {
            bVarL.f8762d.g(fVar, -1.0f);
            bVarL.f8762d.g(fVar2, 1.0f);
        }
        if (i10 != 8) {
            bVarL.a(this, i10);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i5, int i10) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f8789d = 0;
        bVarL.b(fVar, fVar2, fVarM, i5);
        if (i10 != 8) {
            bVarL.f8762d.g(j(i10), (int) (bVarL.f8762d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i5, int i10) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f8789d = 0;
        bVarL.c(fVar, fVar2, fVarM, i5);
        if (i10 != 8) {
            bVarL.f8762d.g(j(i10), (int) (bVarL.f8762d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i5;
        if (bVar.f8763e) {
            bVar.f8759a.d(this, bVar.f8760b);
        } else {
            b[] bVarArr = this.f8771f;
            int i10 = this.f8775j;
            bVarArr[i10] = bVar;
            f fVar = bVar.f8759a;
            fVar.f8788c = i10;
            this.f8775j = i10 + 1;
            fVar.e(this, bVar);
        }
        if (this.f8766a) {
            int i11 = 0;
            while (i11 < this.f8775j) {
                if (this.f8771f[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f8771f[i11];
                if (bVar2 != null && bVar2.f8763e) {
                    bVar2.f8759a.d(this, bVar2.f8760b);
                    ((d) this.f8776l.f4685b).b(bVar2);
                    this.f8771f[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i5 = this.f8775j;
                        if (i12 >= i5) {
                            break;
                        }
                        b[] bVarArr2 = this.f8771f;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        f fVar2 = bVar3.f8759a;
                        if (fVar2.f8788c == i12) {
                            fVar2.f8788c = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i5) {
                        this.f8771f[i13] = null;
                    }
                    this.f8775j = i5 - 1;
                    i11--;
                }
                i11++;
            }
            this.f8766a = false;
        }
    }

    public final void i() {
        for (int i5 = 0; i5 < this.f8775j; i5++) {
            b bVar = this.f8771f[i5];
            bVar.f8759a.f8790e = bVar.f8760b;
        }
    }

    public final f j(int i5) {
        if (this.f8774i + 1 >= this.f8770e) {
            o();
        }
        f fVarA = a(4);
        int i10 = this.f8767b + 1;
        this.f8767b = i10;
        this.f8774i++;
        fVarA.f8787b = i10;
        fVarA.f8789d = i5;
        ((f[]) this.f8776l.f4687d)[i10] = fVarA;
        e eVar = this.f8768c;
        eVar.f8785i.f10936b = fVarA;
        float[] fArr = fVarA.f8793h;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr[fVarA.f8789d] = 1.0f;
        eVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f8774i + 1 >= this.f8770e) {
            o();
        }
        if (!(obj instanceof Q0.c)) {
            return null;
        }
        Q0.c cVar = (Q0.c) obj;
        f fVar = cVar.f9514i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.f9514i;
        }
        int i5 = fVar.f8787b;
        G9.e eVar = this.f8776l;
        if (i5 != -1 && i5 <= this.f8767b && ((f[]) eVar.f4687d)[i5] != null) {
            return fVar;
        }
        if (i5 != -1) {
            fVar.c();
        }
        int i10 = this.f8767b + 1;
        this.f8767b = i10;
        this.f8774i++;
        fVar.f8787b = i10;
        fVar.f8796l = 1;
        ((f[]) eVar.f4687d)[i10] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        G9.e eVar = this.f8776l;
        d dVar = (d) eVar.f4685b;
        int i5 = dVar.f8781b;
        if (i5 > 0) {
            int i10 = i5 - 1;
            Object[] objArr = dVar.f8780a;
            obj = objArr[i10];
            objArr[i10] = null;
            dVar.f8781b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(eVar);
        }
        bVar.f8759a = null;
        bVar.f8762d.b();
        bVar.f8760b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.f8763e = false;
        return bVar;
    }

    public final f m() {
        if (this.f8774i + 1 >= this.f8770e) {
            o();
        }
        f fVarA = a(3);
        int i5 = this.f8767b + 1;
        this.f8767b = i5;
        this.f8774i++;
        fVarA.f8787b = i5;
        ((f[]) this.f8776l.f4687d)[i5] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i5 = this.f8769d * 2;
        this.f8769d = i5;
        this.f8771f = (b[]) Arrays.copyOf(this.f8771f, i5);
        G9.e eVar = this.f8776l;
        eVar.f4687d = (f[]) Arrays.copyOf((f[]) eVar.f4687d, this.f8769d);
        int i10 = this.f8769d;
        this.f8773h = new boolean[i10];
        this.f8770e = i10;
        this.k = i10;
    }

    public final void p() {
        e eVar = this.f8768c;
        if (eVar.e()) {
            i();
            return;
        }
        if (!this.f8772g) {
            q(eVar);
            return;
        }
        for (int i5 = 0; i5 < this.f8775j; i5++) {
            if (!this.f8771f[i5].f8763e) {
                q(eVar);
                return;
            }
        }
        i();
    }

    public final void q(e eVar) {
        int i5 = 0;
        while (true) {
            if (i5 >= this.f8775j) {
                break;
            }
            b bVar = this.f8771f[i5];
            int i10 = 1;
            if (bVar.f8759a.f8796l != 1) {
                float f10 = bVar.f8760b;
                float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    boolean z2 = false;
                    int i11 = 0;
                    while (!z2) {
                        i11 += i10;
                        float f12 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f8775j) {
                            b bVar2 = this.f8771f[i14];
                            if (bVar2.f8759a.f8796l != i10 && !bVar2.f8763e && bVar2.f8760b < f11) {
                                int iD = bVar2.f8762d.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    f fVarE = bVar2.f8762d.e(i16);
                                    float fC = bVar2.f8762d.c(fVarE);
                                    if (fC > f11) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f13 = fVarE.f8792g[i17] / fC;
                                            if ((f13 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = fVarE.f8787b;
                                                i12 = i14;
                                                f12 = f13;
                                            }
                                        }
                                    }
                                    i16++;
                                    f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                            }
                            i14++;
                            f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f8771f[i12];
                            bVar3.f8759a.f8788c = -1;
                            bVar3.g(((f[]) this.f8776l.f4687d)[i13]);
                            f fVar = bVar3.f8759a;
                            fVar.f8788c = i12;
                            fVar.e(this, bVar3);
                        } else {
                            z2 = true;
                        }
                        if (i11 > this.f8774i / 2) {
                            z2 = true;
                        }
                        f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i10 = 1;
                    }
                }
            }
            i5++;
        }
        r(eVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(O0.b r17) {
        /*
            Method dump skipped, instructions count: 177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.c.r(O0.b):void");
    }

    public final void s() {
        for (int i5 = 0; i5 < this.f8775j; i5++) {
            b bVar = this.f8771f[i5];
            if (bVar != null) {
                ((d) this.f8776l.f4685b).b(bVar);
            }
            this.f8771f[i5] = null;
        }
    }

    public final void t() {
        G9.e eVar;
        int i5 = 0;
        while (true) {
            eVar = this.f8776l;
            f[] fVarArr = (f[]) eVar.f4687d;
            if (i5 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i5];
            if (fVar != null) {
                fVar.c();
            }
            i5++;
        }
        d dVar = (d) eVar.f4686c;
        f[] fVarArr2 = this.f8777m;
        int length = this.f8778n;
        dVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i10 = 0; i10 < length; i10++) {
            f fVar2 = fVarArr2[i10];
            int i11 = dVar.f8781b;
            Object[] objArr = dVar.f8780a;
            if (i11 < objArr.length) {
                objArr[i11] = fVar2;
                dVar.f8781b = i11 + 1;
            }
        }
        this.f8778n = 0;
        Arrays.fill((f[]) eVar.f4687d, (Object) null);
        this.f8767b = 0;
        e eVar2 = this.f8768c;
        eVar2.f8784h = 0;
        eVar2.f8760b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f8774i = 1;
        for (int i12 = 0; i12 < this.f8775j; i12++) {
            b bVar = this.f8771f[i12];
        }
        s();
        this.f8775j = 0;
        this.f8779o = new b(eVar);
    }
}
