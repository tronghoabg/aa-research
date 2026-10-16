package j$.nio.file;

import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchService f49760a;

    public /* synthetic */ n0(WatchService watchService) {
        this.f49760a = watchService;
    }

    public static /* synthetic */ p0 e(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return watchService instanceof o0 ? ((o0) watchService).f49763a : new n0(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f49760a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.f49760a;
        if (obj instanceof n0) {
            obj = ((n0) obj).f49760a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ m0 g() {
        return k0.b(this.f49760a.poll());
    }

    public final /* synthetic */ int hashCode() {
        return this.f49760a.hashCode();
    }

    public final /* synthetic */ m0 i(long j2, TimeUnit timeUnit) {
        return k0.b(this.f49760a.poll(j2, timeUnit));
    }

    public final /* synthetic */ m0 j() {
        return k0.b(this.f49760a.take());
    }
}
