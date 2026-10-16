package i.b.n;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import i.b.v.eb;
import i.b.v.ef;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ab extends du<ab, aa> implements ac {
    public static final int ACCREDITATION_ICON_FIELD_NUMBER = 4;
    public static final int ADVERTISER_CUSTOM_QUERY_FIELD_NUMBER = 18;
    public static final int ADVERTISER_POINT_ID_FIELD_NUMBER = 11;
    public static final int ADVERTISER_PREVIEW_QUERY_FIELD_NUMBER = 23;
    public static final int ADVERTISER_PROVIDER_ID_FIELD_NUMBER = 13;
    public static final int ADVERTISER_SERVICE_ID_FIELD_NUMBER = 12;
    public static final int AERIAL_DISTANCE_TO_ROUTE_METERS_FIELD_NUMBER = 39;
    public static final int ATTRIBUTE_FIELD_NUMBER = 5;
    public static final int BADGE_FIELD_NUMBER = 35;
    public static final int CAN_COPY_GEOCODING_DATA_FIELD_NUMBER = 29;
    public static final int CONFIDENT_HOUSE_NUMBER_FIELD_NUMBER = 26;
    public static final int CONTEXT_FIELD_NUMBER = 24;
    public static final int DEAL_FIELD_NUMBER = 9;
    private static final ab DEFAULT_INSTANCE;
    public static final int FRAME_FIELD_NUMBER = 34;
    public static final int HIDE_AD_DETAILS_FIELD_NUMBER = 38;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INFO_URL_APPEND_CLIENT_DATA_FIELD_NUMBER = 15;
    public static final int INFO_URL_FIELD_NUMBER = 14;
    public static final int KEYWORD_FIELD_NUMBER = 19;
    public static final int LIST_ICON_FIELD_NUMBER = 10;
    public static final int LOGO_TYPE_FIELD_NUMBER = 36;
    public static final int MATCH_INFO_FIELD_NUMBER = 37;
    public static final int NAVIGABLE_FIELD_NUMBER = 25;
    private static volatile fo<ab> PARSER = null;
    public static final int POI_INFO_URL_FIELD_NUMBER = 22;
    public static final int PREVIEW_ICON_FIELD_NUMBER = 27;
    public static final int PRICE_UNIT_FIELD_NUMBER = 6;
    public static final int PROVIDER_FIELD_NUMBER = 20;
    public static final int PROVIDER_INFO_URL_APPEND_CLIENT_DATA_FIELD_NUMBER = 33;
    public static final int PROVIDER_INFO_URL_FIELD_NUMBER = 32;
    public static final int ROUTING_CONTEXT_FIELD_NUMBER = 30;
    public static final int SEARCH_SERVER_INTERNAL_FIELD_NUMBER = 28;
    public static final int SHOW_AS_SPONSORED_FIELD_NUMBER = 31;
    public static final int SPONSERED_FIELD_NUMBER = 8;
    public static final int UPDATEABLE_FIELD_NUMBER = 21;
    public static final int VENUE_FIELD_NUMBER = 3;
    private long advertiserPointId_;
    private long advertiserProviderId_;
    private long advertiserServiceId_;
    private int aerialDistanceToRouteMeters_;
    private int bitField0_;
    private int bitField1_;
    private boolean canCopyGeocodingData_;
    private boolean confidentHouseNumber_;
    private e deal_;
    private boolean hideAdDetails_;
    private boolean infoUrlAppendClientData_;
    private boolean providerInfoUrlAppendClientData_;
    private ae searchServerInternal_;
    private boolean showAsSponsored_;
    private boolean sponsered_;
    private boolean updateable_;
    private ef venue_;
    private byte memoizedIsInitialized = 2;
    private String id_ = "";
    private String provider_ = "";
    private String accreditationIcon_ = "";
    private eo<String> attribute_ = emptyProtobufList();
    private String priceUnit_ = "";
    private eo<String> keyword_ = emptyProtobufList();
    private String listIcon_ = "";
    private String previewIcon_ = "";
    private String infoUrl_ = "";
    private String advertiserCustomQuery_ = "";
    private String poiInfoUrl_ = "";
    private String advertiserPreviewQuery_ = "";
    private String context_ = "";
    private String providerInfoUrl_ = "";
    private boolean navigable_ = true;
    private String routingContext_ = "";
    private String frame_ = "";
    private String badge_ = "";
    private String logoType_ = "";
    private String matchInfo_ = "";

    static {
        ab abVar = new ab();
        DEFAULT_INSTANCE = abVar;
        du.registerDefaultInstance(ab.class, abVar);
    }

    private ab() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttribute(Iterable<String> iterable) {
        ensureAttributeIsMutable();
        com.google.v.c.addAll(iterable, this.attribute_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeyword(Iterable<String> iterable) {
        ensureKeywordIsMutable();
        com.google.v.c.addAll(iterable, this.keyword_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttribute(String str) {
        Objects.requireNonNull(str);
        ensureAttributeIsMutable();
        this.attribute_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributeBytes(com.google.v.v vVar) {
        ensureAttributeIsMutable();
        this.attribute_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyword(String str) {
        Objects.requireNonNull(str);
        ensureKeywordIsMutable();
        this.keyword_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeywordBytes(com.google.v.v vVar) {
        ensureKeywordIsMutable();
        this.keyword_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccreditationIcon() {
        this.bitField0_ &= -9;
        this.accreditationIcon_ = getDefaultInstance().getAccreditationIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertiserCustomQuery() {
        this.bitField0_ &= -65537;
        this.advertiserCustomQuery_ = getDefaultInstance().getAdvertiserCustomQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertiserPointId() {
        this.bitField0_ &= -2049;
        this.advertiserPointId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertiserPreviewQuery() {
        this.bitField0_ &= -262145;
        this.advertiserPreviewQuery_ = getDefaultInstance().getAdvertiserPreviewQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertiserProviderId() {
        this.bitField0_ &= -8193;
        this.advertiserProviderId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertiserServiceId() {
        this.bitField0_ &= -4097;
        this.advertiserServiceId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAerialDistanceToRouteMeters() {
        this.bitField1_ &= -2;
        this.aerialDistanceToRouteMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttribute() {
        this.attribute_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadge() {
        this.bitField0_ &= -268435457;
        this.badge_ = getDefaultInstance().getBadge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanCopyGeocodingData() {
        this.bitField0_ &= -33;
        this.canCopyGeocodingData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidentHouseNumber() {
        this.bitField0_ &= -4194305;
        this.confidentHouseNumber_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.bitField0_ &= -524289;
        this.context_ = getDefaultInstance().getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeal() {
        this.deal_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrame() {
        this.bitField0_ &= -134217729;
        this.frame_ = getDefaultInstance().getFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideAdDetails() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.hideAdDetails_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoUrl() {
        this.bitField0_ &= -16385;
        this.infoUrl_ = getDefaultInstance().getInfoUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoUrlAppendClientData() {
        this.bitField0_ &= -32769;
        this.infoUrlAppendClientData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyword() {
        this.keyword_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListIcon() {
        this.bitField0_ &= -513;
        this.listIcon_ = getDefaultInstance().getListIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogoType() {
        this.bitField0_ &= -536870913;
        this.logoType_ = getDefaultInstance().getLogoType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMatchInfo() {
        this.bitField0_ &= -1073741825;
        this.matchInfo_ = getDefaultInstance().getMatchInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigable() {
        this.bitField0_ &= -8388609;
        this.navigable_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoiInfoUrl() {
        this.bitField0_ &= -131073;
        this.poiInfoUrl_ = getDefaultInstance().getPoiInfoUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewIcon() {
        this.bitField0_ &= -1025;
        this.previewIcon_ = getDefaultInstance().getPreviewIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceUnit() {
        this.bitField0_ &= -65;
        this.priceUnit_ = getDefaultInstance().getPriceUnit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -3;
        this.provider_ = getDefaultInstance().getProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderInfoUrl() {
        this.bitField0_ &= -1048577;
        this.providerInfoUrl_ = getDefaultInstance().getProviderInfoUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderInfoUrlAppendClientData() {
        this.bitField0_ &= -2097153;
        this.providerInfoUrlAppendClientData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.bitField0_ &= -33554433;
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchServerInternal() {
        this.searchServerInternal_ = null;
        this.bitField0_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowAsSponsored() {
        this.bitField0_ &= -67108865;
        this.showAsSponsored_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSponsered() {
        this.bitField0_ &= -129;
        this.sponsered_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateable() {
        this.bitField0_ &= -17;
        this.updateable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenue() {
        this.venue_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureAttributeIsMutable() {
        eo<String> eoVar = this.attribute_;
        if (eoVar.c()) {
            return;
        }
        this.attribute_ = du.mutableCopy(eoVar);
    }

    private void ensureKeywordIsMutable() {
        eo<String> eoVar = this.keyword_;
        if (eoVar.c()) {
            return;
        }
        this.keyword_ = du.mutableCopy(eoVar);
    }

    public static ab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeal(e eVar) {
        Objects.requireNonNull(eVar);
        e eVar2 = this.deal_;
        if (eVar2 != null && eVar2 != e.getDefaultInstance()) {
            d dVarNewBuilder = e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.deal_ = eVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSearchServerInternal(ae aeVar) {
        Objects.requireNonNull(aeVar);
        ae aeVar2 = this.searchServerInternal_;
        if (aeVar2 != null && aeVar2 != ae.getDefaultInstance()) {
            ad adVarNewBuilder = ae.newBuilder(aeVar2);
            adVarNewBuilder.mergeFrom((ad) aeVar);
            aeVar = adVarNewBuilder.buildPartial();
        }
        this.searchServerInternal_ = aeVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        ef efVar2 = this.venue_;
        if (efVar2 != null && efVar2 != ef.getDefaultInstance()) {
            eb ebVarNewBuilder = ef.newBuilder(efVar2);
            ebVarNewBuilder.mergeFrom((eb) efVar);
            efVar = ebVarNewBuilder.buildPartial();
        }
        this.venue_ = efVar;
        this.bitField0_ |= 4;
    }

    public static aa newBuilder() {
        return (aa) DEFAULT_INSTANCE.createBuilder();
    }

    public static ab parseDelimitedFrom(InputStream inputStream) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(com.google.v.v vVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ab> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccreditationIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.accreditationIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccreditationIconBytes(com.google.v.v vVar) {
        this.accreditationIcon_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserCustomQuery(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.advertiserCustomQuery_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserCustomQueryBytes(com.google.v.v vVar) {
        this.advertiserCustomQuery_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserPointId(long j2) {
        this.bitField0_ |= 2048;
        this.advertiserPointId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserPreviewQuery(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 262144;
        this.advertiserPreviewQuery_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserPreviewQueryBytes(com.google.v.v vVar) {
        this.advertiserPreviewQuery_ = vVar.u();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserProviderId(long j2) {
        this.bitField0_ |= 8192;
        this.advertiserProviderId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserServiceId(long j2) {
        this.bitField0_ |= 4096;
        this.advertiserServiceId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAerialDistanceToRouteMeters(int i2) {
        this.bitField1_ |= 1;
        this.aerialDistanceToRouteMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttribute(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAttributeIsMutable();
        this.attribute_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadge(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 268435456;
        this.badge_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadgeBytes(com.google.v.v vVar) {
        this.badge_ = vVar.u();
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanCopyGeocodingData(boolean z) {
        this.bitField0_ |= 32;
        this.canCopyGeocodingData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidentHouseNumber(boolean z) {
        this.bitField0_ |= 4194304;
        this.confidentHouseNumber_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 524288;
        this.context_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextBytes(com.google.v.v vVar) {
        this.context_ = vVar.u();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeal(e eVar) {
        Objects.requireNonNull(eVar);
        this.deal_ = eVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrame(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 134217728;
        this.frame_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameBytes(com.google.v.v vVar) {
        this.frame_ = vVar.u();
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideAdDetails(boolean z) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.hideAdDetails_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.infoUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoUrlAppendClientData(boolean z) {
        this.bitField0_ |= 32768;
        this.infoUrlAppendClientData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoUrlBytes(com.google.v.v vVar) {
        this.infoUrl_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyword(int i2, String str) {
        Objects.requireNonNull(str);
        ensureKeywordIsMutable();
        this.keyword_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.listIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListIconBytes(com.google.v.v vVar) {
        this.listIcon_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 536870912;
        this.logoType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoTypeBytes(com.google.v.v vVar) {
        this.logoType_ = vVar.u();
        this.bitField0_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchInfo(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1073741824;
        this.matchInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMatchInfoBytes(com.google.v.v vVar) {
        this.matchInfo_ = vVar.u();
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigable(boolean z) {
        this.bitField0_ |= 8388608;
        this.navigable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoiInfoUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.poiInfoUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoiInfoUrlBytes(com.google.v.v vVar) {
        this.poiInfoUrl_ = vVar.u();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIcon(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.previewIcon_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIconBytes(com.google.v.v vVar) {
        this.previewIcon_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceUnit(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.priceUnit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceUnitBytes(com.google.v.v vVar) {
        this.priceUnit_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.provider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderBytes(com.google.v.v vVar) {
        this.provider_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderInfoUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1048576;
        this.providerInfoUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderInfoUrlAppendClientData(boolean z) {
        this.bitField0_ |= 2097152;
        this.providerInfoUrlAppendClientData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderInfoUrlBytes(com.google.v.v vVar) {
        this.providerInfoUrl_ = vVar.u();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(com.google.v.v vVar) {
        this.routingContext_ = vVar.u();
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchServerInternal(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.searchServerInternal_ = aeVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowAsSponsored(boolean z) {
        this.bitField0_ |= 67108864;
        this.showAsSponsored_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSponsered(boolean z) {
        this.bitField0_ |= 128;
        this.sponsered_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateable(boolean z) {
        this.bitField0_ |= 16;
        this.updateable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenue(ef efVar) {
        Objects.requireNonNull(efVar);
        this.venue_ = efVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001#\u0000\u0002\u0001'#\u0000\u0002\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0006\bဇ\u0007\tဉ\b\nဈ\t\u000bဂ\u000b\fဂ\f\rဂ\r\u000eဈ\u000e\u000fဇ\u000f\u0012ဈ\u0010\u0013\u001a\u0014ဈ\u0001\u0015ဇ\u0004\u0016ဈ\u0011\u0017ဈ\u0012\u0018ဈ\u0013\u0019ဇ\u0017\u001aဇ\u0016\u001bဈ\n\u001cဉ\u0018\u001dဇ\u0005\u001eဈ\u0019\u001fဇ\u001a ဈ\u0014!ဇ\u0015\"ဈ\u001b#ဈ\u001c$ဈ\u001d%ဈ\u001e&ဇ\u001f'င ", new Object[]{"bitField0_", "bitField1_", "id_", "venue_", "accreditationIcon_", "attribute_", "priceUnit_", "sponsered_", "deal_", "listIcon_", "advertiserPointId_", "advertiserServiceId_", "advertiserProviderId_", "infoUrl_", "infoUrlAppendClientData_", "advertiserCustomQuery_", "keyword_", "provider_", "updateable_", "poiInfoUrl_", "advertiserPreviewQuery_", "context_", "navigable_", "confidentHouseNumber_", "previewIcon_", "searchServerInternal_", "canCopyGeocodingData_", "routingContext_", "showAsSponsored_", "providerInfoUrl_", "providerInfoUrlAppendClientData_", "frame_", "badge_", "logoType_", "matchInfo_", "hideAdDetails_", "aerialDistanceToRouteMeters_"});
            case 3:
                return new ab();
            case 4:
                return new aa(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<ab> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ab.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getAccreditationIcon() {
        return this.accreditationIcon_;
    }

    public com.google.v.v getAccreditationIconBytes() {
        return com.google.v.v.s(this.accreditationIcon_);
    }

    public String getAdvertiserCustomQuery() {
        return this.advertiserCustomQuery_;
    }

    public com.google.v.v getAdvertiserCustomQueryBytes() {
        return com.google.v.v.s(this.advertiserCustomQuery_);
    }

    public long getAdvertiserPointId() {
        return this.advertiserPointId_;
    }

    public String getAdvertiserPreviewQuery() {
        return this.advertiserPreviewQuery_;
    }

    public com.google.v.v getAdvertiserPreviewQueryBytes() {
        return com.google.v.v.s(this.advertiserPreviewQuery_);
    }

    public long getAdvertiserProviderId() {
        return this.advertiserProviderId_;
    }

    public long getAdvertiserServiceId() {
        return this.advertiserServiceId_;
    }

    public int getAerialDistanceToRouteMeters() {
        return this.aerialDistanceToRouteMeters_;
    }

    public String getAttribute(int i2) {
        return this.attribute_.get(i2);
    }

    public com.google.v.v getAttributeBytes(int i2) {
        return com.google.v.v.s(this.attribute_.get(i2));
    }

    public int getAttributeCount() {
        return this.attribute_.size();
    }

    public List<String> getAttributeList() {
        return this.attribute_;
    }

    public String getBadge() {
        return this.badge_;
    }

    public com.google.v.v getBadgeBytes() {
        return com.google.v.v.s(this.badge_);
    }

    public boolean getCanCopyGeocodingData() {
        return this.canCopyGeocodingData_;
    }

    public boolean getConfidentHouseNumber() {
        return this.confidentHouseNumber_;
    }

    public String getContext() {
        return this.context_;
    }

    public com.google.v.v getContextBytes() {
        return com.google.v.v.s(this.context_);
    }

    public e getDeal() {
        e eVar = this.deal_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public String getFrame() {
        return this.frame_;
    }

    public com.google.v.v getFrameBytes() {
        return com.google.v.v.s(this.frame_);
    }

    public boolean getHideAdDetails() {
        return this.hideAdDetails_;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public String getInfoUrl() {
        return this.infoUrl_;
    }

    public boolean getInfoUrlAppendClientData() {
        return this.infoUrlAppendClientData_;
    }

    public com.google.v.v getInfoUrlBytes() {
        return com.google.v.v.s(this.infoUrl_);
    }

    public String getKeyword(int i2) {
        return this.keyword_.get(i2);
    }

    public com.google.v.v getKeywordBytes(int i2) {
        return com.google.v.v.s(this.keyword_.get(i2));
    }

    public int getKeywordCount() {
        return this.keyword_.size();
    }

    public List<String> getKeywordList() {
        return this.keyword_;
    }

    public String getListIcon() {
        return this.listIcon_;
    }

    public com.google.v.v getListIconBytes() {
        return com.google.v.v.s(this.listIcon_);
    }

    public String getLogoType() {
        return this.logoType_;
    }

    public com.google.v.v getLogoTypeBytes() {
        return com.google.v.v.s(this.logoType_);
    }

    public String getMatchInfo() {
        return this.matchInfo_;
    }

    public com.google.v.v getMatchInfoBytes() {
        return com.google.v.v.s(this.matchInfo_);
    }

    public boolean getNavigable() {
        return this.navigable_;
    }

    public String getPoiInfoUrl() {
        return this.poiInfoUrl_;
    }

    public com.google.v.v getPoiInfoUrlBytes() {
        return com.google.v.v.s(this.poiInfoUrl_);
    }

    public String getPreviewIcon() {
        return this.previewIcon_;
    }

    public com.google.v.v getPreviewIconBytes() {
        return com.google.v.v.s(this.previewIcon_);
    }

    public String getPriceUnit() {
        return this.priceUnit_;
    }

    public com.google.v.v getPriceUnitBytes() {
        return com.google.v.v.s(this.priceUnit_);
    }

    public String getProvider() {
        return this.provider_;
    }

    public com.google.v.v getProviderBytes() {
        return com.google.v.v.s(this.provider_);
    }

    @Deprecated
    public String getProviderInfoUrl() {
        return this.providerInfoUrl_;
    }

    public boolean getProviderInfoUrlAppendClientData() {
        return this.providerInfoUrlAppendClientData_;
    }

    @Deprecated
    public com.google.v.v getProviderInfoUrlBytes() {
        return com.google.v.v.s(this.providerInfoUrl_);
    }

    public String getRoutingContext() {
        return this.routingContext_;
    }

    public com.google.v.v getRoutingContextBytes() {
        return com.google.v.v.s(this.routingContext_);
    }

    public ae getSearchServerInternal() {
        ae aeVar = this.searchServerInternal_;
        return aeVar == null ? ae.getDefaultInstance() : aeVar;
    }

    public boolean getShowAsSponsored() {
        return this.showAsSponsored_;
    }

    public boolean getSponsered() {
        return this.sponsered_;
    }

    public boolean getUpdateable() {
        return this.updateable_;
    }

    public ef getVenue() {
        ef efVar = this.venue_;
        return efVar == null ? ef.getDefaultInstance() : efVar;
    }

    public boolean hasAccreditationIcon() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAdvertiserCustomQuery() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasAdvertiserPointId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasAdvertiserPreviewQuery() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasAdvertiserProviderId() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasAdvertiserServiceId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAerialDistanceToRouteMeters() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasBadge() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasCanCopyGeocodingData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasConfidentHouseNumber() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasContext() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasDeal() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasFrame() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasHideAdDetails() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInfoUrl() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasInfoUrlAppendClientData() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasListIcon() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasLogoType() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasMatchInfo() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasNavigable() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasPoiInfoUrl() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasPreviewIcon() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasPriceUnit() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasProviderInfoUrl() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasProviderInfoUrlAppendClientData() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasRoutingContext() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasSearchServerInternal() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasShowAsSponsored() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasSponsered() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasUpdateable() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVenue() {
        return (this.bitField0_ & 4) != 0;
    }

    public static aa newBuilder(ab abVar) {
        return (aa) DEFAULT_INSTANCE.createBuilder(abVar);
    }

    public static ab parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(com.google.v.v vVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ab parseFrom(com.google.v.z zVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ab parseFrom(com.google.v.z zVar, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ab parseFrom(InputStream inputStream) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ab parseFrom(InputStream inputStream, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ab parseFrom(ByteBuffer byteBuffer) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ab parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ab parseFrom(byte[] bArr) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ab parseFrom(byte[] bArr, de deVar) {
        return (ab) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
