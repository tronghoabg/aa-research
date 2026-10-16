package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g extends i {
    public final /* synthetic */ FileSystem a;

    public g(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ i k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof h ? ((h) fileSystem).a : new g(fileSystem);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ Iterable a() {
        return this.a.getFileStores();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ Path b(String str, String[] strArr) {
        return x.h(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ f0 c(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof e0 ? ((e0) pathMatcher).a : new d0(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    @Override // j$.nio.file.i
    public final Iterable d() {
        return new b0(this.a.getRootDirectories());
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ String e() {
        return this.a.getSeparator();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof g) {
            obj = ((g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.desugar.sun.nio.fs.g f() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof j$.nio.file.attribute.w0 ? ((j$.nio.file.attribute.w0) userPrincipalLookupService).a : new j$.nio.file.attribute.v0(userPrincipalLookupService);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ boolean g() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ x0 h() {
        return v0.a(this.a.newWatchService());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ j$.nio.file.spi.c i() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = j$.nio.file.spi.a.c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.i
    public final /* synthetic */ Set j() {
        return this.a.supportedFileAttributeViews();
    }
}
