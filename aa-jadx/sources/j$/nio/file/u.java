package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements java.nio.file.OpenOption {
    public final /* synthetic */ j$.nio.file.v a;

    public /* synthetic */ u(j$.nio.file.v vVar) {
        this.a = vVar;
    }

    public static /* synthetic */ java.nio.file.OpenOption a(j$.nio.file.v vVar) {
        if (vVar == null) {
            return null;
        }
        if (vVar instanceof j$.nio.file.t) {
            return ((j$.nio.file.t) vVar).a;
        }
        if (vVar instanceof j$.nio.file.LinkOption) {
            return j$.nio.file.a.c((j$.nio.file.LinkOption) vVar);
        }
        return vVar instanceof j$.nio.file.g0 ? j$.nio.file.a.e((j$.nio.file.g0) vVar) : new j$.nio.file.u(vVar);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.v vVar = this.a;
        if (obj instanceof j$.nio.file.u) {
            obj = ((j$.nio.file.u) obj).a;
        }
        return vVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
