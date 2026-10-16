package com.waze.jni.protos.search;

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
import com.waze.jni.protos.search.CategoryProductResult;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CategoryProductsResult extends du<CategoryProductsResult, Builder> implements CategoryProductsResultOrBuilder {
    private static final CategoryProductsResult DEFAULT_INSTANCE;
    private static volatile fo<CategoryProductsResult> PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 1;
    private eo<CategoryProductResult> product_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.search.CategoryProductsResult$1, reason: invalid class name */
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
        CategoryProductsResult categoryProductsResult = new CategoryProductsResult();
        DEFAULT_INSTANCE = categoryProductsResult;
        du.registerDefaultInstance(CategoryProductsResult.class, categoryProductsResult);
    }

    private CategoryProductsResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProduct(Iterable<? extends CategoryProductResult> iterable) {
        ensureProductIsMutable();
        c.addAll(iterable, this.product_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProduct(int i2, CategoryProductResult categoryProductResult) {
        Objects.requireNonNull(categoryProductResult);
        ensureProductIsMutable();
        this.product_.add(i2, categoryProductResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProduct() {
        this.product_ = emptyProtobufList();
    }

    private void ensureProductIsMutable() {
        eo<CategoryProductResult> eoVar = this.product_;
        if (eoVar.c()) {
            return;
        }
        this.product_ = du.mutableCopy(eoVar);
    }

    public static CategoryProductsResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CategoryProductsResult parseDelimitedFrom(InputStream inputStream) {
        return (CategoryProductsResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CategoryProductsResult parseFrom(v vVar) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<CategoryProductsResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProduct(int i2) {
        ensureProductIsMutable();
        this.product_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(int i2, CategoryProductResult categoryProductResult) {
        Objects.requireNonNull(categoryProductResult);
        ensureProductIsMutable();
        this.product_.set(i2, categoryProductResult);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"product_", CategoryProductResult.class});
        }
        if (iOrdinal == 3) {
            return new CategoryProductsResult();
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
        fo<CategoryProductsResult> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (CategoryProductsResult.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.search.CategoryProductsResultOrBuilder
    public CategoryProductResult getProduct(int i2) {
        return this.product_.get(i2);
    }

    @Override // com.waze.jni.protos.search.CategoryProductsResultOrBuilder
    public int getProductCount() {
        return this.product_.size();
    }

    @Override // com.waze.jni.protos.search.CategoryProductsResultOrBuilder
    public List<CategoryProductResult> getProductList() {
        return this.product_;
    }

    public CategoryProductResultOrBuilder getProductOrBuilder(int i2) {
        return this.product_.get(i2);
    }

    public List<? extends CategoryProductResultOrBuilder> getProductOrBuilderList() {
        return this.product_;
    }

    public static Builder newBuilder(CategoryProductsResult categoryProductsResult) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(categoryProductsResult);
    }

    public static CategoryProductsResult parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (CategoryProductsResult) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CategoryProductsResult parseFrom(v vVar, de deVar) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static CategoryProductsResult parseFrom(z zVar) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static CategoryProductsResult parseFrom(z zVar, de deVar) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProduct(CategoryProductResult categoryProductResult) {
        Objects.requireNonNull(categoryProductResult);
        ensureProductIsMutable();
        this.product_.add(categoryProductResult);
    }

    public static CategoryProductsResult parseFrom(InputStream inputStream) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CategoryProductsResult parseFrom(InputStream inputStream, de deVar) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static CategoryProductsResult parseFrom(ByteBuffer byteBuffer) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CategoryProductsResult parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<CategoryProductsResult, Builder> implements CategoryProductsResultOrBuilder {
        private Builder() {
            super(CategoryProductsResult.DEFAULT_INSTANCE);
        }

        public Builder addAllProduct(Iterable<? extends CategoryProductResult> iterable) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).addAllProduct(iterable);
            return this;
        }

        public Builder addProduct(int i2, CategoryProductResult.Builder builder) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).addProduct(i2, builder.build());
            return this;
        }

        public Builder clearProduct() {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).clearProduct();
            return this;
        }

        @Override // com.waze.jni.protos.search.CategoryProductsResultOrBuilder
        public CategoryProductResult getProduct(int i2) {
            return ((CategoryProductsResult) this.instance).getProduct(i2);
        }

        @Override // com.waze.jni.protos.search.CategoryProductsResultOrBuilder
        public int getProductCount() {
            return ((CategoryProductsResult) this.instance).getProductCount();
        }

        @Override // com.waze.jni.protos.search.CategoryProductsResultOrBuilder
        public List<CategoryProductResult> getProductList() {
            return DesugarCollections.unmodifiableList(((CategoryProductsResult) this.instance).getProductList());
        }

        public Builder removeProduct(int i2) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).removeProduct(i2);
            return this;
        }

        public Builder setProduct(int i2, CategoryProductResult.Builder builder) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).setProduct(i2, builder.build());
            return this;
        }

        public Builder addProduct(int i2, CategoryProductResult categoryProductResult) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).addProduct(i2, categoryProductResult);
            return this;
        }

        public Builder setProduct(int i2, CategoryProductResult categoryProductResult) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).setProduct(i2, categoryProductResult);
            return this;
        }

        public Builder addProduct(CategoryProductResult.Builder builder) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).addProduct(builder.build());
            return this;
        }

        public Builder addProduct(CategoryProductResult categoryProductResult) {
            copyOnWrite();
            ((CategoryProductsResult) this.instance).addProduct(categoryProductResult);
            return this;
        }
    }

    public static CategoryProductsResult parseFrom(byte[] bArr) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CategoryProductsResult parseFrom(byte[] bArr, de deVar) {
        return (CategoryProductsResult) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
