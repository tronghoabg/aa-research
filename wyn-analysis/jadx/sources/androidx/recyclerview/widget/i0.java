package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public abstract class i0 {
    private V mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final g0 mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public i0() {
        g0 g0Var = new g0();
        g0Var.f18867d = -1;
        g0Var.f18869f = false;
        g0Var.f18870g = 0;
        g0Var.f18864a = 0;
        g0Var.f18865b = 0;
        g0Var.f18866c = Integer.MIN_VALUE;
        g0Var.f18868e = null;
        this.mRecyclingAction = g0Var;
    }

    public PointF computeScrollVectorForPosition(int i5) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof h0) {
            return ((h0) layoutManager).computeScrollVectorForPosition(i5);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + h0.class.getCanonicalName());
        return null;
    }

    public View findViewByPosition(int i5) {
        return this.mRecyclerView.mLayout.findViewByPosition(i5);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public V getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i5) {
        this.mRecyclerView.scrollToPosition(i5);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public void onAnimation(int i5, int i10) {
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f10 = pointFComputeScrollVectorForPosition.x;
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFComputeScrollVectorForPosition.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                this.mRecyclingAction.a(recyclerView);
                stop();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i5, i10, recyclerView.mState, this.mRecyclingAction);
            g0 g0Var = this.mRecyclingAction;
            boolean z2 = g0Var.f18867d >= 0;
            g0Var.a(recyclerView);
            if (z2 && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.mViewFlinger.a();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
        }
    }

    public abstract void onSeekTargetStep(int i5, int i10, j0 j0Var, g0 g0Var);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, j0 j0Var, g0 g0Var);

    public void setTargetPosition(int i5) {
        this.mTargetPosition = i5;
    }

    public void start(RecyclerView recyclerView, V v2) {
        l0 l0Var = recyclerView.mViewFlinger;
        l0Var.f18919g.removeCallbacks(l0Var);
        l0Var.f18915c.abortAnimation();
        if (this.mStarted) {
            Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = v2;
        int i5 = this.mTargetPosition;
        if (i5 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.mState.f18894a = i5;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.a();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f18894a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
