package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface SerialExecutor extends Executor {
    boolean hasPendingTasks();
}
