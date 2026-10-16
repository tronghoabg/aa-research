package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.senderprotocol.Channel;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class rsz extends rbj {
    public rsz(rta rtaVar, Looper looper) {
        super(rtaVar, looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Channel channel;
        rlc.a(rsm.a);
        rta rtaVar = (rta) v();
        if (rtaVar == null) {
            rta.a.f().ai(8257).u("Dropping message, no channel manager");
            return;
        }
        synchronized (rtaVar.d) {
            channel = rtaVar.c[message.arg1];
        }
        int i = message.what;
        if (i == 0) {
            ByteBuffer byteBuffer = (ByteBuffer) message.obj;
            if (channel.h == 2) {
                channel.d.h(byteBuffer);
            }
        } else if (i == 1) {
            ByteBuffer byteBuffer2 = (ByteBuffer) message.obj;
            short s = byteBuffer2.getShort();
            ByteBuffer byteBufferSlice = byteBuffer2.slice();
            rss rssVar = channel.j;
            rst rstVar = (rst) rssVar.a.get(s);
            if (rstVar != null) {
                synchronized (rssVar.b.k) {
                    rstVar.a(byteBufferSlice);
                }
            }
        } else {
            if (i != 2) {
                throw new RuntimeException(a.cc(message, "Unknown message "));
            }
            channel.d.e(message.arg2);
        }
        rlc.a(rsm.a);
    }
}
