package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azo extends com.google.v.du<azo, azn> implements com.google.v.fj {
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 3;
    public static final int CATEGORICAL_SEARCH_NAME_FIELD_NUMBER = 2;
    private static final azo DEFAULT_INSTANCE;
    public static final int NUMBER_OF_RESULTS_FIELD_NUMBER = 1;
    public static final int NUMBER_RESULTS_SHOWN_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<azo> PARSER = null;
    public static final int SEARCH_AGAIN_FIELD_NUMBER = 6;
    public static final int SEARCH_ID_FIELD_NUMBER = 5;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 7;
    private int bitField0_;
    private int categoricalGroupSearchName_;
    private long numberOfResults_;
    private long numberResultsShown_;
    private boolean searchAgain_;
    private int triggeringPlatform_;
    private String categoricalSearchName_ = "";
    private String searchId_ = "";

    static {
        azo azoVar = new azo();
        DEFAULT_INSTANCE = azoVar;
        com.google.v.du.registerDefaultInstance(azo.class, azoVar);
    }

    private azo() {
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
    public void clearNumberOfResults() {
        this.bitField0_ &= -2;
        this.numberOfResults_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberResultsShown() {
        this.bitField0_ &= -3;
        this.numberResultsShown_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchAgain() {
        this.bitField0_ &= -5;
        this.searchAgain_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    public static azo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static azn newBuilder() {
        return (azn) DEFAULT_INSTANCE.createBuilder();
    }

    public static azo parseDelimitedFrom(InputStream inputStream) {
        return (azo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azo parseFrom(com.google.v.v vVar) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<azo> parser() {
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
    public void setNumberOfResults(long j2) {
        this.bitField0_ |= 1;
        this.numberOfResults_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberResultsShown(long j2) {
        this.bitField0_ |= 2;
        this.numberResultsShown_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAgain(boolean z) {
        this.bitField0_ |= 4;
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
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ\u0003\f\u0004ဂ\u0001\u0005Ȉ\u0006ဇ\u0002\u0007\f", new Object[]{"bitField0_", "numberOfResults_", "categoricalSearchName_", "categoricalGroupSearchName_", "numberResultsShown_", "searchId_", "searchAgain_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new azo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new azn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<azo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (azo.class) {
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

    public long getNumberOfResults() {
        return this.numberOfResults_;
    }

    public long getNumberResultsShown() {
        return this.numberResultsShown_;
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

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public boolean hasNumberOfResults() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNumberResultsShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSearchAgain() {
        return (this.bitField0_ & 4) != 0;
    }

    public static azn newBuilder(azo azoVar) {
        return (azn) DEFAULT_INSTANCE.createBuilder(azoVar);
    }

    public static azo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static azo parseFrom(com.google.v.z zVar) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static azo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static azo parseFrom(InputStream inputStream) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azo parseFrom(ByteBuffer byteBuffer) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static azo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static azo parseFrom(byte[] bArr) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static azo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (azo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
