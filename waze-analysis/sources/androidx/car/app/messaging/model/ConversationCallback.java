package androidx.car.app.messaging.model;

import androidx.car.app.annotations.CarProtocol;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public interface ConversationCallback {
    void onMarkAsRead();

    void onTextReply(String str);
}
