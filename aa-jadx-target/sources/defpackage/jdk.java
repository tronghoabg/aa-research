package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jdk {
    final /* synthetic */ defpackage.jdl a;
    private final java.nio.channels.WritableByteChannel b;
    private final android.os.ParcelFileDescriptor.AutoCloseOutputStream c;

    public jdk(defpackage.jdl jdlVar, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.a = jdlVar;
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        this.c = autoCloseOutputStream;
        this.b = java.nio.channels.Channels.newChannel(autoCloseOutputStream);
    }

    public final void a() {
        synchronized (this.a.h) {
            try {
                this.c.close();
            } catch (java.io.IOException e) {
                defpackage.ypu ypuVarAi = defpackage.jdl.a.h().p(e).ai(1893);
                int i = this.a.j;
                java.lang.String strT = defpackage.ebm.t(i);
                if (i == 0) {
                    throw null;
                }
                ypuVarAi.y("%s Closing with exception", strT);
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
                defpackage.jdl jdlVar = this.a;
                defpackage.jde jdeVar = jdlVar.d;
                if (jdeVar != null) {
                    java.util.concurrent.Executor executor = jdlVar.e;
                    executor.getClass();
                    executor.execute(new defpackage.hif(jdeVar, iWrite, 6));
                }
            }
        }
    }

    public final synchronized void c(defpackage.qug qugVar) {
        try {
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(qugVar.h());
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(1);
            byteBufferAllocate.put((byte) byteBufferWrap.remaining());
            byteBufferAllocate.flip();
            java.nio.ByteBuffer[] byteBufferArr = {byteBufferAllocate, byteBufferWrap};
            for (int i = 0; i < 2; i++) {
                java.nio.ByteBuffer byteBuffer = byteBufferArr[i];
                int iWrite = 0;
                while (byteBuffer.hasRemaining() && iWrite >= 0) {
                    iWrite = this.b.write(byteBuffer);
                    defpackage.jdl jdlVar = this.a;
                    defpackage.jde jdeVar = jdlVar.d;
                    if (jdeVar != null) {
                        java.util.concurrent.Executor executor = jdlVar.e;
                        executor.getClass();
                        executor.execute(new defpackage.irj(jdeVar, iWrite, 2));
                    }
                }
            }
        } catch (java.io.IOException e) {
            defpackage.ypu ypuVarAi = defpackage.jdl.a.h().p(e).ai(1894);
            defpackage.jdl jdlVar2 = this.a;
            int i2 = jdlVar2.j;
            if (i2 == 0) {
                throw null;
            }
            ypuVarAi.y("%s Closing with exception", defpackage.ebm.t(i2));
            jdlVar2.c.aF(defpackage.zaj.CAR_SERVICE_CONNECTION_ERROR, defpackage.zak.WRITER_IO_ERROR, "Failed to write control message");
        }
    }
}
