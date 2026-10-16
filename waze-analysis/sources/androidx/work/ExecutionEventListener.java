package androidx.work;

import androidx.work.ListenableWorker;
import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface ExecutionEventListener {
    Object onException(Throwable th, WorkInfo workInfo, e<? super ab> eVar);

    Object onFinished(ListenableWorker.Result result, WorkInfo workInfo, e<? super ab> eVar);

    Object onStarted(WorkInfo workInfo, e<? super ab> eVar);

    Object onStopped(int i2, WorkInfo workInfo, e<? super ab> eVar);
}
