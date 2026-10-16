package S8;

import A5.g;
import com.applovin.impl.T0;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final T0 f11026a = new T0(1);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        g gVar = new g(taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource, 6);
        T0 t02 = f11026a;
        task.continueWithTask(t02, gVar);
        task2.continueWithTask(t02, gVar);
        return taskCompletionSource.getTask();
    }
}
