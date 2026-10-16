package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.NativeBitmap;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeBitmapWithAlignment extends du<NativeBitmapWithAlignment, Builder> implements NativeBitmapWithAlignmentOrBuilder {
    public static final int ALIGNMENT_FIELD_NUMBER = 1;
    public static final int BITMAP_FIELD_NUMBER = 2;
    private static final NativeBitmapWithAlignment DEFAULT_INSTANCE;
    private static volatile fo<NativeBitmapWithAlignment> PARSER;
    private int alignment_;
    private int bitField0_;
    private NativeBitmap bitmap_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.NativeBitmapWithAlignment$1, reason: invalid class name */
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
        NativeBitmapWithAlignment nativeBitmapWithAlignment = new NativeBitmapWithAlignment();
        DEFAULT_INSTANCE = nativeBitmapWithAlignment;
        du.registerDefaultInstance(NativeBitmapWithAlignment.class, nativeBitmapWithAlignment);
    }

    private NativeBitmapWithAlignment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlignment() {
        this.alignment_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitmap() {
        this.bitmap_ = null;
        this.bitField0_ &= -2;
    }

    public static NativeBitmapWithAlignment getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBitmap(NativeBitmap nativeBitmap) {
        Objects.requireNonNull(nativeBitmap);
        NativeBitmap nativeBitmap2 = this.bitmap_;
        if (nativeBitmap2 != null && nativeBitmap2 != NativeBitmap.getDefaultInstance()) {
            NativeBitmap.Builder builderNewBuilder = NativeBitmap.newBuilder(nativeBitmap2);
            builderNewBuilder.mergeFrom((NativeBitmap.Builder) nativeBitmap);
            nativeBitmap = builderNewBuilder.buildPartial();
        }
        this.bitmap_ = nativeBitmap;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NativeBitmapWithAlignment parseDelimitedFrom(InputStream inputStream) {
        return (NativeBitmapWithAlignment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeBitmapWithAlignment parseFrom(v vVar) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NativeBitmapWithAlignment> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlignment(EtaLabelDefinitions.PinAlignment pinAlignment) {
        this.alignment_ = pinAlignment.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlignmentValue(int i2) {
        this.alignment_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmap(NativeBitmap nativeBitmap) {
        Objects.requireNonNull(nativeBitmap);
        this.bitmap_ = nativeBitmap;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "alignment_", "bitmap_"});
        }
        if (iOrdinal == 3) {
            return new NativeBitmapWithAlignment();
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
        fo<NativeBitmapWithAlignment> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NativeBitmapWithAlignment.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
    public EtaLabelDefinitions.PinAlignment getAlignment() {
        EtaLabelDefinitions.PinAlignment pinAlignmentForNumber = EtaLabelDefinitions.PinAlignment.forNumber(this.alignment_);
        return pinAlignmentForNumber == null ? EtaLabelDefinitions.PinAlignment.UNRECOGNIZED : pinAlignmentForNumber;
    }

    @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
    public int getAlignmentValue() {
        return this.alignment_;
    }

    @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
    public NativeBitmap getBitmap() {
        NativeBitmap nativeBitmap = this.bitmap_;
        return nativeBitmap == null ? NativeBitmap.getDefaultInstance() : nativeBitmap;
    }

    @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
    public boolean hasBitmap() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NativeBitmapWithAlignment nativeBitmapWithAlignment) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeBitmapWithAlignment);
    }

    public static NativeBitmapWithAlignment parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NativeBitmapWithAlignment) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeBitmapWithAlignment parseFrom(v vVar, de deVar) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NativeBitmapWithAlignment parseFrom(z zVar) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NativeBitmapWithAlignment parseFrom(z zVar, de deVar) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static NativeBitmapWithAlignment parseFrom(InputStream inputStream) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeBitmapWithAlignment parseFrom(InputStream inputStream, de deVar) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NativeBitmapWithAlignment parseFrom(ByteBuffer byteBuffer) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeBitmapWithAlignment parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NativeBitmapWithAlignment, Builder> implements NativeBitmapWithAlignmentOrBuilder {
        private Builder() {
            super(NativeBitmapWithAlignment.DEFAULT_INSTANCE);
        }

        public Builder clearAlignment() {
            copyOnWrite();
            ((NativeBitmapWithAlignment) this.instance).clearAlignment();
            return this;
        }

        public Builder clearBitmap() {
            copyOnWrite();
            ((NativeBitmapWithAlignment) this.instance).clearBitmap();
            return this;
        }

        @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
        public EtaLabelDefinitions.PinAlignment getAlignment() {
            return ((NativeBitmapWithAlignment) this.instance).getAlignment();
        }

        @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
        public int getAlignmentValue() {
            return ((NativeBitmapWithAlignment) this.instance).getAlignmentValue();
        }

        @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
        public NativeBitmap getBitmap() {
            return ((NativeBitmapWithAlignment) this.instance).getBitmap();
        }

        @Override // com.waze.jni.protos.NativeBitmapWithAlignmentOrBuilder
        public boolean hasBitmap() {
            return ((NativeBitmapWithAlignment) this.instance).hasBitmap();
        }

        public Builder mergeBitmap(NativeBitmap nativeBitmap) {
            copyOnWrite();
            ((NativeBitmapWithAlignment) this.instance).mergeBitmap(nativeBitmap);
            return this;
        }

        public Builder setAlignment(EtaLabelDefinitions.PinAlignment pinAlignment) {
            copyOnWrite();
            ((NativeBitmapWithAlignment) this.instance).setAlignment(pinAlignment);
            return this;
        }

        public Builder setAlignmentValue(int i2) {
            copyOnWrite();
            ((NativeBitmapWithAlignment) this.instance).setAlignmentValue(i2);
            return this;
        }

        public Builder setBitmap(NativeBitmap.Builder builder) {
            copyOnWrite();
            ((NativeBitmapWithAlignment) this.instance).setBitmap(builder.build());
            return this;
        }

        public Builder setBitmap(NativeBitmap nativeBitmap) {
            copyOnWrite();
            ((NativeBitmapWithAlignment) this.instance).setBitmap(nativeBitmap);
            return this;
        }
    }

    public static NativeBitmapWithAlignment parseFrom(byte[] bArr) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeBitmapWithAlignment parseFrom(byte[] bArr, de deVar) {
        return (NativeBitmapWithAlignment) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
