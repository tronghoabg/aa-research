package androidx.work.impl;

import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface WorkLauncher {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.WorkLauncher$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$startWork(WorkLauncher workLauncher, StartStopToken startStopToken) {
            x.f(startStopToken, "workSpecId");
            workLauncher.startWork(startStopToken, null);
        }

        public static void $default$stopWork(WorkLauncher workLauncher, StartStopToken startStopToken) {
            x.f(startStopToken, "workSpecId");
            workLauncher.stopWork(startStopToken, WorkInfo.STOP_REASON_UNKNOWN);
        }

        public static void $default$stopWorkWithReason(WorkLauncher workLauncher, StartStopToken startStopToken, int i2) {
            x.f(startStopToken, "workSpecId");
            workLauncher.stopWork(startStopToken, i2);
        }
    }

    void startWork(StartStopToken startStopToken);

    void startWork(StartStopToken startStopToken, WorkerParameters.RuntimeExtras runtimeExtras);

    void stopWork(StartStopToken startStopToken);

    void stopWork(StartStopToken startStopToken, int i2);

    void stopWorkWithReason(StartStopToken startStopToken, int i2);
}
