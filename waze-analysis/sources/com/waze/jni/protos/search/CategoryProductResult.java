package com.waze.jni.protos.search;

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
public final class CategoryProductResult extends du<CategoryProductResult, Builder> implements CategoryProductResultOrBuilder {
    private static final CategoryProductResult DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LABEL_FIELD_NUMBER = 2;
    private static volatile fo<CategoryProductResult> PARSER = null;
    public static final int PRICE_FORMAT_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String id_ = "";
    private String label_ = "";
    private String type_ = "";
    private String priceFormat_ = "";
    private String icon_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.search.CategoryProductResult$1, reason: invalid class name */
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
    public final class Builder extends dm<CategoryProductResult, Builder> implements CategoryProductResultOrBuilder {
        private Builder() {
            super(CategoryProductResult.DEFAULT_INSTANCE);
        }

        public Builder clearIcon() {
            copyOnWrite();
            ((CategoryProductResult) this.instance).clearIcon();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((CategoryProductResult) this.instance).clearId();
            return this;
        }

        public Builder clearLabel() {
            copyOnWrite();
            ((CategoryProductResult) this.instance).clearLabel();
            return this;
        }

        public Builder clearPriceFormat() {
            copyOnWrite();
            ((CategoryProductResult) this.instance).clearPriceFormat();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((CategoryProductResult) this.instance).clearType();
            return this;
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public String getIcon() {
            return ((CategoryProductResult) this.instance).getIcon();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public v getIconBytes() {
            return ((CategoryProductResult) this.instance).getIconBytes();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public String getId() {
            return ((CategoryProductResult) this.instance).getId();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public v getIdBytes() {
            return ((CategoryProductResult) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public String getLabel() {
            return ((CategoryProductResult) this.instance).getLabel();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public v getLabelBytes() {
            return ((CategoryProductResult) this.instance).getLabelBytes();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public String getPriceFormat() {
            return ((CategoryProductResult) this.instance).getPriceFormat();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public v getPriceFormatBytes() {
            return ((CategoryProductResult) this.instance).getPriceFormatBytes();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public String getType() {
            return ((CategoryProductResult) this.instance).getType();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public v getTypeBytes() {
            return ((CategoryProductResult) this.instance).getTypeBytes();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public boolean hasIcon() {
            return ((CategoryProductResult) this.instance).hasIcon();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public boolean hasId() {
            return ((CategoryProductResult) this.instance).hasId();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public boolean hasLabel() {
            return ((CategoryProductResult) this.instance).hasLabel();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public boolean hasPriceFormat() {
            return ((CategoryProductResult) this.instance).hasPriceFormat();
        }

        @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
        public boolean hasType() {
            return ((CategoryProductResult) this.instance).hasType();
        }

        public Builder setIcon(String str) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setIcon(str);
            return this;
        }

        public Builder setIconBytes(v vVar) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setIconBytes(vVar);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setLabel(String str) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setLabel(str);
            return this;
        }

        public Builder setLabelBytes(v vVar) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setLabelBytes(vVar);
            return this;
        }

        public Builder setPriceFormat(String str) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setPriceFormat(str);
            return this;
        }

        public Builder setPriceFormatBytes(v vVar) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setPriceFormatBytes(vVar);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(v vVar) {
            copyOnWrite();
            ((CategoryProductResult) this.instance).setTypeBytes(vVar);
            return this;
        }
    }

    static {
        CategoryProductResult categoryProductResult = new CategoryProductResult();
        DEFAULT_INSTANCE = categoryProductResult;
        du.registerDefaultInstance(CategoryProductResult.class, categoryProductResult);
    }

    private CategoryProductResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIcon() {
        this.bitField0_ &= -17;
        this.icon_ = getDefaultInstance().getIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -3;
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceFormat() {
        this.bitField0_ &= -9;
        this.priceFormat_ = getDefaultInstance().getPriceFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -5;
        this.type_ = getDefaultInstance().getType();
    }

    public static CategoryProductResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CategoryProductResult parseDelimitedFrom(InputStream inputStream) {
        return (CategoryProductResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CategoryProductResult parseFrom(v vVar) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CategoryProductResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.icon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIconBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.icon_ = vVar.u();
        this.bitField0_ |= 16;
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
    public void setLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.label_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceFormat(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.priceFormat_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceFormatBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.priceFormat_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.type_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "id_", "label_", "type_", "priceFormat_", "icon_"});
        }
        if (iOrdinal == 3) {
            return new CategoryProductResult();
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
        fo<CategoryProductResult> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CategoryProductResult.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public String getIcon() {
        return this.icon_;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public v getIconBytes() {
        return v.s(this.icon_);
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public String getLabel() {
        return this.label_;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public v getLabelBytes() {
        return v.s(this.label_);
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public String getPriceFormat() {
        return this.priceFormat_;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public v getPriceFormatBytes() {
        return v.s(this.priceFormat_);
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public v getTypeBytes() {
        return v.s(this.type_);
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public boolean hasIcon() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public boolean hasLabel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public boolean hasPriceFormat() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.search.CategoryProductResultOrBuilder
    public boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static Builder newBuilder(CategoryProductResult categoryProductResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(categoryProductResult);
    }

    public static CategoryProductResult parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CategoryProductResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CategoryProductResult parseFrom(v vVar, de deVar) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CategoryProductResult parseFrom(z zVar) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CategoryProductResult parseFrom(z zVar, de deVar) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static CategoryProductResult parseFrom(InputStream inputStream) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CategoryProductResult parseFrom(InputStream inputStream, de deVar) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CategoryProductResult parseFrom(ByteBuffer byteBuffer) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CategoryProductResult parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static CategoryProductResult parseFrom(byte[] bArr) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CategoryProductResult parseFrom(byte[] bArr, de deVar) {
        return (CategoryProductResult) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
