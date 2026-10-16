package k;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class w extends p {
    @Override // k.p
    public final n a(ab abVar) {
        h.g.b.x.f(abVar, "file");
        return new n(false, new RandomAccessFile(abVar.b(), "r"));
    }

    @Override // k.p
    public o b(ab abVar) {
        h.g.b.x.f(abVar, "path");
        File fileB = abVar.b();
        boolean zIsFile = fileB.isFile();
        boolean zIsDirectory = fileB.isDirectory();
        long jLastModified = fileB.lastModified();
        long length = fileB.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0) {
            if (length != 0) {
                jLastModified = 0;
            } else {
                if (!fileB.exists()) {
                    return null;
                }
                jLastModified = 0;
                length = 0;
            }
        }
        return new o(zIsFile, zIsDirectory, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // k.p
    public final am c(ab abVar) {
        h.g.b.x.f(abVar, "file");
        return aq.g(abVar.b());
    }

    @Override // k.p
    public void d(ab abVar, ab abVar2) throws IOException {
        h.g.b.x.f(abVar, "source");
        h.g.b.x.f(abVar2, TypedValues.AttributesType.S_TARGET);
        if (abVar.b().renameTo(abVar2.b())) {
            return;
        }
        throw new IOException("failed to move " + abVar + " to " + abVar2);
    }

    @Override // k.p
    public final void f(ab abVar) throws IOException {
        h.g.b.x.f(abVar, "dir");
        if (abVar.b().mkdir()) {
            return;
        }
        o oVarB = b(abVar);
        if (oVarB == null || !oVarB.a()) {
            Objects.toString(abVar);
            throw new IOException("failed to create directory: ".concat(String.valueOf(abVar)));
        }
    }

    @Override // k.p
    public final void g(ab abVar) throws IOException {
        h.g.b.x.f(abVar, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileB = abVar.b();
        if (fileB.delete() || !fileB.exists()) {
            return;
        }
        Objects.toString(abVar);
        throw new IOException("failed to delete ".concat(String.valueOf(abVar)));
    }

    @Override // k.p
    public final n h(ab abVar) {
        h.g.b.x.f(abVar, "file");
        return new n(true, new RandomAccessFile(abVar.b(), "rw"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
