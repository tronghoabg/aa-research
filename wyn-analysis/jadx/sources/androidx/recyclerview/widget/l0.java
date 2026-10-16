package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f18913a;

    /* renamed from: b, reason: collision with root package name */
    public int f18914b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f18915c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f18916d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18917e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f18919g;

    public l0(RecyclerView recyclerView) {
        this.f18919g = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f18916d = interpolator;
        this.f18917e = false;
        this.f18918f = false;
        this.f18915c = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a() {
        if (this.f18917e) {
            this.f18918f = true;
            return;
        }
        RecyclerView recyclerView = this.f18919g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = k1.S.f38779a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i5, int i10, Interpolator interpolator, int i11) {
        RecyclerView recyclerView = this.f18919g;
        if (i11 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i5);
            int iAbs2 = Math.abs(i10);
            boolean z2 = iAbs > iAbs2;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                iAbs = iAbs2;
            }
            i11 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f18916d != interpolator) {
            this.f18916d = interpolator;
            this.f18915c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f18914b = 0;
        this.f18913a = 0;
        recyclerView.setScrollState(2);
        this.f18915c.startScroll(0, 0, i5, i10, i12);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5;
        int i10;
        int i11;
        RecyclerView recyclerView = this.f18919g;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f18915c.abortAnimation();
            return;
        }
        this.f18918f = false;
        this.f18917e = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f18915c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i12 = currX - this.f18913a;
            int i13 = currY - this.f18914b;
            this.f18913a = currX;
            this.f18914b = currY;
            int i14 = i12;
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(i14, i13, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                i14 -= iArr2[0];
                i5 = i13 - iArr2[1];
            } else {
                i5 = i13;
            }
            int i15 = i14;
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(i15, i5);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(i15, i5, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i16 = iArr4[0];
                int i17 = iArr4[1];
                i15 -= i16;
                i5 -= i17;
                i0 i0Var = recyclerView.mLayout.mSmoothScroller;
                if (i0Var != null && !i0Var.isPendingInitialRun() && i0Var.isRunning()) {
                    int iB = recyclerView.mState.b();
                    if (iB == 0) {
                        i0Var.stop();
                    } else if (i0Var.getTargetPosition() >= iB) {
                        i0Var.setTargetPosition(iB - 1);
                        i0Var.onAnimation(i16, i17);
                    } else {
                        i0Var.onAnimation(i16, i17);
                    }
                }
                i11 = i17;
                i10 = i16;
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i10, i11, i15, i5, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i18 = i15 - iArr6[0];
            int i19 = i5 - iArr6[1];
            if (i10 != 0 || i11 != 0) {
                recyclerView.dispatchOnScrolled(i10, i11);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
            i0 i0Var2 = recyclerView.mLayout.mSmoothScroller;
            if ((i0Var2 == null || !i0Var2.isPendingInitialRun()) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                    if (i19 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i19 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i20, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    C1479q c1479q = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = c1479q.f18963c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c1479q.f18964d = 0;
                }
            } else {
                a();
                RunnableC1480s runnableC1480s = recyclerView.mGapWorker;
                if (runnableC1480s != null) {
                    runnableC1480s.a(recyclerView, i10, i11);
                }
            }
        }
        i0 i0Var3 = recyclerView.mLayout.mSmoothScroller;
        if (i0Var3 != null && i0Var3.isPendingInitialRun()) {
            i0Var3.onAnimation(0, 0);
        }
        this.f18917e = false;
        if (!this.f18918f) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = k1.S.f38779a;
            recyclerView.postOnAnimation(this);
        }
    }
}
