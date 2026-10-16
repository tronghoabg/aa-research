package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayt extends com.google.v.du<ayt, ays> implements com.google.v.fj {
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 5;
    public static final int CATEGORICAL_SEARCH_NAME_FIELD_NUMBER = 4;
    private static final ayt DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ayt> PARSER = null;
    public static final int SEARCH_ID_FIELD_NUMBER = 6;
    public static final int SEARCH_TYPE_FIELD_NUMBER = 1;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private int categoricalGroupSearchName_;
    private int filterField_;
    private int searchType_;
    private int source_;
    private String categoricalSearchName_ = "";
    private String searchId_ = "";

    static {
        ayt aytVar = new ayt();
        DEFAULT_INSTANCE = aytVar;
        com.google.v.du.registerDefaultInstance(ayt.class, aytVar);
    }

    private ayt() {
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
    public void clearFilterField() {
        this.filterField_ = 0;
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
    public void clearSource() {
        this.source_ = 0;
    }

    public static ayt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ays newBuilder() {
        return (ays) DEFAULT_INSTANCE.createBuilder();
    }

    public static ayt parseDelimitedFrom(InputStream inputStream) {
        return (ayt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayt parseFrom(com.google.v.v vVar) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ayt> parser() {
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
    public void setFilterField(ayu ayuVar) {
        this.filterField_ = ayuVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterFieldValue(int i2) {
        this.filterField_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004Ȉ\u0005\f\u0006Ȉ", new Object[]{"searchType_", "source_", "filterField_", "categoricalSearchName_", "categoricalGroupSearchName_", "searchId_"});
        }
        if (iOrdinal == 3) {
            return new ayt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ays(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ayt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ayt.class) {
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

    public ayu getFilterField() {
        ayu ayuVarA = ayu.a(this.filterField_);
        return ayuVarA == null ? ayu.UNRECOGNIZED : ayuVarA;
    }

    public int getFilterFieldValue() {
        return this.filterField_;
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

    public azs getSource() {
        azs azsVarA = azs.a(this.source_);
        return azsVarA == null ? azs.UNRECOGNIZED : azsVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public static ays newBuilder(ayt aytVar) {
        return (ays) DEFAULT_INSTANCE.createBuilder(aytVar);
    }

    public static ayt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ayt parseFrom(com.google.v.z zVar) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ayt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ayt parseFrom(InputStream inputStream) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayt parseFrom(ByteBuffer byteBuffer) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ayt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ayt parseFrom(byte[] bArr) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ayt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ayt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
