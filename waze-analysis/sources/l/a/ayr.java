package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayr extends com.google.v.du<ayr, ayq> implements ayv {
    private static final ayr DEFAULT_INSTANCE;
    public static final int FILTER_FIELD_FIELD_NUMBER = 1;
    public static final int FILTER_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ayr> PARSER;
    private int filterField_;
    private String filterValue_ = "";

    static {
        ayr ayrVar = new ayr();
        DEFAULT_INSTANCE = ayrVar;
        com.google.v.du.registerDefaultInstance(ayr.class, ayrVar);
    }

    private ayr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilterField() {
        this.filterField_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilterValue() {
        this.filterValue_ = getDefaultInstance().getFilterValue();
    }

    public static ayr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayq newBuilder() {
        return (ayq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ayr parseDelimitedFrom(InputStream inputStream) {
        return (ayr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayr parseFrom(com.google.v.v vVar) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ayr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setFilterValue(String str) {
        Objects.requireNonNull(str);
        this.filterValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilterValueBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.filterValue_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"filterField_", "filterValue_"});
        }
        if (iOrdinal == 3) {
            return new ayr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ayq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ayr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ayr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ayu getFilterField() {
        ayu ayuVarA = ayu.a(this.filterField_);
        return ayuVarA == null ? ayu.UNRECOGNIZED : ayuVarA;
    }

    public int getFilterFieldValue() {
        return this.filterField_;
    }

    public String getFilterValue() {
        return this.filterValue_;
    }

    public com.google.v.v getFilterValueBytes() {
        return com.google.v.v.s(this.filterValue_);
    }

    public static ayq newBuilder(ayr ayrVar) {
        return (ayq) DEFAULT_INSTANCE.createBuilder(ayrVar);
    }

    public static ayr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ayr parseFrom(com.google.v.z zVar) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ayr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ayr parseFrom(InputStream inputStream) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayr parseFrom(ByteBuffer byteBuffer) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ayr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ayr parseFrom(byte[] bArr) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ayr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ayr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
