package defpackage;

import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class izk extends rbj {
    public izk(izl izlVar, Looper looper) {
        super(izlVar, looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        izd izdVar;
        izl izlVar = (izl) v();
        if (izlVar == null) {
            izl.a.f().ai(1676).u("Dropping message, no channel manager");
            return;
        }
        synchronized (izlVar.d) {
            izdVar = izlVar.c[message.arg1];
        }
        int i = message.what;
        if (i == 0) {
            ByteBuffer byteBuffer = (ByteBuffer) message.obj;
            izdVar.k.getAndAdd(byteBuffer.remaining());
            if (izdVar.h.get() == 2) {
                izdVar.d.S(byteBuffer);
                return;
            }
            return;
        }
        if (i != 1) {
            if (i == 2) {
                izdVar.d.b(message.arg2);
                return;
            } else {
                if (i != 3) {
                    throw new RuntimeException(a.cc(message, "Unknown message "));
                }
                izdVar.d.R(message.arg2);
                return;
            }
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) message.obj;
        izdVar.k.getAndAdd(byteBuffer2.remaining());
        short s = byteBuffer2.getShort();
        ByteBuffer byteBufferSlice = byteBuffer2.slice();
        izb izbVar = izdVar.j;
        izc izcVar = (izc) izbVar.a.get(s);
        if (izcVar == null) {
            return;
        }
        synchronized (izbVar.b.l) {
            izcVar.a(byteBufferSlice);
        }
    }
}
