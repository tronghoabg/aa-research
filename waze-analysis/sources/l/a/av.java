package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class av extends com.google.v.du<av, au> implements com.google.v.fj {
    private static final av DEFAULT_INSTANCE;
    public static final int IS_NEW_ADDRESS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<av> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 1;
    private boolean isNewAddress_;
    private String venueId_ = "";

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        com.google.v.du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNewAddress() {
        this.isNewAddress_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNewAddress(boolean z) {
        this.isNewAddress_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"venueId_", "isNewAddress_"});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsNewAddress() {
        return this.isNewAddress_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
