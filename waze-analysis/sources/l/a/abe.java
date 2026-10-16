package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abe extends com.google.v.du<abe, abc> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 2;
    private static final abe DEFAULT_INSTANCE;
    public static final int GUIDANCE_SOURCE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<abe> PARSER;
    private String alternativeRouteUuid_ = "";
    private int guidanceSource_;

    static {
        abe abeVar = new abe();
        DEFAULT_INSTANCE = abeVar;
        com.google.v.du.registerDefaultInstance(abe.class, abeVar);
    }

    private abe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuidanceSource() {
        this.guidanceSource_ = 0;
    }

    public static abe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static abc newBuilder() {
        return (abc) DEFAULT_INSTANCE.createBuilder();
    }

    public static abe parseDelimitedFrom(InputStream inputStream) {
        return (abe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abe parseFrom(com.google.v.v vVar) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceSource(abd abdVar) {
        this.guidanceSource_ = abdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuidanceSourceValue(int i2) {
        this.guidanceSource_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"guidanceSource_", "alternativeRouteUuid_"});
        }
        if (iOrdinal == 3) {
            return new abe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new abc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public abd getGuidanceSource() {
        int i2 = this.guidanceSource_;
        abd abdVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : abd.OFFLINE_SOURCE : abd.ONLINE_SOURCE : abd.GUIDANCE_SOURCE_UNSPECIFIED;
        return abdVar == null ? abd.UNRECOGNIZED : abdVar;
    }

    public int getGuidanceSourceValue() {
        return this.guidanceSource_;
    }

    public static abc newBuilder(abe abeVar) {
        return (abc) DEFAULT_INSTANCE.createBuilder(abeVar);
    }

    public static abe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abe parseFrom(com.google.v.z zVar) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abe parseFrom(InputStream inputStream) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abe parseFrom(ByteBuffer byteBuffer) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abe parseFrom(byte[] bArr) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
