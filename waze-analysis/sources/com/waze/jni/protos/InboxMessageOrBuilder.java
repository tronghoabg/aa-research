package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.InboxMessage;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface InboxMessageOrBuilder extends fj {
    Advertisement getAdvertisement();

    String getId();

    v getIdBytes();

    String getMessage();

    v getMessageBytes();

    String getPreview();

    v getPreviewBytes();

    String getSentFormattedString();

    v getSentFormattedStringBytes();

    long getSentTimeSeconds();

    String getTitle();

    v getTitleBytes();

    InboxMessage.Type getType();

    int getTypeValue();

    boolean getUnread();

    boolean hasAdvertisement();

    boolean hasId();

    boolean hasMessage();

    boolean hasPreview();

    boolean hasSentFormattedString();

    boolean hasSentTimeSeconds();

    boolean hasTitle();

    boolean hasType();

    boolean hasUnread();
}
