package com.waze.perf;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class e {
    public static final int $stable = 0;

    static final void notifyMapJamsAlertsReceivedJNI$lambda$0(e eVar) {
        h.g.b.x.d(eVar, "null cannot be cast to non-null type com.waze.perf.BootMonitorNativeManager");
        ((BootMonitorNativeManager) eVar).notifyMapJamsAlertsReceived();
    }

    public abstract void notifyMapJamsAlertsReceived();

    protected final void notifyMapJamsAlertsReceivedJNI() {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.perf.d
            @Override // java.lang.Runnable
            public final void run() {
                e.notifyMapJamsAlertsReceivedJNI$lambda$0(this.f33038a);
            }
        });
    }
}
