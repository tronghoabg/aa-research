package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axz extends com.google.v.du<axz, axy> implements com.google.v.fj {
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 2;
    public static final int CATEGORICAL_SEARCH_NAME_FIELD_NUMBER = 1;
    private static final axz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<axz> PARSER = null;
    public static final int SEARCH_ID_FIELD_NUMBER = 3;
    private int categoricalGroupSearchName_;
    private String categoricalSearchName_ = "";
    private String searchId_ = "";

    static {
        axz axzVar = new axz();
        DEFAULT_INSTANCE = axzVar;
        com.google.v.du.registerDefaultInstance(axz.class, axzVar);
    }

    private axz() {
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

    public static axz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axy newBuilder() {
        return (axy) DEFAULT_INSTANCE.createBuilder();
    }

    public static axz parseDelimitedFrom(InputStream inputStream) {
        return (axz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axz parseFrom(com.google.v.v vVar) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axz> parser() {
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"categoricalSearchName_", "categoricalGroupSearchName_", "searchId_"});
        }
        if (iOrdinal == 3) {
            return new axz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axz.class) {
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

    public static axy newBuilder(axz axzVar) {
        return (axy) DEFAULT_INSTANCE.createBuilder(axzVar);
    }

    public static axz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axz parseFrom(com.google.v.z zVar) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axz parseFrom(InputStream inputStream) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axz parseFrom(ByteBuffer byteBuffer) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axz parseFrom(byte[] bArr) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
