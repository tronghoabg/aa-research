package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aam extends com.google.v.du<aam, aak> implements com.google.v.fj {
    private static final aam DEFAULT_INSTANCE;
    public static final int GOOGLE_ASSISTANT_COMBINED_ONBOARDING_LEGAL_SCREEN_CLICKED_FIELD_NUMBER = 5;
    public static final int GOOGLE_ASSISTANT_COMBINED_ONBOARDING_LEGAL_SCREEN_SHOWN_FIELD_NUMBER = 3;
    public static final int GOOGLE_ASSISTANT_FINISHED_FIELD_NUMBER = 1;
    public static final int GOOGLE_ASSISTANT_INITIATED_FIELD_NUMBER = 6;
    public static final int GOOGLE_ASSISTANT_POST_ACTION_FIELD_NUMBER = 4;
    public static final int GOOGLE_ASSISTANT_SEARCHBAR_TOOLTIP_SHOWN_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<aam> PARSER;
    private int statCase_ = 0;
    private Object stat_;

    static {
        aam aamVar = new aam();
        DEFAULT_INSTANCE = aamVar;
        com.google.v.du.registerDefaultInstance(aam.class, aamVar);
    }

    private aam() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantCombinedOnboardingLegalScreenClicked() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantCombinedOnboardingLegalScreenShown() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantFinished() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantInitiated() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantPostAction() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantSearchbarTooltipShown() {
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

    public static aam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAssistantCombinedOnboardingLegalScreenClicked(zt ztVar) {
        Objects.requireNonNull(ztVar);
        if (this.statCase_ == 5 && this.stat_ != zt.getDefaultInstance()) {
            zs zsVarNewBuilder = zt.newBuilder((zt) this.stat_);
            zsVarNewBuilder.mergeFrom((zs) ztVar);
            ztVar = zsVarNewBuilder.buildPartial();
        }
        this.stat_ = ztVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAssistantCombinedOnboardingLegalScreenShown(zv zvVar) {
        Objects.requireNonNull(zvVar);
        if (this.statCase_ == 3 && this.stat_ != zv.getDefaultInstance()) {
            zu zuVarNewBuilder = zv.newBuilder((zv) this.stat_);
            zuVarNewBuilder.mergeFrom((zu) zvVar);
            zvVar = zuVarNewBuilder.buildPartial();
        }
        this.stat_ = zvVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAssistantFinished(aaa aaaVar) {
        Objects.requireNonNull(aaaVar);
        if (this.statCase_ == 1 && this.stat_ != aaa.getDefaultInstance()) {
            zy zyVarNewBuilder = aaa.newBuilder((aaa) this.stat_);
            zyVarNewBuilder.mergeFrom((zy) aaaVar);
            aaaVar = zyVarNewBuilder.buildPartial();
        }
        this.stat_ = aaaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAssistantInitiated(aac aacVar) {
        Objects.requireNonNull(aacVar);
        if (this.statCase_ == 6 && this.stat_ != aac.getDefaultInstance()) {
            aab aabVarNewBuilder = aac.newBuilder((aac) this.stat_);
            aabVarNewBuilder.mergeFrom((aab) aacVar);
            aacVar = aabVarNewBuilder.buildPartial();
        }
        this.stat_ = aacVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAssistantPostAction(aag aagVar) {
        Objects.requireNonNull(aagVar);
        if (this.statCase_ == 4 && this.stat_ != aag.getDefaultInstance()) {
            aae aaeVarNewBuilder = aag.newBuilder((aag) this.stat_);
            aaeVarNewBuilder.mergeFrom((aae) aagVar);
            aagVar = aaeVarNewBuilder.buildPartial();
        }
        this.stat_ = aagVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAssistantSearchbarTooltipShown(aai aaiVar) {
        Objects.requireNonNull(aaiVar);
        if (this.statCase_ == 2 && this.stat_ != aai.getDefaultInstance()) {
            aah aahVarNewBuilder = aai.newBuilder((aai) this.stat_);
            aahVarNewBuilder.mergeFrom((aah) aaiVar);
            aaiVar = aahVarNewBuilder.buildPartial();
        }
        this.stat_ = aaiVar;
        this.statCase_ = 2;
    }

    public static aak newBuilder() {
        return (aak) DEFAULT_INSTANCE.createBuilder();
    }

    public static aam parseDelimitedFrom(InputStream inputStream) {
        return (aam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aam parseFrom(com.google.v.v vVar) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aam> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantCombinedOnboardingLegalScreenClicked(zt ztVar) {
        Objects.requireNonNull(ztVar);
        this.stat_ = ztVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantCombinedOnboardingLegalScreenShown(zv zvVar) {
        Objects.requireNonNull(zvVar);
        this.stat_ = zvVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantFinished(aaa aaaVar) {
        Objects.requireNonNull(aaaVar);
        this.stat_ = aaaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantInitiated(aac aacVar) {
        Objects.requireNonNull(aacVar);
        this.stat_ = aacVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantPostAction(aag aagVar) {
        Objects.requireNonNull(aagVar);
        this.stat_ = aagVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantSearchbarTooltipShown(aai aaiVar) {
        Objects.requireNonNull(aaiVar);
        this.stat_ = aaiVar;
        this.statCase_ = 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"stat_", "statCase_", aaa.class, aai.class, zv.class, aag.class, zt.class, aac.class});
        }
        if (iOrdinal == 3) {
            return new aam();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aak(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aam> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aam.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public zt getGoogleAssistantCombinedOnboardingLegalScreenClicked() {
        return this.statCase_ == 5 ? (zt) this.stat_ : zt.getDefaultInstance();
    }

    public zv getGoogleAssistantCombinedOnboardingLegalScreenShown() {
        return this.statCase_ == 3 ? (zv) this.stat_ : zv.getDefaultInstance();
    }

    public aaa getGoogleAssistantFinished() {
        return this.statCase_ == 1 ? (aaa) this.stat_ : aaa.getDefaultInstance();
    }

    public aac getGoogleAssistantInitiated() {
        return this.statCase_ == 6 ? (aac) this.stat_ : aac.getDefaultInstance();
    }

    public aag getGoogleAssistantPostAction() {
        return this.statCase_ == 4 ? (aag) this.stat_ : aag.getDefaultInstance();
    }

    public aai getGoogleAssistantSearchbarTooltipShown() {
        return this.statCase_ == 2 ? (aai) this.stat_ : aai.getDefaultInstance();
    }

    public aal getStatCase() {
        switch (this.statCase_) {
            case 0:
                return aal.f52100g;
            case 1:
                return aal.f52094a;
            case 2:
                return aal.f52095b;
            case 3:
                return aal.f52096c;
            case 4:
                return aal.f52097d;
            case 5:
                return aal.f52098e;
            case 6:
                return aal.f52099f;
            default:
                return null;
        }
    }

    public boolean hasGoogleAssistantCombinedOnboardingLegalScreenClicked() {
        return this.statCase_ == 5;
    }

    public boolean hasGoogleAssistantCombinedOnboardingLegalScreenShown() {
        return this.statCase_ == 3;
    }

    public boolean hasGoogleAssistantFinished() {
        return this.statCase_ == 1;
    }

    public boolean hasGoogleAssistantInitiated() {
        return this.statCase_ == 6;
    }

    public boolean hasGoogleAssistantPostAction() {
        return this.statCase_ == 4;
    }

    public boolean hasGoogleAssistantSearchbarTooltipShown() {
        return this.statCase_ == 2;
    }

    public static aak newBuilder(aam aamVar) {
        return (aak) DEFAULT_INSTANCE.createBuilder(aamVar);
    }

    public static aam parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aam) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aam parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aam parseFrom(com.google.v.z zVar) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aam parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aam parseFrom(InputStream inputStream) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aam parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aam parseFrom(ByteBuffer byteBuffer) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aam parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aam parseFrom(byte[] bArr) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aam parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aam) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
