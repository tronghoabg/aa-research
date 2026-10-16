package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class eev {
    static /* synthetic */ void a(java.io.File file) throws java.io.IOException {
        java.io.File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            java.util.Objects.toString(file);
            throw new java.io.IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static final void b(java.io.File file, java.io.File file2) throws java.io.IOException {
        j$.nio.file.Path path = j$.io.FileRetargetClass.toPath(file);
        j$.nio.file.Path path2 = j$.io.FileRetargetClass.toPath(file2);
        try {
            j$.nio.file.Files.move(path, path2, new j$.nio.file.CopyOption[]{j$.nio.file.StandardCopyOption.ATOMIC_MOVE, j$.nio.file.StandardCopyOption.REPLACE_EXISTING});
        } catch (java.nio.file.AtomicMoveNotSupportedException e) {
            path.getClass();
            path2.getClass();
            c(path, path2, e);
        } catch (java.nio.file.FileAlreadyExistsException e2) {
            path.getClass();
            path2.getClass();
            c(path, path2, e2);
        }
    }

    private static final void c(j$.nio.file.Path path, j$.nio.file.Path path2, java.lang.Throwable th) throws java.io.IOException {
        try {
            j$.nio.file.Files.move(path, path2, new j$.nio.file.CopyOption[]{j$.nio.file.StandardCopyOption.REPLACE_EXISTING});
        } catch (java.io.IOException e) {
            defpackage.adrs.E(e, th);
            throw e;
        }
    }
}
