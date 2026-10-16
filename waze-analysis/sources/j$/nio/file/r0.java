package j$.nio.file;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class r0 implements Watchable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f49769a;

    public /* synthetic */ r0(s0 s0Var) {
        this.f49769a = s0Var;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        s0 s0Var = this.f49769a;
        if (obj instanceof r0) {
            obj = ((r0) obj).f49769a;
        }
        return s0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49769a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return l0.a(this.f49769a.e(n0.e(watchService), a0.i(kindArr), a0.j(modifierArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return l0.a(this.f49769a.g(n0.e(watchService), a0.i(kindArr)));
    }
}
