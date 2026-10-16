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
public final class NativeBitmap extends du<NativeBitmap, Builder> implements NativeBitmapOrBuilder {
    public static final int BITMAP_BYTES_FIELD_NUMBER = 1;
    private static final NativeBitmap DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile fo<NativeBitmap> PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private v bitmapBytes_ = v.f13054a;
    private int height_;
    private int width_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.NativeBitmap$1, reason: invalid class name */
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
    public final class Builder extends dm<NativeBitmap, Builder> implements NativeBitmapOrBuilder {
        private Builder() {
            super(NativeBitmap.DEFAULT_INSTANCE);
        }

        public Builder clearBitmapBytes() {
            copyOnWrite();
            ((NativeBitmap) this.instance).clearBitmapBytes();
            return this;
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((NativeBitmap) this.instance).clearHeight();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((NativeBitmap) this.instance).clearWidth();
            return this;
        }

        @Override // com.waze.jni.protos.NativeBitmapOrBuilder
        public v getBitmapBytes() {
            return ((NativeBitmap) this.instance).getBitmapBytes();
        }

        @Override // com.waze.jni.protos.NativeBitmapOrBuilder
        public int getHeight() {
            return ((NativeBitmap) this.instance).getHeight();
        }

        @Override // com.waze.jni.protos.NativeBitmapOrBuilder
        public int getWidth() {
            return ((NativeBitmap) this.instance).getWidth();
        }

        public Builder setBitmapBytes(v vVar) {
            copyOnWrite();
            ((NativeBitmap) this.instance).setBitmapBytes(vVar);
            return this;
        }

        public Builder setHeight(int i2) {
            copyOnWrite();
            ((NativeBitmap) this.instance).setHeight(i2);
            return this;
        }

        public Builder setWidth(int i2) {
            copyOnWrite();
            ((NativeBitmap) this.instance).setWidth(i2);
            return this;
        }
    }

    static {
        NativeBitmap nativeBitmap = new NativeBitmap();
        DEFAULT_INSTANCE = nativeBitmap;
        du.registerDefaultInstance(NativeBitmap.class, nativeBitmap);
    }

    private NativeBitmap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitmapBytes() {
        this.bitmapBytes_ = getDefaultInstance().getBitmapBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static NativeBitmap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeBitmap parseDelimitedFrom(InputStream inputStream) {
        return (NativeBitmap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeBitmap parseFrom(v vVar) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NativeBitmap> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmapBytes(v vVar) {
        Objects.requireNonNull(vVar);
        this.bitmapBytes_ = vVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004", new Object[]{"bitmapBytes_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new NativeBitmap();
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
        fo<NativeBitmap> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NativeBitmap.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.NativeBitmapOrBuilder
    public v getBitmapBytes() {
        return this.bitmapBytes_;
    }

    @Override // com.waze.jni.protos.NativeBitmapOrBuilder
    public int getHeight() {
        return this.height_;
    }

    @Override // com.waze.jni.protos.NativeBitmapOrBuilder
    public int getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(NativeBitmap nativeBitmap) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeBitmap);
    }

    public static NativeBitmap parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NativeBitmap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeBitmap parseFrom(v vVar, de deVar) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NativeBitmap parseFrom(z zVar) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NativeBitmap parseFrom(z zVar, de deVar) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NativeBitmap parseFrom(InputStream inputStream) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeBitmap parseFrom(InputStream inputStream, de deVar) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeBitmap parseFrom(ByteBuffer byteBuffer) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeBitmap parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static NativeBitmap parseFrom(byte[] bArr) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeBitmap parseFrom(byte[] bArr, de deVar) {
        return (NativeBitmap) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
