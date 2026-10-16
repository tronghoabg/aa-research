package com.waze.jni.protos.network;

import com.waze.jni.protos.network.TransactionStatsMessage;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TransactionStatsMessageKt {
    public static final TransactionStatsMessageKt INSTANCE = new TransactionStatsMessageKt();

    private TransactionStatsMessageKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionStatsMessage.Builder _builder;

        private Dsl(TransactionStatsMessage.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TransactionStatsMessage _build() {
            TransactionStatsMessage transactionStatsMessageBuild = this._builder.build();
            x.e(transactionStatsMessageBuild, "build(...)");
            return transactionStatsMessageBuild;
        }

        public final void clearIntegrityTokenGenerationLatencyMs() {
            this._builder.clearIntegrityTokenGenerationLatencyMs();
        }

        public final void clearNetworkLatencyMs() {
            this._builder.clearNetworkLatencyMs();
        }

        public final void clearPriority() {
            this._builder.clearPriority();
        }

        public final void clearQueueId() {
            this._builder.clearQueueId();
        }

        public final void clearQueueLatencyMs() {
            this._builder.clearQueueLatencyMs();
        }

        public final void clearRequestSizeBytes() {
            this._builder.clearRequestSizeBytes();
        }

        public final void clearResponseSizeBytes() {
            this._builder.clearResponseSizeBytes();
        }

        public final void clearRetries() {
            this._builder.clearRetries();
        }

        public final void clearServerProcessingLatencyMs() {
            this._builder.clearServerProcessingLatencyMs();
        }

        public final int getIntegrityTokenGenerationLatencyMs() {
            return this._builder.getIntegrityTokenGenerationLatencyMs();
        }

        public final int getNetworkLatencyMs() {
            return this._builder.getNetworkLatencyMs();
        }

        public final MessagePriority getPriority() {
            MessagePriority priority = this._builder.getPriority();
            x.e(priority, "getPriority(...)");
            return priority;
        }

        public final int getPriorityValue() {
            return this._builder.getPriorityValue();
        }

        public final TransactionQueueId getQueueId() {
            TransactionQueueId queueId = this._builder.getQueueId();
            x.e(queueId, "getQueueId(...)");
            return queueId;
        }

        public final int getQueueIdValue() {
            return this._builder.getQueueIdValue();
        }

        public final int getQueueLatencyMs() {
            return this._builder.getQueueLatencyMs();
        }

        public final int getRequestSizeBytes() {
            return this._builder.getRequestSizeBytes();
        }

        public final int getResponseSizeBytes() {
            return this._builder.getResponseSizeBytes();
        }

        public final int getRetries() {
            return this._builder.getRetries();
        }

        public final int getServerProcessingLatencyMs() {
            return this._builder.getServerProcessingLatencyMs();
        }

        public final boolean hasIntegrityTokenGenerationLatencyMs() {
            return this._builder.hasIntegrityTokenGenerationLatencyMs();
        }

        public final boolean hasNetworkLatencyMs() {
            return this._builder.hasNetworkLatencyMs();
        }

        public final boolean hasPriority() {
            return this._builder.hasPriority();
        }

        public final boolean hasRequestSizeBytes() {
            return this._builder.hasRequestSizeBytes();
        }

        public final boolean hasResponseSizeBytes() {
            return this._builder.hasResponseSizeBytes();
        }

        public final boolean hasServerProcessingLatencyMs() {
            return this._builder.hasServerProcessingLatencyMs();
        }

        public final void setIntegrityTokenGenerationLatencyMs(int i2) {
            this._builder.setIntegrityTokenGenerationLatencyMs(i2);
        }

        public final void setNetworkLatencyMs(int i2) {
            this._builder.setNetworkLatencyMs(i2);
        }

        public final void setPriority(MessagePriority messagePriority) {
            x.f(messagePriority, "value");
            this._builder.setPriority(messagePriority);
        }

        public final void setPriorityValue(int i2) {
            this._builder.setPriorityValue(i2);
        }

        public final void setQueueId(TransactionQueueId transactionQueueId) {
            x.f(transactionQueueId, "value");
            this._builder.setQueueId(transactionQueueId);
        }

        public final void setQueueIdValue(int i2) {
            this._builder.setQueueIdValue(i2);
        }

        public final void setQueueLatencyMs(int i2) {
            this._builder.setQueueLatencyMs(i2);
        }

        public final void setRequestSizeBytes(int i2) {
            this._builder.setRequestSizeBytes(i2);
        }

        public final void setResponseSizeBytes(int i2) {
            this._builder.setResponseSizeBytes(i2);
        }

        public final void setRetries(int i2) {
            this._builder.setRetries(i2);
        }

        public final void setServerProcessingLatencyMs(int i2) {
            this._builder.setServerProcessingLatencyMs(i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TransactionStatsMessage.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(TransactionStatsMessage.Builder builder, o oVar) {
            this(builder);
        }
    }
}
