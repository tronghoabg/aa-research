package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.common.Price;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GetCurrencyStringRequest extends du<GetCurrencyStringRequest, Builder> implements GetCurrencyStringRequestOrBuilder {
    private static final GetCurrencyStringRequest DEFAULT_INSTANCE;
    private static volatile fo<GetCurrencyStringRequest> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private Price price_;
    private int requestId_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.GetCurrencyStringRequest$1, reason: invalid class name */
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
        GetCurrencyStringRequest getCurrencyStringRequest = new GetCurrencyStringRequest();
        DEFAULT_INSTANCE = getCurrencyStringRequest;
        du.registerDefaultInstance(GetCurrencyStringRequest.class, getCurrencyStringRequest);
    }

    private GetCurrencyStringRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = 0;
    }

    public static GetCurrencyStringRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrice(Price price) {
        Objects.requireNonNull(price);
        Price price2 = this.price_;
        if (price2 != null && price2 != Price.getDefaultInstance()) {
            Price.Builder builderNewBuilder = Price.newBuilder(price2);
            builderNewBuilder.mergeFrom((Price.Builder) price);
            price = builderNewBuilder.buildPartial();
        }
        this.price_ = price;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetCurrencyStringRequest parseDelimitedFrom(InputStream inputStream) {
        return (GetCurrencyStringRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetCurrencyStringRequest parseFrom(v vVar) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GetCurrencyStringRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(Price price) {
        Objects.requireNonNull(price);
        this.price_ = price;
        this.bitField0_ |= 1;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"bitField0_", "requestId_", "price_"});
        }
        if (iOrdinal == 3) {
            return new GetCurrencyStringRequest();
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
        fo<GetCurrencyStringRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GetCurrencyStringRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.GetCurrencyStringRequestOrBuilder
    public Price getPrice() {
        Price price = this.price_;
        return price == null ? Price.getDefaultInstance() : price;
    }

    @Override // com.waze.jni.protos.GetCurrencyStringRequestOrBuilder
    public int getRequestId() {
        return this.requestId_;
    }

    @Override // com.waze.jni.protos.GetCurrencyStringRequestOrBuilder
    public boolean hasPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(GetCurrencyStringRequest getCurrencyStringRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getCurrencyStringRequest);
    }

    public static GetCurrencyStringRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GetCurrencyStringRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GetCurrencyStringRequest parseFrom(v vVar, de deVar) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GetCurrencyStringRequest parseFrom(z zVar) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GetCurrencyStringRequest parseFrom(z zVar, de deVar) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static GetCurrencyStringRequest parseFrom(InputStream inputStream) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetCurrencyStringRequest parseFrom(InputStream inputStream, de deVar) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GetCurrencyStringRequest parseFrom(ByteBuffer byteBuffer) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GetCurrencyStringRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<GetCurrencyStringRequest, Builder> implements GetCurrencyStringRequestOrBuilder {
        private Builder() {
            super(GetCurrencyStringRequest.DEFAULT_INSTANCE);
        }

        public Builder clearPrice() {
            copyOnWrite();
            ((GetCurrencyStringRequest) this.instance).clearPrice();
            return this;
        }

        public Builder clearRequestId() {
            copyOnWrite();
            ((GetCurrencyStringRequest) this.instance).clearRequestId();
            return this;
        }

        @Override // com.waze.jni.protos.GetCurrencyStringRequestOrBuilder
        public Price getPrice() {
            return ((GetCurrencyStringRequest) this.instance).getPrice();
        }

        @Override // com.waze.jni.protos.GetCurrencyStringRequestOrBuilder
        public int getRequestId() {
            return ((GetCurrencyStringRequest) this.instance).getRequestId();
        }

        @Override // com.waze.jni.protos.GetCurrencyStringRequestOrBuilder
        public boolean hasPrice() {
            return ((GetCurrencyStringRequest) this.instance).hasPrice();
        }

        public Builder mergePrice(Price price) {
            copyOnWrite();
            ((GetCurrencyStringRequest) this.instance).mergePrice(price);
            return this;
        }

        public Builder setPrice(Price.Builder builder) {
            copyOnWrite();
            ((GetCurrencyStringRequest) this.instance).setPrice(builder.build());
            return this;
        }

        public Builder setRequestId(int i2) {
            copyOnWrite();
            ((GetCurrencyStringRequest) this.instance).setRequestId(i2);
            return this;
        }

        public Builder setPrice(Price price) {
            copyOnWrite();
            ((GetCurrencyStringRequest) this.instance).setPrice(price);
            return this;
        }
    }

    public static GetCurrencyStringRequest parseFrom(byte[] bArr) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetCurrencyStringRequest parseFrom(byte[] bArr, de deVar) {
        return (GetCurrencyStringRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
