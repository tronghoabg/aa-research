package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ajdk extends aiuz implements Executor {
    public static final ajdk a = new ajdk();
    private static final aitu b = ajdq.a.g(afuq.d("kotlinx.coroutines.io.parallelism", afpt.e(64, ajda.a), Alert.DURATION_SHOW_INDEFINITELY));

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        b.a(afcoVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(afcp.a, runnable);
    }

    @Override // defpackage.aitu
    public final void f(afco afcoVar, Runnable runnable) throws aiui {
        b.f(afcoVar, runnable);
    }

    @Override // defpackage.aitu
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.aiuz
    public final Executor e() {
        return this;
    }
}
