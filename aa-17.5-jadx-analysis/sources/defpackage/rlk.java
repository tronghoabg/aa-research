package defpackage;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class rlk extends rll {
    public static rll a;
    private final rro b;

    public rlk(rro rroVar) {
        this.b = rroVar;
    }

    @Override // defpackage.rll
    public final void c(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        b(str, j, this.b.name(), z, String.valueOf((int) ((char) byteBuffer.getShort())), byteBuffer, printWriter);
        printWriter.println();
    }
}
