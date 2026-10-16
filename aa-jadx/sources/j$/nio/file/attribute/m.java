package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements j$.nio.file.attribute.o {
    public final /* synthetic */ java.nio.file.attribute.DosFileAttributes a;

    public final /* synthetic */ boolean a() {
        return this.a.isArchive();
    }

    public final /* synthetic */ boolean b() {
        return this.a.isHidden();
    }

    public final /* synthetic */ boolean c() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ j$.nio.file.attribute.FileTime creationTime() {
        return j$.nio.file.attribute.u.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean d() {
        return this.a.isSystem();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof j$.nio.file.attribute.m) {
            obj = ((j$.nio.file.attribute.m) obj).a;
        }
        return dosFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.lang.Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ j$.nio.file.attribute.FileTime lastAccessTime() {
        return j$.nio.file.attribute.u.b(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ j$.nio.file.attribute.FileTime lastModifiedTime() {
        return j$.nio.file.attribute.u.b(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
