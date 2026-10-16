package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cz extends com.google.v.du<cz, cy> implements da {
    private static final cz DEFAULT_INSTANCE;
    public static final int EXPERIMENT_FIELD_NUMBER = 5000;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<cz> PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 4;
    public static final int UPDATED_BY_FIELD_NUMBER = 3;
    private int bitField0_;
    private bl experiment_;
    private long lastUpdated_;
    private float price_;
    private String id_ = "";
    private String updatedBy_ = "";

    static {
        cz czVar = new cz();
        DEFAULT_INSTANCE = czVar;
        com.google.v.du.registerDefaultInstance(cz.class, czVar);
    }

    private cz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperiment() {
        this.experiment_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdated() {
        this.bitField0_ &= -3;
        this.lastUpdated_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrice() {
        this.bitField0_ &= -9;
        this.price_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedBy() {
        this.bitField0_ &= -5;
        this.updatedBy_ = getDefaultInstance().getUpdatedBy();
    }

    public static cz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExperiment(bl blVar) {
        Objects.requireNonNull(blVar);
        bl blVar2 = this.experiment_;
        if (blVar2 != null && blVar2 != bl.getDefaultInstance()) {
            bk bkVarNewBuilder = bl.newBuilder(blVar2);
            bkVarNewBuilder.mergeFrom((bk) blVar);
            blVar = bkVarNewBuilder.buildPartial();
        }
        this.experiment_ = blVar;
        this.bitField0_ |= 16;
    }

    public static cy newBuilder() {
        return (cy) DEFAULT_INSTANCE.createBuilder();
    }

    public static cz parseDelimitedFrom(InputStream inputStream) {
        return (cz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cz parseFrom(com.google.v.v vVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperiment(bl blVar) {
        Objects.requireNonNull(blVar);
        this.experiment_ = blVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdated(long j2) {
        this.bitField0_ |= 2;
        this.lastUpdated_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrice(float f2) {
        this.bitField0_ |= 8;
        this.price_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedBy(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.updatedBy_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedByBytes(com.google.v.v vVar) {
        this.updatedBy_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ᎈ\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ခ\u0003ᎈဉ\u0004", new Object[]{"bitField0_", "id_", "lastUpdated_", "updatedBy_", "price_", "experiment_"});
        }
        if (iOrdinal == 3) {
            return new cz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bl getExperiment() {
        bl blVar = this.experiment_;
        return blVar == null ? bl.getDefaultInstance() : blVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public long getLastUpdated() {
        return this.lastUpdated_;
    }

    public float getPrice() {
        return this.price_;
    }

    public String getUpdatedBy() {
        return this.updatedBy_;
    }

    public com.google.v.v getUpdatedByBytes() {
        return com.google.v.v.s(this.updatedBy_);
    }

    public boolean hasExperiment() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLastUpdated() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPrice() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUpdatedBy() {
        return (this.bitField0_ & 4) != 0;
    }

    public static cy newBuilder(cz czVar) {
        return (cy) DEFAULT_INSTANCE.createBuilder(czVar);
    }

    public static cz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cz parseFrom(com.google.v.z zVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cz parseFrom(InputStream inputStream) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cz parseFrom(ByteBuffer byteBuffer) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cz parseFrom(byte[] bArr) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
