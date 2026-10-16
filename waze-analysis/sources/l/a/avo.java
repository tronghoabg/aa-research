package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avo extends com.google.v.du<avo, avn> implements com.google.v.fj {
    private static final avo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<avo> PARSER = null;
    public static final int SUGGESTED_ALTERNATE_ROUTE_UUID_FIELD_NUMBER = 1;
    private String suggestedAlternateRouteUuid_ = "";

    static {
        avo avoVar = new avo();
        DEFAULT_INSTANCE = avoVar;
        com.google.v.du.registerDefaultInstance(avo.class, avoVar);
    }

    private avo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuggestedAlternateRouteUuid() {
        this.suggestedAlternateRouteUuid_ = getDefaultInstance().getSuggestedAlternateRouteUuid();
    }

    public static avo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static avn newBuilder() {
        return (avn) DEFAULT_INSTANCE.createBuilder();
    }

    public static avo parseDelimitedFrom(InputStream inputStream) {
        return (avo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avo parseFrom(com.google.v.v vVar) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<avo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAlternateRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.suggestedAlternateRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestedAlternateRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.suggestedAlternateRouteUuid_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"suggestedAlternateRouteUuid_"});
        }
        if (iOrdinal == 3) {
            return new avo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<avo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (avo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getSuggestedAlternateRouteUuid() {
        return this.suggestedAlternateRouteUuid_;
    }

    public com.google.v.v getSuggestedAlternateRouteUuidBytes() {
        return com.google.v.v.s(this.suggestedAlternateRouteUuid_);
    }

    public static avn newBuilder(avo avoVar) {
        return (avn) DEFAULT_INSTANCE.createBuilder(avoVar);
    }

    public static avo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static avo parseFrom(com.google.v.z zVar) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static avo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static avo parseFrom(InputStream inputStream) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avo parseFrom(ByteBuffer byteBuffer) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static avo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static avo parseFrom(byte[] bArr) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static avo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (avo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
