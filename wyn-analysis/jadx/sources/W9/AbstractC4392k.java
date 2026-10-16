package w9;

import android.os.AsyncTask;
import com.applovin.impl.T0;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;
import p2.ExecutorC3758a;

/* renamed from: w9.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4392k {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f47444a = TaskExecutors.MAIN_THREAD;

    /* renamed from: b, reason: collision with root package name */
    public static final T0 f47445b = new T0(1);

    /* renamed from: c, reason: collision with root package name */
    public static final ExecutorC3758a f47446c;

    static {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        f47446c = new ExecutorC3758a();
    }
}
