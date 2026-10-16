package com.waze.jni.protos.map;

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
public final class RelativeViewPort extends du<RelativeViewPort, Builder> implements RelativeViewPortOrBuilder {
    private static final RelativeViewPort DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int OFFSET_X_FIELD_NUMBER = 3;
    public static final int OFFSET_Y_FIELD_NUMBER = 4;
    private static volatile fo<RelativeViewPort> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private float height_;
    private float offsetX_;
    private float offsetY_;
    private float width_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.map.RelativeViewPort$1, reason: invalid class name */
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
    public final class Builder extends dm<RelativeViewPort, Builder> implements RelativeViewPortOrBuilder {
        private Builder() {
            super(RelativeViewPort.DEFAULT_INSTANCE);
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((RelativeViewPort) this.instance).clearHeight();
            return this;
        }

        public Builder clearOffsetX() {
            copyOnWrite();
            ((RelativeViewPort) this.instance).clearOffsetX();
            return this;
        }

        public Builder clearOffsetY() {
            copyOnWrite();
            ((RelativeViewPort) this.instance).clearOffsetY();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((RelativeViewPort) this.instance).clearWidth();
            return this;
        }

        @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
        public float getHeight() {
            return ((RelativeViewPort) this.instance).getHeight();
        }

        @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
        public float getOffsetX() {
            return ((RelativeViewPort) this.instance).getOffsetX();
        }

        @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
        public float getOffsetY() {
            return ((RelativeViewPort) this.instance).getOffsetY();
        }

        @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
        public float getWidth() {
            return ((RelativeViewPort) this.instance).getWidth();
        }

        public Builder setHeight(float f2) {
            copyOnWrite();
            ((RelativeViewPort) this.instance).setHeight(f2);
            return this;
        }

        public Builder setOffsetX(float f2) {
            copyOnWrite();
            ((RelativeViewPort) this.instance).setOffsetX(f2);
            return this;
        }

        public Builder setOffsetY(float f2) {
            copyOnWrite();
            ((RelativeViewPort) this.instance).setOffsetY(f2);
            return this;
        }

        public Builder setWidth(float f2) {
            copyOnWrite();
            ((RelativeViewPort) this.instance).setWidth(f2);
            return this;
        }
    }

    static {
        RelativeViewPort relativeViewPort = new RelativeViewPort();
        DEFAULT_INSTANCE = relativeViewPort;
        du.registerDefaultInstance(RelativeViewPort.class, relativeViewPort);
    }

    private RelativeViewPort() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffsetX() {
        this.offsetX_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffsetY() {
        this.offsetY_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0.0f;
    }

    public static RelativeViewPort getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RelativeViewPort parseDelimitedFrom(InputStream inputStream) {
        return (RelativeViewPort) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelativeViewPort parseFrom(v vVar) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RelativeViewPort> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(float f2) {
        this.height_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffsetX(float f2) {
        this.offsetX_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffsetY(float f2) {
        this.offsetY_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(float f2) {
        this.width_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"width_", "height_", "offsetX_", "offsetY_"});
        }
        if (iOrdinal == 3) {
            return new RelativeViewPort();
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
        fo<RelativeViewPort> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RelativeViewPort.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
    public float getHeight() {
        return this.height_;
    }

    @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
    public float getOffsetX() {
        return this.offsetX_;
    }

    @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
    public float getOffsetY() {
        return this.offsetY_;
    }

    @Override // com.waze.jni.protos.map.RelativeViewPortOrBuilder
    public float getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(RelativeViewPort relativeViewPort) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(relativeViewPort);
    }

    public static RelativeViewPort parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RelativeViewPort) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RelativeViewPort parseFrom(v vVar, de deVar) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RelativeViewPort parseFrom(z zVar) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RelativeViewPort parseFrom(z zVar, de deVar) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RelativeViewPort parseFrom(InputStream inputStream) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RelativeViewPort parseFrom(InputStream inputStream, de deVar) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RelativeViewPort parseFrom(ByteBuffer byteBuffer) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RelativeViewPort parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RelativeViewPort parseFrom(byte[] bArr) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RelativeViewPort parseFrom(byte[] bArr, de deVar) {
        return (RelativeViewPort) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
