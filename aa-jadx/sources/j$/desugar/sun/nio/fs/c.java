package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements j$.nio.file.attribute.BasicFileAttributes {
    public final j$.nio.file.attribute.FileTime a;
    public final j$.nio.file.attribute.FileTime b;
    public final j$.nio.file.attribute.FileTime c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final java.lang.Integer i;

    public c(j$.nio.file.attribute.FileTime fileTime, j$.nio.file.attribute.FileTime fileTime2, j$.nio.file.attribute.FileTime fileTime3, boolean z, boolean z2, boolean z3, boolean z4, long j, java.lang.Integer num) {
        this.a = fileTime;
        this.b = fileTime2;
        this.c = fileTime3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final j$.nio.file.attribute.FileTime creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final java.lang.Object fileKey() {
        return this.i;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final j$.nio.file.attribute.FileTime lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final j$.nio.file.attribute.FileTime lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.h;
    }
}
