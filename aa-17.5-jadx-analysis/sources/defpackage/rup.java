package defpackage;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.car.senderprotocol.Channel;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class rup extends rvi {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public final Map b;
    final BlockingQueue c;
    private final AtomicLong g;
    private volatile Handler h;

    public rup(rts rtsVar, wyd wydVar, boolean z, Bundle bundle) {
        super(rtsVar, wydVar);
        this.g = new AtomicLong(1L);
        if (z) {
            this.b = new ConcurrentHashMap();
        } else {
            this.b = new HashMap();
        }
        this.c = new PriorityBlockingQueue(80, new czs(this, 8));
        if (bundle.containsKey("writer_channel_priority_state")) {
            this.b.putAll((Map) ruw.b(Map.class, bundle.getBinder("writer_channel_priority_state")));
        }
        if (bundle.containsKey("writer_message_queue_state")) {
            ArrayList<ChannelMessage> parcelableArrayList = bundle.getParcelableArrayList("writer_message_queue_state");
            parcelableArrayList.getClass();
            for (ChannelMessage channelMessage : parcelableArrayList) {
                channelMessage.a(this.g.getAndIncrement());
                h(channelMessage);
            }
        }
    }

    private final void g(int i) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            throw new IllegalStateException(String.format("Attempting to send a message on channel (%d) before it has been prepared", numValueOf));
        }
        if (map.get(numValueOf) == null) {
            throw new IllegalStateException(String.format("Attempting to send a message on channel (%d) without an assigned priority.", numValueOf));
        }
    }

    private final void h(ChannelMessage channelMessage) {
        g(channelMessage.b);
        if (!channelMessage.b()) {
            channelMessage.a(this.g.getAndIncrement());
        }
        this.c.add(channelMessage);
        if (this.h != null) {
            this.h.sendEmptyMessage(1);
        }
    }

    @Override // defpackage.rvi
    public final void a(Bundle bundle) {
        bundle.putParcelableArrayList("writer_message_queue_state", new ArrayList<>(this.c));
        yfy yfyVarJ = yfy.j(this.b);
        ypf ypfVar = ruw.a;
        bundle.putBinder("writer_channel_priority_state", new ruc(yfyVarJ));
    }

    @Override // defpackage.rvi
    public final void b(ChannelMessage channelMessage) {
        h(channelMessage);
    }

    @Override // defpackage.rvi
    public final void c(Channel channel) {
        this.b.put(Integer.valueOf(channel.b), channel.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rvi
    public final void d(Collection collection) {
        long andAdd = this.g.getAndAdd(((yls) collection).c);
        ynp ynpVarListIterator = ((yfq) collection).listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            ChannelMessage channelMessage = (ChannelMessage) ynpVarListIterator.next();
            g(channelMessage.b);
            if (!channelMessage.b()) {
                channelMessage.a(andAdd);
                andAdd = 1 + andAdd;
            }
            this.c.add(channelMessage);
        }
        if (this.h != null) {
            this.h.sendEmptyMessage(1);
        }
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        super.onLooperPrepared();
        this.h = new ruo(this, getLooper());
        this.h.sendEmptyMessage(1);
    }
}
