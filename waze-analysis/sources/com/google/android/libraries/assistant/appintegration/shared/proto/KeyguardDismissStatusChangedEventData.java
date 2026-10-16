package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.proto.KeyguardDismissStatus;
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
public final class KeyguardDismissStatusChangedEventData extends du<KeyguardDismissStatusChangedEventData, Builder> implements KeyguardDismissStatusChangedEventDataOrBuilder {
    private static final KeyguardDismissStatusChangedEventData DEFAULT_INSTANCE;
    public static final int KEYGUARD_DISMISS_STATUS_FIELD_NUMBER = 1;
    private static volatile fo<KeyguardDismissStatusChangedEventData> PARSER;
    private int bitField0_;
    private int keyguardDismissStatus_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.proto.KeyguardDismissStatusChangedEventData$1, reason: invalid class name */
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
    public final class Builder extends dm<KeyguardDismissStatusChangedEventData, Builder> implements KeyguardDismissStatusChangedEventDataOrBuilder {
        private Builder() {
            super(KeyguardDismissStatusChangedEventData.DEFAULT_INSTANCE);
        }

        public Builder clearKeyguardDismissStatus() {
            copyOnWrite();
            ((KeyguardDismissStatusChangedEventData) this.instance).clearKeyguardDismissStatus();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.KeyguardDismissStatusChangedEventDataOrBuilder
        public KeyguardDismissStatus getKeyguardDismissStatus() {
            return ((KeyguardDismissStatusChangedEventData) this.instance).getKeyguardDismissStatus();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.KeyguardDismissStatusChangedEventDataOrBuilder
        public boolean hasKeyguardDismissStatus() {
            return ((KeyguardDismissStatusChangedEventData) this.instance).hasKeyguardDismissStatus();
        }

        public Builder setKeyguardDismissStatus(KeyguardDismissStatus keyguardDismissStatus) {
            copyOnWrite();
            ((KeyguardDismissStatusChangedEventData) this.instance).setKeyguardDismissStatus(keyguardDismissStatus);
            return this;
        }
    }

    static {
        KeyguardDismissStatusChangedEventData keyguardDismissStatusChangedEventData = new KeyguardDismissStatusChangedEventData();
        DEFAULT_INSTANCE = keyguardDismissStatusChangedEventData;
        du.registerDefaultInstance(KeyguardDismissStatusChangedEventData.class, keyguardDismissStatusChangedEventData);
    }

    private KeyguardDismissStatusChangedEventData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyguardDismissStatus() {
        this.bitField0_ &= -2;
        this.keyguardDismissStatus_ = 0;
    }

    public static KeyguardDismissStatusChangedEventData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KeyguardDismissStatusChangedEventData parseDelimitedFrom(InputStream inputStream) {
        return (KeyguardDismissStatusChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(v vVar) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<KeyguardDismissStatusChangedEventData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyguardDismissStatus(KeyguardDismissStatus keyguardDismissStatus) {
        this.keyguardDismissStatus_ = keyguardDismissStatus.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "keyguardDismissStatus_", KeyguardDismissStatus.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new KeyguardDismissStatusChangedEventData();
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
        fo<KeyguardDismissStatusChangedEventData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (KeyguardDismissStatusChangedEventData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.KeyguardDismissStatusChangedEventDataOrBuilder
    public KeyguardDismissStatus getKeyguardDismissStatus() {
        KeyguardDismissStatus keyguardDismissStatusForNumber = KeyguardDismissStatus.forNumber(this.keyguardDismissStatus_);
        return keyguardDismissStatusForNumber == null ? KeyguardDismissStatus.KEYGUARD_DISMISS_STATUS_UNKNOWN : keyguardDismissStatusForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.KeyguardDismissStatusChangedEventDataOrBuilder
    public boolean hasKeyguardDismissStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(KeyguardDismissStatusChangedEventData keyguardDismissStatusChangedEventData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keyguardDismissStatusChangedEventData);
    }

    public static KeyguardDismissStatusChangedEventData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (KeyguardDismissStatusChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(v vVar, de deVar) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(z zVar) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(z zVar, de deVar) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(InputStream inputStream) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(InputStream inputStream, de deVar) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(ByteBuffer byteBuffer) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(byte[] bArr) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyguardDismissStatusChangedEventData parseFrom(byte[] bArr, de deVar) {
        return (KeyguardDismissStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
