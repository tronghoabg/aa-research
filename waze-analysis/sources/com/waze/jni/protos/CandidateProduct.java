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
public final class CandidateProduct extends du<CandidateProduct, Builder> implements CandidateProductOrBuilder {
    private static final CandidateProduct DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_FIELD_NUMBER = 3;
    private static volatile fo<CandidateProduct> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 2;
    public static final int UPDATED_BY_FIELD_NUMBER = 4;
    private int bitField0_;
    private long lastUpdated_;
    private float price_;
    private String id_ = "";
    private String updatedBy_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.CandidateProduct$1, reason: invalid class name */
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
    public final class Builder extends dm<CandidateProduct, Builder> implements CandidateProductOrBuilder {
        private Builder() {
            super(CandidateProduct.DEFAULT_INSTANCE);
        }

        public Builder clearId() {
            copyOnWrite();
            ((CandidateProduct) this.instance).clearId();
            return this;
        }

        public Builder clearLastUpdated() {
            copyOnWrite();
            ((CandidateProduct) this.instance).clearLastUpdated();
            return this;
        }

        public Builder clearPrice() {
            copyOnWrite();
            ((CandidateProduct) this.instance).clearPrice();
            return this;
        }

        public Builder clearUpdatedBy() {
            copyOnWrite();
            ((CandidateProduct) this.instance).clearUpdatedBy();
            return this;
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public String getId() {
            return ((CandidateProduct) this.instance).getId();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public v getIdBytes() {
            return ((CandidateProduct) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public long getLastUpdated() {
            return ((CandidateProduct) this.instance).getLastUpdated();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public float getPrice() {
            return ((CandidateProduct) this.instance).getPrice();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public String getUpdatedBy() {
            return ((CandidateProduct) this.instance).getUpdatedBy();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public v getUpdatedByBytes() {
            return ((CandidateProduct) this.instance).getUpdatedByBytes();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public boolean hasId() {
            return ((CandidateProduct) this.instance).hasId();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public boolean hasLastUpdated() {
            return ((CandidateProduct) this.instance).hasLastUpdated();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public boolean hasPrice() {
            return ((CandidateProduct) this.instance).hasPrice();
        }

        @Override // com.waze.jni.protos.CandidateProductOrBuilder
        public boolean hasUpdatedBy() {
            return ((CandidateProduct) this.instance).hasUpdatedBy();
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((CandidateProduct) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((CandidateProduct) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setLastUpdated(long j2) {
            copyOnWrite();
            ((CandidateProduct) this.instance).setLastUpdated(j2);
            return this;
        }

        public Builder setPrice(float f2) {
            copyOnWrite();
            ((CandidateProduct) this.instance).setPrice(f2);
            return this;
        }

        public Builder setUpdatedBy(String str) {
            copyOnWrite();
            ((CandidateProduct) this.instance).setUpdatedBy(str);
            return this;
        }

        public Builder setUpdatedByBytes(v vVar) {
            copyOnWrite();
            ((CandidateProduct) this.instance).setUpdatedByBytes(vVar);
            return this;
        }
    }

    static {
        CandidateProduct candidateProduct = new CandidateProduct();
        DEFAULT_INSTANCE = candidateProduct;
        du.registerDefaultInstance(CandidateProduct.class, candidateProduct);
    }

    private CandidateProduct() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdated() {
        this.bitField0_ &= -5;
        this.lastUpdated_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.bitField0_ &= -3;
        this.price_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedBy() {
        this.bitField0_ &= -9;
        this.updatedBy_ = getDefaultInstance().getUpdatedBy();
    }

    public static CandidateProduct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CandidateProduct parseDelimitedFrom(InputStream inputStream) {
        return (CandidateProduct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandidateProduct parseFrom(v vVar) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CandidateProduct> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdated(long j2) {
        this.bitField0_ |= 4;
        this.lastUpdated_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(float f2) {
        this.bitField0_ |= 2;
        this.price_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedBy(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.updatedBy_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedByBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.updatedBy_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "id_", "price_", "lastUpdated_", "updatedBy_"});
        }
        if (iOrdinal == 3) {
            return new CandidateProduct();
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
        fo<CandidateProduct> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CandidateProduct.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public long getLastUpdated() {
        return this.lastUpdated_;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public float getPrice() {
        return this.price_;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public String getUpdatedBy() {
        return this.updatedBy_;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public v getUpdatedByBytes() {
        return v.s(this.updatedBy_);
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public boolean hasLastUpdated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public boolean hasPrice() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.CandidateProductOrBuilder
    public boolean hasUpdatedBy() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(CandidateProduct candidateProduct) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(candidateProduct);
    }

    public static CandidateProduct parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CandidateProduct) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CandidateProduct parseFrom(v vVar, de deVar) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CandidateProduct parseFrom(z zVar) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CandidateProduct parseFrom(z zVar, de deVar) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CandidateProduct parseFrom(InputStream inputStream) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CandidateProduct parseFrom(InputStream inputStream, de deVar) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CandidateProduct parseFrom(ByteBuffer byteBuffer) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CandidateProduct parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static CandidateProduct parseFrom(byte[] bArr) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CandidateProduct parseFrom(byte[] bArr, de deVar) {
        return (CandidateProduct) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
