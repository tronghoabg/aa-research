package i.b.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import i.b.v.Cdo;
import i.b.v.bt;
import i.b.v.bu;
import i.b.v.dp;
import i.b.v.dz;
import i.b.v.ea;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class s extends du<s, r> implements fj {
    public static final int AUTOCOMPLETEURLPARAMS_FIELD_NUMBER = 1011;
    public static final int CATEGORY_FIELD_NUMBER = 1003;
    public static final int CATEGORY_GROUP_FIELD_NUMBER = 1016;
    public static final int CHECKSUM_FIELD_NUMBER = 1013;
    private static final s DEFAULT_INSTANCE;
    public static final int FIELD_POINT_FIELD_NUMBER = 1014;
    public static final int LOCALPROVIDER_FIELD_NUMBER = 1002;
    private static volatile fo<s> PARSER = null;
    public static final int REGULARNAME_FIELD_NUMBER = 1007;
    public static final int REGULARURLPARAMS_FIELD_NUMBER = 1004;
    public static final int ROUTENAME_FIELD_NUMBER = 1008;
    public static final int ROUTEURLPARAMS_FIELD_NUMBER = 1005;
    public static final int SERVICE_FIELD_NUMBER = 1012;
    public static final int SOURCE_FIELD_NUMBER = 1001;
    public static final int UPDATENAME_FIELD_NUMBER = 1009;
    public static final int VALIDATOR_FIELD_NUMBER = 1015;
    private int bitField0_;
    private String source_ = "";
    private String checksum_ = "";
    private eo<n> localProvider_ = emptyProtobufList();
    private eo<e> category_ = emptyProtobufList();
    private eo<g> categoryGroup_ = emptyProtobufList();
    private String regularUrlParams_ = "";
    private String routeUrlParams_ = "";
    private String regularName_ = "";
    private String routeName_ = "";
    private String updateName_ = "";
    private String autocompleteUrlParams_ = "";
    private eo<Cdo> service_ = emptyProtobufList();
    private eo<bt> fieldPoint_ = emptyProtobufList();
    private eo<dz> validator_ = emptyProtobufList();

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        du.registerDefaultInstance(s.class, sVar);
    }

    private s() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategory(Iterable<? extends e> iterable) {
        ensureCategoryIsMutable();
        com.google.v.c.addAll(iterable, this.category_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategoryGroup(Iterable<? extends g> iterable) {
        ensureCategoryGroupIsMutable();
        com.google.v.c.addAll(iterable, this.categoryGroup_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldPoint(Iterable<? extends bt> iterable) {
        ensureFieldPointIsMutable();
        com.google.v.c.addAll(iterable, this.fieldPoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLocalProvider(Iterable<? extends n> iterable) {
        ensureLocalProviderIsMutable();
        com.google.v.c.addAll(iterable, this.localProvider_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllService(Iterable<? extends Cdo> iterable) {
        ensureServiceIsMutable();
        com.google.v.c.addAll(iterable, this.service_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValidator(Iterable<? extends dz> iterable) {
        ensureValidatorIsMutable();
        com.google.v.c.addAll(iterable, this.validator_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategory(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureCategoryIsMutable();
        this.category_.add(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryGroup(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureCategoryGroupIsMutable();
        this.categoryGroup_.add(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPoint(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensureFieldPointIsMutable();
        this.fieldPoint_.add(i2, btVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocalProvider(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureLocalProviderIsMutable();
        this.localProvider_.add(i2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(int i2, Cdo cdo) {
        Objects.requireNonNull(cdo);
        ensureServiceIsMutable();
        this.service_.add(i2, cdo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValidator(int i2, dz dzVar) {
        Objects.requireNonNull(dzVar);
        ensureValidatorIsMutable();
        this.validator_.add(i2, dzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutocompleteUrlParams() {
        this.bitField0_ &= -129;
        this.autocompleteUrlParams_ = getDefaultInstance().getAutocompleteUrlParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryGroup() {
        this.categoryGroup_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChecksum() {
        this.bitField0_ &= -3;
        this.checksum_ = getDefaultInstance().getChecksum();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPoint() {
        this.fieldPoint_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalProvider() {
        this.localProvider_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularName() {
        this.bitField0_ &= -17;
        this.regularName_ = getDefaultInstance().getRegularName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularUrlParams() {
        this.bitField0_ &= -5;
        this.regularUrlParams_ = getDefaultInstance().getRegularUrlParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteName() {
        this.bitField0_ &= -33;
        this.routeName_ = getDefaultInstance().getRouteName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUrlParams() {
        this.bitField0_ &= -9;
        this.routeUrlParams_ = getDefaultInstance().getRouteUrlParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearService() {
        this.service_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.bitField0_ &= -2;
        this.source_ = getDefaultInstance().getSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateName() {
        this.bitField0_ &= -65;
        this.updateName_ = getDefaultInstance().getUpdateName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidator() {
        this.validator_ = emptyProtobufList();
    }

    private void ensureCategoryGroupIsMutable() {
        eo<g> eoVar = this.categoryGroup_;
        if (eoVar.c()) {
            return;
        }
        this.categoryGroup_ = du.mutableCopy(eoVar);
    }

    private void ensureCategoryIsMutable() {
        eo<e> eoVar = this.category_;
        if (eoVar.c()) {
            return;
        }
        this.category_ = du.mutableCopy(eoVar);
    }

    private void ensureFieldPointIsMutable() {
        eo<bt> eoVar = this.fieldPoint_;
        if (eoVar.c()) {
            return;
        }
        this.fieldPoint_ = du.mutableCopy(eoVar);
    }

    private void ensureLocalProviderIsMutable() {
        eo<n> eoVar = this.localProvider_;
        if (eoVar.c()) {
            return;
        }
        this.localProvider_ = du.mutableCopy(eoVar);
    }

    private void ensureServiceIsMutable() {
        eo<Cdo> eoVar = this.service_;
        if (eoVar.c()) {
            return;
        }
        this.service_ = du.mutableCopy(eoVar);
    }

    private void ensureValidatorIsMutable() {
        eo<dz> eoVar = this.validator_;
        if (eoVar.c()) {
            return;
        }
        this.validator_ = du.mutableCopy(eoVar);
    }

    public static s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static s parseDelimitedFrom(InputStream inputStream) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(v vVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<s> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCategory(int i2) {
        ensureCategoryIsMutable();
        this.category_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCategoryGroup(int i2) {
        ensureCategoryGroupIsMutable();
        this.categoryGroup_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldPoint(int i2) {
        ensureFieldPointIsMutable();
        this.fieldPoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocalProvider(int i2) {
        ensureLocalProviderIsMutable();
        this.localProvider_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeService(int i2) {
        ensureServiceIsMutable();
        this.service_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValidator(int i2) {
        ensureValidatorIsMutable();
        this.validator_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteUrlParams(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.autocompleteUrlParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutocompleteUrlParamsBytes(v vVar) {
        this.autocompleteUrlParams_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureCategoryIsMutable();
        this.category_.set(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryGroup(int i2, g gVar) {
        Objects.requireNonNull(gVar);
        ensureCategoryGroupIsMutable();
        this.categoryGroup_.set(i2, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChecksum(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.checksum_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChecksumBytes(v vVar) {
        this.checksum_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPoint(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensureFieldPointIsMutable();
        this.fieldPoint_.set(i2, btVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalProvider(int i2, n nVar) {
        Objects.requireNonNull(nVar);
        ensureLocalProviderIsMutable();
        this.localProvider_.set(i2, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.regularName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularNameBytes(v vVar) {
        this.regularName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularUrlParams(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.regularUrlParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularUrlParamsBytes(v vVar) {
        this.regularUrlParams_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.routeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteNameBytes(v vVar) {
        this.routeName_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUrlParams(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.routeUrlParams_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUrlParamsBytes(v vVar) {
        this.routeUrlParams_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setService(int i2, Cdo cdo) {
        Objects.requireNonNull(cdo);
        ensureServiceIsMutable();
        this.service_.set(i2, cdo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.source_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceBytes(v vVar) {
        this.source_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.updateName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateNameBytes(v vVar) {
        this.updateName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidator(int i2, dz dzVar) {
        Objects.requireNonNull(dzVar);
        ensureValidatorIsMutable();
        this.validator_.set(i2, dzVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001ϩϸ\u000e\u0000\u0006\u0000ϩဈ\u0000Ϫ\u001bϫ\u001bϬဈ\u0002ϭဈ\u0003ϯဈ\u0004ϰဈ\u0005ϱဈ\u0006ϳဈ\u0007ϴ\u001bϵဈ\u0001϶\u001bϷ\u001bϸ\u001b", new Object[]{"bitField0_", "source_", "localProvider_", n.class, "category_", e.class, "regularUrlParams_", "routeUrlParams_", "regularName_", "routeName_", "updateName_", "autocompleteUrlParams_", "service_", Cdo.class, "checksum_", "fieldPoint_", bt.class, "validator_", dz.class, "categoryGroup_", g.class});
        }
        if (iOrdinal == 3) {
            return new s();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<s> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (s.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAutocompleteUrlParams() {
        return this.autocompleteUrlParams_;
    }

    public v getAutocompleteUrlParamsBytes() {
        return v.s(this.autocompleteUrlParams_);
    }

    public e getCategory(int i2) {
        return this.category_.get(i2);
    }

    public int getCategoryCount() {
        return this.category_.size();
    }

    public g getCategoryGroup(int i2) {
        return this.categoryGroup_.get(i2);
    }

    public int getCategoryGroupCount() {
        return this.categoryGroup_.size();
    }

    public List<g> getCategoryGroupList() {
        return this.categoryGroup_;
    }

    public h getCategoryGroupOrBuilder(int i2) {
        return this.categoryGroup_.get(i2);
    }

    public List<? extends h> getCategoryGroupOrBuilderList() {
        return this.categoryGroup_;
    }

    public List<e> getCategoryList() {
        return this.category_;
    }

    public i getCategoryOrBuilder(int i2) {
        return this.category_.get(i2);
    }

    public List<? extends i> getCategoryOrBuilderList() {
        return this.category_;
    }

    public String getChecksum() {
        return this.checksum_;
    }

    public v getChecksumBytes() {
        return v.s(this.checksum_);
    }

    public bt getFieldPoint(int i2) {
        return this.fieldPoint_.get(i2);
    }

    public int getFieldPointCount() {
        return this.fieldPoint_.size();
    }

    public List<bt> getFieldPointList() {
        return this.fieldPoint_;
    }

    public bu getFieldPointOrBuilder(int i2) {
        return this.fieldPoint_.get(i2);
    }

    public List<? extends bu> getFieldPointOrBuilderList() {
        return this.fieldPoint_;
    }

    public n getLocalProvider(int i2) {
        return this.localProvider_.get(i2);
    }

    public int getLocalProviderCount() {
        return this.localProvider_.size();
    }

    public List<n> getLocalProviderList() {
        return this.localProvider_;
    }

    public o getLocalProviderOrBuilder(int i2) {
        return this.localProvider_.get(i2);
    }

    public List<? extends o> getLocalProviderOrBuilderList() {
        return this.localProvider_;
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

    public Cdo getService(int i2) {
        return this.service_.get(i2);
    }

    public int getServiceCount() {
        return this.service_.size();
    }

    public List<Cdo> getServiceList() {
        return this.service_;
    }

    public dp getServiceOrBuilder(int i2) {
        return this.service_.get(i2);
    }

    public List<? extends dp> getServiceOrBuilderList() {
        return this.service_;
    }

    public String getSource() {
        return this.source_;
    }

    public v getSourceBytes() {
        return v.s(this.source_);
    }

    public String getUpdateName() {
        return this.updateName_;
    }

    public v getUpdateNameBytes() {
        return v.s(this.updateName_);
    }

    public dz getValidator(int i2) {
        return this.validator_.get(i2);
    }

    public int getValidatorCount() {
        return this.validator_.size();
    }

    public List<dz> getValidatorList() {
        return this.validator_;
    }

    public ea getValidatorOrBuilder(int i2) {
        return this.validator_.get(i2);
    }

    public List<? extends ea> getValidatorOrBuilderList() {
        return this.validator_;
    }

    public boolean hasAutocompleteUrlParams() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasChecksum() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegularName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRegularUrlParams() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRouteName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRouteUrlParams() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUpdateName() {
        return (this.bitField0_ & 64) != 0;
    }

    public static r newBuilder(s sVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(sVar);
    }

    public static s parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (s) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(v vVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static s parseFrom(z zVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static s parseFrom(z zVar, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategory(e eVar) {
        Objects.requireNonNull(eVar);
        ensureCategoryIsMutable();
        this.category_.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryGroup(g gVar) {
        Objects.requireNonNull(gVar);
        ensureCategoryGroupIsMutable();
        this.categoryGroup_.add(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPoint(bt btVar) {
        Objects.requireNonNull(btVar);
        ensureFieldPointIsMutable();
        this.fieldPoint_.add(btVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocalProvider(n nVar) {
        Objects.requireNonNull(nVar);
        ensureLocalProviderIsMutable();
        this.localProvider_.add(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(Cdo cdo) {
        Objects.requireNonNull(cdo);
        ensureServiceIsMutable();
        this.service_.add(cdo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValidator(dz dzVar) {
        Objects.requireNonNull(dzVar);
        ensureValidatorIsMutable();
        this.validator_.add(dzVar);
    }

    public static s parseFrom(InputStream inputStream) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s parseFrom(InputStream inputStream, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static s parseFrom(ByteBuffer byteBuffer) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static s parseFrom(byte[] bArr) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s parseFrom(byte[] bArr, de deVar) {
        return (s) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
