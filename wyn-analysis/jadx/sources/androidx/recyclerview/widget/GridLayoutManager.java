package androidx.recyclerview.widget;

import A7.AbstractC0279p0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import ka.AbstractC3256n;
import l1.C3375e;
import zg.C4672k;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18767a;

    /* renamed from: b, reason: collision with root package name */
    public int f18768b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f18769c;

    /* renamed from: d, reason: collision with root package name */
    public View[] f18770d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f18771e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseIntArray f18772f;

    /* renamed from: g, reason: collision with root package name */
    public final C4672k f18773g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f18774h;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i10) {
        super(context, attributeSet, i5, i10);
        this.f18767a = false;
        this.f18768b = -1;
        this.f18771e = new SparseIntArray();
        this.f18772f = new SparseIntArray();
        this.f18773g = new C4672k();
        this.f18774h = new Rect();
        y(V.getProperties(context, attributeSet, i5, i10).f18809b);
    }

    @Override // androidx.recyclerview.widget.V
    public final boolean checkLayoutParams(W w2) {
        return w2 instanceof C1481t;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(j0 j0Var, C1485x c1485x, T t10) {
        int i5;
        int i10 = this.f18768b;
        for (int i11 = 0; i11 < this.f18768b && (i5 = c1485x.f19027d) >= 0 && i5 < j0Var.b() && i10 > 0; i11++) {
            ((C1479q) t10).a(c1485x.f19027d, Math.max(0, c1485x.f19030g));
            this.f18773g.getClass();
            i10--;
            c1485x.f19027d += c1485x.f19028e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(c0 c0Var, j0 j0Var, boolean z2, boolean z10) {
        int i5;
        int childCount;
        int childCount2 = getChildCount();
        int i10 = 1;
        if (z10) {
            childCount = getChildCount() - 1;
            i5 = -1;
            i10 = -1;
        } else {
            i5 = childCount2;
            childCount = 0;
        }
        int iB = j0Var.b();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (childCount != i5) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && v(position, c0Var, j0Var) == 0) {
                if (((W) childAt.getLayoutParams()).f18812a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    public final W generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C1481t(-2, -1) : new C1481t(-1, -2);
    }

    @Override // androidx.recyclerview.widget.V
    public final W generateLayoutParams(Context context, AttributeSet attributeSet) {
        C1481t c1481t = new C1481t(context, attributeSet);
        c1481t.f18984e = -1;
        c1481t.f18985f = 0;
        return c1481t;
    }

    @Override // androidx.recyclerview.widget.V
    public final int getColumnCountForAccessibility(c0 c0Var, j0 j0Var) {
        if (this.mOrientation == 1) {
            return this.f18768b;
        }
        if (j0Var.b() < 1) {
            return 0;
        }
        return u(j0Var.b() - 1, c0Var, j0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.V
    public final int getRowCountForAccessibility(c0 c0Var, j0 j0Var) {
        if (this.mOrientation == 0) {
            return this.f18768b;
        }
        if (j0Var.b() < 1) {
            return 0;
        }
        return u(j0Var.b() - 1, c0Var, j0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(c0 c0Var, j0 j0Var, C1485x c1485x, C1484w c1484w) {
        int i5;
        int i10;
        int i11;
        int iD;
        int paddingLeft;
        int paddingTop;
        int iD2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z2;
        int i12;
        View viewB;
        int iJ = this.mOrientationHelper.j();
        boolean z10 = iJ != 1073741824;
        int i13 = getChildCount() > 0 ? this.f18769c[this.f18768b] : 0;
        if (z10) {
            z();
        }
        boolean z11 = c1485x.f19028e == 1;
        int iV = this.f18768b;
        if (!z11) {
            iV = v(c1485x.f19027d, c0Var, j0Var) + w(c1485x.f19027d, c0Var, j0Var);
        }
        int i14 = 0;
        while (i14 < this.f18768b && (i12 = c1485x.f19027d) >= 0 && i12 < j0Var.b() && iV > 0) {
            int i15 = c1485x.f19027d;
            int iW = w(i15, c0Var, j0Var);
            if (iW > this.f18768b) {
                throw new IllegalArgumentException(AbstractC0279p0.j(this.f18768b, " spans.", R8.v.h("Item at position ", i15, " requires ", iW, " spans but GridLayoutManager has only ")));
            }
            iV -= iW;
            if (iV < 0 || (viewB = c1485x.b(c0Var)) == null) {
                break;
            }
            this.f18770d[i14] = viewB;
            i14++;
        }
        if (i14 == 0) {
            c1484w.f19021b = true;
            return;
        }
        if (z11) {
            i11 = 1;
            i10 = i14;
            i5 = 0;
        } else {
            i5 = i14 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i16 = 0;
        while (i5 != i10) {
            View view = this.f18770d[i5];
            C1481t c1481t = (C1481t) view.getLayoutParams();
            int iW2 = w(getPosition(view), c0Var, j0Var);
            c1481t.f18985f = iW2;
            c1481t.f18984e = i16;
            i16 += iW2;
            i5 += i11;
        }
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.f18770d[i18];
            if (c1485x.k != null) {
                z2 = false;
                if (z11) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z11) {
                addView(view2);
                z2 = false;
            } else {
                z2 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f18774h);
            x(view2, iJ, z2);
            int iC = this.mOrientationHelper.c(view2);
            if (iC > i17) {
                i17 = iC;
            }
            float fD = (this.mOrientationHelper.d(view2) * 1.0f) / ((C1481t) view2.getLayoutParams()).f18985f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z10) {
            r(Math.max(Math.round(f10 * this.f18768b), i13));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.f18770d[i19];
                x(view3, 1073741824, true);
                int iC2 = this.mOrientationHelper.c(view3);
                if (iC2 > i17) {
                    i17 = iC2;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.f18770d[i20];
            if (this.mOrientationHelper.c(view4) != i17) {
                C1481t c1481t2 = (C1481t) view4.getLayoutParams();
                Rect rect = c1481t2.f18813b;
                int i21 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1481t2).topMargin + ((ViewGroup.MarginLayoutParams) c1481t2).bottomMargin;
                int i22 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1481t2).leftMargin + ((ViewGroup.MarginLayoutParams) c1481t2).rightMargin;
                int iT = t(c1481t2.f18984e, c1481t2.f18985f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = V.getChildMeasureSpec(iT, 1073741824, i22, ((ViewGroup.MarginLayoutParams) c1481t2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    childMeasureSpec = V.getChildMeasureSpec(iT, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c1481t2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (W) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        c1484w.f19020a = i17;
        if (this.mOrientation != 1) {
            if (c1485x.f19029f == -1) {
                int i23 = c1485x.f19025b;
                paddingLeft = i23 - i17;
                iD = i23;
            } else {
                int i24 = c1485x.f19025b;
                iD = i24 + i17;
                paddingLeft = i24;
            }
            paddingTop = 0;
            iD2 = 0;
        } else if (c1485x.f19029f == -1) {
            iD2 = c1485x.f19025b;
            paddingTop = iD2 - i17;
            paddingLeft = 0;
            iD = 0;
        } else {
            int i25 = c1485x.f19025b;
            paddingTop = i25;
            iD = 0;
            iD2 = i25 + i17;
            paddingLeft = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.f18770d[i26];
            C1481t c1481t3 = (C1481t) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f18769c[c1481t3.f18984e];
                iD2 = this.mOrientationHelper.d(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iD = this.f18769c[this.f18768b - c1481t3.f18984e] + getPaddingLeft();
                paddingLeft = iD - this.mOrientationHelper.d(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f18769c[c1481t3.f18984e];
                iD = this.mOrientationHelper.d(view5) + paddingLeft;
            }
            int i27 = iD;
            int i28 = paddingLeft;
            int i29 = iD2;
            layoutDecoratedWithMargins(view5, i28, paddingTop, i27, i29);
            paddingLeft = i28;
            iD = i27;
            iD2 = i29;
            if (c1481t3.f18812a.isRemoved() || c1481t3.f18812a.isUpdated()) {
                c1484w.f19022c = true;
            }
            c1484w.f19023d = view5.hasFocusable() | c1484w.f19023d;
        }
        Arrays.fill(this.f18770d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(c0 c0Var, j0 j0Var, C1483v c1483v, int i5) {
        super.onAnchorReady(c0Var, j0Var, c1483v, i5);
        z();
        if (j0Var.b() > 0 && !j0Var.f18900g) {
            boolean z2 = i5 == 1;
            int iV = v(c1483v.f19010b, c0Var, j0Var);
            if (z2) {
                while (iV > 0) {
                    int i10 = c1483v.f19010b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    c1483v.f19010b = i11;
                    iV = v(i11, c0Var, j0Var);
                }
            } else {
                int iB = j0Var.b() - 1;
                int i12 = c1483v.f19010b;
                while (i12 < iB) {
                    int i13 = i12 + 1;
                    int iV2 = v(i13, c0Var, j0Var);
                    if (iV2 <= iV) {
                        break;
                    }
                    i12 = i13;
                    iV = iV2;
                }
                c1483v.f19010b = i12;
            }
        }
        s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.c0 r26, androidx.recyclerview.widget.j0 r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.c0, androidx.recyclerview.widget.j0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.V
    public final void onInitializeAccessibilityNodeInfoForItem(c0 c0Var, j0 j0Var, View view, C3375e c3375e) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1481t)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c3375e);
            return;
        }
        C1481t c1481t = (C1481t) layoutParams;
        int iU = u(c1481t.f18812a.getLayoutPosition(), c0Var, j0Var);
        if (this.mOrientation == 0) {
            c3375e.f39862a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c1481t.f18984e, c1481t.f18985f, iU, 1, false, false));
        } else {
            c3375e.f39862a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iU, 1, c1481t.f18984e, c1481t.f18985f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsAdded(RecyclerView recyclerView, int i5, int i10) {
        C4672k c4672k = this.f18773g;
        c4672k.b();
        ((SparseIntArray) c4672k.f48626b).clear();
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsChanged(RecyclerView recyclerView) {
        C4672k c4672k = this.f18773g;
        c4672k.b();
        ((SparseIntArray) c4672k.f48626b).clear();
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsMoved(RecyclerView recyclerView, int i5, int i10, int i11) {
        C4672k c4672k = this.f18773g;
        c4672k.b();
        ((SparseIntArray) c4672k.f48626b).clear();
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsRemoved(RecyclerView recyclerView, int i5, int i10) {
        C4672k c4672k = this.f18773g;
        c4672k.b();
        ((SparseIntArray) c4672k.f48626b).clear();
    }

    @Override // androidx.recyclerview.widget.V
    public final void onItemsUpdated(RecyclerView recyclerView, int i5, int i10, Object obj) {
        C4672k c4672k = this.f18773g;
        c4672k.b();
        ((SparseIntArray) c4672k.f48626b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    public final void onLayoutChildren(c0 c0Var, j0 j0Var) {
        boolean z2 = j0Var.f18900g;
        SparseIntArray sparseIntArray = this.f18772f;
        SparseIntArray sparseIntArray2 = this.f18771e;
        if (z2) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C1481t c1481t = (C1481t) getChildAt(i5).getLayoutParams();
                int layoutPosition = c1481t.f18812a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, c1481t.f18985f);
                sparseIntArray.put(layoutPosition, c1481t.f18984e);
            }
        }
        super.onLayoutChildren(c0Var, j0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    public final void onLayoutCompleted(j0 j0Var) {
        super.onLayoutCompleted(j0Var);
        this.f18767a = false;
    }

    public final void r(int i5) {
        int i10;
        int[] iArr = this.f18769c;
        int i11 = this.f18768b;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i5) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i5 / i11;
        int i14 = i5 % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.f18769c = iArr;
    }

    public final void s() {
        View[] viewArr = this.f18770d;
        if (viewArr == null || viewArr.length != this.f18768b) {
            this.f18770d = new View[this.f18768b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    public final int scrollHorizontallyBy(int i5, c0 c0Var, j0 j0Var) {
        z();
        s();
        return super.scrollHorizontallyBy(i5, c0Var, j0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    public final int scrollVerticallyBy(int i5, c0 c0Var, j0 j0Var) {
        z();
        s();
        return super.scrollVerticallyBy(i5, c0Var, j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public final void setMeasuredDimension(Rect rect, int i5, int i10) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f18769c == null) {
            super.setMeasuredDimension(rect, i5, i10);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = V.chooseSize(i10, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f18769c;
            iChooseSize = V.chooseSize(i5, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = V.chooseSize(i5, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f18769c;
            iChooseSize2 = V.chooseSize(i10, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f18767a;
    }

    public final int t(int i5, int i10) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f18769c;
            return iArr[i10 + i5] - iArr[i5];
        }
        int[] iArr2 = this.f18769c;
        int i11 = this.f18768b;
        return iArr2[i11 - i5] - iArr2[(i11 - i5) - i10];
    }

    public final int u(int i5, c0 c0Var, j0 j0Var) {
        boolean z2 = j0Var.f18900g;
        C4672k c4672k = this.f18773g;
        if (!z2) {
            int i10 = this.f18768b;
            c4672k.getClass();
            return C4672k.a(i5, i10);
        }
        int iB = c0Var.b(i5);
        if (iB != -1) {
            int i11 = this.f18768b;
            c4672k.getClass();
            return C4672k.a(iB, i11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i5);
        return 0;
    }

    public final int v(int i5, c0 c0Var, j0 j0Var) {
        boolean z2 = j0Var.f18900g;
        C4672k c4672k = this.f18773g;
        if (!z2) {
            int i10 = this.f18768b;
            c4672k.getClass();
            return i5 % i10;
        }
        int i11 = this.f18772f.get(i5, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = c0Var.b(i5);
        if (iB != -1) {
            int i12 = this.f18768b;
            c4672k.getClass();
            return iB % i12;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 0;
    }

    public final int w(int i5, c0 c0Var, j0 j0Var) {
        boolean z2 = j0Var.f18900g;
        C4672k c4672k = this.f18773g;
        if (!z2) {
            c4672k.getClass();
            return 1;
        }
        int i10 = this.f18771e.get(i5, -1);
        if (i10 != -1) {
            return i10;
        }
        if (c0Var.b(i5) != -1) {
            c4672k.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 1;
    }

    public final void x(View view, int i5, boolean z2) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C1481t c1481t = (C1481t) view.getLayoutParams();
        Rect rect = c1481t.f18813b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1481t).topMargin + ((ViewGroup.MarginLayoutParams) c1481t).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1481t).leftMargin + ((ViewGroup.MarginLayoutParams) c1481t).rightMargin;
        int iT = t(c1481t.f18984e, c1481t.f18985f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = V.getChildMeasureSpec(iT, i5, i11, ((ViewGroup.MarginLayoutParams) c1481t).width, false);
            childMeasureSpec = V.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i10, ((ViewGroup.MarginLayoutParams) c1481t).height, true);
        } else {
            int childMeasureSpec3 = V.getChildMeasureSpec(iT, i5, i10, ((ViewGroup.MarginLayoutParams) c1481t).height, false);
            int childMeasureSpec4 = V.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i11, ((ViewGroup.MarginLayoutParams) c1481t).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        W w2 = (W) view.getLayoutParams();
        if (z2 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, w2) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, w2)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void y(int i5) {
        if (i5 == this.f18768b) {
            return;
        }
        this.f18767a = true;
        if (i5 < 1) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Span count should be at least 1. Provided "));
        }
        this.f18768b = i5;
        this.f18773g.b();
        requestLayout();
    }

    public final void z() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        r(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.V
    public final W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1481t c1481t = new C1481t((ViewGroup.MarginLayoutParams) layoutParams);
            c1481t.f18984e = -1;
            c1481t.f18985f = 0;
            return c1481t;
        }
        C1481t c1481t2 = new C1481t(layoutParams);
        c1481t2.f18984e = -1;
        c1481t2.f18985f = 0;
        return c1481t2;
    }

    public GridLayoutManager(int i5) {
        super(1, false);
        this.f18767a = false;
        this.f18768b = -1;
        this.f18771e = new SparseIntArray();
        this.f18772f = new SparseIntArray();
        this.f18773g = new C4672k();
        this.f18774h = new Rect();
        y(i5);
    }
}
