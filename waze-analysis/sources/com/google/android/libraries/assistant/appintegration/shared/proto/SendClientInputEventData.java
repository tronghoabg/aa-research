package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SendClientInputEventData extends du<SendClientInputEventData, Builder> implements SendClientInputEventDataOrBuilder {
    public static final int CLIENT_INPUT_FIELD_NUMBER = 1;
    private static final SendClientInputEventData DEFAULT_INSTANCE;
    private static volatile fo<SendClientInputEventData> PARSER;
    private int bitField0_;
    private v clientInput_ = v.f13054a;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.proto.SendClientInputEventData$1, reason: invalid class name */
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
    public final class Builder extends dm<SendClientInputEventData, Builder> implements SendClientInputEventDataOrBuilder {
        private Builder() {
            super(SendClientInputEventData.DEFAULT_INSTANCE);
        }

        public Builder clearClientInput() {
            copyOnWrite();
            ((SendClientInputEventData) this.instance).clearClientInput();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.SendClientInputEventDataOrBuilder
        public v getClientInput() {
            return ((SendClientInputEventData) this.instance).getClientInput();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.SendClientInputEventDataOrBuilder
        public boolean hasClientInput() {
            return ((SendClientInputEventData) this.instance).hasClientInput();
        }

        public Builder setClientInput(v vVar) {
            copyOnWrite();
            ((SendClientInputEventData) this.instance).setClientInput(vVar);
            return this;
        }
    }

    static {
        SendClientInputEventData sendClientInputEventData = new SendClientInputEventData();
        DEFAULT_INSTANCE = sendClientInputEventData;
        du.registerDefaultInstance(SendClientInputEventData.class, sendClientInputEventData);
    }

    private SendClientInputEventData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInput() {
        this.bitField0_ &= -2;
        this.clientInput_ = getDefaultInstance().getClientInput();
    }

    public static SendClientInputEventData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static SendClientInputEventData parseDelimitedFrom(InputStream inputStream) {
        return (SendClientInputEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SendClientInputEventData parseFrom(v vVar) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<SendClientInputEventData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInput(v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.clientInput_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "clientInput_"});
        }
        if (iOrdinal == 3) {
            return new SendClientInputEventData();
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
        fo<SendClientInputEventData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (SendClientInputEventData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.SendClientInputEventDataOrBuilder
    public v getClientInput() {
        return this.clientInput_;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.SendClientInputEventDataOrBuilder
    public boolean hasClientInput() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(SendClientInputEventData sendClientInputEventData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(sendClientInputEventData);
    }

    public static SendClientInputEventData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (SendClientInputEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SendClientInputEventData parseFrom(v vVar, de deVar) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static SendClientInputEventData parseFrom(z zVar) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static SendClientInputEventData parseFrom(z zVar, de deVar) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static SendClientInputEventData parseFrom(InputStream inputStream) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SendClientInputEventData parseFrom(InputStream inputStream, de deVar) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static SendClientInputEventData parseFrom(ByteBuffer byteBuffer) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static SendClientInputEventData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static SendClientInputEventData parseFrom(byte[] bArr) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SendClientInputEventData parseFrom(byte[] bArr, de deVar) {
        return (SendClientInputEventData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
