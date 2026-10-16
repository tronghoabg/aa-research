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
public final class g extends du<g, f> implements h {
    public static final int CATEGORY_ID_FIELD_NUMBER = 3;
    private static final g DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile fo<g> PARSER = null;
    public static final int REGULAR_URL_PARAMS_FIELD_NUMBER = 4;
    public static final int ROUTE_URL_PARAMS_FIELD_NUMBER = 5;
    private int bitField0_;
    private String id_ = "";
    private String name_ = "";
    private eo<String> categoryId_ = emptyProtobufList();
    private String regularUrlParams_ = "";
    private String routeUrlParams_ = "";

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategoryId(Iterable<String> iterable) {
        ensureCategoryIdIsMutable();
        com.google.v.c.addAll(iterable, this.categoryId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryId(String str) {
        Objects.requireNonNull(str);
        ensureCategoryIdIsMutable();
        this.categoryId_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoryIdBytes(v vVar) {
        ensureCategoryIdIsMutable();
        this.categoryId_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryId() {
        this.categoryId_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularUrlParams() {
        this.bitField0_ &= -5;
        this.regularUrlParams_ = getDefaultInstance().getRegularUrlParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUrlParams() {
        this.bitField0_ &= -9;
        this.routeUrlParams_ = getDefaultInstance().getRouteUrlParams();
    }

    private void ensureCategoryIdIsMutable() {
        eo<String> eoVar = this.categoryId_;
        if (eoVar.c()) {
            return;
        }
        this.categoryId_ = du.mutableCopy(eoVar);
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(v vVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryId(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCategoryIdIsMutable();
        this.categoryId_.set(i2, str);
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "id_", "name_", "categoryId_", "regularUrlParams_", "routeUrlParams_"});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCategoryId(int i2) {
        return this.categoryId_.get(i2);
    }

    public v getCategoryIdBytes(int i2) {
        return v.s(this.categoryId_.get(i2));
    }

    public int getCategoryIdCount() {
        return this.categoryId_.size();
    }

    public List<String> getCategoryIdList() {
        return this.categoryId_;
    }

    public String getId() {
        return this.id_;
    }

    public v getIdBytes() {
        return v.s(this.id_);
    }

    public String getName() {
        return this.name_;
    }

    public v getNameBytes() {
        return v.s(this.name_);
    }

    public String getRegularUrlParams() {
        return this.regularUrlParams_;
    }

    public v getRegularUrlParamsBytes() {
        return v.s(this.regularUrlParams_);
    }

    public String getRouteUrlParams() {
        return this.routeUrlParams_;
    }

    public v getRouteUrlParamsBytes() {
        return v.s(this.routeUrlParams_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegularUrlParams() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRouteUrlParams() {
        return (this.bitField0_ & 8) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(v vVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(z zVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(z zVar, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, de deVar) {
        return (g) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
