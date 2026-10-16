package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z0 implements java.nio.file.Watchable {
    public final /* synthetic */ j$.nio.file.a1 a;

    public /* synthetic */ z0(j$.nio.file.a1 a1Var) {
        this.a = a1Var;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.a1 a1Var = this.a;
        if (obj instanceof j$.nio.file.z0) {
            obj = ((j$.nio.file.z0) obj).a;
        }
        return a1Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ java.nio.file.WatchKey register(java.nio.file.WatchService watchService, java.nio.file.WatchEvent.Kind[] kindArr, java.nio.file.WatchEvent.Modifier[] modifierArr) {
        return j$.nio.file.t0.a(this.a.c(j$.nio.file.v0.a(watchService), j$.nio.file.i0.i(kindArr), j$.nio.file.i0.j(modifierArr)));
    }

    @Override // java.nio.file.Watchable
    public final /* synthetic */ java.nio.file.WatchKey register(java.nio.file.WatchService watchService, java.nio.file.WatchEvent.Kind[] kindArr) {
        return j$.nio.file.t0.a(this.a.f(j$.nio.file.v0.a(watchService), j$.nio.file.i0.i(kindArr)));
    }
}
