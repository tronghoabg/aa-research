package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gj extends com.google.v.du<gj, gi> implements com.google.v.fj {
    private static final gj DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int METER_DISTANCE_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<gj> PARSER = null;
    public static final int QUERY_CHARACTERS_COUNT_FIELD_NUMBER = 6;
    public static final int QUERY_FIELD_NUMBER = 4;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    public static final int VENUE_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private long index_;
    private long meterDistance_;
    private long queryCharactersCount_;
    private String venueId_ = "";
    private String venueName_ = "";
    private String query_ = "";

    static {
        gj gjVar = new gj();
        DEFAULT_INSTANCE = gjVar;
        com.google.v.du.registerDefaultInstance(gj.class, gjVar);
    }

    private gj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeterDistance() {
        this.bitField0_ &= -3;
        this.meterDistance_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryCharactersCount() {
        this.bitField0_ &= -5;
        this.queryCharactersCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueName() {
        this.venueName_ = getDefaultInstance().getVenueName();
    }

    public static gj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gi newBuilder() {
        return (gi) DEFAULT_INSTANCE.createBuilder();
    }

    public static gj parseDelimitedFrom(InputStream inputStream) {
        return (gj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gj parseFrom(com.google.v.v vVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.bitField0_ |= 1;
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeterDistance(long j2) {
        this.bitField0_ |= 2;
        this.meterDistance_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        Objects.requireNonNull(str);
        this.query_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.query_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryCharactersCount(long j2) {
        this.bitField0_ |= 4;
        this.queryCharactersCount_ = j2;
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
    public void setVenueName(String str) {
        Objects.requireNonNull(str);
        this.venueName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueName_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဂ\u0001\u0006ဂ\u0002", new Object[]{"bitField0_", "index_", "venueId_", "venueName_", "query_", "meterDistance_", "queryCharactersCount_"});
        }
        if (iOrdinal == 3) {
            return new gj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getIndex() {
        return this.index_;
    }

    public long getMeterDistance() {
        return this.meterDistance_;
    }

    @Deprecated
    public String getQuery() {
        return this.query_;
    }

    @Deprecated
    public com.google.v.v getQueryBytes() {
        return com.google.v.v.s(this.query_);
    }

    public long getQueryCharactersCount() {
        return this.queryCharactersCount_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public String getVenueName() {
        return this.venueName_;
    }

    public com.google.v.v getVenueNameBytes() {
        return com.google.v.v.s(this.venueName_);
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMeterDistance() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasQueryCharactersCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public static gi newBuilder(gj gjVar) {
        return (gi) DEFAULT_INSTANCE.createBuilder(gjVar);
    }

    public static gj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gj parseFrom(com.google.v.z zVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gj parseFrom(InputStream inputStream) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gj parseFrom(ByteBuffer byteBuffer) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gj parseFrom(byte[] bArr) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
