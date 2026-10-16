package com.waze.jni.protos.network;

import com.waze.jni.protos.network.MessageRequestMetadata;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MessageRequestMetadataKt {
    public static final MessageRequestMetadataKt INSTANCE = new MessageRequestMetadataKt();

    private MessageRequestMetadataKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MessageRequestMetadata.Builder _builder;

        private Dsl(MessageRequestMetadata.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ MessageRequestMetadata _build() {
            MessageRequestMetadata messageRequestMetadataBuild = this._builder.build();
            x.e(messageRequestMetadataBuild, "build(...)");
            return messageRequestMetadataBuild;
        }

        public final void clearAuthType() {
            this._builder.clearAuthType();
        }

        public final void clearContext() {
            this._builder.clearContext();
        }

        public final void clearPriority() {
            this._builder.clearPriority();
        }

        public final void clearQueueId() {
            this._builder.clearQueueId();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final MessageAuthType getAuthType() {
            MessageAuthType authType = this._builder.getAuthType();
            x.e(authType, "getAuthType(...)");
            return authType;
        }

        public final int getAuthTypeValue() {
            return this._builder.getAuthTypeValue();
        }

        public final long getContext() {
            return this._builder.getContext();
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

        public final int getTransactionId() {
            return this._builder.getTransactionId();
        }

        public final String getType() {
            String type = this._builder.getType();
            x.e(type, "getType(...)");
            return type;
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            x.e(url, "getUrl(...)");
            return url;
        }

        public final boolean hasPriority() {
            return this._builder.hasPriority();
        }

        public final void setAuthType(MessageAuthType messageAuthType) {
            x.f(messageAuthType, "value");
            this._builder.setAuthType(messageAuthType);
        }

        public final void setAuthTypeValue(int i2) {
            this._builder.setAuthTypeValue(i2);
        }

        public final void setContext(long j2) {
            this._builder.setContext(j2);
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

        public final void setTransactionId(int i2) {
            this._builder.setTransactionId(i2);
        }

        public final void setType(String str) {
            x.f(str, "value");
            this._builder.setType(str);
        }

        public final void setUrl(String str) {
            x.f(str, "value");
            this._builder.setUrl(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(MessageRequestMetadata.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(MessageRequestMetadata.Builder builder, o oVar) {
            this(builder);
        }
    }
}
