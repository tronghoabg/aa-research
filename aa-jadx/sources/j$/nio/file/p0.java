package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p0 implements j$.nio.file.r0 {
    public final /* synthetic */ java.nio.file.WatchEvent a;

    public /* synthetic */ p0(java.nio.file.WatchEvent watchEvent) {
        this.a = watchEvent;
    }

    public final /* synthetic */ java.lang.Object a() {
        return j$.nio.file.a.g(this.a.context());
    }

    public final /* synthetic */ int b() {
        return this.a.count();
    }

    public final /* synthetic */ j$.nio.file.l0 c() {
        return j$.nio.file.a.b(this.a.kind());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchEvent watchEvent = this.a;
        if (obj instanceof j$.nio.file.p0) {
            obj = ((j$.nio.file.p0) obj).a;
        }
        return watchEvent.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
