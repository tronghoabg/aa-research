package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.a;
import defpackage.ca;
import defpackage.edf;
import defpackage.edg;
import defpackage.kx;
import defpackage.ld;
import defpackage.le;
import defpackage.lf;
import defpackage.lo;
import defpackage.lp;
import defpackage.lq;
import defpackage.lt;
import defpackage.ly;
import defpackage.lz;
import defpackage.ma;
import defpackage.me;
import defpackage.mj;
import defpackage.mk;
import defpackage.ml;
import defpackage.x;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends lz implements mj {
    private lf a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final boolean e;
    private final le f;
    private final int g;
    private final int[] h;
    int k;
    lq l;
    boolean m;
    int n;
    int o;
    SavedState p;
    final ld q;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new ld();
        this.f = new le();
        this.g = 2;
        this.h = new int[2];
        ly lyVarAB = aB(context, attributeSet, i, i2);
        ae(lyVarAB.a);
        af(lyVarAB.c);
        t(lyVarAB.d);
    }

    private final int bE(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        Y();
        lq lqVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return ca.o(mlVar, lqVar, aq(z2), ap(z2), this, z);
    }

    private final int bF(int i, me meVar, ml mlVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -N(-iF2, meVar, mlVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return iF + i2;
    }

    private final int bG(int i, me meVar, ml mlVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -N(iJ2, meVar, mlVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final View bH() {
        return S(0, av());
    }

    private final View bI() {
        return S(av() - 1, -1);
    }

    private final View bJ() {
        return aD(this.m ? 0 : av() - 1);
    }

    private final View bK() {
        return aD(this.m ? av() - 1 : 0);
    }

    private final void bL(me meVar, lf lfVar) {
        if (!lfVar.a || lfVar.m) {
            return;
        }
        int i = lfVar.g;
        int i2 = lfVar.i;
        if (lfVar.f == -1) {
            int iAv = av();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.m) {
                    for (int i3 = 0; i3 < iAv; i3++) {
                        View viewAD = aD(i3);
                        if (this.l.d(viewAD) < iE || this.l.m(viewAD) < iE) {
                            bM(meVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAv - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View viewAD2 = aD(i5);
                    if (this.l.d(viewAD2) < iE || this.l.m(viewAD2) < iE) {
                        bM(meVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAv2 = av();
            if (!this.m) {
                for (int i7 = 0; i7 < iAv2; i7++) {
                    View viewAD3 = aD(i7);
                    if (this.l.a(viewAD3) > i6 || this.l.l(viewAD3) > i6) {
                        bM(meVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAv2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewAD4 = aD(i9);
                if (this.l.a(viewAD4) > i6 || this.l.l(viewAD4) > i6) {
                    bM(meVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bM(me meVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aT(i, meVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aT(i2, meVar);
                }
            }
        }
    }

    private final void bN(int i, int i2, boolean z, ml mlVar) {
        int iJ;
        this.a.m = al();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        X(mlVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        lf lfVar = this.a;
        lfVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        lfVar.i = iMax;
        if (i == 1) {
            lfVar.h = i3 + this.l.g();
            View viewBJ = bJ();
            lf lfVar2 = this.a;
            lfVar2.e = true == this.m ? -1 : 1;
            int iFP = ((ma) viewBJ.getLayoutParams()).fP();
            lf lfVar3 = this.a;
            lfVar2.d = iFP + lfVar3.e;
            lfVar3.b = this.l.a(viewBJ);
            iJ = this.l.a(viewBJ) - this.l.f();
        } else {
            View viewBK = bK();
            this.a.h += this.l.j();
            lf lfVar4 = this.a;
            lfVar4.e = true != this.m ? -1 : 1;
            int iFP2 = ((ma) viewBK.getLayoutParams()).fP();
            lf lfVar5 = this.a;
            lfVar4.d = iFP2 + lfVar5.e;
            lfVar5.b = this.l.d(viewBK);
            iJ = (-this.l.d(viewBK)) + this.l.j();
        }
        lf lfVar6 = this.a;
        lfVar6.c = i2;
        if (z) {
            lfVar6.c = i2 - iJ;
        }
        lfVar6.g = iJ;
    }

    private final void bO(ld ldVar) {
        bP(ldVar.b, ldVar.c);
    }

    private final void bP(int i, int i2) {
        this.a.c = this.l.f() - i2;
        lf lfVar = this.a;
        lfVar.e = true != this.m ? 1 : -1;
        lfVar.d = i;
        lfVar.f = 1;
        lfVar.b = i2;
        lfVar.g = Integer.MIN_VALUE;
    }

    private final void bQ(ld ldVar) {
        bR(ldVar.b, ldVar.c);
    }

    private final void bR(int i, int i2) {
        this.a.c = i2 - this.l.j();
        lf lfVar = this.a;
        lfVar.d = i;
        lfVar.e = true != this.m ? -1 : 1;
        lfVar.f = -1;
        lfVar.b = i2;
        lfVar.g = Integer.MIN_VALUE;
    }

    private final int c(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        Y();
        lq lqVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return ca.m(mlVar, lqVar, aq(z2), ap(z2), this, z);
    }

    private final int s(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        Y();
        lq lqVar = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return ca.n(mlVar, lqVar, aq(z2), ap(z2), this, z, this.m);
    }

    @Override // defpackage.lz
    public final int D(ml mlVar) {
        return c(mlVar);
    }

    @Override // defpackage.lz
    public final int E(ml mlVar) {
        return s(mlVar);
    }

    @Override // defpackage.lz
    public final int F(ml mlVar) {
        return bE(mlVar);
    }

    @Override // defpackage.lz
    public final int G(ml mlVar) {
        return c(mlVar);
    }

    @Override // defpackage.lz
    public final int H(ml mlVar) {
        return s(mlVar);
    }

    @Override // defpackage.lz
    public final int I(ml mlVar) {
        return bE(mlVar);
    }

    final int J(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && aj()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && aj()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.k == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    final int K(me meVar, lf lfVar, ml mlVar, boolean z) {
        int i = lfVar.c;
        int i2 = lfVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                lfVar.g = i2 + i;
            }
            bL(meVar, lfVar);
        }
        int i3 = lfVar.c + lfVar.h;
        le leVar = this.f;
        while (true) {
            if ((!lfVar.m && i3 <= 0) || !lfVar.c(mlVar)) {
                break;
            }
            leVar.a = 0;
            leVar.b = false;
            leVar.c = false;
            leVar.d = false;
            l(meVar, mlVar, lfVar, leVar);
            if (!leVar.b) {
                int i4 = lfVar.b;
                int i5 = leVar.a;
                lfVar.b = i4 + (lfVar.f * i5);
                if (!leVar.c || lfVar.l != null || !mlVar.g) {
                    lfVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = lfVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    lfVar.g = i7;
                    int i8 = lfVar.c;
                    if (i8 < 0) {
                        lfVar.g = i7 + i8;
                    }
                    bL(meVar, lfVar);
                }
                if (z && leVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - lfVar.c;
    }

    public final int L() {
        View viewT = T(0, av(), false, true);
        if (viewT == null) {
            return -1;
        }
        return ((ma) viewT.getLayoutParams()).fP();
    }

    public final int M() {
        View viewT = T(av() - 1, -1, false, true);
        if (viewT == null) {
            return -1;
        }
        return ((ma) viewT.getLayoutParams()).fP();
    }

    final int N(int i, me meVar, ml mlVar) {
        if (av() != 0 && i != 0) {
            Y();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            bN(i2, iAbs, true, mlVar);
            lf lfVar = this.a;
            int iK = lfVar.g + K(meVar, lfVar, mlVar, false);
            if (iK >= 0) {
                if (iAbs > iK) {
                    i = i2 * iK;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.mj
    public final PointF O(int i) {
        if (av() == 0) {
            return null;
        }
        float f = (i < bl(aD(0))) != this.m ? -1 : 1;
        return this.k == 0 ? new PointF(f, BitmapDescriptorFactory.HUE_RED) : new PointF(BitmapDescriptorFactory.HUE_RED, f);
    }

    @Override // defpackage.lz
    public final Parcelable P() {
        SavedState savedState = this.p;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (av() <= 0) {
            savedState2.a();
            return savedState2;
        }
        Y();
        boolean z = this.b ^ this.m;
        savedState2.c = z;
        if (z) {
            View viewBJ = bJ();
            savedState2.b = this.l.f() - this.l.a(viewBJ);
            savedState2.a = bl(viewBJ);
            return savedState2;
        }
        View viewBK = bK();
        savedState2.a = bl(viewBK);
        savedState2.b = this.l.d(viewBK) - this.l.j();
        return savedState2;
    }

    final View Q() {
        int i;
        int iAv;
        int iAv2;
        if (this.m) {
            iAv2 = av();
            i = 1;
            iAv = 0;
        } else {
            i = -1;
            iAv = av() - 1;
            iAv2 = -1;
        }
        while (iAv != iAv2) {
            View viewAD = aD(iAv);
            if (viewAD != null && viewAD.hasFocusable()) {
                return viewAD;
            }
            iAv += i;
        }
        return null;
    }

    final View R() {
        int iAv;
        int i;
        int iAv2;
        if (this.m) {
            iAv = -1;
            iAv2 = av() - 1;
            i = -1;
        } else {
            iAv = av();
            i = 1;
            iAv2 = 0;
        }
        while (iAv2 != iAv) {
            View viewAD = aD(iAv2);
            if (viewAD != null && viewAD.hasFocusable()) {
                return viewAD;
            }
            iAv2 += i;
        }
        return null;
    }

    final View S(int i, int i2) {
        Y();
        if (i2 <= i && i2 >= i) {
            return aD(i);
        }
        int iD = this.l.d(aD(i));
        int iJ = this.l.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.k == 0 ? this.E.G(i, i2, i4, i3) : this.F.G(i, i2, i4, i3);
    }

    public final View T(int i, int i2, boolean z, boolean z2) {
        Y();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        int i5 = true != z2 ? 0 : 320;
        return i3 == 0 ? this.E.G(i, i2, i4, i5) : this.F.G(i, i2, i4, i5);
    }

    @Override // defpackage.lz
    public final View U(int i) {
        int iAv = av();
        if (iAv == 0) {
            return null;
        }
        int iBl = i - bl(aD(0));
        if (iBl >= 0 && iBl < iAv) {
            View viewAD = aD(iBl);
            if (bl(viewAD) == i) {
                return viewAD;
            }
        }
        return super.U(i);
    }

    public final View V(int i, me meVar, ml mlVar) {
        int iJ;
        View viewBH;
        ac();
        if (av() == 0 || (iJ = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Y();
        bN(iJ, (int) (this.l.k() * 0.33333334f), false, mlVar);
        lf lfVar = this.a;
        lfVar.g = Integer.MIN_VALUE;
        lfVar.a = false;
        K(meVar, lfVar, mlVar, true);
        boolean z = this.m;
        if (iJ == -1) {
            viewBH = z ? bI() : bH();
            iJ = -1;
        } else {
            viewBH = z ? bH() : bI();
        }
        View viewBK = iJ == -1 ? bK() : bJ();
        if (!viewBK.hasFocusable()) {
            return viewBH;
        }
        if (viewBH == null) {
            return null;
        }
        return viewBK;
    }

    @Override // defpackage.lz
    public final void W(String str) {
        if (this.p == null) {
            super.W(str);
        }
    }

    protected void X(ml mlVar, int[] iArr) {
        int iK = mlVar.a != -1 ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void Y() {
        if (this.a == null) {
            this.a = new lf();
        }
    }

    @Override // defpackage.lz
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (av() > 0) {
            accessibilityEvent.setFromIndex(L());
            accessibilityEvent.setToIndex(M());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aa(defpackage.me r17, defpackage.ml r18) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.aa(me, ml):void");
    }

    @Override // defpackage.lz
    public final void ab(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.p = savedState;
            if (this.n != -1) {
                savedState.a();
            }
            aV();
        }
    }

    final void ac() {
        this.m = (this.k == 1 || !aj()) ? this.c : !this.c;
    }

    @Override // defpackage.lz
    public final void ad(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    public final void ae(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.bp(i, "invalid orientation:"));
        }
        W(null);
        if (i != this.k || this.l == null) {
            lq lpVar = i != 0 ? new lp(this) : new lo(this);
            this.l = lpVar;
            this.q.a = lpVar;
            this.k = i;
            aV();
        }
    }

    public final void af(boolean z) {
        W(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aV();
    }

    @Override // defpackage.lz
    public final boolean ag() {
        return this.k == 0;
    }

    @Override // defpackage.lz
    public final boolean ah() {
        return this.k == 1;
    }

    @Override // defpackage.lz
    public final boolean ai() {
        return true;
    }

    protected final boolean aj() {
        return ay() == 1;
    }

    @Override // defpackage.lz
    public final boolean ak() {
        return this.c;
    }

    final boolean al() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.lz
    public final boolean am() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int iAv = av();
            for (int i = 0; i < iAv; i++) {
                ViewGroup.LayoutParams layoutParams = aD(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.lz
    public final void an(int i, int i2, ml mlVar, kx kxVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (av() == 0 || i == 0) {
            return;
        }
        Y();
        bN(i > 0 ? 1 : -1, Math.abs(i), true, mlVar);
        x(mlVar, this.a, kxVar);
    }

    @Override // defpackage.lz
    public final void ao(int i, kx kxVar) {
        boolean z;
        int i2;
        SavedState savedState = this.p;
        if (savedState == null || !savedState.b()) {
            ac();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
            i2 = savedState.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            kxVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View ap(boolean z) {
        return this.m ? T(0, av(), z, true) : T(av() - 1, -1, z, true);
    }

    final View aq(boolean z) {
        return this.m ? T(av() - 1, -1, z, true) : T(0, av(), z, true);
    }

    @Override // defpackage.lz
    public void as(RecyclerView recyclerView, int i) {
        mk mkVar = new mk(recyclerView.getContext());
        mkVar.b = i;
        bc(mkVar);
    }

    public final void at(int i) {
        this.n = i;
        this.o = 0;
        SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    @Override // defpackage.lz
    public int d(int i, me meVar, ml mlVar) {
        if (this.k == 1) {
            return 0;
        }
        return N(i, meVar, mlVar);
    }

    @Override // defpackage.lz
    public int e(int i, me meVar, ml mlVar) {
        if (this.k == 0) {
            return 0;
        }
        return N(i, meVar, mlVar);
    }

    @Override // defpackage.lz
    public ma f() {
        return new ma(-2, -2);
    }

    @Override // defpackage.lz
    public View fV(int i, me meVar, ml mlVar) {
        int iJ;
        ac();
        if (av() == 0 || (iJ = J(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Y();
        int iA = (iJ == -1) ^ this.m ? mlVar.a() - 1 : 0;
        if (U(iA) != null) {
            as(this.s, iA);
        } else {
            this.n = iA;
            aa(meVar, mlVar);
        }
        View viewQ = iJ == -1 ? Q() : R();
        return (viewQ == null || !viewQ.hasFocusable()) ? V(i, meVar, mlVar) : viewQ;
    }

    @Override // defpackage.lz
    public View fW(View view, int i, me meVar, ml mlVar) {
        return V(i, meVar, mlVar);
    }

    @Override // defpackage.lz
    public void fX(me meVar, ml mlVar, edg edgVar) {
        super.fX(meVar, mlVar, edgVar);
        lt ltVar = this.s.m;
        if (ltVar == null || ltVar.a() <= 0) {
            return;
        }
        edgVar.h(edf.j);
    }

    @Override // defpackage.lz
    public boolean ga(int i, Bundle bundle) {
        int iMin;
        if (super.ga(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.s;
                iMin = Math.min(i2, fT(recyclerView.e, recyclerView.N) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.s;
                iMin = Math.min(i3, fS(recyclerView2.e, recyclerView2.N) - 1);
            }
            if (iMin >= 0) {
                at(iMin);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lz
    public boolean gb() {
        return this.p == null && this.b == this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View i(defpackage.me r17, defpackage.ml r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.Y()
            int r1 = r0.av()
            r2 = 1
            r3 = 0
            if (r20 == 0) goto L15
            int r1 = r0.av()
            r4 = -1
            int r1 = r1 + r4
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r5 = r2
            r1 = r3
        L18:
            int r6 = r18.a()
            lq r7 = r0.l
            int r7 = r7.j()
            lq r8 = r0.l
            int r8 = r8.f()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L80
            android.view.View r12 = r0.aD(r1)
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            ma r13 = (defpackage.ma) r13
            int r13 = r13.fP()
            lq r14 = r0.l
            int r14 = r14.d(r12)
            lq r15 = r0.l
            int r15 = r15.a(r12)
            if (r13 < 0) goto L7e
            if (r13 >= r6) goto L7e
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            ma r13 = (defpackage.ma) r13
            boolean r13 = r13.fR()
            if (r13 == 0) goto L5b
            if (r11 != 0) goto L7e
            r11 = r12
            goto L7e
        L5b:
            if (r15 > r7) goto L61
            if (r14 >= r7) goto L61
            r13 = r2
            goto L62
        L61:
            r13 = r3
        L62:
            if (r14 < r8) goto L68
            if (r15 <= r8) goto L68
            r14 = r2
            goto L69
        L68:
            r14 = r3
        L69:
            if (r13 != 0) goto L6f
            if (r14 == 0) goto L6e
            goto L6f
        L6e:
            return r12
        L6f:
            if (r19 == 0) goto L77
            if (r14 == 0) goto L74
            goto L79
        L74:
            if (r9 != 0) goto L7e
            goto L7d
        L77:
            if (r13 == 0) goto L7b
        L79:
            r10 = r12
            goto L7e
        L7b:
            if (r9 != 0) goto L7e
        L7d:
            r9 = r12
        L7e:
            int r1 = r1 + r5
            goto L2b
        L80:
            if (r9 == 0) goto L83
            return r9
        L83:
            if (r10 == 0) goto L86
            return r10
        L86:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.i(me, ml, boolean, boolean):android.view.View");
    }

    public void l(me meVar, ml mlVar, lf lfVar, le leVar) {
        int paddingTop;
        int i;
        int iC;
        int i2;
        int iC2;
        View viewA = lfVar.a(meVar);
        if (viewA == null) {
            leVar.b = true;
            return;
        }
        ma maVar = (ma) viewA.getLayoutParams();
        List list = lfVar.l;
        boolean z = this.m;
        if (list == null) {
            if (z == (lfVar.f == -1)) {
                super.aF(viewA, -1, false);
            } else {
                super.aF(viewA, 0, false);
            }
        } else {
            if (z == (lfVar.f == -1)) {
                super.aF(viewA, -1, true);
            } else {
                super.aF(viewA, 0, true);
            }
        }
        bs(viewA);
        leVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (aj()) {
                iC = this.C - getPaddingRight();
                iC2 = iC - this.l.c(viewA);
            } else {
                int paddingLeft = getPaddingLeft();
                iC = this.l.c(viewA) + paddingLeft;
                iC2 = paddingLeft;
            }
            if (lfVar.f == -1) {
                i2 = lfVar.b;
                paddingTop = i2 - leVar.a;
            } else {
                paddingTop = lfVar.b;
                i2 = leVar.a + paddingTop;
            }
        } else {
            paddingTop = getPaddingTop();
            int iC3 = this.l.c(viewA) + paddingTop;
            if (lfVar.f == -1) {
                iC = lfVar.b;
                i = iC - leVar.a;
            } else {
                i = lfVar.b;
                iC = leVar.a + i;
            }
            int i3 = i;
            i2 = iC3;
            iC2 = i3;
        }
        br(viewA, iC2, paddingTop, iC, i2);
        if (maVar.fR() || maVar.fQ()) {
            leVar.c = true;
        }
        leVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.lz
    public void p(me meVar, ml mlVar) {
        aa(meVar, mlVar);
    }

    @Override // defpackage.lz
    public void q(ml mlVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void t(boolean z) {
        W(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aV();
    }

    public void x(ml mlVar, lf lfVar, kx kxVar) {
        int i = lfVar.d;
        if (i < 0 || i >= mlVar.a()) {
            return;
        }
        kxVar.a(i, Math.max(0, lfVar.g));
    }

    /* loaded from: classes2.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new x(15);
        int a;
        int b;
        boolean c;

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        final void a() {
            this.a = -1;
        }

        final boolean b() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }

        public SavedState() {
        }
    }

    @Override // defpackage.lz
    public final void ar(RecyclerView recyclerView) {
    }

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new ld();
        this.f = new le();
        this.g = 2;
        this.h = new int[2];
        ae(i);
        af(false);
    }

    public void m(me meVar, ml mlVar, ld ldVar, int i) {
    }
}
