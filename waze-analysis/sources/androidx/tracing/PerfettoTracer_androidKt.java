package androidx.tracing;

import android.app.Application;
import android.os.Process;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PerfettoTracer_androidKt {
    public static final ProcessTrack currentProcessTrack(TraceContext traceContext) {
        if (traceContext.isProcessInitialized) {
            return traceContext.getProcess();
        }
        traceContext.createProcessTrack(Process.myPid(), Application.getProcessName());
        return traceContext.getProcess();
    }
}
