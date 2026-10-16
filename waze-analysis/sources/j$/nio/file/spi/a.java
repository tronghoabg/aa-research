package j$.nio.file.spi;

import j$.nio.channels.c;
import j$.nio.file.CopyOption;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.a0;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.h;
import j$.nio.file.attribute.i0;
import j$.nio.file.attribute.j;
import j$.nio.file.attribute.j0;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.p0;
import j$.nio.file.attribute.q0;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.w;
import j$.nio.file.attribute.x;
import j$.nio.file.attribute.y;
import j$.nio.file.attribute.z;
import j$.nio.file.g;
import j$.nio.file.i;
import j$.nio.file.m;
import j$.nio.file.n;
import j$.nio.file.p;
import j$.nio.file.q;
import j$.nio.file.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class a extends FileSystemProvider {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f49775f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.nio.file.spi.FileSystemProvider f49776e;

    public /* synthetic */ a(java.nio.file.spi.FileSystemProvider fileSystemProvider) {
        this.f49776e = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void a(Path path, j$.nio.file.b[] bVarArr) throws IOException {
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.f49776e;
        java.nio.file.Path pathF = q.f(path);
        AccessMode[] accessModeArr = null;
        if (bVarArr != null) {
            int length = bVarArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i2 = 0; i2 < length; i2++) {
                j$.nio.file.b bVar = bVarArr[i2];
                accessModeArr2[i2] = bVar == null ? null : bVar == j$.nio.file.b.READ ? AccessMode.READ : bVar == j$.nio.file.b.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathF, accessModeArr);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.f49776e.copy(q.f(path), q.f(path2), j$.com.android.tools.r8.a.M(copyOptionArr));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void c(Path path, r[] rVarArr) throws IOException {
        this.f49776e.createDirectory(q.f(path), j$.com.android.tools.r8.a.N(rVarArr));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.f49776e.createLink(q.f(path), q.f(path2));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void e(Path path, Path path2, r[] rVarArr) throws IOException {
        this.f49776e.createSymbolicLink(q.f(path), q.f(path2), j$.com.android.tools.r8.a.N(rVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.f49776e;
        if (obj instanceof a) {
            obj = ((a) obj).f49776e;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void f(Path path) throws IOException {
        this.f49776e.delete(q.f(path));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean g(Path path) {
        return this.f49776e.deleteIfExists(q.f(path));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return p.f(this.f49776e.getPath(uri));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.f49776e.getScheme();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ x h(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView fileAttributeView = this.f49776e.getFileAttributeView(q.f(path), j$.nio.file.a.h(cls), a0.k(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof w) {
            return ((w) fileAttributeView).f49735a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof f) {
                return ((f) basicFileAttributeView).f49711a;
            }
            if (basicFileAttributeView instanceof DosFileAttributeView) {
                DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
                return dosFileAttributeView instanceof k ? ((k) dosFileAttributeView).f49719a : new j(dosFileAttributeView);
            }
            if (!(basicFileAttributeView instanceof PosixFileAttributeView)) {
                return new e(basicFileAttributeView);
            }
            PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) basicFileAttributeView;
            return posixFileAttributeView instanceof j0 ? ((j0) posixFileAttributeView).f49718a : new i0(posixFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            if (!(fileAttributeView instanceof UserDefinedFileAttributeView)) {
                return new v(fileAttributeView);
            }
            UserDefinedFileAttributeView userDefinedFileAttributeView = (UserDefinedFileAttributeView) fileAttributeView;
            return userDefinedFileAttributeView instanceof q0 ? ((q0) userDefinedFileAttributeView).f49728a : new p0(userDefinedFileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof z) {
            return ((z) fileOwnerAttributeView).f49739a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            AclFileAttributeView aclFileAttributeView = (AclFileAttributeView) fileOwnerAttributeView;
            return aclFileAttributeView instanceof j$.nio.file.attribute.b ? ((j$.nio.file.attribute.b) aclFileAttributeView).f49706a : new j$.nio.file.attribute.a(aclFileAttributeView);
        }
        if (!(fileOwnerAttributeView instanceof PosixFileAttributeView)) {
            return new y(fileOwnerAttributeView);
        }
        PosixFileAttributeView posixFileAttributeView2 = (PosixFileAttributeView) fileOwnerAttributeView;
        return posixFileAttributeView2 instanceof j0 ? ((j0) posixFileAttributeView2).f49718a : new i0(posixFileAttributeView2);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49776e.hashCode();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ a0 i(Path path) throws IOException {
        FileStore fileStore = this.f49776e.getFileStore(q.f(path));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof j$.nio.file.f ? ((j$.nio.file.f) fileStore).f49748a : new j$.nio.file.e(fileStore);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ i j(URI uri) {
        return g.I(this.f49776e.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean k(Path path) {
        return this.f49776e.isHidden(q.f(path));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean l(Path path, Path path2) {
        return this.f49776e.isSameFile(q.f(path), q.f(path2));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void m(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.f49776e.move(q.f(path), q.f(path2), j$.com.android.tools.r8.a.M(copyOptionArr));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ c n(Path path, Set set, ExecutorService executorService, r[] rVarArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.f49776e.newAsynchronousFileChannel(q.f(path), j$.nio.file.a.l(set), executorService, j$.com.android.tools.r8.a.N(rVarArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return asynchronousFileChannelNewAsynchronousFileChannel instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelNewAsynchronousFileChannel).f49692a : new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel o(Path path, Set set, r[] rVarArr) {
        return this.f49776e.newByteChannel(q.f(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.N(rVarArr));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final DirectoryStream p(Path path, j$.desugar.sun.nio.fs.g gVar) {
        return new s(this.f49776e.newDirectoryStream(q.f(path), new j$.desugar.sun.nio.fs.g(1, gVar)));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel q(Path path, Set set, r[] rVarArr) {
        return this.f49776e.newFileChannel(q.f(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.N(rVarArr));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ i r(Path path, Map map) {
        return g.I(this.f49776e.newFileSystem(q.f(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ i s(URI uri, Map map) {
        return g.I(this.f49776e.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream t(Path path, n[] nVarArr) {
        OpenOption[] openOptionArr;
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.f49776e;
        java.nio.file.Path pathF = q.f(path);
        if (nVarArr == null) {
            openOptionArr = null;
        } else {
            int length = nVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i2 = 0; i2 < length; i2++) {
                openOptionArr2[i2] = m.a(nVarArr[i2]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathF, openOptionArr);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream u(Path path, n[] nVarArr) {
        OpenOption[] openOptionArr;
        java.nio.file.spi.FileSystemProvider fileSystemProvider = this.f49776e;
        java.nio.file.Path pathF = q.f(path);
        if (nVarArr == null) {
            openOptionArr = null;
        } else {
            int length = nVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i2 = 0; i2 < length; i2++) {
                openOptionArr2[i2] = m.a(nVarArr[i2]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathF, openOptionArr);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes v(Path path, Class cls, LinkOption[] linkOptionArr) {
        return h.a(this.f49776e.readAttributes(q.f(path), j$.nio.file.a.i(cls), a0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map w(Path path, String str, LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.f49776e.readAttributes(q.f(path), str, a0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path x(Path path) {
        return p.f(this.f49776e.readSymbolicLink(q.f(path)));
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void y(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.f49776e.setAttribute(q.f(path), str, j$.nio.file.a.k(obj), a0.k(linkOptionArr));
    }
}
