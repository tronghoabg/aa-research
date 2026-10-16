package O0;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f8762d;

    /* renamed from: a, reason: collision with root package name */
    public f f8759a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f8760b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8761c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8763e = false;

    public b(G9.e eVar) {
        this.f8762d = new a(this, eVar);
    }

    public final void a(c cVar, int i5) {
        this.f8762d.g(cVar.j(i5), 1.0f);
        this.f8762d.g(cVar.j(i5), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i5) {
        boolean z2 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z2 = true;
            }
            this.f8760b = i5;
        }
        if (z2) {
            this.f8762d.g(fVar, 1.0f);
            this.f8762d.g(fVar2, -1.0f);
            this.f8762d.g(fVar3, -1.0f);
        } else {
            this.f8762d.g(fVar, -1.0f);
            this.f8762d.g(fVar2, 1.0f);
            this.f8762d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i5) {
        boolean z2 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z2 = true;
            }
            this.f8760b = i5;
        }
        if (z2) {
            this.f8762d.g(fVar, 1.0f);
            this.f8762d.g(fVar2, -1.0f);
            this.f8762d.g(fVar3, 1.0f);
        } else {
            this.f8762d.g(fVar, -1.0f);
            this.f8762d.g(fVar2, 1.0f);
            this.f8762d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f8759a == null && this.f8760b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f8762d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i5;
        int iD = this.f8762d.d();
        f fVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float f11 = this.f8762d.f(i10);
            if (f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f fVarE = this.f8762d.e(i10);
                if ((zArr == null || !zArr[fVarE.f8787b]) && fVarE != fVar && (((i5 = fVarE.f8796l) == 3 || i5 == 4) && f11 < f10)) {
                    f10 = f11;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f8759a;
        if (fVar2 != null) {
            this.f8762d.g(fVar2, -1.0f);
            this.f8759a.f8788c = -1;
            this.f8759a = null;
        }
        float fH = this.f8762d.h(fVar, true) * (-1.0f);
        this.f8759a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f8760b /= fH;
        a aVar = this.f8762d;
        int i5 = aVar.f8756h;
        for (int i10 = 0; i5 != -1 && i10 < aVar.f8749a; i10++) {
            float[] fArr = aVar.f8755g;
            fArr[i5] = fArr[i5] / fH;
            i5 = aVar.f8754f[i5];
        }
    }

    public final void h(c cVar, f fVar, boolean z2) {
        if (fVar == null || !fVar.f8791f) {
            return;
        }
        float fC = this.f8762d.c(fVar);
        this.f8760b = (fVar.f8790e * fC) + this.f8760b;
        this.f8762d.h(fVar, z2);
        if (z2) {
            fVar.b(this);
        }
        if (this.f8762d.d() == 0) {
            this.f8763e = true;
            cVar.f8766a = true;
        }
    }

    public void i(c cVar, b bVar, boolean z2) {
        a aVar = this.f8762d;
        aVar.getClass();
        float fC = aVar.c(bVar.f8759a);
        aVar.h(bVar.f8759a, z2);
        a aVar2 = bVar.f8762d;
        int iD = aVar2.d();
        for (int i5 = 0; i5 < iD; i5++) {
            f fVarE = aVar2.e(i5);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z2);
        }
        this.f8760b = (bVar.f8760b * fC) + this.f8760b;
        if (z2) {
            bVar.f8759a.b(this);
        }
        if (this.f8759a == null || this.f8762d.d() != 0) {
            return;
        }
        this.f8763e = true;
        cVar.f8766a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            O0.f r0 = r10.f8759a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            O0.f r1 = r10.f8759a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = N0.a.f(r0, r1)
            float r1 = r10.f8760b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = N0.a.j(r0)
            float r1 = r10.f8760b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            O0.a r5 = r10.f8762d
            int r5 = r5.d()
        L3c:
            if (r4 >= r5) goto L9c
            O0.a r6 = r10.f8762d
            O0.f r6 = r6.e(r4)
            if (r6 != 0) goto L47
            goto L99
        L47:
            O0.a r7 = r10.f8762d
            float r7 = r7.f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = N0.a.f(r0, r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = N0.a.f(r0, r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = N0.a.f(r0, r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = N0.a.f(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L3c
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = N0.a.f(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.b.toString():java.lang.String");
    }
}
