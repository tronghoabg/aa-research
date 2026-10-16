package com.waze.jni.protos.navigate;

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
import com.waze.jni.protos.alerters.AlerterType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TrafficJamSection extends du<TrafficJamSection, Builder> implements TrafficJamSectionOrBuilder {
    public static final int ALERT_SUB_TYPE_FIELD_NUMBER = 4;
    public static final int ALERT_TYPE_FIELD_NUMBER = 3;
    private static final TrafficJamSection DEFAULT_INSTANCE;
    public static final int LENGTH_METERS_FIELD_NUMBER = 2;
    public static final int LEVEL_FIELD_NUMBER = 1;
    private static volatile fo<TrafficJamSection> PARSER;
    private int alertSubType_;
    private int alertType_;
    private int bitField0_;
    private int lengthMeters_;
    private int level_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.TrafficJamSection$1, reason: invalid class name */
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
    public final class Builder extends dm<TrafficJamSection, Builder> implements TrafficJamSectionOrBuilder {
        private Builder() {
            super(TrafficJamSection.DEFAULT_INSTANCE);
        }

        public Builder clearAlertSubType() {
            copyOnWrite();
            ((TrafficJamSection) this.instance).clearAlertSubType();
            return this;
        }

        public Builder clearAlertType() {
            copyOnWrite();
            ((TrafficJamSection) this.instance).clearAlertType();
            return this;
        }

        public Builder clearLengthMeters() {
            copyOnWrite();
            ((TrafficJamSection) this.instance).clearLengthMeters();
            return this;
        }

        public Builder clearLevel() {
            copyOnWrite();
            ((TrafficJamSection) this.instance).clearLevel();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public int getAlertSubType() {
            return ((TrafficJamSection) this.instance).getAlertSubType();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public AlerterType getAlertType() {
            return ((TrafficJamSection) this.instance).getAlertType();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public int getAlertTypeValue() {
            return ((TrafficJamSection) this.instance).getAlertTypeValue();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public int getLengthMeters() {
            return ((TrafficJamSection) this.instance).getLengthMeters();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public Severity getLevel() {
            return ((TrafficJamSection) this.instance).getLevel();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public int getLevelValue() {
            return ((TrafficJamSection) this.instance).getLevelValue();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public boolean hasAlertSubType() {
            return ((TrafficJamSection) this.instance).hasAlertSubType();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public boolean hasAlertType() {
            return ((TrafficJamSection) this.instance).hasAlertType();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public boolean hasLengthMeters() {
            return ((TrafficJamSection) this.instance).hasLengthMeters();
        }

        @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
        public boolean hasLevel() {
            return ((TrafficJamSection) this.instance).hasLevel();
        }

        public Builder setAlertSubType(int i2) {
            copyOnWrite();
            ((TrafficJamSection) this.instance).setAlertSubType(i2);
            return this;
        }

        public Builder setAlertType(AlerterType alerterType) {
            copyOnWrite();
            ((TrafficJamSection) this.instance).setAlertType(alerterType);
            return this;
        }

        public Builder setAlertTypeValue(int i2) {
            copyOnWrite();
            ((TrafficJamSection) this.instance).setAlertTypeValue(i2);
            return this;
        }

        public Builder setLengthMeters(int i2) {
            copyOnWrite();
            ((TrafficJamSection) this.instance).setLengthMeters(i2);
            return this;
        }

        public Builder setLevel(Severity severity) {
            copyOnWrite();
            ((TrafficJamSection) this.instance).setLevel(severity);
            return this;
        }

        public Builder setLevelValue(int i2) {
            copyOnWrite();
            ((TrafficJamSection) this.instance).setLevelValue(i2);
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum Severity implements eg {
        SeverityLight(0),
        SeverityModerate(1),
        SeverityHeavy(2),
        SeverityStandStill(3),
        SeverityClosedRoad(5),
        UNRECOGNIZED(-1);

        public static final int SeverityClosedRoad_VALUE = 5;
        public static final int SeverityHeavy_VALUE = 2;
        public static final int SeverityLight_VALUE = 0;
        public static final int SeverityModerate_VALUE = 1;
        public static final int SeverityStandStill_VALUE = 3;
        private static final eh<Severity> internalValueMap = new eh<Severity>() { // from class: com.waze.jni.protos.navigate.TrafficJamSection.Severity.1
            @Override // com.google.v.eh
            public Severity findValueByNumber(int i2) {
                return Severity.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class SeverityVerifier implements ei {
            static final ei INSTANCE = new SeverityVerifier();

            private SeverityVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return Severity.forNumber(i2) != null;
            }
        }

        Severity(int i2) {
            this.value = i2;
        }

        public static Severity forNumber(int i2) {
            if (i2 == 0) {
                return SeverityLight;
            }
            if (i2 == 1) {
                return SeverityModerate;
            }
            if (i2 == 2) {
                return SeverityHeavy;
            }
            if (i2 == 3) {
                return SeverityStandStill;
            }
            if (i2 != 5) {
                return null;
            }
            return SeverityClosedRoad;
        }

        public static eh<Severity> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return SeverityVerifier.INSTANCE;
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
        TrafficJamSection trafficJamSection = new TrafficJamSection();
        DEFAULT_INSTANCE = trafficJamSection;
        du.registerDefaultInstance(TrafficJamSection.class, trafficJamSection);
    }

    private TrafficJamSection() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertSubType() {
        this.bitField0_ &= -9;
        this.alertSubType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.bitField0_ &= -5;
        this.alertType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthMeters() {
        this.bitField0_ &= -3;
        this.lengthMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.bitField0_ &= -2;
        this.level_ = 0;
    }

    public static TrafficJamSection getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TrafficJamSection parseDelimitedFrom(InputStream inputStream) {
        return (TrafficJamSection) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrafficJamSection parseFrom(v vVar) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<TrafficJamSection> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertSubType(int i2) {
        this.bitField0_ |= 8;
        this.alertSubType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(AlerterType alerterType) {
        this.alertType_ = alerterType.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertTypeValue(int i2) {
        this.bitField0_ |= 4;
        this.alertType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthMeters(int i2) {
        this.bitField0_ |= 2;
        this.lengthMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(Severity severity) {
        this.level_ = severity.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelValue(int i2) {
        this.bitField0_ |= 1;
        this.level_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"bitField0_", "level_", "lengthMeters_", "alertType_", "alertSubType_"});
        }
        if (iOrdinal == 3) {
            return new TrafficJamSection();
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
        fo<TrafficJamSection> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (TrafficJamSection.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public int getAlertSubType() {
        return this.alertSubType_;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public AlerterType getAlertType() {
        AlerterType alerterTypeForNumber = AlerterType.forNumber(this.alertType_);
        return alerterTypeForNumber == null ? AlerterType.UNRECOGNIZED : alerterTypeForNumber;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public int getAlertTypeValue() {
        return this.alertType_;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public int getLengthMeters() {
        return this.lengthMeters_;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public Severity getLevel() {
        Severity severityForNumber = Severity.forNumber(this.level_);
        return severityForNumber == null ? Severity.UNRECOGNIZED : severityForNumber;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public int getLevelValue() {
        return this.level_;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public boolean hasAlertSubType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public boolean hasAlertType() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public boolean hasLengthMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TrafficJamSectionOrBuilder
    public boolean hasLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TrafficJamSection trafficJamSection) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(trafficJamSection);
    }

    public static TrafficJamSection parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (TrafficJamSection) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TrafficJamSection parseFrom(v vVar, de deVar) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static TrafficJamSection parseFrom(z zVar) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static TrafficJamSection parseFrom(z zVar, de deVar) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static TrafficJamSection parseFrom(InputStream inputStream) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TrafficJamSection parseFrom(InputStream inputStream, de deVar) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TrafficJamSection parseFrom(ByteBuffer byteBuffer) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TrafficJamSection parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static TrafficJamSection parseFrom(byte[] bArr) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TrafficJamSection parseFrom(byte[] bArr, de deVar) {
        return (TrafficJamSection) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
