package com.waze.jni.protos.inbox;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.InboxMessage;
import com.waze.jni.protos.InboxMessageOrBuilder;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InboxMessageList extends du<InboxMessageList, Builder> implements InboxMessageListOrBuilder {
    public static final int BADGE_FIELD_NUMBER = 2;
    private static final InboxMessageList DEFAULT_INSTANCE;
    public static final int HAS_MORE_FIELD_NUMBER = 4;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile fo<InboxMessageList> PARSER = null;
    public static final int UNREAD_COUNT_FIELD_NUMBER = 3;
    private int badge_;
    private int bitField0_;
    private boolean hasMore_;
    private eo<InboxMessage> messages_ = emptyProtobufList();
    private int unreadCount_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.inbox.InboxMessageList$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        InboxMessageList inboxMessageList = new InboxMessageList();
        DEFAULT_INSTANCE = inboxMessageList;
        du.registerDefaultInstance(InboxMessageList.class, inboxMessageList);
    }

    private InboxMessageList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessages(Iterable<? extends InboxMessage> iterable) {
        ensureMessagesIsMutable();
        c.addAll(iterable, this.messages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(int i2, InboxMessage inboxMessage) {
        Objects.requireNonNull(inboxMessage);
        ensureMessagesIsMutable();
        this.messages_.add(i2, inboxMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.bitField0_ &= -2;
        this.badge_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMore() {
        this.bitField0_ &= -5;
        this.hasMore_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessages() {
        this.messages_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnreadCount() {
        this.bitField0_ &= -3;
        this.unreadCount_ = 0;
    }

    private void ensureMessagesIsMutable() {
        eo<InboxMessage> eoVar = this.messages_;
        if (eoVar.c()) {
            return;
        }
        this.messages_ = du.mutableCopy(eoVar);
    }

    public static InboxMessageList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static InboxMessageList parseDelimitedFrom(InputStream inputStream) {
        return (InboxMessageList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxMessageList parseFrom(v vVar) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<InboxMessageList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessages(int i2) {
        ensureMessagesIsMutable();
        this.messages_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(int i2) {
        this.bitField0_ |= 1;
        this.badge_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMore(boolean z) {
        this.bitField0_ |= 4;
        this.hasMore_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessages(int i2, InboxMessage inboxMessage) {
        Objects.requireNonNull(inboxMessage);
        ensureMessagesIsMutable();
        this.messages_.set(i2, inboxMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreadCount(int i2) {
        this.bitField0_ |= 2;
        this.unreadCount_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "messages_", InboxMessage.class, "badge_", "unreadCount_", "hasMore_"});
        }
        if (iOrdinal == 3) {
            return new InboxMessageList();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<InboxMessageList> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (InboxMessageList.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public int getBadge() {
        return this.badge_;
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public boolean getHasMore() {
        return this.hasMore_;
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public InboxMessage getMessages(int i2) {
        return this.messages_.get(i2);
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public int getMessagesCount() {
        return this.messages_.size();
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public List<InboxMessage> getMessagesList() {
        return this.messages_;
    }

    public InboxMessageOrBuilder getMessagesOrBuilder(int i2) {
        return this.messages_.get(i2);
    }

    public List<? extends InboxMessageOrBuilder> getMessagesOrBuilderList() {
        return this.messages_;
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public int getUnreadCount() {
        return this.unreadCount_;
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public boolean hasBadge() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public boolean hasHasMore() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
    public boolean hasUnreadCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(InboxMessageList inboxMessageList) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(inboxMessageList);
    }

    public static InboxMessageList parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (InboxMessageList) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static InboxMessageList parseFrom(v vVar, de deVar) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static InboxMessageList parseFrom(z zVar) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static InboxMessageList parseFrom(z zVar, de deVar) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(InboxMessage inboxMessage) {
        Objects.requireNonNull(inboxMessage);
        ensureMessagesIsMutable();
        this.messages_.add(inboxMessage);
    }

    public static InboxMessageList parseFrom(InputStream inputStream) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxMessageList parseFrom(InputStream inputStream, de deVar) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static InboxMessageList parseFrom(ByteBuffer byteBuffer) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InboxMessageList parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<InboxMessageList, Builder> implements InboxMessageListOrBuilder {
        private Builder() {
            super(InboxMessageList.DEFAULT_INSTANCE);
        }

        public Builder addAllMessages(Iterable<? extends InboxMessage> iterable) {
            copyOnWrite();
            ((InboxMessageList) this.instance).addAllMessages(iterable);
            return this;
        }

        public Builder addMessages(int i2, InboxMessage.Builder builder) {
            copyOnWrite();
            ((InboxMessageList) this.instance).addMessages(i2, builder.build());
            return this;
        }

        public Builder clearBadge() {
            copyOnWrite();
            ((InboxMessageList) this.instance).clearBadge();
            return this;
        }

        public Builder clearHasMore() {
            copyOnWrite();
            ((InboxMessageList) this.instance).clearHasMore();
            return this;
        }

        public Builder clearMessages() {
            copyOnWrite();
            ((InboxMessageList) this.instance).clearMessages();
            return this;
        }

        public Builder clearUnreadCount() {
            copyOnWrite();
            ((InboxMessageList) this.instance).clearUnreadCount();
            return this;
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public int getBadge() {
            return ((InboxMessageList) this.instance).getBadge();
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public boolean getHasMore() {
            return ((InboxMessageList) this.instance).getHasMore();
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public InboxMessage getMessages(int i2) {
            return ((InboxMessageList) this.instance).getMessages(i2);
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public int getMessagesCount() {
            return ((InboxMessageList) this.instance).getMessagesCount();
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public List<InboxMessage> getMessagesList() {
            return DesugarCollections.unmodifiableList(((InboxMessageList) this.instance).getMessagesList());
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public int getUnreadCount() {
            return ((InboxMessageList) this.instance).getUnreadCount();
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public boolean hasBadge() {
            return ((InboxMessageList) this.instance).hasBadge();
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public boolean hasHasMore() {
            return ((InboxMessageList) this.instance).hasHasMore();
        }

        @Override // com.waze.jni.protos.inbox.InboxMessageListOrBuilder
        public boolean hasUnreadCount() {
            return ((InboxMessageList) this.instance).hasUnreadCount();
        }

        public Builder removeMessages(int i2) {
            copyOnWrite();
            ((InboxMessageList) this.instance).removeMessages(i2);
            return this;
        }

        public Builder setBadge(int i2) {
            copyOnWrite();
            ((InboxMessageList) this.instance).setBadge(i2);
            return this;
        }

        public Builder setHasMore(boolean z) {
            copyOnWrite();
            ((InboxMessageList) this.instance).setHasMore(z);
            return this;
        }

        public Builder setMessages(int i2, InboxMessage.Builder builder) {
            copyOnWrite();
            ((InboxMessageList) this.instance).setMessages(i2, builder.build());
            return this;
        }

        public Builder setUnreadCount(int i2) {
            copyOnWrite();
            ((InboxMessageList) this.instance).setUnreadCount(i2);
            return this;
        }

        public Builder addMessages(int i2, InboxMessage inboxMessage) {
            copyOnWrite();
            ((InboxMessageList) this.instance).addMessages(i2, inboxMessage);
            return this;
        }

        public Builder setMessages(int i2, InboxMessage inboxMessage) {
            copyOnWrite();
            ((InboxMessageList) this.instance).setMessages(i2, inboxMessage);
            return this;
        }

        public Builder addMessages(InboxMessage.Builder builder) {
            copyOnWrite();
            ((InboxMessageList) this.instance).addMessages(builder.build());
            return this;
        }

        public Builder addMessages(InboxMessage inboxMessage) {
            copyOnWrite();
            ((InboxMessageList) this.instance).addMessages(inboxMessage);
            return this;
        }
    }

    public static InboxMessageList parseFrom(byte[] bArr) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InboxMessageList parseFrom(byte[] bArr, de deVar) {
        return (InboxMessageList) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
