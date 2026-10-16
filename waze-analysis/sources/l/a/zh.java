package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class zh extends com.google.v.du<zh, zg> implements com.google.v.fj {
    public static final int AD_IMPRESSION_ID_FIELD_NUMBER = 1;
    private static final zh DEFAULT_INSTANCE;
    public static final int IS_INVISIBLE_FIELD_NUMBER = 4;
    public static final int IS_TEST_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<zh> PARSER = null;
    public static final int PLACE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isInvisible_;
    private boolean isTest_;
    private String adImpressionId_ = "";
    private String placeId_ = "";

    static {
        zh zhVar = new zh();
        DEFAULT_INSTANCE = zhVar;
        com.google.v.du.registerDefaultInstance(zh.class, zhVar);
    }

    private zh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdImpressionId() {
        this.adImpressionId_ = getDefaultInstance().getAdImpressionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInvisible() {
        this.bitField0_ &= -3;
        this.isInvisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTest() {
        this.bitField0_ &= -2;
        this.isTest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceId() {
        this.placeId_ = getDefaultInstance().getPlaceId();
    }

    public static zh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static zg newBuilder() {
        return (zg) DEFAULT_INSTANCE.createBuilder();
    }

    public static zh parseDelimitedFrom(InputStream inputStream) {
        return (zh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zh parseFrom(com.google.v.v vVar) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<zh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdImpressionId(String str) {
        Objects.requireNonNull(str);
        this.adImpressionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdImpressionIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.adImpressionId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInvisible(boolean z) {
        this.bitField0_ |= 2;
        this.isInvisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTest(boolean z) {
        this.bitField0_ |= 1;
        this.isTest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceId(String str) {
        Objects.requireNonNull(str);
        this.placeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.placeId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဇ\u0000\u0004ဇ\u0001", new Object[]{"bitField0_", "adImpressionId_", "placeId_", "isTest_", "isInvisible_"});
        }
        if (iOrdinal == 3) {
            return new zh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<zh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (zh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdImpressionId() {
        return this.adImpressionId_;
    }

    public com.google.v.v getAdImpressionIdBytes() {
        return com.google.v.v.s(this.adImpressionId_);
    }

    public boolean getIsInvisible() {
        return this.isInvisible_;
    }

    public boolean getIsTest() {
        return this.isTest_;
    }

    public String getPlaceId() {
        return this.placeId_;
    }

    public com.google.v.v getPlaceIdBytes() {
        return com.google.v.v.s(this.placeId_);
    }

    public boolean hasIsInvisible() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsTest() {
        return (this.bitField0_ & 1) != 0;
    }

    public static zg newBuilder(zh zhVar) {
        return (zg) DEFAULT_INSTANCE.createBuilder(zhVar);
    }

    public static zh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static zh parseFrom(com.google.v.z zVar) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static zh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static zh parseFrom(InputStream inputStream) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static zh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static zh parseFrom(ByteBuffer byteBuffer) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static zh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static zh parseFrom(byte[] bArr) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static zh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (zh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
