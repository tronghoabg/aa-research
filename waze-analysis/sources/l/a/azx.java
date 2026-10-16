package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azx extends com.google.v.du<azx, azw> implements com.google.v.fj {
    public static final int ALGO_TRANSPARENCY_LINK_SHOWN_FIELD_NUMBER = 5;
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 4;
    public static final int CATEGORICAL_SEARCH_NAME_FIELD_NUMBER = 3;
    private static final azx DEFAULT_INSTANCE;
    public static final int FILTER_FIELDS_FIELD_NUMBER = 10;
    public static final int LATENCY_MS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<azx> PARSER = null;
    public static final int QUERY_CHARACTERS_COUNT_FIELD_NUMBER = 14;
    public static final int QUERY_FIELD_NUMBER = 12;
    public static final int RESULTS_COUNT_FIELD_NUMBER = 2;
    public static final int SEARCH_AGAIN_FIELD_NUMBER = 9;
    public static final int SEARCH_ID_FIELD_NUMBER = 8;
    public static final int SKIP_SEARCH_RESULTS_SCREEN_FIELD_NUMBER = 13;
    public static final int SOURCE_FIELD_NUMBER = 6;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 11;
    public static final int TYPE_FIELD_NUMBER = 7;
    private boolean algoTransparencyLinkShown_;
    private int bitField0_;
    private int categoricalGroupSearchName_;
    private long latencyMs_;
    private long queryCharactersCount_;
    private long resultsCount_;
    private boolean searchAgain_;
    private boolean skipSearchResultsScreen_;
    private int source_;
    private int triggeringPlatform_;
    private int type_;
    private String categoricalSearchName_ = "";
    private String searchId_ = "";
    private com.google.v.eo<ayr> filterFields_ = emptyProtobufList();
    private String query_ = "";

    static {
        azx azxVar = new azx();
        DEFAULT_INSTANCE = azxVar;
        com.google.v.du.registerDefaultInstance(azx.class, azxVar);
    }

    private azx() {
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
    public void clearAlgoTransparencyLinkShown() {
        this.bitField0_ &= -5;
        this.algoTransparencyLinkShown_ = false;
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
    public void clearFilterFields() {
        this.filterFields_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -2;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryCharactersCount() {
        this.bitField0_ &= -33;
        this.queryCharactersCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultsCount() {
        this.bitField0_ &= -3;
        this.resultsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchAgain() {
        this.bitField0_ &= -9;
        this.searchAgain_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipSearchResultsScreen() {
        this.bitField0_ &= -17;
        this.skipSearchResultsScreen_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureFilterFieldsIsMutable() {
        com.google.v.eo<ayr> eoVar = this.filterFields_;
        if (eoVar.c()) {
            return;
        }
        this.filterFields_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static azx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static azw newBuilder() {
        return (azw) DEFAULT_INSTANCE.createBuilder();
    }

    public static azx parseDelimitedFrom(InputStream inputStream) {
        return (azx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azx parseFrom(com.google.v.v vVar) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<azx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFilterFields(int i2) {
        ensureFilterFieldsIsMutable();
        this.filterFields_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlgoTransparencyLinkShown(boolean z) {
        this.bitField0_ |= 4;
        this.algoTransparencyLinkShown_ = z;
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
    public void setFilterFields(int i2, ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.set(i2, ayrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 1;
        this.latencyMs_ = j2;
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
        this.bitField0_ |= 32;
        this.queryCharactersCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultsCount(long j2) {
        this.bitField0_ |= 2;
        this.resultsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAgain(boolean z) {
        this.bitField0_ |= 8;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipSearchResultsScreen(boolean z) {
        this.bitField0_ |= 16;
        this.skipSearchResultsScreen_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(azs azsVar) {
        this.source_ = azsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(azy azyVar) {
        this.type_ = azyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003Ȉ\u0004\f\u0005ဇ\u0002\u0006\f\u0007\f\bȈ\tဇ\u0003\n\u001b\u000b\f\fȈ\rဇ\u0004\u000eဂ\u0005", new Object[]{"bitField0_", "latencyMs_", "resultsCount_", "categoricalSearchName_", "categoricalGroupSearchName_", "algoTransparencyLinkShown_", "source_", "type_", "searchId_", "searchAgain_", "filterFields_", ayr.class, "triggeringPlatform_", "query_", "skipSearchResultsScreen_", "queryCharactersCount_"});
        }
        if (iOrdinal == 3) {
            return new azx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new azw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<azx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (azx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAlgoTransparencyLinkShown() {
        return this.algoTransparencyLinkShown_;
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

    public long getLatencyMs() {
        return this.latencyMs_;
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

    public long getResultsCount() {
        return this.resultsCount_;
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

    public boolean getSkipSearchResultsScreen() {
        return this.skipSearchResultsScreen_;
    }

    public azs getSource() {
        azs azsVarA = azs.a(this.source_);
        return azsVarA == null ? azs.UNRECOGNIZED : azsVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public azy getType() {
        azy azyVarA = azy.a(this.type_);
        return azyVarA == null ? azy.UNRECOGNIZED : azyVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasAlgoTransparencyLinkShown() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasQueryCharactersCount() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasResultsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSearchAgain() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSkipSearchResultsScreen() {
        return (this.bitField0_ & 16) != 0;
    }

    public static azw newBuilder(azx azxVar) {
        return (azw) DEFAULT_INSTANCE.createBuilder(azxVar);
    }

    public static azx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static azx parseFrom(com.google.v.z zVar) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static azx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFilterFields(ayr ayrVar) {
        Objects.requireNonNull(ayrVar);
        ensureFilterFieldsIsMutable();
        this.filterFields_.add(ayrVar);
    }

    public static azx parseFrom(InputStream inputStream) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azx parseFrom(ByteBuffer byteBuffer) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static azx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static azx parseFrom(byte[] bArr) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static azx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (azx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
