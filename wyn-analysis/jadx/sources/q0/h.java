package Q0;

import A.AbstractC0213f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f9651q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f9652r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f9653s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f9654t0 = this.f9524J;

    /* renamed from: u0, reason: collision with root package name */
    public int f9655u0 = 0;
    public boolean v0;

    public h() {
        this.f9531R.clear();
        this.f9531R.add(this.f9654t0);
        int length = this.f9530Q.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f9530Q[i5] = this.f9654t0;
        }
    }

    @Override // Q0.d
    public final boolean A() {
        return this.v0;
    }

    @Override // Q0.d
    public final boolean B() {
        return this.v0;
    }

    @Override // Q0.d
    public final void Q(O0.c cVar, boolean z2) {
        if (this.f9533T == null) {
            return;
        }
        c cVar2 = this.f9654t0;
        cVar.getClass();
        int iN = O0.c.n(cVar2);
        if (this.f9655u0 == 1) {
            this.f9538Y = iN;
            this.f9539Z = 0;
            L(this.f9533T.k());
            O(0);
            return;
        }
        this.f9538Y = 0;
        this.f9539Z = iN;
        O(this.f9533T.q());
        L(0);
    }

    public final void R(int i5) {
        this.f9654t0.l(i5);
        this.v0 = true;
    }

    public final void S(int i5) {
        if (this.f9655u0 == i5) {
            return;
        }
        this.f9655u0 = i5;
        ArrayList arrayList = this.f9531R;
        arrayList.clear();
        if (this.f9655u0 == 1) {
            this.f9654t0 = this.f9523I;
        } else {
            this.f9654t0 = this.f9524J;
        }
        arrayList.add(this.f9654t0);
        c[] cVarArr = this.f9530Q;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f9654t0;
        }
    }

    @Override // Q0.d
    public final void b(O0.c cVar, boolean z2) {
        e eVar = (e) this.f9533T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.f9533T;
        boolean z10 = dVar != null && dVar.f9570p0[0] == 2;
        if (this.f9655u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.f9533T;
            z10 = dVar2 != null && dVar2.f9570p0[1] == 2;
        }
        if (this.v0) {
            c cVar2 = this.f9654t0;
            if (cVar2.f9508c) {
                O0.f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.f9654t0.d());
                if (this.f9652r0 != -1) {
                    if (z10) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f9653s0 != -1 && z10) {
                    O0.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.f9652r0 != -1) {
            O0.f fVarK3 = cVar.k(this.f9654t0);
            cVar.e(fVarK3, cVar.k(objI), this.f9652r0, 8);
            if (z10) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f9653s0 != -1) {
            O0.f fVarK4 = cVar.k(this.f9654t0);
            O0.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f9653s0, 8);
            if (z10) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f9651q0 != -1.0f) {
            O0.f fVarK6 = cVar.k(this.f9654t0);
            O0.f fVarK7 = cVar.k(objI2);
            float f10 = this.f9651q0;
            O0.b bVarL = cVar.l();
            bVarL.f8762d.g(fVarK6, -1.0f);
            bVarL.f8762d.g(fVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // Q0.d
    public final boolean c() {
        return true;
    }

    @Override // Q0.d
    public final c i(int i5) {
        int iF = AbstractC0213f.f(i5);
        if (iF != 1) {
            if (iF != 2) {
                if (iF != 3) {
                    if (iF != 4) {
                        return null;
                    }
                }
            }
            if (this.f9655u0 == 0) {
                return this.f9654t0;
            }
            return null;
        }
        if (this.f9655u0 == 1) {
            return this.f9654t0;
        }
        return null;
    }
}
