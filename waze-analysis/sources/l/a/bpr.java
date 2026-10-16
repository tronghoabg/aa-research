package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bpr extends com.google.v.du<bpr, bpq> implements com.google.v.fj {
    private static final bpr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bpr> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 1;
    public static final int VENUE_MULTI_ENTRY_CARD_NAME_FIELD_NUMBER = 2;
    private String venueId_ = "";
    private String venueMultiEntryCardName_ = "";

    static {
        bpr bprVar = new bpr();
        DEFAULT_INSTANCE = bprVar;
        com.google.v.du.registerDefaultInstance(bpr.class, bprVar);
    }

    private bpr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueMultiEntryCardName() {
        this.venueMultiEntryCardName_ = getDefaultInstance().getVenueMultiEntryCardName();
    }

    public static bpr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bpq newBuilder() {
        return (bpq) DEFAULT_INSTANCE.createBuilder();
    }

    public static bpr parseDelimitedFrom(InputStream inputStream) {
        return (bpr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpr parseFrom(com.google.v.v vVar) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bpr> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueMultiEntryCardName(String str) {
        Objects.requireNonNull(str);
        this.venueMultiEntryCardName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueMultiEntryCardNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueMultiEntryCardName_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"venueId_", "venueMultiEntryCardName_"});
        }
        if (iOrdinal == 3) {
            return new bpr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bpq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bpr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bpr.class) {
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

    public String getVenueMultiEntryCardName() {
        return this.venueMultiEntryCardName_;
    }

    public com.google.v.v getVenueMultiEntryCardNameBytes() {
        return com.google.v.v.s(this.venueMultiEntryCardName_);
    }

    public static bpq newBuilder(bpr bprVar) {
        return (bpq) DEFAULT_INSTANCE.createBuilder(bprVar);
    }

    public static bpr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bpr parseFrom(com.google.v.z zVar) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bpr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bpr parseFrom(InputStream inputStream) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bpr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bpr parseFrom(ByteBuffer byteBuffer) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bpr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bpr parseFrom(byte[] bArr) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bpr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bpr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
