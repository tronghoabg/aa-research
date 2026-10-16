package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements j$.nio.file.v {
    public final /* synthetic */ java.nio.file.OpenOption a;

    public /* synthetic */ t(java.nio.file.OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.v, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.v, java.nio.file.LinkOption] */
    public static /* synthetic */ j$.nio.file.v a(java.nio.file.OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof j$.nio.file.u) {
            return ((j$.nio.file.u) openOption).a;
        }
        if (openOption instanceof j$.nio.file.LinkOption) {
            return j$.nio.file.a.c((j$.nio.file.LinkOption) openOption);
        }
        return openOption instanceof j$.nio.file.g0 ? j$.nio.file.a.e((j$.nio.file.g0) openOption) : new j$.nio.file.t(openOption);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.OpenOption openOption = this.a;
        if (obj instanceof j$.nio.file.t) {
            obj = ((j$.nio.file.t) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
