package androidx.recyclerview.widget;

import Va.M6;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import j1.AbstractC3076d;
import j3.AbstractC3078a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k1.C3128o;
import k1.InterfaceC3136x;
import org.apache.tika.utils.StringUtils;
import x.C4429v;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC3136x {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    o0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    I mAdapter;
    C1464b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private L mChildDrawingOrderCallback;
    C1465c mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private M mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC1480s mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private Z mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    P mItemAnimator;
    private N mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<Q> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    V mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final e0 mObserver;
    private List<X> mOnChildAttachStateListeners;
    private Y mOnFlingListener;
    private final ArrayList<Z> mOnItemTouchListeners;
    final List<m0> mPendingAccessibilityImportanceChange;
    f0 mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C1479q mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final c0 mRecycler;
    d0 mRecyclerListener;
    final List<d0> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private OnScrollListener mScrollListener;
    private List<OnScrollListener> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C3128o mScrollingChildHelper;
    final j0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final l0 mViewFlinger;
    private final z0 mViewInfoProcessCallback;
    final A0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class OnScrollListener {
        public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
        }

        public void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new F(0);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(m0 m0Var) {
        View view = m0Var.itemView;
        boolean z2 = view.getParent() == this;
        this.mRecycler.k(getChildViewHolder(view));
        if (m0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        C1465c c1465c = this.mChildHelper;
        int iIndexOfChild = c1465c.f18832a.f18766a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c1465c.f18833b.O(iIndexOfChild);
            c1465c.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(m0 m0Var, m0 m0Var2, O o7, O o10, boolean z2, boolean z10) {
        m0Var.setIsRecyclable(false);
        if (z2) {
            addAnimatingView(m0Var);
        }
        if (m0Var != m0Var2) {
            if (z10) {
                addAnimatingView(m0Var2);
            }
            m0Var.mShadowedHolder = m0Var2;
            addAnimatingView(m0Var);
            this.mRecycler.k(m0Var);
            m0Var2.setIsRecyclable(false);
            m0Var2.mShadowingHolder = m0Var;
        }
        if (this.mItemAnimator.a(m0Var, m0Var2, o7, o10)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(m0 m0Var) {
        WeakReference<RecyclerView> weakReference = m0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == m0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            m0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i5, int i10) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(V.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i5), Integer.valueOf(i10)};
                } catch (NoSuchMethodException e7) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e10) {
                        e10.initCause(e7);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e10);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((V) constructor.newInstance(objArr));
            } catch (ClassCastException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e11);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e12);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e13);
            } catch (InstantiationException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            }
        }
    }

    private boolean didChildRangeChange(int i5, int i10) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i5 && iArr[1] == i10) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i5 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i5 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i5);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        y0 y0Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f18902i = false;
        startInterceptRequestLayout();
        A0 a02 = this.mViewInfoStore;
        a02.f18754a.clear();
        a02.f18755b.b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        j0 j0Var = this.mState;
        j0Var.f18901h = j0Var.f18903j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        j0Var.f18900g = j0Var.k;
        j0Var.f18898e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f18903j) {
            int iE = this.mChildHelper.e();
            for (int i5 = 0; i5 < iE; i5++) {
                m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i5));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    P p10 = this.mItemAnimator;
                    P.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    p10.getClass();
                    O o7 = new O();
                    o7.a(childViewHolderInt);
                    C4429v c4429v = this.mViewInfoStore.f18754a;
                    y0 y0VarA = (y0) c4429v.get(childViewHolderInt);
                    if (y0VarA == null) {
                        y0VarA = y0.a();
                        c4429v.put(childViewHolderInt, y0VarA);
                    }
                    y0VarA.f19042b = o7;
                    y0VarA.f19041a |= 4;
                    if (this.mState.f18901h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f18755b.g(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            j0 j0Var2 = this.mState;
            boolean z2 = j0Var2.f18899f;
            j0Var2.f18899f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, j0Var2);
            this.mState.f18899f = z2;
            for (int i10 = 0; i10 < this.mChildHelper.e(); i10++) {
                m0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt2.shouldIgnore() && ((y0Var = (y0) this.mViewInfoStore.f18754a.get(childViewHolderInt2)) == null || (y0Var.f19041a & 4) == 0)) {
                    P.b(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(Segment.SIZE);
                    P p11 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    p11.getClass();
                    O o10 = new O();
                    o10.a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, o10);
                    } else {
                        C4429v c4429v2 = this.mViewInfoStore.f18754a;
                        y0 y0VarA2 = (y0) c4429v2.get(childViewHolderInt2);
                        if (y0VarA2 == null) {
                            y0VarA2 = y0.a();
                            c4429v2.put(childViewHolderInt2, y0VarA2);
                        }
                        y0VarA2.f19041a |= 2;
                        y0VarA2.f19042b = o10;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f18897d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f18898e = this.mAdapter.getItemCount();
        this.mState.f18896c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f18858c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        j0 j0Var = this.mState;
        j0Var.f18900g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, j0Var);
        j0 j0Var2 = this.mState;
        j0Var2.f18899f = false;
        j0Var2.f18903j = j0Var2.f18903j && this.mItemAnimator != null;
        j0Var2.f18897d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dispatchLayoutStep3() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchLayoutStep3():void");
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        Z z2 = this.mInterceptingOnItemTouchListener;
        if (z2 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        C1478p c1478p = (C1478p) z2;
        if (c1478p.f18954v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean zB = c1478p.b(motionEvent.getX(), motionEvent.getY());
                boolean zA = c1478p.a(motionEvent.getX(), motionEvent.getY());
                if (zB || zA) {
                    if (zA) {
                        c1478p.f18955w = 1;
                        c1478p.f18948p = (int) motionEvent.getX();
                    } else if (zB) {
                        c1478p.f18955w = 2;
                        c1478p.f18945m = (int) motionEvent.getY();
                    }
                    c1478p.d(2);
                }
            } else if (motionEvent.getAction() == 1 && c1478p.f18954v == 2) {
                c1478p.f18945m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                c1478p.f18948p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                c1478p.d(1);
                c1478p.f18955w = 0;
            } else if (motionEvent.getAction() == 2 && c1478p.f18954v == 2) {
                c1478p.e();
                int i5 = c1478p.f18955w;
                int i10 = c1478p.f18935b;
                if (i5 == 1) {
                    float x5 = motionEvent.getX();
                    int[] iArr = c1478p.f18957y;
                    iArr[0] = i10;
                    int i11 = c1478p.f18949q - i10;
                    iArr[1] = i11;
                    float fMax = Math.max(i10, Math.min(i11, x5));
                    if (Math.abs(c1478p.f18947o - fMax) >= 2.0f) {
                        int iC = C1478p.c(c1478p.f18948p, fMax, iArr, c1478p.f18951s.computeHorizontalScrollRange(), c1478p.f18951s.computeHorizontalScrollOffset(), c1478p.f18949q);
                        if (iC != 0) {
                            c1478p.f18951s.scrollBy(iC, 0);
                        }
                        c1478p.f18948p = fMax;
                    }
                }
                if (c1478p.f18955w == 2) {
                    float y10 = motionEvent.getY();
                    int[] iArr2 = c1478p.f18956x;
                    iArr2[0] = i10;
                    int i12 = c1478p.f18950r - i10;
                    iArr2[1] = i12;
                    float fMax2 = Math.max(i10, Math.min(i12, y10));
                    if (Math.abs(c1478p.f18944l - fMax2) >= 2.0f) {
                        int iC2 = C1478p.c(c1478p.f18945m, fMax2, iArr2, c1478p.f18951s.computeVerticalScrollRange(), c1478p.f18951s.computeVerticalScrollOffset(), c1478p.f18950r);
                        if (iC2 != 0) {
                            c1478p.f18951s.scrollBy(0, iC2);
                        }
                        c1478p.f18945m = fMax2;
                    }
                }
            }
        }
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.Z> r1 = r11.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L69
            java.util.ArrayList<androidx.recyclerview.widget.Z> r4 = r11.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.Z r4 = (androidx.recyclerview.widget.Z) r4
            r5 = r4
            androidx.recyclerview.widget.p r5 = (androidx.recyclerview.widget.C1478p) r5
            int r6 = r5.f18954v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L5e
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.b(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.a(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L66
            if (r6 != 0) goto L41
            if (r9 == 0) goto L66
        L41:
            if (r9 == 0) goto L4e
            r5.f18955w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f18948p = r6
            goto L5a
        L4e:
            if (r6 == 0) goto L5a
            r5.f18955w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f18945m = r6
        L5a:
            r5.d(r8)
            goto L60
        L5e:
            if (r6 != r8) goto L66
        L60:
            r5 = 3
            if (r0 == r5) goto L66
            r11.mInterceptingOnItemTouchListener = r4
            return r7
        L66:
            int r3 = r3 + 1
            goto Lc
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findInterceptingOnItemTouchListener(android.view.MotionEvent):boolean");
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i5 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < iE; i11++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i5) {
                    i5 = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i10;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i5));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        m0 m0VarFindViewHolderForAdapterPosition;
        j0 j0Var = this.mState;
        int i5 = j0Var.f18904l;
        if (i5 == -1) {
            i5 = 0;
        }
        int iB = j0Var.b();
        for (int i10 = i5; i10 < iB; i10++) {
            m0 m0VarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
            if (m0VarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (m0VarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return m0VarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i5);
        do {
            iMin--;
            if (iMin < 0 || (m0VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!m0VarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return m0VarFindViewHolderForAdapterPosition.itemView;
    }

    public static m0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((W) view.getLayoutParams()).f18812a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        W w2 = (W) view.getLayoutParams();
        Rect rect2 = w2.f18813b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) w2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) w2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) w2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) w2).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C3128o getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C3128o(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j8, m0 m0Var, m0 m0Var2) {
        int iE = this.mChildHelper.e();
        for (int i5 = 0; i5 < iE; i5++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i5));
            if (childViewHolderInt != m0Var && getChangedHolderKey(childViewHolderInt) == j8) {
                I i10 = this.mAdapter;
                if (i10 == null || !i10.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(m0Var);
                    throw new IllegalStateException(M6.m(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(m0Var);
                throw new IllegalStateException(M6.m(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + m0Var2 + " cannot be found but it is necessary for " + m0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iE = this.mChildHelper.e();
        for (int i5 = 0; i5 < iE; i5++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        WeakHashMap weakHashMap = k1.S.f38779a;
        int i5 = Build.VERSION.SDK_INT;
        if ((i5 >= 26 ? k1.L.a(this) : 0) != 0 || i5 < 26) {
            return;
        }
        k1.L.b(this, 8);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1465c(new G(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i5) {
        int i10;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        int i11 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i12 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i13 = rect2.left;
        if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
            i10 = 1;
        } else {
            int i14 = rect.right;
            int i15 = rect2.right;
            i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            if ((i18 <= i19 && i16 < i19) || i16 <= i17) {
                c10 = 0;
            }
        }
        if (i5 == 1) {
            return c10 < 0 || (c10 == 0 && i10 * i11 < 0);
        }
        if (i5 == 2) {
            return c10 > 0 || (c10 == 0 && i10 * i11 > 0);
        }
        if (i5 == 17) {
            return i10 < 0;
        }
        if (i5 == 33) {
            return c10 < 0;
        }
        if (i5 == 66) {
            return i10 > 0;
        }
        if (i5 == 130) {
            return c10 > 0;
        }
        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
        sb2.append(i5);
        throw new IllegalArgumentException(M6.m(this, sb2));
    }

    private void nestedScrollByInternal(int i5, int i10, MotionEvent motionEvent, int i11) {
        V v2 = this.mLayout;
        if (v2 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = v2.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        startNestedScroll(zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0, i11);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? i5 : 0, zCanScrollVertically ? i10 : 0, this.mReusableIntPair, this.mScrollOffset, i11)) {
            int[] iArr2 = this.mReusableIntPair;
            i5 -= iArr2[0];
            i10 -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? i5 : 0, zCanScrollVertically ? i10 : 0, motionEvent, i11);
        RunnableC1480s runnableC1480s = this.mGapWorker;
        if (runnableC1480s != null && (i5 != 0 || i10 != 0)) {
            runnableC1480s.a(this, i5, i10);
        }
        stopNestedScroll(i11);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i5);
            int x5 = (int) (motionEvent.getX(i5) + 0.5f);
            this.mLastTouchX = x5;
            this.mInitialTouchX = x5;
            int y10 = (int) (motionEvent.getY(i5) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        boolean z10 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C1464b c1464b = this.mAdapterHelper;
            c1464b.k(c1464b.f18825b);
            c1464b.k(c1464b.f18826c);
            c1464b.f18829f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z11 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f18903j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z11 || this.mLayout.mRequestedSimpleAnimations) && (!z2 || this.mAdapter.hasStableIds());
        j0 j0Var = this.mState;
        if (j0Var.f18903j && z11 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z10 = true;
        }
        j0Var.k = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            n1.AbstractC3568b.a(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            n1.AbstractC3568b.a(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            n1.AbstractC3568b.a(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            n1.AbstractC3568b.a(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            java.util.WeakHashMap r7 = k1.S.f38779a
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void recoverFocusFromState() {
        /*
            r6 = this;
            boolean r0 = r6.mPreserveFocusAfterLayout
            if (r0 == 0) goto Lb5
            androidx.recyclerview.widget.I r0 = r6.mAdapter
            if (r0 == 0) goto Lb5
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto Lb5
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto Lb5
            int r0 = r6.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L26
            goto Lb5
        L26:
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L57
            android.view.View r0 = r6.getFocusedChild()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L4c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L4c
        L40:
            androidx.recyclerview.widget.c r0 = r6.mChildHelper
            int r0 = r0.e()
            if (r0 != 0) goto L57
            r6.requestFocus()
            return
        L4c:
            androidx.recyclerview.widget.c r1 = r6.mChildHelper
            java.util.ArrayList r1 = r1.f18834c
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L57
            goto Lb5
        L57:
            androidx.recyclerview.widget.j0 r0 = r6.mState
            long r0 = r0.f18905m
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L73
            androidx.recyclerview.widget.I r0 = r6.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L73
            androidx.recyclerview.widget.j0 r0 = r6.mState
            long r4 = r0.f18905m
            androidx.recyclerview.widget.m0 r0 = r6.findViewHolderForItemId(r4)
            goto L74
        L73:
            r0 = r1
        L74:
            if (r0 == 0) goto L8e
            androidx.recyclerview.widget.c r4 = r6.mChildHelper
            android.view.View r5 = r0.itemView
            java.util.ArrayList r4 = r4.f18834c
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L8e
            android.view.View r4 = r0.itemView
            boolean r4 = r4.hasFocusable()
            if (r4 != 0) goto L8b
            goto L8e
        L8b:
            android.view.View r1 = r0.itemView
            goto L9a
        L8e:
            androidx.recyclerview.widget.c r0 = r6.mChildHelper
            int r0 = r0.e()
            if (r0 <= 0) goto L9a
            android.view.View r1 = r6.findNextViewToFocus()
        L9a:
            if (r1 == 0) goto Lb5
            androidx.recyclerview.widget.j0 r0 = r6.mState
            int r0 = r0.f18906n
            long r4 = (long) r0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto Lb2
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto Lb2
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto Lb2
            r1 = r0
        Lb2:
            r1.requestFocus()
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.recoverFocusFromState():void");
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = k1.S.f38779a;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof W) {
            W w2 = (W) layoutParams;
            if (!w2.f18814c) {
                Rect rect = this.mTempRect;
                int i5 = rect.left;
                Rect rect2 = w2.f18813b;
                rect.left = i5 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        j0 j0Var = this.mState;
        j0Var.f18905m = -1L;
        j0Var.f18904l = -1;
        j0Var.f18906n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        m0 m0VarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (m0VarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f18905m = this.mAdapter.hasStableIds() ? m0VarFindContainingViewHolder.getItemId() : -1L;
        this.mState.f18904l = this.mDataSetHasChangedAfterLayout ? -1 : m0VarFindContainingViewHolder.isRemoved() ? m0VarFindContainingViewHolder.mOldPosition : m0VarFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f18906n = getDeepestFocusedViewWithId(m0VarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(I i5, boolean z2, boolean z10) {
        I i10 = this.mAdapter;
        if (i10 != null) {
            i10.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z10) {
            removeAndRecycleViews();
        }
        C1464b c1464b = this.mAdapterHelper;
        c1464b.k(c1464b.f18825b);
        c1464b.k(c1464b.f18826c);
        int i11 = 0;
        c1464b.f18829f = 0;
        I i12 = this.mAdapter;
        this.mAdapter = i5;
        if (i5 != null) {
            i5.registerAdapterDataObserver(this.mObserver);
            i5.onAttachedToRecyclerView(this);
        }
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.onAdapterChanged(i12, this.mAdapter);
        }
        c0 c0Var = this.mRecycler;
        I i13 = this.mAdapter;
        c0Var.f18835a.clear();
        c0Var.e();
        b0 b0VarC = c0Var.c();
        if (i12 != null) {
            b0VarC.f18831b--;
        }
        if (!z2 && b0VarC.f18831b == 0) {
            while (true) {
                SparseArray sparseArray = b0VarC.f18830a;
                if (i11 >= sparseArray.size()) {
                    break;
                }
                ((C1463a0) sparseArray.valueAt(i11)).f18820a.clear();
                i11++;
            }
        }
        if (i13 != null) {
            b0VarC.f18831b++;
        } else {
            b0VarC.getClass();
        }
        this.mState.f18899f = true;
    }

    private void stopScrollersInternal() {
        l0 l0Var = this.mViewFlinger;
        l0Var.f18919g.removeCallbacks(l0Var);
        l0Var.f18915c.abortAnimation();
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i5, int i10) {
        if (i5 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i5);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i5 == 0 && i10 == 0) {
            return;
        }
        WeakHashMap weakHashMap = k1.S.f38779a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i10) {
        V v2 = this.mLayout;
        if (v2 == null || !v2.onAddFocusables(this, arrayList, i5, i10)) {
            super.addFocusables(arrayList, i5, i10);
        }
    }

    public void addItemDecoration(Q q4, int i5) {
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i5 < 0) {
            this.mItemDecorations.add(q4);
        } else {
            this.mItemDecorations.add(i5, q4);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(X x5) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(x5);
    }

    public void addOnItemTouchListener(Z z2) {
        this.mOnItemTouchListeners.add(z2);
    }

    public void addOnScrollListener(OnScrollListener onScrollListener) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(onScrollListener);
    }

    public void addRecyclerListener(d0 d0Var) {
        AbstractC3076d.a("'listener' arg cannot be null.", d0Var != null);
        this.mRecyclerListeners.add(d0Var);
    }

    public void animateAppearance(m0 m0Var, O o7, O o10) {
        boolean zG;
        int i5;
        int i10;
        m0Var.setIsRecyclable(false);
        C1472j c1472j = (C1472j) this.mItemAnimator;
        c1472j.getClass();
        if (o7 == null || ((i5 = o7.f18777a) == (i10 = o10.f18777a) && o7.f18778b == o10.f18778b)) {
            c1472j.l(m0Var);
            m0Var.itemView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c1472j.f18885i.add(m0Var);
            zG = true;
        } else {
            zG = c1472j.g(m0Var, i5, o7.f18778b, i10, o10.f18778b);
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(m0 m0Var, O o7, O o10) {
        boolean zG;
        addAnimatingView(m0Var);
        m0Var.setIsRecyclable(false);
        C1472j c1472j = (C1472j) this.mItemAnimator;
        c1472j.getClass();
        int i5 = o7.f18777a;
        int i10 = o7.f18778b;
        View view = m0Var.itemView;
        int left = o10 == null ? view.getLeft() : o10.f18777a;
        int top = o10 == null ? view.getTop() : o10.f18778b;
        if (m0Var.isRemoved() || (i5 == left && i10 == top)) {
            c1472j.l(m0Var);
            c1472j.f18884h.add(m0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c1472j.g(m0Var, i5, i10, left, top);
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(M6.m(this, N0.a.j(str)));
        }
        throw new IllegalStateException(M6.m(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(M6.m(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(M6.m(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(m0 m0Var) {
        P p10 = this.mItemAnimator;
        if (p10 != null) {
            return (m0Var.getUnmodifiedPayloads().isEmpty() && ((C1472j) p10).f18883g && !m0Var.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof W) && this.mLayout.checkLayoutParams((W) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i5 = 0; i5 < iH; i5++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        c0 c0Var = this.mRecycler;
        ArrayList arrayList = c0Var.f18837c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m0) arrayList.get(i10)).clearOldPosition();
        }
        ArrayList arrayList2 = c0Var.f18835a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((m0) arrayList2.get(i11)).clearOldPosition();
        }
        ArrayList arrayList3 = c0Var.f18836b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((m0) c0Var.f18836b.get(i12)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<X> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        V v2 = this.mLayout;
        if (v2 != null && v2.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        V v2 = this.mLayout;
        if (v2 != null && v2.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        V v2 = this.mLayout;
        if (v2 != null && v2.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        V v2 = this.mLayout;
        if (v2 != null && v2.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        V v2 = this.mLayout;
        if (v2 != null && v2.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        V v2 = this.mLayout;
        if (v2 != null && v2.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i5, int i10) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i5 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i5 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = k1.S.f38779a;
            postInvalidateOnAnimation();
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i5 = g1.h.f35502a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            C1464b c1464b = this.mAdapterHelper;
            int i10 = c1464b.f18829f;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (c1464b.g()) {
                    int i11 = g1.h.f35502a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i12 = g1.h.f35502a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i5, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = k1.S.f38779a;
        setMeasuredDimension(V.chooseSize(i5, paddingRight, getMinimumWidth()), V.chooseSize(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        int size;
        m0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        I i5 = this.mAdapter;
        if (i5 != null && childViewHolderInt != null) {
            i5.onViewAttachedToWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners == null || r2.size() - 1 < 0) {
            return;
        }
        this.mOnChildAttachStateListeners.get(size).getClass();
        throw new ClassCastException();
    }

    public void dispatchChildDetached(View view) {
        int size;
        m0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        I i5 = this.mAdapter;
        if (i5 != null && childViewHolderInt != null) {
            i5.onViewDetachedFromWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners == null || r2.size() - 1 < 0) {
            return;
        }
        this.mOnChildAttachStateListeners.get(size).getClass();
        throw new ClassCastException();
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f18902i = false;
        boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f18897d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            C1464b c1464b = this.mAdapterHelper;
            if ((c1464b.f18826c.isEmpty() || c1464b.f18825b.isEmpty()) && !z2 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z2) {
        return getScrollingChildHelper().a(f10, f11, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i5, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i5, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i5, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i5) {
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.onScrollStateChanged(i5);
        }
        onScrollStateChanged(i5);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(this, i5);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i5);
            }
        }
    }

    public void dispatchOnScrolled(int i5, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i5, scrollY - i10);
        onScrolled(i5, i10);
        OnScrollListener onScrollListener = this.mScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrolled(this, i5, i10);
        }
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i5, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i5;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            m0 m0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (m0Var.itemView.getParent() == this && !m0Var.shouldIgnore() && (i5 = m0Var.mPendingAccessibilityState) != -1) {
                View view = m0Var.itemView;
                WeakHashMap weakHashMap = k1.S.f38779a;
                view.setImportantForAccessibility(i5);
                m0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z10 = false;
        for (int i5 = 0; i5 < size; i5++) {
            this.mItemDecorations.get(i5).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z2 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z2 : true) {
            WeakHashMap weakHashMap = k1.S.f38779a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j8) {
        return super.drawChild(canvas, view, j8);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        this.mEdgeEffectFactory.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return StringUtils.SPACE + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(j0 j0Var) {
        if (getScrollState() != 2) {
            j0Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f18915c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        j0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
            View viewD = this.mChildHelper.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f10 >= viewD.getLeft() + translationX && f10 <= viewD.getRight() + translationX && f11 >= viewD.getTop() + translationY && f11 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public m0 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public m0 findViewHolderForAdapterPosition(int i5) {
        m0 m0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i10 = 0; i10 < iH; i10++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i5) {
                C1465c c1465c = this.mChildHelper;
                if (!c1465c.f18834c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                m0Var = childViewHolderInt;
            }
        }
        return m0Var;
    }

    public m0 findViewHolderForItemId(long j8) {
        I i5 = this.mAdapter;
        m0 m0Var = null;
        if (i5 != null && i5.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i10 = 0; i10 < iH; i10++) {
                m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j8) {
                    C1465c c1465c = this.mChildHelper;
                    if (!c1465c.f18834c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    m0Var = childViewHolderInt;
                }
            }
        }
        return m0Var;
    }

    public m0 findViewHolderForLayoutPosition(int i5) {
        return findViewHolderForPosition(i5, false);
    }

    @Deprecated
    public m0 findViewHolderForPosition(int i5) {
        return findViewHolderForPosition(i5, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public boolean fling(int i5, int i10) {
        V v2 = this.mLayout;
        if (v2 == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = v2.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i11 = (iCanScrollHorizontally == 0 || Math.abs(i5) < this.mMinFlingVelocity) ? 0 : i5;
        int i12 = (!zCanScrollVertically || Math.abs(i10) < this.mMinFlingVelocity) ? 0 : i10;
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        float f10 = i11;
        float f11 = i12;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z2 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f10, f11, z2);
            Y y10 = this.mOnFlingListener;
            if (y10 != null && y10.onFling(i11, i12)) {
                return true;
            }
            if (z2) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i13 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i13, Math.min(i11, i13));
                int i14 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i14, Math.min(i12, i14));
                l0 l0Var = this.mViewFlinger;
                RecyclerView recyclerView = l0Var.f18919g;
                recyclerView.setScrollState(2);
                l0Var.f18914b = 0;
                l0Var.f18913a = 0;
                Interpolator interpolator = l0Var.f18916d;
                Interpolator interpolator2 = sQuinticInterpolator;
                if (interpolator != interpolator2) {
                    l0Var.f18916d = interpolator2;
                    l0Var.f18915c = new OverScroller(recyclerView.getContext(), interpolator2);
                }
                l0Var.f18915c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                l0Var.a();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        V v2 = this.mLayout;
        if (v2 != null) {
            return v2.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(M6.m(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        V v2 = this.mLayout;
        if (v2 != null) {
            return v2.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(M6.m(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public I getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(m0 m0Var) {
        if (m0Var.hasAnyOfTheFlags(524) || !m0Var.isBound()) {
            return -1;
        }
        C1464b c1464b = this.mAdapterHelper;
        int i5 = m0Var.mPosition;
        ArrayList arrayList = c1464b.f18825b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1462a c1462a = (C1462a) arrayList.get(i10);
            int i11 = c1462a.f18816a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = c1462a.f18817b;
                    if (i12 <= i5) {
                        int i13 = c1462a.f18819d;
                        if (i12 + i13 > i5) {
                            return -1;
                        }
                        i5 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = c1462a.f18817b;
                    if (i14 == i5) {
                        i5 = c1462a.f18819d;
                    } else {
                        if (i14 < i5) {
                            i5--;
                        }
                        if (c1462a.f18819d <= i5) {
                            i5++;
                        }
                    }
                }
            } else if (c1462a.f18817b <= i5) {
                i5 += c1462a.f18819d;
            }
        }
        return i5;
    }

    @Override // android.view.View
    public int getBaseline() {
        V v2 = this.mLayout;
        return v2 != null ? v2.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(m0 m0Var) {
        return this.mAdapter.hasStableIds() ? m0Var.getItemId() : m0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        m0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i5, int i10) {
        return super.getChildDrawingOrder(i5, i10);
    }

    public long getChildItemId(View view) {
        m0 childViewHolderInt;
        I i5 = this.mAdapter;
        if (i5 == null || !i5.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        m0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public m0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public o0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public M getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public P getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        W w2 = (W) view.getLayoutParams();
        boolean z2 = w2.f18814c;
        Rect rect = w2.f18813b;
        if (!z2 || (this.mState.f18900g && (w2.f18812a.isUpdated() || w2.f18812a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i5).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i10 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        w2.f18814c = false;
        return rect;
    }

    public Q getItemDecorationAt(int i5) {
        int itemDecorationCount = getItemDecorationCount();
        if (i5 >= 0 && i5 < itemDecorationCount) {
            return this.mItemDecorations.get(i5);
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public V getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public Y getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public b0 getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1464b(new G(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(M6.m(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C1478p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.wynauto.wyn.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.wynauto.wyn.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.wynauto.wyn.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        P p10 = this.mItemAnimator;
        return p10 != null && p10.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f38863d;
    }

    public void jumpToPositionForSmoothScroller(int i5) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i5);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i5 = 0; i5 < iH; i5++) {
            ((W) this.mChildHelper.g(i5).getLayoutParams()).f18814c = true;
        }
        ArrayList arrayList = this.mRecycler.f18837c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            W w2 = (W) ((m0) arrayList.get(i10)).itemView.getLayoutParams();
            if (w2 != null) {
                w2.f18814c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i5 = 0; i5 < iH; i5++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        c0 c0Var = this.mRecycler;
        ArrayList arrayList = c0Var.f18837c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m0 m0Var = (m0) arrayList.get(i10);
            if (m0Var != null) {
                m0Var.addFlags(6);
                m0Var.addChangePayload(null);
            }
        }
        I i11 = c0Var.f18842h.mAdapter;
        if (i11 == null || !i11.hasStableIds()) {
            c0Var.e();
        }
    }

    public void nestedScrollBy(int i5, int i10) {
        nestedScrollByInternal(i5, i10, null, 1);
    }

    public void offsetChildrenHorizontal(int i5) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            this.mChildHelper.d(i10).offsetLeftAndRight(i5);
        }
    }

    public void offsetChildrenVertical(int i5) {
        int iE = this.mChildHelper.e();
        for (int i10 = 0; i10 < iE; i10++) {
            this.mChildHelper.d(i10).offsetTopAndBottom(i5);
        }
    }

    public void offsetPositionRecordsForInsert(int i5, int i10) {
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i5) {
                childViewHolderInt.offsetPosition(i10, false);
                this.mState.f18899f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f18837c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            m0 m0Var = (m0) arrayList.get(i12);
            if (m0Var != null && m0Var.mPosition >= i5) {
                m0Var.offsetPosition(i10, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iH = this.mChildHelper.h();
        int i18 = -1;
        if (i5 < i10) {
            i12 = i5;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i5;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < iH; i19++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i19));
            if (childViewHolderInt != null && (i17 = childViewHolderInt.mPosition) >= i12 && i17 <= i11) {
                if (i17 == i5) {
                    childViewHolderInt.offsetPosition(i10 - i5, false);
                } else {
                    childViewHolderInt.offsetPosition(i13, false);
                }
                this.mState.f18899f = true;
            }
        }
        c0 c0Var = this.mRecycler;
        c0Var.getClass();
        if (i5 < i10) {
            i15 = i5;
            i14 = i10;
        } else {
            i14 = i5;
            i18 = 1;
            i15 = i10;
        }
        ArrayList arrayList = c0Var.f18837c;
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            m0 m0Var = (m0) arrayList.get(i20);
            if (m0Var != null && (i16 = m0Var.mPosition) >= i15 && i16 <= i14) {
                if (i16 == i5) {
                    m0Var.offsetPosition(i10 - i5, false);
                } else {
                    m0Var.offsetPosition(i18, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i5, int i10, boolean z2) {
        int i11 = i5 + i10;
        int iH = this.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i13 = childViewHolderInt.mPosition;
                if (i13 >= i11) {
                    childViewHolderInt.offsetPosition(-i10, z2);
                    this.mState.f18899f = true;
                } else if (i13 >= i5) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i5 - 1, -i10, z2);
                    this.mState.f18899f = true;
                }
            }
        }
        c0 c0Var = this.mRecycler;
        ArrayList arrayList = c0Var.f18837c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m0 m0Var = (m0) arrayList.get(size);
            if (m0Var != null) {
                int i14 = m0Var.mPosition;
                if (i14 >= i11) {
                    m0Var.offsetPosition(-i10, z2);
                } else if (i14 >= i5) {
                    m0Var.addFlags(8);
                    c0Var.f(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.V r1 = r5.mLayout
            if (r1 == 0) goto L1e
            r1.dispatchAttachedToWindow(r5)
        L1e:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L73
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC1480s.f18977e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.s r1 = (androidx.recyclerview.widget.RunnableC1480s) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L6c
            androidx.recyclerview.widget.s r1 = new androidx.recyclerview.widget.s
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f18979a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f18982d = r2
            r5.mGapWorker = r1
            java.util.WeakHashMap r1 = k1.S.f38779a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5e
            if (r1 == 0) goto L5e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5e
            goto L60
        L5e:
            r1 = 1114636288(0x42700000, float:60.0)
        L60:
            androidx.recyclerview.widget.s r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f18981c = r3
            r0.set(r2)
        L6c:
            androidx.recyclerview.widget.s r0 = r5.mGapWorker
            java.util.ArrayList r0 = r0.f18979a
            r0.add(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC1480s runnableC1480s;
        super.onDetachedFromWindow();
        P p10 = this.mItemAnimator;
        if (p10 != null) {
            p10.e();
        }
        stopScroll();
        this.mIsAttached = false;
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (y0.f19040d.a() != null) {
        }
        if (!ALLOW_THREAD_GAP_WORK || (runnableC1480s = this.mGapWorker) == null) {
            return;
        }
        runnableC1480s.f18979a.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mItemDecorations.get(i5).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.V r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.V r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.V r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.V r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.V r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        V v2 = this.mLayout;
        if (v2 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = v2.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x5;
            this.mInitialTouchX = x5;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i5 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i5 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i5, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i10 = x10 - this.mInitialTouchX;
                int i11 = y11 - this.mInitialTouchY;
                if (zCanScrollHorizontally == 0 || Math.abs(i10) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x10;
                    z2 = true;
                }
                if (zCanScrollVertically && Math.abs(i11) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        int i13 = g1.h.f35502a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        V v2 = this.mLayout;
        if (v2 == null) {
            defaultOnMeasure(i5, i10);
            return;
        }
        boolean z2 = false;
        if (v2.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f18897d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i5, i10);
            this.mState.f18902i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i5, i10);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f18902i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i5, i10);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            j0 j0Var = this.mState;
            if (j0Var.k) {
                j0Var.f18900g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f18900g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        I i11 = this.mAdapter;
        if (i11 != null) {
            this.mState.f18898e = i11.getItemCount();
        } else {
            this.mState.f18898e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i5, i10);
        stopInterceptRequestLayout(false);
        this.mState.f18900g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i5, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i5, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f0 f0Var = (f0) parcelable;
        this.mPendingSavedState = f0Var;
        super.onRestoreInstanceState(f0Var.f44826a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f0 f0Var = new f0(super.onSaveInstanceState());
        f0 f0Var2 = this.mPendingSavedState;
        if (f0Var2 != null) {
            f0Var.f18858c = f0Var2.f18858c;
            return f0Var;
        }
        V v2 = this.mLayout;
        if (v2 != null) {
            f0Var.f18858c = v2.onSaveInstanceState();
            return f0Var;
        }
        f0Var.f18858c = null;
        return f0Var;
    }

    public void onScrollStateChanged(int i5) {
    }

    public void onScrolled(int i5, int i10) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 == i11 && i10 == i12) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[PHI: r1
  0x00dc: PHI (r1v45 int) = (r1v26 int), (r1v49 int) binds: [B:41:0x00c5, B:45:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = k1.S.f38779a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(m0 m0Var, O o7) {
        m0Var.setFlags(0, Segment.SIZE);
        if (this.mState.f18901h && m0Var.isUpdated() && !m0Var.isRemoved() && !m0Var.shouldIgnore()) {
            this.mViewInfoStore.f18755b.g(getChangedHolderKey(m0Var), m0Var);
        }
        C4429v c4429v = this.mViewInfoStore.f18754a;
        y0 y0VarA = (y0) c4429v.get(m0Var);
        if (y0VarA == null) {
            y0VarA = y0.a();
            c4429v.put(m0Var, y0VarA);
        }
        y0VarA.f19042b = o7;
        y0VarA.f19041a |= 4;
    }

    public void removeAndRecycleViews() {
        P p10 = this.mItemAnimator;
        if (p10 != null) {
            p10.e();
        }
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        c0 c0Var = this.mRecycler;
        c0Var.f18835a.clear();
        c0Var.e();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C1465c c1465c = this.mChildHelper;
        G g9 = c1465c.f18832a;
        int iIndexOfChild = g9.f18766a.indexOfChild(view);
        boolean z2 = true;
        if (iIndexOfChild == -1) {
            c1465c.l(view);
        } else {
            A2.d dVar = c1465c.f18833b;
            if (dVar.J(iIndexOfChild)) {
                dVar.L(iIndexOfChild);
                c1465c.l(view);
                g9.b(iIndexOfChild);
            } else {
                z2 = false;
            }
        }
        if (z2) {
            m0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.k(childViewHolderInt);
            this.mRecycler.h(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        m0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(M6.m(this, sb2));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(Q q4) {
        V v2 = this.mLayout;
        if (v2 != null) {
            v2.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(q4);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i5) {
        int itemDecorationCount = getItemDecorationCount();
        if (i5 >= 0 && i5 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i5));
            return;
        }
        throw new IndexOutOfBoundsException(i5 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(X x5) {
        List<X> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(x5);
    }

    public void removeOnItemTouchListener(Z z2) {
        this.mOnItemTouchListeners.remove(z2);
        if (this.mInterceptingOnItemTouchListener == z2) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(OnScrollListener onScrollListener) {
        List<OnScrollListener> list = this.mScrollListeners;
        if (list != null) {
            list.remove(onScrollListener);
        }
    }

    public void removeRecyclerListener(d0 d0Var) {
        this.mRecyclerListeners.remove(d0Var);
    }

    public void repositionShadowingViews() {
        m0 m0Var;
        int iE = this.mChildHelper.e();
        for (int i5 = 0; i5 < iE; i5++) {
            View viewD = this.mChildHelper.d(i5);
            m0 childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (m0Var = childViewHolder.mShadowingHolder) != null) {
                View view = m0Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mOnItemTouchListeners.get(i5).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i5 = 0; i5 < iH; i5++) {
            m0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i5, int i10) {
        V v2 = this.mLayout;
        if (v2 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = v2.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i5 = 0;
            }
            if (!zCanScrollVertically) {
                i10 = 0;
            }
            scrollByInternal(i5, i10, null, 0);
        }
    }

    public boolean scrollByInternal(int i5, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i5, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i14 = i5 - i16;
            i15 = i10 - i17;
            i13 = i17;
            i12 = i16;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i12, i13, i14, i15, this.mScrollOffset, i11, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        boolean z2 = (i18 == 0 && i20 == 0) ? false : true;
        int i22 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i23 = iArr5[0];
        this.mLastTouchX = i22 - i23;
        int i24 = this.mLastTouchY;
        int i25 = iArr5[1];
        this.mLastTouchY = i24 - i25;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i19, motionEvent.getY(), i21);
            }
            considerReleasingGlowsOnScroll(i5, i10);
        }
        if (i12 != 0 || i13 != 0) {
            dispatchOnScrolled(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i12 == 0 && i13 == 0) ? false : true;
    }

    public void scrollStep(int i5, int i10, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i11 = g1.h.f35502a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i5 != 0 ? this.mLayout.scrollHorizontallyBy(i5, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i10 != 0 ? this.mLayout.scrollVerticallyBy(i10, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i5, int i10) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i5) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        V v2 = this.mLayout;
        if (v2 == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            v2.scrollToPosition(i5);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(o0 o0Var) {
        this.mAccessibilityDelegate = o0Var;
        k1.S.m(this, o0Var);
    }

    public void setAdapter(I i5) {
        setLayoutFrozen(false);
        setAdapterInternal(i5, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(L l10) {
        if (l10 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(m0 m0Var, int i5) {
        if (isComputingLayout()) {
            m0Var.mPendingAccessibilityState = i5;
            this.mPendingAccessibilityImportanceChange.add(m0Var);
            return false;
        }
        View view = m0Var.itemView;
        WeakHashMap weakHashMap = k1.S.f38779a;
        view.setImportantForAccessibility(i5);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(M m10) {
        m10.getClass();
        this.mEdgeEffectFactory = m10;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(P p10) {
        P p11 = this.mItemAnimator;
        if (p11 != null) {
            p11.e();
            this.mItemAnimator.f18779a = null;
        }
        this.mItemAnimator = p10;
        if (p10 != null) {
            p10.f18779a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i5) {
        c0 c0Var = this.mRecycler;
        c0Var.f18839e = i5;
        c0Var.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(V v2) {
        RecyclerView recyclerView;
        if (v2 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            P p10 = this.mItemAnimator;
            if (p10 != null) {
                p10.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            c0 c0Var = this.mRecycler;
            c0Var.f18835a.clear();
            c0Var.e();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            c0 c0Var2 = this.mRecycler;
            c0Var2.f18835a.clear();
            c0Var2.e();
        }
        C1465c c1465c = this.mChildHelper;
        c1465c.f18833b.M();
        ArrayList arrayList = c1465c.f18834c;
        int size = arrayList.size();
        while (true) {
            size--;
            recyclerView = c1465c.f18832a.f18766a;
            if (size < 0) {
                break;
            }
            m0 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = v2;
        if (v2 != null) {
            if (v2.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(v2);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(M6.m(v2.mRecyclerView, sb2));
            }
            v2.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C3128o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f38863d) {
            WeakHashMap weakHashMap = k1.S.f38779a;
            k1.J.n(scrollingChildHelper.f38862c);
        }
        scrollingChildHelper.f38863d = z2;
    }

    public void setOnFlingListener(Y y10) {
        this.mOnFlingListener = y10;
    }

    @Deprecated
    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.mScrollListener = onScrollListener;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(b0 b0Var) {
        c0 c0Var = this.mRecycler;
        if (c0Var.f18841g != null) {
            r1.f18831b--;
        }
        c0Var.f18841g = b0Var;
        if (b0Var == null || c0Var.f18842h.getAdapter() == null) {
            return;
        }
        c0Var.f18841g.f18831b++;
    }

    @Deprecated
    public void setRecyclerListener(d0 d0Var) {
    }

    public void setScrollState(int i5) {
        if (i5 == this.mScrollState) {
            return;
        }
        this.mScrollState = i5;
        if (i5 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i5);
    }

    public void setScrollingTouchSlop(int i5) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i5 != 0) {
            if (i5 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i5 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(k0 k0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i5, int i10) {
        smoothScrollBy(i5, i10, null);
    }

    public void smoothScrollToPosition(int i5) {
        if (this.mLayoutSuppressed) {
            return;
        }
        V v2 = this.mLayout;
        if (v2 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            v2.smoothScrollToPosition(this, this.mState, i5);
        }
    }

    public void startInterceptRequestLayout() {
        int i5 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i5;
        if (i5 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i5) {
        return getScrollingChildHelper().g(i5, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(I i5, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(i5, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i5, int i10, Object obj) {
        int i11;
        int i12;
        int iH = this.mChildHelper.h();
        int i13 = i10 + i5;
        for (int i14 = 0; i14 < iH; i14++) {
            View viewG = this.mChildHelper.g(i14);
            m0 childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i5 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((W) viewG.getLayoutParams()).f18814c = true;
            }
        }
        c0 c0Var = this.mRecycler;
        ArrayList arrayList = c0Var.f18837c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m0 m0Var = (m0) arrayList.get(size);
            if (m0Var != null && (i11 = m0Var.mPosition) >= i5 && i11 < i13) {
                m0Var.addFlags(2);
                c0Var.f(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.wynauto.wyn.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.m0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.c r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3c
            androidx.recyclerview.widget.c r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.m0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L39
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L39
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L39
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L39
        L2a:
            androidx.recyclerview.widget.c r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            java.util.ArrayList r1 = r1.f18834c
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L38
            r1 = r3
            goto L39
        L38:
            return r3
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.m0");
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i5 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i5;
        if (i5 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i5, int i10, Interpolator interpolator) {
        smoothScrollBy(i5, i10, interpolator, Integer.MIN_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i5) throws NoSuchMethodException, SecurityException {
        float fA;
        float fA2;
        super(context, attributeSet, i5);
        int i10 = 1;
        this.mObserver = new e0(this);
        this.mRecycler = new c0(this);
        this.mViewInfoStore = new A0();
        this.mUpdateChildViewsRunnable = new E(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new M();
        C1472j c1472j = new C1472j();
        c1472j.f18779a = null;
        c1472j.f18780b = new ArrayList();
        c1472j.f18781c = 120L;
        c1472j.f18782d = 120L;
        c1472j.f18783e = 250L;
        c1472j.f18784f = 250L;
        c1472j.f18883g = true;
        c1472j.f18884h = new ArrayList();
        c1472j.f18885i = new ArrayList();
        c1472j.f18886j = new ArrayList();
        c1472j.k = new ArrayList();
        c1472j.f18887l = new ArrayList();
        c1472j.f18888m = new ArrayList();
        c1472j.f18889n = new ArrayList();
        c1472j.f18890o = new ArrayList();
        c1472j.f18891p = new ArrayList();
        c1472j.f18892q = new ArrayList();
        c1472j.f18893r = new ArrayList();
        this.mItemAnimator = c1472j;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new l0(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1479q() : null;
        j0 j0Var = new j0();
        j0Var.f18894a = -1;
        j0Var.f18895b = 0;
        j0Var.f18896c = 0;
        j0Var.f18897d = 1;
        j0Var.f18898e = 0;
        j0Var.f18899f = false;
        j0Var.f18900g = false;
        j0Var.f18901h = false;
        j0Var.f18902i = false;
        j0Var.f18903j = false;
        j0Var.k = false;
        this.mState = j0Var;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new G(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new E(this, i10);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new G(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = k1.T.f38785a;
            fA = Y0.b.c(viewConfiguration);
        } else {
            fA = k1.T.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fA;
        if (i11 >= 26) {
            fA2 = Y0.b.d(viewConfiguration);
        } else {
            fA2 = k1.T.a(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = fA2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f18779a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap weakHashMap = k1.S.f38779a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new o0(this));
        int[] iArr = AbstractC3078a.f38628a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        k1.S.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i5);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i5, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        k1.S.l(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i5);
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
    }

    public boolean dispatchNestedPreScroll(int i5, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i5, i10, iArr, iArr2, i11);
    }

    public boolean dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr, int i13) {
        return getScrollingChildHelper().d(i5, i10, i11, i12, iArr, i13, null);
    }

    public boolean hasNestedScrollingParent(int i5) {
        return getScrollingChildHelper().f(i5);
    }

    public void smoothScrollBy(int i5, int i10, Interpolator interpolator, int i11) {
        smoothScrollBy(i5, i10, interpolator, i11, false);
    }

    public boolean startNestedScroll(int i5, int i10) {
        return getScrollingChildHelper().g(i5, i10);
    }

    public void stopNestedScroll(int i5) {
        getScrollingChildHelper().h(i5);
    }

    public void smoothScrollBy(int i5, int i10, Interpolator interpolator, int i11, boolean z2) {
        V v2 = this.mLayout;
        if (v2 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!v2.canScrollHorizontally()) {
            i5 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i10 = 0;
        }
        if (i5 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i5, i10);
            return;
        }
        if (z2) {
            int i12 = i5 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.b(i5, i10, interpolator, i11);
    }

    public final void dispatchNestedScroll(int i5, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i5, i10, i11, i12, iArr, i13, iArr2);
    }

    public void addItemDecoration(Q q4) {
        addItemDecoration(q4, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        V v2 = this.mLayout;
        if (v2 != null) {
            return v2.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(M6.m(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
