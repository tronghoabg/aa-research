package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jaj {
    public final java.nio.ByteBuffer a;
    public byte[] b;
    public final boolean c;
    public final java.io.OutputStream d;
    final /* synthetic */ defpackage.jak e;

    public jaj(defpackage.jak jakVar, java.io.OutputStream outputStream, int i) {
        this.e = jakVar;
        this.a = java.nio.ByteBuffer.allocate(8);
        this.b = new byte[8];
        this.d = new java.io.BufferedOutputStream(outputStream, i);
        this.c = true;
    }

    public jaj(defpackage.jak jakVar, java.io.OutputStream outputStream) {
        this.e = jakVar;
        this.a = java.nio.ByteBuffer.allocate(8);
        this.b = new byte[8];
        this.d = outputStream;
        this.c = false;
    }
}
