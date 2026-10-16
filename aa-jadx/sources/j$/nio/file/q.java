package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements java.io.Closeable {
    public final boolean a;
    public final j$.nio.file.LinkOption[] b;
    public final java.util.ArrayDeque c = new java.util.ArrayDeque();
    public boolean d;

    public q(java.util.List list) {
        java.util.Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (j$.nio.file.m.a[((j$.nio.file.FileVisitOption) it.next()).ordinal()] != 1) {
                throw new java.lang.AssertionError("Should not get here");
            }
            z = true;
        }
        this.a = z;
        this.b = z ? new j$.nio.file.LinkOption[0] : new j$.nio.file.LinkOption[]{j$.nio.file.LinkOption.NOFOLLOW_LINKS};
    }

    public final j$.nio.file.attribute.BasicFileAttributes a(j$.nio.file.Path path) throws java.io.IOException {
        try {
            return j$.nio.file.Files.readAttributes(path, j$.nio.file.attribute.BasicFileAttributes.class, this.b);
        } catch (java.io.IOException e) {
            if (this.a) {
                return j$.nio.file.Files.readAttributes(path, j$.nio.file.attribute.BasicFileAttributes.class, j$.nio.file.LinkOption.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    public final j$.nio.file.o b() {
        java.io.IOException cause;
        j$.nio.file.Path path;
        j$.nio.file.o oVarC;
        java.util.ArrayDeque arrayDeque = this.c;
        j$.nio.file.n nVar = (j$.nio.file.n) arrayDeque.peek();
        if (nVar == null) {
            return null;
        }
        do {
            java.util.Iterator it = nVar.d;
            try {
                path = it.hasNext() ? (j$.nio.file.Path) it.next() : null;
                cause = null;
            } catch (java.nio.file.DirectoryIteratorException e) {
                cause = e.getCause();
                path = null;
            }
            if (path == null) {
                try {
                    nVar.c.close();
                } catch (java.io.IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                arrayDeque.pop();
                return new j$.nio.file.o(j$.nio.file.p.END_DIRECTORY, nVar.a, null, cause);
            }
            oVarC = c(path, true);
        } while (oVarC == null);
        return oVarC;
    }

    public final j$.nio.file.o c(j$.nio.file.Path path, boolean z) {
        try {
            j$.nio.file.attribute.BasicFileAttributes basicFileAttributesA = a(path);
            java.util.ArrayDeque<j$.nio.file.n> arrayDeque = this.c;
            if (arrayDeque.size() >= Integer.MAX_VALUE || !basicFileAttributesA.isDirectory()) {
                return new j$.nio.file.o(j$.nio.file.p.ENTRY, path, basicFileAttributesA, null);
            }
            if (this.a) {
                java.lang.Object objFileKey = basicFileAttributesA.fileKey();
                for (j$.nio.file.n nVar : arrayDeque) {
                    java.lang.Object obj = nVar.b;
                    if (objFileKey == null || obj == null) {
                        try {
                            if (j$.nio.file.Files.c(path).n(path, nVar.a)) {
                                return new j$.nio.file.o(j$.nio.file.p.ENTRY, path, null, new java.nio.file.FileSystemLoopException(path.toString()));
                            }
                        } catch (java.io.IOException | java.lang.SecurityException unused) {
                            continue;
                        }
                    } else if (objFileKey.equals(obj)) {
                        return new j$.nio.file.o(j$.nio.file.p.ENTRY, path, null, new java.nio.file.FileSystemLoopException(path.toString()));
                    }
                }
            }
            try {
                arrayDeque.push(new j$.nio.file.n(path, basicFileAttributesA.fileKey(), j$.nio.file.Files.c(path).r(path, j$.nio.file.s.a)));
                return new j$.nio.file.o(j$.nio.file.p.START_DIRECTORY, path, basicFileAttributesA, null);
            } catch (java.io.IOException e) {
                return new j$.nio.file.o(j$.nio.file.p.ENTRY, path, null, e);
            } catch (java.lang.SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (java.io.IOException e3) {
            return new j$.nio.file.o(j$.nio.file.p.ENTRY, path, null, e3);
        } catch (java.lang.SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        while (true) {
            java.util.ArrayDeque arrayDeque = this.c;
            if (arrayDeque.isEmpty()) {
                this.d = true;
                return;
            } else if (!arrayDeque.isEmpty()) {
                try {
                    ((j$.nio.file.n) arrayDeque.pop()).c.close();
                } catch (java.io.IOException unused) {
                }
            }
        }
    }
}
