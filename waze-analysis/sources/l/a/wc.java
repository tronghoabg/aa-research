package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wc extends com.google.v.du<wc, wb> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 1;
    private static final wc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<wc> PARSER;
    private String alternativeRouteUuid_ = "";

    static {
        wc wcVar = new wc();
        DEFAULT_INSTANCE = wcVar;
        com.google.v.du.registerDefaultInstance(wc.class, wcVar);
    }

    private wc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    public static wc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wb newBuilder() {
        return (wb) DEFAULT_INSTANCE.createBuilder();
    }

    public static wc parseDelimitedFrom(InputStream inputStream) {
        return (wc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wc parseFrom(com.google.v.v vVar) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wc> parser() {
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"alternativeRouteUuid_"});
        }
        if (iOrdinal == 3) {
            return new wc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new wb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wc.class) {
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

    public static wb newBuilder(wc wcVar) {
        return (wb) DEFAULT_INSTANCE.createBuilder(wcVar);
    }

    public static wc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wc parseFrom(com.google.v.z zVar) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wc parseFrom(InputStream inputStream) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wc parseFrom(ByteBuffer byteBuffer) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wc parseFrom(byte[] bArr) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
