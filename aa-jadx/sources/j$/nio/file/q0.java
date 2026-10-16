package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0 implements java.nio.file.WatchEvent {
    public final /* synthetic */ j$.nio.file.r0 a;

    public /* synthetic */ q0(j$.nio.file.r0 r0Var) {
        this.a = r0Var;
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ java.lang.Object context() {
        return j$.nio.file.a.g(((j$.nio.file.p0) this.a).a());
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ int count() {
        return ((j$.nio.file.p0) this.a).b();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.r0 r0Var = this.a;
        if (obj instanceof j$.nio.file.q0) {
            obj = ((j$.nio.file.q0) obj).a;
        }
        return r0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent
    public final /* synthetic */ java.nio.file.WatchEvent.Kind kind() {
        return j$.nio.file.a.f(((j$.nio.file.p0) this.a).c());
    }
}
