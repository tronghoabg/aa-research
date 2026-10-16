package com.waze.inbox;

import com.google.android.material.textfield.ao;
import com.waze.NativeManager;
import com.waze.app_nav.ah;
import com.waze.jni.protos.InboxMessage;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class InboxNativeManager extends u {
    private static final com.waze.shared_infra.i.e LOGGER = com.waze.shared_infra.i.a.d("INBOX");
    private static InboxNativeManager mInstance;

    public static synchronized InboxNativeManager getInstance() {
        if (mInstance == null) {
            InboxNativeManager inboxNativeManager = new InboxNativeManager();
            mInstance = inboxNativeManager;
            inboxNativeManager.init();
        }
        return mInstance;
    }

    private void init() {
        NativeManager.registerOnAppStartedEvent(new ao(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void registerDataListenerNTV();

    protected native void deleteMessagesNTV(String[] strArr);

    protected native byte[] getCountersNTV();

    public native int getInboxBadgeNTV();

    public native int getInboxUnreadNTV();

    protected native byte[] getMessagesNTV();

    public native void initNativeLayerNTV();

    protected native void loadMoreMessagesNTV();

    protected native void markMessagesAsReadNTV(String[] strArr, boolean z);

    void onMessageRefreshed() {
        getInstance().getMessages(new com.waze.app_nav.hub.c.h(k.a(), 18));
    }

    void openInbox() {
        com.waze.app_nav.w wVarE = com.waze.alerters.a.k.e();
        d dVar = d.f24639a;
        com.waze.app_nav.p pVarA = new c((byte[]) null).a();
        h.g.b.x.f(wVarE, "<this>");
        h.g.b.x.f(pVarA, "flow");
        com.waze.alerters.a.k.c(wVarE, pVarA, ah.f15182a);
    }

    protected native void refreshNTV();

    protected native void resetInboxBadgeNTV();

    void showMessage(InboxMessage inboxMessage) {
        InboxPreviewActivity.m(new n(inboxMessage));
    }
}
