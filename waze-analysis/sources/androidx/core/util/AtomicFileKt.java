package androidx.core.util;

import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.n.a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AtomicFileKt {
    public static final byte[] readBytes(android.util.AtomicFile atomicFile) throws IOException {
        x.f(atomicFile, "<this>");
        byte[] fully = atomicFile.readFully();
        x.e(fully, "readFully(...)");
        return fully;
    }

    public static final String readText(android.util.AtomicFile atomicFile, Charset charset) throws IOException {
        x.f(atomicFile, "<this>");
        x.f(charset, "charset");
        byte[] fully = atomicFile.readFully();
        x.e(fully, "readFully(...)");
        return new String(fully, charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = a.f48221b;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(android.util.AtomicFile atomicFile, l<? super FileOutputStream, ab> lVar) throws IOException {
        x.f(atomicFile, "<this>");
        x.f(lVar, "block");
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            x.c(fileOutputStreamStartWrite);
            lVar.invoke(fileOutputStreamStartWrite);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    public static final void writeBytes(android.util.AtomicFile atomicFile, byte[] bArr) throws IOException {
        x.f(atomicFile, "<this>");
        x.f(bArr, "array");
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            x.c(fileOutputStreamStartWrite);
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    public static final void writeText(android.util.AtomicFile atomicFile, String str, Charset charset) throws IOException {
        x.f(atomicFile, "<this>");
        x.f(str, "text");
        x.f(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        x.e(bytes, "getBytes(...)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            charset = a.f48221b;
        }
        writeText(atomicFile, str, charset);
    }
}
