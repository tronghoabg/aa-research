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
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationMessage extends du<NotificationMessage, Builder> implements NotificationMessageOrBuilder {
    private static final NotificationMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile fo<NotificationMessage> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String message_ = "";
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.NotificationMessage$1, reason: invalid class name */
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
    public final class Builder extends dm<NotificationMessage, Builder> implements NotificationMessageOrBuilder {
        private Builder() {
            super(NotificationMessage.DEFAULT_INSTANCE);
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((NotificationMessage) this.instance).clearMessage();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((NotificationMessage) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.NotificationMessageOrBuilder
        public String getMessage() {
            return ((NotificationMessage) this.instance).getMessage();
        }

        @Override // com.waze.jni.protos.NotificationMessageOrBuilder
        public v getMessageBytes() {
            return ((NotificationMessage) this.instance).getMessageBytes();
        }

        @Override // com.waze.jni.protos.NotificationMessageOrBuilder
        public Type getType() {
            return ((NotificationMessage) this.instance).getType();
        }

        @Override // com.waze.jni.protos.NotificationMessageOrBuilder
        public int getTypeValue() {
            return ((NotificationMessage) this.instance).getTypeValue();
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((NotificationMessage) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(v vVar) {
            copyOnWrite();
            ((NotificationMessage) this.instance).setMessageBytes(vVar);
            return this;
        }

        public Builder setType(Type type) {
            copyOnWrite();
            ((NotificationMessage) this.instance).setType(type);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((NotificationMessage) this.instance).setTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Type implements eg {
        GPS(0),
        NETWORK(1),
        CSV(2),
        DEBUG_INFO(3),
        PARKING_DETECTOR(4),
        NAVIGATE_TTS(5),
        PROMPTS(6),
        MAP_DOWNLOAD(7),
        REFRESH_MAP(8),
        UNRECOGNIZED(-1);

        public static final int CSV_VALUE = 2;
        public static final int DEBUG_INFO_VALUE = 3;
        public static final int GPS_VALUE = 0;
        public static final int MAP_DOWNLOAD_VALUE = 7;
        public static final int NAVIGATE_TTS_VALUE = 5;
        public static final int NETWORK_VALUE = 1;
        public static final int PARKING_DETECTOR_VALUE = 4;
        public static final int PROMPTS_VALUE = 6;
        public static final int REFRESH_MAP_VALUE = 8;
        private static final eh<Type> internalValueMap = new eh<Type>() { // from class: com.waze.jni.protos.NotificationMessage.Type.1
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
            switch (i2) {
                case 0:
                    return GPS;
                case 1:
                    return NETWORK;
                case 2:
                    return CSV;
                case 3:
                    return DEBUG_INFO;
                case 4:
                    return PARKING_DETECTOR;
                case 5:
                    return NAVIGATE_TTS;
                case 6:
                    return PROMPTS;
                case 7:
                    return MAP_DOWNLOAD;
                case 8:
                    return REFRESH_MAP;
                default:
                    return null;
            }
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
        NotificationMessage notificationMessage = new NotificationMessage();
        DEFAULT_INSTANCE = notificationMessage;
        du.registerDefaultInstance(NotificationMessage.class, notificationMessage);
    }

    private NotificationMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static NotificationMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationMessage parseDelimitedFrom(InputStream inputStream) {
        return (NotificationMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationMessage parseFrom(v vVar) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NotificationMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        Objects.requireNonNull(str);
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.message_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type) {
        this.type_ = type.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"type_", "message_"});
        }
        if (iOrdinal == 3) {
            return new NotificationMessage();
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
        fo<NotificationMessage> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NotificationMessage.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.NotificationMessageOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // com.waze.jni.protos.NotificationMessageOrBuilder
    public v getMessageBytes() {
        return v.s(this.message_);
    }

    @Override // com.waze.jni.protos.NotificationMessageOrBuilder
    public Type getType() {
        Type typeForNumber = Type.forNumber(this.type_);
        return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
    }

    @Override // com.waze.jni.protos.NotificationMessageOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(NotificationMessage notificationMessage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(notificationMessage);
    }

    public static NotificationMessage parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NotificationMessage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationMessage parseFrom(v vVar, de deVar) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NotificationMessage parseFrom(z zVar) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NotificationMessage parseFrom(z zVar, de deVar) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NotificationMessage parseFrom(InputStream inputStream) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationMessage parseFrom(InputStream inputStream, de deVar) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NotificationMessage parseFrom(ByteBuffer byteBuffer) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NotificationMessage parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NotificationMessage parseFrom(byte[] bArr) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationMessage parseFrom(byte[] bArr, de deVar) {
        return (NotificationMessage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
