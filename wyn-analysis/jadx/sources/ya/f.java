package ya;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f48045b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static f f48046c;

    /* renamed from: a, reason: collision with root package name */
    public final zza f48047a;

    public f(Looper looper) {
        this.f48047a = new zza(looper);
    }

    public static f a() {
        f fVar;
        synchronized (f48045b) {
            try {
                if (f48046c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f48046c = new f(handlerThread.getLooper());
                }
                fVar = f48046c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n.f48065a.execute(new m(0, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
