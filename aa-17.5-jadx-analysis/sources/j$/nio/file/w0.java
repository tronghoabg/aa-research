package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements WatchService {
    public final /* synthetic */ x0 a;

    public /* synthetic */ w0(x0 x0Var) {
        this.a = x0Var;
    }

    public static /* synthetic */ WatchService a(x0 x0Var) {
        if (x0Var == null) {
            return null;
        }
        return x0Var instanceof v0 ? ((v0) x0Var).a : new w0(x0Var);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((v0) this.a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        x0 x0Var = this.a;
        if (obj instanceof w0) {
            obj = ((w0) obj).a;
        }
        return x0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return t0.a(((v0) this.a).b());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return t0.a(((v0) this.a).d());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j, TimeUnit timeUnit) {
        return t0.a(((v0) this.a).c(j, timeUnit));
    }
}
