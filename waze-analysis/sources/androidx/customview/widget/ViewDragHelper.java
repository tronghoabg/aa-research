package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    private static final boolean DEBUG = false;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private final Callback mCallback;
    private View mCapturedView;
    private final int mDefaultEdgeSize;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private Interpolator mInterpolator;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private final float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private final OverScroller mScroller;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    private int mActivePointerId = -1;
    private final Runnable mSetIdleRunnable = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };

    /* compiled from: WazeSource */
    public abstract class Callback {
        public int clampViewPositionHorizontal(View view, int i2, int i3) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i2, int i3) {
            return 0;
        }

        public int getOrderedChildIndex(int i2) {
            return i2;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i2, int i3) {
        }

        public boolean onEdgeLock(int i2) {
            return false;
        }

        public void onEdgeTouched(int i2, int i3) {
        }

        public void onViewCaptured(View view, int i2) {
        }

        public void onViewDragStateChanged(int i2) {
        }

        public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
        }

        public void onViewReleased(View view, float f2, float f3) {
        }

        public abstract boolean tryCaptureView(View view, int i2);
    }

    private ViewDragHelper(Context context, ViewGroup viewGroup, Callback callback) {
        requireNonNull(viewGroup, "Parent view may not be null");
        requireNonNull(callback, "Callback may not be null");
        this.mParentView = viewGroup;
        this.mCallback = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.mDefaultEdgeSize = i2;
        this.mEdgeSize = i2;
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mInterpolator = sInterpolator;
        this.mScroller = new OverScroller(context, new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.3
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f2) {
                return ViewDragHelper.this.mInterpolator.getInterpolation(f2);
            }
        });
    }

    private boolean checkNewEdgeDrag(float f2, float f3, int i2, int i3) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        if ((this.mInitialEdgesTouched[i2] & i3) == i3 && (this.mTrackingEdges & i3) != 0 && (this.mEdgeDragsLocked[i2] & i3) != i3 && (this.mEdgeDragsInProgress[i2] & i3) != i3) {
            float f4 = this.mTouchSlop;
            if (fAbs > f4 || fAbs2 > f4) {
                if (fAbs < fAbs2 * 0.5f && this.mCallback.onEdgeLock(i3)) {
                    int[] iArr = this.mEdgeDragsLocked;
                    iArr[i2] = iArr[i2] | i3;
                    return false;
                }
                if ((this.mEdgeDragsInProgress[i2] & i3) == 0 && fAbs > this.mTouchSlop) {
                    return true;
                }
            }
        }
        return false;
    }

    private float clampMag(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private void clearMotionHistory(int i2) {
        if (this.mInitialMotionX == null || !isPointerDown(i2)) {
            return;
        }
        this.mInitialMotionX[i2] = 0.0f;
        this.mInitialMotionY[i2] = 0.0f;
        this.mLastMotionX[i2] = 0.0f;
        this.mLastMotionY[i2] = 0.0f;
        this.mInitialEdgesTouched[i2] = 0;
        this.mEdgeDragsInProgress[i2] = 0;
        this.mEdgeDragsLocked[i2] = 0;
        this.mPointersDown = (~(1 << i2)) & this.mPointersDown;
    }

    private int computeAxisDuration(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        float f2 = width / 2;
        float fDistanceInfluenceForSnapDuration = distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(i2) / width)) * f2;
        int iAbs = Math.abs(i3);
        return Math.min(iAbs > 0 ? Math.round(Math.abs((f2 + fDistanceInfluenceForSnapDuration) / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    private int computeSettleDuration(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        int iClampMag = clampMag(i4, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int iClampMag2 = clampMag(i5, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int iAbs = Math.abs(i2);
        int iAbs2 = Math.abs(i3);
        int iAbs3 = Math.abs(iClampMag);
        int iAbs4 = Math.abs(iClampMag2);
        int i6 = iAbs3 + iAbs4;
        int i7 = iAbs + iAbs2;
        if (iClampMag != 0) {
            f2 = iAbs3 / i6;
        } else {
            f2 = iAbs / i7;
        }
        if (iClampMag2 != 0) {
            f3 = i6;
            f4 = iAbs4;
        } else {
            f3 = i7;
            f4 = iAbs2;
        }
        return (int) ((computeAxisDuration(i2, iClampMag, this.mCallback.getViewHorizontalDragRange(view)) * f2) + (computeAxisDuration(i3, iClampMag2, this.mCallback.getViewVerticalDragRange(view)) * (f4 / f3)));
    }

    public static ViewDragHelper create(ViewGroup viewGroup, float f2, Callback callback) {
        ViewDragHelper viewDragHelperCreate = create(viewGroup, callback);
        viewDragHelperCreate.mTouchSlop = (int) (viewDragHelperCreate.mTouchSlop * (1.0f / f2));
        return viewDragHelperCreate;
    }

    private void dispatchViewReleased(float f2, float f3) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f2, f3);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private float distanceInfluenceForSnapDuration(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private void dragTo(int i2, int i3, int i4, int i5) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (i4 != 0) {
            i2 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, i2, i4);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.mCallback.clampViewPositionVertical(this.mCapturedView, i3, i5);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.mCallback.onViewPositionChanged(this.mCapturedView, i6, i7, i6 - left, i7 - top);
    }

    private void ensureMotionHistorySizeForId(int i2) {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.mInitialMotionY;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.mLastMotionX;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.mLastMotionY;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.mInitialEdgesTouched;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.mEdgeDragsInProgress;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.mEdgeDragsLocked;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.mInitialMotionX = fArr2;
            this.mInitialMotionY = fArr3;
            this.mLastMotionX = fArr4;
            this.mLastMotionY = fArr5;
            this.mInitialEdgesTouched = iArr;
            this.mEdgeDragsInProgress = iArr2;
            this.mEdgeDragsLocked = iArr3;
        }
    }

    private boolean forceSettleCapturedViewAt(int i2, int i3, int i4, int i5) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0) {
            i6 = 0;
            if (i7 == 0) {
                this.mScroller.abortAnimation();
                setDragState(0);
                return false;
            }
        }
        int i8 = i6;
        int iComputeSettleDuration = computeSettleDuration(this.mCapturedView, i8, i7, i4, i5);
        this.mInterpolator = sInterpolator;
        this.mScroller.startScroll(left, top, i8, i7, iComputeSettleDuration);
        setDragState(2);
        return true;
    }

    private int getEdgesTouched(int i2, int i3) {
        int i4 = i2 < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        if (i3 < this.mParentView.getTop() + this.mEdgeSize) {
            i4 |= 4;
        }
        if (i2 > this.mParentView.getRight() - this.mEdgeSize) {
            i4 |= 2;
        }
        return i3 > this.mParentView.getBottom() - this.mEdgeSize ? i4 | 8 : i4;
    }

    private boolean isValidPointerForActionMove(int i2) {
        return isPointerDown(i2);
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.customview.widget.ViewDragHelper$Callback] */
    private void reportNewEdgeDrags(float f2, float f3, int i2) {
        boolean zCheckNewEdgeDrag = checkNewEdgeDrag(f2, f3, i2, 1);
        boolean z = zCheckNewEdgeDrag;
        if (checkNewEdgeDrag(f3, f2, i2, 4)) {
            z = (zCheckNewEdgeDrag ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (checkNewEdgeDrag(f2, f3, i2, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (checkNewEdgeDrag(f3, f2, i2, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.mEdgeDragsInProgress;
            iArr[i2] = iArr[i2] | r0;
            this.mCallback.onEdgeDragStarted(r0, i2);
        }
    }

    private static <T> T requireNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private void saveInitialMotion(float f2, float f3, int i2) {
        ensureMotionHistorySizeForId(i2);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[i2] = f3;
        fArr2[i2] = f3;
        this.mInitialEdgesTouched[i2] = getEdgesTouched((int) f2, (int) f3);
        this.mPointersDown |= 1 << i2;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (isValidPointerForActionMove(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.mLastMotionX[pointerId] = x;
                this.mLastMotionY[pointerId] = y;
            }
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            OverScroller overScroller = this.mScroller;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            OverScroller overScroller2 = this.mScroller;
            Callback callback = this.mCallback;
            int currX2 = overScroller2.getCurrX();
            int currY2 = overScroller2.getCurrY();
            callback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        this.mInterpolator = sInterpolator;
        setDragState(0);
    }

    protected boolean canScroll(View view, boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i7 = i4 + scrollX;
                if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && (i6 = i5 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom() && canScroll(childAt, true, i2, i3, i7 - childAt.getLeft(), i6 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z) {
            return view.canScrollHorizontally(-i2) || view.canScrollVertically(-i3);
        }
        return false;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void captureChildView(View view, int i2) {
        if (view.getParent() != this.mParentView) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
        }
        this.mCapturedView = view;
        this.mActivePointerId = i2;
        this.mCallback.onViewCaptured(view, i2);
        setDragState(1);
    }

    public boolean checkTouchSlop(int i2, int i3) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        if (!isPointerDown(i3)) {
            return false;
        }
        int i4 = i2 & 1;
        boolean z = (i2 & 2) == 2;
        float[] fArr4 = this.mInitialMotionX;
        if (fArr4 == null || (fArr = this.mInitialMotionY) == null || (fArr2 = this.mLastMotionX) == null || (fArr3 = this.mLastMotionY) == null) {
            Log.w(TAG, "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
            return false;
        }
        float f2 = fArr2[i3] - fArr4[i3];
        float f3 = fArr3[i3] - fArr[i3];
        if (i4 == 0 || !z) {
            return i4 != 0 ? Math.abs(f2) > ((float) this.mTouchSlop) : z && Math.abs(f3) > ((float) this.mTouchSlop);
        }
        int i5 = this.mTouchSlop;
        return (f2 * f2) + (f3 * f3) > ((float) (i5 * i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean continueSettling(boolean r11) {
        /*
            r10 = this;
            int r0 = r10.mDragState
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L61
            android.widget.OverScroller r0 = r10.mScroller
            boolean r3 = r0.computeScrollOffset()
            int r6 = r0.getCurrX()
            int r7 = r0.getCurrY()
            android.view.View r0 = r10.mCapturedView
            int r0 = r0.getLeft()
            int r8 = r6 - r0
            android.view.View r0 = r10.mCapturedView
            int r0 = r0.getTop()
            int r9 = r7 - r0
            if (r8 == 0) goto L2b
            android.view.View r0 = r10.mCapturedView
            androidx.core.view.ViewCompat.offsetLeftAndRight(r0, r8)
        L2b:
            if (r9 == 0) goto L32
            android.view.View r0 = r10.mCapturedView
            androidx.core.view.ViewCompat.offsetTopAndBottom(r0, r9)
        L32:
            if (r8 != 0) goto L36
            if (r9 == 0) goto L3d
        L36:
            androidx.customview.widget.ViewDragHelper$Callback r4 = r10.mCallback
            android.view.View r5 = r10.mCapturedView
            r4.onViewPositionChanged(r5, r6, r7, r8, r9)
        L3d:
            if (r3 == 0) goto L54
            android.widget.OverScroller r0 = r10.mScroller
            int r0 = r0.getFinalX()
            if (r6 != r0) goto L61
            android.widget.OverScroller r0 = r10.mScroller
            int r0 = r0.getFinalY()
            if (r7 != r0) goto L61
            android.widget.OverScroller r0 = r10.mScroller
            r0.abortAnimation()
        L54:
            if (r11 == 0) goto L5e
            android.view.ViewGroup r11 = r10.mParentView
            java.lang.Runnable r0 = r10.mSetIdleRunnable
            r11.post(r0)
            goto L61
        L5e:
            r10.setDragState(r1)
        L61:
            int r10 = r10.mDragState
            if (r10 != r2) goto L67
            r10 = 1
            return r10
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.continueSettling(boolean):boolean");
    }

    public View findTopChildUnder(int i2, int i3) {
        int childCount = this.mParentView.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public void flingCapturedView(int i2, int i3, int i4, int i5) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mInterpolator = sInterpolator;
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), i2, i4, i3, i5);
        setDragState(2);
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    public View getCapturedView() {
        return this.mCapturedView;
    }

    public int getDefaultEdgeSize() {
        return this.mDefaultEdgeSize;
    }

    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public boolean isCapturedViewUnder(int i2, int i3) {
        return isViewUnder(this.mCapturedView, i2, i3);
    }

    public boolean isEdgeTouched(int i2) {
        int[] iArr = this.mInitialEdgesTouched;
        if (iArr != null) {
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (isEdgeTouched(i2, i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPointerDown(int i2) {
        return (this.mPointersDown & (1 << i2)) != 0;
    }

    public boolean isViewUnder(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void processTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i2 = 0;
        if (actionMasked == 0) {
            cancel();
            actionMasked = 0;
        }
        VelocityTracker velocityTrackerObtain = this.mVelocityTracker;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.mVelocityTracker = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewFindTopChildUnder = findTopChildUnder((int) x, (int) y);
            saveInitialMotion(x, y, pointerId);
            tryCaptureViewForDrag(viewFindTopChildUnder, pointerId);
            int i3 = this.mInitialEdgesTouched[pointerId] & this.mTrackingEdges;
            if (i3 != 0) {
                this.mCallback.onEdgeTouched(i3, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.mDragState == 1) {
                releaseViewForPointerUp();
            }
            cancel();
            return;
        }
        if (actionMasked == 2) {
            if (this.mDragState != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if (isValidPointerForActionMove(pointerId2)) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f2 = x2 - this.mInitialMotionX[pointerId2];
                        float f3 = y2 - this.mInitialMotionY[pointerId2];
                        reportNewEdgeDrags(f2, f3, pointerId2);
                        if (this.mDragState == 1) {
                            break;
                        }
                        View viewFindTopChildUnder2 = findTopChildUnder((int) x2, (int) y2);
                        if (checkTouchSlop(viewFindTopChildUnder2, f2, f3) && tryCaptureViewForDrag(viewFindTopChildUnder2, pointerId2)) {
                            break;
                        }
                    }
                    i2++;
                }
            } else {
                if (!isValidPointerForActionMove(this.mActivePointerId) || (iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId)) == -1) {
                    return;
                }
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.mLastMotionX;
                int i4 = this.mActivePointerId;
                int i5 = (int) (x3 - fArr[i4]);
                int i6 = (int) (y3 - this.mLastMotionY[i4]);
                dragTo(this.mCapturedView.getLeft() + i5, this.mCapturedView.getTop() + i6, i5, i6);
            }
            saveLastMotion(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.mDragState == 1) {
                dispatchViewReleased(0.0f, 0.0f);
            }
            cancel();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            int i7 = (int) x4;
            float y4 = motionEvent.getY(actionIndex);
            int i8 = (int) y4;
            saveInitialMotion(x4, y4, pointerId3);
            if (this.mDragState != 0) {
                if (isCapturedViewUnder(i7, i8)) {
                    tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                    return;
                }
                return;
            } else {
                tryCaptureViewForDrag(findTopChildUnder(i7, i8), pointerId3);
                int i9 = this.mInitialEdgesTouched[pointerId3] & this.mTrackingEdges;
                if (i9 != 0) {
                    this.mCallback.onEdgeTouched(i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.mDragState == 1 && pointerId4 == this.mActivePointerId) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.mActivePointerId) {
                    View viewFindTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.mCapturedView;
                    if (viewFindTopChildUnder3 == view && tryCaptureViewForDrag(view, pointerId5)) {
                        if (this.mActivePointerId == -1) {
                            break;
                        }
                    }
                }
                i2++;
            }
            releaseViewForPointerUp();
        }
        clearMotionHistory(pointerId4);
    }

    void setDragState(int i2) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != i2) {
            this.mDragState = i2;
            this.mCallback.onViewDragStateChanged(i2);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    public void setEdgeSize(int i2) {
        this.mEdgeSize = i2;
    }

    public void setEdgeTrackingEnabled(int i2) {
        this.mTrackingEdges = i2;
    }

    public void setMinVelocity(float f2) {
        this.mMinVelocity = f2;
    }

    public boolean settleCapturedViewAt(int i2, int i3) {
        if (this.mReleaseInProgress) {
            return forceSettleCapturedViewAt(i2, i3, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(View view, int i2, int i3) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean zForceSettleCapturedViewAt = forceSettleCapturedViewAt(i2, i3, 0, 0);
        if (zForceSettleCapturedViewAt || this.mDragState != 0 || this.mCapturedView == null) {
            return zForceSettleCapturedViewAt;
        }
        this.mCapturedView = null;
        return false;
    }

    boolean tryCaptureViewForDrag(View view, int i2) {
        if (view == this.mCapturedView && this.mActivePointerId == i2) {
            return true;
        }
        if (view == null || !this.mCallback.tryCaptureView(view, i2)) {
            return false;
        }
        this.mActivePointerId = i2;
        captureChildView(view, i2);
        return true;
    }

    public static ViewDragHelper create(ViewGroup viewGroup, Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public boolean isEdgeTouched(int i2, int i3) {
        int[] iArr;
        return (!isPointerDown(i3) || (iArr = this.mInitialEdgesTouched) == null || (iArr[i3] & i2) == 0) ? false : true;
    }

    private int clampMag(int i2, int i3, int i4) {
        int iAbs = Math.abs(i2);
        if (iAbs < i3) {
            return 0;
        }
        return iAbs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public boolean smoothSlideViewTo(View view, int i2, int i3, int i4, Interpolator interpolator) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean zForceSettleCapturedViewAt = forceSettleCapturedViewAt(i2, i3, i4, interpolator);
        if (zForceSettleCapturedViewAt || this.mDragState != 0 || this.mCapturedView == null) {
            return zForceSettleCapturedViewAt;
        }
        this.mCapturedView = null;
        return false;
    }

    private void clearMotionHistory() {
        float[] fArr = this.mInitialMotionX;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.mInitialMotionY, 0.0f);
        Arrays.fill(this.mLastMotionX, 0.0f);
        Arrays.fill(this.mLastMotionY, 0.0f);
        Arrays.fill(this.mInitialEdgesTouched, 0);
        Arrays.fill(this.mEdgeDragsInProgress, 0);
        Arrays.fill(this.mEdgeDragsLocked, 0);
        this.mPointersDown = 0;
    }

    private boolean forceSettleCapturedViewAt(int i2, int i3, int i4, Interpolator interpolator) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int i5 = i2 - left;
        int i6 = i3 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.mScroller.abortAnimation();
                setDragState(0);
                return false;
            }
        }
        int i7 = i5;
        if (interpolator != null) {
            this.mInterpolator = interpolator;
        } else {
            this.mInterpolator = sInterpolator;
        }
        this.mScroller.startScroll(left, top, i7, i6, i4);
        setDragState(2);
        return true;
    }

    public boolean checkTouchSlop(int i2) {
        float[] fArr = this.mInitialMotionX;
        if (fArr != null) {
            for (int i3 = 0; i3 < fArr.length; i3++) {
                if (checkTouchSlop(i2, i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkTouchSlop(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.mCallback.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.mTouchSlop) : z2 && Math.abs(f3) > ((float) this.mTouchSlop);
        }
        int i2 = this.mTouchSlop;
        return (f2 * f2) + (f3 * f3) > ((float) (i2 * i2));
    }
}
