package com.waze.inbox;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.InboxMessage;
import com.waze.jni.protos.inbox.InboxMessageList;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class u {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteMessages$default(u uVar, String[] strArr, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteMessages");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        uVar.deleteMessages(strArr, lVar);
    }

    static final ab deleteMessages$lambda$0(u uVar, String[] strArr) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).deleteMessagesNTV(strArr);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCounters$default(u uVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCounters");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        uVar.getCounters(lVar);
    }

    static final byte[] getCounters$lambda$0(u uVar) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        return ((InboxNativeManager) uVar).getCountersNTV();
    }

    static final void getCounters$lambda$1(h.g.a.l lVar, byte[] bArr) {
        InboxMessageList inboxMessageList = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                inboxMessageList = (InboxMessageList) InboxMessageList.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(inboxMessageList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMessages$default(u uVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessages");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        uVar.getMessages(lVar);
    }

    static final byte[] getMessages$lambda$0(u uVar) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        return ((InboxNativeManager) uVar).getMessagesNTV();
    }

    static final void getMessages$lambda$1(h.g.a.l lVar, byte[] bArr) {
        InboxMessageList inboxMessageList = null;
        if (bArr == null) {
            if (lVar != null) {
                lVar.invoke(null);
            }
        } else {
            try {
                inboxMessageList = (InboxMessageList) InboxMessageList.parser().c(bArr);
            } catch (eu unused) {
            }
            if (lVar != null) {
                lVar.invoke(inboxMessageList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadMoreMessages$default(u uVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreMessages");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        uVar.loadMoreMessages(lVar);
    }

    static final ab loadMoreMessages$lambda$0(u uVar) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).loadMoreMessagesNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void markMessagesAsRead$default(u uVar, String[] strArr, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markMessagesAsRead");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        uVar.markMessagesAsRead(strArr, z, lVar);
    }

    static final ab markMessagesAsRead$lambda$0(u uVar, String[] strArr, boolean z) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).markMessagesAsReadNTV(strArr, z);
        return null;
    }

    static final void onMessageRefreshedJNI$lambda$0(u uVar) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).onMessageRefreshed();
    }

    static final void openInboxJNI$lambda$0(u uVar) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).openInbox();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(u uVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        uVar.refresh(lVar);
    }

    static final ab refresh$lambda$0(u uVar) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).refreshNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void resetInboxBadge$default(u uVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetInboxBadge");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        uVar.resetInboxBadge(lVar);
    }

    static final ab resetInboxBadge$lambda$0(u uVar) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).resetInboxBadgeNTV();
        return null;
    }

    static final void showMessageJNI$lambda$0(u uVar, InboxMessage inboxMessage) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.inbox.InboxNativeManager");
        ((InboxNativeManager) uVar).showMessage(inboxMessage);
    }

    public void deleteMessages(final String[] strArr, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.inbox.q
            @Override // com.waze.hw
            public final Object a() {
                u.deleteMessages$lambda$0(this.f24678a, strArr);
                return null;
            }
        }, lVar != null ? new p(lVar, 5) : null);
    }

    public void getCounters(h.g.a.l<? super InboxMessageList, ab> lVar) {
        int i2 = 0;
        NativeManager.runNativeTask(new o(this, i2), new p(lVar, i2));
    }

    public void getMessages(h.g.a.l<? super InboxMessageList, ab> lVar) {
        NativeManager.runNativeTask(new o(this, 1), new p(lVar, 4));
    }

    public void loadMoreMessages(h.g.a.l<? super ab, ab> lVar) {
        int i2 = 3;
        NativeManager.runNativeTask(new o(this, i2), lVar != null ? new p(lVar, i2) : null);
    }

    public void markMessagesAsRead(final String[] strArr, final boolean z, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.inbox.t
            @Override // com.waze.hw
            public final Object a() {
                u.markMessagesAsRead$lambda$0(this.f24684a, strArr, z);
                return null;
            }
        }, lVar != null ? new p(lVar, 1) : null);
    }

    protected final void onMessageRefreshedJNI() {
        NativeManager.runMainThreadTask(new r(this, 1));
    }

    protected final void openInboxJNI() {
        NativeManager.runMainThreadTask(new r(this, 0));
    }

    public void refresh(h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new o(this, 4), lVar != null ? new p(lVar, 6) : null);
    }

    public void resetInboxBadge(h.g.a.l<? super ab, ab> lVar) {
        int i2 = 2;
        NativeManager.runNativeTask(new o(this, i2), lVar != null ? new p(lVar, i2) : null);
    }

    protected final void showMessageJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "message");
        try {
            final InboxMessage inboxMessage = (InboxMessage) InboxMessage.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.inbox.s
                @Override // java.lang.Runnable
                public final void run() {
                    u.showMessageJNI$lambda$0(this.f24682a, inboxMessage);
                }
            });
        } catch (eu unused) {
        }
    }

    public final void getCounters() {
        getCounters$default(this, null, 1, null);
    }

    public final void getMessages() {
        getMessages$default(this, null, 1, null);
    }

    public final void deleteMessages(String[] strArr) {
        deleteMessages$default(this, strArr, null, 2, null);
    }

    public final void loadMoreMessages() {
        loadMoreMessages$default(this, null, 1, null);
    }

    public final void markMessagesAsRead(String[] strArr, boolean z) {
        markMessagesAsRead$default(this, strArr, z, null, 4, null);
    }

    public final void resetInboxBadge() {
        resetInboxBadge$default(this, null, 1, null);
    }

    public final void refresh() {
        refresh$default(this, null, 1, null);
    }
}
