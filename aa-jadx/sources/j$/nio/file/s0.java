package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s0 implements j$.nio.file.u0 {
    public final /* synthetic */ java.nio.file.WatchKey a;

    public /* synthetic */ s0(java.nio.file.WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ j$.nio.file.u0 b(java.nio.file.WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof j$.nio.file.t0 ? ((j$.nio.file.t0) watchKey).a : new j$.nio.file.s0(watchKey);
    }

    public final /* synthetic */ void a() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean c() {
        return this.a.isValid();
    }

    public final /* synthetic */ java.util.List d() {
        return j$.nio.file.a.n(this.a.pollEvents());
    }

    public final /* synthetic */ boolean e() {
        return this.a.reset();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchKey watchKey = this.a;
        if (obj instanceof j$.nio.file.s0) {
            obj = ((j$.nio.file.s0) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ j$.nio.file.a1 f() {
        java.nio.file.Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        if (watchable instanceof j$.nio.file.z0) {
            return ((j$.nio.file.z0) watchable).a;
        }
        return watchable instanceof java.nio.file.Path ? j$.nio.file.x.h((java.nio.file.Path) watchable) : new j$.nio.file.y0(watchable);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
