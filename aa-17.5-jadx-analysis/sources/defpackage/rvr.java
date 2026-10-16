package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public final class rvr {
    final /* synthetic */ rvs a;
    private final WritableByteChannel b;
    private final ParcelFileDescriptor.AutoCloseOutputStream c;

    public rvr(rvs rvsVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = rvsVar;
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
        this.c = autoCloseOutputStream;
        this.b = Channels.newChannel(autoCloseOutputStream);
    }

    public final void a() {
        synchronized (this.a.f) {
            try {
                this.c.close();
            } catch (IOException e) {
                yop yopVarAi = rvs.a.h().p(e).ai(8415);
                int i = this.a.h;
                String strG = ols.G(i);
                if (i == 0) {
                    throw null;
                }
                yopVarAi.y("%s Closing with exception", strG);
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
            }
        }
    }
}
