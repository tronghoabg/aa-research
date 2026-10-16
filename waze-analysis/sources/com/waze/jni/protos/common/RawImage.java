package com.waze.jni.protos.common;

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
public final class RawImage extends du<RawImage, Builder> implements RawImageOrBuilder {
    public static final int DATA_FIELD_NUMBER = 3;
    private static final RawImage DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static volatile fo<RawImage> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private v data_ = v.f13054a;
    private int height_;
    private int width_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.common.RawImage$1, reason: invalid class name */
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
    public final class Builder extends dm<RawImage, Builder> implements RawImageOrBuilder {
        private Builder() {
            super(RawImage.DEFAULT_INSTANCE);
        }

        public Builder clearData() {
            copyOnWrite();
            ((RawImage) this.instance).clearData();
            return this;
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((RawImage) this.instance).clearHeight();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((RawImage) this.instance).clearWidth();
            return this;
        }

        @Override // com.waze.jni.protos.common.RawImageOrBuilder
        public v getData() {
            return ((RawImage) this.instance).getData();
        }

        @Override // com.waze.jni.protos.common.RawImageOrBuilder
        public int getHeight() {
            return ((RawImage) this.instance).getHeight();
        }

        @Override // com.waze.jni.protos.common.RawImageOrBuilder
        public int getWidth() {
            return ((RawImage) this.instance).getWidth();
        }

        public Builder setData(v vVar) {
            copyOnWrite();
            ((RawImage) this.instance).setData(vVar);
            return this;
        }

        public Builder setHeight(int i2) {
            copyOnWrite();
            ((RawImage) this.instance).setHeight(i2);
            return this;
        }

        public Builder setWidth(int i2) {
            copyOnWrite();
            ((RawImage) this.instance).setWidth(i2);
            return this;
        }
    }

    static {
        RawImage rawImage = new RawImage();
        DEFAULT_INSTANCE = rawImage;
        du.registerDefaultInstance(RawImage.class, rawImage);
    }

    private RawImage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static RawImage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static RawImage parseDelimitedFrom(InputStream inputStream) {
        return (RawImage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RawImage parseFrom(v vVar) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<RawImage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(v vVar) {
        Objects.requireNonNull(vVar);
        this.data_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i2) {
        this.height_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i2) {
        this.width_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\n", new Object[]{"width_", "height_", "data_"});
        }
        if (iOrdinal == 3) {
            return new RawImage();
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
        fo<RawImage> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (RawImage.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.common.RawImageOrBuilder
    public v getData() {
        return this.data_;
    }

    @Override // com.waze.jni.protos.common.RawImageOrBuilder
    public int getHeight() {
        return this.height_;
    }

    @Override // com.waze.jni.protos.common.RawImageOrBuilder
    public int getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(RawImage rawImage) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(rawImage);
    }

    public static RawImage parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (RawImage) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RawImage parseFrom(v vVar, de deVar) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static RawImage parseFrom(z zVar) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static RawImage parseFrom(z zVar, de deVar) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static RawImage parseFrom(InputStream inputStream) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RawImage parseFrom(InputStream inputStream, de deVar) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static RawImage parseFrom(ByteBuffer byteBuffer) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static RawImage parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static RawImage parseFrom(byte[] bArr) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RawImage parseFrom(byte[] bArr, de deVar) {
        return (RawImage) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
