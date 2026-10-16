package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public class LinearLayoutManager extends V implements h0 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C1483v mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C1484w mLayoutChunkResult;
    private C1485x mLayoutState;
    int mOrientation;
    B mOrientationHelper;
    C1486y mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager() {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.V
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(j0 j0Var, int[] iArr) {
        int i5;
        int extraLayoutSpace = getExtraLayoutSpace(j0Var);
        if (this.mLayoutState.f19029f == -1) {
            i5 = 0;
        } else {
            i5 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i5;
    }

    @Override // androidx.recyclerview.widget.V
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.V
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.V
    public void collectAdjacentPrefetchPositions(int i5, int i10, j0 j0Var, T t10) {
        if (this.mOrientation != 0) {
            i5 = i10;
        }
        if (getChildCount() == 0 || i5 == 0) {
            return;
        }
        ensureLayoutState();
        o(i5 > 0 ? 1 : -1, Math.abs(i5), true, j0Var);
        collectPrefetchPositionsForLayoutState(j0Var, this.mLayoutState, t10);
    }

    @Override // androidx.recyclerview.widget.V
    public void collectInitialPrefetchPositions(int i5, T t10) {
        boolean z2;
        int i10;
        C1486y c1486y = this.mPendingSavedState;
        if (c1486y == null || (i10 = c1486y.f19037a) < 0) {
            n();
            z2 = this.mShouldReverseLayout;
            i10 = this.mPendingScrollPosition;
            if (i10 == -1) {
                i10 = z2 ? i5 - 1 : 0;
            }
        } else {
            z2 = c1486y.f19039c;
        }
        int i11 = z2 ? -1 : 1;
        for (int i12 = 0; i12 < this.mInitialPrefetchItemCount && i10 >= 0 && i10 < i5; i12++) {
            ((C1479q) t10).a(i10, 0);
            i10 += i11;
        }
    }

    public void collectPrefetchPositionsForLayoutState(j0 j0Var, C1485x c1485x, T t10) {
        int i5 = c1485x.f19027d;
        if (i5 < 0 || i5 >= j0Var.b()) {
            return;
        }
        ((C1479q) t10).a(i5, Math.max(0, c1485x.f19030g));
    }

    @Override // androidx.recyclerview.widget.V
    public int computeHorizontalScrollExtent(j0 j0Var) {
        return d(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public int computeHorizontalScrollOffset(j0 j0Var) {
        return e(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public int computeHorizontalScrollRange(j0 j0Var) {
        return f(j0Var);
    }

    @Override // androidx.recyclerview.widget.h0
    public PointF computeScrollVectorForPosition(int i5) {
        if (getChildCount() == 0) {
            return null;
        }
        int i10 = (i5 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10);
    }

    @Override // androidx.recyclerview.widget.V
    public int computeVerticalScrollExtent(j0 j0Var) {
        return d(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public int computeVerticalScrollOffset(j0 j0Var) {
        return e(j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public int computeVerticalScrollRange(j0 j0Var) {
        return f(j0Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 17 ? i5 != 33 ? i5 != 66 ? (i5 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public C1485x createLayoutState() {
        C1485x c1485x = new C1485x();
        c1485x.f19024a = true;
        c1485x.f19031h = 0;
        c1485x.f19032i = 0;
        c1485x.k = null;
        return c1485x;
    }

    public final int d(j0 j0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return android.support.v4.media.session.b.X(j0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(j0 j0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return android.support.v4.media.session.b.Y(j0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(j0 j0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return android.support.v4.media.session.b.Z(j0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(c0 c0Var, C1485x c1485x, j0 j0Var, boolean z2) {
        int i5;
        int i10 = c1485x.f19026c;
        int i11 = c1485x.f19030g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                c1485x.f19030g = i11 + i10;
            }
            l(c0Var, c1485x);
        }
        int i12 = c1485x.f19026c + c1485x.f19031h;
        C1484w c1484w = this.mLayoutChunkResult;
        while (true) {
            if ((!c1485x.f19034l && i12 <= 0) || (i5 = c1485x.f19027d) < 0 || i5 >= j0Var.b()) {
                break;
            }
            c1484w.f19020a = 0;
            c1484w.f19021b = false;
            c1484w.f19022c = false;
            c1484w.f19023d = false;
            layoutChunk(c0Var, j0Var, c1485x, c1484w);
            if (!c1484w.f19021b) {
                int i13 = c1485x.f19025b;
                int i14 = c1484w.f19020a;
                c1485x.f19025b = (c1485x.f19029f * i14) + i13;
                if (!c1484w.f19022c || c1485x.k != null || !j0Var.f18900g) {
                    c1485x.f19026c -= i14;
                    i12 -= i14;
                }
                int i15 = c1485x.f19030g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    c1485x.f19030g = i16;
                    int i17 = c1485x.f19026c;
                    if (i17 < 0) {
                        c1485x.f19030g = i16 + i17;
                    }
                    l(c0Var, c1485x);
                }
                if (z2 && c1484w.f19023d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - c1485x.f19026c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z2, boolean z10) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z2, z10) : findOneVisibleChild(getChildCount() - 1, -1, z2, z10);
    }

    public View findFirstVisibleChildClosestToStart(boolean z2, boolean z10) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z2, z10) : findOneVisibleChild(0, getChildCount(), z2, z10);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i5, int i10) {
        int i11;
        int i12;
        ensureLayoutState();
        if (i10 <= i5 && i10 >= i5) {
            return getChildAt(i5);
        }
        if (this.mOrientationHelper.e(getChildAt(i5)) < this.mOrientationHelper.k()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i5, i10, i11, i12) : this.mVerticalBoundCheck.a(i5, i10, i11, i12);
    }

    public View findOneVisibleChild(int i5, int i10, boolean z2, boolean z10) {
        ensureLayoutState();
        int i11 = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        int i12 = z2 ? 24579 : 320;
        if (!z10) {
            i11 = 0;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i5, i10, i12, i11) : this.mVerticalBoundCheck.a(i5, i10, i12, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.c0 r17, androidx.recyclerview.widget.j0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.ensureLayoutState()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            androidx.recyclerview.widget.B r7 = r0.mOrientationHelper
            int r7 = r7.k()
            androidx.recyclerview.widget.B r8 = r0.mOrientationHelper
            int r8 = r8.g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.B r14 = r0.mOrientationHelper
            int r14 = r14.e(r12)
            androidx.recyclerview.widget.B r15 = r0.mOrientationHelper
            int r15 = r15.b(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.W r13 = (androidx.recyclerview.widget.W) r13
            androidx.recyclerview.widget.m0 r13 = r13.f18812a
            boolean r13 = r13.isRemoved()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.c0, androidx.recyclerview.widget.j0, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.V
    public View findViewByPosition(int i5) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i5 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i5) {
                return childAt;
            }
        }
        return super.findViewByPosition(i5);
    }

    public final int g(int i5, c0 c0Var, j0 j0Var, boolean z2) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i5;
        if (iG2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(-iG2, c0Var, j0Var);
        int i11 = i5 + i10;
        if (!z2 || (iG = this.mOrientationHelper.g() - i11) <= 0) {
            return i10;
        }
        this.mOrientationHelper.o(iG);
        return iG + i10;
    }

    @Override // androidx.recyclerview.widget.V
    public W generateDefaultLayoutParams() {
        return new W(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(j0 j0Var) {
        if (j0Var.f18894a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(int i5, c0 c0Var, j0 j0Var, boolean z2) {
        int iK;
        int iK2 = i5 - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i10 = -scrollBy(iK2, c0Var, j0Var);
        int i11 = i5 + i10;
        if (!z2 || (iK = i11 - this.mOrientationHelper.k()) <= 0) {
            return i10;
        }
        this.mOrientationHelper.o(-iK);
        return i10 - iK;
    }

    public final View i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.V
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void k() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.e(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void l(c0 c0Var, C1485x c1485x) {
        if (!c1485x.f19024a || c1485x.f19034l) {
            return;
        }
        int i5 = c1485x.f19030g;
        int i10 = c1485x.f19032i;
        if (c1485x.f19029f == -1) {
            int childCount = getChildCount();
            if (i5 < 0) {
                return;
            }
            int iF = (this.mOrientationHelper.f() - i5) + i10;
            if (this.mShouldReverseLayout) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.n(childAt) < iF) {
                        m(c0Var, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = childCount - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View childAt2 = getChildAt(i13);
                if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.n(childAt2) < iF) {
                    m(c0Var, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i5 < 0) {
            return;
        }
        int i14 = i5 - i10;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt3 = getChildAt(i15);
                if (this.mOrientationHelper.b(childAt3) > i14 || this.mOrientationHelper.m(childAt3) > i14) {
                    m(c0Var, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = childCount2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View childAt4 = getChildAt(i17);
            if (this.mOrientationHelper.b(childAt4) > i14 || this.mOrientationHelper.m(childAt4) > i14) {
                m(c0Var, i16, i17);
                return;
            }
        }
    }

    public void layoutChunk(c0 c0Var, j0 j0Var, C1485x c1485x, C1484w c1484w) {
        int i5;
        int i10;
        int i11;
        int i12;
        int paddingLeft;
        int iD;
        int i13;
        int i14;
        View viewB = c1485x.b(c0Var);
        if (viewB == null) {
            c1484w.f19021b = true;
            return;
        }
        W w2 = (W) viewB.getLayoutParams();
        if (c1485x.k == null) {
            if (this.mShouldReverseLayout == (c1485x.f19029f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c1485x.f19029f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        c1484w.f19020a = this.mOrientationHelper.c(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD = getWidth() - getPaddingRight();
                paddingLeft = iD - this.mOrientationHelper.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD = this.mOrientationHelper.d(viewB) + paddingLeft;
            }
            if (c1485x.f19029f == -1) {
                i14 = c1485x.f19025b;
                i13 = i14 - c1484w.f19020a;
            } else {
                i13 = c1485x.f19025b;
                i14 = c1484w.f19020a + i13;
            }
            int i15 = paddingLeft;
            i12 = i13;
            i11 = i15;
            i10 = i14;
            i5 = iD;
        } else {
            int paddingTop = getPaddingTop();
            int iD2 = this.mOrientationHelper.d(viewB) + paddingTop;
            if (c1485x.f19029f == -1) {
                int i16 = c1485x.f19025b;
                i11 = i16 - c1484w.f19020a;
                i5 = i16;
                i10 = iD2;
            } else {
                int i17 = c1485x.f19025b;
                i5 = c1484w.f19020a + i17;
                i10 = iD2;
                i11 = i17;
            }
            i12 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, i11, i12, i5, i10);
        if (w2.f18812a.isRemoved() || w2.f18812a.isUpdated()) {
            c1484w.f19022c = true;
        }
        c1484w.f19023d = viewB.hasFocusable();
    }

    public final void m(c0 c0Var, int i5, int i10) {
        if (i5 == i10) {
            return;
        }
        if (i10 <= i5) {
            while (i5 > i10) {
                removeAndRecycleViewAt(i5, c0Var);
                i5--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i5; i11--) {
                removeAndRecycleViewAt(i11, c0Var);
            }
        }
    }

    public final void n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void o(int i5, int i10, boolean z2, j0 j0Var) {
        int iK;
        this.mLayoutState.f19034l = resolveIsInfinite();
        this.mLayoutState.f19029f = i5;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(j0Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z10 = i5 == 1;
        C1485x c1485x = this.mLayoutState;
        int i11 = z10 ? iMax2 : iMax;
        c1485x.f19031h = i11;
        if (!z10) {
            iMax = iMax2;
        }
        c1485x.f19032i = iMax;
        if (z10) {
            c1485x.f19031h = this.mOrientationHelper.h() + i11;
            View viewI = i();
            C1485x c1485x2 = this.mLayoutState;
            c1485x2.f19028e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewI);
            C1485x c1485x3 = this.mLayoutState;
            c1485x2.f19027d = position + c1485x3.f19028e;
            c1485x3.f19025b = this.mOrientationHelper.b(viewI);
            iK = this.mOrientationHelper.b(viewI) - this.mOrientationHelper.g();
        } else {
            View viewJ = j();
            C1485x c1485x4 = this.mLayoutState;
            c1485x4.f19031h = this.mOrientationHelper.k() + c1485x4.f19031h;
            C1485x c1485x5 = this.mLayoutState;
            c1485x5.f19028e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewJ);
            C1485x c1485x6 = this.mLayoutState;
            c1485x5.f19027d = position2 + c1485x6.f19028e;
            c1485x6.f19025b = this.mOrientationHelper.e(viewJ);
            iK = (-this.mOrientationHelper.e(viewJ)) + this.mOrientationHelper.k();
        }
        C1485x c1485x7 = this.mLayoutState;
        c1485x7.f19026c = i10;
        if (z2) {
            c1485x7.f19026c = i10 - iK;
        }
        c1485x7.f19030g = iK;
    }

    public void onAnchorReady(c0 c0Var, j0 j0Var, C1483v c1483v, int i5) {
    }

    @Override // androidx.recyclerview.widget.V
    public void onDetachedFromWindow(RecyclerView recyclerView, c0 c0Var) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0Var);
            c0Var.f18835a.clear();
            c0Var.e();
        }
    }

    @Override // androidx.recyclerview.widget.V
    public View onFocusSearchFailed(View view, int i5, c0 c0Var, j0 j0Var) {
        int iConvertFocusDirectionToLayoutDirection;
        n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i5)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, j0Var);
            C1485x c1485x = this.mLayoutState;
            c1485x.f19030g = Integer.MIN_VALUE;
            c1485x.f19024a = false;
            fill(c0Var, c1485x, j0Var, true);
            View viewFindOnePartiallyOrCompletelyInvisibleChild = iConvertFocusDirectionToLayoutDirection == -1 ? this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View viewJ = iConvertFocusDirectionToLayoutDirection == -1 ? j() : i();
            if (!viewJ.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewJ;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.V
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    @Override // androidx.recyclerview.widget.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.c0 r14, androidx.recyclerview.widget.j0 r15) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.c0, androidx.recyclerview.widget.j0):void");
    }

    @Override // androidx.recyclerview.widget.V
    public void onLayoutCompleted(j0 j0Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.V
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C1486y) {
            C1486y c1486y = (C1486y) parcelable;
            this.mPendingSavedState = c1486y;
            if (this.mPendingScrollPosition != -1) {
                c1486y.f19037a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.V
    public Parcelable onSaveInstanceState() {
        C1486y c1486y = this.mPendingSavedState;
        if (c1486y != null) {
            C1486y c1486y2 = new C1486y();
            c1486y2.f19037a = c1486y.f19037a;
            c1486y2.f19038b = c1486y.f19038b;
            c1486y2.f19039c = c1486y.f19039c;
            return c1486y2;
        }
        C1486y c1486y3 = new C1486y();
        if (getChildCount() <= 0) {
            c1486y3.f19037a = -1;
            return c1486y3;
        }
        ensureLayoutState();
        boolean z2 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        c1486y3.f19039c = z2;
        if (z2) {
            View viewI = i();
            c1486y3.f19038b = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewI);
            c1486y3.f19037a = getPosition(viewI);
            return c1486y3;
        }
        View viewJ = j();
        c1486y3.f19037a = getPosition(viewJ);
        c1486y3.f19038b = this.mOrientationHelper.e(viewJ) - this.mOrientationHelper.k();
        return c1486y3;
    }

    public final void p(int i5, int i10) {
        this.mLayoutState.f19026c = this.mOrientationHelper.g() - i10;
        C1485x c1485x = this.mLayoutState;
        c1485x.f19028e = this.mShouldReverseLayout ? -1 : 1;
        c1485x.f19027d = i5;
        c1485x.f19029f = 1;
        c1485x.f19025b = i10;
        c1485x.f19030g = Integer.MIN_VALUE;
    }

    public void prepareForDrop(View view, View view2, int i5, int i10) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c10 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (c10 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final void q(int i5, int i10) {
        this.mLayoutState.f19026c = i10 - this.mOrientationHelper.k();
        C1485x c1485x = this.mLayoutState;
        c1485x.f19027d = i5;
        c1485x.f19028e = this.mShouldReverseLayout ? 1 : -1;
        c1485x.f19029f = -1;
        c1485x.f19025b = i10;
        c1485x.f19030g = Integer.MIN_VALUE;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i5, c0 c0Var, j0 j0Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f19024a = true;
        int i10 = i5 > 0 ? 1 : -1;
        int iAbs = Math.abs(i5);
        o(i10, iAbs, true, j0Var);
        C1485x c1485x = this.mLayoutState;
        int iFill = fill(c0Var, c1485x, j0Var, false) + c1485x.f19030g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i5 = i10 * iFill;
        }
        this.mOrientationHelper.o(-i5);
        this.mLayoutState.f19033j = i5;
        return i5;
    }

    @Override // androidx.recyclerview.widget.V
    public int scrollHorizontallyBy(int i5, c0 c0Var, j0 j0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i5, c0Var, j0Var);
    }

    @Override // androidx.recyclerview.widget.V
    public void scrollToPosition(int i5) {
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C1486y c1486y = this.mPendingSavedState;
        if (c1486y != null) {
            c1486y.f19037a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i5, int i10) {
        this.mPendingScrollPosition = i5;
        this.mPendingScrollPositionOffset = i10;
        C1486y c1486y = this.mPendingSavedState;
        if (c1486y != null) {
            c1486y.f19037a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.V
    public int scrollVerticallyBy(int i5, c0 c0Var, j0 j0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i5, c0Var, j0Var);
    }

    public void setInitialPrefetchItemCount(int i5) {
        this.mInitialPrefetchItemCount = i5;
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i5 != this.mOrientation || this.mOrientationHelper == null) {
            B bA = B.a(this, i5);
            this.mOrientationHelper = bA;
            this.mAnchorInfo.f19009a = bA;
            this.mOrientation = i5;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z2) {
        this.mRecycleChildrenOnDetach = z2;
    }

    public void setReverseLayout(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (z2 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z2;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z2) {
        this.mSmoothScrollbarEnabled = z2;
    }

    public void setStackFromEnd(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z2) {
            return;
        }
        this.mStackFromEnd = z2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.V
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.V
    public void smoothScrollToPosition(RecyclerView recyclerView, j0 j0Var, int i5) {
        C1487z c1487z = new C1487z(recyclerView.getContext());
        c1487z.setTargetPosition(i5);
        startSmoothScroll(c1487z);
    }

    @Override // androidx.recyclerview.widget.V
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iE = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i5 = 1; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    k();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iE2 < iE);
                    throw new RuntimeException(sb2.toString());
                }
                if (iE2 > iE) {
                    k();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i10 = 1; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                k();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(iE3 < iE);
                throw new RuntimeException(sb3.toString());
            }
            if (iE3 < iE) {
                k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(int i5, boolean z2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1483v();
        this.mLayoutChunkResult = new C1484w();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i5);
        setReverseLayout(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i5, int i10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1483v();
        this.mLayoutChunkResult = new C1484w();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        U properties = V.getProperties(context, attributeSet, i5, i10);
        setOrientation(properties.f18808a);
        setReverseLayout(properties.f18810c);
        setStackFromEnd(properties.f18811d);
    }
}
