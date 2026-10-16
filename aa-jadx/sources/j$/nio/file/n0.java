package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements java.nio.file.WatchEvent.Modifier {
    public final /* synthetic */ j$.nio.file.o0 a;

    public /* synthetic */ n0(j$.nio.file.o0 o0Var) {
        this.a = o0Var;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.o0 o0Var = this.a;
        if (obj instanceof j$.nio.file.n0) {
            obj = ((j$.nio.file.n0) obj).a;
        }
        return o0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchEvent.Modifier
    public final /* synthetic */ java.lang.String name() {
        return ((j$.nio.file.m0) this.a).a();
    }
}
