package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DosFileAttributes f49721a;

    public final /* synthetic */ boolean a() {
        return this.f49721a.isArchive();
    }

    public final /* synthetic */ boolean b() {
        return this.f49721a.isHidden();
    }

    public final /* synthetic */ boolean c() {
        return this.f49721a.isReadOnly();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return u.b(this.f49721a.creationTime());
    }

    public final /* synthetic */ boolean d() {
        return this.f49721a.isSystem();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.f49721a;
        if (obj instanceof m) {
            obj = ((m) obj).f49721a;
        }
        return dosFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f49721a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49721a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f49721a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f49721a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f49721a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f49721a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return u.b(this.f49721a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return u.b(this.f49721a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f49721a.size();
    }
}
