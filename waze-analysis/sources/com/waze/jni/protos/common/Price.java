package com.waze.jni.protos.common;

import androidx.camera.video.AudioStats;
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
public final class Price extends du<Price, Builder> implements PriceOrBuilder {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 2;
    private static final Price DEFAULT_INSTANCE;
    private static volatile fo<Price> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 1;
    private String currencyCode_ = "";
    private double price_;

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.common.Price$1, reason: invalid class name */
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
    public final class Builder extends dm<Price, Builder> implements PriceOrBuilder {
        private Builder() {
            super(Price.DEFAULT_INSTANCE);
        }

        public Builder clearCurrencyCode() {
            copyOnWrite();
            ((Price) this.instance).clearCurrencyCode();
            return this;
        }

        public Builder clearPrice() {
            copyOnWrite();
            ((Price) this.instance).clearPrice();
            return this;
        }

        @Override // com.waze.jni.protos.common.PriceOrBuilder
        public String getCurrencyCode() {
            return ((Price) this.instance).getCurrencyCode();
        }

        @Override // com.waze.jni.protos.common.PriceOrBuilder
        public v getCurrencyCodeBytes() {
            return ((Price) this.instance).getCurrencyCodeBytes();
        }

        @Override // com.waze.jni.protos.common.PriceOrBuilder
        public double getPrice() {
            return ((Price) this.instance).getPrice();
        }

        public Builder setCurrencyCode(String str) {
            copyOnWrite();
            ((Price) this.instance).setCurrencyCode(str);
            return this;
        }

        public Builder setCurrencyCodeBytes(v vVar) {
            copyOnWrite();
            ((Price) this.instance).setCurrencyCodeBytes(vVar);
            return this;
        }

        public Builder setPrice(double d2) {
            copyOnWrite();
            ((Price) this.instance).setPrice(d2);
            return this;
        }
    }

    static {
        Price price = new Price();
        DEFAULT_INSTANCE = price;
        du.registerDefaultInstance(Price.class, price);
    }

    private Price() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrencyCode() {
        this.currencyCode_ = getDefaultInstance().getCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.price_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static Price getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Price parseDelimitedFrom(InputStream inputStream) {
        return (Price) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Price parseFrom(v vVar) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Price> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCode(String str) {
        Objects.requireNonNull(str);
        this.currencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCodeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.currencyCode_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(double d2) {
        this.price_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002Ȉ", new Object[]{"price_", "currencyCode_"});
        }
        if (iOrdinal == 3) {
            return new Price();
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
        fo<Price> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Price.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.common.PriceOrBuilder
    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    @Override // com.waze.jni.protos.common.PriceOrBuilder
    public v getCurrencyCodeBytes() {
        return v.s(this.currencyCode_);
    }

    @Override // com.waze.jni.protos.common.PriceOrBuilder
    public double getPrice() {
        return this.price_;
    }

    public static Builder newBuilder(Price price) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(price);
    }

    public static Price parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Price) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Price parseFrom(v vVar, de deVar) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Price parseFrom(z zVar) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Price parseFrom(z zVar, de deVar) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Price parseFrom(InputStream inputStream) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Price parseFrom(InputStream inputStream, de deVar) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Price parseFrom(ByteBuffer byteBuffer) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Price parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static Price parseFrom(byte[] bArr) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Price parseFrom(byte[] bArr, de deVar) {
        return (Price) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
