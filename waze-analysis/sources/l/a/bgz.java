package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgz extends com.google.v.du<bgz, bgx> implements com.google.v.fj {
    public static final int BUTTON_CTA_FIELD_NUMBER = 2;
    private static final bgz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bgz> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int SUGGESTION_CARD_FIELD_NUMBER = 3;
    private int bitField0_;
    private int buttonCta_;
    private int reason_;
    private bgs suggestionCard_;

    static {
        bgz bgzVar = new bgz();
        DEFAULT_INSTANCE = bgzVar;
        com.google.v.du.registerDefaultInstance(bgz.class, bgzVar);
    }

    private bgz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonCta() {
        this.buttonCta_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionCard() {
        this.suggestionCard_ = null;
        this.bitField0_ &= -2;
    }

    public static bgz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuggestionCard(bgs bgsVar) {
        Objects.requireNonNull(bgsVar);
        bgs bgsVar2 = this.suggestionCard_;
        if (bgsVar2 != null && bgsVar2 != bgs.getDefaultInstance()) {
            bgp bgpVarNewBuilder = bgs.newBuilder(bgsVar2);
            bgpVarNewBuilder.mergeFrom((bgp) bgsVar);
            bgsVar = bgpVarNewBuilder.buildPartial();
        }
        this.suggestionCard_ = bgsVar;
        this.bitField0_ |= 1;
    }

    public static bgx newBuilder() {
        return (bgx) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgz parseDelimitedFrom(InputStream inputStream) {
        return (bgz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgz parseFrom(com.google.v.v vVar) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonCta(bgt bgtVar) {
        this.buttonCta_ = bgtVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonCtaValue(int i2) {
        this.buttonCta_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(bgy bgyVar) {
        this.reason_ = bgyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionCard(bgs bgsVar) {
        Objects.requireNonNull(bgsVar);
        this.suggestionCard_ = bgsVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "reason_", "buttonCta_", "suggestionCard_"});
        }
        if (iOrdinal == 3) {
            return new bgz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bgx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bgt getButtonCta() {
        bgt bgtVarA = bgt.a(this.buttonCta_);
        return bgtVarA == null ? bgt.UNRECOGNIZED : bgtVarA;
    }

    public int getButtonCtaValue() {
        return this.buttonCta_;
    }

    public bgy getReason() {
        int i2 = this.reason_;
        bgy bgyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bgy.USER_DISMISSED : bgy.NAVIGATION_START : bgy.ROAMING_TIMEOUT : bgy.REASON_UNSPECIFIED;
        return bgyVar == null ? bgy.UNRECOGNIZED : bgyVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public bgs getSuggestionCard() {
        bgs bgsVar = this.suggestionCard_;
        return bgsVar == null ? bgs.getDefaultInstance() : bgsVar;
    }

    public boolean hasSuggestionCard() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bgx newBuilder(bgz bgzVar) {
        return (bgx) DEFAULT_INSTANCE.createBuilder(bgzVar);
    }

    public static bgz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgz parseFrom(com.google.v.z zVar) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgz parseFrom(InputStream inputStream) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgz parseFrom(ByteBuffer byteBuffer) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgz parseFrom(byte[] bArr) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
