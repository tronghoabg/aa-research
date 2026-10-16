package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v0 implements j$.nio.file.x0 {
    public final /* synthetic */ java.nio.file.WatchService a;

    public /* synthetic */ v0(java.nio.file.WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ j$.nio.file.x0 a(java.nio.file.WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof j$.nio.file.w0 ? ((j$.nio.file.w0) watchService).a : new j$.nio.file.v0(watchService);
    }

    public final /* synthetic */ j$.nio.file.u0 b() {
        return j$.nio.file.s0.b(this.a.poll());
    }

    public final /* synthetic */ j$.nio.file.u0 c(long j, java.util.concurrent.TimeUnit timeUnit) {
        return j$.nio.file.s0.b(this.a.poll(j, timeUnit));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ j$.nio.file.u0 d() {
        return j$.nio.file.s0.b(this.a.take());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchService watchService = this.a;
        if (obj instanceof j$.nio.file.v0) {
            obj = ((j$.nio.file.v0) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
