package androidx.dynamicanimation.animation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class AnimationHandler {
    private static final ThreadLocal<AnimationHandler> sAnimatorHandler = new ThreadLocal<>();
    public DurationScaleChangeListener mDurationScaleChangeListener;
    private FrameCallbackScheduler mScheduler;
    private final SimpleArrayMap<AnimationFrameCallback, Long> mDelayedCallbackStartTime = new SimpleArrayMap<>();
    final ArrayList<AnimationFrameCallback> mAnimationCallbacks = new ArrayList<>();
    private final AnimationCallbackDispatcher mCallbackDispatcher = new AnimationCallbackDispatcher();
    private final Runnable mRunnable = new Runnable() { // from class: androidx.dynamicanimation.animation.AnimationHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m11898x83fff5a8();
        }
    };
    long mCurrentFrameTime = 0;
    private boolean mListDirty = false;
    public float mDurationScale = 1.0f;

    /* compiled from: WazeSource */
    class AnimationCallbackDispatcher {
        private AnimationCallbackDispatcher() {
        }

        void dispatchAnimationFrame() {
            AnimationHandler animationHandler = AnimationHandler.this;
            long jUptimeMillis = SystemClock.uptimeMillis();
            animationHandler.mCurrentFrameTime = jUptimeMillis;
            animationHandler.doAnimationFrame(jUptimeMillis);
            if (AnimationHandler.this.mAnimationCallbacks.size() > 0) {
                AnimationHandler animationHandler2 = AnimationHandler.this;
                animationHandler2.mScheduler.postFrameCallback(animationHandler2.mRunnable);
            }
        }
    }

    /* compiled from: WazeSource */
    interface AnimationFrameCallback {
        boolean doAnimationFrame(long j2);
    }

    /* compiled from: WazeSource */
    public interface DurationScaleChangeListener {
        boolean register();

        boolean unregister();
    }

    /* compiled from: WazeSource */
    public class DurationScaleChangeListener33 implements DurationScaleChangeListener {
        ValueAnimator$DurationScaleChangeListener mListener;

        public DurationScaleChangeListener33() {
        }

        /* renamed from: lambda$register$0$androidx-dynamicanimation-animation-AnimationHandler$DurationScaleChangeListener33, reason: not valid java name */
        /* synthetic */ void m11899xb804c881(float f2) {
            AnimationHandler.this.mDurationScale = f2;
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.DurationScaleChangeListener
        public boolean register() {
            if (this.mListener != null) {
                return true;
            }
            ValueAnimator$DurationScaleChangeListener valueAnimator$DurationScaleChangeListener = new ValueAnimator$DurationScaleChangeListener() { // from class: androidx.dynamicanimation.animation.AnimationHandler$DurationScaleChangeListener33$$ExternalSyntheticLambda0
                public final void onChanged(float f2) {
                    this.f$0.m11899xb804c881(f2);
                }
            };
            this.mListener = valueAnimator$DurationScaleChangeListener;
            return ValueAnimator.registerDurationScaleChangeListener(valueAnimator$DurationScaleChangeListener);
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.DurationScaleChangeListener
        public boolean unregister() {
            boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.mListener);
            this.mListener = null;
            return zUnregisterDurationScaleChangeListener;
        }
    }

    /* compiled from: WazeSource */
    final class FrameCallbackScheduler16 implements FrameCallbackScheduler {
        private final Choreographer mChoreographer = Choreographer.getInstance();
        private final Looper mLooper = Looper.myLooper();

        FrameCallbackScheduler16() {
        }

        @Override // androidx.dynamicanimation.animation.FrameCallbackScheduler
        public boolean isCurrentThread() {
            return Thread.currentThread() == this.mLooper.getThread();
        }

        @Override // androidx.dynamicanimation.animation.FrameCallbackScheduler
        public void postFrameCallback(final Runnable runnable) {
            this.mChoreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackScheduler16$$ExternalSyntheticLambda0
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j2) {
                    runnable.run();
                }
            });
        }
    }

    public AnimationHandler(FrameCallbackScheduler frameCallbackScheduler) {
        this.mScheduler = frameCallbackScheduler;
    }

    private void cleanUpList() {
        ArrayList<AnimationFrameCallback> arrayList;
        if (this.mListDirty) {
            int size = this.mAnimationCallbacks.size();
            while (true) {
                size--;
                arrayList = this.mAnimationCallbacks;
                if (size < 0) {
                    break;
                } else if (arrayList.get(size) == null) {
                    this.mAnimationCallbacks.remove(size);
                }
            }
            if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                this.mDurationScaleChangeListener.unregister();
            }
            this.mListDirty = false;
        }
    }

    static AnimationHandler getInstance() {
        ThreadLocal<AnimationHandler> threadLocal = sAnimatorHandler;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler(new FrameCallbackScheduler16()));
        }
        return threadLocal.get();
    }

    private boolean isCallbackDue(AnimationFrameCallback animationFrameCallback, long j2) {
        Long l2 = this.mDelayedCallbackStartTime.get(animationFrameCallback);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j2) {
            return false;
        }
        this.mDelayedCallbackStartTime.remove(animationFrameCallback);
        return true;
    }

    void addAnimationFrameCallback(AnimationFrameCallback animationFrameCallback, long j2) {
        if (this.mAnimationCallbacks.size() == 0) {
            this.mScheduler.postFrameCallback(this.mRunnable);
            if (Build.VERSION.SDK_INT >= 33) {
                this.mDurationScale = ValueAnimator.getDurationScale();
                if (this.mDurationScaleChangeListener == null) {
                    this.mDurationScaleChangeListener = new DurationScaleChangeListener33();
                }
                this.mDurationScaleChangeListener.register();
            }
        }
        if (!this.mAnimationCallbacks.contains(animationFrameCallback)) {
            this.mAnimationCallbacks.add(animationFrameCallback);
        }
        if (j2 > 0) {
            this.mDelayedCallbackStartTime.put(animationFrameCallback, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    void doAnimationFrame(long j2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i2 = 0; i2 < this.mAnimationCallbacks.size(); i2++) {
            AnimationFrameCallback animationFrameCallback = this.mAnimationCallbacks.get(i2);
            if (animationFrameCallback != null && isCallbackDue(animationFrameCallback, jUptimeMillis)) {
                animationFrameCallback.doAnimationFrame(j2);
            }
        }
        cleanUpList();
    }

    public float getDurationScale() {
        return this.mDurationScale;
    }

    FrameCallbackScheduler getScheduler() {
        return this.mScheduler;
    }

    boolean isCurrentThread() {
        return this.mScheduler.isCurrentThread();
    }

    /* renamed from: lambda$new$0$androidx-dynamicanimation-animation-AnimationHandler, reason: not valid java name */
    /* synthetic */ void m11898x83fff5a8() {
        this.mCallbackDispatcher.dispatchAnimationFrame();
    }

    void removeCallback(AnimationFrameCallback animationFrameCallback) {
        this.mDelayedCallbackStartTime.remove(animationFrameCallback);
        int iIndexOf = this.mAnimationCallbacks.indexOf(animationFrameCallback);
        if (iIndexOf >= 0) {
            this.mAnimationCallbacks.set(iIndexOf, null);
            this.mListDirty = true;
        }
    }
}
