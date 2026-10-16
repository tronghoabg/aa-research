package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Advertisement;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InboxMessage extends du<InboxMessage, Builder> implements InboxMessageOrBuilder {
    public static final int ADVERTISEMENT_FIELD_NUMBER = 9;
    private static final InboxMessage DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 7;
    private static volatile fo<InboxMessage> PARSER = null;
    public static final int PREVIEW_FIELD_NUMBER = 6;
    public static final int SENT_FORMATTED_STRING_FIELD_NUMBER = 4;
    public static final int SENT_TIME_SECONDS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNREAD_FIELD_NUMBER = 2;
    private Advertisement advertisement_;
    private int bitField0_;
    private long sentTimeSeconds_;
    private int type_;
    private boolean unread_;
    private String id_ = "";
    private String sentFormattedString_ = "";
    private String title_ = "";
    private String preview_ = "";
    private String message_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.InboxMessage$1, reason: invalid class name */
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

    /* compiled from: WazeSource */
    public enum Type implements eg {
        UNKNOWN(0),
        LINK(1),
        CONTENT(2),
        SECURED_LINK(3),
        UNRECOGNIZED(-1);

        public static final int CONTENT_VALUE = 2;
        public static final int LINK_VALUE = 1;
        public static final int SECURED_LINK_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.InboxMessage.Type.1
            @Override // com.google.v.eh
            public Type findValueByNumber(int i2) {
                return Type.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TypeVerifier implements ei {
            static final ei INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Type.forNumber(i2) != null;
            }
        }

        Type(int i2) {
            this.value = i2;
        }

        public static Type forNumber(int i2) {
            if (i2 == 0) {
                return UNKNOWN;
            }
            if (i2 == 1) {
                return LINK;
            }
            if (i2 == 2) {
                return CONTENT;
            }
            if (i2 != 3) {
                return null;
            }
            return SECURED_LINK;
        }

        public static eh<Type> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        InboxMessage inboxMessage = new InboxMessage();
        DEFAULT_INSTANCE = inboxMessage;
        du.registerDefaultInstance(InboxMessage.class, inboxMessage);
    }

    private InboxMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertisement() {
        this.advertisement_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.bitField0_ &= -65;
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreview() {
        this.bitField0_ &= -33;
        this.preview_ = getDefaultInstance().getPreview();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSentFormattedString() {
        this.bitField0_ &= -9;
        this.sentFormattedString_ = getDefaultInstance().getSentFormattedString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSentTimeSeconds() {
        this.bitField0_ &= -5;
        this.sentTimeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.bitField0_ &= -17;
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -129;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnread() {
        this.bitField0_ &= -3;
        this.unread_ = false;
    }

    public static InboxMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvertisement(Advertisement advertisement) {
        Objects.requireNonNull(advertisement);
        Advertisement advertisement2 = this.advertisement_;
        if (advertisement2 != null && advertisement2 != Advertisement.getDefaultInstance()) {
            Advertisement.Builder builderNewBuilder = Advertisement.newBuilder(advertisement2);
            builderNewBuilder.mergeFrom((Advertisement.Builder) advertisement);
            advertisement = builderNewBuilder.buildPartial();
        }
        this.advertisement_ = advertisement;
        this.bitField0_ |= 256;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static InboxMessage parseDelimitedFrom(InputStream inputStream) {
        return (InboxMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxMessage parseFrom(v vVar) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<InboxMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisement(Advertisement advertisement) {
        Objects.requireNonNull(advertisement);
        this.advertisement_ = advertisement;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.message_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreview(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.preview_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.preview_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSentFormattedString(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.sentFormattedString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSentFormattedStringBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.sentFormattedString_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSentTimeSeconds(long j2) {
        this.bitField0_ |= 4;
        this.sentTimeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.title_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.bitField0_ |= 128;
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnread(boolean z) {
        this.bitField0_ |= 2;
        this.unread_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဌ\u0007\tဉ\b", new Object[]{"bitField0_", "id_", "unread_", "sentTimeSeconds_", "sentFormattedString_", "title_", "preview_", "message_", "type_", "advertisement_"});
        }
        if (iOrdinal == 3) {
            return new InboxMessage();
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
        fo<InboxMessage> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (InboxMessage.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public Advertisement getAdvertisement() {
        Advertisement advertisement = this.advertisement_;
        return advertisement == null ? Advertisement.getDefaultInstance() : advertisement;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public v getMessageBytes() {
        return v.s(this.message_);
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public String getPreview() {
        return this.preview_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public v getPreviewBytes() {
        return v.s(this.preview_);
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public String getSentFormattedString() {
        return this.sentFormattedString_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public v getSentFormattedStringBytes() {
        return v.s(this.sentFormattedString_);
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public long getSentTimeSeconds() {
        return this.sentTimeSeconds_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public v getTitleBytes() {
        return v.s(this.title_);
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean getUnread() {
        return this.unread_;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasAdvertisement() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasMessage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasPreview() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasSentFormattedString() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasSentTimeSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasTitle() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.waze.jni.protos.InboxMessageOrBuilder
    public boolean hasUnread() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(InboxMessage inboxMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(inboxMessage);
    }

    public static InboxMessage parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (InboxMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static InboxMessage parseFrom(v vVar, de deVar) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static InboxMessage parseFrom(z zVar) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static InboxMessage parseFrom(z zVar, de deVar) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static InboxMessage parseFrom(InputStream inputStream) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxMessage parseFrom(InputStream inputStream, de deVar) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static InboxMessage parseFrom(ByteBuffer byteBuffer) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InboxMessage parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<InboxMessage, Builder> implements InboxMessageOrBuilder {
        private Builder() {
            super(InboxMessage.DEFAULT_INSTANCE);
        }

        public Builder clearAdvertisement() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearAdvertisement();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearId();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearMessage();
            return this;
        }

        public Builder clearPreview() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearPreview();
            return this;
        }

        public Builder clearSentFormattedString() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearSentFormattedString();
            return this;
        }

        public Builder clearSentTimeSeconds() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearSentTimeSeconds();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearTitle();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearType();
            return this;
        }

        public Builder clearUnread() {
            copyOnWrite();
            ((InboxMessage) this.instance).clearUnread();
            return this;
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public Advertisement getAdvertisement() {
            return ((InboxMessage) this.instance).getAdvertisement();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public String getId() {
            return ((InboxMessage) this.instance).getId();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public v getIdBytes() {
            return ((InboxMessage) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public String getMessage() {
            return ((InboxMessage) this.instance).getMessage();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public v getMessageBytes() {
            return ((InboxMessage) this.instance).getMessageBytes();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public String getPreview() {
            return ((InboxMessage) this.instance).getPreview();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public v getPreviewBytes() {
            return ((InboxMessage) this.instance).getPreviewBytes();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public String getSentFormattedString() {
            return ((InboxMessage) this.instance).getSentFormattedString();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public v getSentFormattedStringBytes() {
            return ((InboxMessage) this.instance).getSentFormattedStringBytes();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public long getSentTimeSeconds() {
            return ((InboxMessage) this.instance).getSentTimeSeconds();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public String getTitle() {
            return ((InboxMessage) this.instance).getTitle();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public v getTitleBytes() {
            return ((InboxMessage) this.instance).getTitleBytes();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public Type getType() {
            return ((InboxMessage) this.instance).getType();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public int getTypeValue() {
            return ((InboxMessage) this.instance).getTypeValue();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean getUnread() {
            return ((InboxMessage) this.instance).getUnread();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasAdvertisement() {
            return ((InboxMessage) this.instance).hasAdvertisement();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasId() {
            return ((InboxMessage) this.instance).hasId();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasMessage() {
            return ((InboxMessage) this.instance).hasMessage();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasPreview() {
            return ((InboxMessage) this.instance).hasPreview();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasSentFormattedString() {
            return ((InboxMessage) this.instance).hasSentFormattedString();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasSentTimeSeconds() {
            return ((InboxMessage) this.instance).hasSentTimeSeconds();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasTitle() {
            return ((InboxMessage) this.instance).hasTitle();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasType() {
            return ((InboxMessage) this.instance).hasType();
        }

        @Override // com.waze.jni.protos.InboxMessageOrBuilder
        public boolean hasUnread() {
            return ((InboxMessage) this.instance).hasUnread();
        }

        public Builder mergeAdvertisement(Advertisement advertisement) {
            copyOnWrite();
            ((InboxMessage) this.instance).mergeAdvertisement(advertisement);
            return this;
        }

        public Builder setAdvertisement(Advertisement.Builder builder) {
            copyOnWrite();
            ((InboxMessage) this.instance).setAdvertisement(builder.build());
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((InboxMessage) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((InboxMessage) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((InboxMessage) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(v vVar) {
            copyOnWrite();
            ((InboxMessage) this.instance).setMessageBytes(vVar);
            return this;
        }

        public Builder setPreview(String str) {
            copyOnWrite();
            ((InboxMessage) this.instance).setPreview(str);
            return this;
        }

        public Builder setPreviewBytes(v vVar) {
            copyOnWrite();
            ((InboxMessage) this.instance).setPreviewBytes(vVar);
            return this;
        }

        public Builder setSentFormattedString(String str) {
            copyOnWrite();
            ((InboxMessage) this.instance).setSentFormattedString(str);
            return this;
        }

        public Builder setSentFormattedStringBytes(v vVar) {
            copyOnWrite();
            ((InboxMessage) this.instance).setSentFormattedStringBytes(vVar);
            return this;
        }

        public Builder setSentTimeSeconds(long j2) {
            copyOnWrite();
            ((InboxMessage) this.instance).setSentTimeSeconds(j2);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((InboxMessage) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(v vVar) {
            copyOnWrite();
            ((InboxMessage) this.instance).setTitleBytes(vVar);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((InboxMessage) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((InboxMessage) this.instance).setTypeValue(i2);
            return this;
        }

        public Builder setUnread(boolean z) {
            copyOnWrite();
            ((InboxMessage) this.instance).setUnread(z);
            return this;
        }

        public Builder setAdvertisement(Advertisement advertisement) {
            copyOnWrite();
            ((InboxMessage) this.instance).setAdvertisement(advertisement);
            return this;
        }
    }

    public static InboxMessage parseFrom(byte[] bArr) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InboxMessage parseFrom(byte[] bArr, de deVar) {
        return (InboxMessage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
