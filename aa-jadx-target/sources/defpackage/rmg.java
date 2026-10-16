package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmg extends defpackage.rmh {
    public static defpackage.rmh a;
    private final defpackage.rsi b;

    public rmg(defpackage.rsi rsiVar) {
        this.b = rsiVar;
    }

    @Override // defpackage.rmh
    public final void c(java.lang.String str, long j, boolean z, java.nio.ByteBuffer byteBuffer, java.io.PrintWriter printWriter) {
        b(str, j, this.b.name(), z, java.lang.String.valueOf((int) ((char) byteBuffer.getShort())), byteBuffer, printWriter);
        printWriter.println();
    }
}
