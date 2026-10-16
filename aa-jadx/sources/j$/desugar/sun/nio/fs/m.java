package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends j$.nio.file.spi.c {
    public final java.lang.String b;
    public volatile j$.desugar.sun.nio.fs.i c;

    public m(java.lang.String str) {
        this.b = str;
    }

    public static void B(java.net.URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            j$.time.g.a("URI does not match this provider");
            return;
        }
        if (uri.getRawAuthority() != null) {
            j$.time.g.a("Authority component present");
            return;
        }
        java.lang.String path = uri.getPath();
        if (path == null) {
            j$.time.g.a("Path component is undefined");
            return;
        }
        if (!path.equals("/")) {
            j$.time.g.a("Path component should be '/'");
        } else if (uri.getRawQuery() != null) {
            j$.time.g.a("Query component present");
        } else {
            if (uri.getRawFragment() == null) {
                return;
            }
            j$.time.g.a("Fragment component present");
        }
    }

    public static boolean C(j$.nio.file.CopyOption[] copyOptionArr, j$.nio.file.StandardCopyOption standardCopyOption) {
        for (j$.nio.file.CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.c
    public final void A(j$.nio.file.Path path, java.lang.String str, java.lang.Object obj, j$.nio.file.LinkOption... linkOptionArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            java.lang.String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new java.lang.UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        j$.desugar.sun.nio.fs.b bVar = new j$.desugar.sun.nio.fs.b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((j$.nio.file.attribute.FileTime) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (j$.nio.file.attribute.FileTime) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new java.lang.IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // j$.nio.file.spi.c
    public final void a(j$.nio.file.Path path, j$.nio.file.b... bVarArr) throws java.io.IOException {
        boolean zCanRead;
        java.io.File file = path.toFile();
        if (!file.exists()) {
            throw new java.nio.file.NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (j$.nio.file.b bVar : bVarArr) {
            int i = j$.desugar.sun.nio.fs.j.a[bVar.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i != 2) {
                if (i == 3) {
                    zCanRead = file.canExecute();
                }
            } else {
                zCanRead = file.canWrite();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new java.io.IOException(java.lang.String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.c
    public final void b(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.CopyOption... copyOptionArr) throws java.io.IOException {
        if (!C(copyOptionArr, j$.nio.file.StandardCopyOption.REPLACE_EXISTING) && j$.nio.file.Files.b(path2, new j$.nio.file.LinkOption[0])) {
            throw new java.nio.file.FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, j$.nio.file.StandardCopyOption.ATOMIC_MOVE)) {
            throw new java.lang.UnsupportedOperationException("Unsupported copy option");
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(path.toFile());
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (java.lang.Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    @Override // j$.nio.file.spi.c
    public final void c(j$.nio.file.Path path, j$.nio.file.attribute.r... rVarArr) throws java.nio.file.NoSuchFileException, java.nio.file.FileAlreadyExistsException {
        if (path.getParent() != null && !j$.nio.file.Files.b(path.getParent(), new j$.nio.file.LinkOption[0])) {
            throw new java.nio.file.NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new java.nio.file.FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final void f(j$.nio.file.Path path) throws java.nio.file.NoSuchFileException {
        try {
            a(path, new j$.nio.file.b[0]);
            g(path);
        } catch (java.io.IOException unused) {
            throw new java.nio.file.NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.i j(java.net.URI uri) {
        j$.desugar.sun.nio.fs.i iVar;
        B(uri);
        j$.desugar.sun.nio.fs.i iVar2 = this.c;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                iVar = this.c;
                if (iVar == null) {
                    iVar = new j$.desugar.sun.nio.fs.i(this, this.b);
                    this.c = iVar;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.Path k(java.net.URI uri) {
        byte bA;
        j$.desugar.sun.nio.fs.i iVar = this.c;
        java.lang.String str = this.b;
        char[] cArr = j$.desugar.sun.nio.fs.p.c;
        if (!uri.isAbsolute()) {
            j$.time.g.a("URI is not absolute");
            return null;
        }
        if (uri.isOpaque()) {
            j$.time.g.a("URI is not hierarchical");
            return null;
        }
        java.lang.String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            j$.time.g.a("URI scheme is not \"file\"");
            return null;
        }
        if (uri.getRawAuthority() != null) {
            j$.time.g.a("URI has an authority component");
            return null;
        }
        if (uri.getRawFragment() != null) {
            j$.time.g.a("URI has a fragment component");
            return null;
        }
        if (uri.getRawQuery() != null) {
            j$.time.g.a("URI has a query component");
            return null;
        }
        java.lang.String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            j$.time.g.a("URI path component is empty");
            return null;
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i + 2;
                i += 3;
                bA = (byte) ((j$.desugar.sun.nio.fs.p.a(rawPath.charAt(i3)) << 4) | j$.desugar.sun.nio.fs.p.a(rawPath.charAt(i4)));
                if (bA == 0) {
                    j$.time.g.a("Nul character not allowed");
                    return null;
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    j$.time.g.a("Bad escape");
                    return null;
                }
                bA = (byte) cCharAt;
                i = i3;
            }
            bArrCopyOf[i2] = bA;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, i2);
        }
        return new j$.desugar.sun.nio.fs.o(iVar, new java.lang.String(bArrCopyOf, j$.desugar.sun.nio.fs.q.a), str, "/");
    }

    @Override // j$.nio.file.spi.c
    public final boolean n(j$.nio.file.Path path, j$.nio.file.Path path2) throws java.io.IOException {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new j$.nio.file.b[0]);
        a(path2, new j$.nio.file.b[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final void o(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.CopyOption... copyOptionArr) throws java.nio.file.FileAlreadyExistsException {
        if (!C(copyOptionArr, j$.nio.file.StandardCopyOption.REPLACE_EXISTING) && j$.nio.file.Files.b(path2, new j$.nio.file.LinkOption[0])) {
            throw new java.nio.file.FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, j$.nio.file.StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new java.lang.UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final java.nio.channels.SeekableByteChannel q(j$.nio.file.Path path, java.util.Set set, j$.nio.file.attribute.r... rVarArr) {
        return s(path, set, rVarArr);
    }

    @Override // j$.nio.file.spi.c
    public final java.nio.file.DirectoryStream r(j$.nio.file.Path path, java.nio.file.DirectoryStream.Filter filter) {
        j$.desugar.sun.nio.fs.k kVar = new j$.desugar.sun.nio.fs.k();
        kVar.a = new j$.desugar.sun.nio.fs.l(this, path, filter);
        return kVar;
    }

    @Override // j$.nio.file.spi.c
    public final java.nio.channels.FileChannel s(j$.nio.file.Path path, java.util.Set set, j$.nio.file.attribute.r... rVarArr) throws java.io.IOException {
        java.lang.String str;
        if (path.toFile().isDirectory()) {
            throw new java.lang.UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(java.lang.String.valueOf(path)));
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j$.nio.file.v) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(j$.nio.file.g0.CREATE_NEW) && set.contains(j$.nio.file.g0.WRITE)) {
                throw new java.nio.file.FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(j$.nio.file.g0.CREATE) && !set.contains(j$.nio.file.g0.CREATE_NEW)) {
            throw new java.nio.file.NoSuchFileException(path.toString());
        }
        if (set.contains(j$.nio.file.g0.READ) && set.contains(j$.nio.file.g0.APPEND)) {
            j$.time.g.a("READ + APPEND not allowed");
            return null;
        }
        j$.nio.file.g0 g0Var = j$.nio.file.g0.APPEND;
        if (set.contains(g0Var) && set.contains(j$.nio.file.g0.TRUNCATE_EXISTING)) {
            j$.time.g.a("APPEND + TRUNCATE_EXISTING not allowed");
            return null;
        }
        java.io.File file = path.toFile();
        j$.nio.file.g0 g0Var2 = j$.nio.file.g0.WRITE;
        if (!set.contains(g0Var2) && !set.contains(g0Var)) {
            str = "r";
        } else if (set.contains(j$.nio.file.g0.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(j$.nio.file.g0.DSYNC) ? "rwd" : "rw";
        }
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, str);
        if (set.contains(j$.nio.file.g0.TRUNCATE_EXISTING) && set.contains(g0Var2)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(g0Var) && !set.contains(j$.nio.file.g0.DELETE_ON_CLOSE)) {
            return j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof j$.desugar.sun.nio.fs.e) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((j$.desugar.sun.nio.fs.e) fileChannelConvertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new j$.desugar.sun.nio.fs.e(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(j$.nio.file.g0.DELETE_ON_CLOSE), set.contains(g0Var), path);
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.i u(java.net.URI uri, java.util.Map map) {
        B(uri);
        throw new java.nio.file.FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.attribute.BasicFileAttributes x(j$.nio.file.Path path, java.lang.Class cls, j$.nio.file.LinkOption... linkOptionArr) {
        if (cls == j$.nio.file.attribute.BasicFileAttributes.class) {
            return (j$.nio.file.attribute.BasicFileAttributes) cls.cast(((j$.nio.file.attribute.g) h(path, j$.nio.file.attribute.g.class, linkOptionArr)).readAttributes());
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.Path z(j$.nio.file.Path path) {
        return new j$.desugar.sun.nio.fs.o(this.c, path.toFile().getCanonicalPath(), this.b, "/");
    }
}
