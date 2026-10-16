package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.proto.AssistantConversationState;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AssistantConversationStateChangedEventData extends du<AssistantConversationStateChangedEventData, Builder> implements AssistantConversationStateChangedEventDataOrBuilder {
    public static final int ASSISTANT_CONVERSATION_STATE_FIELD_NUMBER = 1;
    private static final AssistantConversationStateChangedEventData DEFAULT_INSTANCE;
    private static volatile fo<AssistantConversationStateChangedEventData> PARSER;
    private int assistantConversationState_;
    private int bitField0_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEventData$1, reason: invalid class name */
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
    public final class Builder extends dm<AssistantConversationStateChangedEventData, Builder> implements AssistantConversationStateChangedEventDataOrBuilder {
        private Builder() {
            super(AssistantConversationStateChangedEventData.DEFAULT_INSTANCE);
        }

        public Builder clearAssistantConversationState() {
            copyOnWrite();
            ((AssistantConversationStateChangedEventData) this.instance).clearAssistantConversationState();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEventDataOrBuilder
        public AssistantConversationState getAssistantConversationState() {
            return ((AssistantConversationStateChangedEventData) this.instance).getAssistantConversationState();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEventDataOrBuilder
        public boolean hasAssistantConversationState() {
            return ((AssistantConversationStateChangedEventData) this.instance).hasAssistantConversationState();
        }

        public Builder setAssistantConversationState(AssistantConversationState assistantConversationState) {
            copyOnWrite();
            ((AssistantConversationStateChangedEventData) this.instance).setAssistantConversationState(assistantConversationState);
            return this;
        }
    }

    static {
        AssistantConversationStateChangedEventData assistantConversationStateChangedEventData = new AssistantConversationStateChangedEventData();
        DEFAULT_INSTANCE = assistantConversationStateChangedEventData;
        du.registerDefaultInstance(AssistantConversationStateChangedEventData.class, assistantConversationStateChangedEventData);
    }

    private AssistantConversationStateChangedEventData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssistantConversationState() {
        this.bitField0_ &= -2;
        this.assistantConversationState_ = 0;
    }

    public static AssistantConversationStateChangedEventData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AssistantConversationStateChangedEventData parseDelimitedFrom(InputStream inputStream) {
        return (AssistantConversationStateChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssistantConversationStateChangedEventData parseFrom(v vVar) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AssistantConversationStateChangedEventData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssistantConversationState(AssistantConversationState assistantConversationState) {
        this.assistantConversationState_ = assistantConversationState.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "assistantConversationState_", AssistantConversationState.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new AssistantConversationStateChangedEventData();
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
        fo<AssistantConversationStateChangedEventData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AssistantConversationStateChangedEventData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEventDataOrBuilder
    public AssistantConversationState getAssistantConversationState() {
        AssistantConversationState assistantConversationStateForNumber = AssistantConversationState.forNumber(this.assistantConversationState_);
        return assistantConversationStateForNumber == null ? AssistantConversationState.ASSISTANT_CONVERSATION_STATE_UNKNOWN : assistantConversationStateForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEventDataOrBuilder
    public boolean hasAssistantConversationState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(AssistantConversationStateChangedEventData assistantConversationStateChangedEventData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(assistantConversationStateChangedEventData);
    }

    public static AssistantConversationStateChangedEventData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AssistantConversationStateChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AssistantConversationStateChangedEventData parseFrom(v vVar, de deVar) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AssistantConversationStateChangedEventData parseFrom(z zVar) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AssistantConversationStateChangedEventData parseFrom(z zVar, de deVar) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AssistantConversationStateChangedEventData parseFrom(InputStream inputStream) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssistantConversationStateChangedEventData parseFrom(InputStream inputStream, de deVar) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AssistantConversationStateChangedEventData parseFrom(ByteBuffer byteBuffer) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AssistantConversationStateChangedEventData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AssistantConversationStateChangedEventData parseFrom(byte[] bArr) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AssistantConversationStateChangedEventData parseFrom(byte[] bArr, de deVar) {
        return (AssistantConversationStateChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
