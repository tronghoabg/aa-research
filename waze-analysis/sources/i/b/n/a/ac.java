package i.b.n.a;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ac extends du<ac, o> implements ad {
    public static final int ADVERTISER_BRAND_FILTER_FIELD_NUMBER = 4;
    public static final int BRAND_FILTER_FIELD_NUMBER = 10;
    public static final int CATEGORY_FILTER_FIELD_NUMBER = 3;
    public static final int CATEGORY_GROUP_ID_FIELD_NUMBER = 2;
    private static final ac DEFAULT_INSTANCE;
    public static final int EVCS_NETWORK_FILTER_FIELD_NUMBER = 6;
    public static final int EV_CONNECTOR_TYPE_FILTER_FIELD_NUMBER = 7;
    public static final int MIN_CHARGE_POWER_KW_FILTER_FIELD_NUMBER = 8;
    public static final int MIN_RATING_FILTER_FIELD_NUMBER = 13;
    public static final int OPEN_NOW_FILTER_FIELD_NUMBER = 12;
    private static volatile fo<ac> PARSER = null;
    public static final int PRICE_LEVEL_FILTER_FIELD_NUMBER = 9;
    public static final int PRODUCT_FILTER_FIELD_NUMBER = 11;
    public static final int PUBLIC_EVCS_FILTER_FIELD_NUMBER = 14;
    public static final int QUERY_FIELD_NUMBER = 1;
    public static final int SERVICE_FILTER_FIELD_NUMBER = 5;
    private int filterCase_ = 0;
    private Object filter_;

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvertiserBrandFilter() {
        if (this.filterCase_ == 4) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandFilter() {
        if (this.filterCase_ == 10) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryFilter() {
        if (this.filterCase_ == 3) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryGroupId() {
        if (this.filterCase_ == 2) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnectorTypeFilter() {
        if (this.filterCase_ == 7) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvcsNetworkFilter() {
        if (this.filterCase_ == 6) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilter() {
        this.filterCase_ = 0;
        this.filter_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinChargePowerKwFilter() {
        if (this.filterCase_ == 8) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinRatingFilter() {
        if (this.filterCase_ == 13) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenNowFilter() {
        if (this.filterCase_ == 12) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceLevelFilter() {
        if (this.filterCase_ == 9) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductFilter() {
        if (this.filterCase_ == 11) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicEvcsFilter() {
        if (this.filterCase_ == 14) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.filterCase_ == 1) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceFilter() {
        if (this.filterCase_ == 5) {
            this.filterCase_ = 0;
            this.filter_ = null;
        }
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvertiserBrandFilter(l lVar) {
        Objects.requireNonNull(lVar);
        if (this.filterCase_ == 4 && this.filter_ != l.getDefaultInstance()) {
            k kVarNewBuilder = l.newBuilder((l) this.filter_);
            kVarNewBuilder.mergeFrom((k) lVar);
            lVar = kVarNewBuilder.buildPartial();
        }
        this.filter_ = lVar;
        this.filterCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBrandFilter(n nVar) {
        Objects.requireNonNull(nVar);
        if (this.filterCase_ == 10 && this.filter_ != n.getDefaultInstance()) {
            m mVarNewBuilder = n.newBuilder((n) this.filter_);
            mVarNewBuilder.mergeFrom((m) nVar);
            nVar = mVarNewBuilder.buildPartial();
        }
        this.filter_ = nVar;
        this.filterCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCategoryFilter(q qVar) {
        Objects.requireNonNull(qVar);
        if (this.filterCase_ == 3 && this.filter_ != q.getDefaultInstance()) {
            p pVarNewBuilder = q.newBuilder((q) this.filter_);
            pVarNewBuilder.mergeFrom((p) qVar);
            qVar = pVarNewBuilder.buildPartial();
        }
        this.filter_ = qVar;
        this.filterCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvConnectorTypeFilter(s sVar) {
        Objects.requireNonNull(sVar);
        if (this.filterCase_ == 7 && this.filter_ != s.getDefaultInstance()) {
            r rVarNewBuilder = s.newBuilder((s) this.filter_);
            rVarNewBuilder.mergeFrom((r) sVar);
            sVar = rVarNewBuilder.buildPartial();
        }
        this.filter_ = sVar;
        this.filterCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvcsNetworkFilter(u uVar) {
        Objects.requireNonNull(uVar);
        if (this.filterCase_ == 6 && this.filter_ != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder((u) this.filter_);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.filter_ = uVar;
        this.filterCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriceLevelFilter(x xVar) {
        Objects.requireNonNull(xVar);
        if (this.filterCase_ == 9 && this.filter_ != x.getDefaultInstance()) {
            w wVarNewBuilder = x.newBuilder((x) this.filter_);
            wVarNewBuilder.mergeFrom((w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.filter_ = xVar;
        this.filterCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProductFilter(z zVar) {
        Objects.requireNonNull(zVar);
        if (this.filterCase_ == 11 && this.filter_ != z.getDefaultInstance()) {
            y yVarNewBuilder = z.newBuilder((z) this.filter_);
            yVarNewBuilder.mergeFrom((y) zVar);
            zVar = yVarNewBuilder.buildPartial();
        }
        this.filter_ = zVar;
        this.filterCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServiceFilter(ab abVar) {
        Objects.requireNonNull(abVar);
        if (this.filterCase_ == 5 && this.filter_ != ab.getDefaultInstance()) {
            aa aaVarNewBuilder = ab.newBuilder((ab) this.filter_);
            aaVarNewBuilder.mergeFrom((aa) abVar);
            abVar = aaVarNewBuilder.buildPartial();
        }
        this.filter_ = abVar;
        this.filterCase_ = 5;
    }

    public static o newBuilder() {
        return (o) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertiserBrandFilter(l lVar) {
        Objects.requireNonNull(lVar);
        this.filter_ = lVar;
        this.filterCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandFilter(n nVar) {
        Objects.requireNonNull(nVar);
        this.filter_ = nVar;
        this.filterCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryFilter(q qVar) {
        Objects.requireNonNull(qVar);
        this.filter_ = qVar;
        this.filterCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryGroupId(String str) {
        Objects.requireNonNull(str);
        this.filterCase_ = 2;
        this.filter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryGroupIdBytes(com.google.v.v vVar) {
        this.filter_ = vVar.u();
        this.filterCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnectorTypeFilter(s sVar) {
        Objects.requireNonNull(sVar);
        this.filter_ = sVar;
        this.filterCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvcsNetworkFilter(u uVar) {
        Objects.requireNonNull(uVar);
        this.filter_ = uVar;
        this.filterCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinChargePowerKwFilter(float f2) {
        this.filterCase_ = 8;
        this.filter_ = Float.valueOf(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinRatingFilter(double d2) {
        this.filterCase_ = 13;
        this.filter_ = Double.valueOf(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenNowFilter(boolean z) {
        this.filterCase_ = 12;
        this.filter_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceLevelFilter(x xVar) {
        Objects.requireNonNull(xVar);
        this.filter_ = xVar;
        this.filterCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductFilter(z zVar) {
        Objects.requireNonNull(zVar);
        this.filter_ = zVar;
        this.filterCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicEvcsFilter(boolean z) {
        this.filterCase_ = 14;
        this.filter_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        Objects.requireNonNull(str);
        this.filterCase_ = 1;
        this.filter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(com.google.v.v vVar) {
        this.filter_ = vVar.u();
        this.filterCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceFilter(ab abVar) {
        Objects.requireNonNull(abVar);
        this.filter_ = abVar;
        this.filterCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b4\u0000\t<\u0000\n<\u0000\u000b<\u0000\f:\u0000\r3\u0000\u000e:\u0000", new Object[]{"filter_", "filterCase_", q.class, l.class, ab.class, u.class, s.class, x.class, n.class, z.class});
        }
        if (iOrdinal == 3) {
            return new ac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new o(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public l getAdvertiserBrandFilter() {
        return this.filterCase_ == 4 ? (l) this.filter_ : l.getDefaultInstance();
    }

    public n getBrandFilter() {
        return this.filterCase_ == 10 ? (n) this.filter_ : n.getDefaultInstance();
    }

    public q getCategoryFilter() {
        return this.filterCase_ == 3 ? (q) this.filter_ : q.getDefaultInstance();
    }

    public String getCategoryGroupId() {
        return this.filterCase_ == 2 ? (String) this.filter_ : "";
    }

    public com.google.v.v getCategoryGroupIdBytes() {
        return com.google.v.v.s(this.filterCase_ == 2 ? (String) this.filter_ : "");
    }

    public s getEvConnectorTypeFilter() {
        return this.filterCase_ == 7 ? (s) this.filter_ : s.getDefaultInstance();
    }

    public u getEvcsNetworkFilter() {
        return this.filterCase_ == 6 ? (u) this.filter_ : u.getDefaultInstance();
    }

    public v getFilterCase() {
        switch (this.filterCase_) {
            case 0:
                return v.o;
            case 1:
                return v.f49135a;
            case 2:
                return v.f49136b;
            case 3:
                return v.f49137c;
            case 4:
                return v.f49138d;
            case 5:
                return v.f49139e;
            case 6:
                return v.f49140f;
            case 7:
                return v.f49141g;
            case 8:
                return v.f49142h;
            case 9:
                return v.f49144j;
            case 10:
                return v.f49145k;
            case 11:
                return v.f49146l;
            case 12:
                return v.m;
            case 13:
                return v.n;
            case 14:
                return v.f49143i;
            default:
                return null;
        }
    }

    public float getMinChargePowerKwFilter() {
        if (this.filterCase_ == 8) {
            return ((Float) this.filter_).floatValue();
        }
        return 0.0f;
    }

    public double getMinRatingFilter() {
        return this.filterCase_ == 13 ? ((Double) this.filter_).doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public boolean getOpenNowFilter() {
        if (this.filterCase_ == 12) {
            return ((Boolean) this.filter_).booleanValue();
        }
        return false;
    }

    public x getPriceLevelFilter() {
        return this.filterCase_ == 9 ? (x) this.filter_ : x.getDefaultInstance();
    }

    public z getProductFilter() {
        return this.filterCase_ == 11 ? (z) this.filter_ : z.getDefaultInstance();
    }

    public boolean getPublicEvcsFilter() {
        if (this.filterCase_ == 14) {
            return ((Boolean) this.filter_).booleanValue();
        }
        return false;
    }

    public String getQuery() {
        return this.filterCase_ == 1 ? (String) this.filter_ : "";
    }

    public com.google.v.v getQueryBytes() {
        return com.google.v.v.s(this.filterCase_ == 1 ? (String) this.filter_ : "");
    }

    public ab getServiceFilter() {
        return this.filterCase_ == 5 ? (ab) this.filter_ : ab.getDefaultInstance();
    }

    @Deprecated
    public boolean hasAdvertiserBrandFilter() {
        return this.filterCase_ == 4;
    }

    public boolean hasBrandFilter() {
        return this.filterCase_ == 10;
    }

    public boolean hasCategoryFilter() {
        return this.filterCase_ == 3;
    }

    public boolean hasCategoryGroupId() {
        return this.filterCase_ == 2;
    }

    public boolean hasEvConnectorTypeFilter() {
        return this.filterCase_ == 7;
    }

    public boolean hasEvcsNetworkFilter() {
        return this.filterCase_ == 6;
    }

    public boolean hasMinChargePowerKwFilter() {
        return this.filterCase_ == 8;
    }

    public boolean hasMinRatingFilter() {
        return this.filterCase_ == 13;
    }

    public boolean hasOpenNowFilter() {
        return this.filterCase_ == 12;
    }

    public boolean hasPriceLevelFilter() {
        return this.filterCase_ == 9;
    }

    public boolean hasProductFilter() {
        return this.filterCase_ == 11;
    }

    public boolean hasPublicEvcsFilter() {
        return this.filterCase_ == 14;
    }

    public boolean hasQuery() {
        return this.filterCase_ == 1;
    }

    public boolean hasServiceFilter() {
        return this.filterCase_ == 5;
    }

    public static o newBuilder(ac acVar) {
        return (o) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
