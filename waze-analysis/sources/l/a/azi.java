package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azi extends com.google.v.du<azi, azg> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 6;
    public static final int BOOK_PARKING_INDICATION_SHOWN_FIELD_NUMBER = 25;
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 10;
    public static final int CATEGORICAL_SEARCH_NAME_FIELD_NUMBER = 9;
    private static final azi DEFAULT_INSTANCE;
    public static final int DETOUR_TO_RESULT_MINUTES_FIELD_NUMBER = 5;
    public static final int DISPLAYING_AD_FIELD_NUMBER = 3;
    public static final int DISTANCE_TO_RESULT_METERS_FIELD_NUMBER = 4;
    public static final int ELECTRIC_VEHICLE_CHARGING_STATION_INFORMATION_FIELD_NUMBER = 21;
    public static final int FILTER_FIELDS_FIELD_NUMBER = 24;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int ORIGINAL_INDEX_FIELD_NUMBER = 2;
    public static final int PARKING_FIELD_NUMBER = 7;
    public static final int PARKING_PRICES_SHOWN_FIELD_NUMBER = 23;
    private static volatile com.google.v.fo<azi> PARSER = null;
    public static final int POPULAR_PARKING_FIELD_NUMBER = 8;
    public static final int RESULT_COORDINATES_FIELD_NUMBER = 12;
    public static final int RESULT_SOURCE_FIELD_NUMBER = 13;
    public static final int SEARCH_AGAIN_FIELD_NUMBER = 22;
    public static final int SEARCH_ID_FIELD_NUMBER = 17;
    public static final int SORT_FIELD_FIELD_NUMBER = 15;
    public static final int SOURCE_FIELD_NUMBER = 14;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 26;
    public static final int TYPE_FIELD_NUMBER = 16;
    public static final int VENUE_ID_FIELD_NUMBER = 11;
    public static final int VENUE_OPENING_STATUS_FIELD_NUMBER = 18;
    public static final int VENUE_PRICE_LEVEL_FIELD_NUMBER = 20;
    public static final int VENUE_RATING_FIELD_NUMBER = 19;
    private int action_;
    private int bitField0_;
    private boolean bookParkingIndicationShown_;
    private int categoricalGroupSearchName_;
    private long detourToResultMinutes_;
    private boolean displayingAd_;
    private long distanceToResultMeters_;
    private tn electricVehicleChargingStationInformation_;
    private long index_;
    private long originalIndex_;
    private boolean parkingPricesShown_;
    private boolean parking_;
    private boolean popularParking_;
    private afx resultCoordinates_;
    private int resultSource_;
    private boolean searchAgain_;
    private int sortField_;
    private int source_;
    private int triggeringPlatform_;
    private int type_;
    private int venueOpeningStatus_;
    private long venuePriceLevel_;
    private float venueRating_;
    private String categoricalSearchName_ = "";
    private String venueId_ = "";
    private String searchId_ = "";
    private com.google.v.eo<ayr> filterFields_ = emptyProtobufList();

    static {
        azi aziVar = new azi();
        DEFAULT_INSTANCE = aziVar;
        com.google.v.du.registerDefaultInstance(azi.class, aziVar);
    }

    private azi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFilterFields(Iterable<? extends ayr> iterable) {
        ensureFilterFieldsIsMutable();
        com.google.v.c.addAll(iterable, this.filterFields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilterFields(int i2, ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.add(i2, ayrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookParkingIndicationShown() {
        this.bitField0_ &= -8193;
        this.bookParkingIndicationShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoricalGroupSearchName() {
        this.categoricalGroupSearchName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoricalSearchName() {
        this.categoricalSearchName_ = getDefaultInstance().getCategoricalSearchName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourToResultMinutes() {
        this.bitField0_ &= -17;
        this.detourToResultMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayingAd() {
        this.bitField0_ &= -5;
        this.displayingAd_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToResultMeters() {
        this.bitField0_ &= -9;
        this.distanceToResultMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElectricVehicleChargingStationInformation() {
        this.electricVehicleChargingStationInformation_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilterFields() {
        this.filterFields_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalIndex() {
        this.bitField0_ &= -3;
        this.originalIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParking() {
        this.bitField0_ &= -33;
        this.parking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingPricesShown() {
        this.bitField0_ &= -4097;
        this.parkingPricesShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularParking() {
        this.bitField0_ &= -65;
        this.popularParking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCoordinates() {
        this.resultCoordinates_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultSource() {
        this.resultSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchAgain() {
        this.bitField0_ &= -2049;
        this.searchAgain_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortField() {
        this.sortField_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueOpeningStatus() {
        this.venueOpeningStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenuePriceLevel() {
        this.bitField0_ &= -513;
        this.venuePriceLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueRating() {
        this.bitField0_ &= -257;
        this.venueRating_ = 0.0f;
    }

    private void ensureFilterFieldsIsMutable() {
        com.google.v.eo<ayr> eoVar = this.filterFields_;
        if (eoVar.c()) {
            return;
        }
        this.filterFields_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static azi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElectricVehicleChargingStationInformation(tn tnVar) {
        Objects.requireNonNull(tnVar);
        tn tnVar2 = this.electricVehicleChargingStationInformation_;
        if (tnVar2 != null && tnVar2 != tn.getDefaultInstance()) {
            tm tmVarNewBuilder = tn.newBuilder(tnVar2);
            tmVarNewBuilder.mergeFrom((tm) tnVar);
            tnVar = tmVarNewBuilder.buildPartial();
        }
        this.electricVehicleChargingStationInformation_ = tnVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResultCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.resultCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.resultCoordinates_ = afxVar;
        this.bitField0_ |= 128;
    }

    public static azg newBuilder() {
        return (azg) DEFAULT_INSTANCE.createBuilder();
    }

    public static azi parseDelimitedFrom(InputStream inputStream) {
        return (azi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azi parseFrom(com.google.v.v vVar) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<azi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFilterFields(int i2) {
        ensureFilterFieldsIsMutable();
        this.filterFields_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(azf azfVar) {
        this.action_ = azfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookParkingIndicationShown(boolean z) {
        this.bitField0_ |= 8192;
        this.bookParkingIndicationShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchName(ayn aynVar) {
        this.categoricalGroupSearchName_ = aynVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchNameValue(int i2) {
        this.categoricalGroupSearchName_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalSearchName(String str) {
        Objects.requireNonNull(str);
        this.categoricalSearchName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalSearchNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.categoricalSearchName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourToResultMinutes(long j2) {
        this.bitField0_ |= 16;
        this.detourToResultMinutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayingAd(boolean z) {
        this.bitField0_ |= 4;
        this.displayingAd_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToResultMeters(long j2) {
        this.bitField0_ |= 8;
        this.distanceToResultMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElectricVehicleChargingStationInformation(tn tnVar) {
        Objects.requireNonNull(tnVar);
        this.electricVehicleChargingStationInformation_ = tnVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterFields(int i2, ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.set(i2, ayrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.bitField0_ |= 1;
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalIndex(long j2) {
        this.bitField0_ |= 2;
        this.originalIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParking(boolean z) {
        this.bitField0_ |= 32;
        this.parking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingPricesShown(boolean z) {
        this.bitField0_ |= 4096;
        this.parkingPricesShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopularParking(boolean z) {
        this.bitField0_ |= 64;
        this.popularParking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.resultCoordinates_ = afxVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultSource(azh azhVar) {
        this.resultSource_ = azhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultSourceValue(int i2) {
        this.resultSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAgain(boolean z) {
        this.bitField0_ |= 2048;
        this.searchAgain_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchId(String str) {
        Objects.requireNonNull(str);
        this.searchId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.searchId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortField(azr azrVar) {
        this.sortField_ = azrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortFieldValue(int i2) {
        this.sortField_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(azs azsVar) {
        this.source_ = azsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(azy azyVar) {
        this.type_ = azyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueOpeningStatus(bps bpsVar) {
        this.venueOpeningStatus_ = bpsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueOpeningStatusValue(int i2) {
        this.venueOpeningStatus_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenuePriceLevel(long j2) {
        this.bitField0_ |= 512;
        this.venuePriceLevel_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueRating(float f2) {
        this.bitField0_ |= 256;
        this.venueRating_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006\f\u0007ဇ\u0005\bဇ\u0006\tȈ\n\f\u000bȈ\fဉ\u0007\r\f\u000e\f\u000f\f\u0010\f\u0011Ȉ\u0012\f\u0013ခ\b\u0014ဂ\t\u0015ဉ\n\u0016ဇ\u000b\u0017ဇ\f\u0018\u001b\u0019ဇ\r\u001a\f", new Object[]{"bitField0_", "index_", "originalIndex_", "displayingAd_", "distanceToResultMeters_", "detourToResultMinutes_", "action_", "parking_", "popularParking_", "categoricalSearchName_", "categoricalGroupSearchName_", "venueId_", "resultCoordinates_", "resultSource_", "source_", "sortField_", "type_", "searchId_", "venueOpeningStatus_", "venueRating_", "venuePriceLevel_", "electricVehicleChargingStationInformation_", "searchAgain_", "parkingPricesShown_", "filterFields_", ayr.class, "bookParkingIndicationShown_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new azi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new azg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<azi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (azi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public azf getAction() {
        azf azfVar;
        switch (this.action_) {
            case 0:
                azfVar = azf.ACTION_UNSPECIFIED;
                break;
            case 1:
                azfVar = azf.SELECT;
                break;
            case 2:
                azfVar = azf.PIN;
                break;
            case 3:
                azfVar = azf.MAP;
                break;
            case 4:
                azfVar = azf.ALGO_TRANSPARENCY_LINK;
                break;
            case 5:
                azfVar = azf.CLOSE;
                break;
            case 6:
                azfVar = azf.BACK_TO_LIST;
                break;
            case 7:
                azfVar = azf.BACK;
                break;
            default:
                azfVar = null;
                break;
        }
        return azfVar == null ? azf.UNRECOGNIZED : azfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getBookParkingIndicationShown() {
        return this.bookParkingIndicationShown_;
    }

    public ayn getCategoricalGroupSearchName() {
        ayn aynVarA = ayn.a(this.categoricalGroupSearchName_);
        return aynVarA == null ? ayn.UNRECOGNIZED : aynVarA;
    }

    public int getCategoricalGroupSearchNameValue() {
        return this.categoricalGroupSearchName_;
    }

    public String getCategoricalSearchName() {
        return this.categoricalSearchName_;
    }

    public com.google.v.v getCategoricalSearchNameBytes() {
        return com.google.v.v.s(this.categoricalSearchName_);
    }

    public long getDetourToResultMinutes() {
        return this.detourToResultMinutes_;
    }

    public boolean getDisplayingAd() {
        return this.displayingAd_;
    }

    public long getDistanceToResultMeters() {
        return this.distanceToResultMeters_;
    }

    public tn getElectricVehicleChargingStationInformation() {
        tn tnVar = this.electricVehicleChargingStationInformation_;
        return tnVar == null ? tn.getDefaultInstance() : tnVar;
    }

    public ayr getFilterFields(int i2) {
        return this.filterFields_.get(i2);
    }

    public int getFilterFieldsCount() {
        return this.filterFields_.size();
    }

    public List<ayr> getFilterFieldsList() {
        return this.filterFields_;
    }

    public ayv getFilterFieldsOrBuilder(int i2) {
        return this.filterFields_.get(i2);
    }

    public List<? extends ayv> getFilterFieldsOrBuilderList() {
        return this.filterFields_;
    }

    public long getIndex() {
        return this.index_;
    }

    public long getOriginalIndex() {
        return this.originalIndex_;
    }

    public boolean getParking() {
        return this.parking_;
    }

    public boolean getParkingPricesShown() {
        return this.parkingPricesShown_;
    }

    public boolean getPopularParking() {
        return this.popularParking_;
    }

    public afx getResultCoordinates() {
        afx afxVar = this.resultCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public azh getResultSource() {
        int i2 = this.resultSource_;
        azh azhVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : azh.GOOGLE : azh.WAZE : azh.RESULT_SOURCE_UNSPECIFIED;
        return azhVar == null ? azh.UNRECOGNIZED : azhVar;
    }

    public int getResultSourceValue() {
        return this.resultSource_;
    }

    public boolean getSearchAgain() {
        return this.searchAgain_;
    }

    public String getSearchId() {
        return this.searchId_;
    }

    public com.google.v.v getSearchIdBytes() {
        return com.google.v.v.s(this.searchId_);
    }

    public azr getSortField() {
        azr azrVarA = azr.a(this.sortField_);
        return azrVarA == null ? azr.UNRECOGNIZED : azrVarA;
    }

    public int getSortFieldValue() {
        return this.sortField_;
    }

    public azs getSource() {
        azs azsVarA = azs.a(this.source_);
        return azsVarA == null ? azs.UNRECOGNIZED : azsVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public azy getType() {
        azy azyVarA = azy.a(this.type_);
        return azyVarA == null ? azy.UNRECOGNIZED : azyVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public bps getVenueOpeningStatus() {
        bps bpsVarA = bps.a(this.venueOpeningStatus_);
        return bpsVarA == null ? bps.UNRECOGNIZED : bpsVarA;
    }

    public int getVenueOpeningStatusValue() {
        return this.venueOpeningStatus_;
    }

    public long getVenuePriceLevel() {
        return this.venuePriceLevel_;
    }

    public float getVenueRating() {
        return this.venueRating_;
    }

    public boolean hasBookParkingIndicationShown() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasDetourToResultMinutes() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDisplayingAd() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDistanceToResultMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasElectricVehicleChargingStationInformation() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOriginalIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParking() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasParkingPricesShown() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasPopularParking() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResultCoordinates() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSearchAgain() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasVenuePriceLevel() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasVenueRating() {
        return (this.bitField0_ & 256) != 0;
    }

    public static azg newBuilder(azi aziVar) {
        return (azg) DEFAULT_INSTANCE.createBuilder(aziVar);
    }

    public static azi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static azi parseFrom(com.google.v.z zVar) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static azi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilterFields(ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.add(ayrVar);
    }

    public static azi parseFrom(InputStream inputStream) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azi parseFrom(ByteBuffer byteBuffer) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static azi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static azi parseFrom(byte[] bArr) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static azi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (azi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
