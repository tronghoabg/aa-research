package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgw extends com.google.v.du<bgw, bgv> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BUTTON_CTA_FIELD_NUMBER = 2;
    private static final bgw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bgw> PARSER = null;
    public static final int SUGGESTION_CARD_FIELD_NUMBER = 3;
    public static final int TIMER_BEHAVIOR_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private int buttonCta_;
    private bgs suggestionCard_;
    private int timerBehavior_;

    static {
        bgw bgwVar = new bgw();
        DEFAULT_INSTANCE = bgwVar;
        com.google.v.du.registerDefaultInstance(bgw.class, bgwVar);
    }

    private bgw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonCta() {
        this.buttonCta_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionCard() {
        this.suggestionCard_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimerBehavior() {
        this.timerBehavior_ = 0;
    }

    public static bgw getDefaultInstance() {
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

    public static bgv newBuilder() {
        return (bgv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgw parseDelimitedFrom(InputStream inputStream) {
        return (bgw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgw parseFrom(com.google.v.v vVar) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bgu bguVar) {
        this.action_ = bguVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerBehavior(bhi bhiVar) {
        this.timerBehavior_ = bhiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerBehaviorValue(int i2) {
        this.timerBehavior_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဉ\u0000\u0004\f", new Object[]{"bitField0_", "timerBehavior_", "buttonCta_", "suggestionCard_", "action_"});
        }
        if (iOrdinal == 3) {
            return new bgw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bgv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bgu getAction() {
        int i2 = this.action_;
        bgu bguVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bgu.INFO : bgu.CLOSE : bgu.GO_TIMEOUT : bgu.GO : bgu.ACTION_UNSPECIFIED;
        return bguVar == null ? bgu.UNRECOGNIZED : bguVar;
    }

    public int getActionValue() {
        return this.action_;
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

    public boolean hasSuggestionCard() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bgv newBuilder(bgw bgwVar) {
        return (bgv) DEFAULT_INSTANCE.createBuilder(bgwVar);
    }

    public static bgw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgw parseFrom(com.google.v.z zVar) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgw parseFrom(InputStream inputStream) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgw parseFrom(ByteBuffer byteBuffer) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgw parseFrom(byte[] bArr) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
