package com.waze.jni.protos;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.NativeBitmapWithAlignment;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelResponse extends du<EtaLabelResponse, Builder> implements EtaLabelResponseOrBuilder {
    private static final EtaLabelResponse DEFAULT_INSTANCE;
    public static final int NATIVE_BITMAPS_FIELD_NUMBER = 2;
    private static volatile fo<EtaLabelResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private eo<NativeBitmapWithAlignment> nativeBitmaps_ = emptyProtobufList();
    private int requestId_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.EtaLabelResponse$1, reason: invalid class name */
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
        EtaLabelResponse etaLabelResponse = new EtaLabelResponse();
        DEFAULT_INSTANCE = etaLabelResponse;
        du.registerDefaultInstance(EtaLabelResponse.class, etaLabelResponse);
    }

    private EtaLabelResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNativeBitmaps(Iterable<? extends NativeBitmapWithAlignment> iterable) {
        ensureNativeBitmapsIsMutable();
        c.addAll(iterable, this.nativeBitmaps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNativeBitmaps(int i2, NativeBitmapWithAlignment nativeBitmapWithAlignment) {
        Objects.requireNonNull(nativeBitmapWithAlignment);
        ensureNativeBitmapsIsMutable();
        this.nativeBitmaps_.add(i2, nativeBitmapWithAlignment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNativeBitmaps() {
        this.nativeBitmaps_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = 0;
    }

    private void ensureNativeBitmapsIsMutable() {
        eo<NativeBitmapWithAlignment> eoVar = this.nativeBitmaps_;
        if (eoVar.c()) {
            return;
        }
        this.nativeBitmaps_ = du.mutableCopy(eoVar);
    }

    public static EtaLabelResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EtaLabelResponse parseDelimitedFrom(InputStream inputStream) {
        return (EtaLabelResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelResponse parseFrom(v vVar) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<EtaLabelResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNativeBitmaps(int i2) {
        ensureNativeBitmapsIsMutable();
        this.nativeBitmaps_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeBitmaps(int i2, NativeBitmapWithAlignment nativeBitmapWithAlignment) {
        Objects.requireNonNull(nativeBitmapWithAlignment);
        ensureNativeBitmapsIsMutable();
        this.nativeBitmaps_.set(i2, nativeBitmapWithAlignment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(int i2) {
        this.requestId_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"requestId_", "nativeBitmaps_", NativeBitmapWithAlignment.class});
        }
        if (iOrdinal == 3) {
            return new EtaLabelResponse();
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
        fo<EtaLabelResponse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (EtaLabelResponse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
    public NativeBitmapWithAlignment getNativeBitmaps(int i2) {
        return this.nativeBitmaps_.get(i2);
    }

    @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
    public int getNativeBitmapsCount() {
        return this.nativeBitmaps_.size();
    }

    @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
    public List<NativeBitmapWithAlignment> getNativeBitmapsList() {
        return this.nativeBitmaps_;
    }

    public NativeBitmapWithAlignmentOrBuilder getNativeBitmapsOrBuilder(int i2) {
        return this.nativeBitmaps_.get(i2);
    }

    public List<? extends NativeBitmapWithAlignmentOrBuilder> getNativeBitmapsOrBuilderList() {
        return this.nativeBitmaps_;
    }

    @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
    public int getRequestId() {
        return this.requestId_;
    }

    public static Builder newBuilder(EtaLabelResponse etaLabelResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(etaLabelResponse);
    }

    public static EtaLabelResponse parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (EtaLabelResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelResponse parseFrom(v vVar, de deVar) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static EtaLabelResponse parseFrom(z zVar) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static EtaLabelResponse parseFrom(z zVar, de deVar) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNativeBitmaps(NativeBitmapWithAlignment nativeBitmapWithAlignment) {
        Objects.requireNonNull(nativeBitmapWithAlignment);
        ensureNativeBitmapsIsMutable();
        this.nativeBitmaps_.add(nativeBitmapWithAlignment);
    }

    public static EtaLabelResponse parseFrom(InputStream inputStream) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EtaLabelResponse parseFrom(InputStream inputStream, de deVar) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static EtaLabelResponse parseFrom(ByteBuffer byteBuffer) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static EtaLabelResponse parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<EtaLabelResponse, Builder> implements EtaLabelResponseOrBuilder {
        private Builder() {
            super(EtaLabelResponse.DEFAULT_INSTANCE);
        }

        public Builder addAllNativeBitmaps(Iterable<? extends NativeBitmapWithAlignment> iterable) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).addAllNativeBitmaps(iterable);
            return this;
        }

        public Builder addNativeBitmaps(int i2, NativeBitmapWithAlignment.Builder builder) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).addNativeBitmaps(i2, builder.build());
            return this;
        }

        public Builder clearNativeBitmaps() {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).clearNativeBitmaps();
            return this;
        }

        public Builder clearRequestId() {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).clearRequestId();
            return this;
        }

        @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
        public NativeBitmapWithAlignment getNativeBitmaps(int i2) {
            return ((EtaLabelResponse) this.instance).getNativeBitmaps(i2);
        }

        @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
        public int getNativeBitmapsCount() {
            return ((EtaLabelResponse) this.instance).getNativeBitmapsCount();
        }

        @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
        public List<NativeBitmapWithAlignment> getNativeBitmapsList() {
            return DesugarCollections.unmodifiableList(((EtaLabelResponse) this.instance).getNativeBitmapsList());
        }

        @Override // com.waze.jni.protos.EtaLabelResponseOrBuilder
        public int getRequestId() {
            return ((EtaLabelResponse) this.instance).getRequestId();
        }

        public Builder removeNativeBitmaps(int i2) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).removeNativeBitmaps(i2);
            return this;
        }

        public Builder setNativeBitmaps(int i2, NativeBitmapWithAlignment.Builder builder) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).setNativeBitmaps(i2, builder.build());
            return this;
        }

        public Builder setRequestId(int i2) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).setRequestId(i2);
            return this;
        }

        public Builder addNativeBitmaps(int i2, NativeBitmapWithAlignment nativeBitmapWithAlignment) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).addNativeBitmaps(i2, nativeBitmapWithAlignment);
            return this;
        }

        public Builder setNativeBitmaps(int i2, NativeBitmapWithAlignment nativeBitmapWithAlignment) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).setNativeBitmaps(i2, nativeBitmapWithAlignment);
            return this;
        }

        public Builder addNativeBitmaps(NativeBitmapWithAlignment.Builder builder) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).addNativeBitmaps(builder.build());
            return this;
        }

        public Builder addNativeBitmaps(NativeBitmapWithAlignment nativeBitmapWithAlignment) {
            copyOnWrite();
            ((EtaLabelResponse) this.instance).addNativeBitmaps(nativeBitmapWithAlignment);
            return this;
        }
    }

    public static EtaLabelResponse parseFrom(byte[] bArr) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EtaLabelResponse parseFrom(byte[] bArr, de deVar) {
        return (EtaLabelResponse) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
