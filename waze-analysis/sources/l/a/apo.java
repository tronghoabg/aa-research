package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apo extends com.google.v.du<apo, apm> implements com.google.v.fj {
    private static final apo DEFAULT_INSTANCE;
    public static final int NEAR_DESTINATION_PARKING_PINS_FIELD_NUMBER = 2;
    public static final int NO_NEAR_DESTINATION_PARKING_PINS_FIELD_NUMBER = 3;
    public static final int PARKING_MARK_POPUP_MENU_CLICKED_FIELD_NUMBER = 10;
    public static final int PARKING_MARK_SEND_LOCATION_CLICK_FIELD_NUMBER = 11;
    public static final int PARKING_NEAR_DESTINATION_FIND_NEARBY_CLICKED_FIELD_NUMBER = 9;
    public static final int PARKING_NEAR_DESTINATION_GET_PINS_FAILED_FIELD_NUMBER = 15;
    public static final int PARKING_NEAR_DESTINATION_MENU_CLICKED_FIELD_NUMBER = 6;
    public static final int PARKING_NEAR_DESTINATION_MENU_OPTION_CLICKED_FIELD_NUMBER = 7;
    public static final int PARKING_SUGGESTIONS_LATENCY_FIELD_NUMBER = 4;
    public static final int PARKING_SUGGESTIONS_SHOWN_FIELD_NUMBER = 5;
    public static final int PARKING_SUGGESTION_PIN_CLICKED_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<apo> PARSER = null;
    public static final int REMOVE_PARKING_MARK_FIELD_NUMBER = 12;
    public static final int SET_PARKING_MARK_FIELD_NUMBER = 16;
    public static final int WALKING_DETECTED_FIELD_NUMBER = 13;
    public static final int WALKING_MODE_ENDED_FIELD_NUMBER = 14;
    public static final int WALKING_MODE_STARTED_FIELD_NUMBER = 8;
    private int statCase_ = 0;
    private Object stat_;

    static {
        apo apoVar = new apo();
        DEFAULT_INSTANCE = apoVar;
        com.google.v.du.registerDefaultInstance(apo.class, apoVar);
    }

    private apo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNearDestinationParkingPins() {
        if (this.statCase_ == 2) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoNearDestinationParkingPins() {
        if (this.statCase_ == 3) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingMarkPopupMenuClicked() {
        if (this.statCase_ == 10) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingMarkSendLocationClick() {
        if (this.statCase_ == 11) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingNearDestinationFindNearbyClicked() {
        if (this.statCase_ == 9) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingNearDestinationGetPinsFailed() {
        if (this.statCase_ == 15) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingNearDestinationMenuClicked() {
        if (this.statCase_ == 6) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingNearDestinationMenuOptionClicked() {
        if (this.statCase_ == 7) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingSuggestionPinClicked() {
        if (this.statCase_ == 1) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingSuggestionsLatency() {
        if (this.statCase_ == 4) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingSuggestionsShown() {
        if (this.statCase_ == 5) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveParkingMark() {
        if (this.statCase_ == 12) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetParkingMark() {
        if (this.statCase_ == 16) {
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
    public void clearWalkingDetected() {
        if (this.statCase_ == 13) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingModeEnded() {
        if (this.statCase_ == 14) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalkingModeStarted() {
        if (this.statCase_ == 8) {
            this.statCase_ = 0;
            this.stat_ = null;
        }
    }

    public static apo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNearDestinationParkingPins(anb anbVar) {
        Objects.requireNonNull(anbVar);
        if (this.statCase_ == 2 && this.stat_ != anb.getDefaultInstance()) {
            ana anaVarNewBuilder = anb.newBuilder((anb) this.stat_);
            anaVarNewBuilder.mergeFrom((ana) anbVar);
            anbVar = anaVarNewBuilder.buildPartial();
        }
        this.stat_ = anbVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoNearDestinationParkingPins(anp anpVar) {
        Objects.requireNonNull(anpVar);
        if (this.statCase_ == 3 && this.stat_ != anp.getDefaultInstance()) {
            ann annVarNewBuilder = anp.newBuilder((anp) this.stat_);
            annVarNewBuilder.mergeFrom((ann) anpVar);
            anpVar = annVarNewBuilder.buildPartial();
        }
        this.stat_ = anpVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingMarkPopupMenuClicked(apa apaVar) {
        Objects.requireNonNull(apaVar);
        if (this.statCase_ == 10 && this.stat_ != apa.getDefaultInstance()) {
            aoz aozVarNewBuilder = apa.newBuilder((apa) this.stat_);
            aozVarNewBuilder.mergeFrom((aoz) apaVar);
            apaVar = aozVarNewBuilder.buildPartial();
        }
        this.stat_ = apaVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingMarkSendLocationClick(apc apcVar) {
        Objects.requireNonNull(apcVar);
        if (this.statCase_ == 11 && this.stat_ != apc.getDefaultInstance()) {
            apb apbVarNewBuilder = apc.newBuilder((apc) this.stat_);
            apbVarNewBuilder.mergeFrom((apb) apcVar);
            apcVar = apbVarNewBuilder.buildPartial();
        }
        this.stat_ = apcVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingNearDestinationFindNearbyClicked(ape apeVar) {
        Objects.requireNonNull(apeVar);
        if (this.statCase_ == 9 && this.stat_ != ape.getDefaultInstance()) {
            apd apdVarNewBuilder = ape.newBuilder((ape) this.stat_);
            apdVarNewBuilder.mergeFrom((apd) apeVar);
            apeVar = apdVarNewBuilder.buildPartial();
        }
        this.stat_ = apeVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingNearDestinationGetPinsFailed(apg apgVar) {
        Objects.requireNonNull(apgVar);
        if (this.statCase_ == 15 && this.stat_ != apg.getDefaultInstance()) {
            apf apfVarNewBuilder = apg.newBuilder((apg) this.stat_);
            apfVarNewBuilder.mergeFrom((apf) apgVar);
            apgVar = apfVarNewBuilder.buildPartial();
        }
        this.stat_ = apgVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingNearDestinationMenuClicked(api apiVar) {
        Objects.requireNonNull(apiVar);
        if (this.statCase_ == 6 && this.stat_ != api.getDefaultInstance()) {
            aph aphVarNewBuilder = api.newBuilder((api) this.stat_);
            aphVarNewBuilder.mergeFrom((aph) apiVar);
            apiVar = aphVarNewBuilder.buildPartial();
        }
        this.stat_ = apiVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingNearDestinationMenuOptionClicked(apl aplVar) {
        Objects.requireNonNull(aplVar);
        if (this.statCase_ == 7 && this.stat_ != apl.getDefaultInstance()) {
            apk apkVarNewBuilder = apl.newBuilder((apl) this.stat_);
            apkVarNewBuilder.mergeFrom((apk) aplVar);
            aplVar = apkVarNewBuilder.buildPartial();
        }
        this.stat_ = aplVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingSuggestionPinClicked(apr aprVar) {
        Objects.requireNonNull(aprVar);
        if (this.statCase_ == 1 && this.stat_ != apr.getDefaultInstance()) {
            app appVarNewBuilder = apr.newBuilder((apr) this.stat_);
            appVarNewBuilder.mergeFrom((app) aprVar);
            aprVar = appVarNewBuilder.buildPartial();
        }
        this.stat_ = aprVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingSuggestionsLatency(apu apuVar) {
        Objects.requireNonNull(apuVar);
        if (this.statCase_ == 4 && this.stat_ != apu.getDefaultInstance()) {
            aps apsVarNewBuilder = apu.newBuilder((apu) this.stat_);
            apsVarNewBuilder.mergeFrom((aps) apuVar);
            apuVar = apsVarNewBuilder.buildPartial();
        }
        this.stat_ = apuVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingSuggestionsShown(apw apwVar) {
        Objects.requireNonNull(apwVar);
        if (this.statCase_ == 5 && this.stat_ != apw.getDefaultInstance()) {
            apv apvVarNewBuilder = apw.newBuilder((apw) this.stat_);
            apvVarNewBuilder.mergeFrom((apv) apwVar);
            apwVar = apvVarNewBuilder.buildPartial();
        }
        this.stat_ = apwVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveParkingMark(auf aufVar) {
        Objects.requireNonNull(aufVar);
        if (this.statCase_ == 12 && this.stat_ != auf.getDefaultInstance()) {
            aud audVarNewBuilder = auf.newBuilder((auf) this.stat_);
            audVarNewBuilder.mergeFrom((aud) aufVar);
            aufVar = audVarNewBuilder.buildPartial();
        }
        this.stat_ = aufVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSetParkingMark(bbr bbrVar) {
        Objects.requireNonNull(bbrVar);
        if (this.statCase_ == 16 && this.stat_ != bbr.getDefaultInstance()) {
            bbp bbpVarNewBuilder = bbr.newBuilder((bbr) this.stat_);
            bbpVarNewBuilder.mergeFrom((bbp) bbrVar);
            bbrVar = bbpVarNewBuilder.buildPartial();
        }
        this.stat_ = bbrVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWalkingDetected(bqw bqwVar) {
        Objects.requireNonNull(bqwVar);
        if (this.statCase_ == 13 && this.stat_ != bqw.getDefaultInstance()) {
            bqv bqvVarNewBuilder = bqw.newBuilder((bqw) this.stat_);
            bqvVarNewBuilder.mergeFrom((bqv) bqwVar);
            bqwVar = bqvVarNewBuilder.buildPartial();
        }
        this.stat_ = bqwVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWalkingModeEnded(bqy bqyVar) {
        Objects.requireNonNull(bqyVar);
        if (this.statCase_ == 14 && this.stat_ != bqy.getDefaultInstance()) {
            bqx bqxVarNewBuilder = bqy.newBuilder((bqy) this.stat_);
            bqxVarNewBuilder.mergeFrom((bqx) bqyVar);
            bqyVar = bqxVarNewBuilder.buildPartial();
        }
        this.stat_ = bqyVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWalkingModeStarted(brc brcVar) {
        Objects.requireNonNull(brcVar);
        if (this.statCase_ == 8 && this.stat_ != brc.getDefaultInstance()) {
            brb brbVarNewBuilder = brc.newBuilder((brc) this.stat_);
            brbVarNewBuilder.mergeFrom((brb) brcVar);
            brcVar = brbVarNewBuilder.buildPartial();
        }
        this.stat_ = brcVar;
        this.statCase_ = 8;
    }

    public static apm newBuilder() {
        return (apm) DEFAULT_INSTANCE.createBuilder();
    }

    public static apo parseDelimitedFrom(InputStream inputStream) {
        return (apo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apo parseFrom(com.google.v.v vVar) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNearDestinationParkingPins(anb anbVar) {
        Objects.requireNonNull(anbVar);
        this.stat_ = anbVar;
        this.statCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoNearDestinationParkingPins(anp anpVar) {
        Objects.requireNonNull(anpVar);
        this.stat_ = anpVar;
        this.statCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingMarkPopupMenuClicked(apa apaVar) {
        Objects.requireNonNull(apaVar);
        this.stat_ = apaVar;
        this.statCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingMarkSendLocationClick(apc apcVar) {
        Objects.requireNonNull(apcVar);
        this.stat_ = apcVar;
        this.statCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingNearDestinationFindNearbyClicked(ape apeVar) {
        Objects.requireNonNull(apeVar);
        this.stat_ = apeVar;
        this.statCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingNearDestinationGetPinsFailed(apg apgVar) {
        Objects.requireNonNull(apgVar);
        this.stat_ = apgVar;
        this.statCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingNearDestinationMenuClicked(api apiVar) {
        Objects.requireNonNull(apiVar);
        this.stat_ = apiVar;
        this.statCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingNearDestinationMenuOptionClicked(apl aplVar) {
        Objects.requireNonNull(aplVar);
        this.stat_ = aplVar;
        this.statCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingSuggestionPinClicked(apr aprVar) {
        Objects.requireNonNull(aprVar);
        this.stat_ = aprVar;
        this.statCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingSuggestionsLatency(apu apuVar) {
        Objects.requireNonNull(apuVar);
        this.stat_ = apuVar;
        this.statCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingSuggestionsShown(apw apwVar) {
        Objects.requireNonNull(apwVar);
        this.stat_ = apwVar;
        this.statCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveParkingMark(auf aufVar) {
        Objects.requireNonNull(aufVar);
        this.stat_ = aufVar;
        this.statCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetParkingMark(bbr bbrVar) {
        Objects.requireNonNull(bbrVar);
        this.stat_ = bbrVar;
        this.statCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingDetected(bqw bqwVar) {
        Objects.requireNonNull(bqwVar);
        this.stat_ = bqwVar;
        this.statCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingModeEnded(bqy bqyVar) {
        Objects.requireNonNull(bqyVar);
        this.stat_ = bqyVar;
        this.statCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalkingModeStarted(brc brcVar) {
        Objects.requireNonNull(brcVar);
        this.stat_ = brcVar;
        this.statCase_ = 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"stat_", "statCase_", apr.class, anb.class, anp.class, apu.class, apw.class, api.class, apl.class, brc.class, ape.class, apa.class, apc.class, auf.class, bqw.class, bqy.class, apg.class, bbr.class});
        }
        if (iOrdinal == 3) {
            return new apo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new apm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public anb getNearDestinationParkingPins() {
        return this.statCase_ == 2 ? (anb) this.stat_ : anb.getDefaultInstance();
    }

    public anp getNoNearDestinationParkingPins() {
        return this.statCase_ == 3 ? (anp) this.stat_ : anp.getDefaultInstance();
    }

    public apa getParkingMarkPopupMenuClicked() {
        return this.statCase_ == 10 ? (apa) this.stat_ : apa.getDefaultInstance();
    }

    public apc getParkingMarkSendLocationClick() {
        return this.statCase_ == 11 ? (apc) this.stat_ : apc.getDefaultInstance();
    }

    public ape getParkingNearDestinationFindNearbyClicked() {
        return this.statCase_ == 9 ? (ape) this.stat_ : ape.getDefaultInstance();
    }

    public apg getParkingNearDestinationGetPinsFailed() {
        return this.statCase_ == 15 ? (apg) this.stat_ : apg.getDefaultInstance();
    }

    public api getParkingNearDestinationMenuClicked() {
        return this.statCase_ == 6 ? (api) this.stat_ : api.getDefaultInstance();
    }

    public apl getParkingNearDestinationMenuOptionClicked() {
        return this.statCase_ == 7 ? (apl) this.stat_ : apl.getDefaultInstance();
    }

    public apr getParkingSuggestionPinClicked() {
        return this.statCase_ == 1 ? (apr) this.stat_ : apr.getDefaultInstance();
    }

    public apu getParkingSuggestionsLatency() {
        return this.statCase_ == 4 ? (apu) this.stat_ : apu.getDefaultInstance();
    }

    public apw getParkingSuggestionsShown() {
        return this.statCase_ == 5 ? (apw) this.stat_ : apw.getDefaultInstance();
    }

    public auf getRemoveParkingMark() {
        return this.statCase_ == 12 ? (auf) this.stat_ : auf.getDefaultInstance();
    }

    public bbr getSetParkingMark() {
        return this.statCase_ == 16 ? (bbr) this.stat_ : bbr.getDefaultInstance();
    }

    public apn getStatCase() {
        switch (this.statCase_) {
            case 0:
                return apn.q;
            case 1:
                return apn.f52919a;
            case 2:
                return apn.f52920b;
            case 3:
                return apn.f52921c;
            case 4:
                return apn.f52922d;
            case 5:
                return apn.f52923e;
            case 6:
                return apn.f52924f;
            case 7:
                return apn.f52925g;
            case 8:
                return apn.f52926h;
            case 9:
                return apn.f52927i;
            case 10:
                return apn.f52928j;
            case 11:
                return apn.f52929k;
            case 12:
                return apn.f52930l;
            case 13:
                return apn.m;
            case 14:
                return apn.n;
            case 15:
                return apn.o;
            case 16:
                return apn.p;
            default:
                return null;
        }
    }

    public bqw getWalkingDetected() {
        return this.statCase_ == 13 ? (bqw) this.stat_ : bqw.getDefaultInstance();
    }

    public bqy getWalkingModeEnded() {
        return this.statCase_ == 14 ? (bqy) this.stat_ : bqy.getDefaultInstance();
    }

    public brc getWalkingModeStarted() {
        return this.statCase_ == 8 ? (brc) this.stat_ : brc.getDefaultInstance();
    }

    public boolean hasNearDestinationParkingPins() {
        return this.statCase_ == 2;
    }

    public boolean hasNoNearDestinationParkingPins() {
        return this.statCase_ == 3;
    }

    public boolean hasParkingMarkPopupMenuClicked() {
        return this.statCase_ == 10;
    }

    public boolean hasParkingMarkSendLocationClick() {
        return this.statCase_ == 11;
    }

    public boolean hasParkingNearDestinationFindNearbyClicked() {
        return this.statCase_ == 9;
    }

    public boolean hasParkingNearDestinationGetPinsFailed() {
        return this.statCase_ == 15;
    }

    public boolean hasParkingNearDestinationMenuClicked() {
        return this.statCase_ == 6;
    }

    public boolean hasParkingNearDestinationMenuOptionClicked() {
        return this.statCase_ == 7;
    }

    public boolean hasParkingSuggestionPinClicked() {
        return this.statCase_ == 1;
    }

    public boolean hasParkingSuggestionsLatency() {
        return this.statCase_ == 4;
    }

    public boolean hasParkingSuggestionsShown() {
        return this.statCase_ == 5;
    }

    public boolean hasRemoveParkingMark() {
        return this.statCase_ == 12;
    }

    public boolean hasSetParkingMark() {
        return this.statCase_ == 16;
    }

    public boolean hasWalkingDetected() {
        return this.statCase_ == 13;
    }

    public boolean hasWalkingModeEnded() {
        return this.statCase_ == 14;
    }

    public boolean hasWalkingModeStarted() {
        return this.statCase_ == 8;
    }

    public static apm newBuilder(apo apoVar) {
        return (apm) DEFAULT_INSTANCE.createBuilder(apoVar);
    }

    public static apo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apo parseFrom(com.google.v.z zVar) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apo parseFrom(InputStream inputStream) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apo parseFrom(ByteBuffer byteBuffer) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apo parseFrom(byte[] bArr) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
