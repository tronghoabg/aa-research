package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m0 implements j$.nio.file.o0 {
    public final /* synthetic */ java.nio.file.WatchEvent.Modifier a;

    public final /* synthetic */ java.lang.String a() {
        return this.a.name();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.WatchEvent.Modifier modifier = this.a;
        if (obj instanceof j$.nio.file.m0) {
            obj = ((j$.nio.file.m0) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
