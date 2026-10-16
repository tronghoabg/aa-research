package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ExecutionListener {
    void onExecuted(WorkGenerationalId workGenerationalId, boolean z);
}
