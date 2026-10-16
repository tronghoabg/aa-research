package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rmh {
    static final void b(java.lang.String str, long j, java.lang.String str2, boolean z, java.lang.String str3, java.nio.ByteBuffer byteBuffer, java.io.PrintWriter printWriter) {
        printWriter.printf("%s  %d:%s:%c:%s:%d", str, java.lang.Long.valueOf(j), str2, java.lang.Character.valueOf(true != z ? 'R' : 'T'), str3, java.lang.Integer.valueOf(byteBuffer.remaining()));
    }

    public abstract void c(java.lang.String str, long j, boolean z, java.nio.ByteBuffer byteBuffer, java.io.PrintWriter printWriter);
}
