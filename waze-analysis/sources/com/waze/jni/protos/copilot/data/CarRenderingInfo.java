package com.waze.jni.protos.copilot.data;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.copilot.data.LightingRenderingInfo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CarRenderingInfo extends du<CarRenderingInfo, Builder> implements CarRenderingInfoOrBuilder {
    public static final int CAR_NAME_FIELD_NUMBER = 1;
    private static final CarRenderingInfo DEFAULT_INSTANCE;
    public static final int IS_FROM_SERVER_FIELD_NUMBER = 2;
    public static final int LIGHTING_INFO_FIELD_NUMBER = 8;
    public static final int MODEL_FILE_NAME_FIELD_NUMBER = 3;
    public static final int NORMAL_TEXTURE_FILE_PATH_FIELD_NUMBER = 4;
    private static volatile fo<CarRenderingInfo> PARSER = null;
    public static final int SCALE_FIELD_NUMBER = 7;
    public static final int SHARE_TEXTURE_FILE_PATH_FIELD_NUMBER = 6;
    public static final int TAXI_TEXTURE_FILE_PATH_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean isFromServer_;
    private LightingRenderingInfo lightingInfo_;
    private float scale_;
    private String carName_ = "";
    private String modelFileName_ = "";
    private String normalTextureFilePath_ = "";
    private String taxiTextureFilePath_ = "";
    private String shareTextureFilePath_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.copilot.data.CarRenderingInfo$1, reason: invalid class name */
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
        CarRenderingInfo carRenderingInfo = new CarRenderingInfo();
        DEFAULT_INSTANCE = carRenderingInfo;
        du.registerDefaultInstance(CarRenderingInfo.class, carRenderingInfo);
    }

    private CarRenderingInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarName() {
        this.carName_ = getDefaultInstance().getCarName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFromServer() {
        this.isFromServer_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLightingInfo() {
        this.lightingInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModelFileName() {
        this.modelFileName_ = getDefaultInstance().getModelFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalTextureFilePath() {
        this.normalTextureFilePath_ = getDefaultInstance().getNormalTextureFilePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.scale_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShareTextureFilePath() {
        this.bitField0_ &= -3;
        this.shareTextureFilePath_ = getDefaultInstance().getShareTextureFilePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaxiTextureFilePath() {
        this.bitField0_ &= -2;
        this.taxiTextureFilePath_ = getDefaultInstance().getTaxiTextureFilePath();
    }

    public static CarRenderingInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLightingInfo(LightingRenderingInfo lightingRenderingInfo) {
        Objects.requireNonNull(lightingRenderingInfo);
        LightingRenderingInfo lightingRenderingInfo2 = this.lightingInfo_;
        if (lightingRenderingInfo2 != null && lightingRenderingInfo2 != LightingRenderingInfo.getDefaultInstance()) {
            LightingRenderingInfo.Builder builderNewBuilder = LightingRenderingInfo.newBuilder(lightingRenderingInfo2);
            builderNewBuilder.mergeFrom((LightingRenderingInfo.Builder) lightingRenderingInfo);
            lightingRenderingInfo = builderNewBuilder.buildPartial();
        }
        this.lightingInfo_ = lightingRenderingInfo;
        this.bitField0_ |= 4;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CarRenderingInfo parseDelimitedFrom(InputStream inputStream) {
        return (CarRenderingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CarRenderingInfo parseFrom(v vVar) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CarRenderingInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setIsFromServer(boolean z) {
        this.isFromServer_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLightingInfo(LightingRenderingInfo lightingRenderingInfo) {
        Objects.requireNonNull(lightingRenderingInfo);
        this.lightingInfo_ = lightingRenderingInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelFileName(String str) {
        Objects.requireNonNull(str);
        this.modelFileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelFileNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.modelFileName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalTextureFilePath(String str) {
        Objects.requireNonNull(str);
        this.normalTextureFilePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalTextureFilePathBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.normalTextureFilePath_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f2) {
        this.scale_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareTextureFilePath(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.shareTextureFilePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareTextureFilePathBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.shareTextureFilePath_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaxiTextureFilePath(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.taxiTextureFilePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaxiTextureFilePathBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.taxiTextureFilePath_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005ለ\u0000\u0006ለ\u0001\u0007\u0001\bဉ\u0002", new Object[]{"bitField0_", "carName_", "isFromServer_", "modelFileName_", "normalTextureFilePath_", "taxiTextureFilePath_", "shareTextureFilePath_", "scale_", "lightingInfo_"});
        }
        if (iOrdinal == 3) {
            return new CarRenderingInfo();
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
        fo<CarRenderingInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CarRenderingInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public String getCarName() {
        return this.carName_;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public v getCarNameBytes() {
        return v.s(this.carName_);
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public boolean getIsFromServer() {
        return this.isFromServer_;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public LightingRenderingInfo getLightingInfo() {
        LightingRenderingInfo lightingRenderingInfo = this.lightingInfo_;
        return lightingRenderingInfo == null ? LightingRenderingInfo.getDefaultInstance() : lightingRenderingInfo;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public String getModelFileName() {
        return this.modelFileName_;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public v getModelFileNameBytes() {
        return v.s(this.modelFileName_);
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public String getNormalTextureFilePath() {
        return this.normalTextureFilePath_;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public v getNormalTextureFilePathBytes() {
        return v.s(this.normalTextureFilePath_);
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public float getScale() {
        return this.scale_;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public String getShareTextureFilePath() {
        return this.shareTextureFilePath_;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public v getShareTextureFilePathBytes() {
        return v.s(this.shareTextureFilePath_);
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public String getTaxiTextureFilePath() {
        return this.taxiTextureFilePath_;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public v getTaxiTextureFilePathBytes() {
        return v.s(this.taxiTextureFilePath_);
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public boolean hasLightingInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public boolean hasShareTextureFilePath() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
    public boolean hasTaxiTextureFilePath() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(CarRenderingInfo carRenderingInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(carRenderingInfo);
    }

    public static CarRenderingInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CarRenderingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CarRenderingInfo parseFrom(v vVar, de deVar) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CarRenderingInfo parseFrom(z zVar) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CarRenderingInfo parseFrom(z zVar, de deVar) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CarRenderingInfo parseFrom(InputStream inputStream) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CarRenderingInfo parseFrom(InputStream inputStream, de deVar) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CarRenderingInfo parseFrom(ByteBuffer byteBuffer) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CarRenderingInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<CarRenderingInfo, Builder> implements CarRenderingInfoOrBuilder {
        private Builder() {
            super(CarRenderingInfo.DEFAULT_INSTANCE);
        }

        public Builder clearCarName() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearCarName();
            return this;
        }

        public Builder clearIsFromServer() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearIsFromServer();
            return this;
        }

        public Builder clearLightingInfo() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearLightingInfo();
            return this;
        }

        public Builder clearModelFileName() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearModelFileName();
            return this;
        }

        public Builder clearNormalTextureFilePath() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearNormalTextureFilePath();
            return this;
        }

        public Builder clearScale() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearScale();
            return this;
        }

        public Builder clearShareTextureFilePath() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearShareTextureFilePath();
            return this;
        }

        public Builder clearTaxiTextureFilePath() {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).clearTaxiTextureFilePath();
            return this;
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public String getCarName() {
            return ((CarRenderingInfo) this.instance).getCarName();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public v getCarNameBytes() {
            return ((CarRenderingInfo) this.instance).getCarNameBytes();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public boolean getIsFromServer() {
            return ((CarRenderingInfo) this.instance).getIsFromServer();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public LightingRenderingInfo getLightingInfo() {
            return ((CarRenderingInfo) this.instance).getLightingInfo();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public String getModelFileName() {
            return ((CarRenderingInfo) this.instance).getModelFileName();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public v getModelFileNameBytes() {
            return ((CarRenderingInfo) this.instance).getModelFileNameBytes();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public String getNormalTextureFilePath() {
            return ((CarRenderingInfo) this.instance).getNormalTextureFilePath();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public v getNormalTextureFilePathBytes() {
            return ((CarRenderingInfo) this.instance).getNormalTextureFilePathBytes();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public float getScale() {
            return ((CarRenderingInfo) this.instance).getScale();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public String getShareTextureFilePath() {
            return ((CarRenderingInfo) this.instance).getShareTextureFilePath();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public v getShareTextureFilePathBytes() {
            return ((CarRenderingInfo) this.instance).getShareTextureFilePathBytes();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public String getTaxiTextureFilePath() {
            return ((CarRenderingInfo) this.instance).getTaxiTextureFilePath();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public v getTaxiTextureFilePathBytes() {
            return ((CarRenderingInfo) this.instance).getTaxiTextureFilePathBytes();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public boolean hasLightingInfo() {
            return ((CarRenderingInfo) this.instance).hasLightingInfo();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public boolean hasShareTextureFilePath() {
            return ((CarRenderingInfo) this.instance).hasShareTextureFilePath();
        }

        @Override // com.waze.jni.protos.copilot.data.CarRenderingInfoOrBuilder
        public boolean hasTaxiTextureFilePath() {
            return ((CarRenderingInfo) this.instance).hasTaxiTextureFilePath();
        }

        public Builder mergeLightingInfo(LightingRenderingInfo lightingRenderingInfo) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).mergeLightingInfo(lightingRenderingInfo);
            return this;
        }

        public Builder setCarName(String str) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setCarName(str);
            return this;
        }

        public Builder setCarNameBytes(v vVar) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setCarNameBytes(vVar);
            return this;
        }

        public Builder setIsFromServer(boolean z) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setIsFromServer(z);
            return this;
        }

        public Builder setLightingInfo(LightingRenderingInfo.Builder builder) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setLightingInfo(builder.build());
            return this;
        }

        public Builder setModelFileName(String str) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setModelFileName(str);
            return this;
        }

        public Builder setModelFileNameBytes(v vVar) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setModelFileNameBytes(vVar);
            return this;
        }

        public Builder setNormalTextureFilePath(String str) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setNormalTextureFilePath(str);
            return this;
        }

        public Builder setNormalTextureFilePathBytes(v vVar) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setNormalTextureFilePathBytes(vVar);
            return this;
        }

        public Builder setScale(float f2) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setScale(f2);
            return this;
        }

        public Builder setShareTextureFilePath(String str) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setShareTextureFilePath(str);
            return this;
        }

        public Builder setShareTextureFilePathBytes(v vVar) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setShareTextureFilePathBytes(vVar);
            return this;
        }

        public Builder setTaxiTextureFilePath(String str) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setTaxiTextureFilePath(str);
            return this;
        }

        public Builder setTaxiTextureFilePathBytes(v vVar) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setTaxiTextureFilePathBytes(vVar);
            return this;
        }

        public Builder setLightingInfo(LightingRenderingInfo lightingRenderingInfo) {
            copyOnWrite();
            ((CarRenderingInfo) this.instance).setLightingInfo(lightingRenderingInfo);
            return this;
        }
    }

    public static CarRenderingInfo parseFrom(byte[] bArr) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CarRenderingInfo parseFrom(byte[] bArr, de deVar) {
        return (CarRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
