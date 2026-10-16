package i.b.n;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class x extends du<x, v> implements fj {
    public static final int ALONG_ROUTE_FIELD_NUMBER = 7;
    public static final int BRAND_FIELD_NUMBER = 8;
    public static final int CATEGORY_FIELD_NUMBER = 6;
    public static final int CATEGORY_GROUP_FIELD_NUMBER = 13;
    private static final x DEFAULT_INSTANCE;
    public static final int EV_SEARCH_DATA_FIELD_NUMBER = 19;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INTENT_FIELD_NUMBER = 11;
    public static final int MAX_DISTANCE_METERS_FIELD_NUMBER = 12;
    public static final int MAX_RESULTS_FIELD_NUMBER = 4;
    private static volatile fo<x> PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 9;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RETURN_MATCH_INFO_FIELD_NUMBER = 14;
    public static final int SERVICES_FIELD_NUMBER = 16;
    public static final int TRACE_FORMAT_FIELD_NUMBER = 17;
    public static final int TRACE_LEVEL_FIELD_NUMBER = 18;
    public static final int URL_PARAMS_FIELD_NUMBER = 10;
    public static final int USER_INFO_FIELD_NUMBER = 3;
    public static final int VENUE_FILTER_ATTRIBUTES_FIELD_NUMBER = 15;
    private boolean alongRoute_;
    private int bitField0_;
    private j evSearchData_;
    private int intent_;
    private int maxDistanceMeters_;
    private int maxResults_;
    private boolean returnMatchInfo_;
    private int traceFormat_;
    private int traceLevel_;
    private ai userInfo_;
    private ag venueFilterAttributes_;
    private String id_ = "";
    private eo<String> provider_ = emptyProtobufList();
    private String query_ = "";
    private eo<String> category_ = emptyProtobufList();
    private String categoryGroup_ = "";
    private eo<String> services_ = emptyProtobufList();
    private String brand_ = "";
    private String product_ = "";
    private String urlParams_ = "";

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        du.registerDefaultInstance(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategory(Iterable<String> iterable) {
        ensureCategoryIsMutable();
        com.google.v.c.addAll(iterable, this.category_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvider(Iterable<String> iterable) {
        ensureProviderIsMutable();
        com.google.v.c.addAll(iterable, this.provider_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServices(Iterable<String> iterable) {
        ensureServicesIsMutable();
        com.google.v.c.addAll(iterable, this.services_);
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
    public void addProvider(String str) {
        Objects.requireNonNull(str);
        ensureProviderIsMutable();
        this.provider_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProviderBytes(com.google.v.v vVar) {
        ensureProviderIsMutable();
        this.provider_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServices(String str) {
        Objects.requireNonNull(str);
        ensureServicesIsMutable();
        this.services_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServicesBytes(com.google.v.v vVar) {
        ensureServicesIsMutable();
        this.services_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlongRoute() {
        this.bitField0_ &= -33;
        this.alongRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.bitField0_ &= -65;
        this.brand_ = getDefaultInstance().getBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryGroup() {
        this.bitField0_ &= -17;
        this.categoryGroup_ = getDefaultInstance().getCategoryGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvSearchData() {
        this.evSearchData_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntent() {
        this.bitField0_ &= -257;
        this.intent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDistanceMeters() {
        this.bitField0_ &= -1025;
        this.maxDistanceMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxResults() {
        this.bitField0_ &= -5;
        this.maxResults_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProduct() {
        this.bitField0_ &= -129;
        this.product_ = getDefaultInstance().getProduct();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.bitField0_ &= -9;
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnMatchInfo() {
        this.bitField0_ &= -2049;
        this.returnMatchInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServices() {
        this.services_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceFormat() {
        this.bitField0_ &= -8193;
        this.traceFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceLevel() {
        this.bitField0_ &= -16385;
        this.traceLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlParams() {
        this.bitField0_ &= -513;
        this.urlParams_ = getDefaultInstance().getUrlParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueFilterAttributes() {
        this.venueFilterAttributes_ = null;
        this.bitField0_ &= -4097;
    }

    private void ensureCategoryIsMutable() {
        eo<String> eoVar = this.category_;
        if (eoVar.c()) {
            return;
        }
        this.category_ = du.mutableCopy(eoVar);
    }

    private void ensureProviderIsMutable() {
        eo<String> eoVar = this.provider_;
        if (eoVar.c()) {
            return;
        }
        this.provider_ = du.mutableCopy(eoVar);
    }

    private void ensureServicesIsMutable() {
        eo<String> eoVar = this.services_;
        if (eoVar.c()) {
            return;
        }
        this.services_ = du.mutableCopy(eoVar);
    }

    public static x getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvSearchData(j jVar) {
        Objects.requireNonNull(jVar);
        j jVar2 = this.evSearchData_;
        if (jVar2 != null && jVar2 != j.getDefaultInstance()) {
            i iVarNewBuilder = j.newBuilder(jVar2);
            iVarNewBuilder.mergeFrom((i) jVar);
            jVar = iVarNewBuilder.buildPartial();
        }
        this.evSearchData_ = jVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(ai aiVar) {
        Objects.requireNonNull(aiVar);
        ai aiVar2 = this.userInfo_;
        if (aiVar2 != null && aiVar2 != ai.getDefaultInstance()) {
            ah ahVarNewBuilder = ai.newBuilder(aiVar2);
            ahVarNewBuilder.mergeFrom((ah) aiVar);
            aiVar = ahVarNewBuilder.buildPartial();
        }
        this.userInfo_ = aiVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueFilterAttributes(ag agVar) {
        Objects.requireNonNull(agVar);
        ag agVar2 = this.venueFilterAttributes_;
        if (agVar2 != null && agVar2 != ag.getDefaultInstance()) {
            af afVarNewBuilder = ag.newBuilder(agVar2);
            afVarNewBuilder.mergeFrom((af) agVar);
            agVar = afVarNewBuilder.buildPartial();
        }
        this.venueFilterAttributes_ = agVar;
        this.bitField0_ |= 4096;
    }

    public static v newBuilder() {
        return (v) DEFAULT_INSTANCE.createBuilder();
    }

    public static x parseDelimitedFrom(InputStream inputStream) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(com.google.v.v vVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<x> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlongRoute(boolean z) {
        this.bitField0_ |= 32;
        this.alongRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.brand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBytes(com.google.v.v vVar) {
        this.brand_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCategoryIsMutable();
        this.category_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryGroup(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.categoryGroup_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryGroupBytes(com.google.v.v vVar) {
        this.categoryGroup_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvSearchData(j jVar) {
        Objects.requireNonNull(jVar);
        this.evSearchData_ = jVar;
        this.bitField0_ |= 32768;
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
    public void setIntent(w wVar) {
        this.intent_ = wVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDistanceMeters(int i2) {
        this.bitField0_ |= 1024;
        this.maxDistanceMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxResults(int i2) {
        this.bitField0_ |= 4;
        this.maxResults_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.product_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductBytes(com.google.v.v vVar) {
        this.product_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(int i2, String str) {
        Objects.requireNonNull(str);
        ensureProviderIsMutable();
        this.provider_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.query_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(com.google.v.v vVar) {
        this.query_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnMatchInfo(boolean z) {
        this.bitField0_ |= 2048;
        this.returnMatchInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServices(int i2, String str) {
        Objects.requireNonNull(str);
        ensureServicesIsMutable();
        this.services_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceFormat(n nVar) {
        this.traceFormat_ = nVar.getNumber();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceLevel(int i2) {
        this.bitField0_ |= 16384;
        this.traceLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlParams(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.urlParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlParamsBytes(com.google.v.v vVar) {
        this.urlParams_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.userInfo_ = aiVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueFilterAttributes(ag agVar) {
        Objects.requireNonNull(agVar);
        this.venueFilterAttributes_ = agVar;
        this.bitField0_ |= 4096;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0001\u0004င\u0002\u0005ဈ\u0003\u0006\u001a\u0007ဇ\u0005\bဈ\u0006\tဈ\u0007\nဈ\t\u000b᠌\b\fင\n\rဈ\u0004\u000eဇ\u000b\u000fဉ\f\u0010\u001a\u0011᠌\r\u0012င\u000e\u0013ဉ\u000f", new Object[]{"bitField0_", "id_", "provider_", "userInfo_", "maxResults_", "query_", "category_", "alongRoute_", "brand_", "product_", "urlParams_", "intent_", m.f49154c, "maxDistanceMeters_", "categoryGroup_", "returnMatchInfo_", "venueFilterAttributes_", "services_", "traceFormat_", m.f49152a, "traceLevel_", "evSearchData_"});
        }
        if (iOrdinal == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new v(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<x> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (x.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAlongRoute() {
        return this.alongRoute_;
    }

    public String getBrand() {
        return this.brand_;
    }

    public com.google.v.v getBrandBytes() {
        return com.google.v.v.s(this.brand_);
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

    public String getCategoryGroup() {
        return this.categoryGroup_;
    }

    public com.google.v.v getCategoryGroupBytes() {
        return com.google.v.v.s(this.categoryGroup_);
    }

    public List<String> getCategoryList() {
        return this.category_;
    }

    public j getEvSearchData() {
        j jVar = this.evSearchData_;
        return jVar == null ? j.getDefaultInstance() : jVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public w getIntent() {
        w wVarA = w.a(this.intent_);
        return wVarA == null ? w.UNKNOWN : wVarA;
    }

    public int getMaxDistanceMeters() {
        return this.maxDistanceMeters_;
    }

    public int getMaxResults() {
        return this.maxResults_;
    }

    public String getProduct() {
        return this.product_;
    }

    public com.google.v.v getProductBytes() {
        return com.google.v.v.s(this.product_);
    }

    public String getProvider(int i2) {
        return this.provider_.get(i2);
    }

    public com.google.v.v getProviderBytes(int i2) {
        return com.google.v.v.s(this.provider_.get(i2));
    }

    public int getProviderCount() {
        return this.provider_.size();
    }

    public List<String> getProviderList() {
        return this.provider_;
    }

    public String getQuery() {
        return this.query_;
    }

    public com.google.v.v getQueryBytes() {
        return com.google.v.v.s(this.query_);
    }

    public boolean getReturnMatchInfo() {
        return this.returnMatchInfo_;
    }

    public String getServices(int i2) {
        return this.services_.get(i2);
    }

    public com.google.v.v getServicesBytes(int i2) {
        return com.google.v.v.s(this.services_.get(i2));
    }

    public int getServicesCount() {
        return this.services_.size();
    }

    public List<String> getServicesList() {
        return this.services_;
    }

    public n getTraceFormat() {
        n nVarA = n.a(this.traceFormat_);
        return nVarA == null ? n.DISABLED : nVarA;
    }

    public int getTraceLevel() {
        return this.traceLevel_;
    }

    public String getUrlParams() {
        return this.urlParams_;
    }

    public com.google.v.v getUrlParamsBytes() {
        return com.google.v.v.s(this.urlParams_);
    }

    public ai getUserInfo() {
        ai aiVar = this.userInfo_;
        return aiVar == null ? ai.getDefaultInstance() : aiVar;
    }

    public ag getVenueFilterAttributes() {
        ag agVar = this.venueFilterAttributes_;
        return agVar == null ? ag.getDefaultInstance() : agVar;
    }

    public boolean hasAlongRoute() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBrand() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCategoryGroup() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEvSearchData() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIntent() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMaxDistanceMeters() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasMaxResults() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProduct() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasQuery() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasReturnMatchInfo() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasTraceFormat() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasTraceLevel() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasUrlParams() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUserInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVenueFilterAttributes() {
        return (this.bitField0_ & 4096) != 0;
    }

    public static v newBuilder(x xVar) {
        return (v) DEFAULT_INSTANCE.createBuilder(xVar);
    }

    public static x parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (x) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(com.google.v.v vVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static x parseFrom(com.google.v.z zVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static x parseFrom(com.google.v.z zVar, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static x parseFrom(InputStream inputStream) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static x parseFrom(InputStream inputStream, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static x parseFrom(ByteBuffer byteBuffer) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static x parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static x parseFrom(byte[] bArr) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static x parseFrom(byte[] bArr, de deVar) {
        return (x) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
