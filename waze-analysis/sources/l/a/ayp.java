package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayp extends com.google.v.du<ayp, ayo> implements com.google.v.fj {
    private static final ayp DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int FILTER_FIELDS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ayp> PARSER = null;
    public static final int QUERY_CHARACTERS_COUNT_FIELD_NUMBER = 6;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int SEARCH_AGAIN_FIELD_NUMBER = 3;
    public static final int SEARCH_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private long errorCode_;
    private long queryCharactersCount_;
    private boolean searchAgain_;
    private String searchId_ = "";
    private com.google.v.eo<ayr> filterFields_ = emptyProtobufList();
    private String query_ = "";

    static {
        ayp aypVar = new ayp();
        DEFAULT_INSTANCE = aypVar;
        com.google.v.du.registerDefaultInstance(ayp.class, aypVar);
    }

    private ayp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFilterFields(Iterable<? extends ayr> iterable) {
        ensureFilterFieldsIsMutable();
        com.google.v.c.addAll(iterable, this.filterFields_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilterFields(int i2, ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.add(i2, ayrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -2;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilterFields() {
        this.filterFields_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryCharactersCount() {
        this.bitField0_ &= -5;
        this.queryCharactersCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchAgain() {
        this.bitField0_ &= -3;
        this.searchAgain_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
    }

    private void ensureFilterFieldsIsMutable() {
        com.google.v.eo<ayr> eoVar = this.filterFields_;
        if (eoVar.c()) {
            return;
        }
        this.filterFields_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ayp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayo newBuilder() {
        return (ayo) DEFAULT_INSTANCE.createBuilder();
    }

    public static ayp parseDelimitedFrom(InputStream inputStream) {
        return (ayp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayp parseFrom(com.google.v.v vVar) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ayp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFilterFields(int i2) {
        ensureFilterFieldsIsMutable();
        this.filterFields_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 1;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterFields(int i2, ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.set(i2, ayrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        Objects.requireNonNull(str);
        this.query_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.query_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryCharactersCount(long j2) {
        this.bitField0_ |= 4;
        this.queryCharactersCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAgain(boolean z) {
        this.bitField0_ |= 2;
        this.searchAgain_ = z;
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0002Ȉ\u0003ဇ\u0001\u0004\u001b\u0005Ȉ\u0006ဂ\u0002", new Object[]{"bitField0_", "errorCode_", "searchId_", "searchAgain_", "filterFields_", ayr.class, "query_", "queryCharactersCount_"});
        }
        if (iOrdinal == 3) {
            return new ayp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ayo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ayp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ayp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public ayr getFilterFields(int i2) {
        return this.filterFields_.get(i2);
    }

    public int getFilterFieldsCount() {
        return this.filterFields_.size();
    }

    public List<ayr> getFilterFieldsList() {
        return this.filterFields_;
    }

    public ayv getFilterFieldsOrBuilder(int i2) {
        return this.filterFields_.get(i2);
    }

    public List<? extends ayv> getFilterFieldsOrBuilderList() {
        return this.filterFields_;
    }

    @Deprecated
    public String getQuery() {
        return this.query_;
    }

    @Deprecated
    public com.google.v.v getQueryBytes() {
        return com.google.v.v.s(this.query_);
    }

    public long getQueryCharactersCount() {
        return this.queryCharactersCount_;
    }

    public boolean getSearchAgain() {
        return this.searchAgain_;
    }

    public String getSearchId() {
        return this.searchId_;
    }

    public com.google.v.v getSearchIdBytes() {
        return com.google.v.v.s(this.searchId_);
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasQueryCharactersCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSearchAgain() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ayo newBuilder(ayp aypVar) {
        return (ayo) DEFAULT_INSTANCE.createBuilder(aypVar);
    }

    public static ayp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ayp parseFrom(com.google.v.z zVar) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ayp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilterFields(ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.add(ayrVar);
    }

    public static ayp parseFrom(InputStream inputStream) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayp parseFrom(ByteBuffer byteBuffer) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ayp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ayp parseFrom(byte[] bArr) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ayp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ayp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
