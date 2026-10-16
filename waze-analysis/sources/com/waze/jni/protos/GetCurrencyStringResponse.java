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
public final class GetCurrencyStringResponse extends du<GetCurrencyStringResponse, Builder> implements GetCurrencyStringResponseOrBuilder {
    private static final GetCurrencyStringResponse DEFAULT_INSTANCE;
    private static volatile fo<GetCurrencyStringResponse> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String price_ = "";
    private int requestId_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.GetCurrencyStringResponse$1, reason: invalid class name */
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
    public final class Builder extends dm<GetCurrencyStringResponse, Builder> implements GetCurrencyStringResponseOrBuilder {
        private Builder() {
            super(GetCurrencyStringResponse.DEFAULT_INSTANCE);
        }

        public Builder clearPrice() {
            copyOnWrite();
            ((GetCurrencyStringResponse) this.instance).clearPrice();
            return this;
        }

        public Builder clearRequestId() {
            copyOnWrite();
            ((GetCurrencyStringResponse) this.instance).clearRequestId();
            return this;
        }

        @Override // com.waze.jni.protos.GetCurrencyStringResponseOrBuilder
        public String getPrice() {
            return ((GetCurrencyStringResponse) this.instance).getPrice();
        }

        @Override // com.waze.jni.protos.GetCurrencyStringResponseOrBuilder
        public v getPriceBytes() {
            return ((GetCurrencyStringResponse) this.instance).getPriceBytes();
        }

        @Override // com.waze.jni.protos.GetCurrencyStringResponseOrBuilder
        public int getRequestId() {
            return ((GetCurrencyStringResponse) this.instance).getRequestId();
        }

        public Builder setPrice(String str) {
            copyOnWrite();
            ((GetCurrencyStringResponse) this.instance).setPrice(str);
            return this;
        }

        public Builder setPriceBytes(v vVar) {
            copyOnWrite();
            ((GetCurrencyStringResponse) this.instance).setPriceBytes(vVar);
            return this;
        }

        public Builder setRequestId(int i2) {
            copyOnWrite();
            ((GetCurrencyStringResponse) this.instance).setRequestId(i2);
            return this;
        }
    }

    static {
        GetCurrencyStringResponse getCurrencyStringResponse = new GetCurrencyStringResponse();
        DEFAULT_INSTANCE = getCurrencyStringResponse;
        du.registerDefaultInstance(GetCurrencyStringResponse.class, getCurrencyStringResponse);
    }

    private GetCurrencyStringResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = getDefaultInstance().getPrice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = 0;
    }

    public static GetCurrencyStringResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetCurrencyStringResponse parseDelimitedFrom(InputStream inputStream) {
        return (GetCurrencyStringResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetCurrencyStringResponse parseFrom(v vVar) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<GetCurrencyStringResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(String str) {
        Objects.requireNonNull(str);
        this.price_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.price_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"requestId_", "price_"});
        }
        if (iOrdinal == 3) {
            return new GetCurrencyStringResponse();
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
        fo<GetCurrencyStringResponse> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (GetCurrencyStringResponse.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.GetCurrencyStringResponseOrBuilder
    public String getPrice() {
        return this.price_;
    }

    @Override // com.waze.jni.protos.GetCurrencyStringResponseOrBuilder
    public v getPriceBytes() {
        return v.s(this.price_);
    }

    @Override // com.waze.jni.protos.GetCurrencyStringResponseOrBuilder
    public int getRequestId() {
        return this.requestId_;
    }

    public static Builder newBuilder(GetCurrencyStringResponse getCurrencyStringResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(getCurrencyStringResponse);
    }

    public static GetCurrencyStringResponse parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (GetCurrencyStringResponse) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GetCurrencyStringResponse parseFrom(v vVar, de deVar) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static GetCurrencyStringResponse parseFrom(z zVar) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static GetCurrencyStringResponse parseFrom(z zVar, de deVar) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static GetCurrencyStringResponse parseFrom(InputStream inputStream) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetCurrencyStringResponse parseFrom(InputStream inputStream, de deVar) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static GetCurrencyStringResponse parseFrom(ByteBuffer byteBuffer) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GetCurrencyStringResponse parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static GetCurrencyStringResponse parseFrom(byte[] bArr) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetCurrencyStringResponse parseFrom(byte[] bArr, de deVar) {
        return (GetCurrencyStringResponse) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
