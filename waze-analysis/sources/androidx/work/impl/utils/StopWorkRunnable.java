package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class StopWorkRunnable implements Runnable {
    private final Processor processor;
    private final int reason;
    private final boolean stopInForeground;
    private final StartStopToken token;

    public StopWorkRunnable(Processor processor, StartStopToken startStopToken, boolean z, int i2) {
        x.f(processor, "processor");
        x.f(startStopToken, "token");
        this.processor = processor;
        this.token = startStopToken;
        this.stopInForeground = z;
        this.reason = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = this.stopInForeground;
        Processor processor = this.processor;
        boolean zStopForegroundWork = z ? processor.stopForegroundWork(this.token, this.reason) : processor.stopWork(this.token, this.reason);
        StartStopToken startStopToken = this.token;
        Logger.get().debug(Logger.tagWithPrefix("StopWorkRunnable"), "StopWorkRunnable for " + startStopToken.getId().getWorkSpecId() + "; Processor.stopWork = " + zStopForegroundWork + ", reason: " + this.reason);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StopWorkRunnable(Processor processor, StartStopToken startStopToken, boolean z) {
        this(processor, startStopToken, z, WorkInfo.STOP_REASON_UNKNOWN);
        x.f(processor, "processor");
        x.f(startStopToken, "token");
    }
}
