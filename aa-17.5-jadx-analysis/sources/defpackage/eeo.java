package defpackage;

import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import java.io.File;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Objects;

/* loaded from: classes.dex */
final class eeo {
    static /* synthetic */ void a(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            Objects.toString(file);
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static final void b(File file, File file2) throws IOException {
        Path path = FileRetargetClass.toPath(file);
        Path path2 = FileRetargetClass.toPath(file2);
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e) {
            path.getClass();
            path2.getClass();
            c(path, path2, e);
        } catch (FileAlreadyExistsException e2) {
            path.getClass();
            path2.getClass();
            c(path, path2, e2);
        }
    }

    private static final void c(Path path, Path path2, Throwable th) throws IOException {
        try {
            Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            adqs.y(e, th);
            throw e;
        }
    }
}
