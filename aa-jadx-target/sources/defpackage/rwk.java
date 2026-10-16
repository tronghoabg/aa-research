package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rwk {
    final /* synthetic */ defpackage.rwl a;
    private final java.nio.channels.WritableByteChannel b;
    private final android.os.ParcelFileDescriptor.AutoCloseOutputStream c;

    public rwk(defpackage.rwl rwlVar, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = rwlVar;
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        this.c = autoCloseOutputStream;
        this.b = java.nio.channels.Channels.newChannel(autoCloseOutputStream);
    }

    public final void a() {
        synchronized (this.a.f) {
            try {
                this.c.close();
            } catch (java.io.IOException e) {
                defpackage.ypu ypuVarAi = defpackage.rwl.a.h().p(e).ai(8440);
                int i = this.a.h;
                java.lang.String strM = defpackage.ooa.m(i);
                if (i == 0) {
                    throw null;
                }
                ypuVarAi.y("%s Closing with exception", strM);
            }
        }
    }

    public final synchronized void b(defpackage.qug qugVar, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(1);
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(qugVar.h());
        byteBufferAllocate.put((byte) byteBufferWrap.remaining());
        byteBufferAllocate.flip();
        java.nio.ByteBuffer[] byteBufferArr = {byteBufferAllocate, byteBufferWrap, byteBuffer};
        for (int i = 0; i < 3; i++) {
            java.nio.ByteBuffer byteBuffer2 = byteBufferArr[i];
            int iWrite = 0;
            while (byteBuffer2.hasRemaining() && iWrite >= 0) {
                iWrite = this.b.write(byteBuffer2);
            }
        }
    }
}
