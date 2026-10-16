package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gs extends com.google.v.du<gs, gr> implements com.google.v.fj {
    public static final int CATEGORY_SUGGESTED_FIELD_NUMBER = 7;
    private static final gs DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int ND4C_ALGO_TRANSPARENCY_LINK_SHOWN_FIELD_NUMBER = 5;
    public static final int NEW_QUERY_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_RESULTS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<gs> PARSER = null;
    public static final int QUERY_CHARACTERS_COUNT_FIELD_NUMBER = 9;
    public static final int QUERY_FIELD_NUMBER = 1;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 8;
    public static final int VOICE_SEARCH_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean categorySuggested_;
    private long errorCode_;
    private boolean nd4CAlgoTransparencyLinkShown_;
    private boolean newQuery_;
    private long numberOfResults_;
    private long queryCharactersCount_;
    private String query_ = "";
    private int triggeringPlatform_;
    private boolean voiceSearch_;

    static {
        gs gsVar = new gs();
        DEFAULT_INSTANCE = gsVar;
        com.google.v.du.registerDefaultInstance(gs.class, gsVar);
    }

    private gs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategorySuggested() {
        this.bitField0_ &= -33;
        this.categorySuggested_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -5;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNd4CAlgoTransparencyLinkShown() {
        this.bitField0_ &= -9;
        this.nd4CAlgoTransparencyLinkShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewQuery() {
        this.bitField0_ &= -3;
        this.newQuery_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberOfResults() {
        this.bitField0_ &= -2;
        this.numberOfResults_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryCharactersCount() {
        this.bitField0_ &= -65;
        this.queryCharactersCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceSearch() {
        this.bitField0_ &= -17;
        this.voiceSearch_ = false;
    }

    public static gs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gr newBuilder() {
        return (gr) DEFAULT_INSTANCE.createBuilder();
    }

    public static gs parseDelimitedFrom(InputStream inputStream) {
        return (gs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gs parseFrom(com.google.v.v vVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategorySuggested(boolean z) {
        this.bitField0_ |= 32;
        this.categorySuggested_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 4;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNd4CAlgoTransparencyLinkShown(boolean z) {
        this.bitField0_ |= 8;
        this.nd4CAlgoTransparencyLinkShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewQuery(boolean z) {
        this.bitField0_ |= 2;
        this.newQuery_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberOfResults(long j2) {
        this.bitField0_ |= 1;
        this.numberOfResults_ = j2;
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
        this.bitField0_ |= 64;
        this.queryCharactersCount_ = j2;
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
    public void setVoiceSearch(boolean z) {
        this.bitField0_ |= 16;
        this.voiceSearch_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဂ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\b\f\tဂ\u0006", new Object[]{"bitField0_", "query_", "numberOfResults_", "newQuery_", "errorCode_", "nd4CAlgoTransparencyLinkShown_", "voiceSearch_", "categorySuggested_", "triggeringPlatform_", "queryCharactersCount_"});
        }
        if (iOrdinal == 3) {
            return new gs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCategorySuggested() {
        return this.categorySuggested_;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public boolean getNd4CAlgoTransparencyLinkShown() {
        return this.nd4CAlgoTransparencyLinkShown_;
    }

    public boolean getNewQuery() {
        return this.newQuery_;
    }

    public long getNumberOfResults() {
        return this.numberOfResults_;
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

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public boolean getVoiceSearch() {
        return this.voiceSearch_;
    }

    public boolean hasCategorySuggested() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNd4CAlgoTransparencyLinkShown() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNewQuery() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNumberOfResults() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasQueryCharactersCount() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasVoiceSearch() {
        return (this.bitField0_ & 16) != 0;
    }

    public static gr newBuilder(gs gsVar) {
        return (gr) DEFAULT_INSTANCE.createBuilder(gsVar);
    }

    public static gs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gs parseFrom(com.google.v.z zVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gs parseFrom(InputStream inputStream) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gs parseFrom(ByteBuffer byteBuffer) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gs parseFrom(byte[] bArr) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
