package androidx.datastore.core;

import h.g.b.x;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FileDiagnostics {
    public static final FileDiagnostics INSTANCE = new FileDiagnostics();

    private FileDiagnostics() {
    }

    private final IOException attachFileSystemMessage(File file, IOException iOException) throws IOException {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "]");
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    private final IOException attachParentStacktrace(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? attachFileSystemMessage(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException) : parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException) : parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException);
    }

    public final IOException attachFileDebugInfo(File file, IOException iOException) {
        x.f(file, "file");
        x.f(iOException, "cause");
        return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException) : file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException) : file.canRead() ? file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException) : file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException);
    }
}
