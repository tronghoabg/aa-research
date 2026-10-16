package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayy extends com.google.v.du<ayy, ayw> implements com.google.v.fj {
    private static final ayy DEFAULT_INSTANCE;
    public static final int FLOW_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<ayy> PARSER = null;
    public static final int QUERY_CHARACTERS_COUNT_FIELD_NUMBER = 5;
    public static final int REFERRER_FIELD_NUMBER = 3;
    public static final int SEARCH_ID_FIELD_NUMBER = 2;
    public static final int SEARCH_QUERY_FIELD_NUMBER = 1;
    private int bitField0_;
    private int flowType_;
    private long queryCharactersCount_;
    private String searchQuery_ = "";
    private String searchId_ = "";
    private String referrer_ = "";

    static {
        ayy ayyVar = new ayy();
        DEFAULT_INSTANCE = ayyVar;
        com.google.v.du.registerDefaultInstance(ayy.class, ayyVar);
    }

    private ayy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlowType() {
        this.flowType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryCharactersCount() {
        this.bitField0_ &= -2;
        this.queryCharactersCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReferrer() {
        this.referrer_ = getDefaultInstance().getReferrer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchQuery() {
        this.searchQuery_ = getDefaultInstance().getSearchQuery();
    }

    public static ayy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayw newBuilder() {
        return (ayw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ayy parseDelimitedFrom(InputStream inputStream) {
        return (ayy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayy parseFrom(com.google.v.v vVar) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ayy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowType(ayx ayxVar) {
        this.flowType_ = ayxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowTypeValue(int i2) {
        this.flowType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryCharactersCount(long j2) {
        this.bitField0_ |= 1;
        this.queryCharactersCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferrer(String str) {
        Objects.requireNonNull(str);
        this.referrer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReferrerBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.referrer_ = vVar.u();
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
    public void setSearchQuery(String str) {
        Objects.requireNonNull(str);
        this.searchQuery_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchQueryBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.searchQuery_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005ဂ\u0000", new Object[]{"bitField0_", "searchQuery_", "searchId_", "referrer_", "flowType_", "queryCharactersCount_"});
        }
        if (iOrdinal == 3) {
            return new ayy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ayw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ayy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ayy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ayx getFlowType() {
        int i2 = this.flowType_;
        ayx ayxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ayx.OS_DEFAULT_NAVIGATION_APP : ayx.OS_SHARE_FLOW : ayx.FLOW_TYPE_UNSPECIFIED;
        return ayxVar == null ? ayx.UNRECOGNIZED : ayxVar;
    }

    public int getFlowTypeValue() {
        return this.flowType_;
    }

    public long getQueryCharactersCount() {
        return this.queryCharactersCount_;
    }

    public String getReferrer() {
        return this.referrer_;
    }

    public com.google.v.v getReferrerBytes() {
        return com.google.v.v.s(this.referrer_);
    }

    public String getSearchId() {
        return this.searchId_;
    }

    public com.google.v.v getSearchIdBytes() {
        return com.google.v.v.s(this.searchId_);
    }

    @Deprecated
    public String getSearchQuery() {
        return this.searchQuery_;
    }

    @Deprecated
    public com.google.v.v getSearchQueryBytes() {
        return com.google.v.v.s(this.searchQuery_);
    }

    public boolean hasQueryCharactersCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ayw newBuilder(ayy ayyVar) {
        return (ayw) DEFAULT_INSTANCE.createBuilder(ayyVar);
    }

    public static ayy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ayy parseFrom(com.google.v.z zVar) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ayy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ayy parseFrom(InputStream inputStream) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayy parseFrom(ByteBuffer byteBuffer) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ayy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ayy parseFrom(byte[] bArr) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ayy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ayy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
