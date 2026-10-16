package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements java.nio.file.attribute.FileAttributeView {
    public final /* synthetic */ j$.nio.file.attribute.x a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.x xVar = this.a;
        if (obj instanceof j$.nio.file.attribute.w) {
            obj = ((j$.nio.file.attribute.w) obj).a;
        }
        return xVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }
}
