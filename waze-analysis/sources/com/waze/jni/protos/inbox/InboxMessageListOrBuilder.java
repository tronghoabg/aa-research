package com.waze.jni.protos.inbox;

import com.google.v.fj;
import com.waze.jni.protos.InboxMessage;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface InboxMessageListOrBuilder extends fj {
    int getBadge();

    boolean getHasMore();

    InboxMessage getMessages(int i2);

    int getMessagesCount();

    List<InboxMessage> getMessagesList();

    int getUnreadCount();

    boolean hasBadge();

    boolean hasHasMore();

    boolean hasUnreadCount();
}
