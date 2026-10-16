package j$.nio.file;

import j$.nio.file.attribute.v0;
import j$.nio.file.attribute.w0;
import j$.nio.file.spi.FileSystemProvider;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileSystem f49750a;

    public g(FileSystem fileSystem) {
        this.f49750a = fileSystem;
    }

    public static /* synthetic */ i I(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof h ? ((h) fileSystem).f49751a : new g(fileSystem);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ Set H() {
        return this.f49750a.supportedFileAttributeViews();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f49750a.close();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ Iterable e() {
        return this.f49750a.getFileStores();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.f49750a;
        if (obj instanceof g) {
            obj = ((g) obj).f49750a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ Path g(String str, String[] strArr) {
        return p.f(this.f49750a.getPath(str, strArr));
    }

    public final /* synthetic */ int hashCode() {
        return this.f49750a.hashCode();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ x i(String str) {
        PathMatcher pathMatcher = this.f49750a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof w ? ((w) pathMatcher).f49782a : new v(pathMatcher);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ boolean isOpen() {
        return this.f49750a.isOpen();
    }

    @Override // j$.nio.file.i
    public final Iterable j() {
        return new t(this.f49750a.getRootDirectories());
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ String n() {
        return this.f49750a.getSeparator();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.com.android.tools.r8.a p() {
        UserPrincipalLookupService userPrincipalLookupService = this.f49750a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof w0 ? ((w0) userPrincipalLookupService).f49737a : new v0(userPrincipalLookupService);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ boolean q() {
        return this.f49750a.isReadOnly();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ p0 r() {
        return n0.e(this.f49750a.newWatchService());
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ FileSystemProvider v() {
        java.nio.file.spi.FileSystemProvider fileSystemProviderProvider = this.f49750a.provider();
        int i2 = j$.nio.file.spi.a.f49775f;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).f49778a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }
}
