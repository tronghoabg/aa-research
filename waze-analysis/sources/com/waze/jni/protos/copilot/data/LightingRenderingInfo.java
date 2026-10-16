package com.waze.jni.protos.copilot.data;

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
/* loaded from: classes6.dex */
public final class LightingRenderingInfo extends du<LightingRenderingInfo, Builder> implements LightingRenderingInfoOrBuilder {
    public static final int AMBIENT_INTENSITY_FIELD_NUMBER = 1;
    private static final LightingRenderingInfo DEFAULT_INSTANCE;
    public static final int DIFFUSE_INTENSITY_FIELD_NUMBER = 2;
    private static volatile fo<LightingRenderingInfo> PARSER;
    private float ambientIntensity_;
    private float diffuseIntensity_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.copilot.data.LightingRenderingInfo$1, reason: invalid class name */
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
    public final class Builder extends dm<LightingRenderingInfo, Builder> implements LightingRenderingInfoOrBuilder {
        private Builder() {
            super(LightingRenderingInfo.DEFAULT_INSTANCE);
        }

        public Builder clearAmbientIntensity() {
            copyOnWrite();
            ((LightingRenderingInfo) this.instance).clearAmbientIntensity();
            return this;
        }

        public Builder clearDiffuseIntensity() {
            copyOnWrite();
            ((LightingRenderingInfo) this.instance).clearDiffuseIntensity();
            return this;
        }

        @Override // com.waze.jni.protos.copilot.data.LightingRenderingInfoOrBuilder
        public float getAmbientIntensity() {
            return ((LightingRenderingInfo) this.instance).getAmbientIntensity();
        }

        @Override // com.waze.jni.protos.copilot.data.LightingRenderingInfoOrBuilder
        public float getDiffuseIntensity() {
            return ((LightingRenderingInfo) this.instance).getDiffuseIntensity();
        }

        public Builder setAmbientIntensity(float f2) {
            copyOnWrite();
            ((LightingRenderingInfo) this.instance).setAmbientIntensity(f2);
            return this;
        }

        public Builder setDiffuseIntensity(float f2) {
            copyOnWrite();
            ((LightingRenderingInfo) this.instance).setDiffuseIntensity(f2);
            return this;
        }
    }

    static {
        LightingRenderingInfo lightingRenderingInfo = new LightingRenderingInfo();
        DEFAULT_INSTANCE = lightingRenderingInfo;
        du.registerDefaultInstance(LightingRenderingInfo.class, lightingRenderingInfo);
    }

    private LightingRenderingInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmbientIntensity() {
        this.ambientIntensity_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiffuseIntensity() {
        this.diffuseIntensity_ = 0.0f;
    }

    public static LightingRenderingInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LightingRenderingInfo parseDelimitedFrom(InputStream inputStream) {
        return (LightingRenderingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LightingRenderingInfo parseFrom(v vVar) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<LightingRenderingInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmbientIntensity(float f2) {
        this.ambientIntensity_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiffuseIntensity(float f2) {
        this.diffuseIntensity_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"ambientIntensity_", "diffuseIntensity_"});
        }
        if (iOrdinal == 3) {
            return new LightingRenderingInfo();
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
        fo<LightingRenderingInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (LightingRenderingInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.copilot.data.LightingRenderingInfoOrBuilder
    public float getAmbientIntensity() {
        return this.ambientIntensity_;
    }

    @Override // com.waze.jni.protos.copilot.data.LightingRenderingInfoOrBuilder
    public float getDiffuseIntensity() {
        return this.diffuseIntensity_;
    }

    public static Builder newBuilder(LightingRenderingInfo lightingRenderingInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(lightingRenderingInfo);
    }

    public static LightingRenderingInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (LightingRenderingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LightingRenderingInfo parseFrom(v vVar, de deVar) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static LightingRenderingInfo parseFrom(z zVar) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static LightingRenderingInfo parseFrom(z zVar, de deVar) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static LightingRenderingInfo parseFrom(InputStream inputStream) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LightingRenderingInfo parseFrom(InputStream inputStream, de deVar) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LightingRenderingInfo parseFrom(ByteBuffer byteBuffer) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LightingRenderingInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static LightingRenderingInfo parseFrom(byte[] bArr) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LightingRenderingInfo parseFrom(byte[] bArr, de deVar) {
        return (LightingRenderingInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
