package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class api extends com.google.v.du<api, aph> implements com.google.v.fj {
    private static final api DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<api> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 1;
    private String venueId_ = "";

    static {
        api apiVar = new api();
        DEFAULT_INSTANCE = apiVar;
        com.google.v.du.registerDefaultInstance(api.class, apiVar);
    }

    private api() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aph newBuilder() {
        return (aph) DEFAULT_INSTANCE.createBuilder();
    }

    public static api parseDelimitedFrom(InputStream inputStream) {
        return (api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static api parseFrom(com.google.v.v vVar) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<api> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"venueId_"});
        }
        if (iOrdinal == 3) {
            return new api();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aph(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<api> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (api.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public static aph newBuilder(api apiVar) {
        return (aph) DEFAULT_INSTANCE.createBuilder(apiVar);
    }

    public static api parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (api) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static api parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static api parseFrom(com.google.v.z zVar) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static api parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static api parseFrom(InputStream inputStream) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static api parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static api parseFrom(ByteBuffer byteBuffer) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static api parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static api parseFrom(byte[] bArr) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static api parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (api) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
