package com.waze.jni.protos.network;

import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface TransactionStatsMessageOrBuilder extends fj {
    int getIntegrityTokenGenerationLatencyMs();

    int getNetworkLatencyMs();

    MessagePriority getPriority();

    int getPriorityValue();

    TransactionQueueId getQueueId();

    int getQueueIdValue();

    int getQueueLatencyMs();

    int getRequestSizeBytes();

    int getResponseSizeBytes();

    int getRetries();

    int getServerProcessingLatencyMs();

    boolean hasIntegrityTokenGenerationLatencyMs();

    boolean hasNetworkLatencyMs();

    boolean hasPriority();

    boolean hasRequestSizeBytes();

    boolean hasResponseSizeBytes();

    boolean hasServerProcessingLatencyMs();
}
