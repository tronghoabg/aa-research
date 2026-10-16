package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class af extends com.google.v.du<af, ae> implements com.google.v.fj {
    public static final int AD_INFORMATION_FIELD_NUMBER = 1;
    public static final int AD_PLACEMENT_ID_FIELD_NUMBER = 4;
    public static final int CATEGORY_FIELD_NUMBER = 2;
    private static final af DEFAULT_INSTANCE;
    public static final int DESTINATION_TYPE_FIELD_NUMBER = 8;
    public static final int DISPLAY_GROUP_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<af> PARSER = null;
    public static final int SEARCH_QUERY_FIELD_NUMBER = 5;
    public static final int SPONSORED_FIELD_NUMBER = 6;
    public static final int USER_LOCATION_INFORMATION_FIELD_NUMBER = 7;
    private w adInformation_;
    private long adPlacementId_;
    private int bitField0_;
    private int destinationType_;
    private boolean sponsored_;
    private bov userLocationInformation_;
    private String category_ = "";
    private String displayGroup_ = "";
    private String searchQuery_ = "";

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        com.google.v.du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdInformation() {
        this.adInformation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdPlacementId() {
        this.bitField0_ &= -3;
        this.adPlacementId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = getDefaultInstance().getCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationType() {
        this.destinationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayGroup() {
        this.displayGroup_ = getDefaultInstance().getDisplayGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchQuery() {
        this.searchQuery_ = getDefaultInstance().getSearchQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSponsored() {
        this.bitField0_ &= -5;
        this.sponsored_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserLocationInformation() {
        this.userLocationInformation_ = null;
        this.bitField0_ &= -9;
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdInformation(w wVar) {
        Objects.requireNonNull(wVar);
        w wVar2 = this.adInformation_;
        if (wVar2 != null && wVar2 != w.getDefaultInstance()) {
            v vVarNewBuilder = w.newBuilder(wVar2);
            vVarNewBuilder.mergeFrom((v) wVar);
            wVar = vVarNewBuilder.buildPartial();
        }
        this.adInformation_ = wVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserLocationInformation(bov bovVar) {
        Objects.requireNonNull(bovVar);
        bov bovVar2 = this.userLocationInformation_;
        if (bovVar2 != null && bovVar2 != bov.getDefaultInstance()) {
            bou bouVarNewBuilder = bov.newBuilder(bovVar2);
            bouVarNewBuilder.mergeFrom((bou) bovVar);
            bovVar = bouVarNewBuilder.buildPartial();
        }
        this.userLocationInformation_ = bovVar;
        this.bitField0_ |= 8;
    }

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdInformation(w wVar) {
        Objects.requireNonNull(wVar);
        this.adInformation_ = wVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdPlacementId(long j2) {
        this.bitField0_ |= 2;
        this.adPlacementId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(String str) {
        Objects.requireNonNull(str);
        this.category_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.category_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationType(rm rmVar) {
        this.destinationType_ = rmVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationTypeValue(int i2) {
        this.destinationType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayGroup(String str) {
        Objects.requireNonNull(str);
        this.displayGroup_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayGroupBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.displayGroup_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchQuery(String str) {
        Objects.requireNonNull(str);
        this.searchQuery_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchQueryBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.searchQuery_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSponsored(boolean z) {
        this.bitField0_ |= 4;
        this.sponsored_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserLocationInformation(bov bovVar) {
        Objects.requireNonNull(bovVar);
        this.userLocationInformation_ = bovVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဂ\u0001\u0005Ȉ\u0006ဇ\u0002\u0007ဉ\u0003\b\f", new Object[]{"bitField0_", "adInformation_", "category_", "displayGroup_", "adPlacementId_", "searchQuery_", "sponsored_", "userLocationInformation_", "destinationType_"});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<af> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (af.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public w getAdInformation() {
        w wVar = this.adInformation_;
        return wVar == null ? w.getDefaultInstance() : wVar;
    }

    public long getAdPlacementId() {
        return this.adPlacementId_;
    }

    public String getCategory() {
        return this.category_;
    }

    public com.google.v.v getCategoryBytes() {
        return com.google.v.v.s(this.category_);
    }

    public rm getDestinationType() {
        rm rmVarA = rm.a(this.destinationType_);
        return rmVarA == null ? rm.UNRECOGNIZED : rmVarA;
    }

    public int getDestinationTypeValue() {
        return this.destinationType_;
    }

    public String getDisplayGroup() {
        return this.displayGroup_;
    }

    public com.google.v.v getDisplayGroupBytes() {
        return com.google.v.v.s(this.displayGroup_);
    }

    public String getSearchQuery() {
        return this.searchQuery_;
    }

    public com.google.v.v getSearchQueryBytes() {
        return com.google.v.v.s(this.searchQuery_);
    }

    public boolean getSponsored() {
        return this.sponsored_;
    }

    public bov getUserLocationInformation() {
        bov bovVar = this.userLocationInformation_;
        return bovVar == null ? bov.getDefaultInstance() : bovVar;
    }

    public boolean hasAdInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAdPlacementId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSponsored() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserLocationInformation() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (af) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
