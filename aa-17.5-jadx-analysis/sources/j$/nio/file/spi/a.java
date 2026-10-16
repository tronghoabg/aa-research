package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.CopyOption;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.a0;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.j;
import j$.nio.file.attribute.j0;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.p0;
import j$.nio.file.attribute.q0;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.w;
import j$.nio.file.attribute.x;
import j$.nio.file.attribute.z;
import j$.nio.file.i;
import j$.nio.file.i0;
import j$.nio.file.u;
import j$.nio.file.y;
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
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a extends c {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ a(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.b.setAttribute(y.h(path), str, j$.nio.file.a.k(obj), i0.k(linkOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(Path path, j$.nio.file.b[] bVarArr) throws IOException {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = y.h(path);
        AccessMode[] accessModeArr = null;
        if (bVarArr != null) {
            int length = bVarArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                j$.nio.file.b bVar = bVarArr[i];
                accessModeArr2[i] = bVar == null ? null : bVar == j$.nio.file.b.READ ? AccessMode.READ : bVar == j$.nio.file.b.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathH, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.copy(y.h(path), y.h(path2), g.D(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(Path path, r[] rVarArr) throws IOException {
        this.b.createDirectory(y.h(path), g.E(rVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(y.h(path), y.h(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(Path path, Path path2, r[] rVarArr) throws IOException {
        this.b.createSymbolicLink(y.h(path), y.h(path2), g.E(rVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof a) {
            obj = ((a) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void f(Path path) throws IOException {
        this.b.delete(y.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(y.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ x h(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(y.h(path), j$.nio.file.a.h(cls), i0.k(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof w) {
            return ((w) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof f) {
                return ((f) basicFileAttributeView).a;
            }
            if (basicFileAttributeView instanceof DosFileAttributeView) {
                DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
                return dosFileAttributeView instanceof k ? ((k) dosFileAttributeView).a : new j(dosFileAttributeView);
            }
            if (!(basicFileAttributeView instanceof PosixFileAttributeView)) {
                return new e(basicFileAttributeView);
            }
            PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) basicFileAttributeView;
            return posixFileAttributeView instanceof j0 ? ((j0) posixFileAttributeView).a : new j$.nio.file.attribute.i0(posixFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            if (!(fileAttributeView instanceof UserDefinedFileAttributeView)) {
                return new v(fileAttributeView);
            }
            UserDefinedFileAttributeView userDefinedFileAttributeView = (UserDefinedFileAttributeView) fileAttributeView;
            return userDefinedFileAttributeView instanceof q0 ? ((q0) userDefinedFileAttributeView).a : new p0(userDefinedFileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof z) {
            return ((z) fileOwnerAttributeView).a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            AclFileAttributeView aclFileAttributeView = (AclFileAttributeView) fileOwnerAttributeView;
            return aclFileAttributeView instanceof j$.nio.file.attribute.b ? ((j$.nio.file.attribute.b) aclFileAttributeView).a : new j$.nio.file.attribute.a(aclFileAttributeView);
        }
        if (!(fileOwnerAttributeView instanceof PosixFileAttributeView)) {
            return new j$.nio.file.attribute.y(fileOwnerAttributeView);
        }
        PosixFileAttributeView posixFileAttributeView2 = (PosixFileAttributeView) fileOwnerAttributeView;
        return posixFileAttributeView2 instanceof j0 ? ((j0) posixFileAttributeView2).a : new j$.nio.file.attribute.i0(posixFileAttributeView2);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ i0 i(Path path) throws IOException {
        FileStore fileStore = this.b.getFileStore(y.h(path));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof j$.nio.file.f ? ((j$.nio.file.f) fileStore).a : new j$.nio.file.e(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ i j(URI uri) {
        return j$.nio.file.g.k(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path k(URI uri) {
        return j$.nio.file.x.h(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(y.h(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(y.h(path), y.h(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.move(y.h(path), y.h(path2), g.D(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, r[] rVarArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(y.h(path), j$.nio.file.a.l(set), executorService, g.E(rVarArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return asynchronousFileChannelNewAsynchronousFileChannel instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelNewAsynchronousFileChannel).a : new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, r[] rVarArr) {
        return this.b.newByteChannel(y.h(path), j$.nio.file.a.l(set), g.E(rVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, DirectoryStream.Filter filter) {
        return new a0(this.b.newDirectoryStream(y.h(path), new h((byte) 1, filter)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileChannel s(Path path, Set set, r[] rVarArr) {
        return this.b.newFileChannel(y.h(path), j$.nio.file.a.l(set), g.E(rVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ i t(Path path, Map map) {
        return j$.nio.file.g.k(this.b.newFileSystem(y.h(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ i u(URI uri, Map map) {
        return j$.nio.file.g.k(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InputStream v(Path path, j$.nio.file.v[] vVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = y.h(path);
        if (vVarArr == null) {
            openOptionArr = null;
        } else {
            int length = vVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = u.a(vVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathH, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ OutputStream w(Path path, j$.nio.file.v[] vVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = y.h(path);
        if (vVarArr == null) {
            openOptionArr = null;
        } else {
            int length = vVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = u.a(vVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathH, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ BasicFileAttributes x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return j$.nio.file.attribute.h.a(this.b.readAttributes(y.h(path), j$.nio.file.a.i(cls), i0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Map y(Path path, String str, LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.b.readAttributes(y.h(path), str, i0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path z(Path path) {
        return j$.nio.file.x.h(this.b.readSymbolicLink(y.h(path)));
    }
}
