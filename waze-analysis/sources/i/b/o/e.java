package i.b.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e extends du<e, d> implements i {
    public static final int BRAND_FIELD_NUMBER = 2012;
    public static final int CANNEDSEARCH_FIELD_NUMBER = 2013;
    private static final e DEFAULT_INSTANCE;
    public static final int ENDOFDRIVEPROVIDERID_FIELD_NUMBER = 1016;
    public static final int HASIMAGE_FIELD_NUMBER = 2018;
    public static final int ID_FIELD_NUMBER = 2001;
    public static final int MAXDISTANCEMETERS_FIELD_NUMBER = 2006;
    public static final int NAME_FIELD_NUMBER = 2002;
    public static final int PARENT_CATEGORY_ID_FIELD_NUMBER = 2017;
    private static volatile fo<e> PARSER = null;
    public static final int PRICEFORMAT_FIELD_NUMBER = 2011;
    public static final int PRODUCT_FIELD_NUMBER = 2005;
    public static final int PROVIDER_FIELD_NUMBER = 2003;
    public static final int REGULARNAME_FIELD_NUMBER = 2014;
    public static final int REGULARURLPARAMS_FIELD_NUMBER = 2007;
    public static final int ROUTENAME_FIELD_NUMBER = 2015;
    public static final int ROUTEURLPARAMS_FIELD_NUMBER = 2008;
    public static final int UPDATENAME_FIELD_NUMBER = 2016;
    public static final int UPDATEURLPARAMS_FIELD_NUMBER = 2009;
    private int bitField0_;
    private boolean hasImage_;
    private long maxDistanceMeters_;
    private String id_ = "";
    private String name_ = "";
    private eo<n> provider_ = emptyProtobufList();
    private eo<k> product_ = emptyProtobufList();
    private String regularUrlParams_ = "";
    private String routeUrlParams_ = "";
    private String updateUrlParams_ = "";
    private String priceFormat_ = "";
    private eo<String> brand_ = emptyProtobufList();
    private eo<b> cannedSearch_ = emptyProtobufList();
    private String regularName_ = "";
    private String routeName_ = "";
    private String updateName_ = "";
    private String parentCategoryId_ = "";
    private eo<String> endOfDriveProviderId_ = emptyProtobufList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBrand(Iterable<String> iterable) {
        ensureBrandIsMutable();
        com.google.v.c.addAll(iterable, this.brand_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCannedSearch(Iterable<? extends b> iterable) {
        ensureCannedSearchIsMutable();
        com.google.v.c.addAll(iterable, this.cannedSearch_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndOfDriveProviderId(Iterable<String> iterable) {
        ensureEndOfDriveProviderIdIsMutable();
        com.google.v.c.addAll(iterable, this.endOfDriveProviderId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProduct(Iterable<? extends k> iterable) {
        ensureProductIsMutable();
        com.google.v.c.addAll(iterable, this.product_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvider(Iterable<? extends n> iterable) {
        ensureProviderIsMutable();
        com.google.v.c.addAll(iterable, this.provider_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBrand(String str) {
        Objects.requireNonNull(str);
        ensureBrandIsMutable();
        this.brand_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBrandBytes(v vVar) {
        ensureBrandIsMutable();
        this.brand_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCannedSearch(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureCannedSearchIsMutable();
        this.cannedSearch_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndOfDriveProviderId(String str) {
        Objects.requireNonNull(str);
        ensureEndOfDriveProviderIdIsMutable();
        this.endOfDriveProviderId_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndOfDriveProviderIdBytes(v vVar) {
        ensureEndOfDriveProviderIdIsMutable();
        this.endOfDriveProviderId_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProduct(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureProductIsMutable();
        this.product_.add(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvider(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureProviderIsMutable();
        this.provider_.add(i2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.brand_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCannedSearch() {
        this.cannedSearch_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndOfDriveProviderId() {
        this.endOfDriveProviderId_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasImage() {
        this.bitField0_ &= -2049;
        this.hasImage_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDistanceMeters() {
        this.bitField0_ &= -5;
        this.maxDistanceMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentCategoryId() {
        this.bitField0_ &= -1025;
        this.parentCategoryId_ = getDefaultInstance().getParentCategoryId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceFormat() {
        this.bitField0_ &= -65;
        this.priceFormat_ = getDefaultInstance().getPriceFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProduct() {
        this.product_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularName() {
        this.bitField0_ &= -129;
        this.regularName_ = getDefaultInstance().getRegularName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularUrlParams() {
        this.bitField0_ &= -9;
        this.regularUrlParams_ = getDefaultInstance().getRegularUrlParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteName() {
        this.bitField0_ &= -257;
        this.routeName_ = getDefaultInstance().getRouteName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUrlParams() {
        this.bitField0_ &= -17;
        this.routeUrlParams_ = getDefaultInstance().getRouteUrlParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateName() {
        this.bitField0_ &= -513;
        this.updateName_ = getDefaultInstance().getUpdateName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateUrlParams() {
        this.bitField0_ &= -33;
        this.updateUrlParams_ = getDefaultInstance().getUpdateUrlParams();
    }

    private void ensureBrandIsMutable() {
        eo<String> eoVar = this.brand_;
        if (eoVar.c()) {
            return;
        }
        this.brand_ = du.mutableCopy(eoVar);
    }

    private void ensureCannedSearchIsMutable() {
        eo<b> eoVar = this.cannedSearch_;
        if (eoVar.c()) {
            return;
        }
        this.cannedSearch_ = du.mutableCopy(eoVar);
    }

    private void ensureEndOfDriveProviderIdIsMutable() {
        eo<String> eoVar = this.endOfDriveProviderId_;
        if (eoVar.c()) {
            return;
        }
        this.endOfDriveProviderId_ = du.mutableCopy(eoVar);
    }

    private void ensureProductIsMutable() {
        eo<k> eoVar = this.product_;
        if (eoVar.c()) {
            return;
        }
        this.product_ = du.mutableCopy(eoVar);
    }

    private void ensureProviderIsMutable() {
        eo<n> eoVar = this.provider_;
        if (eoVar.c()) {
            return;
        }
        this.provider_ = du.mutableCopy(eoVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCannedSearch(int i2) {
        ensureCannedSearchIsMutable();
        this.cannedSearch_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProduct(int i2) {
        ensureProductIsMutable();
        this.product_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProvider(int i2) {
        ensureProviderIsMutable();
        this.provider_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(int i2, String str) {
        Objects.requireNonNull(str);
        ensureBrandIsMutable();
        this.brand_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCannedSearch(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureCannedSearchIsMutable();
        this.cannedSearch_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndOfDriveProviderId(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEndOfDriveProviderIdIsMutable();
        this.endOfDriveProviderId_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasImage(boolean z) {
        this.bitField0_ |= 2048;
        this.hasImage_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDistanceMeters(long j2) {
        this.bitField0_ |= 4;
        this.maxDistanceMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentCategoryId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.parentCategoryId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentCategoryIdBytes(v vVar) {
        this.parentCategoryId_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceFormat(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.priceFormat_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceFormatBytes(v vVar) {
        this.priceFormat_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(int i2, k kVar) {
        Objects.requireNonNull(kVar);
        ensureProductIsMutable();
        this.product_.set(i2, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureProviderIsMutable();
        this.provider_.set(i2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.regularName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularNameBytes(v vVar) {
        this.regularName_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularUrlParams(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.regularUrlParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularUrlParamsBytes(v vVar) {
        this.regularUrlParams_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.routeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteNameBytes(v vVar) {
        this.routeName_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUrlParams(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.routeUrlParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUrlParamsBytes(v vVar) {
        this.routeUrlParams_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.updateName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateNameBytes(v vVar) {
        this.updateName_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateUrlParams(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.updateUrlParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateUrlParamsBytes(v vVar) {
        this.updateUrlParams_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001ϸߢ\u0011\u0000\u0005\u0000ϸ\u001aߑဈ\u0000ߒဈ\u0001ߓ\u001bߕ\u001bߖဂ\u0002ߗဈ\u0003ߘဈ\u0004ߙဈ\u0005ߛဈ\u0006ߜ\u001aߝ\u001bߞဈ\u0007ߟဈ\bߠဈ\tߡဈ\nߢဇ\u000b", new Object[]{"bitField0_", "endOfDriveProviderId_", "id_", "name_", "provider_", n.class, "product_", k.class, "maxDistanceMeters_", "regularUrlParams_", "routeUrlParams_", "updateUrlParams_", "priceFormat_", "brand_", "cannedSearch_", b.class, "regularName_", "routeName_", "updateName_", "parentCategoryId_", "hasImage_"});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBrand(int i2) {
        return this.brand_.get(i2);
    }

    public v getBrandBytes(int i2) {
        return v.s(this.brand_.get(i2));
    }

    public int getBrandCount() {
        return this.brand_.size();
    }

    public List<String> getBrandList() {
        return this.brand_;
    }

    public b getCannedSearch(int i2) {
        return this.cannedSearch_.get(i2);
    }

    public int getCannedSearchCount() {
        return this.cannedSearch_.size();
    }

    public List<b> getCannedSearchList() {
        return this.cannedSearch_;
    }

    public c getCannedSearchOrBuilder(int i2) {
        return this.cannedSearch_.get(i2);
    }

    public List<? extends c> getCannedSearchOrBuilderList() {
        return this.cannedSearch_;
    }

    public String getEndOfDriveProviderId(int i2) {
        return this.endOfDriveProviderId_.get(i2);
    }

    public v getEndOfDriveProviderIdBytes(int i2) {
        return v.s(this.endOfDriveProviderId_.get(i2));
    }

    public int getEndOfDriveProviderIdCount() {
        return this.endOfDriveProviderId_.size();
    }

    public List<String> getEndOfDriveProviderIdList() {
        return this.endOfDriveProviderId_;
    }

    public boolean getHasImage() {
        return this.hasImage_;
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public long getMaxDistanceMeters() {
        return this.maxDistanceMeters_;
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public String getParentCategoryId() {
        return this.parentCategoryId_;
    }

    public v getParentCategoryIdBytes() {
        return v.s(this.parentCategoryId_);
    }

    public String getPriceFormat() {
        return this.priceFormat_;
    }

    public v getPriceFormatBytes() {
        return v.s(this.priceFormat_);
    }

    public k getProduct(int i2) {
        return this.product_.get(i2);
    }

    public int getProductCount() {
        return this.product_.size();
    }

    public List<k> getProductList() {
        return this.product_;
    }

    public l getProductOrBuilder(int i2) {
        return this.product_.get(i2);
    }

    public List<? extends l> getProductOrBuilderList() {
        return this.product_;
    }

    public n getProvider(int i2) {
        return this.provider_.get(i2);
    }

    public int getProviderCount() {
        return this.provider_.size();
    }

    public List<n> getProviderList() {
        return this.provider_;
    }

    public o getProviderOrBuilder(int i2) {
        return this.provider_.get(i2);
    }

    public List<? extends o> getProviderOrBuilderList() {
        return this.provider_;
    }

    public String getRegularName() {
        return this.regularName_;
    }

    public v getRegularNameBytes() {
        return v.s(this.regularName_);
    }

    public String getRegularUrlParams() {
        return this.regularUrlParams_;
    }

    public v getRegularUrlParamsBytes() {
        return v.s(this.regularUrlParams_);
    }

    public String getRouteName() {
        return this.routeName_;
    }

    public v getRouteNameBytes() {
        return v.s(this.routeName_);
    }

    public String getRouteUrlParams() {
        return this.routeUrlParams_;
    }

    public v getRouteUrlParamsBytes() {
        return v.s(this.routeUrlParams_);
    }

    public String getUpdateName() {
        return this.updateName_;
    }

    public v getUpdateNameBytes() {
        return v.s(this.updateName_);
    }

    public String getUpdateUrlParams() {
        return this.updateUrlParams_;
    }

    public v getUpdateUrlParamsBytes() {
        return v.s(this.updateUrlParams_);
    }

    public boolean hasHasImage() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMaxDistanceMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParentCategoryId() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasPriceFormat() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRegularName() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRegularUrlParams() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRouteName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRouteUrlParams() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUpdateName() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUpdateUrlParams() {
        return (this.bitField0_ & 32) != 0;
    }

    public static d newBuilder(e eVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCannedSearch(b bVar) {
        Objects.requireNonNull(bVar);
        ensureCannedSearchIsMutable();
        this.cannedSearch_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProduct(k kVar) {
        Objects.requireNonNull(kVar);
        ensureProductIsMutable();
        this.product_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvider(n nVar) {
        Objects.requireNonNull(nVar);
        ensureProviderIsMutable();
        this.provider_.add(nVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
