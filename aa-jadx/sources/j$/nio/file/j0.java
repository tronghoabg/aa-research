package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements j$.nio.file.l0 {
    public final /* synthetic */ java.nio.file.WatchEvent.Kind a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchEvent.Kind kind = this.a;
        if (obj instanceof j$.nio.file.j0) {
            obj = ((j$.nio.file.j0) obj).a;
        }
        return kind.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.l0
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.l0
    public final /* synthetic */ java.lang.Class type() {
        return this.a.type();
    }
}
