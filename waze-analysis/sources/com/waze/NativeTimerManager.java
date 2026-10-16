package com.waze;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Timer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class NativeTimerManager extends ja implements com.waze.ifs.ui.y {
    private static final com.waze.shared_infra.i.e LOGGER = com.waze.shared_infra.i.a.d("NativeTimerManager");
    private NativeManager mNativeManager;
    private ConcurrentHashMap<Integer, jb> mTasks = new ConcurrentHashMap<>();
    private Timer mTimer;

    public NativeTimerManager(NativeManager nativeManager) {
        this.mNativeManager = nativeManager;
        this.mTimer = nativeManager.getTimer();
        InitTimerManagerNTV();
        com.waze.ifs.ui.z.a().b(this);
    }

    private native void InitTimerManagerNTV();

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0046: INVOKE (r9v1 ?? I:java.lang.StringBuilder), (r3 I:long) VIRTUAL call: java.lang.StringBuilder.append(long):java.lang.StringBuilder A[MD:(long):java.lang.StringBuilder (c)] (LINE:71), block:B:14:0x0036 */
    private void StartTask(int i2, long j2, boolean z) {
        long jAppend;
        jb jbVar = this.mTasks.get(Integer.valueOf(i2));
        if (jbVar == null) {
            com.waze.shared_infra.i.h.h("StartTask. Task: " + i2 + " is not active");
            return;
        }
        Timer timer = this.mTimer;
        try {
            if (z) {
                timer.scheduleAtFixedRate(jbVar, j2, j2);
            } else {
                timer.schedule(jbVar, j2);
            }
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.e("Start Task Error!  TaskId: " + i2 + "Interval: " + jAppend, e2);
        }
    }

    void AddTask(int i2, int i3, int i4, boolean z) {
        if (NativeManager.getInstance().isShutdown()) {
            return;
        }
        if (i4 <= 0) {
            if (i4 < 0) {
                LOGGER.g("Interval is illegal: " + i4);
            }
            i4 = 1;
        }
        ConcurrentHashMap<Integer, jb> concurrentHashMap = this.mTasks;
        Integer numValueOf = Integer.valueOf(i2);
        if (concurrentHashMap.containsKey(numValueOf)) {
            RemoveTask(i2);
        }
        this.mTasks.put(numValueOf, new jb(i2, i3, i4, this.mNativeManager));
        StartTask(i2, i4, z);
    }

    void RemoveTask(int i2) {
        if (NativeManager.getInstance().isShutdown()) {
            return;
        }
        jb jbVarRemove = this.mTasks.remove(Integer.valueOf(i2));
        if (jbVarRemove != null) {
            jbVarRemove.cancel();
            return;
        }
        LOGGER.g("RemoveTask: Not found task id " + i2);
    }

    @Override // com.waze.ifs.ui.y
    public void onShutdown() {
        this.mTimer.cancel();
    }
}
