package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class f extends com.google.v.du<f, e> implements g {
    private static final f DEFAULT_INSTANCE;
    public static final int DISCOUNTED_RATE_FIELD_NUMBER = 2;
    public static final int DURATION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<f> PARSER = null;
    public static final int STANDARD_RATE_FIELD_NUMBER = 1;
    public static final int VALID_TIME_PERIOD_FIELD_NUMBER = 4;
    private int bitField0_;
    private com.waze.ca.c discountedRate_;
    private com.google.v.db duration_;
    private com.waze.ca.c standardRate_;
    private com.waze.ca.i validTimePeriod_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.v.du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiscountedRate() {
        this.discountedRate_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStandardRate() {
        this.standardRate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidTimePeriod() {
        this.validTimePeriod_ = null;
        this.bitField0_ &= -9;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDiscountedRate(com.waze.ca.c cVar) {
        Objects.requireNonNull(cVar);
        com.waze.ca.c cVar2 = this.discountedRate_;
        if (cVar2 != null && cVar2 != com.waze.ca.c.getDefaultInstance()) {
            com.waze.ca.b bVarNewBuilder = com.waze.ca.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.waze.ca.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.discountedRate_ = cVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDuration(com.google.v.db dbVar) {
        Objects.requireNonNull(dbVar);
        com.google.v.db dbVar2 = this.duration_;
        if (dbVar2 != null && dbVar2 != com.google.v.db.getDefaultInstance()) {
            com.google.v.da daVarNewBuilder = com.google.v.db.newBuilder(dbVar2);
            daVarNewBuilder.mergeFrom((com.google.v.da) dbVar);
            dbVar = daVarNewBuilder.buildPartial();
        }
        this.duration_ = dbVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStandardRate(com.waze.ca.c cVar) {
        Objects.requireNonNull(cVar);
        com.waze.ca.c cVar2 = this.standardRate_;
        if (cVar2 != null && cVar2 != com.waze.ca.c.getDefaultInstance()) {
            com.waze.ca.b bVarNewBuilder = com.waze.ca.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.waze.ca.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.standardRate_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValidTimePeriod(com.waze.ca.i iVar) {
        Objects.requireNonNull(iVar);
        com.waze.ca.i iVar2 = this.validTimePeriod_;
        if (iVar2 != null && iVar2 != com.waze.ca.i.getDefaultInstance()) {
            com.waze.ca.h hVarNewBuilder = com.waze.ca.i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((com.waze.ca.h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.validTimePeriod_ = iVar;
        this.bitField0_ |= 8;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(com.google.v.v vVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiscountedRate(com.waze.ca.c cVar) {
        Objects.requireNonNull(cVar);
        this.discountedRate_ = cVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(com.google.v.db dbVar) {
        Objects.requireNonNull(dbVar);
        this.duration_ = dbVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStandardRate(com.waze.ca.c cVar) {
        Objects.requireNonNull(cVar);
        this.standardRate_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidTimePeriod(com.waze.ca.i iVar) {
        Objects.requireNonNull(iVar);
        this.validTimePeriod_ = iVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "standardRate_", "discountedRate_", "duration_", "validTimePeriod_"});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new e(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.ca.c getDiscountedRate() {
        com.waze.ca.c cVar = this.discountedRate_;
        return cVar == null ? com.waze.ca.c.getDefaultInstance() : cVar;
    }

    public com.google.v.db getDuration() {
        com.google.v.db dbVar = this.duration_;
        return dbVar == null ? com.google.v.db.getDefaultInstance() : dbVar;
    }

    public com.waze.ca.c getStandardRate() {
        com.waze.ca.c cVar = this.standardRate_;
        return cVar == null ? com.waze.ca.c.getDefaultInstance() : cVar;
    }

    public com.waze.ca.i getValidTimePeriod() {
        com.waze.ca.i iVar = this.validTimePeriod_;
        return iVar == null ? com.waze.ca.i.getDefaultInstance() : iVar;
    }

    public boolean hasDiscountedRate() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDuration() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasStandardRate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValidTimePeriod() {
        return (this.bitField0_ & 8) != 0;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(com.google.v.z zVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
