package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class gg extends com.google.v.du<gg, gf> implements com.google.v.fj {
    private static final gg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gg> PARSER = null;
    public static final int SEARCH_VENUE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String searchVenueId_ = "";

    static {
        gg ggVar = new gg();
        DEFAULT_INSTANCE = ggVar;
        com.google.v.du.registerDefaultInstance(gg.class, ggVar);
    }

    private gg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchVenueId() {
        this.bitField0_ &= -2;
        this.searchVenueId_ = getDefaultInstance().getSearchVenueId();
    }

    public static gg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gf newBuilder() {
        return (gf) DEFAULT_INSTANCE.createBuilder();
    }

    public static gg parseDelimitedFrom(InputStream inputStream) {
        return (gg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gg parseFrom(com.google.v.v vVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.searchVenueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchVenueIdBytes(com.google.v.v vVar) {
        this.searchVenueId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "searchVenueId_"});
        }
        if (iOrdinal == 3) {
            return new gg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getSearchVenueId() {
        return this.searchVenueId_;
    }

    public com.google.v.v getSearchVenueIdBytes() {
        return com.google.v.v.s(this.searchVenueId_);
    }

    public boolean hasSearchVenueId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gf newBuilder(gg ggVar) {
        return (gf) DEFAULT_INSTANCE.createBuilder(ggVar);
    }

    public static gg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gg parseFrom(com.google.v.z zVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gg parseFrom(InputStream inputStream) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gg parseFrom(ByteBuffer byteBuffer) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gg parseFrom(byte[] bArr) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
