package androidx.recyclerview.widget;

import Va.M6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.shadow.okio.Segment;
import j3.AbstractC3078a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l1.C3375e;
import x.C4429v;

/* loaded from: classes.dex */
public abstract class V {
    boolean mAutoMeasure;
    C1465c mChildHelper;
    private int mHeight;
    private int mHeightMode;
    x0 mHorizontalBoundCheck;
    private final w0 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    i0 mSmoothScroller;
    x0 mVerticalBoundCheck;
    private final w0 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public V() {
        S s10 = new S(this, 0);
        this.mHorizontalBoundCheckCallback = s10;
        S s11 = new S(this, 1);
        this.mVerticalBoundCheckCallback = s11;
        this.mHorizontalBoundCheck = new x0(s10);
        this.mVerticalBoundCheck = new x0(s11);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static boolean b(int i5, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i5 != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i5;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i5;
        }
        return true;
    }

    public static int chooseSize(int i5, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i10, i11) : size : Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
  0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
        /*
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L10
            if (r3 < 0) goto Le
        Lc:
            r2 = r0
            goto L1e
        Le:
            r3 = r2
            goto L1e
        L10:
            if (r3 < 0) goto L13
            goto Lc
        L13:
            r4 = -1
            if (r3 != r4) goto L18
            r3 = r1
            goto Lc
        L18:
            r4 = -2
            if (r3 != r4) goto Le
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1
        L1e:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.V.getChildMeasureSpec(int, int, int, boolean):int");
    }

    public static U getProperties(Context context, AttributeSet attributeSet, int i5, int i10) {
        U u10 = new U();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3078a.f38628a, i5, i10);
        u10.f18808a = typedArrayObtainStyledAttributes.getInt(0, 1);
        u10.f18809b = typedArrayObtainStyledAttributes.getInt(10, 1);
        u10.f18810c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        u10.f18811d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return u10;
    }

    public final void a(View view, int i5, boolean z2) {
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z2 || childViewHolderInt.isRemoved()) {
            C4429v c4429v = this.mRecyclerView.mViewInfoStore.f18754a;
            y0 y0VarA = (y0) c4429v.get(childViewHolderInt);
            if (y0VarA == null) {
                y0VarA = y0.a();
                c4429v.put(childViewHolderInt, y0VarA);
            }
            y0VarA.f19041a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        W w2 = (W) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i5, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iJ = this.mChildHelper.j(view);
            if (i5 == -1) {
                i5 = this.mChildHelper.e();
            }
            if (iJ == -1) {
                StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb2.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(M6.m(this.mRecyclerView, sb2));
            }
            if (iJ != i5) {
                this.mRecyclerView.mLayout.moveView(iJ, i5);
            }
        } else {
            this.mChildHelper.a(view, i5, false);
            w2.f18814c = true;
            i0 i0Var = this.mSmoothScroller;
            if (i0Var != null && i0Var.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (w2.f18815d) {
            childViewHolderInt.itemView.invalidate();
            w2.f18815d = false;
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(str);
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(View view, int i5, W w2) {
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            C4429v c4429v = this.mRecyclerView.mViewInfoStore.f18754a;
            y0 y0VarA = (y0) c4429v.get(childViewHolderInt);
            if (y0VarA == null) {
                y0VarA = y0.a();
                c4429v.put(childViewHolderInt, y0VarA);
            }
            y0VarA.f19041a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        this.mChildHelper.b(view, i5, w2, childViewHolderInt.isRemoved());
    }

    public final void c(c0 c0Var, int i5, View view) {
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i5);
            c0Var.h(childViewHolderInt);
        } else {
            detachViewAt(i5);
            c0Var.i(view);
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(W w2) {
        return w2 != null;
    }

    public void collectAdjacentPrefetchPositions(int i5, int i10, j0 j0Var, T t10) {
    }

    public void collectInitialPrefetchPositions(int i5, T t10) {
    }

    public abstract int computeHorizontalScrollExtent(j0 j0Var);

    public abstract int computeHorizontalScrollOffset(j0 j0Var);

    public abstract int computeHorizontalScrollRange(j0 j0Var);

    public int computeVerticalScrollExtent(j0 j0Var) {
        return 0;
    }

    public int computeVerticalScrollOffset(j0 j0Var) {
        return 0;
    }

    public int computeVerticalScrollRange(j0 j0Var) {
        return 0;
    }

    public void detachAndScrapAttachedViews(c0 c0Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            c(c0Var, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(View view, c0 c0Var) {
        c(c0Var, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i5, c0 c0Var) {
        c(c0Var, i5, getChildAt(i5));
    }

    public void detachView(View view) {
        int iJ = this.mChildHelper.j(view);
        if (iJ >= 0) {
            this.mChildHelper.c(iJ);
        }
    }

    public void detachViewAt(int i5) {
        getChildAt(i5);
        this.mChildHelper.c(i5);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, c0 c0Var) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, c0Var);
    }

    public void endAnimation(View view) {
        P p10 = this.mRecyclerView.mItemAnimator;
        if (p10 != null) {
            p10.d(RecyclerView.getChildViewHolderInt(view));
        }
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f18834c.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i5) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i5 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f18900g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract W generateDefaultLayoutParams();

    public W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof W ? new W((W) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new W((ViewGroup.MarginLayoutParams) layoutParams) : new W(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((W) view.getLayoutParams()).f18813b.bottom;
    }

    public View getChildAt(int i5) {
        C1465c c1465c = this.mChildHelper;
        if (c1465c != null) {
            return c1465c.d(i5);
        }
        return null;
    }

    public int getChildCount() {
        C1465c c1465c = this.mChildHelper;
        if (c1465c != null) {
            return c1465c.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(c0 c0Var, j0 j0Var) {
        return -1;
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((W) view.getLayoutParams()).f18813b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((W) view.getLayoutParams()).f18813b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f18834c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        I adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }

    public int getLayoutDirection() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = k1.S.f38779a;
        return recyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((W) view.getLayoutParams()).f18813b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = k1.S.f38779a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = k1.S.f38779a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = k1.S.f38779a;
        return recyclerView.getPaddingEnd();
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = k1.S.f38779a;
        return recyclerView.getPaddingStart();
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((W) view.getLayoutParams()).f18812a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((W) view.getLayoutParams()).f18813b.right;
    }

    public int getRowCountForAccessibility(c0 c0Var, j0 j0Var) {
        return -1;
    }

    public int getSelectionModeForAccessibility(c0 c0Var, j0 j0Var) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((W) view.getLayoutParams()).f18813b.top;
    }

    public void getTransformedBoundingBox(View view, boolean z2, Rect rect) {
        Matrix matrix;
        if (z2) {
            Rect rect2 = ((W) view.getLayoutParams()).f18813b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i5).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException(M6.m(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.addFlags(128);
        this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public boolean isAutoMeasureEnabled() {
        return this.mAutoMeasure;
    }

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(c0 c0Var, j0 j0Var) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        i0 i0Var = this.mSmoothScroller;
        return i0Var != null && i0Var.isRunning();
    }

    public boolean isViewPartiallyVisible(View view, boolean z2, boolean z10) {
        boolean z11 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z2 ? z11 : !z11;
    }

    public void layoutDecorated(View view, int i5, int i10, int i11, int i12) {
        Rect rect = ((W) view.getLayoutParams()).f18813b;
        view.layout(i5 + rect.left, i10 + rect.top, i11 - rect.right, i12 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i5, int i10, int i11, int i12) {
        W w2 = (W) view.getLayoutParams();
        Rect rect = w2.f18813b;
        view.layout(i5 + rect.left + ((ViewGroup.MarginLayoutParams) w2).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) w2).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) w2).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) w2).bottomMargin);
    }

    public void measureChild(View view, int i5, int i10) {
        W w2 = (W) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i5;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i11, ((ViewGroup.MarginLayoutParams) w2).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i12, ((ViewGroup.MarginLayoutParams) w2).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, w2)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i5, int i10) {
        W w2 = (W) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i11 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i5;
        int i12 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i10;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) w2).leftMargin + ((ViewGroup.MarginLayoutParams) w2).rightMargin + i11, ((ViewGroup.MarginLayoutParams) w2).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) w2).topMargin + ((ViewGroup.MarginLayoutParams) w2).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) w2).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, w2)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i5, int i10) {
        View childAt = getChildAt(i5);
        if (childAt != null) {
            detachViewAt(i5);
            attachView(childAt, i10);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i5 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i5) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i5);
        }
    }

    public void offsetChildrenVertical(int i5) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i5);
        }
    }

    public void onAdapterChanged(I i5, I i10) {
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i5, int i10) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public View onFocusSearchFailed(View view, int i5, c0 c0Var, j0 j0Var) {
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(C3375e c3375e) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c3375e);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C3375e c3375e) {
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        C1465c c1465c = this.mChildHelper;
        if (c1465c.f18834c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c3375e);
    }

    public View onInterceptFocusSearch(View view, int i5) {
        return null;
    }

    public void onItemsAdded(RecyclerView recyclerView, int i5, int i10) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i5, int i10, int i11) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i5, int i10) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i5, int i10) {
    }

    public abstract void onLayoutChildren(c0 c0Var, j0 j0Var);

    public abstract void onLayoutCompleted(j0 j0Var);

    public void onMeasure(c0 c0Var, j0 j0Var, int i5, int i10) {
        this.mRecyclerView.defaultOnMeasure(i5, i10);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i5) {
    }

    public void onSmoothScrollerStopped(i0 i0Var) {
        if (this.mSmoothScroller == i0Var) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i5, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i5, bundle);
    }

    public boolean performAccessibilityActionForItem(c0 c0Var, j0 j0Var, View view, int i5, Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = k1.S.f38779a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            this.mChildHelper.k(childCount);
        }
    }

    public void removeAndRecycleAllViews(c0 c0Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c0Var);
            }
        }
    }

    public void removeAndRecycleScrapInt(c0 c0Var) {
        ArrayList arrayList;
        int size = c0Var.f18835a.size();
        int i5 = size - 1;
        while (true) {
            arrayList = c0Var.f18835a;
            if (i5 < 0) {
                break;
            }
            View view = ((m0) arrayList.get(i5)).itemView;
            m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                P p10 = this.mRecyclerView.mItemAnimator;
                if (p10 != null) {
                    p10.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                m0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                c0Var.h(childViewHolderInt2);
            }
            i5--;
        }
        arrayList.clear();
        ArrayList arrayList2 = c0Var.f18836b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, c0 c0Var) {
        removeView(view);
        c0Var.g(view);
    }

    public void removeAndRecycleViewAt(int i5, c0 c0Var) {
        View childAt = getChildAt(i5);
        removeViewAt(i5);
        c0Var.g(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    public void removeView(View view) {
        C1465c c1465c = this.mChildHelper;
        G g9 = c1465c.f18832a;
        int iIndexOfChild = g9.f18766a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            return;
        }
        if (c1465c.f18833b.L(iIndexOfChild)) {
            c1465c.l(view);
        }
        g9.b(iIndexOfChild);
    }

    public void removeViewAt(int i5) {
        if (getChildAt(i5) != null) {
            this.mChildHelper.k(i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r2 = r8.getWidth()
            int r3 = r8.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb6
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lbb
        L80:
            int r1 = r8.getPaddingLeft()
            int r2 = r8.getPaddingTop()
            int r3 = r8.getWidth()
            int r4 = r8.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.mRecyclerView
            android.graphics.Rect r5 = r5.mTempRect
            r8.getDecoratedBoundsWithMargins(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lbb
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lbb
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lbb
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb6
            goto Lbb
        Lb6:
            if (r11 != 0) goto Lbc
            if (r10 == 0) goto Lbb
            goto Lbc
        Lbb:
            return r0
        Lbc:
            if (r12 == 0) goto Lc2
            r9.scrollBy(r11, r10)
            goto Lc5
        Lc2:
            r9.smoothScrollBy(r11, r10)
        Lc5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.V.requestChildRectangleOnScreen(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i5, c0 c0Var, j0 j0Var);

    public abstract void scrollToPosition(int i5);

    public int scrollVerticallyBy(int i5, c0 c0Var, j0 j0Var) {
        return 0;
    }

    @Deprecated
    public void setAutoMeasureEnabled(boolean z2) {
        this.mAutoMeasure = z2;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z2) {
        if (z2 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z2;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.l();
            }
        }
    }

    public void setMeasureSpecs(int i5, int i10) {
        this.mWidth = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i5, int i10) {
        setMeasuredDimension(chooseSize(i5, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i5, int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i5, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.mRecyclerView.mTempRect.set(i14, i12, i11, i13);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i5, i10);
    }

    public void setMeasurementCacheEnabled(boolean z2) {
        this.mMeasurementCacheEnabled = z2;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i5, int i10, W w2) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && b(view.getWidth(), i5, ((ViewGroup.MarginLayoutParams) w2).width) && b(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) w2).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i5, int i10, W w2) {
        return (this.mMeasurementCacheEnabled && b(view.getMeasuredWidth(), i5, ((ViewGroup.MarginLayoutParams) w2).width) && b(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) w2).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, j0 j0Var, int i5);

    public void startSmoothScroll(i0 i0Var) {
        i0 i0Var2 = this.mSmoothScroller;
        if (i0Var2 != null && i0Var != i0Var2 && i0Var2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = i0Var;
        i0Var.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(View view) {
        m0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        i0 i0Var = this.mSmoothScroller;
        if (i0Var != null) {
            i0Var.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void addDisappearingView(View view, int i5) {
        a(view, i5, true);
    }

    public void addView(View view, int i5) {
        a(view, i5, false);
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, c0 c0Var) {
        onDetachedFromWindow(recyclerView);
    }

    public void onInitializeAccessibilityEvent(c0 c0Var, j0 j0Var, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        I i5 = this.mRecyclerView.mAdapter;
        if (i5 != null) {
            accessibilityEvent.setItemCount(i5.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(c0 c0Var, j0 j0Var, C3375e c3375e) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            c3375e.a(Segment.SIZE);
            c3375e.f39862a.setScrollable(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            c3375e.a(4096);
            c3375e.f39862a.setScrollable(true);
        }
        AccessibilityNodeInfo.CollectionInfo collectionInfoObtain = AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(c0Var, j0Var), getColumnCountForAccessibility(c0Var, j0Var), isLayoutHierarchical(c0Var, j0Var), getSelectionModeForAccessibility(c0Var, j0Var));
        c3375e.getClass();
        c3375e.f39862a.setCollectionInfo(collectionInfoObtain);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i5, int i10, Object obj) {
        onItemsUpdated(recyclerView, i5, i10);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, j0 j0Var, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public boolean performAccessibilityAction(c0 c0Var, j0 j0Var, int i5, Bundle bundle) {
        int height;
        int width;
        int i10;
        int i11;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return false;
        }
        if (i5 == 4096) {
            height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                i10 = height;
                i11 = width;
            }
            i10 = height;
            i11 = 0;
        } else if (i5 != 8192) {
            i11 = 0;
            i10 = 0;
        } else {
            height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                i10 = height;
                i11 = width;
            }
            i10 = height;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i11, i10, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(View view, int i5, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i5, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.V.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    public W generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new W(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(c0 c0Var, j0 j0Var, View view, C3375e c3375e) {
    }

    public void setMeasuredDimension(int i5, int i10) {
        this.mRecyclerView.setMeasuredDimension(i5, i10);
    }

    public void attachView(View view, int i5) {
        attachView(view, i5, (W) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z2) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z2, false);
    }
}
