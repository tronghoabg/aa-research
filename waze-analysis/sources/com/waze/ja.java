package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ja {
    public static final int $stable = 0;

    protected final void AddTaskJNI(int i2, int i3, int i4, boolean z) {
        ((NativeTimerManager) this).AddTask(i2, i3, i4, z);
    }

    protected final void RemoveTaskJNI(int i2) {
        ((NativeTimerManager) this).RemoveTask(i2);
    }
}
