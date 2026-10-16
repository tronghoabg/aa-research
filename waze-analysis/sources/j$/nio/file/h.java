package j$.nio.file;

import j$.nio.file.attribute.v0;
import j$.nio.file.attribute.w0;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class h extends FileSystem {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f49751a;

    public /* synthetic */ h(i iVar) {
        this.f49751a = iVar;
    }

    public static /* synthetic */ FileSystem e(i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar instanceof g ? ((g) iVar).f49750a : new h(iVar);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f49751a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        i iVar = this.f49751a;
        if (obj instanceof h) {
            obj = ((h) obj).f49751a;
        }
        return iVar.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.f49751a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return q.f(this.f49751a.g(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        x xVarI = this.f49751a.i(str);
        if (xVarI == null) {
            return null;
        }
        return xVarI instanceof v ? ((v) xVarI).f49781a : new w(xVarI);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new t(this.f49751a.j());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.f49751a.n();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.com.android.tools.r8.a aVarP = this.f49751a.p();
        int i2 = w0.f49736b;
        if (aVarP == null) {
            return null;
        }
        return aVarP instanceof v0 ? ((v0) aVarP).f49734a : new w0(aVarP);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49751a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.f49751a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.f49751a.q();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        return o0.e(this.f49751a.r());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.FileSystemProvider fileSystemProviderV = this.f49751a.v();
        int i2 = j$.nio.file.spi.b.f49777b;
        if (fileSystemProviderV == null) {
            return null;
        }
        return fileSystemProviderV instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) fileSystemProviderV).f49776e : new j$.nio.file.spi.b(fileSystemProviderV);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.f49751a.H();
    }
}
