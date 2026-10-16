package com.waze.jni.protos.navigate;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.DistanceUnitOuterClass;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DistanceUpdate extends du<DistanceUpdate, Builder> implements DistanceUpdateOrBuilder {
    private static final DistanceUpdate DEFAULT_INSTANCE;
    private static volatile fo<DistanceUpdate> PARSER = null;
    public static final int RAW_METERS_FIELD_NUMBER = 5;
    public static final int UNIT_FIELD_NUMBER = 4;
    public static final int UNIT_STRING_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 3;
    public static final int VALUE_STRING_FIELD_NUMBER = 1;
    private int rawMeters_;
    private int unit_;
    private double value_;
    private String valueString_ = "";
    private String unitString_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.DistanceUpdate$1, reason: invalid class name */
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
    public final class Builder extends dm<DistanceUpdate, Builder> implements DistanceUpdateOrBuilder {
        private Builder() {
            super(DistanceUpdate.DEFAULT_INSTANCE);
        }

        public Builder clearRawMeters() {
            copyOnWrite();
            ((DistanceUpdate) this.instance).clearRawMeters();
            return this;
        }

        public Builder clearUnit() {
            copyOnWrite();
            ((DistanceUpdate) this.instance).clearUnit();
            return this;
        }

        public Builder clearUnitString() {
            copyOnWrite();
            ((DistanceUpdate) this.instance).clearUnitString();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DistanceUpdate) this.instance).clearValue();
            return this;
        }

        public Builder clearValueString() {
            copyOnWrite();
            ((DistanceUpdate) this.instance).clearValueString();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public int getRawMeters() {
            return ((DistanceUpdate) this.instance).getRawMeters();
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public DistanceUnitOuterClass.DistanceUnit getUnit() {
            return ((DistanceUpdate) this.instance).getUnit();
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public String getUnitString() {
            return ((DistanceUpdate) this.instance).getUnitString();
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public v getUnitStringBytes() {
            return ((DistanceUpdate) this.instance).getUnitStringBytes();
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public int getUnitValue() {
            return ((DistanceUpdate) this.instance).getUnitValue();
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public double getValue() {
            return ((DistanceUpdate) this.instance).getValue();
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public String getValueString() {
            return ((DistanceUpdate) this.instance).getValueString();
        }

        @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
        public v getValueStringBytes() {
            return ((DistanceUpdate) this.instance).getValueStringBytes();
        }

        public Builder setRawMeters(int i2) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setRawMeters(i2);
            return this;
        }

        public Builder setUnit(DistanceUnitOuterClass.DistanceUnit distanceUnit) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setUnit(distanceUnit);
            return this;
        }

        public Builder setUnitString(String str) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setUnitString(str);
            return this;
        }

        public Builder setUnitStringBytes(v vVar) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setUnitStringBytes(vVar);
            return this;
        }

        public Builder setUnitValue(int i2) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setUnitValue(i2);
            return this;
        }

        public Builder setValue(double d2) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setValue(d2);
            return this;
        }

        public Builder setValueString(String str) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setValueString(str);
            return this;
        }

        public Builder setValueStringBytes(v vVar) {
            copyOnWrite();
            ((DistanceUpdate) this.instance).setValueStringBytes(vVar);
            return this;
        }
    }

    static {
        DistanceUpdate distanceUpdate = new DistanceUpdate();
        DEFAULT_INSTANCE = distanceUpdate;
        du.registerDefaultInstance(DistanceUpdate.class, distanceUpdate);
    }

    private DistanceUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawMeters() {
        this.rawMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnitString() {
        this.unitString_ = getDefaultInstance().getUnitString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueString() {
        this.valueString_ = getDefaultInstance().getValueString();
    }

    public static DistanceUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DistanceUpdate parseDelimitedFrom(InputStream inputStream) {
        return (DistanceUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DistanceUpdate parseFrom(v vVar) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<DistanceUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawMeters(int i2) {
        this.rawMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(DistanceUnitOuterClass.DistanceUnit distanceUnit) {
        this.unit_ = distanceUnit.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitString(String str) {
        Objects.requireNonNull(str);
        this.unitString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitStringBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.unitString_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitValue(int i2) {
        this.unit_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(double d2) {
        this.value_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueString(String str) {
        Objects.requireNonNull(str);
        this.valueString_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueStringBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.valueString_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\f\u0005\u0004", new Object[]{"valueString_", "unitString_", "value_", "unit_", "rawMeters_"});
        }
        if (iOrdinal == 3) {
            return new DistanceUpdate();
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
        fo<DistanceUpdate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (DistanceUpdate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public int getRawMeters() {
        return this.rawMeters_;
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public DistanceUnitOuterClass.DistanceUnit getUnit() {
        DistanceUnitOuterClass.DistanceUnit distanceUnitForNumber = DistanceUnitOuterClass.DistanceUnit.forNumber(this.unit_);
        return distanceUnitForNumber == null ? DistanceUnitOuterClass.DistanceUnit.UNRECOGNIZED : distanceUnitForNumber;
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public String getUnitString() {
        return this.unitString_;
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public v getUnitStringBytes() {
        return v.s(this.unitString_);
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public int getUnitValue() {
        return this.unit_;
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public double getValue() {
        return this.value_;
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public String getValueString() {
        return this.valueString_;
    }

    @Override // com.waze.jni.protos.navigate.DistanceUpdateOrBuilder
    public v getValueStringBytes() {
        return v.s(this.valueString_);
    }

    public static Builder newBuilder(DistanceUpdate distanceUpdate) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(distanceUpdate);
    }

    public static DistanceUpdate parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (DistanceUpdate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DistanceUpdate parseFrom(v vVar, de deVar) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static DistanceUpdate parseFrom(z zVar) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static DistanceUpdate parseFrom(z zVar, de deVar) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static DistanceUpdate parseFrom(InputStream inputStream) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DistanceUpdate parseFrom(InputStream inputStream, de deVar) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static DistanceUpdate parseFrom(ByteBuffer byteBuffer) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DistanceUpdate parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static DistanceUpdate parseFrom(byte[] bArr) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DistanceUpdate parseFrom(byte[] bArr, de deVar) {
        return (DistanceUpdate) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
