package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements j$.nio.file.attribute.a0 {
    public final /* synthetic */ java.nio.file.attribute.FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ void b(j$.nio.file.attribute.u0 u0Var) throws java.io.IOException {
        this.a.setOwner(j$.nio.file.attribute.t0.a(u0Var));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof j$.nio.file.attribute.y) {
            obj = ((j$.nio.file.attribute.y) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ j$.nio.file.attribute.u0 getOwner() {
        return j$.nio.file.attribute.s0.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ java.lang.String name() {
        return this.a.name();
    }
}
