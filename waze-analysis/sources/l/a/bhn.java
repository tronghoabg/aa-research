package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bhn extends com.google.v.du<bhn, bhm> implements com.google.v.fj {
    public static final int CATEGORIES_FIELD_NUMBER = 1;
    private static final bhn DEFAULT_INSTANCE;
    public static final int LOCATION_COORDINATES_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bhn> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private afx locationCoordinates_;
    private com.google.v.eo<String> categories_ = emptyProtobufList();
    private String venueId_ = "";

    static {
        bhn bhnVar = new bhn();
        DEFAULT_INSTANCE = bhnVar;
        com.google.v.du.registerDefaultInstance(bhn.class, bhnVar);
    }

    private bhn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategories(Iterable<String> iterable) {
        ensureCategoriesIsMutable();
        com.google.v.c.addAll(iterable, this.categories_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategories(String str) {
        Objects.requireNonNull(str);
        ensureCategoriesIsMutable();
        this.categories_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoriesBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureCategoriesIsMutable();
        this.categories_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategories() {
        this.categories_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationCoordinates() {
        this.locationCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    private void ensureCategoriesIsMutable() {
        com.google.v.eo<String> eoVar = this.categories_;
        if (eoVar.c()) {
            return;
        }
        this.categories_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bhn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.locationCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.locationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    public static bhm newBuilder() {
        return (bhm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bhn parseDelimitedFrom(InputStream inputStream) {
        return (bhn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhn parseFrom(com.google.v.v vVar) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bhn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategories(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCategoriesIsMutable();
        this.categories_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.locationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "categories_", "venueId_", "locationCoordinates_"});
        }
        if (iOrdinal == 3) {
            return new bhn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bhm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bhn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bhn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCategories(int i2) {
        return this.categories_.get(i2);
    }

    public com.google.v.v getCategoriesBytes(int i2) {
        return com.google.v.v.s(this.categories_.get(i2));
    }

    public int getCategoriesCount() {
        return this.categories_.size();
    }

    public List<String> getCategoriesList() {
        return this.categories_;
    }

    public afx getLocationCoordinates() {
        afx afxVar = this.locationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasLocationCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bhm newBuilder(bhn bhnVar) {
        return (bhm) DEFAULT_INSTANCE.createBuilder(bhnVar);
    }

    public static bhn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bhn parseFrom(com.google.v.z zVar) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bhn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bhn parseFrom(InputStream inputStream) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bhn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bhn parseFrom(ByteBuffer byteBuffer) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bhn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bhn parseFrom(byte[] bArr) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bhn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bhn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
