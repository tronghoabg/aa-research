package i.b.v;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gl extends com.google.v.du<gl, gi> implements com.google.v.fj {
    public static final int ALONG_LINE_FIELD_NUMBER = 8;
    public static final int APPROVED_ONLY_FIELD_NUMBER = 15;
    public static final int BRANDS_FIELD_NUMBER = 5;
    public static final int CATEGORY_FIELD_NUMBER = 3;
    private static final gl DEFAULT_INSTANCE;
    public static final int DISTRIBUTE_FIELD_NUMBER = 12;
    public static final int EV_CONNECTOR_TYPES_FIELD_NUMBER = 32;
    public static final int EV_MIN_CHARGE_POWER_KW_FIELD_NUMBER = 34;
    public static final int EV_NETWORKS_FIELD_NUMBER = 33;
    public static final int EV_PUBLIC_STATIONS_FIELD_NUMBER = 35;
    public static final int EXCLUDED_CATEGORIES_FIELD_NUMBER = 25;
    public static final int FILL_CURRENCY_INFO_FIELD_NUMBER = 31;
    public static final int FILL_IMAGE_INFO_FIELD_NUMBER = 30;
    public static final int FILTER_BY_ATTRIBUTES_FIELD_NUMBER = 29;
    public static final int GEOMETRY_FIELD_NUMBER = 2;
    public static final int MAX_AGE_FIELD_NUMBER = 13;
    public static final int MAX_RESULTS_FIELD_NUMBER = 14;
    public static final int MERGE_USER_UPDATES_FIELD_NUMBER = 23;
    public static final int MINIMAL_AREA_FIELD_NUMBER = 19;
    public static final int MINIMAL_FILTERING_FIELD_NUMBER = 18;
    public static final int NEAR_BY_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<gl> PARSER = null;
    public static final int PRODUCTS_FIELD_NUMBER = 7;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 4;
    public static final int PROTOCOL_FIELD_NUMBER = 24;
    public static final int PROVIDERS_FIELD_NUMBER = 6;
    public static final int RESIDENTIAL_TOO_FIELD_NUMBER = 16;
    public static final int RETURN_ALL_IMAGES_FIELD_NUMBER = 27;
    public static final int RETURN_DISABLED_PROVIDERS_FIELD_NUMBER = 36;
    public static final int RETURN_PENDING_REQUESTS_FIELD_NUMBER = 26;
    public static final int RETURN_UNSCANNED_IMAGES_FIELD_NUMBER = 37;
    public static final int SESSION_FIELD_NUMBER = 1;
    public static final int SORT_BY_FIELD_NUMBER = 10;
    public static final int SORT_ORDER_FIELD_NUMBER = 11;
    public static final int THUMBS_ONLY_FIELD_NUMBER = 21;
    public static final int UNLISTED_TOO_FIELD_NUMBER = 17;
    public static final int USER_INFO_FIELD_NUMBER = 22;
    public static final int VERSION_FIELD_NUMBER = 20;
    public static final int WITH_PENDING_REQUESTS_ONLY_FIELD_NUMBER = 28;
    private bx alongLine_;
    private int bitField0_;
    private boolean distribute_;
    private float evMinChargePowerKw_;
    private boolean evPublicStations_;
    private bx geometry_;
    private int maxResults_;
    private boolean mergeUserUpdates_;
    private double minimalArea_;
    private boolean minimalFiltering_;
    private u nearBy_;
    private boolean residentialToo_;
    private boolean returnAllImages_;
    private boolean returnDisabledProviders_;
    private boolean returnPendingRequests_;
    private boolean returnUnscannedImages_;
    private int sortBy_;
    private int sortOrder_;
    private boolean thumbsOnly_;
    private boolean unlistedToo_;
    private dx userInfo_;
    private long version_;
    private boolean withPendingRequestsOnly_;
    private byte memoizedIsInitialized = 2;
    private String session_ = "";
    private com.google.v.eo<String> category_ = emptyProtobufList();
    private String productType_ = "";
    private com.google.v.eo<String> brands_ = emptyProtobufList();
    private com.google.v.eo<String> providers_ = emptyProtobufList();
    private com.google.v.eo<String> products_ = emptyProtobufList();
    private long maxAge_ = -1;
    private boolean approvedOnly_ = true;
    private int protocol_ = 1;
    private com.google.v.eo<String> excludedCategories_ = emptyProtobufList();
    private com.google.v.eo<ed> filterByAttributes_ = emptyProtobufList();
    private boolean fillImageInfo_ = true;
    private boolean fillCurrencyInfo_ = true;
    private com.google.v.eo<String> evConnectorTypes_ = emptyProtobufList();
    private com.google.v.eo<String> evNetworks_ = emptyProtobufList();

    static {
        gl glVar = new gl();
        DEFAULT_INSTANCE = glVar;
        com.google.v.du.registerDefaultInstance(gl.class, glVar);
    }

    private gl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBrands(Iterable<String> iterable) {
        ensureBrandsIsMutable();
        com.google.v.c.addAll(iterable, this.brands_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategory(Iterable<String> iterable) {
        ensureCategoryIsMutable();
        com.google.v.c.addAll(iterable, this.category_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvConnectorTypes(Iterable<String> iterable) {
        ensureEvConnectorTypesIsMutable();
        com.google.v.c.addAll(iterable, this.evConnectorTypes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvNetworks(Iterable<String> iterable) {
        ensureEvNetworksIsMutable();
        com.google.v.c.addAll(iterable, this.evNetworks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExcludedCategories(Iterable<String> iterable) {
        ensureExcludedCategoriesIsMutable();
        com.google.v.c.addAll(iterable, this.excludedCategories_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFilterByAttributes(Iterable<? extends ed> iterable) {
        ensureFilterByAttributesIsMutable();
        com.google.v.c.addAll(iterable, this.filterByAttributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducts(Iterable<String> iterable) {
        ensureProductsIsMutable();
        com.google.v.c.addAll(iterable, this.products_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProviders(Iterable<String> iterable) {
        ensureProvidersIsMutable();
        com.google.v.c.addAll(iterable, this.providers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBrands(String str) {
        Objects.requireNonNull(str);
        ensureBrandsIsMutable();
        this.brands_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBrandsBytes(com.google.v.v vVar) {
        ensureBrandsIsMutable();
        this.brands_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategory(String str) {
        Objects.requireNonNull(str);
        ensureCategoryIsMutable();
        this.category_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryBytes(com.google.v.v vVar) {
        ensureCategoryIsMutable();
        this.category_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorTypes(String str) {
        Objects.requireNonNull(str);
        ensureEvConnectorTypesIsMutable();
        this.evConnectorTypes_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorTypesBytes(com.google.v.v vVar) {
        ensureEvConnectorTypesIsMutable();
        this.evConnectorTypes_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvNetworks(String str) {
        Objects.requireNonNull(str);
        ensureEvNetworksIsMutable();
        this.evNetworks_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvNetworksBytes(com.google.v.v vVar) {
        ensureEvNetworksIsMutable();
        this.evNetworks_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludedCategories(String str) {
        Objects.requireNonNull(str);
        ensureExcludedCategoriesIsMutable();
        this.excludedCategories_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExcludedCategoriesBytes(com.google.v.v vVar) {
        ensureExcludedCategoriesIsMutable();
        this.excludedCategories_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilterByAttributes(int i2, ed edVar) {
        Objects.requireNonNull(edVar);
        ensureFilterByAttributesIsMutable();
        this.filterByAttributes_.add(i2, edVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducts(String str) {
        Objects.requireNonNull(str);
        ensureProductsIsMutable();
        this.products_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProductsBytes(com.google.v.v vVar) {
        ensureProductsIsMutable();
        this.products_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviders(String str) {
        Objects.requireNonNull(str);
        ensureProvidersIsMutable();
        this.providers_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvidersBytes(com.google.v.v vVar) {
        ensureProvidersIsMutable();
        this.providers_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlongLine() {
        this.alongLine_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApprovedOnly() {
        this.bitField0_ &= -1025;
        this.approvedOnly_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrands() {
        this.brands_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistribute() {
        this.bitField0_ &= -129;
        this.distribute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnectorTypes() {
        this.evConnectorTypes_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvMinChargePowerKw() {
        this.bitField0_ &= -33554433;
        this.evMinChargePowerKw_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvNetworks() {
        this.evNetworks_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvPublicStations() {
        this.bitField0_ &= -67108865;
        this.evPublicStations_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExcludedCategories() {
        this.excludedCategories_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFillCurrencyInfo() {
        this.bitField0_ &= -16777217;
        this.fillCurrencyInfo_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFillImageInfo() {
        this.bitField0_ &= -8388609;
        this.fillImageInfo_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilterByAttributes() {
        this.filterByAttributes_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry() {
        this.geometry_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAge() {
        this.bitField0_ &= -257;
        this.maxAge_ = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxResults() {
        this.bitField0_ &= -513;
        this.maxResults_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergeUserUpdates() {
        this.bitField0_ &= -262145;
        this.mergeUserUpdates_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinimalArea() {
        this.bitField0_ &= -16385;
        this.minimalArea_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinimalFiltering() {
        this.bitField0_ &= -8193;
        this.minimalFiltering_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNearBy() {
        this.nearBy_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductType() {
        this.bitField0_ &= -5;
        this.productType_ = getDefaultInstance().getProductType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducts() {
        this.products_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.bitField0_ &= -524289;
        this.protocol_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviders() {
        this.providers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResidentialToo() {
        this.bitField0_ &= -2049;
        this.residentialToo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnAllImages() {
        this.bitField0_ &= -2097153;
        this.returnAllImages_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnDisabledProviders() {
        this.bitField0_ &= -134217729;
        this.returnDisabledProviders_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnPendingRequests() {
        this.bitField0_ &= -1048577;
        this.returnPendingRequests_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnUnscannedImages() {
        this.bitField0_ &= -268435457;
        this.returnUnscannedImages_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSession() {
        this.bitField0_ &= -2;
        this.session_ = getDefaultInstance().getSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortBy() {
        this.bitField0_ &= -33;
        this.sortBy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortOrder() {
        this.bitField0_ &= -65;
        this.sortOrder_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbsOnly() {
        this.bitField0_ &= -65537;
        this.thumbsOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnlistedToo() {
        this.bitField0_ &= -4097;
        this.unlistedToo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.bitField0_ &= -32769;
        this.version_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWithPendingRequestsOnly() {
        this.bitField0_ &= -4194305;
        this.withPendingRequestsOnly_ = false;
    }

    private void ensureBrandsIsMutable() {
        com.google.v.eo<String> eoVar = this.brands_;
        if (eoVar.c()) {
            return;
        }
        this.brands_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureCategoryIsMutable() {
        com.google.v.eo<String> eoVar = this.category_;
        if (eoVar.c()) {
            return;
        }
        this.category_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureEvConnectorTypesIsMutable() {
        com.google.v.eo<String> eoVar = this.evConnectorTypes_;
        if (eoVar.c()) {
            return;
        }
        this.evConnectorTypes_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureEvNetworksIsMutable() {
        com.google.v.eo<String> eoVar = this.evNetworks_;
        if (eoVar.c()) {
            return;
        }
        this.evNetworks_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureExcludedCategoriesIsMutable() {
        com.google.v.eo<String> eoVar = this.excludedCategories_;
        if (eoVar.c()) {
            return;
        }
        this.excludedCategories_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureFilterByAttributesIsMutable() {
        com.google.v.eo<ed> eoVar = this.filterByAttributes_;
        if (eoVar.c()) {
            return;
        }
        this.filterByAttributes_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureProductsIsMutable() {
        com.google.v.eo<String> eoVar = this.products_;
        if (eoVar.c()) {
            return;
        }
        this.products_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureProvidersIsMutable() {
        com.google.v.eo<String> eoVar = this.providers_;
        if (eoVar.c()) {
            return;
        }
        this.providers_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlongLine(bx bxVar) {
        Objects.requireNonNull(bxVar);
        bx bxVar2 = this.alongLine_;
        if (bxVar2 != null && bxVar2 != bx.getDefaultInstance()) {
            bv bvVarNewBuilder = bx.newBuilder(bxVar2);
            bvVarNewBuilder.mergeFrom((bv) bxVar);
            bxVar = bvVarNewBuilder.buildPartial();
        }
        this.alongLine_ = bxVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometry(bx bxVar) {
        Objects.requireNonNull(bxVar);
        bx bxVar2 = this.geometry_;
        if (bxVar2 != null && bxVar2 != bx.getDefaultInstance()) {
            bv bvVarNewBuilder = bx.newBuilder(bxVar2);
            bvVarNewBuilder.mergeFrom((bv) bxVar);
            bxVar = bvVarNewBuilder.buildPartial();
        }
        this.geometry_ = bxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNearBy(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.nearBy_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.nearBy_ = uVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.userInfo_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.userInfo_ = dxVar;
        this.bitField0_ |= 131072;
    }

    public static gi newBuilder() {
        return (gi) DEFAULT_INSTANCE.createBuilder();
    }

    public static gl parseDelimitedFrom(InputStream inputStream) {
        return (gl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gl parseFrom(com.google.v.v vVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFilterByAttributes(int i2) {
        ensureFilterByAttributesIsMutable();
        this.filterByAttributes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlongLine(bx bxVar) {
        Objects.requireNonNull(bxVar);
        this.alongLine_ = bxVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApprovedOnly(boolean z) {
        this.bitField0_ |= 1024;
        this.approvedOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrands(int i2, String str) {
        Objects.requireNonNull(str);
        ensureBrandsIsMutable();
        this.brands_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCategoryIsMutable();
        this.category_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistribute(boolean z) {
        this.bitField0_ |= 128;
        this.distribute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnectorTypes(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEvConnectorTypesIsMutable();
        this.evConnectorTypes_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvMinChargePowerKw(float f2) {
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.evMinChargePowerKw_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvNetworks(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEvNetworksIsMutable();
        this.evNetworks_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvPublicStations(boolean z) {
        this.bitField0_ |= 67108864;
        this.evPublicStations_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExcludedCategories(int i2, String str) {
        Objects.requireNonNull(str);
        ensureExcludedCategoriesIsMutable();
        this.excludedCategories_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillCurrencyInfo(boolean z) {
        this.bitField0_ |= 16777216;
        this.fillCurrencyInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillImageInfo(boolean z) {
        this.bitField0_ |= 8388608;
        this.fillImageInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterByAttributes(int i2, ed edVar) {
        Objects.requireNonNull(edVar);
        ensureFilterByAttributesIsMutable();
        this.filterByAttributes_.set(i2, edVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometry(bx bxVar) {
        Objects.requireNonNull(bxVar);
        this.geometry_ = bxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAge(long j2) {
        this.bitField0_ |= 256;
        this.maxAge_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxResults(int i2) {
        this.bitField0_ |= 512;
        this.maxResults_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergeUserUpdates(boolean z) {
        this.bitField0_ |= 262144;
        this.mergeUserUpdates_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinimalArea(double d2) {
        this.bitField0_ |= 16384;
        this.minimalArea_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinimalFiltering(boolean z) {
        this.bitField0_ |= 8192;
        this.minimalFiltering_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNearBy(u uVar) {
        Objects.requireNonNull(uVar);
        this.nearBy_ = uVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.productType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductTypeBytes(com.google.v.v vVar) {
        this.productType_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducts(int i2, String str) {
        Objects.requireNonNull(str);
        ensureProductsIsMutable();
        this.products_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i2) {
        this.bitField0_ |= 524288;
        this.protocol_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviders(int i2, String str) {
        Objects.requireNonNull(str);
        ensureProvidersIsMutable();
        this.providers_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResidentialToo(boolean z) {
        this.bitField0_ |= 2048;
        this.residentialToo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnAllImages(boolean z) {
        this.bitField0_ |= 2097152;
        this.returnAllImages_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnDisabledProviders(boolean z) {
        this.bitField0_ |= 134217728;
        this.returnDisabledProviders_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnPendingRequests(boolean z) {
        this.bitField0_ |= 1048576;
        this.returnPendingRequests_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnUnscannedImages(boolean z) {
        this.bitField0_ |= 268435456;
        this.returnUnscannedImages_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSession(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.session_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionBytes(com.google.v.v vVar) {
        this.session_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortBy(gj gjVar) {
        this.sortBy_ = gjVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortOrder(gk gkVar) {
        this.sortOrder_ = gkVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbsOnly(boolean z) {
        this.bitField0_ |= 65536;
        this.thumbsOnly_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnlistedToo(boolean z) {
        this.bitField0_ |= 4096;
        this.unlistedToo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.userInfo_ = dxVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(long j2) {
        this.bitField0_ |= 32768;
        this.version_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWithPendingRequestsOnly(boolean z) {
        this.bitField0_ |= 4194304;
        this.withPendingRequestsOnly_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001%\u0000\u0001\u0001%%\u0000\b\u0004\u0001ဈ\u0000\u0002ᐉ\u0001\u0003\u001a\u0004ဈ\u0002\u0005\u001a\u0006\u001a\u0007\u001a\bᐉ\u0003\tᐉ\u0004\n᠌\u0005\u000b᠌\u0006\fဇ\u0007\rဂ\b\u000eင\t\u000fဇ\n\u0010ဇ\u000b\u0011ဇ\f\u0012ဇ\r\u0013က\u000e\u0014ဂ\u000f\u0015ဇ\u0010\u0016ဉ\u0011\u0017ဇ\u0012\u0018င\u0013\u0019\u001a\u001aဇ\u0014\u001bဇ\u0015\u001cဇ\u0016\u001dЛ\u001eဇ\u0017\u001fဇ\u0018 \u001a!\u001a\"ခ\u0019#ဇ\u001a$ဇ\u001b%ဇ\u001c", new Object[]{"bitField0_", "session_", "geometry_", "category_", "productType_", "brands_", "providers_", "products_", "alongLine_", "nearBy_", "sortBy_", ft.f49495c, "sortOrder_", ft.f49496d, "distribute_", "maxAge_", "maxResults_", "approvedOnly_", "residentialToo_", "unlistedToo_", "minimalFiltering_", "minimalArea_", "version_", "thumbsOnly_", "userInfo_", "mergeUserUpdates_", "protocol_", "excludedCategories_", "returnPendingRequests_", "returnAllImages_", "withPendingRequestsOnly_", "filterByAttributes_", ed.class, "fillImageInfo_", "fillCurrencyInfo_", "evConnectorTypes_", "evNetworks_", "evMinChargePowerKw_", "evPublicStations_", "returnDisabledProviders_", "returnUnscannedImages_"});
            case 3:
                return new gl();
            case 4:
                return new gi(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gl> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gl.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public bx getAlongLine() {
        bx bxVar = this.alongLine_;
        return bxVar == null ? bx.getDefaultInstance() : bxVar;
    }

    public boolean getApprovedOnly() {
        return this.approvedOnly_;
    }

    public String getBrands(int i2) {
        return this.brands_.get(i2);
    }

    public com.google.v.v getBrandsBytes(int i2) {
        return com.google.v.v.s(this.brands_.get(i2));
    }

    public int getBrandsCount() {
        return this.brands_.size();
    }

    public List<String> getBrandsList() {
        return this.brands_;
    }

    public String getCategory(int i2) {
        return this.category_.get(i2);
    }

    public com.google.v.v getCategoryBytes(int i2) {
        return com.google.v.v.s(this.category_.get(i2));
    }

    public int getCategoryCount() {
        return this.category_.size();
    }

    public List<String> getCategoryList() {
        return this.category_;
    }

    public boolean getDistribute() {
        return this.distribute_;
    }

    public String getEvConnectorTypes(int i2) {
        return this.evConnectorTypes_.get(i2);
    }

    public com.google.v.v getEvConnectorTypesBytes(int i2) {
        return com.google.v.v.s(this.evConnectorTypes_.get(i2));
    }

    public int getEvConnectorTypesCount() {
        return this.evConnectorTypes_.size();
    }

    public List<String> getEvConnectorTypesList() {
        return this.evConnectorTypes_;
    }

    public float getEvMinChargePowerKw() {
        return this.evMinChargePowerKw_;
    }

    public String getEvNetworks(int i2) {
        return this.evNetworks_.get(i2);
    }

    public com.google.v.v getEvNetworksBytes(int i2) {
        return com.google.v.v.s(this.evNetworks_.get(i2));
    }

    public int getEvNetworksCount() {
        return this.evNetworks_.size();
    }

    public List<String> getEvNetworksList() {
        return this.evNetworks_;
    }

    public boolean getEvPublicStations() {
        return this.evPublicStations_;
    }

    public String getExcludedCategories(int i2) {
        return this.excludedCategories_.get(i2);
    }

    public com.google.v.v getExcludedCategoriesBytes(int i2) {
        return com.google.v.v.s(this.excludedCategories_.get(i2));
    }

    public int getExcludedCategoriesCount() {
        return this.excludedCategories_.size();
    }

    public List<String> getExcludedCategoriesList() {
        return this.excludedCategories_;
    }

    public boolean getFillCurrencyInfo() {
        return this.fillCurrencyInfo_;
    }

    public boolean getFillImageInfo() {
        return this.fillImageInfo_;
    }

    public ed getFilterByAttributes(int i2) {
        return this.filterByAttributes_.get(i2);
    }

    public int getFilterByAttributesCount() {
        return this.filterByAttributes_.size();
    }

    public List<ed> getFilterByAttributesList() {
        return this.filterByAttributes_;
    }

    public ee getFilterByAttributesOrBuilder(int i2) {
        return this.filterByAttributes_.get(i2);
    }

    public List<? extends ee> getFilterByAttributesOrBuilderList() {
        return this.filterByAttributes_;
    }

    public bx getGeometry() {
        bx bxVar = this.geometry_;
        return bxVar == null ? bx.getDefaultInstance() : bxVar;
    }

    public long getMaxAge() {
        return this.maxAge_;
    }

    public int getMaxResults() {
        return this.maxResults_;
    }

    public boolean getMergeUserUpdates() {
        return this.mergeUserUpdates_;
    }

    public double getMinimalArea() {
        return this.minimalArea_;
    }

    public boolean getMinimalFiltering() {
        return this.minimalFiltering_;
    }

    public u getNearBy() {
        u uVar = this.nearBy_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public String getProductType() {
        return this.productType_;
    }

    public com.google.v.v getProductTypeBytes() {
        return com.google.v.v.s(this.productType_);
    }

    public String getProducts(int i2) {
        return this.products_.get(i2);
    }

    public com.google.v.v getProductsBytes(int i2) {
        return com.google.v.v.s(this.products_.get(i2));
    }

    public int getProductsCount() {
        return this.products_.size();
    }

    public List<String> getProductsList() {
        return this.products_;
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public String getProviders(int i2) {
        return this.providers_.get(i2);
    }

    public com.google.v.v getProvidersBytes(int i2) {
        return com.google.v.v.s(this.providers_.get(i2));
    }

    public int getProvidersCount() {
        return this.providers_.size();
    }

    public List<String> getProvidersList() {
        return this.providers_;
    }

    public boolean getResidentialToo() {
        return this.residentialToo_;
    }

    public boolean getReturnAllImages() {
        return this.returnAllImages_;
    }

    public boolean getReturnDisabledProviders() {
        return this.returnDisabledProviders_;
    }

    public boolean getReturnPendingRequests() {
        return this.returnPendingRequests_;
    }

    public boolean getReturnUnscannedImages() {
        return this.returnUnscannedImages_;
    }

    public String getSession() {
        return this.session_;
    }

    public com.google.v.v getSessionBytes() {
        return com.google.v.v.s(this.session_);
    }

    public gj getSortBy() {
        gj gjVarA = gj.a(this.sortBy_);
        return gjVarA == null ? gj.DISTANCE : gjVarA;
    }

    public gk getSortOrder() {
        gk gkVarA = gk.a(this.sortOrder_);
        return gkVarA == null ? gk.ASCENDING : gkVarA;
    }

    public boolean getThumbsOnly() {
        return this.thumbsOnly_;
    }

    public boolean getUnlistedToo() {
        return this.unlistedToo_;
    }

    public dx getUserInfo() {
        dx dxVar = this.userInfo_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    @Deprecated
    public long getVersion() {
        return this.version_;
    }

    public boolean getWithPendingRequestsOnly() {
        return this.withPendingRequestsOnly_;
    }

    public boolean hasAlongLine() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasApprovedOnly() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDistribute() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasEvMinChargePowerKw() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasEvPublicStations() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasFillCurrencyInfo() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasFillImageInfo() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasGeometry() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMaxAge() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMaxResults() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasMergeUserUpdates() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasMinimalArea() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasMinimalFiltering() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasNearBy() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasProductType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProtocol() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasResidentialToo() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasReturnAllImages() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasReturnDisabledProviders() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasReturnPendingRequests() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasReturnUnscannedImages() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasSession() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSortBy() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSortOrder() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasThumbsOnly() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasUnlistedToo() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasWithPendingRequestsOnly() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public static gi newBuilder(gl glVar) {
        return (gi) DEFAULT_INSTANCE.createBuilder(glVar);
    }

    public static gl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gl parseFrom(com.google.v.z zVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilterByAttributes(ed edVar) {
        Objects.requireNonNull(edVar);
        ensureFilterByAttributesIsMutable();
        this.filterByAttributes_.add(edVar);
    }

    public static gl parseFrom(InputStream inputStream) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gl parseFrom(ByteBuffer byteBuffer) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gl parseFrom(byte[] bArr) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
