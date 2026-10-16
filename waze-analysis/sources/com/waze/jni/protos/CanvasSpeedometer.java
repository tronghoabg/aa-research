package com.waze.jni.protos;

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
/* loaded from: classes6.dex */
public final class CanvasSpeedometer extends du<CanvasSpeedometer, Builder> implements CanvasSpeedometerOrBuilder {
    private static final CanvasSpeedometer DEFAULT_INSTANCE;
    private static volatile fo<CanvasSpeedometer> PARSER = null;
    public static final int SHOULD_ADJUST_BOTTOM_OFFSET_FIELD_NUMBER = 7;
    public static final int SPEED_FIELD_NUMBER = 2;
    public static final int SPEED_LIMIT_ENABLED_FIELD_NUMBER = 4;
    public static final int SPEED_LIMIT_FIELD_NUMBER = 5;
    public static final int SPEED_LIMIT_US_STYLE_FIELD_NUMBER = 6;
    public static final int SPEED_UNITS_FIELD_NUMBER = 3;
    public static final int VISIBLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean shouldAdjustBottomOffset_;
    private boolean speedLimitEnabled_;
    private boolean speedLimitUsStyle_;
    private int speedLimit_;
    private String speedUnits_ = "";
    private int speed_;
    private boolean visible_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.CanvasSpeedometer$1, reason: invalid class name */
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
    public final class Builder extends dm<CanvasSpeedometer, Builder> implements CanvasSpeedometerOrBuilder {
        private Builder() {
            super(CanvasSpeedometer.DEFAULT_INSTANCE);
        }

