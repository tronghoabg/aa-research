package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface TaskExecutor {

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.utils.taskexecutor.TaskExecutor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void executeOnTaskThread(Runnable runnable);

    af getCoroutineScope();

    ab getEventListenerDispatcher();

    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();

    ab getTaskCoroutineDispatcher();
}
