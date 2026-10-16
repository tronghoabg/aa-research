package dd;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: dd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC2423b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f34253a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f34253a.post(runnable);
    }
}
