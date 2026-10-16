package androidx.work;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkerExceptionInfo {
    private final Throwable throwable;
    private final String workerClassName;
    private final WorkerParameters workerParameters;

    public WorkerExceptionInfo(String str, WorkerParameters workerParameters, Throwable th) {
        x.f(str, "workerClassName");
        x.f(workerParameters, "workerParameters");
        x.f(th, "throwable");
        this.workerClassName = str;
        this.workerParameters = workerParameters;
        this.throwable = th;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final String getWorkerClassName() {
        return this.workerClassName;
    }

    public final WorkerParameters getWorkerParameters() {
        return this.workerParameters;
    }
}
