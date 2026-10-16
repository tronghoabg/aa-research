package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements java.nio.file.attribute.FileAttribute {
    public final /* synthetic */ j$.nio.file.attribute.r a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.r rVar = this.a;
        if (obj instanceof j$.nio.file.attribute.q) {
            obj = ((j$.nio.file.attribute.q) obj).a;
        }
        return rVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ java.lang.Object value() {
        return this.a.value();
    }
}
