package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class c implements BasicFileAttributes {

    /* renamed from: a, reason: collision with root package name */
    public final FileTime f49648a;

    /* renamed from: b, reason: collision with root package name */
    public final FileTime f49649b;

    /* renamed from: c, reason: collision with root package name */
    public final FileTime f49650c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49651d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49652e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49653f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f49654g;

    /* renamed from: h, reason: collision with root package name */
    public final long f49655h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f49656i;

    public c(FileTime fileTime, FileTime fileTime2, FileTime fileTime3, boolean z, boolean z2, boolean z3, boolean z4, long j2, Integer num) {
        this.f49648a = fileTime;
        this.f49649b = fileTime2;
        this.f49650c = fileTime3;
        this.f49651d = z;
        this.f49652e = z2;
        this.f49653f = z3;
        this.f49654g = z4;
        this.f49655h = j2;
        this.f49656i = num;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime creationTime() {
        return this.f49650c;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final Object fileKey() {
        return this.f49656i;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.f49652e;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.f49654g;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.f49651d;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f49653f;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastAccessTime() {
        return this.f49649b;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final FileTime lastModifiedTime() {
        return this.f49648a;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.f49655h;
    }
}
