package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements u0 {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ s0(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ u0 b(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return watchKey instanceof t0 ? ((t0) watchKey).a : new s0(watchKey);
    }

    public final /* synthetic */ void a() {
        this.a.cancel();
    }

    public final /* synthetic */ boolean c() {
        return this.a.isValid();
    }

    public final /* synthetic */ List d() {
        return a.n(this.a.pollEvents());
    }

    public final /* synthetic */ boolean e() {
        return this.a.reset();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof s0) {
            obj = ((s0) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ a1 f() {
        Watchable watchable = this.a.watchable();
        if (watchable == null) {
            return null;
        }
        return watchable instanceof z0 ? ((z0) watchable).a : watchable instanceof java.nio.file.Path ? x.h((java.nio.file.Path) watchable) : new y0(watchable);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
