package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azq extends com.google.v.du<azq, azp> implements com.google.v.fj {
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 5;
    public static final int CATEGORICAL_SEARCH_NAME_FIELD_NUMBER = 4;
    private static final azq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<azq> PARSER = null;
    public static final int SEARCH_ID_FIELD_NUMBER = 6;
    public static final int SEARCH_TYPE_FIELD_NUMBER = 1;
    public static final int SORT_FIELD_FIELD_NUMBER = 3;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private int categoricalGroupSearchName_;
    private String categoricalSearchName_ = "";
    private String searchId_ = "";
    private int searchType_;
    private int sortField_;
    private int source_;

    static {
        azq azqVar = new azq();
        DEFAULT_INSTANCE = azqVar;
        com.google.v.du.registerDefaultInstance(azq.class, azqVar);
    }

    private azq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoricalGroupSearchName() {
        this.categoricalGroupSearchName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoricalSearchName() {
        this.categoricalSearchName_ = getDefaultInstance().getCategoricalSearchName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchType() {
        this.searchType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortField() {
        this.sortField_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static azq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static azp newBuilder() {
        return (azp) DEFAULT_INSTANCE.createBuilder();
    }

    public static azq parseDelimitedFrom(InputStream inputStream) {
        return (azq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azq parseFrom(com.google.v.v vVar) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<azq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchName(ayn aynVar) {
        this.categoricalGroupSearchName_ = aynVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchNameValue(int i2) {
        this.categoricalGroupSearchName_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalSearchName(String str) {
        Objects.requireNonNull(str);
        this.categoricalSearchName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalSearchNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.categoricalSearchName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchId(String str) {
        Objects.requireNonNull(str);
        this.searchId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.searchId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchType(azy azyVar) {
        this.searchType_ = azyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchTypeValue(int i2) {
        this.searchType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortField(azr azrVar) {
        this.sortField_ = azrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortFieldValue(int i2) {
        this.sortField_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(azs azsVar) {
        this.source_ = azsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004Ȉ\u0005\f\u0006Ȉ", new Object[]{"searchType_", "source_", "sortField_", "categoricalSearchName_", "categoricalGroupSearchName_", "searchId_"});
        }
        if (iOrdinal == 3) {
            return new azq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new azp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<azq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (azq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ayn getCategoricalGroupSearchName() {
        ayn aynVarA = ayn.a(this.categoricalGroupSearchName_);
        return aynVarA == null ? ayn.UNRECOGNIZED : aynVarA;
    }

    public int getCategoricalGroupSearchNameValue() {
        return this.categoricalGroupSearchName_;
    }

    public String getCategoricalSearchName() {
        return this.categoricalSearchName_;
    }

    public com.google.v.v getCategoricalSearchNameBytes() {
        return com.google.v.v.s(this.categoricalSearchName_);
    }

    public String getSearchId() {
        return this.searchId_;
    }

    public com.google.v.v getSearchIdBytes() {
        return com.google.v.v.s(this.searchId_);
    }

    public azy getSearchType() {
        azy azyVarA = azy.a(this.searchType_);
        return azyVarA == null ? azy.UNRECOGNIZED : azyVarA;
    }

    public int getSearchTypeValue() {
        return this.searchType_;
    }

    public azr getSortField() {
        azr azrVarA = azr.a(this.sortField_);
        return azrVarA == null ? azr.UNRECOGNIZED : azrVarA;
    }

    public int getSortFieldValue() {
        return this.sortField_;
    }

    public azs getSource() {
        azs azsVarA = azs.a(this.source_);
        return azsVarA == null ? azs.UNRECOGNIZED : azsVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public static azp newBuilder(azq azqVar) {
        return (azp) DEFAULT_INSTANCE.createBuilder(azqVar);
    }

    public static azq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static azq parseFrom(com.google.v.z zVar) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static azq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static azq parseFrom(InputStream inputStream) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azq parseFrom(ByteBuffer byteBuffer) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static azq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static azq parseFrom(byte[] bArr) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static azq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (azq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
