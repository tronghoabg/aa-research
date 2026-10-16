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
public final class AdvilRequest extends du<AdvilRequest, Builder> implements AdvilRequestOrBuilder {
    private static final AdvilRequest DEFAULT_INSTANCE;
    public static final int OFFER_JSON_FIELD_NUMBER = 2;
    public static final int PAGE_URL_FIELD_NUMBER = 1;
    private static volatile fo<AdvilRequest> PARSER;
    private int bitField0_;
    private String pageUrl_ = "";
    private String offerJson_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.AdvilRequest$1, reason: invalid class name */
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
    public final class Builder extends dm<AdvilRequest, Builder> implements AdvilRequestOrBuilder {
        private Builder() {
            super(AdvilRequest.DEFAULT_INSTANCE);
        }

        public Builder clearOfferJson() {
            copyOnWrite();
            ((AdvilRequest) this.instance).clearOfferJson();
            return this;
        }

        public Builder clearPageUrl() {
            copyOnWrite();
            ((AdvilRequest) this.instance).clearPageUrl();
            return this;
        }

        @Override // com.waze.jni.protos.AdvilRequestOrBuilder
        public String getOfferJson() {
            return ((AdvilRequest) this.instance).getOfferJson();
        }

        @Override // com.waze.jni.protos.AdvilRequestOrBuilder
        public v getOfferJsonBytes() {
            return ((AdvilRequest) this.instance).getOfferJsonBytes();
        }

        @Override // com.waze.jni.protos.AdvilRequestOrBuilder
        public String getPageUrl() {
            return ((AdvilRequest) this.instance).getPageUrl();
        }

        @Override // com.waze.jni.protos.AdvilRequestOrBuilder
        public v getPageUrlBytes() {
            return ((AdvilRequest) this.instance).getPageUrlBytes();
        }

        @Override // com.waze.jni.protos.AdvilRequestOrBuilder
        public boolean hasOfferJson() {
            return ((AdvilRequest) this.instance).hasOfferJson();
        }

        @Override // com.waze.jni.protos.AdvilRequestOrBuilder
        public boolean hasPageUrl() {
            return ((AdvilRequest) this.instance).hasPageUrl();
        }

        public Builder setOfferJson(String str) {
            copyOnWrite();
            ((AdvilRequest) this.instance).setOfferJson(str);
            return this;
        }

        public Builder setOfferJsonBytes(v vVar) {
            copyOnWrite();
            ((AdvilRequest) this.instance).setOfferJsonBytes(vVar);
            return this;
        }

        public Builder setPageUrl(String str) {
            copyOnWrite();
            ((AdvilRequest) this.instance).setPageUrl(str);
            return this;
        }

        public Builder setPageUrlBytes(v vVar) {
            copyOnWrite();
            ((AdvilRequest) this.instance).setPageUrlBytes(vVar);
            return this;
        }
    }

    static {
        AdvilRequest advilRequest = new AdvilRequest();
        DEFAULT_INSTANCE = advilRequest;
        du.registerDefaultInstance(AdvilRequest.class, advilRequest);
    }

    private AdvilRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfferJson() {
        this.bitField0_ &= -3;
        this.offerJson_ = getDefaultInstance().getOfferJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageUrl() {
        this.bitField0_ &= -2;
        this.pageUrl_ = getDefaultInstance().getPageUrl();
    }

    public static AdvilRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AdvilRequest parseDelimitedFrom(InputStream inputStream) {
        return (AdvilRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdvilRequest parseFrom(v vVar) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<AdvilRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfferJson(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.offerJson_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfferJsonBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.offerJson_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.pageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.pageUrl_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "pageUrl_", "offerJson_"});
        }
        if (iOrdinal == 3) {
            return new AdvilRequest();
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
        fo<AdvilRequest> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (AdvilRequest.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.AdvilRequestOrBuilder
    public String getOfferJson() {
        return this.offerJson_;
    }

    @Override // com.waze.jni.protos.AdvilRequestOrBuilder
    public v getOfferJsonBytes() {
        return v.s(this.offerJson_);
    }

    @Override // com.waze.jni.protos.AdvilRequestOrBuilder
    public String getPageUrl() {
        return this.pageUrl_;
    }

    @Override // com.waze.jni.protos.AdvilRequestOrBuilder
    public v getPageUrlBytes() {
        return v.s(this.pageUrl_);
    }

    @Override // com.waze.jni.protos.AdvilRequestOrBuilder
    public boolean hasOfferJson() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.AdvilRequestOrBuilder
    public boolean hasPageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(AdvilRequest advilRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(advilRequest);
    }

    public static AdvilRequest parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (AdvilRequest) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AdvilRequest parseFrom(v vVar, de deVar) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static AdvilRequest parseFrom(z zVar) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static AdvilRequest parseFrom(z zVar, de deVar) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static AdvilRequest parseFrom(InputStream inputStream) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdvilRequest parseFrom(InputStream inputStream, de deVar) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static AdvilRequest parseFrom(ByteBuffer byteBuffer) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AdvilRequest parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static AdvilRequest parseFrom(byte[] bArr) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AdvilRequest parseFrom(byte[] bArr, de deVar) {
        return (AdvilRequest) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
