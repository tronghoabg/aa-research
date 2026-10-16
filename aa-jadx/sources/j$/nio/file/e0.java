package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e0 implements java.nio.file.PathMatcher {
    public final /* synthetic */ j$.nio.file.f0 a;

    public /* synthetic */ e0(j$.nio.file.f0 f0Var) {
        this.a = f0Var;
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.f0 f0Var = this.a;
        if (obj instanceof j$.nio.file.e0) {
            obj = ((j$.nio.file.e0) obj).a;
        }
        return f0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.c(j$.nio.file.x.h(path));
    }
}
