package com.google.android.libraries.assistant.appintegration.shared.proto;

import com.google.android.libraries.assistant.appintegration.proto.NightModeStatus;
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
public final class NightModeStatusChangedEventData extends du<NightModeStatusChangedEventData, Builder> implements NightModeStatusChangedEventDataOrBuilder {
    private static final NightModeStatusChangedEventData DEFAULT_INSTANCE;
    public static final int NIGHT_MODE_STATUS_FIELD_NUMBER = 1;
    private static volatile fo<NightModeStatusChangedEventData> PARSER;
    private int bitField0_;
    private int nightModeStatus_;

    /* compiled from: WazeSource */
    /* renamed from: com.google.android.libraries.assistant.appintegration.shared.proto.NightModeStatusChangedEventData$1, reason: invalid class name */
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
    public final class Builder extends dm<NightModeStatusChangedEventData, Builder> implements NightModeStatusChangedEventDataOrBuilder {
        private Builder() {
            super(NightModeStatusChangedEventData.DEFAULT_INSTANCE);
        }

        public Builder clearNightModeStatus() {
            copyOnWrite();
            ((NightModeStatusChangedEventData) this.instance).clearNightModeStatus();
            return this;
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NightModeStatusChangedEventDataOrBuilder
        public NightModeStatus getNightModeStatus() {
            return ((NightModeStatusChangedEventData) this.instance).getNightModeStatus();
        }

        @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NightModeStatusChangedEventDataOrBuilder
        public boolean hasNightModeStatus() {
            return ((NightModeStatusChangedEventData) this.instance).hasNightModeStatus();
        }

        public Builder setNightModeStatus(NightModeStatus nightModeStatus) {
            copyOnWrite();
            ((NightModeStatusChangedEventData) this.instance).setNightModeStatus(nightModeStatus);
            return this;
        }
    }

    static {
        NightModeStatusChangedEventData nightModeStatusChangedEventData = new NightModeStatusChangedEventData();
        DEFAULT_INSTANCE = nightModeStatusChangedEventData;
        du.registerDefaultInstance(NightModeStatusChangedEventData.class, nightModeStatusChangedEventData);
    }

    private NightModeStatusChangedEventData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNightModeStatus() {
        this.bitField0_ &= -2;
        this.nightModeStatus_ = 0;
    }

    public static NightModeStatusChangedEventData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NightModeStatusChangedEventData parseDelimitedFrom(InputStream inputStream) {
        return (NightModeStatusChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NightModeStatusChangedEventData parseFrom(v vVar) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NightModeStatusChangedEventData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNightModeStatus(NightModeStatus nightModeStatus) {
        this.nightModeStatus_ = nightModeStatus.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "nightModeStatus_", NightModeStatus.internalGetVerifier()});
        }
        if (iOrdinal == 3) {
            return new NightModeStatusChangedEventData();
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
        fo<NightModeStatusChangedEventData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NightModeStatusChangedEventData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NightModeStatusChangedEventDataOrBuilder
    public NightModeStatus getNightModeStatus() {
        NightModeStatus nightModeStatusForNumber = NightModeStatus.forNumber(this.nightModeStatus_);
        return nightModeStatusForNumber == null ? NightModeStatus.NIGHT_MODE_STATUS_UNKNOWN : nightModeStatusForNumber;
    }

    @Override // com.google.android.libraries.assistant.appintegration.shared.proto.NightModeStatusChangedEventDataOrBuilder
    public boolean hasNightModeStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NightModeStatusChangedEventData nightModeStatusChangedEventData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nightModeStatusChangedEventData);
    }

    public static NightModeStatusChangedEventData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NightModeStatusChangedEventData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NightModeStatusChangedEventData parseFrom(v vVar, de deVar) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NightModeStatusChangedEventData parseFrom(z zVar) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NightModeStatusChangedEventData parseFrom(z zVar, de deVar) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NightModeStatusChangedEventData parseFrom(InputStream inputStream) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NightModeStatusChangedEventData parseFrom(InputStream inputStream, de deVar) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NightModeStatusChangedEventData parseFrom(ByteBuffer byteBuffer) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NightModeStatusChangedEventData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NightModeStatusChangedEventData parseFrom(byte[] bArr) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NightModeStatusChangedEventData parseFrom(byte[] bArr, de deVar) {
        return (NightModeStatusChangedEventData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
