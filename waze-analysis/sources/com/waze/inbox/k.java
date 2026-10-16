package com.waze.inbox;

import com.waze.jni.protos.InboxMessage;
import com.waze.jni.protos.inbox.InboxMessageList;
import h.ab;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24666b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final k f24667c = new k();

    /* renamed from: e, reason: collision with root package name */
    private InboxMessageList f24670e;

    /* renamed from: d, reason: collision with root package name */
    private final Set f24669d = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final bn f24668a = ck.b(new l(0, 0));

    private k() {
    }

    public static k a() {
        return f24667c;
    }

    public static /* synthetic */ ab b(k kVar, InboxMessageList inboxMessageList) {
        kVar.f24670e = inboxMessageList;
        if (inboxMessageList != null) {
            Iterator it = kVar.f24669d.iterator();
            while (it.hasNext()) {
                ((InboxRecycler) it.next()).aP(kVar.f24670e);
            }
        }
        bn bnVar = kVar.f24668a;
        int unreadCount = kVar.f24670e.getUnreadCount();
        long sentTimeSeconds = 0;
        for (InboxMessage inboxMessage : inboxMessageList.getMessagesList()) {
            if (inboxMessage.getUnread() && inboxMessage.hasSentTimeSeconds() && inboxMessage.getSentTimeSeconds() > sentTimeSeconds) {
                sentTimeSeconds = inboxMessage.getSentTimeSeconds();
            }
        }
        bnVar.e(new l(unreadCount, sentTimeSeconds));
        return ab.f48028a;
    }

    public final synchronized void c(InboxRecycler inboxRecycler) {
        this.f24669d.add(inboxRecycler);
        InboxMessageList inboxMessageList = this.f24670e;
        if (inboxMessageList != null) {
            inboxRecycler.aP(inboxMessageList);
        }
    }

    public final synchronized void d(InboxRecycler inboxRecycler) {
        this.f24669d.remove(inboxRecycler);
    }

    public final void e(String[] strArr) {
        InboxNativeManager.getInstance().markMessagesAsRead(strArr, true);
    }
}
