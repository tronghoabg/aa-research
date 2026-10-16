package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.proto.UiSuppressionLevel;
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
public final class UiSuppressionLevelChangedEventData extends du<UiSuppressionLevelChangedEventData, Builder> implements UiSuppressionLevelChangedEventDataOrBuilder {
    private static final UiSuppressionLevelChangedEventData DEFAULT_INSTANCE;
    private static volatile fo<UiSuppressionLevelChangedEventData> PARSER = null;
    public static final int UI_SUPPRESSION_LEVEL_FIELD_NUMBER = 1;
    private int bitField0_;
    private int uiSuppressionLevel_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.proto.UiSuppressionLevelChangedEventData$1, reason: invalid class name */
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
    public final class Builder extends dm<UiSuppressionLevelChangedEventData, Builder> implements UiSuppressionLevelChangedEventDataOrBuilder {
        private Builder() {
            super(UiSuppressionLevelChangedEventData.DEFAULT_INSTANCE);
        }

        public Builder clearUiSuppressionLevel() {
            copyOnWrite();
            ((UiSuppressionLevelChangedEventData) this.instance).clearUiSuppressionLevel();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.UiSuppressionLevelChangedEventDataOrBuilder
        public UiSuppressionLevel getUiSuppressionLevel() {
            return ((UiSuppressionLevelChangedEventData) this.instance).getUiSuppressionLevel();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.UiSuppressionLevelChangedEventDataOrBuilder
        public boolean hasUiSuppressionLevel() {
            return ((UiSuppressionLevelChangedEventData) this.instance).hasUiSuppressionLevel();
        }

        public Builder setUiSuppressionLevel(UiSuppressionLevel uiSuppressionLevel) {
            copyOnWrite();
            ((UiSuppressionLevelChangedEventData) this.instance).setUiSuppressionLevel(uiSuppressionLevel);
            return this;
        }
    }

    static {
        UiSuppressionLevelChangedEventData uiSuppressionLevelChangedEventData = new UiSuppressionLevelChangedEventData();
        DEFAULT_INSTANCE = uiSuppressionLevelChangedEventData;
        du.registerDefaultInstance(UiSuppressionLevelChangedEventData.class, uiSuppressionLevelChangedEventData);
    }

    private UiSuppressionLevelChangedEventData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUiSuppressionLevel() {
        this.bitField0_ &= -2;
        this.uiSuppressionLevel_ = 0;
    }

    public static UiSuppressionLevelChangedEventData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UiSuppressionLevelChangedEventData parseDelimitedFrom(InputStream inputStream) {
        return (UiSuppressionLevelChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(v vVar) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<UiSuppressionLevelChangedEventData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiSuppressionLevel(UiSuppressionLevel uiSuppressionLevel) {
        this.uiSuppressionLevel_ = uiSuppressionLevel.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "uiSuppressionLevel_", UiSuppressionLevel.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new UiSuppressionLevelChangedEventData();
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
        fo<UiSuppressionLevelChangedEventData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (UiSuppressionLevelChangedEventData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.UiSuppressionLevelChangedEventDataOrBuilder
    public UiSuppressionLevel getUiSuppressionLevel() {
        UiSuppressionLevel uiSuppressionLevelForNumber = UiSuppressionLevel.forNumber(this.uiSuppressionLevel_);
        return uiSuppressionLevelForNumber == null ? UiSuppressionLevel.UI_SUPPRESSION_LEVEL_UNKNOWN : uiSuppressionLevelForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.UiSuppressionLevelChangedEventDataOrBuilder
    public boolean hasUiSuppressionLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(UiSuppressionLevelChangedEventData uiSuppressionLevelChangedEventData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(uiSuppressionLevelChangedEventData);
    }

    public static UiSuppressionLevelChangedEventData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (UiSuppressionLevelChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(v vVar, de deVar) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(z zVar) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(z zVar, de deVar) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(InputStream inputStream) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(InputStream inputStream, de deVar) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(ByteBuffer byteBuffer) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(byte[] bArr) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UiSuppressionLevelChangedEventData parseFrom(byte[] bArr, de deVar) {
        return (UiSuppressionLevelChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
