package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import defpackage.lz;
import defpackage.ma;
import defpackage.me;
import defpackage.ml;
import defpackage.oct;
import defpackage.osq;
import defpackage.owz;
import defpackage.oxa;
import defpackage.oxb;

/* loaded from: classes2.dex */
public class CarLayoutManager extends lz {
    private owz I;
    private boolean K;
    private int R;
    public boolean a;
    public final Context b;
    public LruCache g;
    public boolean j;
    public boolean k;
    public boolean m;
    public osq o;
    private boolean p;
    private final AccelerateInterpolator q = new AccelerateInterpolator(2.0f);
    public boolean c = false;
    private int G = 1;
    private int H = 0;
    private int J = 0;
    private int L = 0;
    public int d = -1;
    public int e = -1;
    private int M = -1;
    private int N = -1;
    private int O = -1;
    private int P = -1;
    public int f = -1;
    private boolean Q = false;
    private int S = -1;
    public boolean h = false;
    public boolean i = true;
    public boolean l = true;
    public final oct n = new oct(this);

    public CarLayoutManager(Context context) {
        this.b = context;
    }

    private final int ac() {
        return (this.D - getPaddingTop()) - getPaddingBottom();
    }

    private final int ae() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        boolean z = this.m;
        oct octVar = this.n;
        int iBi = 0;
        if (z) {
            Object obj = octVar.a;
            CarLayoutManager carLayoutManager = (CarLayoutManager) obj;
            int i2 = 0;
            int iBi2 = 0;
            for (int iL = carLayoutManager.l(); iL <= carLayoutManager.t(); iL++) {
                View viewAD = ((lz) obj).aD(iL);
                if (viewAD != null) {
                    ma maVar = (ma) viewAD.getLayoutParams();
                    iBi2 += bi(viewAD) + maVar.topMargin + maVar.bottomMargin;
                    i2++;
                }
            }
            if (i2 > 0) {
                iBi = iBi2 / i2;
            }
        } else {
            Object obj2 = octVar.a;
            int iL2 = ((CarLayoutManager) obj2).l();
            lz lzVar = (lz) obj2;
            View viewAD2 = lzVar.aD(iL2);
            if (viewAD2 != null) {
                if (bl(viewAD2) == 0 && iL2 < lzVar.av() - 1) {
                    viewAD2 = lzVar.aD(iL2 + 1);
                }
                ma maVar2 = (ma) viewAD2.getLayoutParams();
                iBi = bi(viewAD2) + maVar2.topMargin + maVar2.bottomMargin;
            }
        }
        if (iBi == 0) {
            Log.w("CarLayoutManager", "The sample view has a height of 0. Returning a dummy value for now that won't be cached.");
            return this.b.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_sample_row_height);
        }
        this.f = iBi;
        return iBi;
    }

    private static ma af(View view) {
        return (ma) view.getLayoutParams();
    }

    private final View aj(me meVar, View view, int i) {
        int i2;
        int iBA;
        int iBi;
        int iBl = bl(view);
        if (i == 0) {
            i2 = iBl - 1;
        } else {
            i = 1;
            i2 = iBl + 1;
        }
        View viewN = meVar.n(i2);
        bs(viewN);
        ma maVar = (ma) viewN.getLayoutParams();
        ma maVar2 = (ma) view.getLayoutParams();
        int paddingLeft = getPaddingLeft() + maVar.leftMargin;
        int iBj = bj(viewN) + paddingLeft;
        if (i == 0) {
            iBi = (view.getTop() - maVar2.topMargin) - maVar.bottomMargin;
            iBA = iBi - bi(viewN);
        } else {
            iBA = maVar.topMargin + bA(view) + maVar2.bottomMargin;
            iBi = bi(viewN) + iBA;
        }
        if (i == 0) {
            super.aF(viewN, 0, false);
        } else {
            super.aF(viewN, -1, false);
        }
        bq(viewN, paddingLeft, iBA, iBj, iBi);
        return viewN;
    }

    private final Integer al(int i) {
        if (av() == 0) {
            Log.w("CarLayoutManager", "No children are attached, so no baseline position can be used.");
            return null;
        }
        int iBl = bl(aD(0));
        int iBl2 = bl(aD(av() - 1));
        return i < iBl ? Integer.valueOf(iBl) : i > iBl2 ? Integer.valueOf(iBl2) : Integer.valueOf(i);
    }

    private final Integer ap(int i) {
        if (i < 0) {
            return null;
        }
        View viewU = U(i);
        if (viewU != null) {
            return Integer.valueOf(bD(viewU) - af(viewU).topMargin);
        }
        if (av() == 0) {
            Log.w("CarLayoutManager", "View not attached, and no children exist.");
            return null;
        }
        int iBl = bl(aD(0));
        int iBl2 = bl(aD(av() - 1));
        if (i < iBl) {
            if (Log.isLoggable("CarLayoutManager", 3)) {
                Log.d("CarLayoutManager", "View not attached, but is positioned above the first child.");
            }
            return Integer.MIN_VALUE;
        }
        if (i <= iBl2) {
            Log.e("CarLayoutManager", "View not attached, but still positioned in range of children.");
            return null;
        }
        if (Log.isLoggable("CarLayoutManager", 3)) {
            Log.d("CarLayoutManager", "View not attached, but is positioned below the last child.");
        }
        return Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
    }

    private final void aq(int i) {
        this.M = i;
        this.N = i(i);
        this.O = c(i);
    }

    private final void at(boolean z) {
        int iIntValue;
        if (av() == 0) {
            if (Log.isLoggable("CarLayoutManager", 3)) {
                Log.d("CarLayoutManager", ":: updatePageBreakPosition getChildCount: 0");
                return;
            }
            return;
        }
        if (Log.isLoggable("CarLayoutManager", 2)) {
            Log.v("CarLayoutManager", String.format(":: #BEFORE updatePageBreakPositions mAnchorPageBreakPosition:%s, mUpperPageBreakPosition:%s, mLowerPageBreakPosition:%s", Integer.valueOf(this.L), Integer.valueOf(this.d), Integer.valueOf(this.e)));
        }
        if (ax() != this.R || z) {
            if (Log.isLoggable("CarLayoutManager", 3)) {
                Log.d("CarLayoutManager", "Item count changed. Resetting page break positions.");
            }
            this.L = bl(K());
            this.d = -1;
        }
        this.R = ax();
        int i = this.L;
        if (i == -1) {
            Log.w("CarLayoutManager", "Unable to update anchor positions. There is no initial anchor position.");
            return;
        }
        Integer numAp = ap(i);
        if (numAp == null) {
            Log.w("CarLayoutManager", "Unable to update anchor positions. Anchor top coordinate not found.");
            return;
        }
        int i2 = this.d;
        if (i2 == -1) {
            iIntValue = Integer.MIN_VALUE;
        } else {
            Integer numAp2 = ap(i2);
            if (numAp2 == null) {
                Log.w("CarLayoutManager", "Unable to update anchor positions. Upper page top coordinate not found.");
                return;
            }
            iIntValue = numAp2.intValue();
        }
        if (Log.isLoggable("CarLayoutManager", 2)) {
            Log.v("CarLayoutManager", String.format(":: #MID updatePageBreakPositions anchorTop:%s upperPageBreakTop:%s mAnchorPageBreakPosition:%s, mUpperPageBreakPosition:%s, mLowerPageBreakPosition:%s", numAp, Integer.valueOf(iIntValue), Integer.valueOf(this.L), Integer.valueOf(this.d), Integer.valueOf(this.e)));
        }
        int iIntValue2 = numAp.intValue();
        int paddingTop = getPaddingTop();
        int i3 = this.L;
        if (iIntValue2 < paddingTop) {
            this.d = i3;
            int i4 = this.e;
            this.L = i4;
            this.e = c(i4);
        } else if (i3 <= 0 || iIntValue < getPaddingTop()) {
            this.d = i(this.L);
            this.e = c(this.L);
        } else {
            this.e = this.L;
            int i5 = this.d;
            this.L = i5;
            this.d = i(i5);
        }
        if (Log.isLoggable("CarLayoutManager", 2)) {
            Log.v("CarLayoutManager", String.format(":: #AFTER updatePageBreakPositions mAnchorPageBreakPosition:%s, mUpperPageBreakPosition:%s, mLowerPageBreakPosition:%s", Integer.valueOf(this.L), Integer.valueOf(this.d), Integer.valueOf(this.e)));
        }
    }

    private final boolean bE() {
        return this.b.getResources().getConfiguration().navigation == 2;
    }

    private final boolean bF(ml mlVar, int i, View view, int i2) {
        int iBl = bl(view);
        if (i2 == 0) {
            if (iBl == 0) {
                return false;
            }
        } else {
            if (iBl >= mlVar.a() - 1) {
                return false;
            }
            i2 = 1;
        }
        View viewAE = aE();
        if (viewAE != null) {
            int iBl2 = bl(viewAE);
            if (i2 == 0 && iBl >= iBl2 - 2) {
                return true;
            }
            if (i2 == 1 && iBl <= iBl2 + 2) {
                return true;
            }
        }
        if (i != -1) {
            if (i2 == 0 && iBl >= i - 1) {
                return true;
            }
            if (i2 == 1 && iBl <= i + 1) {
                return true;
            }
        }
        ma maVarAf = af(view);
        int iBD = bD(view) - maVarAf.topMargin;
        int iBA = bA(view) - maVarAf.bottomMargin;
        int paddingBottom = this.D - getPaddingBottom();
        if (this.h) {
            int i3 = this.D;
            paddingBottom = i3 + i3;
        }
        if (i2 != 0 || iBD >= getPaddingTop() - this.D) {
            return i2 != 1 || iBA <= paddingBottom;
        }
        return false;
    }

    @Override // defpackage.lz
    public final void A(int i, int i2) {
        if (Log.isLoggable("CarLayoutManager", 2)) {
            Log.v("CarLayoutManager", String.format("onItemsMoved: from=%d to=%d itemCount=%d", Integer.valueOf(i), Integer.valueOf(i2), 1));
        }
        if (!this.k) {
            if (Log.isLoggable("CarLayoutManager", 2)) {
                Log.v("CarLayoutManager", "retainFocusOnItemMoved - not retaining focus because flag disabled");
                return;
            }
            return;
        }
        if (!bd()) {
            if (Log.isLoggable("CarLayoutManager", 2)) {
                Log.v("CarLayoutManager", "retainFocusOnItemMoved - not retaining focus because list does not have focus");
                return;
            }
            return;
        }
        int iS = s();
        int i3 = iS - i;
        if (i3 < 0 || i3 > 0) {
            if (Log.isLoggable("CarLayoutManager", 2)) {
                Log.v("CarLayoutManager", String.format("retainFocusOnItemMoved - not retaining focus because focused item was not moved (position=%d)", Integer.valueOf(iS)));
            }
        } else {
            if (Log.isLoggable("CarLayoutManager", 2)) {
                Log.v("CarLayoutManager", String.format("retainFocusOnItemMoved - retaining focus at new position %d", Integer.valueOf(i2)));
            }
            ad(i2);
        }
    }

    @Override // defpackage.lz
    public final int G(ml mlVar) {
        if (this.m) {
            if (av() <= 1) {
                return 0;
            }
            int iMax = Math.max(ac() / ae(), 1);
            if (mlVar.a() <= iMax) {
                return 0;
            }
            return iMax * 100;
        }
        if (av() <= 1) {
            return 0;
        }
        int iMax2 = Math.max(ac() / ae(), 1);
        if (mlVar.a() <= iMax2) {
            return 1000;
        }
        return (iMax2 * 1000) / mlVar.a();
    }

    @Override // defpackage.lz
    public final int H(ml mlVar) {
        View viewK = K();
        if (viewK == null) {
            return 0;
        }
        ma maVarAf = af(viewK);
        float fBl = bl(viewK) - Math.min((bD(viewK) - maVarAf.topMargin) / ((bi(viewK) + maVarAf.topMargin) + maVarAf.bottomMargin), 1.0f);
        int iA = mlVar.a() - Math.max(ac() / ae(), 1);
        if (iA <= 0) {
            return 0;
        }
        float f = iA;
        boolean z = this.m;
        if (fBl < f) {
            return z ? (int) (fBl * 100.0f) : (int) ((fBl * 1000.0f) / f);
        }
        if (z) {
            return mlVar.a() * 100;
        }
        return 1000;
    }

    @Override // defpackage.lz
    public final int I(ml mlVar) {
        int iA;
        if (!this.m || (iA = mlVar.a()) == 0) {
            return 1000;
        }
        return iA * 100;
    }

    public final View J(int i) {
        if (i >= 0 && i < av()) {
            while (i < av()) {
                View viewAD = aD(i);
                if (viewAD.hasFocusable()) {
                    return viewAD;
                }
                i++;
            }
        }
        return null;
    }

    public final View K() {
        int iL = l();
        if (iL != -1) {
            return aD(iL);
        }
        return null;
    }

    public final View L() {
        return J(l());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M() {
        /*
            r4 = this;
            int r0 = r4.P
            r1 = -1
            if (r0 == r1) goto L1c
            r0 = 0
        L6:
            int r2 = r4.av()
            if (r0 >= r2) goto L1c
            android.view.View r2 = r4.aD(r0)
            int r2 = bl(r2)
            int r3 = r4.P
            if (r2 != r3) goto L19
            goto L1d
        L19:
            int r0 = r0 + 1
            goto L6
        L1c:
            r0 = r1
        L1d:
            if (r0 < 0) goto L38
            int r2 = r4.av()
            if (r0 < r2) goto L26
            goto L38
        L26:
            int r2 = r4.l()
            int r3 = r4.t()
            int r3 = java.lang.Math.max(r3, r2)
            if (r2 == r1) goto L38
            if (r0 < r2) goto L38
            if (r0 <= r3) goto L39
        L38:
            r0 = r1
        L39:
            if (r0 == r1) goto L40
            android.view.View r4 = r4.aD(r0)
            return r4
        L40:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.sdk.ui.CarLayoutManager.M():android.view.View");
    }

    public final View N() {
        int iT = t();
        if (iT != -1) {
            return aD(iT);
        }
        return null;
    }

    public final void O() {
        this.M = -1;
        this.N = -1;
        this.O = -1;
    }

    public final void Q(int i, oxa oxaVar) {
        owz owzVar = new owz(this, this.b, i, oxaVar);
        this.I = owzVar;
        owzVar.b = i;
        bc(owzVar);
    }

    public final void R() {
        if (this.c) {
            if (this.G != 1) {
                if (av() == 0) {
                    if (Log.isLoggable("CarLayoutManager", 3)) {
                        Log.d("CarLayoutManager", ":: offsetRowsIndividually getChildCount=0");
                        return;
                    }
                    return;
                }
                int i = -1;
                int iAv = av() - 1;
                while (true) {
                    if (iAv < 0) {
                        break;
                    }
                    View viewAD = aD(iAv);
                    if (bD(viewAD) - af(viewAD).topMargin <= getPaddingTop()) {
                        i = iAv;
                        break;
                    }
                    iAv--;
                }
                if (Log.isLoggable("CarLayoutManager", 2)) {
                    Log.v("CarLayoutManager", a.bp(i, ":: offsetRowsIndividually danglingChildIndex: "));
                }
                RecyclerView recyclerView = (RecyclerView) aD(0).getParent();
                int[] iArr = new int[2];
                recyclerView.getLocationInWindow(iArr);
                int paddingTop = iArr[1] + recyclerView.getPaddingTop();
                int iAv2 = av();
                for (int i2 = 0; i2 < iAv2; i2++) {
                    View viewAD2 = aD(i2);
                    ma maVarAf = af(viewAD2);
                    int i3 = maVarAf.topMargin < 0 ? paddingTop - maVarAf.topMargin : paddingTop;
                    if (maVarAf.bottomMargin < 0) {
                        i3 -= maVarAf.bottomMargin;
                    }
                    if (i2 < i) {
                        viewAD2.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    } else if (i2 > i) {
                        viewAD2.setAlpha(1.0f);
                        S(viewAD2, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        float interpolation = this.q.getInterpolation(1.0f - (((bA(viewAD2) + maVarAf.bottomMargin) - getPaddingTop()) / ((bi(viewAD2) + maVarAf.topMargin) + maVarAf.bottomMargin)));
                        viewAD2.setAlpha(1.0f);
                        S(viewAD2, -(i3 * interpolation));
                    }
                }
                return;
            }
            View viewU = U(this.L);
            if (viewU == null) {
                if (Log.isLoggable("CarLayoutManager", 3)) {
                    Log.d("CarLayoutManager", ":: offsetRowsByPage anchorView null");
                    return;
                }
                return;
            }
            int iBD = bD(viewU) - af(viewU).topMargin;
            View viewU2 = U(this.d);
            if (viewU2 == null) {
                Log.w("CarLayoutManager", ":: offsetRowsByPage upperPageBreakView null");
                return;
            }
            int iBD2 = (bD(viewU2) - af(viewU2).topMargin) - iBD;
            int paddingTop2 = iBD - getPaddingTop();
            float fAbs = (Math.abs(iBD2) - paddingTop2) / Math.abs(iBD2);
            if (Log.isLoggable("CarLayoutManager", 2)) {
                Log.v("CarLayoutManager", String.format(":: offsetRowsByPage scrollDistance:%s, distanceLeft:%s, scrollPercentage:%s", Integer.valueOf(iBD2), Integer.valueOf(paddingTop2), Float.valueOf(fAbs)));
            }
            RecyclerView recyclerView2 = (RecyclerView) aD(0).getParent();
            int[] iArr2 = new int[2];
            recyclerView2.getLocationInWindow(iArr2);
            int paddingTop3 = iArr2[1] + recyclerView2.getPaddingTop();
            int iAv3 = av();
            for (int i4 = 0; i4 < iAv3; i4++) {
                View viewAD3 = aD(i4);
                int iBl = bl(viewAD3);
                if (iBl < this.d) {
                    viewAD3.setAlpha(BitmapDescriptorFactory.HUE_RED);
                    S(viewAD3, -paddingTop3);
                } else if (iBl < this.L) {
                    ma maVarAf2 = af(viewAD3);
                    int i5 = maVarAf2.topMargin < 0 ? -maVarAf2.topMargin : 0;
                    if (maVarAf2.bottomMargin < 0) {
                        i5 -= maVarAf2.bottomMargin;
                    }
                    float interpolation2 = (i5 + paddingTop3) * this.q.getInterpolation(fAbs);
                    viewAD3.setAlpha(1.0f);
                    S(viewAD3, -((int) interpolation2));
                } else {
                    viewAD3.setAlpha(1.0f);
                    S(viewAD3, BitmapDescriptorFactory.HUE_RED);
                }
            }
        }
    }

    public final void S(View view, float f) {
        if (this.g.get(view) == null && view.getVisibility() == 0) {
            oxb oxbVar = new oxb();
            oxbVar.setFillEnabled(true);
            oxbVar.setFillAfter(true);
            oxbVar.setDuration(0L);
            this.g.put(view, oxbVar);
        }
        oxb oxbVar2 = (oxb) this.g.get(view);
        oxbVar2.reset();
        oxbVar2.a = f;
        oxbVar2.setStartTime(-1L);
        view.setAnimation(oxbVar2);
        oxbVar2.startNow();
    }

    public final void T(int i) {
        if (i == this.G) {
            return;
        }
        this.G = i;
        R();
    }

    public final boolean V() {
        return this.b.getResources().getBoolean(R.bool.has_wheel) || bE();
    }

    public final boolean X() {
        int iM = m();
        return iM == -1 || iM == ax() + (-1) || x() == ax() + (-1);
    }

    public final boolean Y() {
        return l() <= 0;
    }

    @Override // defpackage.lz
    public final void aM(RecyclerView recyclerView) {
        at(false);
        R();
    }

    @Override // defpackage.lz
    public final void aO(int i) {
        if (Log.isLoggable("CarLayoutManager", 2)) {
            Log.v("CarLayoutManager", a.bp(i, ":: onScrollStateChanged "));
        }
        if (i == 0) {
            View viewAE = aE();
            if (viewAE != null && (bD(viewAE) >= this.D - getPaddingBottom() || bA(viewAE) <= getPaddingTop())) {
                if (Log.isLoggable("CarLayoutManager", 3)) {
                    Log.d("CarLayoutManager", String.format("Explicit Focus: onScrollStateChanged clearFocus(%s)", viewAE));
                }
                if (bE()) {
                    viewAE.setHovered(false);
                }
                viewAE.clearFocus();
                aV();
            }
        } else if (i == 1) {
            this.J = 0;
        }
        if (i != 2) {
            this.I = null;
        }
        this.H = i;
        at(false);
    }

    @ResultIgnorabilityUnspecified
    public final boolean aa(RecyclerView recyclerView, int i) {
        int i2;
        if (av() == 0 || this.K) {
            return false;
        }
        if (Math.abs(i) < 0 || Math.abs(this.J) < 0) {
            int iL = l();
            if (iL == -1) {
                return false;
            }
            recyclerView.ad(bl(aD(iL)));
            return true;
        }
        boolean z = i > 0 || (i == 0 && this.J >= 0);
        boolean z2 = i < 0 || (i == 0 && this.J < 0);
        if (z && this.e != -1) {
            recyclerView.ad(this.L);
            osq osqVar = this.o;
            if (osqVar != null) {
                osqVar.e(1);
            }
            return true;
        }
        if (z2 && (i2 = this.d) != -1) {
            recyclerView.ad(i2);
            osq osqVar2 = this.o;
            if (osqVar2 != null) {
                osqVar2.f(1);
            }
            return true;
        }
        Log.e("CarLayoutManager", "Error setting scroll for fling! flingVelocity: \t" + i + "\tlastDragDistance: " + this.J + "\tpageUpAtStartOfDrag: " + this.d + "\tpageDownAtStartOfDrag: " + this.e);
        owz owzVar = this.I;
        if (owzVar == null) {
            return false;
        }
        recyclerView.ad(owzVar.a);
        return true;
    }

    @Override // defpackage.lz
    public final void ad(int i) {
        if (this.i) {
            this.p = true;
            O();
        }
        this.S = i;
        aV();
    }

    @Override // defpackage.lz
    public final boolean ah() {
        return true;
    }

    @Override // defpackage.lz
    public final boolean ai() {
        return true;
    }

    @Override // defpackage.lz
    public final void ar(RecyclerView recyclerView) {
        this.Q = false;
    }

    @Override // defpackage.lz
    public final void as(RecyclerView recyclerView, int i) {
        Q(i, oxa.STANDARD);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    @Override // defpackage.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bu(java.util.ArrayList r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.aE()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r6.l()
            java.lang.String r2 = "CarLayoutManager"
            r3 = -1
            if (r0 != r3) goto L17
            java.lang.String r6 = "There is no focused child and no first fully visible child."
            android.util.Log.w(r2, r6)
            return r1
        L17:
            boolean r3 = r6.bE()
            r4 = 1
            if (r3 == 0) goto L31
        L1e:
            int r1 = r6.av()
            if (r0 >= r1) goto L30
            android.view.View r1 = r6.aD(r0)
            if (r1 == 0) goto L2d
            r1.addFocusables(r7, r8)
        L2d:
            int r0 = r0 + 1
            goto L1e
        L30:
            return r4
        L31:
            r3 = 2
            if (r8 == r3) goto L53
            if (r8 != r4) goto L37
            goto L53
        L37:
            r0 = 33
            if (r8 == r0) goto L48
            r0 = 130(0x82, float:1.82E-43)
            if (r8 == r0) goto L48
            r0 = 66
            if (r8 == r0) goto L48
            r0 = 17
            if (r8 != r0) goto L52
            r8 = r0
        L48:
            android.view.View r6 = r6.M()
            if (r6 == 0) goto L52
            r6.addFocusables(r7, r8)
            return r4
        L52:
            return r1
        L53:
            int r3 = r6.t()
            if (r3 >= r0) goto L6b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r1] = r3
            java.lang.String r1 = "No child view's bottom is visible. Selecting partially visible child (index %d)"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            android.util.Log.w(r2, r1)
            r3 = r0
        L6b:
            boolean r1 = r6.Y()
            if (r1 != 0) goto L86
            int r1 = r0 + 1
            int r2 = r6.ax()
            if (r1 >= r2) goto L86
            if (r0 >= r3) goto L86
            android.view.View r2 = r6.aD(r1)
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L86
            r0 = r1
        L86:
            boolean r1 = r6.X()
            if (r1 != 0) goto L9d
            if (r3 <= 0) goto L9d
            if (r3 <= r0) goto L9d
            int r1 = r3 + (-1)
            android.view.View r2 = r6.aD(r1)
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L9d
            r3 = r1
        L9d:
            if (r0 > r3) goto Lab
            android.view.View r1 = r6.aD(r0)
            if (r1 == 0) goto La8
            r1.addFocusables(r7, r8)
        La8:
            int r0 = r0 + 1
            goto L9d
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.sdk.ui.CarLayoutManager.bu(java.util.ArrayList, int):boolean");
    }

    @Override // defpackage.lz
    public final boolean bx(RecyclerView recyclerView, View view, View view2) {
        View viewAD;
        if (view == null) {
            Log.w("CarLayoutManager", "onRequestChildFocus with a null child!");
            return true;
        }
        if (Log.isLoggable("CarLayoutManager", 2)) {
            Log.v("CarLayoutManager", String.format(":: onRequestChildFocus child: %s, focused: %s", view, view2));
        }
        if (this.M == -1) {
            aq(m());
            if (Log.isLoggable("CarLayoutManager", 2)) {
                Log.v("CarLayoutManager", String.format(":: onRequestChildFocus mCurrentFocusPagePosition=%d, mPreviousFocusedPagePosition=%d, mNextFocusedPagePosition=%d", Integer.valueOf(this.M), Integer.valueOf(this.N), Integer.valueOf(this.O)));
            }
        }
        int iBl = bl(view);
        if (iBl != this.P) {
            this.P = iBl;
            int iAc = ac();
            int iBD = bD(view);
            int iBA = bA(view);
            int iIndexOfChild = recyclerView.indexOfChild(view);
            while (true) {
                if (iIndexOfChild < 0) {
                    break;
                }
                viewAD = aD(iIndexOfChild);
                if (viewAD == null) {
                    Log.e("CarLayoutManager", a.bp(iIndexOfChild, "Child is null at index "));
                } else {
                    if (iIndexOfChild == 0) {
                        recyclerView.ad(bl(viewAD));
                        break;
                    }
                    View viewAD2 = aD(iIndexOfChild - 1);
                    if (viewAD2 != null) {
                        int iBD2 = iBD - bD(viewAD2);
                        int iBD3 = iBA - bD(viewAD2);
                        if (iBD2 > iAc / 2 || iBD3 > iAc) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                iIndexOfChild--;
            }
            recyclerView.ad(bl(viewAD));
        }
        return true;
    }

    final int c(int i) {
        if (i == -1) {
            return -1;
        }
        View viewU = U(i);
        if (viewU == null) {
            if (Log.isLoggable("CarLayoutManager", 3)) {
                Log.d("CarLayoutManager", ":: calculatePreviousPageBreakPosition referenceView is null");
            }
            Integer numAl = al(i);
            if (numAl != null) {
                return numAl.intValue();
            }
            Log.e("CarLayoutManager", ":: calculatePreviousPageBreakPosition nearest position not found");
            return i;
        }
        int iBD = bD(viewU) - af(viewU).topMargin;
        int i2 = i;
        while (true) {
            if (i2 >= ax() - 1) {
                break;
            }
            int i3 = i2 + 1;
            View viewU2 = U(i3);
            if (viewU2 == null) {
                return i2;
            }
            if (bD(viewU2) - af(viewU2).topMargin <= this.D + iBD) {
                i2 = i3;
            } else if (i2 == i) {
                return i3;
            }
        }
        return i2;
    }

    @Override // defpackage.lz
    public final int e(int i, me meVar, ml mlVar) {
        int paddingTop;
        int i2;
        if (ax() == 0) {
            return i;
        }
        if (av() > 1 && i != 0) {
            int i3 = -1;
            if (this.m && i > 0 && x() == ax() - 1) {
                paddingTop = bA(N()) - this.D;
                this.K = true;
            } else {
                paddingTop = i;
            }
            View viewAD = aD(0);
            if (viewAD != null) {
                int iBl = bl(viewAD);
                int iBD = bD(viewAD) - af(viewAD).topMargin;
                View viewK = K();
                if (viewK != null) {
                    int iBl2 = bl(viewK);
                    int iBD2 = (bD(viewK) - af(viewK).topMargin) - getPaddingTop();
                    if (X() && iBl2 == this.L && paddingTop > iBD2 && paddingTop > 0) {
                        this.K = true;
                        paddingTop = iBD2;
                    } else if (paddingTop >= 0 || iBl != 0 || Math.abs(paddingTop) + iBD <= getPaddingTop()) {
                        this.K = false;
                    } else {
                        paddingTop = iBD - getPaddingTop();
                        this.K = true;
                    }
                    if (Log.isLoggable("CarLayoutManager", 2)) {
                        Log.v("CarLayoutManager", String.format("scrollVerticallyBy dy=%d mReachedLimitOfDrag=%b", Integer.valueOf(paddingTop), Boolean.valueOf(this.K)));
                    }
                    if (this.H == 1) {
                        this.J += paddingTop;
                    }
                    aL(-paddingTop);
                    View viewAD2 = aD(av() - 1);
                    if (viewAD2.getTop() < 0) {
                        viewAD2.setTop(0);
                    }
                    int iM = m();
                    if (paddingTop > 0) {
                        int paddingTop2 = getPaddingTop() - this.D;
                        View viewAE = aE();
                        int iBl3 = viewAE != null ? bl(viewAE) : Alert.DURATION_SHOW_INDEFINITELY;
                        int iAv = av();
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i4 >= iAv) {
                                i2 = i3;
                                break;
                            }
                            View viewAD3 = aD(i4);
                            i2 = i3;
                            int iBA = bA(viewAD3);
                            int iBl4 = bl(viewAD3);
                            if (iBA >= paddingTop2 || iBl4 >= iBl3 - 2 || iBl4 >= iM - 1) {
                                break;
                            }
                            i5++;
                            i4++;
                            i3 = i2;
                        }
                        while (true) {
                            i5--;
                            if (i5 < 0) {
                                break;
                            }
                            aS(aD(0), meVar);
                        }
                        View viewAD4 = aD(av() - 1);
                        while (viewAD4 != null && bF(mlVar, iM, viewAD4, 1)) {
                            viewAD4 = aj(meVar, viewAD4, 1);
                        }
                    } else {
                        i2 = -1;
                        int i6 = this.D;
                        if (this.h) {
                            i6 += i6;
                        }
                        View viewAE2 = aE();
                        int iBl5 = viewAE2 != null ? bl(viewAE2) : Integer.MIN_VALUE;
                        int i7 = 0;
                        int i8 = 0;
                        for (int iAv2 = av() - 1; iAv2 >= 0; iAv2--) {
                            View viewAD5 = aD(iAv2);
                            int iBD3 = bD(viewAD5);
                            int iBl6 = bl(viewAD5);
                            if (iBD3 <= i6 || iBl6 <= iBl5 + 2 || iBl6 <= iM + 1) {
                                break;
                            }
                            i8++;
                            i7 = iAv2;
                        }
                        while (true) {
                            i8--;
                            if (i8 < 0) {
                                break;
                            }
                            aS(aD(i7), meVar);
                        }
                        View viewAD6 = aD(0);
                        while (viewAD6 != null && bF(mlVar, iM, viewAD6, 0)) {
                            viewAD6 = aj(meVar, viewAD6, 0);
                        }
                    }
                    at(bd());
                    R();
                    if (av() > 1 && Log.isLoggable("CarLayoutManager", 2)) {
                        Log.v("CarLayoutManager", String.format("Currently showing  %d views (%d to %d)", Integer.valueOf(av()), Integer.valueOf(bl(aD(0))), Integer.valueOf(bl(aD(av() - 1)))));
                    }
                    if (!bd()) {
                        if (Log.isLoggable("CarLayoutManager", 2)) {
                            Log.v("CarLayoutManager", "updateFocusPageState clearing focus page positions");
                        }
                        O();
                        return paddingTop;
                    }
                    int i9 = i2;
                    if (this.M != i9 && iM != i9) {
                        if (Log.isLoggable("CarLayoutManager", 2)) {
                            Log.v("CarLayoutManager", String.format(":: #BEFORE updateFocusPageState mCurrentFocusPagePosition=%d, mPreviousFocusPagePosition=%d, mNextFocusPagePosition=%d", Integer.valueOf(this.M), Integer.valueOf(this.N), Integer.valueOf(this.O)));
                        }
                        int i10 = this.N;
                        if (iM > i10 || this.M <= i10) {
                            int i11 = this.O;
                            if (iM >= i11 && this.M < i11) {
                                osq osqVar = this.o;
                                if (osqVar != null) {
                                    osqVar.e(3);
                                }
                                aq(iM);
                            }
                        } else {
                            osq osqVar2 = this.o;
                            if (osqVar2 != null) {
                                osqVar2.f(3);
                            }
                            aq(iM);
                        }
                        if (Log.isLoggable("CarLayoutManager", 2)) {
                            Log.v("CarLayoutManager", String.format(":: #AFTER updateFocusPageState mCurrentFocusPagePosition=%d, mPreviousFocusPagePosition=%d, mNextFocusPagePosition=%d", Integer.valueOf(this.M), Integer.valueOf(this.N), Integer.valueOf(this.O)));
                        }
                    }
                    return paddingTop;
                }
            }
        }
        this.K = true;
        return 0;
    }

    @Override // defpackage.lz
    public final ma f() {
        return new ma(-1, -2);
    }

    @Override // defpackage.lz
    public final View fW(View view, int i, me meVar, ml mlVar) {
        return null;
    }

    @Override // defpackage.lz
    public final boolean gb() {
        return false;
    }

    @Override // defpackage.lz
    public final void gc() {
        this.f = -1;
    }

    final int i(int i) {
        if (i == -1) {
            return -1;
        }
        View viewU = U(i);
        if (viewU == null) {
            if (Log.isLoggable("CarLayoutManager", 3)) {
                Log.d("CarLayoutManager", ":: calculatePreviousPageBreakPosition referenceView is null");
            }
            Integer numAl = al(i);
            if (numAl != null) {
                return numAl.intValue();
            }
            Log.e("CarLayoutManager", ":: calculatePreviousPageBreakPosition nearest position not found");
            return i;
        }
        int iBD = bD(viewU) - af(viewU).topMargin;
        int i2 = i;
        while (i2 > 0) {
            int i3 = i2 - 1;
            View viewU2 = U(i3);
            if (viewU2 == null) {
                return i2;
            }
            if (bD(viewU2) - af(viewU2).topMargin < iBD - this.D) {
                return i2 == i ? i3 : i2;
            }
            i2 = i3;
        }
        return 0;
    }

    public final int l() {
        for (int i = 0; i < av(); i++) {
            View viewAD = aD(i);
            ma maVarAf = af(viewAD);
            int iBD = bD(viewAD);
            if (this.l) {
                iBD -= maVarAf.topMargin;
            }
            if (iBD >= getPaddingTop()) {
                return i;
            }
        }
        return -1;
    }

    public final int m() {
        View viewK = K();
        if (viewK == null) {
            return -1;
        }
        return bl(viewK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a1, code lost:
    
        if (r0.contains(r2) != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    @Override // defpackage.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.me r20, defpackage.ml r21) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.sdk.ui.CarLayoutManager.p(me, ml):void");
    }

    public final int s() {
        View viewAE = aE();
        if (viewAE == null) {
            return -1;
        }
        return bl(viewAE);
    }

    public final int t() {
        for (int iAv = av() - 1; iAv >= 0; iAv--) {
            View viewAD = aD(iAv);
            ma maVarAf = af(viewAD);
            int iBA = bA(viewAD);
            if (this.l) {
                iBA += maVarAf.bottomMargin;
            }
            if (iBA <= this.D - getPaddingBottom()) {
                return iAv;
            }
        }
        return -1;
    }

    public final int x() {
        View viewN = N();
        if (viewN == null) {
            return -1;
        }
        return bl(viewN);
    }
}
