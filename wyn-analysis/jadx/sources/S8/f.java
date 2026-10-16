package S8;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final e f11033d = new e();

    /* renamed from: a, reason: collision with root package name */
    public final c f11034a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11035b;

    /* renamed from: c, reason: collision with root package name */
    public final c f11036c;

    public f(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        AbstractC3340k.e(backgroundExecutorService, "backgroundExecutorService");
        AbstractC3340k.e(blockingExecutorService, "blockingExecutorService");
        this.f11034a = new c(backgroundExecutorService);
        this.f11035b = new c(backgroundExecutorService);
        Tasks.forResult(null);
        this.f11036c = new c(blockingExecutorService);
    }

    public static final void a() {
        if (((Boolean) new d(0, f11033d, e.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new d(0, f11033d, e.class, "isBlockingThread", "isBlockingThread()Z", 0, 1).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
