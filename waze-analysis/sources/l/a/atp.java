package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class atp extends com.google.v.du<atp, atn> implements com.google.v.fj {
    public static final int ALERTER_CLICKED_FIELD_NUMBER = 3;
    public static final int ALERTER_LOCATION_RESOLVED_FIELD_NUMBER = 2;
    public static final int ALERTER_NOT_SHOWN_FIELD_NUMBER = 4;
    public static final int ALERTER_SHOWN_FIELD_NUMBER = 1;
    public static final int ALERT_DISMISS_CALLED_WITHOUT_RELEVANT_INFO_FIELD_NUMBER = 6;
    public static final int CLIENT_ALERTER_SHOWN_FIELD_NUMBER = 10;
    public static final int CRASH_PRONE_ALERTER_SHOWN_FOR_BE_CAPPING_FIELD_NUMBER = 9;
    private static final atp DEFAULT_INSTANCE;
    public static final int LIVE_MATCH_CLICKED_FIELD_NUMBER = 13;
    public static final int LIVE_MATCH_SHOWN_FIELD_NUMBER = 12;
    public static final int NEW_ALERTER_SHOWN_FIELD_NUMBER = 7;
    public static final int OLD_ALERTER_SHOWN_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<atp> PARSER = null;
    public static final int SPEED_ENFORCEMENT_ZONE_BAR_SHOWN_FIELD_NUMBER = 5;
    public static final int VALIDATION_SHOWN_FIELD_NUMBER = 11;
    private int statCase_ = 0;
    private Object stat_;

    static {
        atp atpVar = new atp();
        DEFAULT_INSTANCE = atpVar;
        com.google.v.du.registerDefaultInstance(atp.class, atpVar);
    }

    private atp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDismissCalledWithoutRelevantInfo() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterLocationResolved() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterNotShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAlerterShown() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashProneAlerterShownForBeCapping() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiveMatchClicked() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLiveMatchShown() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAlerterShown() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOldAlerterShown() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedEnforcementZoneBarShown() {
        if (this.statCase_ == 5) {
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
    public void clearValidationShown() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static atp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDismissCalledWithoutRelevantInfo(cd cdVar) {
        Objects.requireNonNull(cdVar);
        if (this.statCase_ == 6 && this.stat_ != cd.getDefaultInstance()) {
            cc ccVarNewBuilder = cd.newBuilder((cd) this.stat_);
            ccVarNewBuilder.mergeFrom((cc) cdVar);
            cdVar = ccVarNewBuilder.buildPartial();
        }
        this.stat_ = cdVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterClicked(ci ciVar) {
        Objects.requireNonNull(ciVar);
        if (this.statCase_ == 3 && this.stat_ != ci.getDefaultInstance()) {
            cg cgVarNewBuilder = ci.newBuilder((ci) this.stat_);
            cgVarNewBuilder.mergeFrom((cg) ciVar);
            ciVar = cgVarNewBuilder.buildPartial();
        }
        this.stat_ = ciVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterLocationResolved(co coVar) {
        Objects.requireNonNull(coVar);
        if (this.statCase_ == 2 && this.stat_ != co.getDefaultInstance()) {
            cm cmVarNewBuilder = co.newBuilder((co) this.stat_);
            cmVarNewBuilder.mergeFrom((cm) coVar);
            coVar = cmVarNewBuilder.buildPartial();
        }
        this.stat_ = coVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterNotShown(cr crVar) {
        Objects.requireNonNull(crVar);
        if (this.statCase_ == 4 && this.stat_ != cr.getDefaultInstance()) {
            cp cpVarNewBuilder = cr.newBuilder((cr) this.stat_);
            cpVarNewBuilder.mergeFrom((cp) crVar);
            crVar = cpVarNewBuilder.buildPartial();
        }
        this.stat_ = crVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterShown(dc dcVar) {
        Objects.requireNonNull(dcVar);
        if (this.statCase_ == 1 && this.stat_ != dc.getDefaultInstance()) {
            db dbVarNewBuilder = dc.newBuilder((dc) this.stat_);
            dbVarNewBuilder.mergeFrom((db) dcVar);
            dcVar = dbVarNewBuilder.buildPartial();
        }
        this.stat_ = dcVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientAlerterShown(kg kgVar) {
        Objects.requireNonNull(kgVar);
        if (this.statCase_ == 10 && this.stat_ != kg.getDefaultInstance()) {
            kf kfVarNewBuilder = kg.newBuilder((kg) this.stat_);
            kfVarNewBuilder.mergeFrom((kf) kgVar);
            kgVar = kfVarNewBuilder.buildPartial();
        }
        this.stat_ = kgVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrashProneAlerterShownForBeCapping(pc pcVar) {
        Objects.requireNonNull(pcVar);
        if (this.statCase_ == 9 && this.stat_ != pc.getDefaultInstance()) {
            pb pbVarNewBuilder = pc.newBuilder((pc) this.stat_);
            pbVarNewBuilder.mergeFrom((pb) pcVar);
            pcVar = pbVarNewBuilder.buildPartial();
        }
        this.stat_ = pcVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLiveMatchClicked(agd agdVar) {
        Objects.requireNonNull(agdVar);
        if (this.statCase_ == 13 && this.stat_ != agd.getDefaultInstance()) {
            agc agcVarNewBuilder = agd.newBuilder((agd) this.stat_);
            agcVarNewBuilder.mergeFrom((agc) agdVar);
            agdVar = agcVarNewBuilder.buildPartial();
        }
        this.stat_ = agdVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLiveMatchShown(agg aggVar) {
        Objects.requireNonNull(aggVar);
        if (this.statCase_ == 12 && this.stat_ != agg.getDefaultInstance()) {
            age ageVarNewBuilder = agg.newBuilder((agg) this.stat_);
            ageVarNewBuilder.mergeFrom((age) aggVar);
            aggVar = ageVarNewBuilder.buildPartial();
        }
        this.stat_ = aggVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNewAlerterShown(anm anmVar) {
        Objects.requireNonNull(anmVar);
        if (this.statCase_ == 7 && this.stat_ != anm.getDefaultInstance()) {
            anl anlVarNewBuilder = anm.newBuilder((anm) this.stat_);
            anlVarNewBuilder.mergeFrom((anl) anmVar);
            anmVar = anlVarNewBuilder.buildPartial();
        }
        this.stat_ = anmVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOldAlerterShown(aod aodVar) {
        Objects.requireNonNull(aodVar);
        if (this.statCase_ == 8 && this.stat_ != aod.getDefaultInstance()) {
            aoc aocVarNewBuilder = aod.newBuilder((aod) this.stat_);
            aocVarNewBuilder.mergeFrom((aoc) aodVar);
            aodVar = aocVarNewBuilder.buildPartial();
        }
        this.stat_ = aodVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedEnforcementZoneBarShown(bfs bfsVar) {
        Objects.requireNonNull(bfsVar);
        if (this.statCase_ == 5 && this.stat_ != bfs.getDefaultInstance()) {
            bfr bfrVarNewBuilder = bfs.newBuilder((bfs) this.stat_);
            bfrVarNewBuilder.mergeFrom((bfr) bfsVar);
            bfsVar = bfrVarNewBuilder.buildPartial();
        }
        this.stat_ = bfsVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidationShown(bpl bplVar) {
        Objects.requireNonNull(bplVar);
        if (this.statCase_ == 11 && this.stat_ != bpl.getDefaultInstance()) {
            bpk bpkVarNewBuilder = bpl.newBuilder((bpl) this.stat_);
            bpkVarNewBuilder.mergeFrom((bpk) bplVar);
            bplVar = bpkVarNewBuilder.buildPartial();
        }
        this.stat_ = bplVar;
        this.statCase_ = 11;
    }

    public static atn newBuilder() {
        return (atn) DEFAULT_INSTANCE.createBuilder();
    }

    public static atp parseDelimitedFrom(InputStream inputStream) {
        return (atp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atp parseFrom(com.google.v.v vVar) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<atp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDismissCalledWithoutRelevantInfo(cd cdVar) {
        Objects.requireNonNull(cdVar);
        this.stat_ = cdVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterClicked(ci ciVar) {
        Objects.requireNonNull(ciVar);
        this.stat_ = ciVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterLocationResolved(co coVar) {
        Objects.requireNonNull(coVar);
        this.stat_ = coVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterNotShown(cr crVar) {
        Objects.requireNonNull(crVar);
        this.stat_ = crVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterShown(dc dcVar) {
        Objects.requireNonNull(dcVar);
        this.stat_ = dcVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAlerterShown(kg kgVar) {
        Objects.requireNonNull(kgVar);
        this.stat_ = kgVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashProneAlerterShownForBeCapping(pc pcVar) {
        Objects.requireNonNull(pcVar);
        this.stat_ = pcVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiveMatchClicked(agd agdVar) {
        Objects.requireNonNull(agdVar);
        this.stat_ = agdVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLiveMatchShown(agg aggVar) {
        Objects.requireNonNull(aggVar);
        this.stat_ = aggVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAlerterShown(anm anmVar) {
        Objects.requireNonNull(anmVar);
        this.stat_ = anmVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOldAlerterShown(aod aodVar) {
        Objects.requireNonNull(aodVar);
        this.stat_ = aodVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedEnforcementZoneBarShown(bfs bfsVar) {
        Objects.requireNonNull(bfsVar);
        this.stat_ = bfsVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidationShown(bpl bplVar) {
        Objects.requireNonNull(bplVar);
        this.stat_ = bplVar;
        this.statCase_ = 11;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"stat_", "statCase_", dc.class, co.class, ci.class, cr.class, bfs.class, cd.class, anm.class, aod.class, pc.class, kg.class, bpl.class, agg.class, agd.class});
        }
        if (iOrdinal == 3) {
            return new atp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new atn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<atp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (atp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cd getAlertDismissCalledWithoutRelevantInfo() {
        return this.statCase_ == 6 ? (cd) this.stat_ : cd.getDefaultInstance();
    }

    public ci getAlerterClicked() {
        return this.statCase_ == 3 ? (ci) this.stat_ : ci.getDefaultInstance();
    }

    public co getAlerterLocationResolved() {
        return this.statCase_ == 2 ? (co) this.stat_ : co.getDefaultInstance();
    }

    public cr getAlerterNotShown() {
        return this.statCase_ == 4 ? (cr) this.stat_ : cr.getDefaultInstance();
    }

    public dc getAlerterShown() {
        return this.statCase_ == 1 ? (dc) this.stat_ : dc.getDefaultInstance();
    }

    @Deprecated
    public kg getClientAlerterShown() {
        return this.statCase_ == 10 ? (kg) this.stat_ : kg.getDefaultInstance();
    }

    public pc getCrashProneAlerterShownForBeCapping() {
        return this.statCase_ == 9 ? (pc) this.stat_ : pc.getDefaultInstance();
    }

    public agd getLiveMatchClicked() {
        return this.statCase_ == 13 ? (agd) this.stat_ : agd.getDefaultInstance();
    }

    public agg getLiveMatchShown() {
        return this.statCase_ == 12 ? (agg) this.stat_ : agg.getDefaultInstance();
    }

    public anm getNewAlerterShown() {
        return this.statCase_ == 7 ? (anm) this.stat_ : anm.getDefaultInstance();
    }

    public aod getOldAlerterShown() {
        return this.statCase_ == 8 ? (aod) this.stat_ : aod.getDefaultInstance();
    }

    public bfs getSpeedEnforcementZoneBarShown() {
        return this.statCase_ == 5 ? (bfs) this.stat_ : bfs.getDefaultInstance();
    }

    public ato getStatCase() {
        switch (this.statCase_) {
            case 0:
                return ato.n;
            case 1:
                return ato.f53137a;
            case 2:
                return ato.f53138b;
            case 3:
                return ato.f53139c;
            case 4:
                return ato.f53140d;
            case 5:
                return ato.f53141e;
            case 6:
                return ato.f53142f;
            case 7:
                return ato.f53143g;
            case 8:
                return ato.f53144h;
            case 9:
                return ato.f53145i;
            case 10:
                return ato.f53146j;
            case 11:
                return ato.f53147k;
            case 12:
                return ato.f53148l;
            case 13:
                return ato.m;
            default:
                return null;
        }
    }

    public bpl getValidationShown() {
        return this.statCase_ == 11 ? (bpl) this.stat_ : bpl.getDefaultInstance();
    }

    public boolean hasAlertDismissCalledWithoutRelevantInfo() {
        return this.statCase_ == 6;
    }

    public boolean hasAlerterClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasAlerterLocationResolved() {
        return this.statCase_ == 2;
    }

    public boolean hasAlerterNotShown() {
        return this.statCase_ == 4;
    }

    public boolean hasAlerterShown() {
        return this.statCase_ == 1;
    }

    @Deprecated
    public boolean hasClientAlerterShown() {
        return this.statCase_ == 10;
    }

    public boolean hasCrashProneAlerterShownForBeCapping() {
        return this.statCase_ == 9;
    }

    public boolean hasLiveMatchClicked() {
        return this.statCase_ == 13;
    }

    public boolean hasLiveMatchShown() {
        return this.statCase_ == 12;
    }

    public boolean hasNewAlerterShown() {
        return this.statCase_ == 7;
    }

    public boolean hasOldAlerterShown() {
        return this.statCase_ == 8;
    }

    public boolean hasSpeedEnforcementZoneBarShown() {
        return this.statCase_ == 5;
    }

    public boolean hasValidationShown() {
        return this.statCase_ == 11;
    }

    public static atn newBuilder(atp atpVar) {
        return (atn) DEFAULT_INSTANCE.createBuilder(atpVar);
    }

    public static atp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static atp parseFrom(com.google.v.z zVar) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static atp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static atp parseFrom(InputStream inputStream) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atp parseFrom(ByteBuffer byteBuffer) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static atp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static atp parseFrom(byte[] bArr) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static atp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (atp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
