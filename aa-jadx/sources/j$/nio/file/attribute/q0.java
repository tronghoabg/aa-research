package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0 implements java.nio.file.attribute.UserDefinedFileAttributeView {
    public final /* synthetic */ j$.nio.file.attribute.r0 a;

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ void delete(java.lang.String str) throws java.io.IOException {
        ((j$.nio.file.attribute.p0) this.a).c(str);
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.r0 r0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.q0) {
            obj = ((j$.nio.file.attribute.q0) obj).a;
        }
        return r0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ java.util.List list() {
        return ((j$.nio.file.attribute.p0) this.a).d();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ java.lang.String name() {
        return ((j$.nio.file.attribute.p0) this.a).name();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int read(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return ((j$.nio.file.attribute.p0) this.a).e(str, byteBuffer);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int size(java.lang.String str) {
        return ((j$.nio.file.attribute.p0) this.a).f(str);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int write(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        return ((j$.nio.file.attribute.p0) this.a).g(str, byteBuffer);
    }
}
