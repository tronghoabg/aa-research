package j$.nio.file;

import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v0 implements x0 {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ v0(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ x0 a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof w0 ? ((w0) watchService).a : new v0(watchService);
    }

    public final /* synthetic */ u0 b() {
        return s0.b(this.a.poll());
    }

    public final /* synthetic */ u0 c(long j, TimeUnit timeUnit) {
        return s0.b(this.a.poll(j, timeUnit));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ u0 d() {
        return s0.b(this.a.take());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof v0) {
            obj = ((v0) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
