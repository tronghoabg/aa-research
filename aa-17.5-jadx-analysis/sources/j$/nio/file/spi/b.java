package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.attribute.a0;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.i;
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
import j$.nio.file.attribute.y;
import j$.nio.file.attribute.z;
import j$.nio.file.h;
import j$.nio.file.i0;
import j$.nio.file.t;
import j$.nio.file.x;
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
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        j$.nio.file.b[] bVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathH = x.h(path);
        if (accessModeArr == null) {
            bVarArr = null;
        } else {
            int length = accessModeArr.length;
            j$.nio.file.b[] bVarArr2 = new j$.nio.file.b[length];
            for (int i = 0; i < length; i++) {
                bVarArr2[i] = j$.nio.file.a.a(accessModeArr[i]);
            }
            bVarArr = bVarArr2;
        }
        cVar.a(pathH, bVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathH = x.h(path);
        j$.nio.file.Path pathH2 = x.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(x.h(path), g.C(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(x.h(path), x.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(x.h(path), x.h(path2), g.C(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(x.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(x.h(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        j$.nio.file.attribute.x xVarH = this.a.h(x.h(path), j$.nio.file.a.h(cls), i0.h(linkOptionArr));
        if (xVarH == null) {
            return null;
        }
        if (xVarH instanceof v) {
            return ((v) xVarH).a;
        }
        if (xVarH instanceof j$.nio.file.attribute.g) {
            j$.nio.file.attribute.g gVar = (j$.nio.file.attribute.g) xVarH;
            if (gVar instanceof e) {
                return ((e) gVar).a;
            }
            if (gVar instanceof l) {
                l lVar = (l) gVar;
                return lVar instanceof j ? ((j) lVar).a : new k(lVar);
            }
            if (!(gVar instanceof k0)) {
                return new f(gVar);
            }
            k0 k0Var = (k0) gVar;
            return k0Var instanceof j$.nio.file.attribute.i0 ? ((j$.nio.file.attribute.i0) k0Var).a : new j0(k0Var);
        }
        if (!(xVarH instanceof a0)) {
            if (!(xVarH instanceof r0)) {
                return new w(xVarH);
            }
            r0 r0Var = (r0) xVarH;
            return r0Var instanceof p0 ? ((p0) r0Var).a : new q0(r0Var);
        }
        a0 a0Var = (a0) xVarH;
        if (a0Var instanceof y) {
            return ((y) a0Var).a;
        }
        if (a0Var instanceof j$.nio.file.attribute.c) {
            j$.nio.file.attribute.c cVar = (j$.nio.file.attribute.c) a0Var;
            return cVar instanceof j$.nio.file.attribute.a ? ((j$.nio.file.attribute.a) cVar).a : new j$.nio.file.attribute.b(cVar);
        }
        if (!(a0Var instanceof k0)) {
            return new z(a0Var);
        }
        k0 k0Var2 = (k0) a0Var;
        return k0Var2 instanceof j$.nio.file.attribute.i0 ? ((j$.nio.file.attribute.i0) k0Var2).a : new j0(k0Var2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        i0 i0VarI = this.a.i(x.h(path));
        int i = j$.nio.file.f.b;
        if (i0VarI == null) {
            return null;
        }
        return i0VarI instanceof j$.nio.file.e ? ((j$.nio.file.e) i0VarI).e : new j$.nio.file.f(i0VarI);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return h.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return j$.nio.file.y.h(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(x.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(x.h(path), x.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathH = x.h(path);
        j$.nio.file.Path pathH2 = x.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = j$.nio.file.c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.c cVarP = this.a.p(x.h(path), j$.nio.file.a.l(set), executorService, g.C(fileAttributeArr));
        int i = j$.nio.channels.b.b;
        if (cVarP == null) {
            return null;
        }
        return cVarP instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarP).a : new j$.nio.channels.b(cVarP);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(x.h(path), j$.nio.file.a.l(set), g.C(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new j$.nio.file.a0(this.a.r(x.h(path), new j$.desugar.sun.nio.fs.h((byte) 1, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(x.h(path), j$.nio.file.a.l(set), g.C(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return h.a(this.a.t(x.h(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.v[] vVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathH = x.h(path);
        if (openOptionArr == null) {
            vVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.v[] vVarArr2 = new j$.nio.file.v[length];
            for (int i = 0; i < length; i++) {
                vVarArr2[i] = t.a(openOptionArr[i]);
            }
            vVarArr = vVarArr2;
        }
        return cVar.v(pathH, vVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.v[] vVarArr;
        c cVar = this.a;
        j$.nio.file.Path pathH = x.h(path);
        if (openOptionArr == null) {
            vVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.v[] vVarArr2 = new j$.nio.file.v[length];
            for (int i = 0; i < length; i++) {
                vVarArr2[i] = t.a(openOptionArr[i]);
            }
            vVarArr = vVarArr2;
        }
        return cVar.w(pathH, vVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return i.a(this.a.x(x.h(path), j$.nio.file.a.i(cls), i0.h(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return j$.nio.file.y.h(this.a.z(x.h(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(x.h(path), str, j$.nio.file.a.k(obj), i0.h(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return h.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return j$.nio.file.a.j(this.a.y(x.h(path), str, i0.h(linkOptionArr)));
    }
}
