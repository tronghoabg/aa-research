package j$.nio.file;

import j$.nio.file.attribute.BasicFileAttributes;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class q implements Closeable {
    public final boolean a;
    public final LinkOption[] b;
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    public q(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (m.a[((FileVisitOption) it.next()).ordinal()] != 1) {
                throw new AssertionError("Should not get here");
            }
            z = true;
        }
        this.a = z;
        this.b = z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
    }

    public final BasicFileAttributes a(Path path) throws IOException {
        try {
            return Files.readAttributes(path, BasicFileAttributes.class, this.b);
        } catch (IOException e) {
            if (this.a) {
                return Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            }
            throw e;
        }
    }

    public final o b() throws IOException {
        IOException cause;
        Path path;
        o oVarC;
        ArrayDeque arrayDeque = this.c;
        n nVar = (n) arrayDeque.peek();
        if (nVar == null) {
            return null;
        }
        do {
            Iterator it = nVar.d;
            try {
                path = it.hasNext() ? (Path) it.next() : null;
                cause = null;
            } catch (DirectoryIteratorException e) {
                cause = e.getCause();
                path = null;
            }
            if (path == null) {
                try {
                    nVar.c.close();
                } catch (IOException e2) {
                    if (cause == null) {
                        cause = e2;
                    } else {
                        cause.addSuppressed(e2);
                    }
                }
                arrayDeque.pop();
                return new o(p.END_DIRECTORY, nVar.a, null, cause);
            }
            oVarC = c(path, true);
        } while (oVarC == null);
        return oVarC;
    }

    public final o c(Path path, boolean z) {
        try {
            BasicFileAttributes basicFileAttributesA = a(path);
            ArrayDeque arrayDeque = this.c;
            if (arrayDeque.size() >= Integer.MAX_VALUE || !basicFileAttributesA.isDirectory()) {
                return new o(p.ENTRY, path, basicFileAttributesA, null);
            }
            if (this.a) {
                Object objFileKey = basicFileAttributesA.fileKey();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    Object obj = nVar.b;
                    if (objFileKey == null || obj == null) {
                        try {
                        } catch (IOException | SecurityException unused) {
                            continue;
                        }
                        if (Files.c(path).n(path, nVar.a)) {
                            return new o(p.ENTRY, path, null, new FileSystemLoopException(path.toString()));
                        }
                    } else if (objFileKey.equals(obj)) {
                        return new o(p.ENTRY, path, null, new FileSystemLoopException(path.toString()));
                    }
                }
            }
            try {
                arrayDeque.push(new n(path, basicFileAttributesA.fileKey(), Files.c(path).r(path, s.a)));
                return new o(p.START_DIRECTORY, path, basicFileAttributesA, null);
            } catch (IOException e) {
                return new o(p.ENTRY, path, null, e);
            } catch (SecurityException e2) {
                if (!z) {
                    throw e2;
                }
                return null;
            }
        } catch (IOException e3) {
            return new o(p.ENTRY, path, null, e3);
        } catch (SecurityException e4) {
            if (!z) {
                throw e4;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        while (true) {
            ArrayDeque arrayDeque = this.c;
            if (arrayDeque.isEmpty()) {
                this.d = true;
                return;
            } else if (!arrayDeque.isEmpty()) {
                try {
                    ((n) arrayDeque.pop()).c.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
