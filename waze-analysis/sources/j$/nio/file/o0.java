package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class o0 implements WatchService {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f49763a;

    public /* synthetic */ o0(p0 p0Var) {
        this.f49763a = p0Var;
    }

    public static /* synthetic */ WatchService e(p0 p0Var) {
        if (p0Var == null) {
            return null;
        }
        return p0Var instanceof n0 ? ((n0) p0Var).f49760a : new o0(p0Var);
    }

    @Override // java.nio.file.WatchService, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ((n0) this.f49763a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        p0 p0Var = this.f49763a;
        if (obj instanceof o0) {
            obj = ((o0) obj).f49763a;
        }
        return p0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49763a.hashCode();
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll() {
        return l0.a(((n0) this.f49763a).g());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey take() {
        return l0.a(((n0) this.f49763a).j());
    }

    @Override // java.nio.file.WatchService
    public final /* synthetic */ WatchKey poll(long j2, TimeUnit timeUnit) {
        return l0.a(((n0) this.f49763a).i(j2, timeUnit));
    }
}
