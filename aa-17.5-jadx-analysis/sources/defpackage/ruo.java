package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.io.IOException;

/* loaded from: classes2.dex */
final class ruo extends sss {
    final /* synthetic */ rup a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ruo(rup rupVar, Looper looper) {
        super(looper);
        this.a = rupVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            if (message.what != 1) {
                rup.a.g().ai(8337).u("Unexpected message");
                return;
            }
            while (true) {
                rup rupVar = this.a;
                ChannelMessage channelMessage = !rupVar.d ? null : (ChannelMessage) rupVar.c.poll();
                if (channelMessage == null) {
                    return;
                }
                vqk vqkVar = rsm.a;
                rlc.a(vqkVar);
                rupVar.f.a(channelMessage, rupVar.c.isEmpty());
                rlc.a(vqkVar);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
