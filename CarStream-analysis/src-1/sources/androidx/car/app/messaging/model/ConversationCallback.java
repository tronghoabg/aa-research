package androidx.car.app.messaging.model;

import androidx.car.app.annotations.CarProtocol;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public interface ConversationCallback {
    void onMarkAsRead();

    void onTextReply(String str);
}
