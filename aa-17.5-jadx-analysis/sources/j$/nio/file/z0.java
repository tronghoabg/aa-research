package j$.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements Watchable {
    public final /* synthetic */ a1 a;

    public /* synthetic */ z0(a1 a1Var) {
        this.a = a1Var;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        a1 a1Var = this.a;
        if (obj instanceof z0) {
            obj = ((z0) obj).a;
        }
        return a1Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return t0.a(this.a.c(v0.a(watchService), i0.i(kindArr), i0.j(modifierArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return t0.a(this.a.f(v0.a(watchService), i0.i(kindArr)));
    }
}
