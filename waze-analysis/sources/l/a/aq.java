package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aq extends com.google.v.du<aq, ap> implements com.google.v.fj {
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final aq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aq> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    private int category_;
    private String venueId_ = "";

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        com.google.v.du.registerDefaultInstance(aq.class, aqVar);
    }

    private aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static aq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aq parseDelimitedFrom(InputStream inputStream) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(com.google.v.v vVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(ayn aynVar) {
        this.category_ = aynVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryValue(int i2) {
        this.category_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"category_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new aq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ap(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ayn getCategory() {
        ayn aynVarA = ayn.a(this.category_);
        return aynVarA == null ? ayn.UNRECOGNIZED : aynVarA;
    }

    public int getCategoryValue() {
        return this.category_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public static ap newBuilder(aq aqVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(aqVar);
    }

    public static aq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aq parseFrom(com.google.v.z zVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aq parseFrom(InputStream inputStream) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(ByteBuffer byteBuffer) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aq parseFrom(byte[] bArr) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
