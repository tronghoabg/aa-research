package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class va extends com.google.v.du<va, uz> implements com.google.v.fj {
    private static final va DEFAULT_INSTANCE;
    public static final int ETA_DELTA_MINUTES_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<va> PARSER = null;
    public static final int REMAINING_ETA_MINUTES_FIELD_NUMBER = 2;
    public static final int SEGMENT_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private long etaDeltaMinutes_;
    private long remainingEtaMinutes_;
    private long segmentId_;

    static {
        va vaVar = new va();
        DEFAULT_INSTANCE = vaVar;
        com.google.v.du.registerDefaultInstance(va.class, vaVar);
    }

    private va() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaDeltaMinutes() {
        this.bitField0_ &= -2;
        this.etaDeltaMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemainingEtaMinutes() {
        this.bitField0_ &= -3;
        this.remainingEtaMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.bitField0_ &= -5;
        this.segmentId_ = 0L;
    }

    public static va getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static uz newBuilder() {
        return (uz) DEFAULT_INSTANCE.createBuilder();
    }

    public static va parseDelimitedFrom(InputStream inputStream) {
        return (va) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static va parseFrom(com.google.v.v vVar) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<va> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaDeltaMinutes(long j2) {
        this.bitField0_ |= 1;
        this.etaDeltaMinutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemainingEtaMinutes(long j2) {
        this.bitField0_ |= 2;
        this.remainingEtaMinutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(long j2) {
        this.bitField0_ |= 4;
        this.segmentId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001တ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "etaDeltaMinutes_", "remainingEtaMinutes_", "segmentId_"});
        }
        if (iOrdinal == 3) {
            return new va();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new uz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<va> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (va.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEtaDeltaMinutes() {
        return this.etaDeltaMinutes_;
    }

    public long getRemainingEtaMinutes() {
        return this.remainingEtaMinutes_;
    }

    public long getSegmentId() {
        return this.segmentId_;
    }

    public boolean hasEtaDeltaMinutes() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRemainingEtaMinutes() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSegmentId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static uz newBuilder(va vaVar) {
        return (uz) DEFAULT_INSTANCE.createBuilder(vaVar);
    }

    public static va parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (va) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static va parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static va parseFrom(com.google.v.z zVar) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static va parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static va parseFrom(InputStream inputStream) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static va parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static va parseFrom(ByteBuffer byteBuffer) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static va parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static va parseFrom(byte[] bArr) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static va parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (va) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
