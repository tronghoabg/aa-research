package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class rll {
    static final void b(String str, long j, String str2, boolean z, String str3, ByteBuffer byteBuffer, PrintWriter printWriter) {
        printWriter.printf("%s  %d:%s:%c:%s:%d", str, Long.valueOf(j), str2, Character.valueOf(true != z ? 'R' : 'T'), str3, Integer.valueOf(byteBuffer.remaining()));
    }

    public abstract void c(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter);
}
