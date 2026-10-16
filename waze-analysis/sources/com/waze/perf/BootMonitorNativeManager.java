package com.waze.perf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class BootMonitorNativeManager extends e {
    public static final int $stable = 0;
    public static final BootMonitorNativeManager INSTANCE = new BootMonitorNativeManager();

    private BootMonitorNativeManager() {
    }

    private final native void initNativeLayerNTV();

    public final void initialize() {
        initNativeLayerNTV();
    }

    @Override // com.waze.perf.e
    public void notifyMapJamsAlertsReceived() {
        c.a(b.n);
    }
}
