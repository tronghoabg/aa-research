package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gx extends com.google.v.du<gx, gw> implements com.google.v.fj {
    private static final gx DEFAULT_INSTANCE;
    public static final int HOV_PERMIT_CONFIGS_FIELD_NUMBER = 6;
    public static final int IN_CAR_REPORT_CATEGORIES_FIELD_NUMBER = 11;
    public static final int LIMITS_FIELD_NUMBER = 2;
    public static final int MAP_CARS_FIELD_NUMBER = 3;
    public static final int MOODS_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<gx> PARSER = null;
    public static final int REPORT_CATEGORIES_FIELD_NUMBER = 10;
    public static final int REPORT_HIGHLIGHTS_FIELD_NUMBER = 13;
    public static final int SETTINGS_BUNDLE_CAMPAIGNS_FIELD_NUMBER = 8;
    public static final int TRANSPORTATION_FIELD_NUMBER = 1;
    public static final int VOICE_PROMPTS_FIELD_NUMBER = 4;
    public static final int VOICE_REPORT_CATEGORIES_FIELD_NUMBER = 12;
    public static final int VOICE_SEARCH_LANGS_FIELD_NUMBER = 5;
    public static final int WEB_URL_WHITE_LIST_FIELD_NUMBER = 9;
    private int bitField0_;
    private fz hovPermitConfigs_;
    private fj inCarReportCategories_;
    private hq limits_;
    private gk mapCars_;
    private gr moods_;
    private fj reportCategories_;
    private he reportHighlights_;
    private hl settingsBundleCampaigns_;
    private hu transportation_;
    private i.b.w.o voicePrompts_;
    private fj voiceReportCategories_;
    private id voiceSearchLangs_;
    private il webUrlWhiteList_;

    static {
        gx gxVar = new gx();
        DEFAULT_INSTANCE = gxVar;
        com.google.v.du.registerDefaultInstance(gx.class, gxVar);
    }

    private gx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovPermitConfigs() {
        this.hovPermitConfigs_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarReportCategories() {
        this.inCarReportCategories_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimits() {
        this.limits_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapCars() {
        this.mapCars_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMoods() {
        this.moods_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportCategories() {
        this.reportCategories_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportHighlights() {
        this.reportHighlights_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSettingsBundleCampaigns() {
        this.settingsBundleCampaigns_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportation() {
        this.transportation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoicePrompts() {
        this.voicePrompts_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceReportCategories() {
        this.voiceReportCategories_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceSearchLangs() {
        this.voiceSearchLangs_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebUrlWhiteList() {
        this.webUrlWhiteList_ = null;
        this.bitField0_ &= -257;
    }

    public static gx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovPermitConfigs(fz fzVar) {
        Objects.requireNonNull(fzVar);
        fz fzVar2 = this.hovPermitConfigs_;
        if (fzVar2 != null && fzVar2 != fz.getDefaultInstance()) {
            fy fyVarNewBuilder = fz.newBuilder(fzVar2);
            fyVarNewBuilder.mergeFrom((fy) fzVar);
            fzVar = fyVarNewBuilder.buildPartial();
        }
        this.hovPermitConfigs_ = fzVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarReportCategories(fj fjVar) {
        Objects.requireNonNull(fjVar);
        fj fjVar2 = this.inCarReportCategories_;
        if (fjVar2 != null && fjVar2 != fj.getDefaultInstance()) {
            fi fiVarNewBuilder = fj.newBuilder(fjVar2);
            fiVarNewBuilder.mergeFrom((fi) fjVar);
            fjVar = fiVarNewBuilder.buildPartial();
        }
        this.inCarReportCategories_ = fjVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLimits(hq hqVar) {
        Objects.requireNonNull(hqVar);
        hq hqVar2 = this.limits_;
        if (hqVar2 != null && hqVar2 != hq.getDefaultInstance()) {
            hp hpVarNewBuilder = hq.newBuilder(hqVar2);
            hpVarNewBuilder.mergeFrom((hp) hqVar);
            hqVar = hpVarNewBuilder.buildPartial();
        }
        this.limits_ = hqVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapCars(gk gkVar) {
        Objects.requireNonNull(gkVar);
        gk gkVar2 = this.mapCars_;
        if (gkVar2 != null && gkVar2 != gk.getDefaultInstance()) {
            gj gjVarNewBuilder = gk.newBuilder(gkVar2);
            gjVarNewBuilder.mergeFrom((gj) gkVar);
            gkVar = gjVarNewBuilder.buildPartial();
        }
        this.mapCars_ = gkVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMoods(gr grVar) {
        Objects.requireNonNull(grVar);
        gr grVar2 = this.moods_;
        if (grVar2 != null && grVar2 != gr.getDefaultInstance()) {
            gq gqVarNewBuilder = gr.newBuilder(grVar2);
            gqVarNewBuilder.mergeFrom((gq) grVar);
            grVar = gqVarNewBuilder.buildPartial();
        }
        this.moods_ = grVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportCategories(fj fjVar) {
        Objects.requireNonNull(fjVar);
        fj fjVar2 = this.reportCategories_;
        if (fjVar2 != null && fjVar2 != fj.getDefaultInstance()) {
            fi fiVarNewBuilder = fj.newBuilder(fjVar2);
            fiVarNewBuilder.mergeFrom((fi) fjVar);
            fjVar = fiVarNewBuilder.buildPartial();
        }
        this.reportCategories_ = fjVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportHighlights(he heVar) {
        Objects.requireNonNull(heVar);
        he heVar2 = this.reportHighlights_;
        if (heVar2 != null && heVar2 != he.getDefaultInstance()) {
            hd hdVarNewBuilder = he.newBuilder(heVar2);
            hdVarNewBuilder.mergeFrom((hd) heVar);
            heVar = hdVarNewBuilder.buildPartial();
        }
        this.reportHighlights_ = heVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSettingsBundleCampaigns(hl hlVar) {
        Objects.requireNonNull(hlVar);
        hl hlVar2 = this.settingsBundleCampaigns_;
        if (hlVar2 != null && hlVar2 != hl.getDefaultInstance()) {
            hk hkVarNewBuilder = hl.newBuilder(hlVar2);
            hkVarNewBuilder.mergeFrom((hk) hlVar);
            hlVar = hkVarNewBuilder.buildPartial();
        }
        this.settingsBundleCampaigns_ = hlVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportation(hu huVar) {
        Objects.requireNonNull(huVar);
        hu huVar2 = this.transportation_;
        if (huVar2 != null && huVar2 != hu.getDefaultInstance()) {
            ht htVarNewBuilder = hu.newBuilder(huVar2);
            htVarNewBuilder.mergeFrom((ht) huVar);
            huVar = htVarNewBuilder.buildPartial();
        }
        this.transportation_ = huVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoicePrompts(i.b.w.o oVar) {
        Objects.requireNonNull(oVar);
        i.b.w.o oVar2 = this.voicePrompts_;
        if (oVar2 != null && oVar2 != i.b.w.o.getDefaultInstance()) {
            i.b.w.n nVarNewBuilder = i.b.w.o.newBuilder(oVar2);
            nVarNewBuilder.mergeFrom((i.b.w.n) oVar);
            oVar = nVarNewBuilder.buildPartial();
        }
        this.voicePrompts_ = oVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceReportCategories(fj fjVar) {
        Objects.requireNonNull(fjVar);
        fj fjVar2 = this.voiceReportCategories_;
        if (fjVar2 != null && fjVar2 != fj.getDefaultInstance()) {
            fi fiVarNewBuilder = fj.newBuilder(fjVar2);
            fiVarNewBuilder.mergeFrom((fi) fjVar);
            fjVar = fiVarNewBuilder.buildPartial();
        }
        this.voiceReportCategories_ = fjVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceSearchLangs(id idVar) {
        Objects.requireNonNull(idVar);
        id idVar2 = this.voiceSearchLangs_;
        if (idVar2 != null && idVar2 != id.getDefaultInstance()) {
            ic icVarNewBuilder = id.newBuilder(idVar2);
            icVarNewBuilder.mergeFrom((ic) idVar);
            idVar = icVarNewBuilder.buildPartial();
        }
        this.voiceSearchLangs_ = idVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebUrlWhiteList(il ilVar) {
        Objects.requireNonNull(ilVar);
        il ilVar2 = this.webUrlWhiteList_;
        if (ilVar2 != null && ilVar2 != il.getDefaultInstance()) {
            ik ikVarNewBuilder = il.newBuilder(ilVar2);
            ikVarNewBuilder.mergeFrom((ik) ilVar);
            ilVar = ikVarNewBuilder.buildPartial();
        }
        this.webUrlWhiteList_ = ilVar;
        this.bitField0_ |= 256;
    }

    public static gw newBuilder() {
        return (gw) DEFAULT_INSTANCE.createBuilder();
    }

    public static gx parseDelimitedFrom(InputStream inputStream) {
        return (gx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gx parseFrom(com.google.v.v vVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovPermitConfigs(fz fzVar) {
        Objects.requireNonNull(fzVar);
        this.hovPermitConfigs_ = fzVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarReportCategories(fj fjVar) {
        Objects.requireNonNull(fjVar);
        this.inCarReportCategories_ = fjVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimits(hq hqVar) {
        Objects.requireNonNull(hqVar);
        this.limits_ = hqVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapCars(gk gkVar) {
        Objects.requireNonNull(gkVar);
        this.mapCars_ = gkVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMoods(gr grVar) {
        Objects.requireNonNull(grVar);
        this.moods_ = grVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportCategories(fj fjVar) {
        Objects.requireNonNull(fjVar);
        this.reportCategories_ = fjVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportHighlights(he heVar) {
        Objects.requireNonNull(heVar);
        this.reportHighlights_ = heVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsBundleCampaigns(hl hlVar) {
        Objects.requireNonNull(hlVar);
        this.settingsBundleCampaigns_ = hlVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportation(hu huVar) {
        Objects.requireNonNull(huVar);
        this.transportation_ = huVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoicePrompts(i.b.w.o oVar) {
        Objects.requireNonNull(oVar);
        this.voicePrompts_ = oVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceReportCategories(fj fjVar) {
        Objects.requireNonNull(fjVar);
        this.voiceReportCategories_ = fjVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceSearchLangs(id idVar) {
        Objects.requireNonNull(idVar);
        this.voiceSearchLangs_ = idVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebUrlWhiteList(il ilVar) {
        Objects.requireNonNull(ilVar);
        this.webUrlWhiteList_ = ilVar;
        this.bitField0_ |= 256;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f", new Object[]{"bitField0_", "transportation_", "limits_", "mapCars_", "voicePrompts_", "voiceSearchLangs_", "hovPermitConfigs_", "moods_", "settingsBundleCampaigns_", "webUrlWhiteList_", "reportCategories_", "inCarReportCategories_", "voiceReportCategories_", "reportHighlights_"});
        }
        if (iOrdinal == 3) {
            return new gx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fz getHovPermitConfigs() {
        fz fzVar = this.hovPermitConfigs_;
        return fzVar == null ? fz.getDefaultInstance() : fzVar;
    }

    public fj getInCarReportCategories() {
        fj fjVar = this.inCarReportCategories_;
        return fjVar == null ? fj.getDefaultInstance() : fjVar;
    }

    public hq getLimits() {
        hq hqVar = this.limits_;
        return hqVar == null ? hq.getDefaultInstance() : hqVar;
    }

    public gk getMapCars() {
        gk gkVar = this.mapCars_;
        return gkVar == null ? gk.getDefaultInstance() : gkVar;
    }

    public gr getMoods() {
        gr grVar = this.moods_;
        return grVar == null ? gr.getDefaultInstance() : grVar;
    }

    public fj getReportCategories() {
        fj fjVar = this.reportCategories_;
        return fjVar == null ? fj.getDefaultInstance() : fjVar;
    }

    public he getReportHighlights() {
        he heVar = this.reportHighlights_;
        return heVar == null ? he.getDefaultInstance() : heVar;
    }

    public hl getSettingsBundleCampaigns() {
        hl hlVar = this.settingsBundleCampaigns_;
        return hlVar == null ? hl.getDefaultInstance() : hlVar;
    }

    public hu getTransportation() {
        hu huVar = this.transportation_;
        return huVar == null ? hu.getDefaultInstance() : huVar;
    }

    public i.b.w.o getVoicePrompts() {
        i.b.w.o oVar = this.voicePrompts_;
        return oVar == null ? i.b.w.o.getDefaultInstance() : oVar;
    }

    public fj getVoiceReportCategories() {
        fj fjVar = this.voiceReportCategories_;
        return fjVar == null ? fj.getDefaultInstance() : fjVar;
    }

    public id getVoiceSearchLangs() {
        id idVar = this.voiceSearchLangs_;
        return idVar == null ? id.getDefaultInstance() : idVar;
    }

    public il getWebUrlWhiteList() {
        il ilVar = this.webUrlWhiteList_;
        return ilVar == null ? il.getDefaultInstance() : ilVar;
    }

    public boolean hasHovPermitConfigs() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasInCarReportCategories() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasLimits() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMapCars() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMoods() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasReportCategories() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasReportHighlights() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSettingsBundleCampaigns() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasTransportation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVoicePrompts() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVoiceReportCategories() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasVoiceSearchLangs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasWebUrlWhiteList() {
        return (this.bitField0_ & 256) != 0;
    }

    public static gw newBuilder(gx gxVar) {
        return (gw) DEFAULT_INSTANCE.createBuilder(gxVar);
    }

    public static gx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gx parseFrom(com.google.v.z zVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gx parseFrom(InputStream inputStream) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gx parseFrom(ByteBuffer byteBuffer) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gx parseFrom(byte[] bArr) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
