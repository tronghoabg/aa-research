package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmb extends com.google.v.du<bmb, blz> implements com.google.v.fj {
    private static final bmb DEFAULT_INSTANCE;
    public static final int INTELLIGENCE_LOADER_SHOWN_FIELD_NUMBER = 21;
    public static final int IN_CAR_INFORMATION_POPUP_CLICKED_FIELD_NUMBER = 16;
    public static final int IN_CAR_INFORMATION_POPUP_SHOWN_FIELD_NUMBER = 17;
    public static final int IN_CAR_LIST_VIEW_CELL_VISIBILITY_CHANGED_FIELD_NUMBER = 15;
    private static volatile com.google.v.fo<bmb> PARSER = null;
    public static final int TOLL_INFORMATION_POPUP_CLICKED_FIELD_NUMBER = 12;
    public static final int TOLL_INFORMATION_POPUP_SHOWN_FIELD_NUMBER = 13;
    public static final int TRIP_OVERVIEW_CLICKED_FIELD_NUMBER = 3;
    public static final int TRIP_OVERVIEW_CLOSURE_MESSAGE_CLOSED_FIELD_NUMBER = 9;
    public static final int TRIP_OVERVIEW_CLOSURE_MESSAGE_SHOWN_FIELD_NUMBER = 8;
    public static final int TRIP_OVERVIEW_ERROR_FIELD_NUMBER = 2;
    public static final int TRIP_OVERVIEW_INITIAL_MAP_PRESENTATION_COMPLETED_FIELD_NUMBER = 20;
    public static final int TRIP_OVERVIEW_MESSAGE_CARD_CLICKED_FIELD_NUMBER = 18;
    public static final int TRIP_OVERVIEW_MESSAGE_CARD_SHOWN_FIELD_NUMBER = 19;
    public static final int TRIP_OVERVIEW_NOT_SHOWN_FIELD_NUMBER = 4;
    public static final int TRIP_OVERVIEW_PREFERRED_ROUTE_MESSAGE_CLICKED_FIELD_NUMBER = 11;
    public static final int TRIP_OVERVIEW_PREFERRED_ROUTE_MESSAGE_SHOWN_FIELD_NUMBER = 10;
    public static final int TRIP_OVERVIEW_ROUTES_RECEIVED_FIELD_NUMBER = 7;
    public static final int TRIP_OVERVIEW_ROUTE_SELECTED_FIELD_NUMBER = 5;
    public static final int TRIP_OVERVIEW_SCREEN_MODE_UPDATED_FIELD_NUMBER = 14;
    public static final int TRIP_OVERVIEW_SCREEN_POSITIONING_SET_FIELD_NUMBER = 6;
    public static final int TRIP_OVERVIEW_SHOWN_FIELD_NUMBER = 1;
    private int statCase_ = 0;
    private Object stat_;

    static {
        bmb bmbVar = new bmb();
        DEFAULT_INSTANCE = bmbVar;
        com.google.v.du.registerDefaultInstance(bmb.class, bmbVar);
    }

    private bmb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarInformationPopupClicked() {
        if (this.statCase_ == 16) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarInformationPopupShown() {
        if (this.statCase_ == 17) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarListViewCellVisibilityChanged() {
        if (this.statCase_ == 15) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntelligenceLoaderShown() {
        if (this.statCase_ == 21) {
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
    public void clearTollInformationPopupClicked() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollInformationPopupShown() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewClicked() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewClosureMessageClosed() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewClosureMessageShown() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewError() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewInitialMapPresentationCompleted() {
        if (this.statCase_ == 20) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewMessageCardClicked() {
        if (this.statCase_ == 18) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewMessageCardShown() {
        if (this.statCase_ == 19) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewNotShown() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewPreferredRouteMessageClicked() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewPreferredRouteMessageShown() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewRouteSelected() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewRoutesReceived() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewScreenModeUpdated() {
        if (this.statCase_ == 14) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewScreenPositioningSet() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripOverviewShown() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static bmb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarInformationPopupClicked(abx abxVar) {
        Objects.requireNonNull(abxVar);
        if (this.statCase_ == 16 && this.stat_ != abx.getDefaultInstance()) {
            abw abwVarNewBuilder = abx.newBuilder((abx) this.stat_);
            abwVarNewBuilder.mergeFrom((abw) abxVar);
            abxVar = abwVarNewBuilder.buildPartial();
        }
        this.stat_ = abxVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarInformationPopupShown(aca acaVar) {
        Objects.requireNonNull(acaVar);
        if (this.statCase_ == 17 && this.stat_ != aca.getDefaultInstance()) {
            aby abyVarNewBuilder = aca.newBuilder((aca) this.stat_);
            abyVarNewBuilder.mergeFrom((aby) acaVar);
            acaVar = abyVarNewBuilder.buildPartial();
        }
        this.stat_ = acaVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarListViewCellVisibilityChanged(acc accVar) {
        Objects.requireNonNull(accVar);
        if (this.statCase_ == 15 && this.stat_ != acc.getDefaultInstance()) {
            acb acbVarNewBuilder = acc.newBuilder((acc) this.stat_);
            acbVarNewBuilder.mergeFrom((acb) accVar);
            accVar = acbVarNewBuilder.buildPartial();
        }
        this.stat_ = accVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntelligenceLoaderShown(aez aezVar) {
        Objects.requireNonNull(aezVar);
        if (this.statCase_ == 21 && this.stat_ != aez.getDefaultInstance()) {
            aew aewVarNewBuilder = aez.newBuilder((aez) this.stat_);
            aewVarNewBuilder.mergeFrom((aew) aezVar);
            aezVar = aewVarNewBuilder.buildPartial();
        }
        this.stat_ = aezVar;
        this.statCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollInformationPopupClicked(bix bixVar) {
        Objects.requireNonNull(bixVar);
        if (this.statCase_ == 12 && this.stat_ != bix.getDefaultInstance()) {
            biw biwVarNewBuilder = bix.newBuilder((bix) this.stat_);
            biwVarNewBuilder.mergeFrom((biw) bixVar);
            bixVar = biwVarNewBuilder.buildPartial();
        }
        this.stat_ = bixVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollInformationPopupShown(bjb bjbVar) {
        Objects.requireNonNull(bjbVar);
        if (this.statCase_ == 13 && this.stat_ != bjb.getDefaultInstance()) {
            biz bizVarNewBuilder = bjb.newBuilder((bjb) this.stat_);
            bizVarNewBuilder.mergeFrom((biz) bjbVar);
            bjbVar = bizVarNewBuilder.buildPartial();
        }
        this.stat_ = bjbVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewClicked(bkf bkfVar) {
        Objects.requireNonNull(bkfVar);
        if (this.statCase_ == 3 && this.stat_ != bkf.getDefaultInstance()) {
            bkd bkdVarNewBuilder = bkf.newBuilder((bkf) this.stat_);
            bkdVarNewBuilder.mergeFrom((bkd) bkfVar);
            bkfVar = bkdVarNewBuilder.buildPartial();
        }
        this.stat_ = bkfVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewClosureMessageClosed(bkh bkhVar) {
        Objects.requireNonNull(bkhVar);
        if (this.statCase_ == 9 && this.stat_ != bkh.getDefaultInstance()) {
            bkg bkgVarNewBuilder = bkh.newBuilder((bkh) this.stat_);
            bkgVarNewBuilder.mergeFrom((bkg) bkhVar);
            bkhVar = bkgVarNewBuilder.buildPartial();
        }
        this.stat_ = bkhVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewClosureMessageShown(bkl bklVar) {
        Objects.requireNonNull(bklVar);
        if (this.statCase_ == 8 && this.stat_ != bkl.getDefaultInstance()) {
            bki bkiVarNewBuilder = bkl.newBuilder((bkl) this.stat_);
            bkiVarNewBuilder.mergeFrom((bki) bklVar);
            bklVar = bkiVarNewBuilder.buildPartial();
        }
        this.stat_ = bklVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewError(bko bkoVar) {
        Objects.requireNonNull(bkoVar);
        if (this.statCase_ == 2 && this.stat_ != bko.getDefaultInstance()) {
            bkm bkmVarNewBuilder = bko.newBuilder((bko) this.stat_);
            bkmVarNewBuilder.mergeFrom((bkm) bkoVar);
            bkoVar = bkmVarNewBuilder.buildPartial();
        }
        this.stat_ = bkoVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewInitialMapPresentationCompleted(bkq bkqVar) {
        Objects.requireNonNull(bkqVar);
        if (this.statCase_ == 20 && this.stat_ != bkq.getDefaultInstance()) {
            bkp bkpVarNewBuilder = bkq.newBuilder((bkq) this.stat_);
            bkpVarNewBuilder.mergeFrom((bkp) bkqVar);
            bkqVar = bkpVarNewBuilder.buildPartial();
        }
        this.stat_ = bkqVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewMessageCardClicked(bkt bktVar) {
        Objects.requireNonNull(bktVar);
        if (this.statCase_ == 18 && this.stat_ != bkt.getDefaultInstance()) {
            bks bksVarNewBuilder = bkt.newBuilder((bkt) this.stat_);
            bksVarNewBuilder.mergeFrom((bks) bktVar);
            bktVar = bksVarNewBuilder.buildPartial();
        }
        this.stat_ = bktVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewMessageCardShown(bkw bkwVar) {
        Objects.requireNonNull(bkwVar);
        if (this.statCase_ == 19 && this.stat_ != bkw.getDefaultInstance()) {
            bku bkuVarNewBuilder = bkw.newBuilder((bkw) this.stat_);
            bkuVarNewBuilder.mergeFrom((bku) bkwVar);
            bkwVar = bkuVarNewBuilder.buildPartial();
        }
        this.stat_ = bkwVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewNotShown(bkz bkzVar) {
        Objects.requireNonNull(bkzVar);
        if (this.statCase_ == 4 && this.stat_ != bkz.getDefaultInstance()) {
            bkx bkxVarNewBuilder = bkz.newBuilder((bkz) this.stat_);
            bkxVarNewBuilder.mergeFrom((bkx) bkzVar);
            bkzVar = bkxVarNewBuilder.buildPartial();
        }
        this.stat_ = bkzVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewPreferredRouteMessageClicked(blc blcVar) {
        Objects.requireNonNull(blcVar);
        if (this.statCase_ == 11 && this.stat_ != blc.getDefaultInstance()) {
            bla blaVarNewBuilder = blc.newBuilder((blc) this.stat_);
            blaVarNewBuilder.mergeFrom((bla) blcVar);
            blcVar = blaVarNewBuilder.buildPartial();
        }
        this.stat_ = blcVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewPreferredRouteMessageShown(ble bleVar) {
        Objects.requireNonNull(bleVar);
        if (this.statCase_ == 10 && this.stat_ != ble.getDefaultInstance()) {
            bld bldVarNewBuilder = ble.newBuilder((ble) this.stat_);
            bldVarNewBuilder.mergeFrom((bld) bleVar);
            bleVar = bldVarNewBuilder.buildPartial();
        }
        this.stat_ = bleVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewRouteSelected(bll bllVar) {
        Objects.requireNonNull(bllVar);
        if (this.statCase_ == 5 && this.stat_ != bll.getDefaultInstance()) {
            bli bliVarNewBuilder = bll.newBuilder((bll) this.stat_);
            bliVarNewBuilder.mergeFrom((bli) bllVar);
            bllVar = bliVarNewBuilder.buildPartial();
        }
        this.stat_ = bllVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewRoutesReceived(bln blnVar) {
        Objects.requireNonNull(blnVar);
        if (this.statCase_ == 7 && this.stat_ != bln.getDefaultInstance()) {
            blm blmVarNewBuilder = bln.newBuilder((bln) this.stat_);
            blmVarNewBuilder.mergeFrom((blm) blnVar);
            blnVar = blmVarNewBuilder.buildPartial();
        }
        this.stat_ = blnVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewScreenModeUpdated(blr blrVar) {
        Objects.requireNonNull(blrVar);
        if (this.statCase_ == 14 && this.stat_ != blr.getDefaultInstance()) {
            blo bloVarNewBuilder = blr.newBuilder((blr) this.stat_);
            bloVarNewBuilder.mergeFrom((blo) blrVar);
            blrVar = bloVarNewBuilder.buildPartial();
        }
        this.stat_ = blrVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewScreenPositioningSet(blt bltVar) {
        Objects.requireNonNull(bltVar);
        if (this.statCase_ == 6 && this.stat_ != blt.getDefaultInstance()) {
            bls blsVarNewBuilder = blt.newBuilder((blt) this.stat_);
            blsVarNewBuilder.mergeFrom((bls) bltVar);
            bltVar = blsVarNewBuilder.buildPartial();
        }
        this.stat_ = bltVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTripOverviewShown(bly blyVar) {
        Objects.requireNonNull(blyVar);
        if (this.statCase_ == 1 && this.stat_ != bly.getDefaultInstance()) {
            blu bluVarNewBuilder = bly.newBuilder((bly) this.stat_);
            bluVarNewBuilder.mergeFrom((blu) blyVar);
            blyVar = bluVarNewBuilder.buildPartial();
        }
        this.stat_ = blyVar;
        this.statCase_ = 1;
    }

    public static blz newBuilder() {
        return (blz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmb parseDelimitedFrom(InputStream inputStream) {
        return (bmb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmb parseFrom(com.google.v.v vVar) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarInformationPopupClicked(abx abxVar) {
        Objects.requireNonNull(abxVar);
        this.stat_ = abxVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarInformationPopupShown(aca acaVar) {
        Objects.requireNonNull(acaVar);
        this.stat_ = acaVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarListViewCellVisibilityChanged(acc accVar) {
        Objects.requireNonNull(accVar);
        this.stat_ = accVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntelligenceLoaderShown(aez aezVar) {
        Objects.requireNonNull(aezVar);
        this.stat_ = aezVar;
        this.statCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollInformationPopupClicked(bix bixVar) {
        Objects.requireNonNull(bixVar);
        this.stat_ = bixVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollInformationPopupShown(bjb bjbVar) {
        Objects.requireNonNull(bjbVar);
        this.stat_ = bjbVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewClicked(bkf bkfVar) {
        Objects.requireNonNull(bkfVar);
        this.stat_ = bkfVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewClosureMessageClosed(bkh bkhVar) {
        Objects.requireNonNull(bkhVar);
        this.stat_ = bkhVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewClosureMessageShown(bkl bklVar) {
        Objects.requireNonNull(bklVar);
        this.stat_ = bklVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewError(bko bkoVar) {
        Objects.requireNonNull(bkoVar);
        this.stat_ = bkoVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewInitialMapPresentationCompleted(bkq bkqVar) {
        Objects.requireNonNull(bkqVar);
        this.stat_ = bkqVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewMessageCardClicked(bkt bktVar) {
        Objects.requireNonNull(bktVar);
        this.stat_ = bktVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewMessageCardShown(bkw bkwVar) {
        Objects.requireNonNull(bkwVar);
        this.stat_ = bkwVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewNotShown(bkz bkzVar) {
        Objects.requireNonNull(bkzVar);
        this.stat_ = bkzVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewPreferredRouteMessageClicked(blc blcVar) {
        Objects.requireNonNull(blcVar);
        this.stat_ = blcVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewPreferredRouteMessageShown(ble bleVar) {
        Objects.requireNonNull(bleVar);
        this.stat_ = bleVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewRouteSelected(bll bllVar) {
        Objects.requireNonNull(bllVar);
        this.stat_ = bllVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewRoutesReceived(bln blnVar) {
        Objects.requireNonNull(blnVar);
        this.stat_ = blnVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewScreenModeUpdated(blr blrVar) {
        Objects.requireNonNull(blrVar);
        this.stat_ = blrVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewScreenPositioningSet(blt bltVar) {
        Objects.requireNonNull(bltVar);
        this.stat_ = bltVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripOverviewShown(bly blyVar) {
        Objects.requireNonNull(blyVar);
        this.stat_ = blyVar;
        this.statCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0001\u0000\u0001\u0015\u0015\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000", new Object[]{"stat_", "statCase_", bly.class, bko.class, bkf.class, bkz.class, bll.class, blt.class, bln.class, bkl.class, bkh.class, ble.class, blc.class, bix.class, bjb.class, blr.class, acc.class, abx.class, aca.class, bkt.class, bkw.class, bkq.class, aez.class});
        }
        if (iOrdinal == 3) {
            return new bmb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new blz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public abx getInCarInformationPopupClicked() {
        return this.statCase_ == 16 ? (abx) this.stat_ : abx.getDefaultInstance();
    }

    public aca getInCarInformationPopupShown() {
        return this.statCase_ == 17 ? (aca) this.stat_ : aca.getDefaultInstance();
    }

    public acc getInCarListViewCellVisibilityChanged() {
        return this.statCase_ == 15 ? (acc) this.stat_ : acc.getDefaultInstance();
    }

    public aez getIntelligenceLoaderShown() {
        return this.statCase_ == 21 ? (aez) this.stat_ : aez.getDefaultInstance();
    }

    public bma getStatCase() {
        switch (this.statCase_) {
            case 0:
                return bma.v;
            case 1:
                return bma.f54274a;
            case 2:
                return bma.f54275b;
            case 3:
                return bma.f54276c;
            case 4:
                return bma.f54277d;
            case 5:
                return bma.f54278e;
            case 6:
                return bma.f54279f;
            case 7:
                return bma.f54280g;
            case 8:
                return bma.f54281h;
            case 9:
                return bma.f54282i;
            case 10:
                return bma.f54283j;
            case 11:
                return bma.f54284k;
            case 12:
                return bma.f54285l;
            case 13:
                return bma.m;
            case 14:
                return bma.n;
            case 15:
                return bma.o;
            case 16:
                return bma.p;
            case 17:
                return bma.q;
            case 18:
                return bma.r;
            case 19:
                return bma.s;
            case 20:
                return bma.t;
            case 21:
                return bma.u;
            default:
                return null;
        }
    }

    public bix getTollInformationPopupClicked() {
        return this.statCase_ == 12 ? (bix) this.stat_ : bix.getDefaultInstance();
    }

    public bjb getTollInformationPopupShown() {
        return this.statCase_ == 13 ? (bjb) this.stat_ : bjb.getDefaultInstance();
    }

    public bkf getTripOverviewClicked() {
        return this.statCase_ == 3 ? (bkf) this.stat_ : bkf.getDefaultInstance();
    }

    public bkh getTripOverviewClosureMessageClosed() {
        return this.statCase_ == 9 ? (bkh) this.stat_ : bkh.getDefaultInstance();
    }

    public bkl getTripOverviewClosureMessageShown() {
        return this.statCase_ == 8 ? (bkl) this.stat_ : bkl.getDefaultInstance();
    }

    public bko getTripOverviewError() {
        return this.statCase_ == 2 ? (bko) this.stat_ : bko.getDefaultInstance();
    }

    public bkq getTripOverviewInitialMapPresentationCompleted() {
        return this.statCase_ == 20 ? (bkq) this.stat_ : bkq.getDefaultInstance();
    }

    public bkt getTripOverviewMessageCardClicked() {
        return this.statCase_ == 18 ? (bkt) this.stat_ : bkt.getDefaultInstance();
    }

    public bkw getTripOverviewMessageCardShown() {
        return this.statCase_ == 19 ? (bkw) this.stat_ : bkw.getDefaultInstance();
    }

    public bkz getTripOverviewNotShown() {
        return this.statCase_ == 4 ? (bkz) this.stat_ : bkz.getDefaultInstance();
    }

    public blc getTripOverviewPreferredRouteMessageClicked() {
        return this.statCase_ == 11 ? (blc) this.stat_ : blc.getDefaultInstance();
    }

    public ble getTripOverviewPreferredRouteMessageShown() {
        return this.statCase_ == 10 ? (ble) this.stat_ : ble.getDefaultInstance();
    }

    public bll getTripOverviewRouteSelected() {
        return this.statCase_ == 5 ? (bll) this.stat_ : bll.getDefaultInstance();
    }

    public bln getTripOverviewRoutesReceived() {
        return this.statCase_ == 7 ? (bln) this.stat_ : bln.getDefaultInstance();
    }

    public blr getTripOverviewScreenModeUpdated() {
        return this.statCase_ == 14 ? (blr) this.stat_ : blr.getDefaultInstance();
    }

    public blt getTripOverviewScreenPositioningSet() {
        return this.statCase_ == 6 ? (blt) this.stat_ : blt.getDefaultInstance();
    }

    public bly getTripOverviewShown() {
        return this.statCase_ == 1 ? (bly) this.stat_ : bly.getDefaultInstance();
    }

    public boolean hasInCarInformationPopupClicked() {
        return this.statCase_ == 16;
    }

    public boolean hasInCarInformationPopupShown() {
        return this.statCase_ == 17;
    }

    public boolean hasInCarListViewCellVisibilityChanged() {
        return this.statCase_ == 15;
    }

    public boolean hasIntelligenceLoaderShown() {
        return this.statCase_ == 21;
    }

    public boolean hasTollInformationPopupClicked() {
        return this.statCase_ == 12;
    }

    public boolean hasTollInformationPopupShown() {
        return this.statCase_ == 13;
    }

    public boolean hasTripOverviewClicked() {
        return this.statCase_ == 3;
    }

    public boolean hasTripOverviewClosureMessageClosed() {
        return this.statCase_ == 9;
    }

    public boolean hasTripOverviewClosureMessageShown() {
        return this.statCase_ == 8;
    }

    public boolean hasTripOverviewError() {
        return this.statCase_ == 2;
    }

    public boolean hasTripOverviewInitialMapPresentationCompleted() {
        return this.statCase_ == 20;
    }

    public boolean hasTripOverviewMessageCardClicked() {
        return this.statCase_ == 18;
    }

    public boolean hasTripOverviewMessageCardShown() {
        return this.statCase_ == 19;
    }

    public boolean hasTripOverviewNotShown() {
        return this.statCase_ == 4;
    }

    public boolean hasTripOverviewPreferredRouteMessageClicked() {
        return this.statCase_ == 11;
    }

    public boolean hasTripOverviewPreferredRouteMessageShown() {
        return this.statCase_ == 10;
    }

    public boolean hasTripOverviewRouteSelected() {
        return this.statCase_ == 5;
    }

    public boolean hasTripOverviewRoutesReceived() {
        return this.statCase_ == 7;
    }

    public boolean hasTripOverviewScreenModeUpdated() {
        return this.statCase_ == 14;
    }

    public boolean hasTripOverviewScreenPositioningSet() {
        return this.statCase_ == 6;
    }

    public boolean hasTripOverviewShown() {
        return this.statCase_ == 1;
    }

    public static blz newBuilder(bmb bmbVar) {
        return (blz) DEFAULT_INSTANCE.createBuilder(bmbVar);
    }

    public static bmb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmb parseFrom(com.google.v.z zVar) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmb parseFrom(InputStream inputStream) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmb parseFrom(ByteBuffer byteBuffer) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmb parseFrom(byte[] bArr) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
