package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dv extends com.google.v.du<dv, du> implements com.google.v.fj {
    private static final dv DEFAULT_INSTANCE;
    public static final int FEATURE_BIRTH_TIMESTAMP_US_FIELD_NUMBER = 1;
    public static final int LAST_MODIFICATION_TIMESTAMP_US_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<dv> PARSER = null;
    public static final int REMOVAL_TIMESTAMP_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long featureBirthTimestampUs_;
    private long lastModificationTimestampUs_;
    private long removalTimestampUs_;

    static {
        dv dvVar = new dv();
        DEFAULT_INSTANCE = dvVar;
        com.google.v.du.registerDefaultInstance(dv.class, dvVar);
    }

    private dv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureBirthTimestampUs() {
        this.bitField0_ &= -2;
        this.featureBirthTimestampUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastModificationTimestampUs() {
        this.bitField0_ &= -5;
        this.lastModificationTimestampUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemovalTimestampUs() {
        this.bitField0_ &= -3;
        this.removalTimestampUs_ = 0L;
    }

    public static dv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static du newBuilder() {
        return (du) DEFAULT_INSTANCE.createBuilder();
    }

    public static dv parseDelimitedFrom(InputStream inputStream) {
        return (dv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dv parseFrom(com.google.v.v vVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureBirthTimestampUs(long j2) {
        this.bitField0_ |= 1;
        this.featureBirthTimestampUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastModificationTimestampUs(long j2) {
        this.bitField0_ |= 4;
        this.lastModificationTimestampUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemovalTimestampUs(long j2) {
        this.bitField0_ |= 2;
        this.removalTimestampUs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "featureBirthTimestampUs_", "removalTimestampUs_", "lastModificationTimestampUs_"});
        }
        if (iOrdinal == 3) {
            return new dv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new du(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getFeatureBirthTimestampUs() {
        return this.featureBirthTimestampUs_;
    }

    public long getLastModificationTimestampUs() {
        return this.lastModificationTimestampUs_;
    }

    public long getRemovalTimestampUs() {
        return this.removalTimestampUs_;
    }

    public boolean hasFeatureBirthTimestampUs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLastModificationTimestampUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRemovalTimestampUs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static du newBuilder(dv dvVar) {
        return (du) DEFAULT_INSTANCE.createBuilder(dvVar);
    }

    public static dv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dv parseFrom(com.google.v.z zVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dv parseFrom(InputStream inputStream) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dv parseFrom(ByteBuffer byteBuffer) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dv parseFrom(byte[] bArr) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