        public Builder clearShouldAdjustBottomOffset() {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).clearShouldAdjustBottomOffset();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).clearSpeed();
            return this;
        }

        public Builder clearSpeedLimit() {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).clearSpeedLimit();
            return this;
        }

        public Builder clearSpeedLimitEnabled() {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).clearSpeedLimitEnabled();
            return this;
        }

        public Builder clearSpeedLimitUsStyle() {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).clearSpeedLimitUsStyle();
            return this;
        }

        public Builder clearSpeedUnits() {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).clearSpeedUnits();
            return this;
        }

        public Builder clearVisible() {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).clearVisible();
            return this;
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean getShouldAdjustBottomOffset() {
            return ((CanvasSpeedometer) this.instance).getShouldAdjustBottomOffset();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public int getSpeed() {
            return ((CanvasSpeedometer) this.instance).getSpeed();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public int getSpeedLimit() {
            return ((CanvasSpeedometer) this.instance).getSpeedLimit();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean getSpeedLimitEnabled() {
            return ((CanvasSpeedometer) this.instance).getSpeedLimitEnabled();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean getSpeedLimitUsStyle() {
            return ((CanvasSpeedometer) this.instance).getSpeedLimitUsStyle();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public String getSpeedUnits() {
            return ((CanvasSpeedometer) this.instance).getSpeedUnits();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public v getSpeedUnitsBytes() {
            return ((CanvasSpeedometer) this.instance).getSpeedUnitsBytes();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean getVisible() {
            return ((CanvasSpeedometer) this.instance).getVisible();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean hasShouldAdjustBottomOffset() {
            return ((CanvasSpeedometer) this.instance).hasShouldAdjustBottomOffset();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean hasSpeed() {
            return ((CanvasSpeedometer) this.instance).hasSpeed();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean hasSpeedLimit() {
            return ((CanvasSpeedometer) this.instance).hasSpeedLimit();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean hasSpeedLimitEnabled() {
            return ((CanvasSpeedometer) this.instance).hasSpeedLimitEnabled();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean hasSpeedLimitUsStyle() {
            return ((CanvasSpeedometer) this.instance).hasSpeedLimitUsStyle();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean hasSpeedUnits() {
            return ((CanvasSpeedometer) this.instance).hasSpeedUnits();
        }

        @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
        public boolean hasVisible() {
            return ((CanvasSpeedometer) this.instance).hasVisible();
        }

        public Builder setShouldAdjustBottomOffset(boolean z) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setShouldAdjustBottomOffset(z);
            return this;
        }

        public Builder setSpeed(int i2) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setSpeed(i2);
            return this;
        }

        public Builder setSpeedLimit(int i2) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setSpeedLimit(i2);
            return this;
        }

        public Builder setSpeedLimitEnabled(boolean z) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setSpeedLimitEnabled(z);
            return this;
        }

        public Builder setSpeedLimitUsStyle(boolean z) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setSpeedLimitUsStyle(z);
            return this;
        }

        public Builder setSpeedUnits(String str) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setSpeedUnits(str);
            return this;
        }

        public Builder setSpeedUnitsBytes(v vVar) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setSpeedUnitsBytes(vVar);
            return this;
        }

        public Builder setVisible(boolean z) {
            copyOnWrite();
            ((CanvasSpeedometer) this.instance).setVisible(z);
            return this;
        }
    }

    static {
        CanvasSpeedometer canvasSpeedometer = new CanvasSpeedometer();
        DEFAULT_INSTANCE = canvasSpeedometer;
        du.registerDefaultInstance(CanvasSpeedometer.class, canvasSpeedometer);
    }

    private CanvasSpeedometer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldAdjustBottomOffset() {
        this.bitField0_ &= -65;
        this.shouldAdjustBottomOffset_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.bitField0_ &= -3;
        this.speed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimit() {
        this.bitField0_ &= -17;
        this.speedLimit_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimitEnabled() {
        this.bitField0_ &= -9;
        this.speedLimitEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimitUsStyle() {
        this.bitField0_ &= -33;
        this.speedLimitUsStyle_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedUnits() {
        this.bitField0_ &= -5;
        this.speedUnits_ = getDefaultInstance().getSpeedUnits();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisible() {
        this.bitField0_ &= -2;
        this.visible_ = false;
    }

    public static CanvasSpeedometer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CanvasSpeedometer parseDelimitedFrom(InputStream inputStream) {
        return (CanvasSpeedometer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanvasSpeedometer parseFrom(v vVar) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CanvasSpeedometer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldAdjustBottomOffset(boolean z) {
        this.bitField0_ |= 64;
        this.shouldAdjustBottomOffset_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(int i2) {
        this.bitField0_ |= 2;
        this.speed_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimit(int i2) {
        this.bitField0_ |= 16;
        this.speedLimit_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimitEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.speedLimitEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimitUsStyle(boolean z) {
        this.bitField0_ |= 32;
        this.speedLimitUsStyle_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedUnits(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.speedUnits_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedUnitsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.speedUnits_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisible(boolean z) {
        this.bitField0_ |= 1;
        this.visible_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ለ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"bitField0_", "visible_", "speed_", "speedUnits_", "speedLimitEnabled_", "speedLimit_", "speedLimitUsStyle_", "shouldAdjustBottomOffset_"});
        }
        if (iOrdinal == 3) {
            return new CanvasSpeedometer();
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
        fo<CanvasSpeedometer> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CanvasSpeedometer.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean getShouldAdjustBottomOffset() {
        return this.shouldAdjustBottomOffset_;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public int getSpeed() {
        return this.speed_;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public int getSpeedLimit() {
        return this.speedLimit_;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean getSpeedLimitEnabled() {
        return this.speedLimitEnabled_;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean getSpeedLimitUsStyle() {
        return this.speedLimitUsStyle_;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public String getSpeedUnits() {
        return this.speedUnits_;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public v getSpeedUnitsBytes() {
        return v.s(this.speedUnits_);
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean getVisible() {
        return this.visible_;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean hasShouldAdjustBottomOffset() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean hasSpeed() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean hasSpeedLimit() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean hasSpeedLimitEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean hasSpeedLimitUsStyle() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean hasSpeedUnits() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.CanvasSpeedometerOrBuilder
    public boolean hasVisible() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(CanvasSpeedometer canvasSpeedometer) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(canvasSpeedometer);
    }

    public static CanvasSpeedometer parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CanvasSpeedometer) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CanvasSpeedometer parseFrom(v vVar, de deVar) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CanvasSpeedometer parseFrom(z zVar) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CanvasSpeedometer parseFrom(z zVar, de deVar) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CanvasSpeedometer parseFrom(InputStream inputStream) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CanvasSpeedometer parseFrom(InputStream inputStream, de deVar) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CanvasSpeedometer parseFrom(ByteBuffer byteBuffer) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CanvasSpeedometer parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static CanvasSpeedometer parseFrom(byte[] bArr) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CanvasSpeedometer parseFrom(byte[] bArr, de deVar) {
        return (CanvasSpeedometer) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
