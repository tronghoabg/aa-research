package androidx.car.app.messaging.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(7)
/* loaded from: classes2.dex */
public interface ConversationCallbackDelegate {
    void sendMarkAsRead(OnDoneCallback onDoneCallback);

    void sendTextReply(String str, OnDoneCallback onDoneCallback);
}
