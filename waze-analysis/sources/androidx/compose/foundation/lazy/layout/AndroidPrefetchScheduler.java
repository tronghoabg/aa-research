package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import h.g.b.o;
import h.g.b.x;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidPrefetchScheduler implements PrefetchScheduler, PriorityPrefetchScheduler, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    private static long frameIntervalNs;
    private long frameStartTimeNanos;
    private boolean isActive;
    private boolean prefetchScheduled;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final PriorityQueue<PriorityTask> prefetchRequests = new PriorityQueue<>(11, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return x.a(((PriorityTask) obj2).getPriority(), ((PriorityTask) obj).getPriority());
        }
    });
    private final Choreographer choreographer = Choreographer.getInstance();
    private final PrefetchRequestScopeImpl scope = new PrefetchRequestScopeImpl();

    /* compiled from: WazeSource */
    public final class PrefetchRequestScopeImpl implements PrefetchRequestScope {
        public static final int $stable = 8;
        private boolean isFrameIdle;
        private long nextFrameTimeNs;

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequestScope
        public long availableTimeNanos() {
            if (this.isFrameIdle) {
                return Long.MAX_VALUE;
            }
            return Math.max(0L, this.nextFrameTimeNs - System.nanoTime());
        }

        public final long getNextFrameTimeNs() {
            return this.nextFrameTimeNs;
        }

        public final boolean isFrameIdle() {
            return this.isFrameIdle;
        }

        public final void setFrameIdle(boolean z) {
            this.isFrameIdle = z;
        }

        public final void setNextFrameTimeNs(long j2) {
            this.nextFrameTimeNs = j2;
        }
    }

    public AndroidPrefetchScheduler(View view) {
        this.view = view;
        Companion.calculateFrameIntervalIfNeeded(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    private final boolean runRequest() {
        long jAvailableTimeNanos = this.scope.availableTimeNanos();
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", jAvailableTimeNanos);
        boolean z = true;
        if (jAvailableTimeNanos > 0) {
            PriorityTask priorityTaskPeek = this.prefetchRequests.peek();
            if (priorityTaskPeek == null) {
                x.g();
            }
            if (!priorityTaskPeek.getRequest().execute(this.scope)) {
                this.prefetchRequests.poll();
                z = false;
            }
            this.scope.setFrameIdle(false);
        }
        return z;
    }

    private final void startExecution() {
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        if (this.isActive) {
            this.frameStartTimeNanos = j2;
            this.view.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.isActive = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prefetchRequests.isEmpty() || !this.prefetchScheduled || !this.isActive || this.view.getWindowVisibility() != 0) {
            this.prefetchScheduled = false;
            return;
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime());
        PrefetchRequestScopeImpl prefetchRequestScopeImpl = this.scope;
        long jNanoTime = System.nanoTime();
        long j2 = frameIntervalNs;
        prefetchRequestScopeImpl.setFrameIdle(jNanoTime > (j2 + j2) + nanos);
        this.scope.setNextFrameTimeNs(Math.max(this.frameStartTimeNanos, nanos) + frameIntervalNs);
        boolean zRunRequest = false;
        while (true) {
            if (!this.prefetchRequests.isEmpty()) {
                if (zRunRequest) {
                    break;
                }
                if (this.scope.isFrameIdle()) {
                    Trace.beginSection("compose:lazy:prefetch:idle_frame");
                    try {
                        zRunRequest = runRequest();
                    } finally {
                        Trace.endSection();
                    }
                } else {
                    zRunRequest = runRequest();
                }
            } else if (!zRunRequest) {
                this.prefetchScheduled = false;
            }
        }
        this.choreographer.postFrameCallback(this);
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", 0L);
    }

    @Override // androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
    public void scheduleHighPriorityPrefetch(PrefetchRequest prefetchRequest) {
        this.prefetchRequests.add(new PriorityTask(PriorityTask.Companion.getHigh(), prefetchRequest));
        startExecution();
    }

    @Override // androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
    public void scheduleLowPriorityPrefetch(PrefetchRequest prefetchRequest) {
        this.prefetchRequests.add(new PriorityTask(PriorityTask.Companion.getLow(), prefetchRequest));
        startExecution();
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler, androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
    public /* synthetic */ void schedulePrefetch(PrefetchRequest prefetchRequest) {
        scheduleHighPriorityPrefetch(prefetchRequest);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void calculateFrameIntervalIfNeeded(View view) {
            if (AndroidPrefetchScheduler.frameIntervalNs == 0) {
                Display display = view.getDisplay();
                float f2 = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                AndroidPrefetchScheduler.frameIntervalNs = (long) (1.0E9f / f2);
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
