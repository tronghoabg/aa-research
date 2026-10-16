package com.waze.jni.protos.navigate;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.navigate.DriveTo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingRequestParamsResult extends du<RoutingRequestParamsResult, Builder> implements RoutingRequestParamsResultOrBuilder {
    private static final RoutingRequestParamsResult DEFAULT_INSTANCE;
    public static final int DESTINATION_DANGER_ZONE_TYPE_FIELD_NUMBER = 2;
    public static final int ORIGIN_DANGER_ZONE_TYPE_FIELD_NUMBER = 1;
    private static volatile fo<RoutingRequestParamsResult> PARSER = null;
    public static final int TEMP_AVOID_FERRIES_FIELD_NUMBER = 6;
    public static final int TEMP_AVOID_PRIMARIES_FIELD_NUMBER = 7;
    public static final int TEMP_AVOID_TOLL_ROADS_FIELD_NUMBER = 5;
    public static final int TEMP_AVOID_TRAILS_FIELD_NUMBER = 4;
    public static final int TEMP_VEHICLE_TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int destinationDangerZoneType_;
    private int originDangerZoneType_;
    private boolean tempAvoidFerries_;
    private boolean tempAvoidPrimaries_;
    private boolean tempAvoidTollRoads_;
    private String tempVehicleType_ = "";
    private String tempAvoidTrails_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.RoutingRequestParamsResult$1, reason: invalid class name */
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
    public final class Builder extends dm<RoutingRequestParamsResult, Builder> implements RoutingRequestParamsResultOrBuilder {
        private Builder() {
            super(RoutingRequestParamsResult.DEFAULT_INSTANCE);
        }

        public Builder clearDestinationDangerZoneType() {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).clearDestinationDangerZoneType();
            return this;
        }

        public Builder clearOriginDangerZoneType() {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).clearOriginDangerZoneType();
            return this;
        }

        public Builder clearTempAvoidFerries() {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).clearTempAvoidFerries();
            return this;
        }

        public Builder clearTempAvoidPrimaries() {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).clearTempAvoidPrimaries();
            return this;
        }

        public Builder clearTempAvoidTollRoads() {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).clearTempAvoidTollRoads();
            return this;
        }

        public Builder clearTempAvoidTrails() {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).clearTempAvoidTrails();
            return this;
        }

        public Builder clearTempVehicleType() {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).clearTempVehicleType();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public DriveTo.DangerZoneType getDestinationDangerZoneType() {
            return ((RoutingRequestParamsResult) this.instance).getDestinationDangerZoneType();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public int getDestinationDangerZoneTypeValue() {
            return ((RoutingRequestParamsResult) this.instance).getDestinationDangerZoneTypeValue();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public DriveTo.DangerZoneType getOriginDangerZoneType() {
            return ((RoutingRequestParamsResult) this.instance).getOriginDangerZoneType();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public int getOriginDangerZoneTypeValue() {
            return ((RoutingRequestParamsResult) this.instance).getOriginDangerZoneTypeValue();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean getTempAvoidFerries() {
            return ((RoutingRequestParamsResult) this.instance).getTempAvoidFerries();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean getTempAvoidPrimaries() {
            return ((RoutingRequestParamsResult) this.instance).getTempAvoidPrimaries();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean getTempAvoidTollRoads() {
            return ((RoutingRequestParamsResult) this.instance).getTempAvoidTollRoads();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public String getTempAvoidTrails() {
            return ((RoutingRequestParamsResult) this.instance).getTempAvoidTrails();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public v getTempAvoidTrailsBytes() {
            return ((RoutingRequestParamsResult) this.instance).getTempAvoidTrailsBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public String getTempVehicleType() {
            return ((RoutingRequestParamsResult) this.instance).getTempVehicleType();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public v getTempVehicleTypeBytes() {
            return ((RoutingRequestParamsResult) this.instance).getTempVehicleTypeBytes();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean hasDestinationDangerZoneType() {
            return ((RoutingRequestParamsResult) this.instance).hasDestinationDangerZoneType();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean hasOriginDangerZoneType() {
            return ((RoutingRequestParamsResult) this.instance).hasOriginDangerZoneType();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean hasTempAvoidFerries() {
            return ((RoutingRequestParamsResult) this.instance).hasTempAvoidFerries();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean hasTempAvoidPrimaries() {
            return ((RoutingRequestParamsResult) this.instance).hasTempAvoidPrimaries();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean hasTempAvoidTollRoads() {
            return ((RoutingRequestParamsResult) this.instance).hasTempAvoidTollRoads();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean hasTempAvoidTrails() {
            return ((RoutingRequestParamsResult) this.instance).hasTempAvoidTrails();
        }

        @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
        public boolean hasTempVehicleType() {
            return ((RoutingRequestParamsResult) this.instance).hasTempVehicleType();
        }

        public Builder setDestinationDangerZoneType(DriveTo.DangerZoneType dangerZoneType) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setDestinationDangerZoneType(dangerZoneType);
            return this;
        }

        public Builder setDestinationDangerZoneTypeValue(int i2) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setDestinationDangerZoneTypeValue(i2);
            return this;
        }

        public Builder setOriginDangerZoneType(DriveTo.DangerZoneType dangerZoneType) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setOriginDangerZoneType(dangerZoneType);
            return this;
        }

        public Builder setOriginDangerZoneTypeValue(int i2) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setOriginDangerZoneTypeValue(i2);
            return this;
        }

        public Builder setTempAvoidFerries(boolean z) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setTempAvoidFerries(z);
            return this;
        }

        public Builder setTempAvoidPrimaries(boolean z) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setTempAvoidPrimaries(z);
            return this;
        }

        public Builder setTempAvoidTollRoads(boolean z) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setTempAvoidTollRoads(z);
            return this;
        }

        public Builder setTempAvoidTrails(String str) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setTempAvoidTrails(str);
            return this;
        }

        public Builder setTempAvoidTrailsBytes(v vVar) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setTempAvoidTrailsBytes(vVar);
            return this;
        }

        public Builder setTempVehicleType(String str) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setTempVehicleType(str);
            return this;
        }

        public Builder setTempVehicleTypeBytes(v vVar) {
            copyOnWrite();
            ((RoutingRequestParamsResult) this.instance).setTempVehicleTypeBytes(vVar);
            return this;
        }
    }

    static {
        RoutingRequestParamsResult routingRequestParamsResult = new RoutingRequestParamsResult();
        DEFAULT_INSTANCE = routingRequestParamsResult;
        du.registerDefaultInstance(RoutingRequestParamsResult.class, routingRequestParamsResult);
    }

    private RoutingRequestParamsResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationDangerZoneType() {
        this.bitField0_ &= -3;
        this.destinationDangerZoneType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginDangerZoneType() {
        this.bitField0_ &= -2;
        this.originDangerZoneType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTempAvoidFerries() {
        this.bitField0_ &= -33;
        this.tempAvoidFerries_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTempAvoidPrimaries() {
        this.bitField0_ &= -65;
        this.tempAvoidPrimaries_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTempAvoidTollRoads() {
        this.bitField0_ &= -17;
        this.tempAvoidTollRoads_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTempAvoidTrails() {
        this.bitField0_ &= -9;
        this.tempAvoidTrails_ = getDefaultInstance().getTempAvoidTrails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTempVehicleType() {
        this.bitField0_ &= -5;
        this.tempVehicleType_ = getDefaultInstance().getTempVehicleType();
    }

    public static RoutingRequestParamsResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RoutingRequestParamsResult parseDelimitedFrom(InputStream inputStream) {
        return (RoutingRequestParamsResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingRequestParamsResult parseFrom(v vVar) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RoutingRequestParamsResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationDangerZoneType(DriveTo.DangerZoneType dangerZoneType) {
        this.destinationDangerZoneType_ = dangerZoneType.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationDangerZoneTypeValue(int i2) {
        this.bitField0_ |= 2;
        this.destinationDangerZoneType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginDangerZoneType(DriveTo.DangerZoneType dangerZoneType) {
        this.originDangerZoneType_ = dangerZoneType.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginDangerZoneTypeValue(int i2) {
        this.bitField0_ |= 1;
        this.originDangerZoneType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempAvoidFerries(boolean z) {
        this.bitField0_ |= 32;
        this.tempAvoidFerries_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempAvoidPrimaries(boolean z) {
        this.bitField0_ |= 64;
        this.tempAvoidPrimaries_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempAvoidTollRoads(boolean z) {
        this.bitField0_ |= 16;
        this.tempAvoidTollRoads_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempAvoidTrails(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.tempAvoidTrails_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempAvoidTrailsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tempAvoidTrails_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempVehicleType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.tempVehicleType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempVehicleTypeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tempVehicleType_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"bitField0_", "originDangerZoneType_", "destinationDangerZoneType_", "tempVehicleType_", "tempAvoidTrails_", "tempAvoidTollRoads_", "tempAvoidFerries_", "tempAvoidPrimaries_"});
        }
        if (iOrdinal == 3) {
            return new RoutingRequestParamsResult();
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
        fo<RoutingRequestParamsResult> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RoutingRequestParamsResult.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public DriveTo.DangerZoneType getDestinationDangerZoneType() {
        DriveTo.DangerZoneType dangerZoneTypeForNumber = DriveTo.DangerZoneType.forNumber(this.destinationDangerZoneType_);
        return dangerZoneTypeForNumber == null ? DriveTo.DangerZoneType.UNRECOGNIZED : dangerZoneTypeForNumber;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public int getDestinationDangerZoneTypeValue() {
        return this.destinationDangerZoneType_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public DriveTo.DangerZoneType getOriginDangerZoneType() {
        DriveTo.DangerZoneType dangerZoneTypeForNumber = DriveTo.DangerZoneType.forNumber(this.originDangerZoneType_);
        return dangerZoneTypeForNumber == null ? DriveTo.DangerZoneType.UNRECOGNIZED : dangerZoneTypeForNumber;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public int getOriginDangerZoneTypeValue() {
        return this.originDangerZoneType_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean getTempAvoidFerries() {
        return this.tempAvoidFerries_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean getTempAvoidPrimaries() {
        return this.tempAvoidPrimaries_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean getTempAvoidTollRoads() {
        return this.tempAvoidTollRoads_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public String getTempAvoidTrails() {
        return this.tempAvoidTrails_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public v getTempAvoidTrailsBytes() {
        return v.s(this.tempAvoidTrails_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public String getTempVehicleType() {
        return this.tempVehicleType_;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public v getTempVehicleTypeBytes() {
        return v.s(this.tempVehicleType_);
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean hasDestinationDangerZoneType() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean hasOriginDangerZoneType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean hasTempAvoidFerries() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean hasTempAvoidPrimaries() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean hasTempAvoidTollRoads() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean hasTempAvoidTrails() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.navigate.RoutingRequestParamsResultOrBuilder
    public boolean hasTempVehicleType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(RoutingRequestParamsResult routingRequestParamsResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(routingRequestParamsResult);
    }

    public static RoutingRequestParamsResult parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RoutingRequestParamsResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingRequestParamsResult parseFrom(v vVar, de deVar) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RoutingRequestParamsResult parseFrom(z zVar) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RoutingRequestParamsResult parseFrom(z zVar, de deVar) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RoutingRequestParamsResult parseFrom(InputStream inputStream) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RoutingRequestParamsResult parseFrom(InputStream inputStream, de deVar) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RoutingRequestParamsResult parseFrom(ByteBuffer byteBuffer) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RoutingRequestParamsResult parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RoutingRequestParamsResult parseFrom(byte[] bArr) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RoutingRequestParamsResult parseFrom(byte[] bArr, de deVar) {
        return (RoutingRequestParamsResult) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
