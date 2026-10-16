package com.waze.jni.protos.asks;

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
public final class WazeAsksTrigger extends du<WazeAsksTrigger, Builder> implements WazeAsksTriggerOrBuilder {
    private static final WazeAsksTrigger DEFAULT_INSTANCE;
    public static final int INSIGHT_ID_FIELD_NUMBER = 1;
    private static volatile fo<WazeAsksTrigger> PARSER = null;
    public static final int STATS_ALERT_ID_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String insightId_ = "";
    private int statsAlertId_;
    private int type_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.asks.WazeAsksTrigger$1, reason: invalid class name */
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
    public final class Builder extends dm<WazeAsksTrigger, Builder> implements WazeAsksTriggerOrBuilder {
        private Builder() {
            super(WazeAsksTrigger.DEFAULT_INSTANCE);
        }

        public Builder clearInsightId() {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).clearInsightId();
            return this;
        }

        public Builder clearStatsAlertId() {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).clearStatsAlertId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
        public String getInsightId() {
            return ((WazeAsksTrigger) this.instance).getInsightId();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
        public v getInsightIdBytes() {
            return ((WazeAsksTrigger) this.instance).getInsightIdBytes();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
        public int getStatsAlertId() {
            return ((WazeAsksTrigger) this.instance).getStatsAlertId();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
        public TriggerType getType() {
            return ((WazeAsksTrigger) this.instance).getType();
        }

        @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
        public int getTypeValue() {
            return ((WazeAsksTrigger) this.instance).getTypeValue();
        }

        public Builder setInsightId(String str) {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).setInsightId(str);
            return this;
        }

        public Builder setInsightIdBytes(v vVar) {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).setInsightIdBytes(vVar);
            return this;
        }

        public Builder setStatsAlertId(int i2) {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).setStatsAlertId(i2);
            return this;
        }

        public Builder setType(TriggerType triggerType) {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).setType(triggerType);
            return this;
        }

        public Builder setTypeValue(int i2) {
            copyOnWrite();
            ((WazeAsksTrigger) this.instance).setTypeValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum TriggerType implements eg {
        DEFAULT_HAZARD(0),
        CONSTRUCTION(1),
        UNRECOGNIZED(-1);

        public static final int CONSTRUCTION_VALUE = 1;
        public static final int DEFAULT_HAZARD_VALUE = 0;
        private static final eh<TriggerType> internalValueMap = new eh<TriggerType>() { // from class: com.waze.jni.protos.asks.WazeAsksTrigger.TriggerType.1
            @Override // com.google.v.eh
            public TriggerType findValueByNumber(int i2) {
                return TriggerType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class TriggerTypeVerifier implements ei {
            static final ei INSTANCE = new TriggerTypeVerifier();

            private TriggerTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return TriggerType.forNumber(i2) != null;
            }
        }

        TriggerType(int i2) {
            this.value = i2;
        }

        public static TriggerType forNumber(int i2) {
            if (i2 == 0) {
                return DEFAULT_HAZARD;
            }
            if (i2 != 1) {
                return null;
            }
            return CONSTRUCTION;
        }

        public static eh<TriggerType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return TriggerTypeVerifier.INSTANCE;
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
        WazeAsksTrigger wazeAsksTrigger = new WazeAsksTrigger();
        DEFAULT_INSTANCE = wazeAsksTrigger;
        du.registerDefaultInstance(WazeAsksTrigger.class, wazeAsksTrigger);
    }

    private WazeAsksTrigger() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightId() {
        this.insightId_ = getDefaultInstance().getInsightId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatsAlertId() {
        this.statsAlertId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static WazeAsksTrigger getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WazeAsksTrigger parseDelimitedFrom(InputStream inputStream) {
        return (WazeAsksTrigger) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeAsksTrigger parseFrom(v vVar) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<WazeAsksTrigger> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightId(String str) {
        Objects.requireNonNull(str);
        this.insightId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.insightId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsAlertId(int i2) {
        this.statsAlertId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(TriggerType triggerType) {
        this.type_ = triggerType.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004", new Object[]{"insightId_", "type_", "statsAlertId_"});
        }
        if (iOrdinal == 3) {
            return new WazeAsksTrigger();
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
        fo<WazeAsksTrigger> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (WazeAsksTrigger.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
    public String getInsightId() {
        return this.insightId_;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
    public v getInsightIdBytes() {
        return v.s(this.insightId_);
    }

    @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
    public int getStatsAlertId() {
        return this.statsAlertId_;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
    public TriggerType getType() {
        TriggerType triggerTypeForNumber = TriggerType.forNumber(this.type_);
        return triggerTypeForNumber == null ? TriggerType.UNRECOGNIZED : triggerTypeForNumber;
    }

    @Override // com.waze.jni.protos.asks.WazeAsksTriggerOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    public static Builder newBuilder(WazeAsksTrigger wazeAsksTrigger) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(wazeAsksTrigger);
    }

    public static WazeAsksTrigger parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (WazeAsksTrigger) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeAsksTrigger parseFrom(v vVar, de deVar) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static WazeAsksTrigger parseFrom(z zVar) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static WazeAsksTrigger parseFrom(z zVar, de deVar) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static WazeAsksTrigger parseFrom(InputStream inputStream) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeAsksTrigger parseFrom(InputStream inputStream, de deVar) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeAsksTrigger parseFrom(ByteBuffer byteBuffer) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WazeAsksTrigger parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static WazeAsksTrigger parseFrom(byte[] bArr) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WazeAsksTrigger parseFrom(byte[] bArr, de deVar) {
        return (WazeAsksTrigger) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
