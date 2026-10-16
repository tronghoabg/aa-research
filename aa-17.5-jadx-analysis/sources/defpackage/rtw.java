package defpackage;

import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class rtw implements rtv {
    private final Object a = new Object();
    private final Queue b = new ArrayDeque();
    private rtv c = null;

    @Override // defpackage.rtv
    public final void a(ChannelMessage channelMessage) {
        synchronized (this.a) {
            rtv rtvVar = this.c;
            if (rtvVar != null) {
                rtvVar.a(channelMessage);
            } else {
                this.b.add(channelMessage);
            }
        }
    }

    final void b(rtv rtvVar) {
        ChannelMessage channelMessage;
        synchronized (this.a) {
            woy.Z(this.c == null);
        }
        while (true) {
            synchronized (this.a) {
                channelMessage = (ChannelMessage) this.b.poll();
                if (channelMessage == null) {
                    this.c = rtvVar;
                    return;
                }
            }
            rtvVar.a(channelMessage);
        }
    }
}
