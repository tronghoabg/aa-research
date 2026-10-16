package l.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class biu extends com.google.v.du<biu, bis> implements com.google.v.fj {
    private static final biu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<biu> PARSER = null;
    public static final int TOLL_PRICE_CURRENCY_FIELD_NUMBER = 3;
    public static final int TOLL_PRICE_FIELD_NUMBER = 2;
    public static final int TOLL_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String tollPriceCurrency_ = "";
    private double tollPrice_;
    private int tollType_;

    static {
        biu biuVar = new biu();
        DEFAULT_INSTANCE = biuVar;
        com.google.v.du.registerDefaultInstance(biu.class, biuVar);
    }

    private biu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPrice() {
        this.bitField0_ &= -2;
        this.tollPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPriceCurrency() {
        this.tollPriceCurrency_ = getDefaultInstance().getTollPriceCurrency();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollType() {
        this.tollType_ = 0;
    }

    public static biu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bis newBuilder() {
        return (bis) DEFAULT_INSTANCE.createBuilder();
    }

    public static biu parseDelimitedFrom(InputStream inputStream) {
        return (biu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static biu parseFrom(com.google.v.v vVar) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<biu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPrice(double d2) {
        this.bitField0_ |= 1;
        this.tollPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceCurrency(String str) {
        Objects.requireNonNull(str);
        this.tollPriceCurrency_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceCurrencyBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tollPriceCurrency_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollType(bit bitVar) {
        this.tollType_ = bitVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollTypeValue(int i2) {
        this.tollType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002က\u0000\u0003Ȉ", new Object[]{"bitField0_", "tollType_", "tollPrice_", "tollPriceCurrency_"});
        }
        if (iOrdinal == 3) {
            return new biu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bis(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<biu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (biu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getTollPrice() {
        return this.tollPrice_;
    }

    public String getTollPriceCurrency() {
        return this.tollPriceCurrency_;
    }

    public com.google.v.v getTollPriceCurrencyBytes() {
        return com.google.v.v.s(this.tollPriceCurrency_);
    }

    public bit getTollType() {
        int i2 = this.tollType_;
        bit bitVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bit.TOLL_TYPE_DYNAMIC : bit.TOLL_TYPE_FIXED : bit.TOLL_TYPE_UNSPECIFIED;
        return bitVar == null ? bit.UNRECOGNIZED : bitVar;
    }

    public int getTollTypeValue() {
        return this.tollType_;
    }

    public boolean hasTollPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bis newBuilder(biu biuVar) {
        return (bis) DEFAULT_INSTANCE.createBuilder(biuVar);
    }

    public static biu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (biu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static biu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static biu parseFrom(com.google.v.z zVar) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static biu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static biu parseFrom(InputStream inputStream) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static biu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static biu parseFrom(ByteBuffer byteBuffer) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static biu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static biu parseFrom(byte[] bArr) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static biu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (biu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
