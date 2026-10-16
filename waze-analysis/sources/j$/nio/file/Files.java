package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.spi.FileSystemProvider;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class Files {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f49695a = 0;

    static {
        j$.com.android.tools.r8.a.J(new Object[]{y.CREATE_NEW, y.WRITE});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) throws IOException {
        Objects.requireNonNull(inputStream);
        int length = copyOptionArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption != StandardCopyOption.REPLACE_EXISTING) {
                if (copyOption != null) {
                    throw new UnsupportedOperationException(String.valueOf(copyOption).concat(" not supported"));
                }
                throw new NullPointerException("options contains 'null'");
            }
            i2++;
            z = true;
        }
        if (z) {
            try {
                path.getFileSystem().v().g(path);
                e = null;
            } catch (SecurityException e2) {
                e = e2;
            }
        } else {
            e = null;
        }
        try {
            OutputStream outputStreamU = path.getFileSystem().v().u(path, y.CREATE_NEW, y.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(outputStreamU);
                } else {
                    DesugarInputStream.transferTo(inputStream, outputStreamU);
                }
                if (outputStreamU != null) {
                    outputStreamU.close();
                }
            } catch (Throwable th) {
                if (outputStreamU != null) {
                    try {
                        outputStreamU.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e3) {
            if (e == null) {
                throw e3;
            }
            throw e;
        }
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            c(path);
        }
        try {
            int length = linkOptionArr.length;
            int i2 = 0;
            boolean z = true;
            while (i2 < length) {
                LinkOption linkOption = linkOptionArr[i2];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i2++;
                z = false;
            }
            if (z) {
                c(path).a(path, new b[0]);
                return true;
            }
            readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static FileSystemProvider c(Path path) {
        return path.getFileSystem().v();
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        FileSystemProvider fileSystemProviderC = c(path);
        if (c(path2).equals(fileSystemProviderC)) {
            fileSystemProviderC.m(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i2 = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i2];
        for (int i3 = 0; i3 < length; i3++) {
            CopyOption copyOption = copyOptionArr[i3];
            if (copyOption == StandardCopyOption.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i3] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = StandardCopyOption.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < i2; i4++) {
            CopyOption copyOption2 = copyOptionArr2[i4];
            if (copyOption2 == StandardCopyOption.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != StandardCopyOption.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException(j$.desugar.sun.nio.fs.h.a("'", String.valueOf(copyOption2), "' is not a recognized copy option"));
                }
                z3 = true;
            }
        }
        BasicFileAttributes attributes = readAttributes(path, BasicFileAttributes.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (attributes.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().v().g(path2);
        } else if (b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (attributes.isDirectory()) {
            path2.getFileSystem().v().c(path2, new j$.nio.file.attribute.r[0]);
        } else {
            InputStream inputStreamT = path.getFileSystem().v().t(path, new n[0]);
            try {
                a(inputStreamT, path2, new CopyOption[0]);
                if (inputStreamT != null) {
                    inputStreamT.close();
                }
            } catch (Throwable th) {
                if (inputStreamT != null) {
                    try {
                        inputStreamT.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((j$.nio.file.attribute.g) path2.getFileSystem().v().h(path2, j$.nio.file.attribute.g.class, new LinkOption[0])).a(attributes.lastModifiedTime(), attributes.lastAccessTime(), attributes.creationTime());
            } catch (Throwable th3) {
                try {
                    path2.getFileSystem().v().f(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        path.getFileSystem().v().f(path);
        return path2;
    }

    public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> cls, LinkOption... linkOptionArr) {
        return (A) c(path).v(path, cls, linkOptionArr);
    }

    public static Path readSymbolicLink(Path path) {
        return c(path).x(path);
    }
}
