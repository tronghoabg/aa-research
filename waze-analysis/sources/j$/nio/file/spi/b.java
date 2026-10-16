package j$.nio.file.spi;

import j$.nio.file.a0;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.g;
import j$.nio.file.attribute.i;
import j$.nio.file.attribute.i0;
import j$.nio.file.attribute.j;
import j$.nio.file.attribute.j0;
import j$.nio.file.attribute.k;
import j$.nio.file.attribute.k0;
import j$.nio.file.attribute.l;
import j$.nio.file.attribute.p0;
import j$.nio.file.attribute.q0;
import j$.nio.file.attribute.r0;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.w;
import j$.nio.file.attribute.x;
import j$.nio.file.attribute.y;
import j$.nio.file.attribute.z;
import j$.nio.file.c;
import j$.nio.file.h;
import j$.nio.file.n;
import j$.nio.file.p;
import j$.nio.file.q;
import j$.nio.file.s;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class b extends java.nio.file.spi.FileSystemProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f49777b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileSystemProvider f49778a;

    public /* synthetic */ b(FileSystemProvider fileSystemProvider) {
        this.f49778a = fileSystemProvider;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        j$.nio.file.b[] bVarArr;
        FileSystemProvider fileSystemProvider = this.f49778a;
        j$.nio.file.Path pathF = p.f(path);
        if (accessModeArr == null) {
            bVarArr = null;
        } else {
            int length = accessModeArr.length;
            j$.nio.file.b[] bVarArr2 = new j$.nio.file.b[length];
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr2[i2] = j$.nio.file.a.a(accessModeArr[i2]);
            }
            bVarArr = bVarArr2;
        }
        fileSystemProvider.a(pathF, bVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.f49778a;
        j$.nio.file.Path pathF = p.f(path);
        j$.nio.file.Path pathF2 = p.f(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i2 = 0; i2 < length; i2++) {
                copyOptionArr3[i2] = c.a(copyOptionArr[i2]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.b(pathF, pathF2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.f49778a.c(p.f(path), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.f49778a.d(p.f(path), p.f(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.f49778a.e(p.f(path), p.f(path2), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.f49778a.f(p.f(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.f49778a.g(p.f(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.f49778a;
        if (obj instanceof b) {
            obj = ((b) obj).f49778a;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        x xVarH = this.f49778a.h(p.f(path), j$.nio.file.a.h(cls), a0.h(linkOptionArr));
        if (xVarH == null) {
            return null;
        }
        if (xVarH instanceof v) {
            return ((v) xVarH).f49733a;
        }
        if (xVarH instanceof g) {
            g gVar = (g) xVarH;
            if (gVar instanceof e) {
                return ((e) gVar).f49709a;
            }
            if (gVar instanceof l) {
                l lVar = (l) gVar;
                return lVar instanceof j ? ((j) lVar).f49717a : new k(lVar);
            }
            if (!(gVar instanceof k0)) {
                return new f(gVar);
            }
            k0 k0Var = (k0) gVar;
            return k0Var instanceof i0 ? ((i0) k0Var).f49716a : new j0(k0Var);
        }
        if (!(xVarH instanceof j$.nio.file.attribute.a0)) {
            if (!(xVarH instanceof r0)) {
                return new w(xVarH);
            }
            r0 r0Var = (r0) xVarH;
            return r0Var instanceof p0 ? ((p0) r0Var).f49726a : new q0(r0Var);
        }
        j$.nio.file.attribute.a0 a0Var = (j$.nio.file.attribute.a0) xVarH;
        if (a0Var instanceof y) {
            return ((y) a0Var).f49738a;
        }
        if (a0Var instanceof j$.nio.file.attribute.c) {
            j$.nio.file.attribute.c cVar = (j$.nio.file.attribute.c) a0Var;
            return cVar instanceof j$.nio.file.attribute.a ? ((j$.nio.file.attribute.a) cVar).f49705a : new j$.nio.file.attribute.b(cVar);
        }
        if (!(a0Var instanceof k0)) {
            return new z(a0Var);
        }
        k0 k0Var2 = (k0) a0Var;
        return k0Var2 instanceof i0 ? ((i0) k0Var2).f49716a : new j0(k0Var2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        a0 a0VarI = this.f49778a.i(p.f(path));
        int i2 = j$.nio.file.f.f49747b;
        if (a0VarI == null) {
            return null;
        }
        return a0VarI instanceof j$.nio.file.e ? ((j$.nio.file.e) a0VarI).f49745e : new j$.nio.file.f(a0VarI);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return h.e(this.f49778a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return q.f(this.f49778a.getPath(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.f49778a.getScheme();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49778a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.f49778a.k(p.f(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.f49778a.l(p.f(path), p.f(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.f49778a;
        j$.nio.file.Path pathF = p.f(path);
        j$.nio.file.Path pathF2 = p.f(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i2 = 0; i2 < length; i2++) {
                copyOptionArr3[i2] = c.a(copyOptionArr[i2]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.m(pathF, pathF2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.c cVarN = this.f49778a.n(p.f(path), j$.nio.file.a.l(set), executorService, j$.com.android.tools.r8.a.L(fileAttributeArr));
        int i2 = j$.nio.channels.b.f49691b;
        if (cVarN == null) {
            return null;
        }
        return cVarN instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarN).f49690a : new j$.nio.channels.b(cVarN);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f49778a.o(p.f(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new s(this.f49778a.p(p.f(path), new j$.desugar.sun.nio.fs.g(1, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.f49778a.q(p.f(path), j$.nio.file.a.l(set), j$.com.android.tools.r8.a.L(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return h.e(this.f49778a.r(p.f(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        n[] nVarArr;
        FileSystemProvider fileSystemProvider = this.f49778a;
        j$.nio.file.Path pathF = p.f(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            n[] nVarArr2 = new n[length];
            for (int i2 = 0; i2 < length; i2++) {
                nVarArr2[i2] = j$.nio.file.l.a(openOptionArr[i2]);
            }
            nVarArr = nVarArr2;
        }
        return fileSystemProvider.t(pathF, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        n[] nVarArr;
        FileSystemProvider fileSystemProvider = this.f49778a;
        j$.nio.file.Path pathF = p.f(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            n[] nVarArr2 = new n[length];
            for (int i2 = 0; i2 < length; i2++) {
                nVarArr2[i2] = j$.nio.file.l.a(openOptionArr[i2]);
            }
            nVarArr = nVarArr2;
        }
        return fileSystemProvider.u(pathF, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return i.a(this.f49778a.v(p.f(path), j$.nio.file.a.i(cls), a0.h(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return q.f(this.f49778a.x(p.f(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.f49778a.y(p.f(path), str, j$.nio.file.a.k(obj), a0.h(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return h.e(this.f49778a.s(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.f49778a.w(p.f(path), str, a0.h(linkOptionArr)));
    }
}
