package androidx.activity;

import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;
    private final List<a<ab>> onReportCallbacks;
    private final a<ab> reportFullyDrawn;
    private boolean reportPosted;
    private final Runnable reportRunnable;
    private boolean reportedFullyDrawn;
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, a<ab> aVar) {
        x.f(executor, "executor");
        x.f(aVar, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = aVar;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$0(this.f$0);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    static final void reportRunnable$lambda$0(FullyDrawnReporter fullyDrawnReporter) {
        synchronized (fullyDrawnReporter.lock) {
            fullyDrawnReporter.reportPosted = false;
            if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reportFullyDrawn.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
        }
    }

    public final void addOnReportDrawnListener(a<ab> aVar) {
        boolean z;
        x.f(aVar, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z = true;
            } else {
                this.onReportCallbacks.add(aVar);
                z = false;
            }
        }
        if (z) {
            aVar.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            Iterator<T> it = this.onReportCallbacks.iterator();
            while (it.hasNext()) {
                ((a) it.next()).invoke();
            }
            this.onReportCallbacks.clear();
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(a<ab> aVar) {
        x.f(aVar, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(aVar);
        }
    }

    public final void removeReporter() {
        int i2;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn && (i2 = this.reporterCount) > 0) {
                this.reporterCount = i2 - 1;
                postWhenReportersAreDone();
            }
        }
    }
}
