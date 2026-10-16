package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements j$.nio.file.attribute.d0 {
    public final /* synthetic */ java.nio.file.attribute.FileStoreAttributeView a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.FileStoreAttributeView fileStoreAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.b0) {
            obj = ((j$.nio.file.attribute.b0) obj).a;
        }
        return fileStoreAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }
}
