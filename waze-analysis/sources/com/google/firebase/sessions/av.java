package com.google.firebase.sessions;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f10847a;

    /* renamed from: b, reason: collision with root package name */
    private Messenger f10848b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedBlockingDeque f10849c;

    /* renamed from: d, reason: collision with root package name */
    private final au f10850d;

    public av(h.c.j jVar) {
        h.g.b.x.f(jVar, "backgroundDispatcher");
        this.f10847a = jVar;
        this.f10849c = new LinkedBlockingDeque(20);
        this.f10850d = new au(this);
    }

    public static final /* synthetic */ void c(av avVar, Message message) throws RemoteException {
        if (avVar.f10848b == null) {
            avVar.k(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = avVar.f10848b;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e2) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
            avVar.k(message);
        }
    }

    public static final /* synthetic */ Message h(List list, int i2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i2) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        when = when2;
                    }
                    if (when < when2) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List j() {
        ArrayList arrayList = new ArrayList();
        this.f10849c.drainTo(arrayList);
        return arrayList;
    }

    private final void k(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = this.f10849c;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    private final void l(int i2) {
        List listJ = j();
        Message messageObtain = Message.obtain(null, i2, 0, 0);
        h.g.b.x.e(messageObtain, "obtain(...)");
        listJ.add(messageObtain);
        m(listJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(List list) {
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.e(this.f10847a), null, null, new at(this, list, (h.c.e) null, 0), 3);
    }

    public final void e() {
        l(2);
    }

    public final void f(ax axVar) {
        h.g.b.x.f(axVar, "sessionLifecycleServiceBinder");
        axVar.a(new Messenger(new as(this.f10847a)), this.f10850d);
    }

    public final void g() {
        l(1);
    }
}
