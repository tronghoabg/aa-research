package com.waze.jni.protos.network;

import com.google.v.fj;
import com.google.v.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MessageRequestMetadataOrBuilder extends fj {
    MessageAuthType getAuthType();

    int getAuthTypeValue();

    long getContext();

    MessagePriority getPriority();

    int getPriorityValue();

    TransactionQueueId getQueueId();

    int getQueueIdValue();

    int getTransactionId();

    String getType();

    v getTypeBytes();

    String getUrl();

    v getUrlBytes();

    boolean hasPriority();
}
