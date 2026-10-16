package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements j$.nio.file.attribute.r {
    public final /* synthetic */ java.nio.file.attribute.FileAttribute a;

    public s(java.nio.file.attribute.FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.r
    public final java.lang.String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.r
    public final java.lang.Object value() {
        return java.util.Collections.unmodifiableSet(j$.nio.file.a.m((java.util.Set) this.a.value()));
    }
}
