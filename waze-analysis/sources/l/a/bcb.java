package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bcb extends com.google.v.du<bcb, bbz> implements com.google.v.fj {
    public static final int ACCOUNT_AND_LOGIN_SETTINGS_EXTRA_INFO_FIELD_NUMBER = 14;
    public static final int ALERTER_SETTINGS_POPUP_CLICKED_FIELD_NUMBER = 17;
    public static final int ALERTER_SETTINGS_POPUP_SHOWN_FIELD_NUMBER = 18;
    public static final int CURRENT_VOICE_FIELD_NUMBER = 2;
    private static final bcb DEFAULT_INSTANCE;
    public static final int GUIDANCE_SOUND_MODE_SELECTED_FIELD_NUMBER = 15;
    private static volatile com.google.v.fo<bcb> PARSER = null;
    public static final int PERMITS_SETTINGS_SCREEN_CLICKED_FIELD_NUMBER = 16;
    public static final int QUICK_ROUTE_SETTINGS_CLICKED_FIELD_NUMBER = 3;
    public static final int QUICK_ROUTE_SETTINGS_CLOSED_FIELD_NUMBER = 4;
    public static final int QUICK_ROUTE_SETTINGS_SHOWN_FIELD_NUMBER = 5;
    public static final int SETTINGS_FIELD_NUMBER = 13;
    public static final int SETTINGS_MAIN_SETTINGS_FIELD_NUMBER = 1;
    public static final int SOUND_ALERTS_ONLY_SELECTED_FIELD_NUMBER = 6;
    public static final int SOUND_MUTE_SELECTED_FIELD_NUMBER = 11;
    public static final int SOUND_ON_SELECTED_FIELD_NUMBER = 12;
    public static final int SOUND_OPTIONS_POPUP_CLICKED_FIELD_NUMBER = 7;
    public static final int SOUND_OPTIONS_POPUP_SHOWN_FIELD_NUMBER = 8;
    public static final int SOUND_SETTINGS_BUTTON_CLICKED_FIELD_NUMBER = 10;
    public static final int VEHICLE_TYPE_SELECTED_FIELD_NUMBER = 9;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bcb bcbVar = new bcb();
        DEFAULT_INSTANCE = bcbVar;
        com.google.v.du.registerDefaultInstance(bcb.class, bcbVar);
    }

    private bcb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountAndLoginSettingsExtraInfo() {
        if (this.statCase_ == 14) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterSettingsPopupClicked() {
        if (this.statCase_ == 17) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterSettingsPopupShown() {
        if (this.statCase_ == 18) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentVoice() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidanceSoundModeSelected() {
        if (this.statCase_ == 15) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermitsSettingsScreenClicked() {
        if (this.statCase_ == 16) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuickRouteSettingsClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuickRouteSettingsClosed() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuickRouteSettingsShown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettings() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsMainSettings() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundAlertsOnlySelected() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundMuteSelected() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundOnSelected() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundOptionsPopupClicked() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundOptionsPopupShown() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundSettingsButtonClicked() {
        if (this.statCase_ == 10) {
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
    public void clearVehicleTypeSelected() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bcb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAccountAndLoginSettingsExtraInfo(d dVar) {
        Objects.requireNonNull(dVar);
        if (this.statCase_ == 14 && this.stat_ != d.getDefaultInstance()) {
            a aVarNewBuilder = d.newBuilder((d) this.stat_);
            aVarNewBuilder.mergeFrom((a) dVar);
            dVar = aVarNewBuilder.buildPartial();
        }
        this.stat_ = dVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterSettingsPopupClicked(cx cxVar) {
        Objects.requireNonNull(cxVar);
        if (this.statCase_ == 17 && this.stat_ != cx.getDefaultInstance()) {
            cw cwVarNewBuilder = cx.newBuilder((cx) this.stat_);
            cwVarNewBuilder.mergeFrom((cw) cxVar);
            cxVar = cwVarNewBuilder.buildPartial();
        }
        this.stat_ = cxVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterSettingsPopupShown(cz czVar) {
        Objects.requireNonNull(czVar);
        if (this.statCase_ == 18 && this.stat_ != cz.getDefaultInstance()) {
            cy cyVarNewBuilder = cz.newBuilder((cz) this.stat_);
            cyVarNewBuilder.mergeFrom((cy) czVar);
            czVar = cyVarNewBuilder.buildPartial();
        }
        this.stat_ = czVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentVoice(pg pgVar) {
        Objects.requireNonNull(pgVar);
        if (this.statCase_ == 2 && this.stat_ != pg.getDefaultInstance()) {
            pf pfVarNewBuilder = pg.newBuilder((pg) this.stat_);
            pfVarNewBuilder.mergeFrom((pf) pgVar);
            pgVar = pfVarNewBuilder.buildPartial();
        }
        this.stat_ = pgVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGuidanceSoundModeSelected(abb abbVar) {
        Objects.requireNonNull(abbVar);
        if (this.statCase_ == 15 && this.stat_ != abb.getDefaultInstance()) {
            aay aayVarNewBuilder = abb.newBuilder((abb) this.stat_);
            aayVarNewBuilder.mergeFrom((aay) abbVar);
            abbVar = aayVarNewBuilder.buildPartial();
        }
        this.stat_ = abbVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePermitsSettingsScreenClicked(aqj aqjVar) {
        Objects.requireNonNull(aqjVar);
        if (this.statCase_ == 16 && this.stat_ != aqj.getDefaultInstance()) {
            aqi aqiVarNewBuilder = aqj.newBuilder((aqj) this.stat_);
            aqiVarNewBuilder.mergeFrom((aqi) aqjVar);
            aqjVar = aqiVarNewBuilder.buildPartial();
        }
        this.stat_ = aqjVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuickRouteSettingsClicked(ath athVar) {
        Objects.requireNonNull(athVar);
        if (this.statCase_ == 3 && this.stat_ != ath.getDefaultInstance()) {
            atg atgVarNewBuilder = ath.newBuilder((ath) this.stat_);
            atgVarNewBuilder.mergeFrom((atg) athVar);
            athVar = atgVarNewBuilder.buildPartial();
        }
        this.stat_ = athVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuickRouteSettingsClosed(atj atjVar) {
        Objects.requireNonNull(atjVar);
        if (this.statCase_ == 4 && this.stat_ != atj.getDefaultInstance()) {
            ati atiVarNewBuilder = atj.newBuilder((atj) this.stat_);
            atiVarNewBuilder.mergeFrom((ati) atjVar);
            atjVar = atiVarNewBuilder.buildPartial();
        }
        this.stat_ = atjVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuickRouteSettingsShown(atm atmVar) {
        Objects.requireNonNull(atmVar);
        if (this.statCase_ == 5 && this.stat_ != atm.getDefaultInstance()) {
            atl atlVarNewBuilder = atm.newBuilder((atm) this.stat_);
            atlVarNewBuilder.mergeFrom((atl) atmVar);
            atmVar = atlVarNewBuilder.buildPartial();
        }
        this.stat_ = atmVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSettings(bby bbyVar) {
        Objects.requireNonNull(bbyVar);
        if (this.statCase_ == 13 && this.stat_ != bby.getDefaultInstance()) {
            bbw bbwVarNewBuilder = bby.newBuilder((bby) this.stat_);
            bbwVarNewBuilder.mergeFrom((bbw) bbyVar);
            bbyVar = bbwVarNewBuilder.buildPartial();
        }
        this.stat_ = bbyVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSettingsMainSettings(bbv bbvVar) {
        Objects.requireNonNull(bbvVar);
        if (this.statCase_ == 1 && this.stat_ != bbv.getDefaultInstance()) {
            bbt bbtVarNewBuilder = bbv.newBuilder((bbv) this.stat_);
            bbtVarNewBuilder.mergeFrom((bbt) bbvVar);
            bbvVar = bbtVarNewBuilder.buildPartial();
        }
        this.stat_ = bbvVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoundAlertsOnlySelected(bey beyVar) {
        Objects.requireNonNull(beyVar);
        if (this.statCase_ == 6 && this.stat_ != bey.getDefaultInstance()) {
            bex bexVarNewBuilder = bey.newBuilder((bey) this.stat_);
            bexVarNewBuilder.mergeFrom((bex) beyVar);
            beyVar = bexVarNewBuilder.buildPartial();
        }
        this.stat_ = beyVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoundMuteSelected(bfa bfaVar) {
        Objects.requireNonNull(bfaVar);
        if (this.statCase_ == 11 && this.stat_ != bfa.getDefaultInstance()) {
            bez bezVarNewBuilder = bfa.newBuilder((bfa) this.stat_);
            bezVarNewBuilder.mergeFrom((bez) bfaVar);
            bfaVar = bezVarNewBuilder.buildPartial();
        }
        this.stat_ = bfaVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoundOnSelected(bfc bfcVar) {
        Objects.requireNonNull(bfcVar);
        if (this.statCase_ == 12 && this.stat_ != bfc.getDefaultInstance()) {
            bfb bfbVarNewBuilder = bfc.newBuilder((bfc) this.stat_);
            bfbVarNewBuilder.mergeFrom((bfb) bfcVar);
            bfcVar = bfbVarNewBuilder.buildPartial();
        }
        this.stat_ = bfcVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoundOptionsPopupClicked(bff bffVar) {
        Objects.requireNonNull(bffVar);
        if (this.statCase_ == 7 && this.stat_ != bff.getDefaultInstance()) {
            bfe bfeVarNewBuilder = bff.newBuilder((bff) this.stat_);
            bfeVarNewBuilder.mergeFrom((bfe) bffVar);
            bffVar = bfeVarNewBuilder.buildPartial();
        }
        this.stat_ = bffVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoundOptionsPopupShown(bfh bfhVar) {
        Objects.requireNonNull(bfhVar);
        if (this.statCase_ == 8 && this.stat_ != bfh.getDefaultInstance()) {
            bfg bfgVarNewBuilder = bfh.newBuilder((bfh) this.stat_);
            bfgVarNewBuilder.mergeFrom((bfg) bfhVar);
            bfhVar = bfgVarNewBuilder.buildPartial();
        }
        this.stat_ = bfhVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSoundSettingsButtonClicked(bfm bfmVar) {
        Objects.requireNonNull(bfmVar);
        if (this.statCase_ == 10 && this.stat_ != bfm.getDefaultInstance()) {
            bfl bflVarNewBuilder = bfm.newBuilder((bfm) this.stat_);
            bflVarNewBuilder.mergeFrom((bfl) bfmVar);
            bfmVar = bflVarNewBuilder.buildPartial();
        }
        this.stat_ = bfmVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleTypeSelected(bpp bppVar) {
        Objects.requireNonNull(bppVar);
        if (this.statCase_ == 9 && this.stat_ != bpp.getDefaultInstance()) {
            bpm bpmVarNewBuilder = bpp.newBuilder((bpp) this.stat_);
            bpmVarNewBuilder.mergeFrom((bpm) bppVar);
            bppVar = bpmVarNewBuilder.buildPartial();
        }
        this.stat_ = bppVar;
        this.statCase_ = 9;
    }

    public static bbz newBuilder() {
        return (bbz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bcb parseDelimitedFrom(InputStream inputStream) {
        return (bcb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcb parseFrom(com.google.v.v vVar) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bcb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountAndLoginSettingsExtraInfo(d dVar) {
        Objects.requireNonNull(dVar);
        this.stat_ = dVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterSettingsPopupClicked(cx cxVar) {
        Objects.requireNonNull(cxVar);
        this.stat_ = cxVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterSettingsPopupShown(cz czVar) {
        Objects.requireNonNull(czVar);
        this.stat_ = czVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentVoice(pg pgVar) {
        Objects.requireNonNull(pgVar);
        this.stat_ = pgVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceSoundModeSelected(abb abbVar) {
        Objects.requireNonNull(abbVar);
        this.stat_ = abbVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermitsSettingsScreenClicked(aqj aqjVar) {
        Objects.requireNonNull(aqjVar);
        this.stat_ = aqjVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuickRouteSettingsClicked(ath athVar) {
        Objects.requireNonNull(athVar);
        this.stat_ = athVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuickRouteSettingsClosed(atj atjVar) {
        Objects.requireNonNull(atjVar);
        this.stat_ = atjVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuickRouteSettingsShown(atm atmVar) {
        Objects.requireNonNull(atmVar);
        this.stat_ = atmVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettings(bby bbyVar) {
        Objects.requireNonNull(bbyVar);
        this.stat_ = bbyVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsMainSettings(bbv bbvVar) {
        Objects.requireNonNull(bbvVar);
        this.stat_ = bbvVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundAlertsOnlySelected(bey beyVar) {
        Objects.requireNonNull(beyVar);
        this.stat_ = beyVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundMuteSelected(bfa bfaVar) {
        Objects.requireNonNull(bfaVar);
        this.stat_ = bfaVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundOnSelected(bfc bfcVar) {
        Objects.requireNonNull(bfcVar);
        this.stat_ = bfcVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundOptionsPopupClicked(bff bffVar) {
        Objects.requireNonNull(bffVar);
        this.stat_ = bffVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundOptionsPopupShown(bfh bfhVar) {
        Objects.requireNonNull(bfhVar);
        this.stat_ = bfhVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundSettingsButtonClicked(bfm bfmVar) {
        Objects.requireNonNull(bfmVar);
        this.stat_ = bfmVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleTypeSelected(bpp bppVar) {
        Objects.requireNonNull(bppVar);
        this.stat_ = bppVar;
        this.statCase_ = 9;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"stat_", "statCase_", bbv.class, pg.class, ath.class, atj.class, atm.class, bey.class, bff.class, bfh.class, bpp.class, bfm.class, bfa.class, bfc.class, bby.class, d.class, abb.class, aqj.class, cx.class, cz.class});
        }
        if (iOrdinal == 3) {
            return new bcb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bcb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bcb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public d getAccountAndLoginSettingsExtraInfo() {
        return this.statCase_ == 14 ? (d) this.stat_ : d.getDefaultInstance();
    }

    public cx getAlerterSettingsPopupClicked() {
        return this.statCase_ == 17 ? (cx) this.stat_ : cx.getDefaultInstance();
    }

    public cz getAlerterSettingsPopupShown() {
        return this.statCase_ == 18 ? (cz) this.stat_ : cz.getDefaultInstance();
    }

    public pg getCurrentVoice() {
        return this.statCase_ == 2 ? (pg) this.stat_ : pg.getDefaultInstance();
    }

    public abb getGuidanceSoundModeSelected() {
        return this.statCase_ == 15 ? (abb) this.stat_ : abb.getDefaultInstance();
    }

    public aqj getPermitsSettingsScreenClicked() {
        return this.statCase_ == 16 ? (aqj) this.stat_ : aqj.getDefaultInstance();
    }

    public ath getQuickRouteSettingsClicked() {
        return this.statCase_ == 3 ? (ath) this.stat_ : ath.getDefaultInstance();
    }

    public atj getQuickRouteSettingsClosed() {
        return this.statCase_ == 4 ? (atj) this.stat_ : atj.getDefaultInstance();
    }

    public atm getQuickRouteSettingsShown() {
        return this.statCase_ == 5 ? (atm) this.stat_ : atm.getDefaultInstance();
    }

    public bby getSettings() {
        return this.statCase_ == 13 ? (bby) this.stat_ : bby.getDefaultInstance();
    }

    @Deprecated
    public bbv getSettingsMainSettings() {
        return this.statCase_ == 1 ? (bbv) this.stat_ : bbv.getDefaultInstance();
    }

    public bey getSoundAlertsOnlySelected() {
        return this.statCase_ == 6 ? (bey) this.stat_ : bey.getDefaultInstance();
    }

    public bfa getSoundMuteSelected() {
        return this.statCase_ == 11 ? (bfa) this.stat_ : bfa.getDefaultInstance();
    }

    public bfc getSoundOnSelected() {
        return this.statCase_ == 12 ? (bfc) this.stat_ : bfc.getDefaultInstance();
    }

    public bff getSoundOptionsPopupClicked() {
        return this.statCase_ == 7 ? (bff) this.stat_ : bff.getDefaultInstance();
    }

    public bfh getSoundOptionsPopupShown() {
        return this.statCase_ == 8 ? (bfh) this.stat_ : bfh.getDefaultInstance();
    }

    public bfm getSoundSettingsButtonClicked() {
        return this.statCase_ == 10 ? (bfm) this.stat_ : bfm.getDefaultInstance();
    }

    public bca getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bca.s;
            case 1:
                return bca.f53708a;
            case 2:
                return bca.f53709b;
            case 3:
                return bca.f53710c;
            case 4:
                return bca.f53711d;
            case 5:
                return bca.f53712e;
            case 6:
                return bca.f53713f;
            case 7:
                return bca.f53714g;
            case 8:
                return bca.f53715h;
            case 9:
                return bca.f53716i;
            case 10:
                return bca.f53717j;
            case 11:
                return bca.f53718k;
            case 12:
                return bca.f53719l;
            case 13:
                return bca.m;
            case 14:
                return bca.n;
            case 15:
                return bca.o;
            case 16:
                return bca.p;
            case 17:
                return bca.q;
            case 18:
                return bca.r;
            default:
                return null;
        }
    }

    public bpp getVehicleTypeSelected() {
        return this.statCase_ == 9 ? (bpp) this.stat_ : bpp.getDefaultInstance();
    }

    public boolean hasAccountAndLoginSettingsExtraInfo() {
        return this.statCase_ == 14;
    }

    public boolean hasAlerterSettingsPopupClicked() {
        return this.statCase_ == 17;
    }

    public boolean hasAlerterSettingsPopupShown() {
        return this.statCase_ == 18;
    }

    public boolean hasCurrentVoice() {
        return this.statCase_ == 2;
    }

    public boolean hasGuidanceSoundModeSelected() {
        return this.statCase_ == 15;
    }

    public boolean hasPermitsSettingsScreenClicked() {
        return this.statCase_ == 16;
    }

    public boolean hasQuickRouteSettingsClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasQuickRouteSettingsClosed() {
        return this.statCase_ == 4;
    }

    public boolean hasQuickRouteSettingsShown() {
        return this.statCase_ == 5;
    }

    public boolean hasSettings() {
        return this.statCase_ == 13;
    }

    @Deprecated
    public boolean hasSettingsMainSettings() {
        return this.statCase_ == 1;
    }

    public boolean hasSoundAlertsOnlySelected() {
        return this.statCase_ == 6;
    }

    public boolean hasSoundMuteSelected() {
        return this.statCase_ == 11;
    }

    public boolean hasSoundOnSelected() {
        return this.statCase_ == 12;
    }

    public boolean hasSoundOptionsPopupClicked() {
        return this.statCase_ == 7;
    }

    public boolean hasSoundOptionsPopupShown() {
        return this.statCase_ == 8;
    }

    public boolean hasSoundSettingsButtonClicked() {
        return this.statCase_ == 10;
    }

    public boolean hasVehicleTypeSelected() {
        return this.statCase_ == 9;
    }

    public static bbz newBuilder(bcb bcbVar) {
        return (bbz) DEFAULT_INSTANCE.createBuilder(bcbVar);
    }

    public static bcb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bcb parseFrom(com.google.v.z zVar) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bcb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bcb parseFrom(InputStream inputStream) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bcb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bcb parseFrom(ByteBuffer byteBuffer) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bcb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bcb parseFrom(byte[] bArr) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bcb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bcb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
