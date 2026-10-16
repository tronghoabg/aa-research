package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jdd {
    final /* synthetic */ jde a;
    private final WritableByteChannel b;
    private final ParcelFileDescriptor.AutoCloseOutputStream c;

    public jdd(jde jdeVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = jdeVar;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        this.c = autoCloseOutputStream;
        this.b = Channels.newChannel(autoCloseOutputStream);
    }

    public final void a() {
        synchronized (this.a.h) {
            try {
                this.c.close();
            } catch (IOException e) {
                yop yopVarAi = jde.a.h().p(e).ai(1893);
                int i = this.a.j;
                String strL = dlz.L(i);
                if (i == 0) {
                    throw null;
                }
                yopVarAi.y("%s Closing with exception", strL);
            }
        }
    }

    public final synchronized void b(qtk qtkVar, ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(qtkVar.h());
        byteBufferAllocate.put((byte) byteBufferWrap.remaining());
        byteBufferAllocate.flip();
        ByteBuffer[] byteBufferArr = {byteBufferAllocate, byteBufferWrap, byteBuffer};
        for (int i = 0; i < 3; i++) {
            ByteBuffer byteBuffer2 = byteBufferArr[i];
            int iWrite = 0;
            while (byteBuffer2.hasRemaining() && iWrite >= 0) {
                iWrite = this.b.write(byteBuffer2);
                jde jdeVar = this.a;
                jcx jcxVar = jdeVar.d;
                if (jcxVar != null) {
                    Executor executor = jdeVar.e;
                    executor.getClass();
                    executor.execute(new hhx(jcxVar, iWrite, 6));
                }
            }
        }
    }

    public final synchronized void c(qtk qtkVar) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(qtkVar.h());
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
            byteBufferAllocate.put((byte) byteBufferWrap.remaining());
            byteBufferAllocate.flip();
            ByteBuffer[] byteBufferArr = {byteBufferAllocate, byteBufferWrap};
            for (int i = 0; i < 2; i++) {
                ByteBuffer byteBuffer = byteBufferArr[i];
                int iWrite = 0;
                while (byteBuffer.hasRemaining() && iWrite >= 0) {
                    iWrite = this.b.write(byteBuffer);
                    jde jdeVar = this.a;
                    jcx jcxVar = jdeVar.d;
                    if (jcxVar != null) {
                        Executor executor = jdeVar.e;
                        executor.getClass();
                        executor.execute(new ira(jcxVar, iWrite, 2));
                    }
                }
            }
        } catch (IOException e) {
            yop yopVarAi = jde.a.h().p(e).ai(1894);
            jde jdeVar2 = this.a;
            int i2 = jdeVar2.j;
            if (i2 == 0) {
                throw null;
            }
            yopVarAi.y("%s Closing with exception", dlz.L(i2));
            jdeVar2.c.aF(yze.CAR_SERVICE_CONNECTION_ERROR, yzf.WRITER_IO_ERROR, "Failed to write control message");
        }
    }
}
