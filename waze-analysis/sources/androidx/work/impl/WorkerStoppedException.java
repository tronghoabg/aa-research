package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkerStoppedException extends CancellationException {
    private final int reason;

    public WorkerStoppedException(int i2) {
        this.reason = i2;
    }

    public final int getReason() {
        return this.reason;
    }
}
