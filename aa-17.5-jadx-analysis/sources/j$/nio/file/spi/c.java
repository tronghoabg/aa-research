package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.x;
import j$.nio.file.g0;
import j$.nio.file.i;
import j$.nio.file.i0;
import j$.nio.file.v;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class c {
    public static final Set a = g.B(new Object[]{g0.CREATE, g0.TRUNCATE_EXISTING, g0.WRITE});

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    public abstract void a(Path path, j$.nio.file.b... bVarArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, r... rVarArr);

    public void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    public void e(Path path, Path path2, r... rVarArr) {
        throw new UnsupportedOperationException();
    }

    public abstract void f(Path path);

    public boolean g(Path path) {
        return path.toFile().delete();
    }

    public x h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == j$.nio.file.attribute.g.class) {
            return (x) cls.cast(new j$.desugar.sun.nio.fs.b(path));
        }
        return null;
    }

    public i0 i(Path path) {
        throw new SecurityException("getFileStore");
    }

    public abstract i j(URI uri);

    public abstract Path k(URI uri);

    public String l() {
        return "file";
    }

    public boolean m(Path path) {
        return path.toFile().isHidden();
    }

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, r... rVarArr) {
        throw new UnsupportedOperationException();
    }

    public abstract SeekableByteChannel q(Path path, Set set, r... rVarArr);

    public abstract DirectoryStream r(Path path, DirectoryStream.Filter filter);

    public abstract FileChannel s(Path path, Set set, r... rVarArr);

    public i t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract i u(URI uri, Map map);

    public InputStream v(Path path, v... vVarArr) {
        Set hashSet;
        if (vVarArr.length > 0) {
            for (v vVar : vVarArr) {
                if (vVar == g0.APPEND || vVar == g0.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(vVar) + "' not allowed");
                }
            }
        }
        int i = Files.a;
        if (vVarArr.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet();
            Collections.addAll(hashSet, vVarArr);
        }
        return Channels.newInputStream(Files.c(path).q(path, hashSet, new r[0]));
    }

    public OutputStream w(Path path, v... vVarArr) {
        Set set;
        if (vVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (v vVar : vVarArr) {
                if (vVar == g0.READ) {
                    j$.time.g.a("READ not allowed");
                    return null;
                }
                hashSet.add(vVar);
            }
            hashSet.add(g0.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new r[0]));
    }

    public abstract BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr);

    public Map y(Path path, String str, LinkOption... linkOptionArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        j$.desugar.sun.nio.fs.b bVar = new j$.desugar.sun.nio.fs.b(path);
        HashSet hashSet = j$.desugar.sun.nio.fs.b.b;
        j$.desugar.sun.nio.fs.a aVar = new j$.desugar.sun.nio.fs.a();
        aVar.a = new HashSet();
        aVar.b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                aVar.c = true;
            } else {
                if (!hashSet.contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                aVar.a.add(str2);
            }
        }
        BasicFileAttributes attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a(Long.valueOf(((j$.desugar.sun.nio.fs.c) attributes).h), "size");
        }
        if (aVar.b("creationTime")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).c, "creationTime");
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).b, "lastAccessTime");
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).a, "lastModifiedTime");
        }
        if (aVar.b("fileKey")) {
            aVar.a(((j$.desugar.sun.nio.fs.c) attributes).i, "fileKey");
        }
        if (aVar.b("isDirectory")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).e), "isDirectory");
        }
        if (aVar.b("isRegularFile")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).d), "isRegularFile");
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).f), "isSymbolicLink");
        }
        if (aVar.b("isOther")) {
            aVar.a(Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).g), "isOther");
        }
        return Collections.unmodifiableMap(aVar.b);
    }

    public abstract Path z(Path path);
}
