package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.channels.c;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.a0;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.x;
import j$.nio.file.i;
import j$.nio.file.n;
import j$.nio.file.y;
import j$.time.f;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class FileSystemProvider {

    /* renamed from: b, reason: collision with root package name */
    public static volatile List f49772b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f49773c = false;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f49771a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Set f49774d = j$.com.android.tools.r8.a.J(new Object[]{y.CREATE, y.TRUNCATE_EXISTING, y.WRITE});

    public FileSystemProvider() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

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
        try {
            f(path);
            return true;
        } catch (NoSuchFileException unused) {
            return false;
        }
    }

    public abstract Path getPath(URI uri);

    public abstract String getScheme();

    public abstract x h(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract a0 i(Path path);

    public abstract i j(URI uri);

    public abstract boolean k(Path path);

    public abstract boolean l(Path path, Path path2);

    public abstract void m(Path path, Path path2, CopyOption... copyOptionArr);

    public c n(Path path, Set set, ExecutorService executorService, r... rVarArr) {
        throw new UnsupportedOperationException();
    }

    public abstract SeekableByteChannel o(Path path, Set set, r... rVarArr);

    public abstract DirectoryStream p(Path path, g gVar);

    public FileChannel q(Path path, Set set, r... rVarArr) {
        throw new UnsupportedOperationException();
    }

    public i r(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract i s(URI uri, Map map);

    public InputStream t(Path path, n... nVarArr) {
        Set hashSet;
        if (nVarArr.length > 0) {
            for (n nVar : nVarArr) {
                if (nVar == y.APPEND || nVar == y.WRITE) {
                    throw new UnsupportedOperationException(h.a("'", String.valueOf(nVar), "' not allowed"));
                }
            }
        }
        int i2 = Files.f49695a;
        if (nVarArr.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet();
            Collections.addAll(hashSet, nVarArr);
        }
        return Channels.newInputStream(Files.c(path).o(path, hashSet, new r[0]));
    }

    public OutputStream u(Path path, n... nVarArr) {
        Set set;
        if (nVarArr.length == 0) {
            set = f49774d;
        } else {
            HashSet hashSet = new HashSet();
            for (n nVar : nVarArr) {
                if (nVar == y.READ) {
                    f.b("READ not allowed");
                    return null;
                }
                hashSet.add(nVar);
            }
            hashSet.add(y.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(o(path, set, new r[0]));
    }

    public abstract BasicFileAttributes v(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract Map w(Path path, String str, LinkOption... linkOptionArr);

    public Path x(Path path) {
        throw new UnsupportedOperationException();
    }

    public abstract void y(Path path, String str, Object obj, LinkOption... linkOptionArr);
}
