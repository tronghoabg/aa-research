package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bof extends com.google.v.du<bof, bod> implements com.google.v.fj {
    public static final int ACCOUNT_RECOVERY_FROM_ICLOUD_ATTEMPT_FIELD_NUMBER = 8;
    public static final int ACCOUNT_RECOVERY_RESULT_FIELD_NUMBER = 7;
    public static final int AUTHENTICATION_COMPLETED_FIELD_NUMBER = 6;
    private static final bof DEFAULT_INSTANCE;
    public static final int FIRST_VEHICLE_TYPE_SELECTION_SCREEN_CLICKED_FIELD_NUMBER = 12;
    public static final int FIRST_VEHICLE_TYPE_SELECTION_SCREEN_SHOWN_FIELD_NUMBER = 13;
    public static final int ONBOARDING_COMPLETED_FIELD_NUMBER = 5;
    public static final int ONBOARDING_SUMMARY_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<bof> PARSER = null;
    public static final int SET_HOME_WORK_SCREEN_CLICKED_FIELD_NUMBER = 10;
    public static final int SET_HOME_WORK_SCREEN_SHOWN_FIELD_NUMBER = 11;
    public static final int SIGN_UP_SHEET_CLICKED_FIELD_NUMBER = 1;
    public static final int SIGN_UP_SHEET_SHOWN_FIELD_NUMBER = 3;
    public static final int WELCOME_SCREEN_CLICKED_FIELD_NUMBER = 2;
    public static final int WELCOME_SCREEN_SHOWN_FIELD_NUMBER = 4;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bof bofVar = new bof();
        DEFAULT_INSTANCE = bofVar;
        com.google.v.du.registerDefaultInstance(bof.class, bofVar);
    }

    private bof() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountRecoveryFromIcloudAttempt() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountRecoveryResult() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthenticationCompleted() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstVehicleTypeSelectionScreenClicked() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstVehicleTypeSelectionScreenShown() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnboardingCompleted() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnboardingSummary() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetHomeWorkScreenClicked() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetHomeWorkScreenShown() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignUpSheetClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignUpSheetShown() {
        if (this.statCase_ == 3) {
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
    public void clearWelcomeScreenClicked() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWelcomeScreenShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bof getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountRecoveryFromIcloudAttempt(m mVar) {
        Objects.requireNonNull(mVar);
        if (this.statCase_ == 8 && this.stat_ != m.getDefaultInstance()) {
            l lVarNewBuilder = m.newBuilder((m) this.stat_);
            lVarNewBuilder.mergeFrom((l) mVar);
            mVar = lVarNewBuilder.buildPartial();
        }
        this.stat_ = mVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountRecoveryResult(o oVar) {
        Objects.requireNonNull(oVar);
        if (this.statCase_ == 7 && this.stat_ != o.getDefaultInstance()) {
            n nVarNewBuilder = o.newBuilder((o) this.stat_);
            nVarNewBuilder.mergeFrom((n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.stat_ = oVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthenticationCompleted(gh ghVar) {
        Objects.requireNonNull(ghVar);
        if (this.statCase_ == 6 && this.stat_ != gh.getDefaultInstance()) {
            gf gfVarNewBuilder = gh.newBuilder((gh) this.stat_);
            gfVarNewBuilder.mergeFrom((gf) ghVar);
            ghVar = gfVarNewBuilder.buildPartial();
        }
        this.stat_ = ghVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFirstVehicleTypeSelectionScreenClicked(wt wtVar) {
        Objects.requireNonNull(wtVar);
        if (this.statCase_ == 12 && this.stat_ != wt.getDefaultInstance()) {
            ws wsVarNewBuilder = wt.newBuilder((wt) this.stat_);
            wsVarNewBuilder.mergeFrom((ws) wtVar);
            wtVar = wsVarNewBuilder.buildPartial();
        }
        this.stat_ = wtVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFirstVehicleTypeSelectionScreenShown(wv wvVar) {
        Objects.requireNonNull(wvVar);
        if (this.statCase_ == 13 && this.stat_ != wv.getDefaultInstance()) {
            wu wuVarNewBuilder = wv.newBuilder((wv) this.stat_);
            wuVarNewBuilder.mergeFrom((wu) wvVar);
            wvVar = wuVarNewBuilder.buildPartial();
        }
        this.stat_ = wvVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnboardingCompleted(aog aogVar) {
        Objects.requireNonNull(aogVar);
        if (this.statCase_ == 5 && this.stat_ != aog.getDefaultInstance()) {
            aoe aoeVarNewBuilder = aog.newBuilder((aog) this.stat_);
            aoeVarNewBuilder.mergeFrom((aoe) aogVar);
            aogVar = aoeVarNewBuilder.buildPartial();
        }
        this.stat_ = aogVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOnboardingSummary(aok aokVar) {
        Objects.requireNonNull(aokVar);
        if (this.statCase_ == 9 && this.stat_ != aok.getDefaultInstance()) {
            aoi aoiVarNewBuilder = aok.newBuilder((aok) this.stat_);
            aoiVarNewBuilder.mergeFrom((aoi) aokVar);
            aokVar = aoiVarNewBuilder.buildPartial();
        }
        this.stat_ = aokVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetHomeWorkScreenClicked(bbm bbmVar) {
        Objects.requireNonNull(bbmVar);
        if (this.statCase_ == 10 && this.stat_ != bbm.getDefaultInstance()) {
            bbl bblVarNewBuilder = bbm.newBuilder((bbm) this.stat_);
            bblVarNewBuilder.mergeFrom((bbl) bbmVar);
            bbmVar = bblVarNewBuilder.buildPartial();
        }
        this.stat_ = bbmVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetHomeWorkScreenShown(bbo bboVar) {
        Objects.requireNonNull(bboVar);
        if (this.statCase_ == 11 && this.stat_ != bbo.getDefaultInstance()) {
            bbn bbnVarNewBuilder = bbo.newBuilder((bbo) this.stat_);
            bbnVarNewBuilder.mergeFrom((bbn) bboVar);
            bboVar = bbnVarNewBuilder.buildPartial();
        }
        this.stat_ = bboVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignUpSheetClicked(bds bdsVar) {
        Objects.requireNonNull(bdsVar);
        if (this.statCase_ == 1 && this.stat_ != bds.getDefaultInstance()) {
            bdr bdrVarNewBuilder = bds.newBuilder((bds) this.stat_);
            bdrVarNewBuilder.mergeFrom((bdr) bdsVar);
            bdsVar = bdrVarNewBuilder.buildPartial();
        }
        this.stat_ = bdsVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignUpSheetShown(bdu bduVar) {
        Objects.requireNonNull(bduVar);
        if (this.statCase_ == 3 && this.stat_ != bdu.getDefaultInstance()) {
            bdt bdtVarNewBuilder = bdu.newBuilder((bdu) this.stat_);
            bdtVarNewBuilder.mergeFrom((bdt) bduVar);
            bduVar = bdtVarNewBuilder.buildPartial();
        }
        this.stat_ = bduVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWelcomeScreenClicked(bss bssVar) {
        Objects.requireNonNull(bssVar);
        if (this.statCase_ == 2 && this.stat_ != bss.getDefaultInstance()) {
            bsr bsrVarNewBuilder = bss.newBuilder((bss) this.stat_);
            bsrVarNewBuilder.mergeFrom((bsr) bssVar);
            bssVar = bsrVarNewBuilder.buildPartial();
        }
        this.stat_ = bssVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWelcomeScreenShown(bsw bswVar) {
        Objects.requireNonNull(bswVar);
        if (this.statCase_ == 4 && this.stat_ != bsw.getDefaultInstance()) {
            bsv bsvVarNewBuilder = bsw.newBuilder((bsw) this.stat_);
            bsvVarNewBuilder.mergeFrom((bsv) bswVar);
            bswVar = bsvVarNewBuilder.buildPartial();
        }
        this.stat_ = bswVar;
        this.statCase_ = 4;
    }

    public static bod newBuilder() {
        return (bod) DEFAULT_INSTANCE.createBuilder();
    }

    public static bof parseDelimitedFrom(InputStream inputStream) {
        return (bof) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bof parseFrom(com.google.v.v vVar) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bof> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountRecoveryFromIcloudAttempt(m mVar) {
        Objects.requireNonNull(mVar);
        this.stat_ = mVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountRecoveryResult(o oVar) {
        Objects.requireNonNull(oVar);
        this.stat_ = oVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthenticationCompleted(gh ghVar) {
        Objects.requireNonNull(ghVar);
        this.stat_ = ghVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstVehicleTypeSelectionScreenClicked(wt wtVar) {
        Objects.requireNonNull(wtVar);
        this.stat_ = wtVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstVehicleTypeSelectionScreenShown(wv wvVar) {
        Objects.requireNonNull(wvVar);
        this.stat_ = wvVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnboardingCompleted(aog aogVar) {
        Objects.requireNonNull(aogVar);
        this.stat_ = aogVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnboardingSummary(aok aokVar) {
        Objects.requireNonNull(aokVar);
        this.stat_ = aokVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetHomeWorkScreenClicked(bbm bbmVar) {
        Objects.requireNonNull(bbmVar);
        this.stat_ = bbmVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetHomeWorkScreenShown(bbo bboVar) {
        Objects.requireNonNull(bboVar);
        this.stat_ = bboVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignUpSheetClicked(bds bdsVar) {
        Objects.requireNonNull(bdsVar);
        this.stat_ = bdsVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignUpSheetShown(bdu bduVar) {
        Objects.requireNonNull(bduVar);
        this.stat_ = bduVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWelcomeScreenClicked(bss bssVar) {
        Objects.requireNonNull(bssVar);
        this.stat_ = bssVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWelcomeScreenShown(bsw bswVar) {
        Objects.requireNonNull(bswVar);
        this.stat_ = bswVar;
        this.statCase_ = 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"stat_", "statCase_", bds.class, bss.class, bdu.class, bsw.class, aog.class, gh.class, o.class, m.class, aok.class, bbm.class, bbo.class, wt.class, wv.class});
        }
        if (iOrdinal == 3) {
            return new bof();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bod(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bof> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bof.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public m getAccountRecoveryFromIcloudAttempt() {
        return this.statCase_ == 8 ? (m) this.stat_ : m.getDefaultInstance();
    }

    @Deprecated
    public o getAccountRecoveryResult() {
        return this.statCase_ == 7 ? (o) this.stat_ : o.getDefaultInstance();
    }

    public gh getAuthenticationCompleted() {
        return this.statCase_ == 6 ? (gh) this.stat_ : gh.getDefaultInstance();
    }

    public wt getFirstVehicleTypeSelectionScreenClicked() {
        return this.statCase_ == 12 ? (wt) this.stat_ : wt.getDefaultInstance();
    }

    public wv getFirstVehicleTypeSelectionScreenShown() {
        return this.statCase_ == 13 ? (wv) this.stat_ : wv.getDefaultInstance();
    }

    @Deprecated
    public aog getOnboardingCompleted() {
        return this.statCase_ == 5 ? (aog) this.stat_ : aog.getDefaultInstance();
    }

    public aok getOnboardingSummary() {
        return this.statCase_ == 9 ? (aok) this.stat_ : aok.getDefaultInstance();
    }

    public bbm getSetHomeWorkScreenClicked() {
        return this.statCase_ == 10 ? (bbm) this.stat_ : bbm.getDefaultInstance();
    }

    public bbo getSetHomeWorkScreenShown() {
        return this.statCase_ == 11 ? (bbo) this.stat_ : bbo.getDefaultInstance();
    }

    @Deprecated
    public bds getSignUpSheetClicked() {
        return this.statCase_ == 1 ? (bds) this.stat_ : bds.getDefaultInstance();
    }

    @Deprecated
    public bdu getSignUpSheetShown() {
        return this.statCase_ == 3 ? (bdu) this.stat_ : bdu.getDefaultInstance();
    }

    public boe getStatCase() {
        switch (this.statCase_) {
            case 0:
                return boe.n;
            case 1:
                return boe.f54413a;
            case 2:
                return boe.f54414b;
            case 3:
                return boe.f54415c;
            case 4:
                return boe.f54416d;
            case 5:
                return boe.f54417e;
            case 6:
                return boe.f54418f;
            case 7:
                return boe.f54419g;
            case 8:
                return boe.f54420h;
            case 9:
                return boe.f54421i;
            case 10:
                return boe.f54422j;
            case 11:
                return boe.f54423k;
            case 12:
                return boe.f54424l;
            case 13:
                return boe.m;
            default:
                return null;
        }
    }

    @Deprecated
    public bss getWelcomeScreenClicked() {
        return this.statCase_ == 2 ? (bss) this.stat_ : bss.getDefaultInstance();
    }

    @Deprecated
    public bsw getWelcomeScreenShown() {
        return this.statCase_ == 4 ? (bsw) this.stat_ : bsw.getDefaultInstance();
    }

    @Deprecated
    public boolean hasAccountRecoveryFromIcloudAttempt() {
        return this.statCase_ == 8;
    }

    @Deprecated
    public boolean hasAccountRecoveryResult() {
        return this.statCase_ == 7;
    }

    public boolean hasAuthenticationCompleted() {
        return this.statCase_ == 6;
    }

    public boolean hasFirstVehicleTypeSelectionScreenClicked() {
        return this.statCase_ == 12;
    }

    public boolean hasFirstVehicleTypeSelectionScreenShown() {
        return this.statCase_ == 13;
    }

    @Deprecated
    public boolean hasOnboardingCompleted() {
        return this.statCase_ == 5;
    }

    public boolean hasOnboardingSummary() {
        return this.statCase_ == 9;
    }

    public boolean hasSetHomeWorkScreenClicked() {
        return this.statCase_ == 10;
    }

    public boolean hasSetHomeWorkScreenShown() {
        return this.statCase_ == 11;
    }

    @Deprecated
    public boolean hasSignUpSheetClicked() {
        return this.statCase_ == 1;
    }

    @Deprecated
    public boolean hasSignUpSheetShown() {
        return this.statCase_ == 3;
    }

    @Deprecated
    public boolean hasWelcomeScreenClicked() {
        return this.statCase_ == 2;
    }

    @Deprecated
    public boolean hasWelcomeScreenShown() {
        return this.statCase_ == 4;
    }

    public static bod newBuilder(bof bofVar) {
        return (bod) DEFAULT_INSTANCE.createBuilder(bofVar);
    }

    public static bof parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bof) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bof parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bof parseFrom(com.google.v.z zVar) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bof parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bof parseFrom(InputStream inputStream) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bof parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bof parseFrom(ByteBuffer byteBuffer) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bof parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bof parseFrom(byte[] bArr) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bof parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bof) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
