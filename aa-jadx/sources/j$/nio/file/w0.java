package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w0 implements java.nio.file.WatchService {
    public final /* synthetic */ j$.nio.file.x0 a;

    public /* synthetic */ w0(j$.nio.file.x0 x0Var) {
        this.a = x0Var;
    }

    public static /* synthetic */ java.nio.file.WatchService a(j$.nio.file.x0 x0Var) {
        if (x0Var == null) {
            return null;
        }
        return x0Var instanceof j$.nio.file.v0 ? ((j$.nio.file.v0) x0Var).a : new j$.nio.file.w0(x0Var);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((j$.nio.file.v0) this.a).close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.x0 x0Var = this.a;
        if (obj instanceof j$.nio.file.w0) {
            obj = ((j$.nio.file.w0) obj).a;
        }
        return x0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ java.nio.file.WatchKey poll() {
        return j$.nio.file.t0.a(((j$.nio.file.v0) this.a).b());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ java.nio.file.WatchKey take() {
        return j$.nio.file.t0.a(((j$.nio.file.v0) this.a).d());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ java.nio.file.WatchKey poll(long j, java.util.concurrent.TimeUnit timeUnit) {
        return j$.nio.file.t0.a(((j$.nio.file.v0) this.a).c(j, timeUnit));
    }
}
