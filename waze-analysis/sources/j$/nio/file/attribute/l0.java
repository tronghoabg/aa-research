package j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class l0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PosixFileAttributes f49720a;

    public /* synthetic */ l0(PosixFileAttributes posixFileAttributes) {
        this.f49720a = posixFileAttributes;
    }

    public final /* synthetic */ h0 a() {
        return f0.a(this.f49720a.group());
    }

    public final /* synthetic */ u0 b() {
        return s0.a(this.f49720a.owner());
    }

    public final /* synthetic */ Set c() {
        return j$.nio.file.a.m(this.f49720a.permissions());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return u.b(this.f49720a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.f49720a;
        if (obj instanceof l0) {
            obj = ((l0) obj).f49720a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f49720a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49720a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f49720a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f49720a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f49720a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f49720a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return u.b(this.f49720a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return u.b(this.f49720a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f49720a.size();
    }
}
