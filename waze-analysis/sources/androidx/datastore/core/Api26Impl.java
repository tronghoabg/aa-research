package androidx.datastore.core;

import e.a.h.ad;
import h.g.b.x;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import java.io.File;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.FileAlreadyExistsException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class Api26Impl {
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    private final void retryMove(Path path, Path path2, Throwable th) throws IOException {
        try {
            Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e2) {
            IOException iOException = e2;
            ad.c(iOException, th);
            throw iOException;
        }
    }

    public final void move(File file, File file2) throws IOException {
        x.f(file, "srcFile");
        x.f(file2, "dstFile");
        Path path = FileRetargetClass.toPath(file);
        Path path2 = FileRetargetClass.toPath(file2);
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (AtomicMoveNotSupportedException e2) {
            x.c(path);
            x.c(path2);
            retryMove(path, path2, e2);
        } catch (FileAlreadyExistsException e3) {
            x.c(path);
            x.c(path2);
            retryMove(path, path2, e3);
        }
    }
}
