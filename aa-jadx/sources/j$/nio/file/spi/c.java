package j$.nio.file.spi;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final java.util.Set a = j$.desugar.sun.nio.fs.g.B(new java.lang.Object[]{j$.nio.file.g0.CREATE, j$.nio.file.g0.TRUNCATE_EXISTING, j$.nio.file.g0.WRITE});

    public c() {
        java.lang.SecurityManager securityManager = java.lang.System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new java.lang.RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(j$.nio.file.Path path, java.lang.String str, java.lang.Object obj, j$.nio.file.LinkOption... linkOptionArr);

    public abstract void a(j$.nio.file.Path path, j$.nio.file.b... bVarArr);

    public abstract void b(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.CopyOption... copyOptionArr);

    public abstract void c(j$.nio.file.Path path, j$.nio.file.attribute.r... rVarArr);

    public void d(j$.nio.file.Path path, j$.nio.file.Path path2) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void e(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.attribute.r... rVarArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract void f(j$.nio.file.Path path);

    public boolean g(j$.nio.file.Path path) {
        return path.toFile().delete();
    }

    public j$.nio.file.attribute.x h(j$.nio.file.Path path, java.lang.Class cls, j$.nio.file.LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == j$.nio.file.attribute.g.class) {
            return (j$.nio.file.attribute.x) cls.cast(new j$.desugar.sun.nio.fs.b(path));
        }
        return null;
    }

    public j$.nio.file.i0 i(j$.nio.file.Path path) {
        throw new java.lang.SecurityException("getFileStore");
    }

    public abstract j$.nio.file.i j(java.net.URI uri);

    public abstract j$.nio.file.Path k(java.net.URI uri);

    public java.lang.String l() {
        return "file";
    }

    public boolean m(j$.nio.file.Path path) {
        return path.toFile().isHidden();
    }

    public abstract boolean n(j$.nio.file.Path path, j$.nio.file.Path path2);

    public abstract void o(j$.nio.file.Path path, j$.nio.file.Path path2, j$.nio.file.CopyOption... copyOptionArr);

    public j$.nio.channels.c p(j$.nio.file.Path path, java.util.Set set, java.util.concurrent.ExecutorService executorService, j$.nio.file.attribute.r... rVarArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract java.nio.channels.SeekableByteChannel q(j$.nio.file.Path path, java.util.Set set, j$.nio.file.attribute.r... rVarArr);

    public abstract java.nio.file.DirectoryStream r(j$.nio.file.Path path, java.nio.file.DirectoryStream.Filter filter);

    public abstract java.nio.channels.FileChannel s(j$.nio.file.Path path, java.util.Set set, j$.nio.file.attribute.r... rVarArr);

    public j$.nio.file.i t(j$.nio.file.Path path, java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract j$.nio.file.i u(java.net.URI uri, java.util.Map map);

    public java.io.InputStream v(j$.nio.file.Path path, j$.nio.file.v... vVarArr) {
        java.util.Set hashSet;
        if (vVarArr.length > 0) {
            for (j$.nio.file.v vVar : vVarArr) {
                if (vVar == j$.nio.file.g0.APPEND || vVar == j$.nio.file.g0.WRITE) {
                    throw new java.lang.UnsupportedOperationException("'" + java.lang.String.valueOf(vVar) + "' not allowed");
                }
            }
        }
        int i = j$.nio.file.Files.a;
        if (vVarArr.length == 0) {
            hashSet = java.util.Collections.EMPTY_SET;
        } else {
            hashSet = new java.util.HashSet();
            java.util.Collections.addAll(hashSet, vVarArr);
        }
        return java.nio.channels.Channels.newInputStream(j$.nio.file.Files.c(path).q(path, hashSet, new j$.nio.file.attribute.r[0]));
    }

    public java.io.OutputStream w(j$.nio.file.Path path, j$.nio.file.v... vVarArr) {
        java.util.Set set;
        if (vVarArr.length == 0) {
            set = a;
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (j$.nio.file.v vVar : vVarArr) {
                if (vVar == j$.nio.file.g0.READ) {
                    j$.time.g.a("READ not allowed");
                    return null;
                }
                hashSet.add(vVar);
            }
            hashSet.add(j$.nio.file.g0.WRITE);
            set = hashSet;
        }
        return java.nio.channels.Channels.newOutputStream(q(path, set, new j$.nio.file.attribute.r[0]));
    }

    public abstract j$.nio.file.attribute.BasicFileAttributes x(j$.nio.file.Path path, java.lang.Class cls, j$.nio.file.LinkOption... linkOptionArr);

    public java.util.Map y(j$.nio.file.Path path, java.lang.String str, j$.nio.file.LinkOption... linkOptionArr) {
        java.lang.String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            java.lang.String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new java.lang.UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        j$.desugar.sun.nio.fs.b bVar = new j$.desugar.sun.nio.fs.b(path);
        java.util.HashSet hashSet = j$.desugar.sun.nio.fs.b.b;
        j$.desugar.sun.nio.fs.a aVar = new j$.desugar.sun.nio.fs.a();
        aVar.a = new java.util.HashSet();
        aVar.b = new java.util.HashMap();
        for (java.lang.String str2 : strArrSplit) {
            if (str2.equals("*")) {
                aVar.c = true;
            } else {
                if (!hashSet.contains(str2)) {
                    throw new java.lang.IllegalArgumentException("'" + str2 + "' not recognized");
                }
                aVar.a.add(str2);
            }
        }
        j$.nio.file.attribute.BasicFileAttributes attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a(java.lang.Long.valueOf(((j$.desugar.sun.nio.fs.c) attributes).h), "size");
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
            aVar.a(java.lang.Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).e), "isDirectory");
        }
        if (aVar.b("isRegularFile")) {
            aVar.a(java.lang.Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).d), "isRegularFile");
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a(java.lang.Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).f), "isSymbolicLink");
        }
        if (aVar.b("isOther")) {
            aVar.a(java.lang.Boolean.valueOf(((j$.desugar.sun.nio.fs.c) attributes).g), "isOther");
        }
        return java.util.Collections.unmodifiableMap(aVar.b);
    }

    public abstract j$.nio.file.Path z(j$.nio.file.Path path);
}
