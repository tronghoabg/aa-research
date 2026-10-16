package j$.desugar.sun.nio.fs;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import j$.nio.channels.DesugarChannels;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.a0;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.x;
import j$.nio.file.spi.FileSystemProvider;
import j$.nio.file.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m extends FileSystemProvider {

    /* renamed from: e, reason: collision with root package name */
    public final String f49674e;

    /* renamed from: f, reason: collision with root package name */
    public volatile i f49675f;

    public m(String str) {
        this.f49674e = str;
    }

    public static boolean A(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    public static void z(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            j$.time.f.b("URI does not match this provider");
            return;
        }
        if (uri.getRawAuthority() != null) {
            j$.time.f.b("Authority component present");
            return;
        }
        String path = uri.getPath();
        if (path == null) {
            j$.time.f.b("Path component is undefined");
            return;
        }
        if (!path.equals(DomExceptionUtils.SEPARATOR)) {
            j$.time.f.b("Path component should be '/'");
        } else if (uri.getRawQuery() != null) {
            j$.time.f.b("Query component present");
        } else {
            if (uri.getRawFragment() == null) {
                return;
            }
            j$.time.f.b("Fragment component present");
        }
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void a(Path path, j$.nio.file.b... bVarArr) throws IOException {
        boolean zCanRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (j$.nio.file.b bVar : bVarArr) {
            int i2 = j.f49668a[bVar.ordinal()];
            if (i2 == 1) {
                zCanRead = file.canRead();
            } else if (i2 == 2) {
                zCanRead = file.canWrite();
            } else if (i2 == 3) {
                zCanRead = file.canExecute();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        if (!A(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (A(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i2 = fileInputStream.read(bArr, 0, 8192);
                    if (i2 < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void c(Path path, r... rVarArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !Files.b(path.getParent(), new LinkOption[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void e(Path path, Path path2, r... rVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void f(Path path) throws NoSuchFileException {
        try {
            a(path, new j$.nio.file.b[0]);
            g(path);
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final Path getPath(URI uri) {
        byte bA;
        i iVar = this.f49675f;
        String str = this.f49674e;
        char[] cArr = p.f49687c;
        if (!uri.isAbsolute()) {
            j$.time.f.b("URI is not absolute");
            return null;
        }
        if (uri.isOpaque()) {
            j$.time.f.b("URI is not hierarchical");
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            j$.time.f.b("URI scheme is not \"file\"");
            return null;
        }
        if (uri.getRawAuthority() != null) {
            j$.time.f.b("URI has an authority component");
            return null;
        }
        if (uri.getRawFragment() != null) {
            j$.time.f.b("URI has a fragment component");
            return null;
        }
        if (uri.getRawQuery() != null) {
            j$.time.f.b("URI has a query component");
            return null;
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            j$.time.f.b("URI path component is empty");
            return null;
        }
        if (rawPath.endsWith(DomExceptionUtils.SEPARATOR) && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            char cCharAt = rawPath.charAt(i2);
            if (cCharAt == '%') {
                int i5 = i2 + 2;
                i2 += 3;
                bA = (byte) ((p.a(rawPath.charAt(i4)) << 4) | p.a(rawPath.charAt(i5)));
                if (bA == 0) {
                    j$.time.f.b("Nul character not allowed");
                    return null;
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    j$.time.f.b("Bad escape");
                    return null;
                }
                bA = (byte) cCharAt;
                i2 = i4;
            }
            bArrCopyOf[i3] = bA;
            i3++;
        }
        if (i3 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
        }
        return new o(iVar, new String(bArrCopyOf, q.f49688a), str, DomExceptionUtils.SEPARATOR);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final String getScheme() {
        return "file";
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final x h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == j$.nio.file.attribute.g.class) {
            return (x) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final a0 i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final j$.nio.file.i j(URI uri) {
        i iVar;
        z(uri);
        i iVar2 = this.f49675f;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                iVar = this.f49675f;
                if (iVar == null) {
                    iVar = new i(this, this.f49674e);
                    this.f49675f = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final boolean k(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final boolean l(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new j$.nio.file.b[0]);
        a(path2, new j$.nio.file.b[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void m(Path path, Path path2, CopyOption... copyOptionArr) throws FileAlreadyExistsException {
        if (!A(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (A(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final j$.nio.channels.c n(Path path, Set set, ExecutorService executorService, r... rVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final SeekableByteChannel o(Path path, Set set, r... rVarArr) {
        return q(path, set, rVarArr);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final DirectoryStream p(Path path, g gVar) {
        k kVar = new k();
        kVar.f49669a = new l(this, path, gVar);
        return kVar;
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final FileChannel q(Path path, Set set, r... rVarArr) throws IOException {
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j$.nio.file.n) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(y.CREATE_NEW) && set.contains(y.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(y.CREATE) && !set.contains(y.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(y.READ) && set.contains(y.APPEND)) {
            j$.time.f.b("READ + APPEND not allowed");
            return null;
        }
        y yVar = y.APPEND;
        if (set.contains(yVar) && set.contains(y.TRUNCATE_EXISTING)) {
            j$.time.f.b("APPEND + TRUNCATE_EXISTING not allowed");
            return null;
        }
        File file = path.toFile();
        y yVar2 = y.WRITE;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, (set.contains(yVar2) || set.contains(yVar)) ? set.contains(y.SYNC) ? "rws" : set.contains(y.DSYNC) ? "rwd" : "rw" : "r");
        if (set.contains(y.TRUNCATE_EXISTING) && set.contains(yVar2)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(yVar) && !set.contains(y.DELETE_ON_CLOSE)) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof e) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((e) fileChannelConvertMaybeLegacyFileChannelFromLibrary).f49659a;
        }
        return new e(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(y.DELETE_ON_CLOSE), set.contains(yVar), path);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final j$.nio.file.i s(URI uri, Map map) {
        z(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final BasicFileAttributes v(Path path, Class cls, LinkOption... linkOptionArr) {
        if (cls == BasicFileAttributes.class) {
            return (BasicFileAttributes) cls.cast(((j$.nio.file.attribute.g) h(path, j$.nio.file.attribute.g.class, linkOptionArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final Map w(Path path, String str, LinkOption... linkOptionArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException(h.a("Requested attribute type for: ", strSubstring, " is not available."));
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        b bVar = new b(path);
        HashSet hashSet = b.f49646b;
        a aVar = new a();
        aVar.f49643a = new HashSet();
        aVar.f49644b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                aVar.f49645c = true;
            } else {
                if (!hashSet.contains(str2)) {
                    j$.time.f.b(h.a("'", str2, "' not recognized"));
                    return null;
                }
                aVar.f49643a.add(str2);
            }
        }
        BasicFileAttributes attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a(Long.valueOf(((c) attributes).f49655h), "size");
        }
        if (aVar.b("creationTime")) {
            aVar.a(((c) attributes).f49650c, "creationTime");
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a(((c) attributes).f49649b, "lastAccessTime");
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a(((c) attributes).f49648a, "lastModifiedTime");
        }
        if (aVar.b("fileKey")) {
            aVar.a(((c) attributes).f49656i, "fileKey");
        }
        if (aVar.b("isDirectory")) {
            aVar.a(Boolean.valueOf(((c) attributes).f49652e), "isDirectory");
        }
        if (aVar.b("isRegularFile")) {
            aVar.a(Boolean.valueOf(((c) attributes).f49651d), "isRegularFile");
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a(Boolean.valueOf(((c) attributes).f49653f), "isSymbolicLink");
        }
        if (aVar.b("isOther")) {
            aVar.a(Boolean.valueOf(((c) attributes).f49654g), "isOther");
        }
        return Collections.unmodifiableMap(aVar.f49644b);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final Path x(Path path) {
        return new o(this.f49675f, path.toFile().getCanonicalPath(), this.f49674e, DomExceptionUtils.SEPARATOR);
    }

    @Override // j$.nio.file.spi.FileSystemProvider
    public final void y(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException(h.a("Requested attribute type for: ", strSubstring, " is not available."));
            }
            str = str.substring(iIndexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((FileTime) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (FileTime) obj, null);
        } else if (str.equals("creationTime")) {
        } else {
            j$.time.f.b(h.a("'basic:", str, "' not recognized"));
        }
    }
}
