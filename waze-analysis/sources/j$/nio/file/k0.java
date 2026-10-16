package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class k0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WatchKey f49756a;

    public /* synthetic */ k0(WatchKey watchKey) {
        this.f49756a = watchKey;
    }

    public static /* synthetic */ m0 b(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof l0 ? ((l0) watchKey).f49758a : new k0(watchKey);
    }

    public final /* synthetic */ void a() {
        this.f49756a.cancel();
    }

    public final /* synthetic */ boolean c() {
        return this.f49756a.isValid();
    }

    public final /* synthetic */ List d() {
        return a.n(this.f49756a.pollEvents());
    }

    public final /* synthetic */ boolean e() {
        return this.f49756a.reset();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.f49756a;
        if (obj instanceof k0) {
            obj = ((k0) obj).f49756a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ s0 f() {
        Watchable watchable = this.f49756a.watchable();
        if (watchable == null) {
            return null;
        }
        return watchable instanceof r0 ? ((r0) watchable).f49769a : watchable instanceof java.nio.file.Path ? p.f((java.nio.file.Path) watchable) : new q0(watchable);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49756a.hashCode();
    }
}
