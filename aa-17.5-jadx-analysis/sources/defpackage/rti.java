package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class rti extends sss {
    final /* synthetic */ rtj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rti(rtj rtjVar, Looper looper) {
        super(looper);
        this.a = rtjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    rtj.a.g().ai(8283).u("Unexpected message");
                    return;
                }
                rtj rtjVar = this.a;
                Iterator it = rtjVar.b.iterator();
                while (it.hasNext()) {
                    rtjVar.f.a((ChannelMessage) it.next(), true);
                }
                return;
            }
            ChannelMessage channelMessage = (ChannelMessage) message.obj;
            rtj rtjVar2 = this.a;
            if (!rtjVar2.d) {
                rtjVar2.b.add(channelMessage);
                return;
            }
            vqk vqkVar = rsm.a;
            rlc.a(vqkVar);
            rtjVar2.f.a(channelMessage, true);
            rlc.a(vqkVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
