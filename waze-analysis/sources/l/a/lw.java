package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lw extends com.google.v.du<lw, lu> implements com.google.v.fj {
    public static final int AGE_SCREEN_CLICKED_FIELD_NUMBER = 4;
    public static final int AGE_SCREEN_SHOWN_FIELD_NUMBER = 3;
    private static final lw DEFAULT_INSTANCE;
    public static final int GDPR_SCREEN_CLICKED_FIELD_NUMBER = 1;
    public static final int GDPR_SCREEN_SHOWN_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<lw> PARSER = null;
    public static final int USER_AGE_BLOCKED_SCREEN_CLICKED_FIELD_NUMBER = 5;
    public static final int USER_AGE_BLOCKED_SCREEN_SHOWN_FIELD_NUMBER = 6;
    public static final int USER_AGE_WARNING_POPUP_CLICKED_FIELD_NUMBER = 7;
    public static final int USER_AGE_WARNING_POPUP_SHOWN_FIELD_NUMBER = 8;
    public static final int USER_AGE_WARNING_SCREEN_CLICKED_FIELD_NUMBER = 9;
    public static final int USER_AGE_WARNING_SCREEN_SHOWN_FIELD_NUMBER = 10;
    private int statCase_ = 0;
    private Object stat_;

    static {
        lw lwVar = new lw();
        DEFAULT_INSTANCE = lwVar;
        com.google.v.du.registerDefaultInstance(lw.class, lwVar);
    }

    private lw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeScreenClicked() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeScreenShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprScreenClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGdprScreenShown() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeBlockedScreenClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeBlockedScreenShown() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeWarningPopupClicked() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeWarningPopupShown() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeWarningScreenClicked() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgeWarningScreenShown() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static lw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgeScreenClicked(bt btVar) {
        Objects.requireNonNull(btVar);
        if (this.statCase_ == 4 && this.stat_ != bt.getDefaultInstance()) {
            bs bsVarNewBuilder = bt.newBuilder((bt) this.stat_);
            bsVarNewBuilder.mergeFrom((bs) btVar);
            btVar = bsVarNewBuilder.buildPartial();
        }
        this.stat_ = btVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAgeScreenShown(by byVar) {
        Objects.requireNonNull(byVar);
        if (this.statCase_ == 3 && this.stat_ != by.getDefaultInstance()) {
            bx bxVarNewBuilder = by.newBuilder((by) this.stat_);
            bxVarNewBuilder.mergeFrom((bx) byVar);
            byVar = bxVarNewBuilder.buildPartial();
        }
        this.stat_ = byVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprScreenClicked(yg ygVar) {
        Objects.requireNonNull(ygVar);
        if (this.statCase_ == 1 && this.stat_ != yg.getDefaultInstance()) {
            yf yfVarNewBuilder = yg.newBuilder((yg) this.stat_);
            yfVarNewBuilder.mergeFrom((yf) ygVar);
            ygVar = yfVarNewBuilder.buildPartial();
        }
        this.stat_ = ygVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGdprScreenShown(yj yjVar) {
        Objects.requireNonNull(yjVar);
        if (this.statCase_ == 2 && this.stat_ != yj.getDefaultInstance()) {
            yh yhVarNewBuilder = yj.newBuilder((yj) this.stat_);
            yhVarNewBuilder.mergeFrom((yh) yjVar);
            yjVar = yhVarNewBuilder.buildPartial();
        }
        this.stat_ = yjVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeBlockedScreenClicked(boh bohVar) {
        Objects.requireNonNull(bohVar);
        if (this.statCase_ == 5 && this.stat_ != boh.getDefaultInstance()) {
            bog bogVarNewBuilder = boh.newBuilder((boh) this.stat_);
            bogVarNewBuilder.mergeFrom((bog) bohVar);
            bohVar = bogVarNewBuilder.buildPartial();
        }
        this.stat_ = bohVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeBlockedScreenShown(boj bojVar) {
        Objects.requireNonNull(bojVar);
        if (this.statCase_ == 6 && this.stat_ != boj.getDefaultInstance()) {
            boi boiVarNewBuilder = boj.newBuilder((boj) this.stat_);
            boiVarNewBuilder.mergeFrom((boi) bojVar);
            bojVar = boiVarNewBuilder.buildPartial();
        }
        this.stat_ = bojVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningPopupClicked(bom bomVar) {
        Objects.requireNonNull(bomVar);
        if (this.statCase_ == 7 && this.stat_ != bom.getDefaultInstance()) {
            bol bolVarNewBuilder = bom.newBuilder((bom) this.stat_);
            bolVarNewBuilder.mergeFrom((bol) bomVar);
            bomVar = bolVarNewBuilder.buildPartial();
        }
        this.stat_ = bomVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningPopupShown(boo booVar) {
        Objects.requireNonNull(booVar);
        if (this.statCase_ == 8 && this.stat_ != boo.getDefaultInstance()) {
            bon bonVarNewBuilder = boo.newBuilder((boo) this.stat_);
            bonVarNewBuilder.mergeFrom((bon) booVar);
            booVar = bonVarNewBuilder.buildPartial();
        }
        this.stat_ = booVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningScreenClicked(bor borVar) {
        Objects.requireNonNull(borVar);
        if (this.statCase_ == 9 && this.stat_ != bor.getDefaultInstance()) {
            boq boqVarNewBuilder = bor.newBuilder((bor) this.stat_);
            boqVarNewBuilder.mergeFrom((boq) borVar);
            borVar = boqVarNewBuilder.buildPartial();
        }
        this.stat_ = borVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAgeWarningScreenShown(bot botVar) {
        Objects.requireNonNull(botVar);
        if (this.statCase_ == 10 && this.stat_ != bot.getDefaultInstance()) {
            bos bosVarNewBuilder = bot.newBuilder((bot) this.stat_);
            bosVarNewBuilder.mergeFrom((bos) botVar);
            botVar = bosVarNewBuilder.buildPartial();
        }
        this.stat_ = botVar;
        this.statCase_ = 10;
    }

    public static lu newBuilder() {
        return (lu) DEFAULT_INSTANCE.createBuilder();
    }

    public static lw parseDelimitedFrom(InputStream inputStream) {
        return (lw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lw parseFrom(com.google.v.v vVar) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenClicked(bt btVar) {
        Objects.requireNonNull(btVar);
        this.stat_ = btVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenShown(by byVar) {
        Objects.requireNonNull(byVar);
        this.stat_ = byVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprScreenClicked(yg ygVar) {
        Objects.requireNonNull(ygVar);
        this.stat_ = ygVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGdprScreenShown(yj yjVar) {
        Objects.requireNonNull(yjVar);
        this.stat_ = yjVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeBlockedScreenClicked(boh bohVar) {
        Objects.requireNonNull(bohVar);
        this.stat_ = bohVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeBlockedScreenShown(boj bojVar) {
        Objects.requireNonNull(bojVar);
        this.stat_ = bojVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningPopupClicked(bom bomVar) {
        Objects.requireNonNull(bomVar);
        this.stat_ = bomVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningPopupShown(boo booVar) {
        Objects.requireNonNull(booVar);
        this.stat_ = booVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningScreenClicked(bor borVar) {
        Objects.requireNonNull(borVar);
        this.stat_ = borVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgeWarningScreenShown(bot botVar) {
        Objects.requireNonNull(botVar);
        this.stat_ = botVar;
        this.statCase_ = 10;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"stat_", "statCase_", yg.class, yj.class, by.class, bt.class, boh.class, boj.class, bom.class, boo.class, bor.class, bot.class});
        }
        if (iOrdinal == 3) {
            return new lw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public bt getAgeScreenClicked() {
        return this.statCase_ == 4 ? (bt) this.stat_ : bt.getDefaultInstance();
    }

    @Deprecated
    public by getAgeScreenShown() {
        return this.statCase_ == 3 ? (by) this.stat_ : by.getDefaultInstance();
    }

    @Deprecated
    public yg getGdprScreenClicked() {
        return this.statCase_ == 1 ? (yg) this.stat_ : yg.getDefaultInstance();
    }

    @Deprecated
    public yj getGdprScreenShown() {
        return this.statCase_ == 2 ? (yj) this.stat_ : yj.getDefaultInstance();
    }

    public lv getStatCase() {
        switch (this.statCase_) {
            case 0:
                return lv.f55072k;
            case 1:
                return lv.f55062a;
            case 2:
                return lv.f55063b;
            case 3:
                return lv.f55064c;
            case 4:
                return lv.f55065d;
            case 5:
                return lv.f55066e;
            case 6:
                return lv.f55067f;
            case 7:
                return lv.f55068g;
            case 8:
                return lv.f55069h;
            case 9:
                return lv.f55070i;
            case 10:
                return lv.f55071j;
            default:
                return null;
        }
    }

    public boh getUserAgeBlockedScreenClicked() {
        return this.statCase_ == 5 ? (boh) this.stat_ : boh.getDefaultInstance();
    }

    public boj getUserAgeBlockedScreenShown() {
        return this.statCase_ == 6 ? (boj) this.stat_ : boj.getDefaultInstance();
    }

    @Deprecated
    public bom getUserAgeWarningPopupClicked() {
        return this.statCase_ == 7 ? (bom) this.stat_ : bom.getDefaultInstance();
    }

    @Deprecated
    public boo getUserAgeWarningPopupShown() {
        return this.statCase_ == 8 ? (boo) this.stat_ : boo.getDefaultInstance();
    }

    @Deprecated
    public bor getUserAgeWarningScreenClicked() {
        return this.statCase_ == 9 ? (bor) this.stat_ : bor.getDefaultInstance();
    }

    @Deprecated
    public bot getUserAgeWarningScreenShown() {
        return this.statCase_ == 10 ? (bot) this.stat_ : bot.getDefaultInstance();
    }

    @Deprecated
    public boolean hasAgeScreenClicked() {
        return this.statCase_ == 4;
    }

    @Deprecated
    public boolean hasAgeScreenShown() {
        return this.statCase_ == 3;
    }

    @Deprecated
    public boolean hasGdprScreenClicked() {
        return this.statCase_ == 1;
    }

    @Deprecated
    public boolean hasGdprScreenShown() {
        return this.statCase_ == 2;
    }

    public boolean hasUserAgeBlockedScreenClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasUserAgeBlockedScreenShown() {
        return this.statCase_ == 6;
    }

    @Deprecated
    public boolean hasUserAgeWarningPopupClicked() {
        return this.statCase_ == 7;
    }

    @Deprecated
    public boolean hasUserAgeWarningPopupShown() {
        return this.statCase_ == 8;
    }

    @Deprecated
    public boolean hasUserAgeWarningScreenClicked() {
        return this.statCase_ == 9;
    }

    @Deprecated
    public boolean hasUserAgeWarningScreenShown() {
        return this.statCase_ == 10;
    }

    public static lu newBuilder(lw lwVar) {
        return (lu) DEFAULT_INSTANCE.createBuilder(lwVar);
    }

    public static lw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lw parseFrom(com.google.v.z zVar) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lw parseFrom(InputStream inputStream) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lw parseFrom(ByteBuffer byteBuffer) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lw parseFrom(byte[] bArr) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
