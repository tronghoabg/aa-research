package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ams extends com.google.v.du<ams, amq> implements com.google.v.fj {
    private static final ams DEFAULT_INSTANCE;
    public static final int DRIVE_TYPE_FIELD_NUMBER = 3;
    public static final int DRIVING_FIELD_NUMBER = 7;
    public static final int ETA_CHANGED_FIELD_NUMBER = 1;
    public static final int FALCON_ACAUSAL_SUM_FIELD_NUMBER = 5;
    public static final int MESSAGE_BOX_CLICKED_FIELD_NUMBER = 10;
    public static final int MESSAGE_BOX_SHOWN_FIELD_NUMBER = 11;
    public static final int MOBILE_SCREEN_LOCK_FIELD_NUMBER = 16;
    public static final int MOBILE_SCREEN_UNLOCK_FIELD_NUMBER = 17;
    public static final int NAVIGATION_DESTINATION_REACHED_FIELD_NUMBER = 6;
    public static final int NAVIGATION_GUIDANCE_SHOWN_FIELD_NUMBER = 8;
    public static final int NAVIGATION_GUIDANCE_TAPPED_FIELD_NUMBER = 12;
    public static final int NAVIGATION_OPTIONS_MENU_CLICKED_FIELD_NUMBER = 14;
    public static final int NAVIGATION_STARTED_FIELD_NUMBER = 2;
    public static final int NAVIGATION_THROUGH_MULTILANE_ROUNDABOUT_FIELD_NUMBER = 15;
    private static volatile com.google.v.fo<ams> PARSER = null;
    public static final int PLACES_NEAR_DESTINATION_SHOWN_FIELD_NUMBER = 13;
    public static final int ROUTE_DEVIATION_REROUTE_FIELD_NUMBER = 4;
    public static final int SPECIAL_GUIDANCE_SHOWN_FIELD_NUMBER = 9;
    private int statCase_ = 0;
    private Object stat_;

    static {
        ams amsVar = new ams();
        DEFAULT_INSTANCE = amsVar;
        com.google.v.du.registerDefaultInstance(ams.class, amsVar);
    }

    private ams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriveType() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriving() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaChanged() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFalconAcausalSum() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageBoxClicked() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageBoxShown() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileScreenLock() {
        if (this.statCase_ == 16) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobileScreenUnlock() {
        if (this.statCase_ == 17) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationDestinationReached() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationGuidanceShown() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationGuidanceTapped() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationOptionsMenuClicked() {
        if (this.statCase_ == 14) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationStarted() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationThroughMultilaneRoundabout() {
        if (this.statCase_ == 15) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacesNearDestinationShown() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDeviationReroute() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpecialGuidanceShown() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStat() {
        this.statCase_ = 0;
        this.stat_ = null;
    }

    public static ams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriveType(te teVar) {
        Objects.requireNonNull(teVar);
        if (this.statCase_ == 3 && this.stat_ != te.getDefaultInstance()) {
            tc tcVarNewBuilder = te.newBuilder((te) this.stat_);
            tcVarNewBuilder.mergeFrom((tc) teVar);
            teVar = tcVarNewBuilder.buildPartial();
        }
        this.stat_ = teVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDriving(tg tgVar) {
        Objects.requireNonNull(tgVar);
        if (this.statCase_ == 7 && this.stat_ != tg.getDefaultInstance()) {
            tf tfVarNewBuilder = tg.newBuilder((tg) this.stat_);
            tfVarNewBuilder.mergeFrom((tf) tgVar);
            tgVar = tfVarNewBuilder.buildPartial();
        }
        this.stat_ = tgVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEtaChanged(va vaVar) {
        Objects.requireNonNull(vaVar);
        if (this.statCase_ == 1 && this.stat_ != va.getDefaultInstance()) {
            uz uzVarNewBuilder = va.newBuilder((va) this.stat_);
            uzVarNewBuilder.mergeFrom((uz) vaVar);
            vaVar = uzVarNewBuilder.buildPartial();
        }
        this.stat_ = vaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFalconAcausalSum(wh whVar) {
        Objects.requireNonNull(whVar);
        if (this.statCase_ == 5 && this.stat_ != wh.getDefaultInstance()) {
            wg wgVarNewBuilder = wh.newBuilder((wh) this.stat_);
            wgVarNewBuilder.mergeFrom((wg) whVar);
            whVar = wgVarNewBuilder.buildPartial();
        }
        this.stat_ = whVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessageBoxClicked(ajx ajxVar) {
        Objects.requireNonNull(ajxVar);
        if (this.statCase_ == 10 && this.stat_ != ajx.getDefaultInstance()) {
            ajw ajwVarNewBuilder = ajx.newBuilder((ajx) this.stat_);
            ajwVarNewBuilder.mergeFrom((ajw) ajxVar);
            ajxVar = ajwVarNewBuilder.buildPartial();
        }
        this.stat_ = ajxVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMessageBoxShown(ajz ajzVar) {
        Objects.requireNonNull(ajzVar);
        if (this.statCase_ == 11 && this.stat_ != ajz.getDefaultInstance()) {
            ajy ajyVarNewBuilder = ajz.newBuilder((ajz) this.stat_);
            ajyVarNewBuilder.mergeFrom((ajy) ajzVar);
            ajzVar = ajyVarNewBuilder.buildPartial();
        }
        this.stat_ = ajzVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileScreenLock(akb akbVar) {
        Objects.requireNonNull(akbVar);
        if (this.statCase_ == 16 && this.stat_ != akb.getDefaultInstance()) {
            aka akaVarNewBuilder = akb.newBuilder((akb) this.stat_);
            akaVarNewBuilder.mergeFrom((aka) akbVar);
            akbVar = akaVarNewBuilder.buildPartial();
        }
        this.stat_ = akbVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMobileScreenUnlock(akd akdVar) {
        Objects.requireNonNull(akdVar);
        if (this.statCase_ == 17 && this.stat_ != akd.getDefaultInstance()) {
            akc akcVarNewBuilder = akd.newBuilder((akd) this.stat_);
            akcVarNewBuilder.mergeFrom((akc) akdVar);
            akdVar = akcVarNewBuilder.buildPartial();
        }
        this.stat_ = akdVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationDestinationReached(amb ambVar) {
        Objects.requireNonNull(ambVar);
        if (this.statCase_ == 6 && this.stat_ != amb.getDefaultInstance()) {
            ama amaVarNewBuilder = amb.newBuilder((amb) this.stat_);
            amaVarNewBuilder.mergeFrom((ama) ambVar);
            ambVar = amaVarNewBuilder.buildPartial();
        }
        this.stat_ = ambVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationGuidanceShown(ame ameVar) {
        Objects.requireNonNull(ameVar);
        if (this.statCase_ == 8 && this.stat_ != ame.getDefaultInstance()) {
            amd amdVarNewBuilder = ame.newBuilder((ame) this.stat_);
            amdVarNewBuilder.mergeFrom((amd) ameVar);
            ameVar = amdVarNewBuilder.buildPartial();
        }
        this.stat_ = ameVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationGuidanceTapped(amg amgVar) {
        Objects.requireNonNull(amgVar);
        if (this.statCase_ == 12 && this.stat_ != amg.getDefaultInstance()) {
            amf amfVarNewBuilder = amg.newBuilder((amg) this.stat_);
            amfVarNewBuilder.mergeFrom((amf) amgVar);
            amgVar = amfVarNewBuilder.buildPartial();
        }
        this.stat_ = amgVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationOptionsMenuClicked(amj amjVar) {
        Objects.requireNonNull(amjVar);
        if (this.statCase_ == 14 && this.stat_ != amj.getDefaultInstance()) {
            ami amiVarNewBuilder = amj.newBuilder((amj) this.stat_);
            amiVarNewBuilder.mergeFrom((ami) amjVar);
            amjVar = amiVarNewBuilder.buildPartial();
        }
        this.stat_ = amjVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationStarted(amp ampVar) {
        Objects.requireNonNull(ampVar);
        if (this.statCase_ == 2 && this.stat_ != amp.getDefaultInstance()) {
            amn amnVarNewBuilder = amp.newBuilder((amp) this.stat_);
            amnVarNewBuilder.mergeFrom((amn) ampVar);
            ampVar = amnVarNewBuilder.buildPartial();
        }
        this.stat_ = ampVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationThroughMultilaneRoundabout(amu amuVar) {
        Objects.requireNonNull(amuVar);
        if (this.statCase_ == 15 && this.stat_ != amu.getDefaultInstance()) {
            amt amtVarNewBuilder = amu.newBuilder((amu) this.stat_);
            amtVarNewBuilder.mergeFrom((amt) amuVar);
            amuVar = amtVarNewBuilder.buildPartial();
        }
        this.stat_ = amuVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlacesNearDestinationShown(aqr aqrVar) {
        Objects.requireNonNull(aqrVar);
        if (this.statCase_ == 13 && this.stat_ != aqr.getDefaultInstance()) {
            aqq aqqVarNewBuilder = aqr.newBuilder((aqr) this.stat_);
            aqqVarNewBuilder.mergeFrom((aqq) aqrVar);
            aqrVar = aqqVarNewBuilder.buildPartial();
        }
        this.stat_ = aqrVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteDeviationReroute(awf awfVar) {
        Objects.requireNonNull(awfVar);
        if (this.statCase_ == 4 && this.stat_ != awf.getDefaultInstance()) {
            awe aweVarNewBuilder = awf.newBuilder((awf) this.stat_);
            aweVarNewBuilder.mergeFrom((awe) awfVar);
            awfVar = aweVarNewBuilder.buildPartial();
        }
        this.stat_ = awfVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpecialGuidanceShown(bfp bfpVar) {
        Objects.requireNonNull(bfpVar);
        if (this.statCase_ == 9 && this.stat_ != bfp.getDefaultInstance()) {
            bfo bfoVarNewBuilder = bfp.newBuilder((bfp) this.stat_);
            bfoVarNewBuilder.mergeFrom((bfo) bfpVar);
            bfpVar = bfoVarNewBuilder.buildPartial();
        }
        this.stat_ = bfpVar;
        this.statCase_ = 9;
    }

    public static amq newBuilder() {
        return (amq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ams parseDelimitedFrom(InputStream inputStream) {
        return (ams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ams parseFrom(com.google.v.v vVar) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriveType(te teVar) {
        Objects.requireNonNull(teVar);
        this.stat_ = teVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriving(tg tgVar) {
        Objects.requireNonNull(tgVar);
        this.stat_ = tgVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaChanged(va vaVar) {
        Objects.requireNonNull(vaVar);
        this.stat_ = vaVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFalconAcausalSum(wh whVar) {
        Objects.requireNonNull(whVar);
        this.stat_ = whVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBoxClicked(ajx ajxVar) {
        Objects.requireNonNull(ajxVar);
        this.stat_ = ajxVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBoxShown(ajz ajzVar) {
        Objects.requireNonNull(ajzVar);
        this.stat_ = ajzVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileScreenLock(akb akbVar) {
        Objects.requireNonNull(akbVar);
        this.stat_ = akbVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileScreenUnlock(akd akdVar) {
        Objects.requireNonNull(akdVar);
        this.stat_ = akdVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationDestinationReached(amb ambVar) {
        Objects.requireNonNull(ambVar);
        this.stat_ = ambVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationGuidanceShown(ame ameVar) {
        Objects.requireNonNull(ameVar);
        this.stat_ = ameVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationGuidanceTapped(amg amgVar) {
        Objects.requireNonNull(amgVar);
        this.stat_ = amgVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationOptionsMenuClicked(amj amjVar) {
        Objects.requireNonNull(amjVar);
        this.stat_ = amjVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationStarted(amp ampVar) {
        Objects.requireNonNull(ampVar);
        this.stat_ = ampVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationThroughMultilaneRoundabout(amu amuVar) {
        Objects.requireNonNull(amuVar);
        this.stat_ = amuVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacesNearDestinationShown(aqr aqrVar) {
        Objects.requireNonNull(aqrVar);
        this.stat_ = aqrVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDeviationReroute(awf awfVar) {
        Objects.requireNonNull(awfVar);
        this.stat_ = awfVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpecialGuidanceShown(bfp bfpVar) {
        Objects.requireNonNull(bfpVar);
        this.stat_ = bfpVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0001\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000", new Object[]{"stat_", "statCase_", va.class, amp.class, te.class, awf.class, wh.class, amb.class, tg.class, ame.class, bfp.class, ajx.class, ajz.class, amg.class, aqr.class, amj.class, amu.class, akb.class, akd.class});
        }
        if (iOrdinal == 3) {
            return new ams();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ams> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ams.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public te getDriveType() {
        return this.statCase_ == 3 ? (te) this.stat_ : te.getDefaultInstance();
    }

    public tg getDriving() {
        return this.statCase_ == 7 ? (tg) this.stat_ : tg.getDefaultInstance();
    }

    public va getEtaChanged() {
        return this.statCase_ == 1 ? (va) this.stat_ : va.getDefaultInstance();
    }

    public wh getFalconAcausalSum() {
        return this.statCase_ == 5 ? (wh) this.stat_ : wh.getDefaultInstance();
    }

    public ajx getMessageBoxClicked() {
        return this.statCase_ == 10 ? (ajx) this.stat_ : ajx.getDefaultInstance();
    }

    public ajz getMessageBoxShown() {
        return this.statCase_ == 11 ? (ajz) this.stat_ : ajz.getDefaultInstance();
    }

    public akb getMobileScreenLock() {
        return this.statCase_ == 16 ? (akb) this.stat_ : akb.getDefaultInstance();
    }

    public akd getMobileScreenUnlock() {
        return this.statCase_ == 17 ? (akd) this.stat_ : akd.getDefaultInstance();
    }

    public amb getNavigationDestinationReached() {
        return this.statCase_ == 6 ? (amb) this.stat_ : amb.getDefaultInstance();
    }

    public ame getNavigationGuidanceShown() {
        return this.statCase_ == 8 ? (ame) this.stat_ : ame.getDefaultInstance();
    }

    public amg getNavigationGuidanceTapped() {
        return this.statCase_ == 12 ? (amg) this.stat_ : amg.getDefaultInstance();
    }

    public amj getNavigationOptionsMenuClicked() {
        return this.statCase_ == 14 ? (amj) this.stat_ : amj.getDefaultInstance();
    }

    public amp getNavigationStarted() {
        return this.statCase_ == 2 ? (amp) this.stat_ : amp.getDefaultInstance();
    }

    public amu getNavigationThroughMultilaneRoundabout() {
        return this.statCase_ == 15 ? (amu) this.stat_ : amu.getDefaultInstance();
    }

    public aqr getPlacesNearDestinationShown() {
        return this.statCase_ == 13 ? (aqr) this.stat_ : aqr.getDefaultInstance();
    }

    public awf getRouteDeviationReroute() {
        return this.statCase_ == 4 ? (awf) this.stat_ : awf.getDefaultInstance();
    }

    public bfp getSpecialGuidanceShown() {
        return this.statCase_ == 9 ? (bfp) this.stat_ : bfp.getDefaultInstance();
    }

    public amr getStatCase() {
        switch (this.statCase_) {
            case 0:
                return amr.r;
            case 1:
                return amr.f52753a;
            case 2:
                return amr.f52754b;
            case 3:
                return amr.f52755c;
            case 4:
                return amr.f52756d;
            case 5:
                return amr.f52757e;
            case 6:
                return amr.f52758f;
            case 7:
                return amr.f52759g;
            case 8:
                return amr.f52760h;
            case 9:
                return amr.f52761i;
            case 10:
                return amr.f52762j;
            case 11:
                return amr.f52763k;
            case 12:
                return amr.f52764l;
            case 13:
                return amr.m;
            case 14:
                return amr.n;
            case 15:
                return amr.o;
            case 16:
                return amr.p;
            case 17:
                return amr.q;
            default:
                return null;
        }
    }

    public boolean hasDriveType() {
        return this.statCase_ == 3;
    }

    public boolean hasDriving() {
        return this.statCase_ == 7;
    }

    public boolean hasEtaChanged() {
        return this.statCase_ == 1;
    }

    public boolean hasFalconAcausalSum() {
        return this.statCase_ == 5;
    }

    public boolean hasMessageBoxClicked() {
        return this.statCase_ == 10;
    }

    public boolean hasMessageBoxShown() {
        return this.statCase_ == 11;
    }

    public boolean hasMobileScreenLock() {
        return this.statCase_ == 16;
    }

    public boolean hasMobileScreenUnlock() {
        return this.statCase_ == 17;
    }

    public boolean hasNavigationDestinationReached() {
        return this.statCase_ == 6;
    }

    public boolean hasNavigationGuidanceShown() {
        return this.statCase_ == 8;
    }

    public boolean hasNavigationGuidanceTapped() {
        return this.statCase_ == 12;
    }

    public boolean hasNavigationOptionsMenuClicked() {
        return this.statCase_ == 14;
    }

    public boolean hasNavigationStarted() {
        return this.statCase_ == 2;
    }

    public boolean hasNavigationThroughMultilaneRoundabout() {
        return this.statCase_ == 15;
    }

    public boolean hasPlacesNearDestinationShown() {
        return this.statCase_ == 13;
    }

    public boolean hasRouteDeviationReroute() {
        return this.statCase_ == 4;
    }

    public boolean hasSpecialGuidanceShown() {
        return this.statCase_ == 9;
    }

    public static amq newBuilder(ams amsVar) {
        return (amq) DEFAULT_INSTANCE.createBuilder(amsVar);
    }

    public static ams parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ams parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ams parseFrom(com.google.v.z zVar) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ams parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ams parseFrom(InputStream inputStream) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ams parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ams parseFrom(ByteBuffer byteBuffer) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ams parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ams parseFrom(byte[] bArr) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ams parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ams) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
