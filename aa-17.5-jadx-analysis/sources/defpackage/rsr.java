package defpackage;

import com.google.android.gms.car.senderprotocol.Channel;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class rsr implements rst {
    final /* synthetic */ rss a;
    private final /* synthetic */ int b;

    public rsr(rss rssVar, int i) {
        this.b = i;
        this.a = rssVar;
    }

    @Override // defpackage.rst
    public final void a(ByteBuffer byteBuffer) {
        int i = this.b;
        rss rssVar = this.a;
        if (i == 0) {
            Channel channel = rssVar.b;
            channel.h = 3;
            channel.c.u(0);
            synchronized (channel.k) {
                int i2 = channel.h;
                if (i2 == 0) {
                    channel.d.u(0);
                    return;
                }
                if (i2 == 1) {
                    channel.i = true;
                } else if (i2 != 2) {
                    return;
                }
                rta rtaVar = channel.g;
                int i3 = channel.b;
                xip xipVar = xip.a;
                ByteBuffer byteBufferA = rvj.a.a(xipVar.e(null) + 2);
                byteBufferA.putShort((short) 9);
                try {
                    abmy abmyVar = new abmy(byteBufferA.array(), byteBufferA.arrayOffset() + 2, xipVar.e(null), null);
                    xipVar.R(abmyVar);
                    abmyVar.I();
                    byteBufferA.position(xipVar.e(null) + 2);
                    rtaVar.h(i3, byteBufferA, false, true, new rtb(true, false, 0));
                    channel.d.u(0);
                    channel.h = 4;
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + xipVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        }
        Channel channel2 = rssVar.b;
        if (channel2.h != 1) {
            if (!channel2.i) {
                Channel.a.h().ai(8249).u("Received unexpected channel control message");
                rta rtaVar2 = channel2.g;
                int i4 = channel2.b;
                ByteBuffer byteBufferA2 = rvj.a.a(2);
                byteBufferA2.putShort((short) 255);
                rtaVar2.h(i4, byteBufferA2, false, false, new rtb(false, false, 0));
                return;
            }
            channel2.i = false;
        }
        try {
            abnp abnpVarN = xir.a.n();
            xkr xkrVar = xkr.STATUS_UNSOLICITED_MESSAGE;
            abnpVarN.t();
            xir xirVar = (xir) abnpVarN.b;
            xirVar.c = xkrVar.I;
            xirVar.b |= 1;
            abnpVarN.x(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), abnj.a());
            xir xirVar2 = (xir) abnpVarN.q();
            xkr xkrVar2 = xkr.STATUS_SUCCESS;
            xkr xkrVarB = xkr.b(xirVar2.c);
            if (xkrVarB == null) {
                xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
            }
            boolean zEquals = xkrVar2.equals(xkrVarB);
            rss rssVar2 = this.a;
            if (!zEquals) {
                Channel channel3 = rssVar2.b;
                channel3.c.u(1);
                channel3.d();
            } else {
                Channel channel4 = rssVar2.b;
                channel4.h = 2;
                channel4.d.v();
                channel4.c.v();
            }
        } catch (IOException unused) {
            Channel.a.h().ai(8248).u("Received invalid protocol buffer");
        }
    }
}
