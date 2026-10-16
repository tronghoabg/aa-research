package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.ca;
import defpackage.edg;
import defpackage.erb;
import defpackage.lb;
import defpackage.lh;
import defpackage.lq;
import defpackage.ly;
import defpackage.lz;
import defpackage.ma;
import defpackage.me;
import defpackage.mj;
import defpackage.mk;
import defpackage.ml;
import defpackage.mx;
import defpackage.my;
import defpackage.mz;
import defpackage.ry;
import defpackage.x;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public class StaggeredGridLayoutManager extends lz implements mj {
    private int[] J;
    mz[] a;
    public lq b;
    lq c;
    private int i;
    private int j;
    private int k;
    private final lb l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private SavedState q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    ry h = new ry(null);
    private int n = 2;
    private final Rect G = new Rect();
    private final mx H = new mx(this);
    private boolean I = true;
    private final Runnable K = new lh(this, 3);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        ly lyVarAB = aB(context, attributeSet, i, i2);
        int i3 = lyVarAB.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        W(null);
        if (i3 != this.j) {
            this.j = i3;
            lq lqVar = this.b;
            this.b = this.c;
            this.c = lqVar;
            aV();
        }
        int i4 = lyVarAB.b;
        W(null);
        if (i4 != this.i) {
            this.h.a();
            aV();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new mz[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new mz(this, i5);
            }
            aV();
        }
        J(lyVarAB.c);
        this.l = new lb();
        this.b = lq.p(this, this.j);
        this.c = lq.p(this, 1 - this.j);
    }

    private final int N(int i) {
        if (av() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int Q(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        return ca.m(mlVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    private final int R(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        return ca.n(mlVar, this.b, s(!this.I), m(!this.I), this, this.I, this.e);
    }

    private final int S(ml mlVar) {
        if (av() == 0) {
            return 0;
        }
        return ca.o(mlVar, this.b, s(!this.I), m(!this.I), this, this.I);
    }

    private final int T(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.j != 1 && M()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.j != 1 && M()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.j == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.j == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int V(defpackage.me r22, defpackage.lb r23, defpackage.ml r24) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.V(me, lb, ml):int");
    }

    private final int X(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int Y(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final View aa(View view, int i, me meVar, ml mlVar) {
        mz mzVar;
        View viewG;
        at();
        int iT = T(i);
        if (iT == Integer.MIN_VALUE) {
            return null;
        }
        if (view != null) {
            my myVar = (my) view.getLayoutParams();
            boolean z = myVar.b;
            mzVar = myVar.a;
        } else {
            mzVar = null;
        }
        int i2 = iT == 1 ? i() : c();
        bF(i2, mlVar);
        bE(iT);
        lb lbVar = this.l;
        lbVar.c = lbVar.d + i2;
        lbVar.b = (int) (this.b.k() * 0.33333334f);
        lbVar.h = true;
        lbVar.a = false;
        V(meVar, lbVar, mlVar);
        this.o = this.e;
        if (view != null && (viewG = mzVar.g(i2, iT)) != null && viewG != view) {
            return viewG;
        }
        if (bH(iT)) {
            for (int i3 = this.i - 1; i3 >= 0; i3--) {
                View viewG2 = this.a[i3].g(i2, iT);
                if (viewG2 != null && viewG2 != view) {
                    return viewG2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.i; i4++) {
                View viewG3 = this.a[i4].g(i2, iT);
                if (viewG3 != null && viewG3 != view) {
                    return viewG3;
                }
            }
        }
        boolean z2 = (this.d ^ true) == (iT == -1);
        if (view != null) {
            View viewU = U(z2 ? mzVar.a() : mzVar.b());
            if (viewU != null && viewU != view) {
                return viewU;
            }
        }
        if (bH(iT)) {
            for (int i5 = this.i - 1; i5 >= 0; i5--) {
                if (view == null || i5 != mzVar.e) {
                    mz[] mzVarArr = this.a;
                    View viewU2 = U(z2 ? mzVarArr[i5].a() : mzVarArr[i5].b());
                    if (viewU2 != null && viewU2 != view) {
                        return viewU2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.i; i6++) {
                if (view == null || i6 != mzVar.e) {
                    mz[] mzVarArr2 = this.a;
                    View viewU3 = U(z2 ? mzVarArr2[i6].a() : mzVarArr2[i6].b());
                    if (viewU3 != null && viewU3 != view) {
                        return viewU3;
                    }
                }
            }
        }
        return null;
    }

    private final void ac(me meVar, ml mlVar, boolean z) {
        int iF;
        int i;
        int iX = X(Integer.MIN_VALUE);
        if (iX != Integer.MIN_VALUE && (iF = this.b.f() - iX) > 0) {
            int i2 = -l(-iF, meVar, mlVar);
            if (!z || (i = iF - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ae(me meVar, ml mlVar, boolean z) {
        int iJ;
        int iY = Y(Alert.DURATION_SHOW_INDEFINITELY);
        if (iY != Integer.MAX_VALUE && (iJ = iY - this.b.j()) > 0) {
            int iL = iJ - l(iJ, meVar, mlVar);
            if (!z || iL <= 0) {
                return;
            }
            this.b.n(-iL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void af(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.af(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aj(defpackage.me r12, defpackage.ml r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.aj(me, ml, boolean):void");
    }

    private final void al(me meVar, lb lbVar) {
        if (!lbVar.a || lbVar.i) {
            return;
        }
        if (lbVar.b == 0) {
            if (lbVar.e == -1) {
                ap(meVar, lbVar.g);
                return;
            } else {
                aq(meVar, lbVar.f);
                return;
            }
        }
        int i = 1;
        if (lbVar.e == -1) {
            int i2 = lbVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            ap(meVar, i3 < 0 ? lbVar.g : lbVar.g - Math.min(i3, lbVar.b));
            return;
        }
        int i4 = lbVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - lbVar.g;
        aq(meVar, i5 < 0 ? lbVar.f : Math.min(i5, lbVar.b) + lbVar.f);
    }

    private final void ap(me meVar, int i) {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            }
            View viewAD = aD(iAv);
            if (this.b.d(viewAD) < i || this.b.m(viewAD) < i) {
                return;
            }
            my myVar = (my) viewAD.getLayoutParams();
            boolean z = myVar.b;
            if (myVar.a.a.size() == 1) {
                return;
            }
            mz mzVar = myVar.a;
            ArrayList arrayList = mzVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            my myVarN = mz.n(view);
            myVarN.a = null;
            if (myVarN.fR() || myVarN.fQ()) {
                mzVar.d -= mzVar.f.b.b(view);
            }
            if (size == 1) {
                mzVar.b = Integer.MIN_VALUE;
            }
            mzVar.c = Integer.MIN_VALUE;
            aS(viewAD, meVar);
        }
    }

    private final void aq(me meVar, int i) {
        while (av() > 0) {
            View viewAD = aD(0);
            if (this.b.a(viewAD) > i || this.b.l(viewAD) > i) {
                return;
            }
            my myVar = (my) viewAD.getLayoutParams();
            boolean z = myVar.b;
            if (myVar.a.a.size() == 1) {
                return;
            }
            mz mzVar = myVar.a;
            ArrayList arrayList = mzVar.a;
            View view = (View) arrayList.remove(0);
            my myVarN = mz.n(view);
            myVarN.a = null;
            if (arrayList.size() == 0) {
                mzVar.c = Integer.MIN_VALUE;
            }
            if (myVarN.fR() || myVarN.fQ()) {
                mzVar.d -= mzVar.f.b.b(view);
            }
            mzVar.b = Integer.MIN_VALUE;
            aS(viewAD, meVar);
        }
    }

    private final void at() {
        this.e = (this.j == 1 || !M()) ? this.d : !this.d;
    }

    private final void bE(int i) {
        lb lbVar = this.l;
        lbVar.e = i;
        lbVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bF(int i, ml mlVar) {
        int iK;
        int iK2;
        int i2;
        lb lbVar = this.l;
        boolean z = false;
        lbVar.b = 0;
        lbVar.c = i;
        if (!be() || (i2 = mlVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            boolean z2 = this.e;
            boolean z3 = i2 < i;
            lq lqVar = this.b;
            if (z2 == z3) {
                iK = lqVar.k();
                iK2 = 0;
            } else {
                iK2 = lqVar.k();
                iK = 0;
            }
        }
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || !recyclerView.i) {
            lbVar.g = this.b.e() + iK;
            lbVar.f = -iK2;
        } else {
            lbVar.f = this.b.j() - iK2;
            lbVar.g = this.b.f() + iK;
        }
        lbVar.h = false;
        lbVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        lbVar.i = z;
    }

    private final void bG(mz mzVar, int i, int i2) {
        int i3 = mzVar.d;
        if (i == -1) {
            if (mzVar.e() + i3 <= i2) {
                this.m.set(mzVar.e, false);
            }
        } else if (mzVar.c() - i3 >= i2) {
            this.m.set(mzVar.e, false);
        }
    }

    private final boolean bH(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        boolean z2 = this.e;
        if (i2 == 0) {
            return z != z2;
        }
        return (z == z2) == M();
    }

    private final void bI(View view, int i, int i2) {
        Rect rect = this.G;
        aG(view, rect);
        my myVar = (my) view.getLayoutParams();
        int iBJ = bJ(i, myVar.leftMargin + rect.left, myVar.rightMargin + rect.right);
        int iBJ2 = bJ(i2, myVar.topMargin + rect.top, myVar.bottomMargin + rect.bottom);
        if (bg(view, iBJ, iBJ2, myVar)) {
            view.measure(iBJ, iBJ2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int bJ(int r3, int r4, int r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L6
            if (r5 == 0) goto L14
            r4 = r0
        L6:
            int r1 = android.view.View.MeasureSpec.getMode(r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L15
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L14
            r1 = r2
            goto L15
        L14:
            return r3
        L15:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bJ(int, int, int):int");
    }

    @Override // defpackage.lz
    public final void A(int i, int i2) {
        af(i, i2, 8);
    }

    @Override // defpackage.lz
    public final void B(int i, int i2) {
        af(i, i2, 2);
    }

    @Override // defpackage.lz
    public final void C(int i, int i2) {
        af(i, i2, 4);
    }

    @Override // defpackage.lz
    public final int D(ml mlVar) {
        return Q(mlVar);
    }

    @Override // defpackage.lz
    public final int E(ml mlVar) {
        return R(mlVar);
    }

    @Override // defpackage.lz
    public final int F(ml mlVar) {
        return S(mlVar);
    }

    @Override // defpackage.lz
    public final int G(ml mlVar) {
        return Q(mlVar);
    }

    @Override // defpackage.lz
    public final int H(ml mlVar) {
        return R(mlVar);
    }

    @Override // defpackage.lz
    public final int I(ml mlVar) {
        return S(mlVar);
    }

    public final void J(boolean z) {
        W(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.d = z;
        aV();
    }

    final void K(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean L() {
        int iC;
        if (av() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.e) {
            iC = i();
            c();
        } else {
            iC = c();
            i();
        }
        if (iC != 0 || t() == null) {
            return false;
        }
        this.h.a();
        aW();
        aV();
        return true;
    }

    final boolean M() {
        return ay() == 1;
    }

    @Override // defpackage.mj
    public final PointF O(int i) {
        int iN = N(i);
        PointF pointF = new PointF();
        if (iN == 0) {
            return null;
        }
        float f = iN;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = BitmapDescriptorFactory.HUE_RED;
            return pointF;
        }
        pointF.x = BitmapDescriptorFactory.HUE_RED;
        pointF.y = f;
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.lz
    public final Parcelable P() {
        int iF;
        int iJ;
        Object obj;
        SavedState savedState = this.q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.h = this.d;
        savedState2.i = this.o;
        savedState2.j = this.p;
        ry ryVar = this.h;
        if (ryVar == null || (obj = ryVar.b) == null) {
            savedState2.e = 0;
        } else {
            savedState2.f = (int[]) obj;
            savedState2.e = savedState2.f.length;
            savedState2.g = ryVar.a;
        }
        if (av() <= 0) {
            savedState2.a = -1;
            savedState2.b = -1;
            savedState2.c = 0;
            return savedState2;
        }
        savedState2.a = this.o ? i() : c();
        View viewM = this.e ? m(true) : s(true);
        savedState2.b = viewM != null ? bl(viewM) : -1;
        int i = this.i;
        savedState2.c = i;
        savedState2.d = new int[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            boolean z = this.o;
            mz[] mzVarArr = this.a;
            if (z) {
                iF = mzVarArr[i2].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.f();
                    iF -= iJ;
                }
            } else {
                iF = mzVarArr[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.j();
                    iF -= iJ;
                }
            }
            savedState2.d[i2] = iF;
        }
        return savedState2;
    }

    @Override // defpackage.lz
    public final void W(String str) {
        if (this.q == null) {
            super.W(str);
        }
    }

    @Override // defpackage.lz
    public final void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (av() > 0) {
            View viewS = s(false);
            View viewM = m(false);
            if (viewS == null || viewM == null) {
                return;
            }
            int iBl = bl(viewS);
            int iBl2 = bl(viewM);
            if (iBl < iBl2) {
                accessibilityEvent.setFromIndex(iBl);
                accessibilityEvent.setToIndex(iBl2);
            } else {
                accessibilityEvent.setFromIndex(iBl2);
                accessibilityEvent.setToIndex(iBl);
            }
        }
    }

    @Override // defpackage.lz
    public final void aK(int i) {
        super.aK(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.lz
    public final void aL(int i) {
        super.aL(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.lz
    public final void aO(int i) {
        if (i == 0) {
            L();
        }
    }

    @Override // defpackage.lz
    public final void ab(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.f != -1) {
                savedState.a();
                this.q.b();
            }
            aV();
        }
    }

    @Override // defpackage.lz
    public final void ad(int i) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.a != i) {
            savedState.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aV();
    }

    @Override // defpackage.lz
    public final boolean ag() {
        return this.j == 0;
    }

    @Override // defpackage.lz
    public final boolean ah() {
        return this.j == 1;
    }

    @Override // defpackage.lz
    public final boolean ai() {
        return this.n != 0;
    }

    @Override // defpackage.lz
    public final boolean ak() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // defpackage.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void an(int r5, int r6, defpackage.ml r7, defpackage.kx r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.j
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.av()
            if (r6 == 0) goto L76
            if (r5 != 0) goto Lf
            goto L76
        Lf:
            r4.x(r5, r7)
            int[] r5 = r4.J
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.i
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.i
            int[] r5 = new int[r5]
            r4.J = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.i
            if (r5 >= r1) goto L54
            lb r1 = r4.l
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.f
            mz[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            int r1 = r1 - r2
            goto L49
        L3b:
            mz[] r2 = r4.a
            r2 = r2[r5]
            int r3 = r1.g
            int r2 = r2.d(r3)
            int r1 = r1.g
            int r1 = r2 - r1
        L49:
            if (r1 < 0) goto L51
            int[] r2 = r4.J
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.J
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L76
            lb r5 = r4.l
            boolean r1 = r5.a(r7)
            if (r1 == 0) goto L76
            int r1 = r5.c
            int[] r2 = r4.J
            r2 = r2[r6]
            r8.a(r1, r2)
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.an(int, int, ml, kx):void");
    }

    @Override // defpackage.lz
    public final void ar(RecyclerView recyclerView) {
        by(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.lz
    public final void as(RecyclerView recyclerView, int i) {
        mk mkVar = new mk(recyclerView.getContext());
        mkVar.b = i;
        bc(mkVar);
    }

    @Override // defpackage.lz
    public final void bt() {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (av() == 0) {
            return 0;
        }
        return bl(aD(0));
    }

    @Override // defpackage.lz
    public final int d(int i, me meVar, ml mlVar) {
        return l(i, meVar, mlVar);
    }

    @Override // defpackage.lz
    public final int e(int i, me meVar, ml mlVar) {
        return l(i, meVar, mlVar);
    }

    @Override // defpackage.lz
    public final ma f() {
        return this.j == 0 ? new my(-2, -1) : new my(-1, -2);
    }

    @Override // defpackage.lz
    public final int fS(me meVar, ml mlVar) {
        if (this.j == 1) {
            return Math.min(this.i, mlVar.a());
        }
        return -1;
    }

    @Override // defpackage.lz
    public final int fT(me meVar, ml mlVar) {
        if (this.j == 0) {
            return Math.min(this.i, mlVar.a());
        }
        return -1;
    }

    @Override // defpackage.lz
    public final ma fU(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new my((ViewGroup.MarginLayoutParams) layoutParams) : new my(layoutParams);
    }

    @Override // defpackage.lz
    public final View fV(int i, me meVar, ml mlVar) {
        int iT;
        View viewAD;
        at();
        if (av() == 0 || (iT = T(i)) == Integer.MIN_VALUE) {
            return null;
        }
        int i2 = 1;
        int iAv = 0;
        int iAv2 = -1;
        int iA = (iT == -1) ^ this.e ? mlVar.a() - 1 : 0;
        if (U(iA) != null) {
            as(this.s, iA);
        } else {
            this.f = iA;
            aj(meVar, mlVar, true);
        }
        boolean z = this.e;
        if (iT == -1) {
            if (z) {
                iAv2 = av();
            } else {
                iAv = av() - 1;
                i2 = -1;
            }
            while (iAv != iAv2) {
                viewAD = aD(iAv);
                if (viewAD != null && viewAD.hasFocusable()) {
                    break;
                }
                iAv += i2;
            }
            viewAD = null;
        } else {
            if (z) {
                iAv = av() - 1;
                i2 = -1;
            } else {
                iAv2 = av();
            }
            while (iAv != iAv2) {
                viewAD = aD(iAv);
                if (viewAD != null && viewAD.hasFocusable()) {
                    break;
                }
                iAv += i2;
            }
            viewAD = null;
        }
        return (viewAD == null || !viewAD.hasFocusable()) ? aa(null, i, meVar, mlVar) : viewAD;
    }

    @Override // defpackage.lz
    public final View fW(View view, int i, me meVar, ml mlVar) {
        View viewAC;
        if (av() == 0 || (viewAC = aC(view)) == null) {
            return null;
        }
        return aa(viewAC, i, meVar, mlVar);
    }

    @Override // defpackage.lz
    public final void fX(me meVar, ml mlVar, edg edgVar) {
        super.fX(meVar, mlVar, edgVar);
        edgVar.r("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.lz
    public final void fY(me meVar, ml mlVar, View view, edg edgVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof my)) {
            super.aN(view, edgVar);
            return;
        }
        my myVar = (my) layoutParams;
        if (this.j == 0) {
            int iD = myVar.d();
            boolean z = myVar.b;
            edgVar.u(erb.y(iD, 1, -1, -1, false));
        } else {
            int iD2 = myVar.d();
            boolean z2 = myVar.b;
            edgVar.u(erb.y(-1, -1, iD2, 1, false));
        }
    }

    @Override // defpackage.lz
    public final void fZ(Rect rect, int i, int i2) {
        int iAu;
        int iAu2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            iAu2 = au(i2, rect.height() + paddingTop, az());
            iAu = au(i, (this.k * this.i) + paddingLeft, aA());
        } else {
            iAu = au(i, rect.width() + paddingLeft, aA());
            iAu2 = au(i2, (this.k * this.i) + paddingTop, az());
        }
        aZ(iAu, iAu2);
    }

    @Override // defpackage.lz
    public final boolean gb() {
        return this.q == null;
    }

    @Override // defpackage.lz
    public final void gc() {
        this.h.a();
        aV();
    }

    @Override // defpackage.lz
    public final ma h(Context context, AttributeSet attributeSet) {
        return new my(context, attributeSet);
    }

    final int i() {
        int iAv = av();
        if (iAv == 0) {
            return 0;
        }
        return bl(aD(iAv - 1));
    }

    final int l(int i, me meVar, ml mlVar) {
        if (av() == 0 || i == 0) {
            return 0;
        }
        x(i, mlVar);
        lb lbVar = this.l;
        int iV = V(meVar, lbVar, mlVar);
        if (lbVar.b >= iV) {
            i = i < 0 ? -iV : iV;
        }
        this.b.n(-i);
        this.o = this.e;
        lbVar.b = 0;
        al(meVar, lbVar);
        return i;
    }

    final View m(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int iAv = av() - 1; iAv >= 0; iAv--) {
            View viewAD = aD(iAv);
            int iD = this.b.d(viewAD);
            int iA = this.b.a(viewAD);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAD;
                }
                if (view == null) {
                    view = viewAD;
                }
            }
        }
        return view;
    }

    @Override // defpackage.lz
    public final void p(me meVar, ml mlVar) {
        aj(meVar, mlVar, true);
    }

    @Override // defpackage.lz
    public final void q(ml mlVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    final View s(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAv = av();
        View view = null;
        for (int i = 0; i < iAv; i++) {
            View viewAD = aD(i);
            int iD = this.b.d(viewAD);
            if (this.b.a(viewAD) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAD;
                }
                if (view == null) {
                    view = viewAD;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.view.View t() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.t():android.view.View");
    }

    @Override // defpackage.lz
    public final boolean u(ma maVar) {
        return maVar instanceof my;
    }

    final void x(int i, ml mlVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        lb lbVar = this.l;
        lbVar.a = true;
        bF(iC, mlVar);
        bE(i2);
        lbVar.c = iC + lbVar.d;
        lbVar.b = Math.abs(i);
    }

    @Override // defpackage.lz
    public final void y(int i, int i2) {
        af(i, i2, 1);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new x(17);
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List g;
        boolean h;
        boolean i;
        boolean j;

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int i = parcel.readInt();
            this.c = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.e = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        final void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        final void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        public SavedState() {
        }
    }
}
