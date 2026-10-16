package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.LightingInfo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Car3DInfo extends du<Car3DInfo, Builder> implements Car3DInfoOrBuilder {
    private static final Car3DInfo DEFAULT_INSTANCE;
    public static final int HAS_NORMAL_TEXTURE_FIELD_NUMBER = 4;
    public static final int HAS_SHARE_TEXTURE_FIELD_NUMBER = 3;
    public static final int HAS_TAXI_TEXTURE_FIELD_NUMBER = 2;
    public static final int LIGHTING_INFO_FIELD_NUMBER = 5;
    private static volatile fo<Car3DInfo> PARSER = null;
    public static final int SCALE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean hasNormalTexture_;
    private boolean hasShareTexture_;
    private boolean hasTaxiTexture_;
    private LightingInfo lightingInfo_;
    private float scale_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.Car3DInfo$1, reason: invalid class name */
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
        Car3DInfo car3DInfo = new Car3DInfo();
        DEFAULT_INSTANCE = car3DInfo;
        du.registerDefaultInstance(Car3DInfo.class, car3DInfo);
    }

    private Car3DInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasNormalTexture() {
        this.hasNormalTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasShareTexture() {
        this.hasShareTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasTaxiTexture() {
        this.hasTaxiTexture_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLightingInfo() {
        this.lightingInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.scale_ = 0.0f;
    }

    public static Car3DInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLightingInfo(LightingInfo lightingInfo) {
        Objects.requireNonNull(lightingInfo);
        LightingInfo lightingInfo2 = this.lightingInfo_;
        if (lightingInfo2 != null && lightingInfo2 != LightingInfo.getDefaultInstance()) {
            LightingInfo.Builder builderNewBuilder = LightingInfo.newBuilder(lightingInfo2);
            builderNewBuilder.mergeFrom((LightingInfo.Builder) lightingInfo);
            lightingInfo = builderNewBuilder.buildPartial();
        }
        this.lightingInfo_ = lightingInfo;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Car3DInfo parseDelimitedFrom(InputStream inputStream) {
        return (Car3DInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Car3DInfo parseFrom(v vVar) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Car3DInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasNormalTexture(boolean z) {
        this.hasNormalTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasShareTexture(boolean z) {
        this.hasShareTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasTaxiTexture(boolean z) {
        this.hasTaxiTexture_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLightingInfo(LightingInfo lightingInfo) {
        Objects.requireNonNull(lightingInfo);
        this.lightingInfo_ = lightingInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(float f2) {
        this.scale_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0001\u0002\u0007\u0003\u0007\u0004\u0007\u0005ဉ\u0000", new Object[]{"bitField0_", "scale_", "hasTaxiTexture_", "hasShareTexture_", "hasNormalTexture_", "lightingInfo_"});
        }
        if (iOrdinal == 3) {
            return new Car3DInfo();
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
        fo<Car3DInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Car3DInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.Car3DInfoOrBuilder
    public boolean getHasNormalTexture() {
        return this.hasNormalTexture_;
    }

    @Override // com.waze.jni.protos.Car3DInfoOrBuilder
    public boolean getHasShareTexture() {
        return this.hasShareTexture_;
    }

    @Override // com.waze.jni.protos.Car3DInfoOrBuilder
    public boolean getHasTaxiTexture() {
        return this.hasTaxiTexture_;
    }

    @Override // com.waze.jni.protos.Car3DInfoOrBuilder
    public LightingInfo getLightingInfo() {
        LightingInfo lightingInfo = this.lightingInfo_;
        return lightingInfo == null ? LightingInfo.getDefaultInstance() : lightingInfo;
    }

    @Override // com.waze.jni.protos.Car3DInfoOrBuilder
    public float getScale() {
        return this.scale_;
    }

    @Override // com.waze.jni.protos.Car3DInfoOrBuilder
    public boolean hasLightingInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Car3DInfo car3DInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(car3DInfo);
    }

    public static Car3DInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Car3DInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Car3DInfo parseFrom(v vVar, de deVar) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Car3DInfo parseFrom(z zVar) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Car3DInfo parseFrom(z zVar, de deVar) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Car3DInfo parseFrom(InputStream inputStream) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Car3DInfo parseFrom(InputStream inputStream, de deVar) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Car3DInfo parseFrom(ByteBuffer byteBuffer) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Car3DInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Car3DInfo, Builder> implements Car3DInfoOrBuilder {
        private Builder() {
            super(Car3DInfo.DEFAULT_INSTANCE);
        }

        public Builder clearHasNormalTexture() {
            copyOnWrite();
            ((Car3DInfo) this.instance).clearHasNormalTexture();
            return this;
        }

        public Builder clearHasShareTexture() {
            copyOnWrite();
            ((Car3DInfo) this.instance).clearHasShareTexture();
            return this;
        }

        public Builder clearHasTaxiTexture() {
            copyOnWrite();
            ((Car3DInfo) this.instance).clearHasTaxiTexture();
            return this;
        }

        public Builder clearLightingInfo() {
            copyOnWrite();
            ((Car3DInfo) this.instance).clearLightingInfo();
            return this;
        }

        public Builder clearScale() {
            copyOnWrite();
            ((Car3DInfo) this.instance).clearScale();
            return this;
        }

        @Override // com.waze.jni.protos.Car3DInfoOrBuilder
        public boolean getHasNormalTexture() {
            return ((Car3DInfo) this.instance).getHasNormalTexture();
        }

        @Override // com.waze.jni.protos.Car3DInfoOrBuilder
        public boolean getHasShareTexture() {
            return ((Car3DInfo) this.instance).getHasShareTexture();
        }

        @Override // com.waze.jni.protos.Car3DInfoOrBuilder
        public boolean getHasTaxiTexture() {
            return ((Car3DInfo) this.instance).getHasTaxiTexture();
        }

        @Override // com.waze.jni.protos.Car3DInfoOrBuilder
        public LightingInfo getLightingInfo() {
            return ((Car3DInfo) this.instance).getLightingInfo();
        }

        @Override // com.waze.jni.protos.Car3DInfoOrBuilder
        public float getScale() {
            return ((Car3DInfo) this.instance).getScale();
        }

        @Override // com.waze.jni.protos.Car3DInfoOrBuilder
        public boolean hasLightingInfo() {
            return ((Car3DInfo) this.instance).hasLightingInfo();
        }

        public Builder mergeLightingInfo(LightingInfo lightingInfo) {
            copyOnWrite();
            ((Car3DInfo) this.instance).mergeLightingInfo(lightingInfo);
            return this;
        }

        public Builder setHasNormalTexture(boolean z) {
            copyOnWrite();
            ((Car3DInfo) this.instance).setHasNormalTexture(z);
            return this;
        }

        public Builder setHasShareTexture(boolean z) {
            copyOnWrite();
            ((Car3DInfo) this.instance).setHasShareTexture(z);
            return this;
        }

        public Builder setHasTaxiTexture(boolean z) {
            copyOnWrite();
            ((Car3DInfo) this.instance).setHasTaxiTexture(z);
            return this;
        }

        public Builder setLightingInfo(LightingInfo.Builder builder) {
            copyOnWrite();
            ((Car3DInfo) this.instance).setLightingInfo(builder.build());
            return this;
        }

        public Builder setScale(float f2) {
            copyOnWrite();
            ((Car3DInfo) this.instance).setScale(f2);
            return this;
        }

        public Builder setLightingInfo(LightingInfo lightingInfo) {
            copyOnWrite();
            ((Car3DInfo) this.instance).setLightingInfo(lightingInfo);
            return this;
        }
    }

    public static Car3DInfo parseFrom(byte[] bArr) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Car3DInfo parseFrom(byte[] bArr, de deVar) {
        return (Car3DInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
