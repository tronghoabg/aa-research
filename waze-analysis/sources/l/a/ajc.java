package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajc extends com.google.v.du<ajc, aja> implements com.google.v.fj {
    private static final ajc DEFAULT_INSTANCE;
    public static final int FRAME_RENDER_TIME_ABOVE_THRESHOLD_FIELD_NUMBER = 4;
    public static final int IN_CAR_MAP_SHOWN_FIELD_NUMBER = 28;
    public static final int MAP_COMPASS_BUTTON_CLICKED_FIELD_NUMBER = 23;
    public static final int MAP_FIRST_FRAME_RENDERED_FIELD_NUMBER = 26;
    public static final int MAP_FRAME_RENDER_LATENCY_FIELD_NUMBER = 25;
    public static final int MAP_OBJECTS_SNAPSHOT_FIELD_NUMBER = 27;
    public static final int MAP_OBJECT_DENSITY_FIELD_NUMBER = 5;
    public static final int MAP_PANNED_VIA_GESTURE_FIELD_NUMBER = 6;
    public static final int MAP_PLACEHOLDER_HIDDEN_FIELD_NUMBER = 19;
    public static final int MAP_PLACEHOLDER_SHOWN_FIELD_NUMBER = 18;
    public static final int MAP_RENDERING_ENGINE_COMPLETED_LOADING_FIELD_NUMBER = 21;
    public static final int MAP_RENDERING_ENGINE_STARTED_LOADING_FIELD_NUMBER = 20;
    public static final int MAP_SHOWN_AND_READY_FIELD_NUMBER = 9;
    public static final int MAP_ZOOMED_IN_VIA_DOUBLE_TAP_GESTURE_FIELD_NUMBER = 3;
    public static final int MAP_ZOOMED_OUT_VIA_DUAL_TAP_GESTURE_FIELD_NUMBER = 2;
    public static final int MAP_ZOOMED_VIA_GESTURE_PINCH_FIELD_NUMBER = 7;
    public static final int MAP_ZOOM_BUTTON_CLICKED_FIELD_NUMBER = 22;
    private static volatile com.google.v.fo<ajc> PARSER = null;
    public static final int PIN_CLICKED_FIELD_NUMBER = 13;
    public static final int PIN_POPUP_CLICKED_FIELD_NUMBER = 14;
    public static final int POLYGON_RENDER_ERROR_FIELD_NUMBER = 17;
    public static final int SPEEDOMETER_SPEED_LIMIT_REACHED_SHOWN_FIELD_NUMBER = 10;
    public static final int TILE_BATCH_DOWNLOADED_FIELD_NUMBER = 11;
    public static final int TILE_DOWNLOAD_ERROR_FIELD_NUMBER = 8;
    public static final int TILE_INCONSISTENCY_FIELD_NUMBER = 15;
    public static final int TILE_LATENCY_FIELD_NUMBER = 1;
    public static final int TILE_PARSING_ERROR_FIELD_NUMBER = 16;
    public static final int TOTAL_DOWNLOADED_TILES_SIZE_CHANGED_FIELD_NUMBER = 12;
    public static final int TRANSPORT_SDK_BUTTON_CLICKED_FIELD_NUMBER = 24;
    private int statCase_ = 0;
    private Object stat_;

    static {
        ajc ajcVar = new ajc();
        DEFAULT_INSTANCE = ajcVar;
        com.google.v.du.registerDefaultInstance(ajc.class, ajcVar);
    }

    private ajc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameRenderTimeAboveThreshold() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInCarMapShown() {
        if (this.statCase_ == 28) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapCompassButtonClicked() {
        if (this.statCase_ == 23) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapFirstFrameRendered() {
        if (this.statCase_ == 26) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapFrameRenderLatency() {
        if (this.statCase_ == 25) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapObjectDensity() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapObjectsSnapshot() {
        if (this.statCase_ == 27) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapPannedViaGesture() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapPlaceholderHidden() {
        if (this.statCase_ == 19) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapPlaceholderShown() {
        if (this.statCase_ == 18) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapRenderingEngineCompletedLoading() {
        if (this.statCase_ == 21) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapRenderingEngineStartedLoading() {
        if (this.statCase_ == 20) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapShownAndReady() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapZoomButtonClicked() {
        if (this.statCase_ == 22) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapZoomedInViaDoubleTapGesture() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapZoomedOutViaDualTapGesture() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMapZoomedViaGesturePinch() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinClicked() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinPopupClicked() {
        if (this.statCase_ == 14) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonRenderError() {
        if (this.statCase_ == 17) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedometerSpeedLimitReachedShown() {
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
    public void clearTileBatchDownloaded() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileDownloadError() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileInconsistency() {
        if (this.statCase_ == 15) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileLatency() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileParsingError() {
        if (this.statCase_ == 16) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalDownloadedTilesSizeChanged() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportSdkButtonClicked() {
        if (this.statCase_ == 24) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static ajc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFrameRenderTimeAboveThreshold(xg xgVar) {
        Objects.requireNonNull(xgVar);
        if (this.statCase_ == 4 && this.stat_ != xg.getDefaultInstance()) {
            xe xeVarNewBuilder = xg.newBuilder((xg) this.stat_);
            xeVarNewBuilder.mergeFrom((xe) xgVar);
            xgVar = xeVarNewBuilder.buildPartial();
        }
        this.stat_ = xgVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInCarMapShown(acv acvVar) {
        Objects.requireNonNull(acvVar);
        if (this.statCase_ == 28 && this.stat_ != acv.getDefaultInstance()) {
            acu acuVarNewBuilder = acv.newBuilder((acv) this.stat_);
            acuVarNewBuilder.mergeFrom((acu) acvVar);
            acvVar = acuVarNewBuilder.buildPartial();
        }
        this.stat_ = acvVar;
        this.statCase_ = 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapCompassButtonClicked(ahy ahyVar) {
        Objects.requireNonNull(ahyVar);
        if (this.statCase_ == 23 && this.stat_ != ahy.getDefaultInstance()) {
            ahx ahxVarNewBuilder = ahy.newBuilder((ahy) this.stat_);
            ahxVarNewBuilder.mergeFrom((ahx) ahyVar);
            ahyVar = ahxVarNewBuilder.buildPartial();
        }
        this.stat_ = ahyVar;
        this.statCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapFirstFrameRendered(aia aiaVar) {
        Objects.requireNonNull(aiaVar);
        if (this.statCase_ == 26 && this.stat_ != aia.getDefaultInstance()) {
            ahz ahzVarNewBuilder = aia.newBuilder((aia) this.stat_);
            ahzVarNewBuilder.mergeFrom((ahz) aiaVar);
            aiaVar = ahzVarNewBuilder.buildPartial();
        }
        this.stat_ = aiaVar;
        this.statCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapFrameRenderLatency(aic aicVar) {
        Objects.requireNonNull(aicVar);
        if (this.statCase_ == 25 && this.stat_ != aic.getDefaultInstance()) {
            aib aibVarNewBuilder = aic.newBuilder((aic) this.stat_);
            aibVarNewBuilder.mergeFrom((aib) aicVar);
            aicVar = aibVarNewBuilder.buildPartial();
        }
        this.stat_ = aicVar;
        this.statCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapObjectDensity(aih aihVar) {
        Objects.requireNonNull(aihVar);
        if (this.statCase_ == 5 && this.stat_ != aih.getDefaultInstance()) {
            aid aidVarNewBuilder = aih.newBuilder((aih) this.stat_);
            aidVarNewBuilder.mergeFrom((aid) aihVar);
            aihVar = aidVarNewBuilder.buildPartial();
        }
        this.stat_ = aihVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapObjectsSnapshot(ain ainVar) {
        Objects.requireNonNull(ainVar);
        if (this.statCase_ == 27 && this.stat_ != ain.getDefaultInstance()) {
            aii aiiVarNewBuilder = ain.newBuilder((ain) this.stat_);
            aiiVarNewBuilder.mergeFrom((aii) ainVar);
            ainVar = aiiVarNewBuilder.buildPartial();
        }
        this.stat_ = ainVar;
        this.statCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapPannedViaGesture(aip aipVar) {
        Objects.requireNonNull(aipVar);
        if (this.statCase_ == 6 && this.stat_ != aip.getDefaultInstance()) {
            aio aioVarNewBuilder = aip.newBuilder((aip) this.stat_);
            aioVarNewBuilder.mergeFrom((aio) aipVar);
            aipVar = aioVarNewBuilder.buildPartial();
        }
        this.stat_ = aipVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapPlaceholderHidden(air airVar) {
        Objects.requireNonNull(airVar);
        if (this.statCase_ == 19 && this.stat_ != air.getDefaultInstance()) {
            aiq aiqVarNewBuilder = air.newBuilder((air) this.stat_);
            aiqVarNewBuilder.mergeFrom((aiq) airVar);
            airVar = aiqVarNewBuilder.buildPartial();
        }
        this.stat_ = airVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapPlaceholderShown(ait aitVar) {
        Objects.requireNonNull(aitVar);
        if (this.statCase_ == 18 && this.stat_ != ait.getDefaultInstance()) {
            ais aisVarNewBuilder = ait.newBuilder((ait) this.stat_);
            aisVarNewBuilder.mergeFrom((ais) aitVar);
            aitVar = aisVarNewBuilder.buildPartial();
        }
        this.stat_ = aitVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapRenderingEngineCompletedLoading(aiv aivVar) {
        Objects.requireNonNull(aivVar);
        if (this.statCase_ == 21 && this.stat_ != aiv.getDefaultInstance()) {
            aiu aiuVarNewBuilder = aiv.newBuilder((aiv) this.stat_);
            aiuVarNewBuilder.mergeFrom((aiu) aivVar);
            aivVar = aiuVarNewBuilder.buildPartial();
        }
        this.stat_ = aivVar;
        this.statCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapRenderingEngineStartedLoading(aix aixVar) {
        Objects.requireNonNull(aixVar);
        if (this.statCase_ == 20 && this.stat_ != aix.getDefaultInstance()) {
            aiw aiwVarNewBuilder = aix.newBuilder((aix) this.stat_);
            aiwVarNewBuilder.mergeFrom((aiw) aixVar);
            aixVar = aiwVarNewBuilder.buildPartial();
        }
        this.stat_ = aixVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapShownAndReady(aiz aizVar) {
        Objects.requireNonNull(aizVar);
        if (this.statCase_ == 9 && this.stat_ != aiz.getDefaultInstance()) {
            aiy aiyVarNewBuilder = aiz.newBuilder((aiz) this.stat_);
            aiyVarNewBuilder.mergeFrom((aiy) aizVar);
            aizVar = aiyVarNewBuilder.buildPartial();
        }
        this.stat_ = aizVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapZoomButtonClicked(ajf ajfVar) {
        Objects.requireNonNull(ajfVar);
        if (this.statCase_ == 22 && this.stat_ != ajf.getDefaultInstance()) {
            aje ajeVarNewBuilder = ajf.newBuilder((ajf) this.stat_);
            ajeVarNewBuilder.mergeFrom((aje) ajfVar);
            ajfVar = ajeVarNewBuilder.buildPartial();
        }
        this.stat_ = ajfVar;
        this.statCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapZoomedInViaDoubleTapGesture(ajh ajhVar) {
        Objects.requireNonNull(ajhVar);
        if (this.statCase_ == 3 && this.stat_ != ajh.getDefaultInstance()) {
            ajg ajgVarNewBuilder = ajh.newBuilder((ajh) this.stat_);
            ajgVarNewBuilder.mergeFrom((ajg) ajhVar);
            ajhVar = ajgVarNewBuilder.buildPartial();
        }
        this.stat_ = ajhVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapZoomedOutViaDualTapGesture(ajj ajjVar) {
        Objects.requireNonNull(ajjVar);
        if (this.statCase_ == 2 && this.stat_ != ajj.getDefaultInstance()) {
            aji ajiVarNewBuilder = ajj.newBuilder((ajj) this.stat_);
            ajiVarNewBuilder.mergeFrom((aji) ajjVar);
            ajjVar = ajiVarNewBuilder.buildPartial();
        }
        this.stat_ = ajjVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMapZoomedViaGesturePinch(ajl ajlVar) {
        Objects.requireNonNull(ajlVar);
        if (this.statCase_ == 7 && this.stat_ != ajl.getDefaultInstance()) {
            ajk ajkVarNewBuilder = ajl.newBuilder((ajl) this.stat_);
            ajkVarNewBuilder.mergeFrom((ajk) ajlVar);
            ajlVar = ajkVarNewBuilder.buildPartial();
        }
        this.stat_ = ajlVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePinClicked(aql aqlVar) {
        Objects.requireNonNull(aqlVar);
        if (this.statCase_ == 13 && this.stat_ != aql.getDefaultInstance()) {
            aqk aqkVarNewBuilder = aql.newBuilder((aql) this.stat_);
            aqkVarNewBuilder.mergeFrom((aqk) aqlVar);
            aqlVar = aqkVarNewBuilder.buildPartial();
        }
        this.stat_ = aqlVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePinPopupClicked(aqo aqoVar) {
        Objects.requireNonNull(aqoVar);
        if (this.statCase_ == 14 && this.stat_ != aqo.getDefaultInstance()) {
            aqn aqnVarNewBuilder = aqo.newBuilder((aqo) this.stat_);
            aqnVarNewBuilder.mergeFrom((aqn) aqoVar);
            aqoVar = aqnVarNewBuilder.buildPartial();
        }
        this.stat_ = aqoVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygonRenderError(arf arfVar) {
        Objects.requireNonNull(arfVar);
        if (this.statCase_ == 17 && this.stat_ != arf.getDefaultInstance()) {
            arc arcVarNewBuilder = arf.newBuilder((arf) this.stat_);
            arcVarNewBuilder.mergeFrom((arc) arfVar);
            arfVar = arcVarNewBuilder.buildPartial();
        }
        this.stat_ = arfVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedometerSpeedLimitReachedShown(bfu bfuVar) {
        Objects.requireNonNull(bfuVar);
        if (this.statCase_ == 10 && this.stat_ != bfu.getDefaultInstance()) {
            bft bftVarNewBuilder = bfu.newBuilder((bfu) this.stat_);
            bftVarNewBuilder.mergeFrom((bft) bfuVar);
            bfuVar = bftVarNewBuilder.buildPartial();
        }
        this.stat_ = bfuVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTileBatchDownloaded(bib bibVar) {
        Objects.requireNonNull(bibVar);
        if (this.statCase_ == 11 && this.stat_ != bib.getDefaultInstance()) {
            bia biaVarNewBuilder = bib.newBuilder((bib) this.stat_);
            biaVarNewBuilder.mergeFrom((bia) bibVar);
            bibVar = biaVarNewBuilder.buildPartial();
        }
        this.stat_ = bibVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTileDownloadError(bid bidVar) {
        Objects.requireNonNull(bidVar);
        if (this.statCase_ == 8 && this.stat_ != bid.getDefaultInstance()) {
            bic bicVarNewBuilder = bid.newBuilder((bid) this.stat_);
            bicVarNewBuilder.mergeFrom((bic) bidVar);
            bidVar = bicVarNewBuilder.buildPartial();
        }
        this.stat_ = bidVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTileInconsistency(big bigVar) {
        Objects.requireNonNull(bigVar);
        if (this.statCase_ == 15 && this.stat_ != big.getDefaultInstance()) {
            bie bieVarNewBuilder = big.newBuilder((big) this.stat_);
            bieVarNewBuilder.mergeFrom((bie) bigVar);
            bigVar = bieVarNewBuilder.buildPartial();
        }
        this.stat_ = bigVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTileLatency(bii biiVar) {
        Objects.requireNonNull(biiVar);
        if (this.statCase_ == 1 && this.stat_ != bii.getDefaultInstance()) {
            bih bihVarNewBuilder = bii.newBuilder((bii) this.stat_);
            bihVarNewBuilder.mergeFrom((bih) biiVar);
            biiVar = bihVarNewBuilder.buildPartial();
        }
        this.stat_ = biiVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTileParsingError(bik bikVar) {
        Objects.requireNonNull(bikVar);
        if (this.statCase_ == 16 && this.stat_ != bik.getDefaultInstance()) {
            bij bijVarNewBuilder = bik.newBuilder((bik) this.stat_);
            bijVarNewBuilder.mergeFrom((bij) bikVar);
            bikVar = bijVarNewBuilder.buildPartial();
        }
        this.stat_ = bikVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTotalDownloadedTilesSizeChanged(bjk bjkVar) {
        Objects.requireNonNull(bjkVar);
        if (this.statCase_ == 12 && this.stat_ != bjk.getDefaultInstance()) {
            bjj bjjVarNewBuilder = bjk.newBuilder((bjk) this.stat_);
            bjjVarNewBuilder.mergeFrom((bjj) bjkVar);
            bjkVar = bjjVarNewBuilder.buildPartial();
        }
        this.stat_ = bjkVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportSdkButtonClicked(bjy bjyVar) {
        Objects.requireNonNull(bjyVar);
        if (this.statCase_ == 24 && this.stat_ != bjy.getDefaultInstance()) {
            bjx bjxVarNewBuilder = bjy.newBuilder((bjy) this.stat_);
            bjxVarNewBuilder.mergeFrom((bjx) bjyVar);
            bjyVar = bjxVarNewBuilder.buildPartial();
        }
        this.stat_ = bjyVar;
        this.statCase_ = 24;
    }

    public static aja newBuilder() {
        return (aja) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajc parseDelimitedFrom(InputStream inputStream) {
        return (ajc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajc parseFrom(com.google.v.v vVar) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameRenderTimeAboveThreshold(xg xgVar) {
        Objects.requireNonNull(xgVar);
        this.stat_ = xgVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInCarMapShown(acv acvVar) {
        Objects.requireNonNull(acvVar);
        this.stat_ = acvVar;
        this.statCase_ = 28;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapCompassButtonClicked(ahy ahyVar) {
        Objects.requireNonNull(ahyVar);
        this.stat_ = ahyVar;
        this.statCase_ = 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapFirstFrameRendered(aia aiaVar) {
        Objects.requireNonNull(aiaVar);
        this.stat_ = aiaVar;
        this.statCase_ = 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapFrameRenderLatency(aic aicVar) {
        Objects.requireNonNull(aicVar);
        this.stat_ = aicVar;
        this.statCase_ = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapObjectDensity(aih aihVar) {
        Objects.requireNonNull(aihVar);
        this.stat_ = aihVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapObjectsSnapshot(ain ainVar) {
        Objects.requireNonNull(ainVar);
        this.stat_ = ainVar;
        this.statCase_ = 27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapPannedViaGesture(aip aipVar) {
        Objects.requireNonNull(aipVar);
        this.stat_ = aipVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapPlaceholderHidden(air airVar) {
        Objects.requireNonNull(airVar);
        this.stat_ = airVar;
        this.statCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapPlaceholderShown(ait aitVar) {
        Objects.requireNonNull(aitVar);
        this.stat_ = aitVar;
        this.statCase_ = 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapRenderingEngineCompletedLoading(aiv aivVar) {
        Objects.requireNonNull(aivVar);
        this.stat_ = aivVar;
        this.statCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapRenderingEngineStartedLoading(aix aixVar) {
        Objects.requireNonNull(aixVar);
        this.stat_ = aixVar;
        this.statCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapShownAndReady(aiz aizVar) {
        Objects.requireNonNull(aizVar);
        this.stat_ = aizVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapZoomButtonClicked(ajf ajfVar) {
        Objects.requireNonNull(ajfVar);
        this.stat_ = ajfVar;
        this.statCase_ = 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapZoomedInViaDoubleTapGesture(ajh ajhVar) {
        Objects.requireNonNull(ajhVar);
        this.stat_ = ajhVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapZoomedOutViaDualTapGesture(ajj ajjVar) {
        Objects.requireNonNull(ajjVar);
        this.stat_ = ajjVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapZoomedViaGesturePinch(ajl ajlVar) {
        Objects.requireNonNull(ajlVar);
        this.stat_ = ajlVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinClicked(aql aqlVar) {
        Objects.requireNonNull(aqlVar);
        this.stat_ = aqlVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinPopupClicked(aqo aqoVar) {
        Objects.requireNonNull(aqoVar);
        this.stat_ = aqoVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonRenderError(arf arfVar) {
        Objects.requireNonNull(arfVar);
        this.stat_ = arfVar;
        this.statCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedometerSpeedLimitReachedShown(bfu bfuVar) {
        Objects.requireNonNull(bfuVar);
        this.stat_ = bfuVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileBatchDownloaded(bib bibVar) {
        Objects.requireNonNull(bibVar);
        this.stat_ = bibVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileDownloadError(bid bidVar) {
        Objects.requireNonNull(bidVar);
        this.stat_ = bidVar;
        this.statCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileInconsistency(big bigVar) {
        Objects.requireNonNull(bigVar);
        this.stat_ = bigVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileLatency(bii biiVar) {
        Objects.requireNonNull(biiVar);
        this.stat_ = biiVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileParsingError(bik bikVar) {
        Objects.requireNonNull(bikVar);
        this.stat_ = bikVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalDownloadedTilesSizeChanged(bjk bjkVar) {
        Objects.requireNonNull(bjkVar);
        this.stat_ = bjkVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportSdkButtonClicked(bjy bjyVar) {
        Objects.requireNonNull(bjyVar);
        this.stat_ = bjyVar;
        this.statCase_ = 24;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0001\u0000\u0001\u001c\u001c\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000", new Object[]{"stat_", "statCase_", bii.class, ajj.class, ajh.class, xg.class, aih.class, aip.class, ajl.class, bid.class, aiz.class, bfu.class, bib.class, bjk.class, aql.class, aqo.class, big.class, bik.class, arf.class, ait.class, air.class, aix.class, aiv.class, ajf.class, ahy.class, bjy.class, aic.class, aia.class, ain.class, acv.class});
        }
        if (iOrdinal == 3) {
            return new ajc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aja(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public xg getFrameRenderTimeAboveThreshold() {
        return this.statCase_ == 4 ? (xg) this.stat_ : xg.getDefaultInstance();
    }

    public acv getInCarMapShown() {
        return this.statCase_ == 28 ? (acv) this.stat_ : acv.getDefaultInstance();
    }

    public ahy getMapCompassButtonClicked() {
        return this.statCase_ == 23 ? (ahy) this.stat_ : ahy.getDefaultInstance();
    }

    public aia getMapFirstFrameRendered() {
        return this.statCase_ == 26 ? (aia) this.stat_ : aia.getDefaultInstance();
    }

    public aic getMapFrameRenderLatency() {
        return this.statCase_ == 25 ? (aic) this.stat_ : aic.getDefaultInstance();
    }

    public aih getMapObjectDensity() {
        return this.statCase_ == 5 ? (aih) this.stat_ : aih.getDefaultInstance();
    }

    public ain getMapObjectsSnapshot() {
        return this.statCase_ == 27 ? (ain) this.stat_ : ain.getDefaultInstance();
    }

    public aip getMapPannedViaGesture() {
        return this.statCase_ == 6 ? (aip) this.stat_ : aip.getDefaultInstance();
    }

    public air getMapPlaceholderHidden() {
        return this.statCase_ == 19 ? (air) this.stat_ : air.getDefaultInstance();
    }

    public ait getMapPlaceholderShown() {
        return this.statCase_ == 18 ? (ait) this.stat_ : ait.getDefaultInstance();
    }

    public aiv getMapRenderingEngineCompletedLoading() {
        return this.statCase_ == 21 ? (aiv) this.stat_ : aiv.getDefaultInstance();
    }

    public aix getMapRenderingEngineStartedLoading() {
        return this.statCase_ == 20 ? (aix) this.stat_ : aix.getDefaultInstance();
    }

    public aiz getMapShownAndReady() {
        return this.statCase_ == 9 ? (aiz) this.stat_ : aiz.getDefaultInstance();
    }

    public ajf getMapZoomButtonClicked() {
        return this.statCase_ == 22 ? (ajf) this.stat_ : ajf.getDefaultInstance();
    }

    public ajh getMapZoomedInViaDoubleTapGesture() {
        return this.statCase_ == 3 ? (ajh) this.stat_ : ajh.getDefaultInstance();
    }

    public ajj getMapZoomedOutViaDualTapGesture() {
        return this.statCase_ == 2 ? (ajj) this.stat_ : ajj.getDefaultInstance();
    }

    public ajl getMapZoomedViaGesturePinch() {
        return this.statCase_ == 7 ? (ajl) this.stat_ : ajl.getDefaultInstance();
    }

    public aql getPinClicked() {
        return this.statCase_ == 13 ? (aql) this.stat_ : aql.getDefaultInstance();
    }

    public aqo getPinPopupClicked() {
        return this.statCase_ == 14 ? (aqo) this.stat_ : aqo.getDefaultInstance();
    }

    public arf getPolygonRenderError() {
        return this.statCase_ == 17 ? (arf) this.stat_ : arf.getDefaultInstance();
    }

    public bfu getSpeedometerSpeedLimitReachedShown() {
        return this.statCase_ == 10 ? (bfu) this.stat_ : bfu.getDefaultInstance();
    }

    public ajb getStatCase() {
        switch (this.statCase_) {
            case 0:
                return ajb.C;
            case 1:
                return ajb.f52548a;
            case 2:
                return ajb.f52549b;
            case 3:
                return ajb.f52550c;
            case 4:
                return ajb.f52551d;
            case 5:
                return ajb.f52552e;
            case 6:
                return ajb.f52553f;
            case 7:
                return ajb.f52554g;
            case 8:
                return ajb.f52555h;
            case 9:
                return ajb.f52556i;
            case 10:
                return ajb.f52557j;
            case 11:
                return ajb.f52558k;
            case 12:
                return ajb.f52559l;
            case 13:
                return ajb.m;
            case 14:
                return ajb.n;
            case 15:
                return ajb.o;
            case 16:
                return ajb.p;
            case 17:
                return ajb.q;
            case 18:
                return ajb.r;
            case 19:
                return ajb.s;
            case 20:
                return ajb.t;
            case 21:
                return ajb.u;
            case 22:
                return ajb.v;
            case 23:
                return ajb.w;
            case 24:
                return ajb.x;
            case 25:
                return ajb.y;
            case 26:
                return ajb.z;
            case 27:
                return ajb.A;
            case 28:
                return ajb.B;
            default:
                return null;
        }
    }

    public bib getTileBatchDownloaded() {
        return this.statCase_ == 11 ? (bib) this.stat_ : bib.getDefaultInstance();
    }

    public bid getTileDownloadError() {
        return this.statCase_ == 8 ? (bid) this.stat_ : bid.getDefaultInstance();
    }

    public big getTileInconsistency() {
        return this.statCase_ == 15 ? (big) this.stat_ : big.getDefaultInstance();
    }

    public bii getTileLatency() {
        return this.statCase_ == 1 ? (bii) this.stat_ : bii.getDefaultInstance();
    }

    public bik getTileParsingError() {
        return this.statCase_ == 16 ? (bik) this.stat_ : bik.getDefaultInstance();
    }

    public bjk getTotalDownloadedTilesSizeChanged() {
        return this.statCase_ == 12 ? (bjk) this.stat_ : bjk.getDefaultInstance();
    }

    public bjy getTransportSdkButtonClicked() {
        return this.statCase_ == 24 ? (bjy) this.stat_ : bjy.getDefaultInstance();
    }

    public boolean hasFrameRenderTimeAboveThreshold() {
        return this.statCase_ == 4;
    }

    public boolean hasInCarMapShown() {
        return this.statCase_ == 28;
    }

    public boolean hasMapCompassButtonClicked() {
        return this.statCase_ == 23;
    }

    public boolean hasMapFirstFrameRendered() {
        return this.statCase_ == 26;
    }

    public boolean hasMapFrameRenderLatency() {
        return this.statCase_ == 25;
    }

    public boolean hasMapObjectDensity() {
        return this.statCase_ == 5;
    }

    public boolean hasMapObjectsSnapshot() {
        return this.statCase_ == 27;
    }

    public boolean hasMapPannedViaGesture() {
        return this.statCase_ == 6;
    }

    public boolean hasMapPlaceholderHidden() {
        return this.statCase_ == 19;
    }

    public boolean hasMapPlaceholderShown() {
        return this.statCase_ == 18;
    }

    public boolean hasMapRenderingEngineCompletedLoading() {
        return this.statCase_ == 21;
    }

    public boolean hasMapRenderingEngineStartedLoading() {
        return this.statCase_ == 20;
    }

    public boolean hasMapShownAndReady() {
        return this.statCase_ == 9;
    }

    public boolean hasMapZoomButtonClicked() {
        return this.statCase_ == 22;
    }

    public boolean hasMapZoomedInViaDoubleTapGesture() {
        return this.statCase_ == 3;
    }

    public boolean hasMapZoomedOutViaDualTapGesture() {
        return this.statCase_ == 2;
    }

    public boolean hasMapZoomedViaGesturePinch() {
        return this.statCase_ == 7;
    }

    public boolean hasPinClicked() {
        return this.statCase_ == 13;
    }

    public boolean hasPinPopupClicked() {
        return this.statCase_ == 14;
    }

    public boolean hasPolygonRenderError() {
        return this.statCase_ == 17;
    }

    public boolean hasSpeedometerSpeedLimitReachedShown() {
        return this.statCase_ == 10;
    }

    public boolean hasTileBatchDownloaded() {
        return this.statCase_ == 11;
    }

    public boolean hasTileDownloadError() {
        return this.statCase_ == 8;
    }

    public boolean hasTileInconsistency() {
        return this.statCase_ == 15;
    }

    public boolean hasTileLatency() {
        return this.statCase_ == 1;
    }

    public boolean hasTileParsingError() {
        return this.statCase_ == 16;
    }

    public boolean hasTotalDownloadedTilesSizeChanged() {
        return this.statCase_ == 12;
    }

    public boolean hasTransportSdkButtonClicked() {
        return this.statCase_ == 24;
    }

    public static aja newBuilder(ajc ajcVar) {
        return (aja) DEFAULT_INSTANCE.createBuilder(ajcVar);
    }

    public static ajc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajc parseFrom(com.google.v.z zVar) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajc parseFrom(InputStream inputStream) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajc parseFrom(ByteBuffer byteBuffer) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajc parseFrom(byte[] bArr) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
