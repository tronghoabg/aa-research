package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Car3DInfo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CopilotMarketplaceCar extends du<CopilotMarketplaceCar, Builder> implements CopilotMarketplaceCarOrBuilder {
    public static final int CAR_3D_INFO_FIELD_NUMBER = 5;
    public static final int CAR_ID_FIELD_NUMBER = 1;
    public static final int CAR_NAME_FIELD_NUMBER = 2;
    private static final CopilotMarketplaceCar DEFAULT_INSTANCE;
    public static final int IS_ADS_FIELD_NUMBER = 3;
    public static final int IS_HIDDEN_FIELD_NUMBER = 4;
    private static volatile fo<CopilotMarketplaceCar> PARSER;
    private int bitField0_;
    private Car3DInfo car3DInfo_;
    private long carId_;
    private String carName_ = "";
    private boolean isAds_;
    private boolean isHidden_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.CopilotMarketplaceCar$1, reason: invalid class name */
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

    static {
        CopilotMarketplaceCar copilotMarketplaceCar = new CopilotMarketplaceCar();
        DEFAULT_INSTANCE = copilotMarketplaceCar;
        du.registerDefaultInstance(CopilotMarketplaceCar.class, copilotMarketplaceCar);
    }

    private CopilotMarketplaceCar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCar3DInfo() {
        this.car3DInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarId() {
        this.carId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarName() {
        this.carName_ = getDefaultInstance().getCarName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAds() {
        this.isAds_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHidden() {
        this.isHidden_ = false;
    }

    public static CopilotMarketplaceCar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCar3DInfo(Car3DInfo car3DInfo) {
        Objects.requireNonNull(car3DInfo);
        Car3DInfo car3DInfo2 = this.car3DInfo_;
        if (car3DInfo2 != null && car3DInfo2 != Car3DInfo.getDefaultInstance()) {
            Car3DInfo.Builder builderNewBuilder = Car3DInfo.newBuilder(car3DInfo2);
            builderNewBuilder.mergeFrom((Car3DInfo.Builder) car3DInfo);
            car3DInfo = builderNewBuilder.buildPartial();
        }
        this.car3DInfo_ = car3DInfo;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CopilotMarketplaceCar parseDelimitedFrom(InputStream inputStream) {
        return (CopilotMarketplaceCar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CopilotMarketplaceCar parseFrom(v vVar) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CopilotMarketplaceCar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCar3DInfo(Car3DInfo car3DInfo) {
        Objects.requireNonNull(car3DInfo);
        this.car3DInfo_ = car3DInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarId(long j2) {
        this.carId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarName(String str) {
        Objects.requireNonNull(str);
        this.carName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.carName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAds(boolean z) {
        this.isAds_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHidden(boolean z) {
        this.isHidden_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0007\u0004\u0007\u0005ဉ\u0000", new Object[]{"bitField0_", "carId_", "carName_", "isAds_", "isHidden_", "car3DInfo_"});
        }
        if (iOrdinal == 3) {
            return new CopilotMarketplaceCar();
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
        fo<CopilotMarketplaceCar> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CopilotMarketplaceCar.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
    public Car3DInfo getCar3DInfo() {
        Car3DInfo car3DInfo = this.car3DInfo_;
        return car3DInfo == null ? Car3DInfo.getDefaultInstance() : car3DInfo;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
    public long getCarId() {
        return this.carId_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
    public String getCarName() {
        return this.carName_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
    public v getCarNameBytes() {
        return v.s(this.carName_);
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
    public boolean getIsAds() {
        return this.isAds_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
    public boolean getIsHidden() {
        return this.isHidden_;
    }

    @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
    public boolean hasCar3DInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(CopilotMarketplaceCar copilotMarketplaceCar) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(copilotMarketplaceCar);
    }

    public static CopilotMarketplaceCar parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CopilotMarketplaceCar) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CopilotMarketplaceCar parseFrom(v vVar, de deVar) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CopilotMarketplaceCar parseFrom(z zVar) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CopilotMarketplaceCar parseFrom(z zVar, de deVar) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CopilotMarketplaceCar parseFrom(InputStream inputStream) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CopilotMarketplaceCar parseFrom(InputStream inputStream, de deVar) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CopilotMarketplaceCar parseFrom(ByteBuffer byteBuffer) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CopilotMarketplaceCar parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<CopilotMarketplaceCar, Builder> implements CopilotMarketplaceCarOrBuilder {
        private Builder() {
            super(CopilotMarketplaceCar.DEFAULT_INSTANCE);
        }

        public Builder clearCar3DInfo() {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).clearCar3DInfo();
            return this;
        }

        public Builder clearCarId() {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).clearCarId();
            return this;
        }

        public Builder clearCarName() {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).clearCarName();
            return this;
        }

        public Builder clearIsAds() {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).clearIsAds();
            return this;
        }

        public Builder clearIsHidden() {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).clearIsHidden();
            return this;
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
        public Car3DInfo getCar3DInfo() {
            return ((CopilotMarketplaceCar) this.instance).getCar3DInfo();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
        public long getCarId() {
            return ((CopilotMarketplaceCar) this.instance).getCarId();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
        public String getCarName() {
            return ((CopilotMarketplaceCar) this.instance).getCarName();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
        public v getCarNameBytes() {
            return ((CopilotMarketplaceCar) this.instance).getCarNameBytes();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
        public boolean getIsAds() {
            return ((CopilotMarketplaceCar) this.instance).getIsAds();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
        public boolean getIsHidden() {
            return ((CopilotMarketplaceCar) this.instance).getIsHidden();
        }

        @Override // com.waze.jni.protos.CopilotMarketplaceCarOrBuilder
        public boolean hasCar3DInfo() {
            return ((CopilotMarketplaceCar) this.instance).hasCar3DInfo();
        }

        public Builder mergeCar3DInfo(Car3DInfo car3DInfo) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).mergeCar3DInfo(car3DInfo);
            return this;
        }

        public Builder setCar3DInfo(Car3DInfo.Builder builder) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).setCar3DInfo(builder.build());
            return this;
        }

        public Builder setCarId(long j2) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).setCarId(j2);
            return this;
        }

        public Builder setCarName(String str) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).setCarName(str);
            return this;
        }

        public Builder setCarNameBytes(v vVar) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).setCarNameBytes(vVar);
            return this;
        }

        public Builder setIsAds(boolean z) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).setIsAds(z);
            return this;
        }

        public Builder setIsHidden(boolean z) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).setIsHidden(z);
            return this;
        }

        public Builder setCar3DInfo(Car3DInfo car3DInfo) {
            copyOnWrite();
            ((CopilotMarketplaceCar) this.instance).setCar3DInfo(car3DInfo);
            return this;
        }
    }

    public static CopilotMarketplaceCar parseFrom(byte[] bArr) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CopilotMarketplaceCar parseFrom(byte[] bArr, de deVar) {
        return (CopilotMarketplaceCar) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
