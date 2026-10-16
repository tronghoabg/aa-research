package i.b.n.a;

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
@Deprecated
/* loaded from: classes8.dex */
public final class az extends du<az, ay> implements fj {
    public static final int BRAND_NAMES_FIELD_NUMBER = 2;
    private static final az DEFAULT_INSTANCE;
    public static final int EV_CONNECTOR_TYPE_IDS_FIELD_NUMBER = 3;
    private static volatile fo<az> PARSER = null;
    public static final int PRODUCTS_FIELD_NUMBER = 1;
    private eo<String> products_ = emptyProtobufList();
    private eo<String> brandNames_ = emptyProtobufList();
    private eo<String> evConnectorTypeIds_ = emptyProtobufList();

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBrandNames(Iterable<String> iterable) {
        ensureBrandNamesIsMutable();
        com.google.v.c.addAll(iterable, this.brandNames_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvConnectorTypeIds(Iterable<String> iterable) {
        ensureEvConnectorTypeIdsIsMutable();
        com.google.v.c.addAll(iterable, this.evConnectorTypeIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducts(Iterable<String> iterable) {
        ensureProductsIsMutable();
        com.google.v.c.addAll(iterable, this.products_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBrandNames(String str) {
        Objects.requireNonNull(str);
        ensureBrandNamesIsMutable();
        this.brandNames_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBrandNamesBytes(com.google.v.v vVar) {
        ensureBrandNamesIsMutable();
        this.brandNames_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorTypeIds(String str) {
        Objects.requireNonNull(str);
        ensureEvConnectorTypeIdsIsMutable();
        this.evConnectorTypeIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvConnectorTypeIdsBytes(com.google.v.v vVar) {
        ensureEvConnectorTypeIdsIsMutable();
        this.evConnectorTypeIds_.add(vVar.u());
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
    public void clearBrandNames() {
        this.brandNames_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvConnectorTypeIds() {
        this.evConnectorTypeIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducts() {
        this.products_ = emptyProtobufList();
    }

    private void ensureBrandNamesIsMutable() {
        eo<String> eoVar = this.brandNames_;
        if (eoVar.c()) {
            return;
        }
        this.brandNames_ = du.mutableCopy(eoVar);
    }

    private void ensureEvConnectorTypeIdsIsMutable() {
        eo<String> eoVar = this.evConnectorTypeIds_;
        if (eoVar.c()) {
            return;
        }
        this.evConnectorTypeIds_ = du.mutableCopy(eoVar);
    }

    private void ensureProductsIsMutable() {
        eo<String> eoVar = this.products_;
        if (eoVar.c()) {
            return;
        }
        this.products_ = du.mutableCopy(eoVar);
    }

    public static az getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ay newBuilder() {
        return (ay) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<az> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandNames(int i2, String str) {
        Objects.requireNonNull(str);
        ensureBrandNamesIsMutable();
        this.brandNames_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvConnectorTypeIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureEvConnectorTypeIdsIsMutable();
        this.evConnectorTypeIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducts(int i2, String str) {
        Objects.requireNonNull(str);
        ensureProductsIsMutable();
        this.products_.set(i2, str);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u001a", new Object[]{"products_", "brandNames_", "evConnectorTypeIds_"});
        }
        if (iOrdinal == 3) {
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ay(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBrandNames(int i2) {
        return this.brandNames_.get(i2);
    }

    public com.google.v.v getBrandNamesBytes(int i2) {
        return com.google.v.v.s(this.brandNames_.get(i2));
    }

    public int getBrandNamesCount() {
        return this.brandNames_.size();
    }

    public List<String> getBrandNamesList() {
        return this.brandNames_;
    }

    public String getEvConnectorTypeIds(int i2) {
        return this.evConnectorTypeIds_.get(i2);
    }

    public com.google.v.v getEvConnectorTypeIdsBytes(int i2) {
        return com.google.v.v.s(this.evConnectorTypeIds_.get(i2));
    }

    public int getEvConnectorTypeIdsCount() {
        return this.evConnectorTypeIds_.size();
    }

    public List<String> getEvConnectorTypeIdsList() {
        return this.evConnectorTypeIds_;
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

    public static ay newBuilder(az azVar) {
        return (ay) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, de deVar) {
        return (az) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
