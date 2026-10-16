package com.waze.jni.protos;

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
public final class LightingInfo extends du<LightingInfo, Builder> implements LightingInfoOrBuilder {
    public static final int AMBIENT_INTENSITY_FIELD_NUMBER = 1;
    private static final LightingInfo DEFAULT_INSTANCE;
    public static final int DIFFUSE_INTENSITY_FIELD_NUMBER = 2;
    private static volatile fo<LightingInfo> PARSER;
    private float ambientIntensity_;
    private float diffuseIntensity_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.LightingInfo$1, reason: invalid class name */
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
    public final class Builder extends dm<LightingInfo, Builder> implements LightingInfoOrBuilder {
        private Builder() {
            super(LightingInfo.DEFAULT_INSTANCE);
        }

        public Builder clearAmbientIntensity() {
            copyOnWrite();
            ((LightingInfo) this.instance).clearAmbientIntensity();
            return this;
        }

        public Builder clearDiffuseIntensity() {
            copyOnWrite();
            ((LightingInfo) this.instance).clearDiffuseIntensity();
            return this;
        }

        @Override // com.waze.jni.protos.LightingInfoOrBuilder
        public float getAmbientIntensity() {
            return ((LightingInfo) this.instance).getAmbientIntensity();
        }

        @Override // com.waze.jni.protos.LightingInfoOrBuilder
        public float getDiffuseIntensity() {
            return ((LightingInfo) this.instance).getDiffuseIntensity();
        }

        public Builder setAmbientIntensity(float f2) {
            copyOnWrite();
            ((LightingInfo) this.instance).setAmbientIntensity(f2);
            return this;
        }

        public Builder setDiffuseIntensity(float f2) {
            copyOnWrite();
            ((LightingInfo) this.instance).setDiffuseIntensity(f2);
            return this;
        }
    }

    static {
        LightingInfo lightingInfo = new LightingInfo();
        DEFAULT_INSTANCE = lightingInfo;
        du.registerDefaultInstance(LightingInfo.class, lightingInfo);
    }

    private LightingInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAmbientIntensity() {
        this.ambientIntensity_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiffuseIntensity() {
        this.diffuseIntensity_ = 0.0f;
    }

    public static LightingInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static LightingInfo parseDelimitedFrom(InputStream inputStream) {
        return (LightingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LightingInfo parseFrom(v vVar) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<LightingInfo> parser() {
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
            return new LightingInfo();
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
        fo<LightingInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (LightingInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.LightingInfoOrBuilder
    public float getAmbientIntensity() {
        return this.ambientIntensity_;
    }

    @Override // com.waze.jni.protos.LightingInfoOrBuilder
    public float getDiffuseIntensity() {
        return this.diffuseIntensity_;
    }

    public static Builder newBuilder(LightingInfo lightingInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(lightingInfo);
    }

    public static LightingInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (LightingInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LightingInfo parseFrom(v vVar, de deVar) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static LightingInfo parseFrom(z zVar) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static LightingInfo parseFrom(z zVar, de deVar) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static LightingInfo parseFrom(InputStream inputStream) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LightingInfo parseFrom(InputStream inputStream, de deVar) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static LightingInfo parseFrom(ByteBuffer byteBuffer) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static LightingInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static LightingInfo parseFrom(byte[] bArr) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LightingInfo parseFrom(byte[] bArr, de deVar) {
        return (LightingInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
