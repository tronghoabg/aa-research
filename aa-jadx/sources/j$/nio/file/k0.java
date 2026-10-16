package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k0 implements java.nio.file.WatchEvent.Kind {
    public final /* synthetic */ j$.nio.file.l0 a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.l0 l0Var = this.a;
        if (obj instanceof j$.nio.file.k0) {
            obj = ((j$.nio.file.k0) obj).a;
        }
        return l0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }

    @Override // java.nio.file.WatchEvent.Kind
    public final /* synthetic */ java.lang.Class type() {
        return this.a.type();
    }
}
