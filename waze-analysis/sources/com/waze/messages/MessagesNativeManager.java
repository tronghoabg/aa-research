package com.waze.messages;

import com.waze.NativeManager;
import com.waze.user.UserData;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class MessagesNativeManager {
    private static MessagesNativeManager mInstance;

    public static MessagesNativeManager create() {
        MessagesNativeManager messagesNativeManager = mInstance;
        if (messagesNativeManager != null) {
            return messagesNativeManager;
        }
        MessagesNativeManager messagesNativeManager2 = new MessagesNativeManager();
        mInstance = messagesNativeManager2;
        return messagesNativeManager2;
    }

    public static MessagesNativeManager getInstance() {
        create();
        return mInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void onSendMessageNTV(UserData userData, String str);

    public native void InitNativeLayerNTV();

    public void sendMessage(UserData userData, String str) {
        NativeManager.Post(new a(this, userData, str));
    }
}
