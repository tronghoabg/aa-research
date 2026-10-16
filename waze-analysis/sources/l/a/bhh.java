package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhh extends com.google.v.du<bhh, bhg> implements com.google.v.fj {
    public static final int BUTTON_CTA_FIELD_NUMBER = 2;
    private static final bhh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bhh> PARSER = null;
    public static final int SUGGESTION_CARD_FIELD_NUMBER = 4;
    public static final int TIMER_BEHAVIOR_FIELD_NUMBER = 1;
    public static final int VISIBLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int buttonCta_;
    private bgs suggestionCard_;
    private int timerBehavior_;
    private boolean visible_;

    static {
        bhh bhhVar = new bhh();
        DEFAULT_INSTANCE = bhhVar;
        com.google.v.du.registerDefaultInstance(bhh.class, bhhVar);
    }

    private bhh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonCta() {
        this.buttonCta_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionCard() {
        this.suggestionCard_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimerBehavior() {
        this.timerBehavior_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisible() {
        this.bitField0_ &= -2;
        this.visible_ = false;
    }

    public static bhh getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static bhg newBuilder() {
        return (bhg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhh parseDelimitedFrom(InputStream inputStream) {
        return (bhh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhh parseFrom(com.google.v.v vVar) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhh> parser() {
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
    public void setSuggestionCard(bgs bgsVar) {
        Objects.requireNonNull(bgsVar);
        this.suggestionCard_ = bgsVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerBehavior(bhi bhiVar) {
        this.timerBehavior_ = bhiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerBehaviorValue(int i2) {
        this.timerBehavior_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisible(boolean z) {
        this.bitField0_ |= 1;
        this.visible_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "timerBehavior_", "buttonCta_", "visible_", "suggestionCard_"});
        }
        if (iOrdinal == 3) {
            return new bhh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhh.class) {
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

    public bgs getSuggestionCard() {
        bgs bgsVar = this.suggestionCard_;
        return bgsVar == null ? bgs.getDefaultInstance() : bgsVar;
    }

    public bhi getTimerBehavior() {
        bhi bhiVarA = bhi.a(this.timerBehavior_);
        return bhiVarA == null ? bhi.UNRECOGNIZED : bhiVarA;
    }

    public int getTimerBehaviorValue() {
        return this.timerBehavior_;
    }

    public boolean getVisible() {
        return this.visible_;
    }

    public boolean hasSuggestionCard() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVisible() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bhg newBuilder(bhh bhhVar) {
        return (bhg) DEFAULT_INSTANCE.createBuilder(bhhVar);
    }

    public static bhh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhh parseFrom(com.google.v.z zVar) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhh parseFrom(InputStream inputStream) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhh parseFrom(ByteBuffer byteBuffer) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhh parseFrom(byte[] bArr) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
