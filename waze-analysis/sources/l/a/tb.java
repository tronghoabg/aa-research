package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class tb extends com.google.v.du<tb, sz> implements com.google.v.fj {
    private static final tb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<tb> PARSER = null;
    public static final int SERVER_SUGGESTION_REQUESTED_FIELD_NUMBER = 1;
    public static final int SUGGESTION_CARD_CLICKED_FIELD_NUMBER = 2;
    public static final int SUGGESTION_CARD_DISMISSED_FIELD_NUMBER = 3;
    public static final int SUGGESTION_CARD_RESULT_FIELD_NUMBER = 4;
    public static final int SUGGESTION_CARD_RT_INFO_UPDATED_FIELD_NUMBER = 5;
    public static final int SUGGESTION_CARD_SHOWN_FIELD_NUMBER = 6;
    public static final int WAIT_FOR_SERVER_SUGGESTION_STARTED_FIELD_NUMBER = 7;
    private int statCase_ = 0;
    private Object stat_;

    static {
        tb tbVar = new tb();
        DEFAULT_INSTANCE = tbVar;
        com.google.v.du.registerDefaultInstance(tb.class, tbVar);
    }

    private tb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSuggestionRequested() {
        if (this.statCase_ == 1) {
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
    public void clearSuggestionCardClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionCardDismissed() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionCardResult() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionCardRtInfoUpdated() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestionCardShown() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaitForServerSuggestionStarted() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static tb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerSuggestionRequested(bba bbaVar) {
        Objects.requireNonNull(bbaVar);
        if (this.statCase_ == 1 && this.stat_ != bba.getDefaultInstance()) {
            baz bazVarNewBuilder = bba.newBuilder((bba) this.stat_);
            bazVarNewBuilder.mergeFrom((baz) bbaVar);
            bbaVar = bazVarNewBuilder.buildPartial();
        }
        this.stat_ = bbaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuggestionCardClicked(bgw bgwVar) {
        Objects.requireNonNull(bgwVar);
        if (this.statCase_ == 2 && this.stat_ != bgw.getDefaultInstance()) {
            bgv bgvVarNewBuilder = bgw.newBuilder((bgw) this.stat_);
            bgvVarNewBuilder.mergeFrom((bgv) bgwVar);
            bgwVar = bgvVarNewBuilder.buildPartial();
        }
        this.stat_ = bgwVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuggestionCardDismissed(bgz bgzVar) {
        Objects.requireNonNull(bgzVar);
        if (this.statCase_ == 3 && this.stat_ != bgz.getDefaultInstance()) {
            bgx bgxVarNewBuilder = bgz.newBuilder((bgz) this.stat_);
            bgxVarNewBuilder.mergeFrom((bgx) bgzVar);
            bgzVar = bgxVarNewBuilder.buildPartial();
        }
        this.stat_ = bgzVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuggestionCardResult(bhd bhdVar) {
        Objects.requireNonNull(bhdVar);
        if (this.statCase_ == 4 && this.stat_ != bhd.getDefaultInstance()) {
            bha bhaVarNewBuilder = bhd.newBuilder((bhd) this.stat_);
            bhaVarNewBuilder.mergeFrom((bha) bhdVar);
            bhdVar = bhaVarNewBuilder.buildPartial();
        }
        this.stat_ = bhdVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuggestionCardRtInfoUpdated(bhf bhfVar) {
        Objects.requireNonNull(bhfVar);
        if (this.statCase_ == 5 && this.stat_ != bhf.getDefaultInstance()) {
            bhe bheVarNewBuilder = bhf.newBuilder((bhf) this.stat_);
            bheVarNewBuilder.mergeFrom((bhe) bhfVar);
            bhfVar = bheVarNewBuilder.buildPartial();
        }
        this.stat_ = bhfVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSuggestionCardShown(bhh bhhVar) {
        Objects.requireNonNull(bhhVar);
        if (this.statCase_ == 6 && this.stat_ != bhh.getDefaultInstance()) {
            bhg bhgVarNewBuilder = bhh.newBuilder((bhh) this.stat_);
            bhgVarNewBuilder.mergeFrom((bhg) bhhVar);
            bhhVar = bhgVarNewBuilder.buildPartial();
        }
        this.stat_ = bhhVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaitForServerSuggestionStarted(bqu bquVar) {
        Objects.requireNonNull(bquVar);
        if (this.statCase_ == 7 && this.stat_ != bqu.getDefaultInstance()) {
            bqt bqtVarNewBuilder = bqu.newBuilder((bqu) this.stat_);
            bqtVarNewBuilder.mergeFrom((bqt) bquVar);
            bquVar = bqtVarNewBuilder.buildPartial();
        }
        this.stat_ = bquVar;
        this.statCase_ = 7;
    }

    public static sz newBuilder() {
        return (sz) DEFAULT_INSTANCE.createBuilder();
    }

    public static tb parseDelimitedFrom(InputStream inputStream) {
        return (tb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tb parseFrom(com.google.v.v vVar) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSuggestionRequested(bba bbaVar) {
        Objects.requireNonNull(bbaVar);
        this.stat_ = bbaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionCardClicked(bgw bgwVar) {
        Objects.requireNonNull(bgwVar);
        this.stat_ = bgwVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionCardDismissed(bgz bgzVar) {
        Objects.requireNonNull(bgzVar);
        this.stat_ = bgzVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionCardResult(bhd bhdVar) {
        Objects.requireNonNull(bhdVar);
        this.stat_ = bhdVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionCardRtInfoUpdated(bhf bhfVar) {
        Objects.requireNonNull(bhfVar);
        this.stat_ = bhfVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionCardShown(bhh bhhVar) {
        Objects.requireNonNull(bhhVar);
        this.stat_ = bhhVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaitForServerSuggestionStarted(bqu bquVar) {
        Objects.requireNonNull(bquVar);
        this.stat_ = bquVar;
        this.statCase_ = 7;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"stat_", "statCase_", bba.class, bgw.class, bgz.class, bhd.class, bhf.class, bhh.class, bqu.class});
        }
        if (iOrdinal == 3) {
            return new tb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bba getServerSuggestionRequested() {
        return this.statCase_ == 1 ? (bba) this.stat_ : bba.getDefaultInstance();
    }

    public ta getStatCase() {
        switch (this.statCase_) {
            case 0:
                return ta.f55433h;
            case 1:
                return ta.f55426a;
            case 2:
                return ta.f55427b;
            case 3:
                return ta.f55428c;
            case 4:
                return ta.f55429d;
            case 5:
                return ta.f55430e;
            case 6:
                return ta.f55431f;
            case 7:
                return ta.f55432g;
            default:
                return null;
        }
    }

    public bgw getSuggestionCardClicked() {
        return this.statCase_ == 2 ? (bgw) this.stat_ : bgw.getDefaultInstance();
    }

    public bgz getSuggestionCardDismissed() {
        return this.statCase_ == 3 ? (bgz) this.stat_ : bgz.getDefaultInstance();
    }

    public bhd getSuggestionCardResult() {
        return this.statCase_ == 4 ? (bhd) this.stat_ : bhd.getDefaultInstance();
    }

    public bhf getSuggestionCardRtInfoUpdated() {
        return this.statCase_ == 5 ? (bhf) this.stat_ : bhf.getDefaultInstance();
    }

    public bhh getSuggestionCardShown() {
        return this.statCase_ == 6 ? (bhh) this.stat_ : bhh.getDefaultInstance();
    }

    public bqu getWaitForServerSuggestionStarted() {
        return this.statCase_ == 7 ? (bqu) this.stat_ : bqu.getDefaultInstance();
    }

    public boolean hasServerSuggestionRequested() {
        return this.statCase_ == 1;
    }

    public boolean hasSuggestionCardClicked() {
        return this.statCase_ == 2;
    }

    public boolean hasSuggestionCardDismissed() {
        return this.statCase_ == 3;
    }

    public boolean hasSuggestionCardResult() {
        return this.statCase_ == 4;
    }

    public boolean hasSuggestionCardRtInfoUpdated() {
        return this.statCase_ == 5;
    }

    public boolean hasSuggestionCardShown() {
        return this.statCase_ == 6;
    }

    public boolean hasWaitForServerSuggestionStarted() {
        return this.statCase_ == 7;
    }

    public static sz newBuilder(tb tbVar) {
        return (sz) DEFAULT_INSTANCE.createBuilder(tbVar);
    }

    public static tb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tb parseFrom(com.google.v.z zVar) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tb parseFrom(InputStream inputStream) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tb parseFrom(ByteBuffer byteBuffer) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tb parseFrom(byte[] bArr) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
