package j$.nio.file.attribute;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class i implements java.nio.file.attribute.BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicFileAttributes f49715a;

    public /* synthetic */ i(BasicFileAttributes basicFileAttributes) {
        this.f49715a = basicFileAttributes;
    }

    public static /* synthetic */ java.nio.file.attribute.BasicFileAttributes a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof h) {
            return ((h) basicFileAttributes).f49714a;
        }
        if (basicFileAttributes instanceof o) {
            o oVar = (o) basicFileAttributes;
            return oVar instanceof m ? ((m) oVar).f49721a : new n(oVar);
        }
        if (!(basicFileAttributes instanceof n0)) {
            return new i(basicFileAttributes);
        }
        n0 n0Var = (n0) basicFileAttributes;
        return n0Var instanceof l0 ? ((l0) n0Var).f49720a : new m0(n0Var);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime creationTime() {
        return u.c(this.f49715a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.f49715a;
        if (obj instanceof i) {
            obj = ((i) obj).f49715a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f49715a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49715a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f49715a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f49715a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f49715a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f49715a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastAccessTime() {
        return u.c(this.f49715a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastModifiedTime() {
        return u.c(this.f49715a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f49715a.size();
    }
}
