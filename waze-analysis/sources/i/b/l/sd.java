package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sd extends com.google.v.du<sd, sa> implements se {
    public static final int CAUSINGALERTID_FIELD_NUMBER = 5;
    public static final int CAUSINGALERTINDEX_FIELD_NUMBER = 2;
    public static final int CAUSINGOFFROUTEALERTINDEX_FIELD_NUMBER = 3;
    private static final sd DEFAULT_INSTANCE;
    public static final int IRREGULAREVENTID_FIELD_NUMBER = 4;
    public static final int IRREGULAREVENTINDEX_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<sd> PARSER;
    private int bitField0_;
    private Object cause_;
    private long causingAlertId_;
    private Object insight_;
    private long irregularEventId_;
    private int insightCase_ = 0;
    private int causeCase_ = 0;

    static {
        sd sdVar = new sd();
        DEFAULT_INSTANCE = sdVar;
        com.google.v.du.registerDefaultInstance(sd.class, sdVar);
    }

    private sd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCause() {
        this.causeCase_ = 0;
        this.cause_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCausingAlertId() {
        this.bitField0_ &= -3;
        this.causingAlertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCausingAlertIndex() {
        if (this.causeCase_ == 2) {
            this.causeCase_ = 0;
            this.cause_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCausingOffRouteAlertIndex() {
        if (this.causeCase_ == 3) {
            this.causeCase_ = 0;
            this.cause_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsight() {
        this.insightCase_ = 0;
        this.insight_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIrregularEventId() {
        this.bitField0_ &= -2;
        this.irregularEventId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIrregularEventIndex() {
        if (this.insightCase_ == 1) {
            this.insightCase_ = 0;
            this.insight_ = null;
        }
    }

    public static sd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sa newBuilder() {
        return (sa) DEFAULT_INSTANCE.createBuilder();
    }

    public static sd parseDelimitedFrom(InputStream inputStream) {
        return (sd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sd parseFrom(com.google.v.v vVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCausingAlertId(long j2) {
        this.bitField0_ |= 2;
        this.causingAlertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCausingAlertIndex(int i2) {
        this.causeCase_ = 2;
        this.cause_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCausingOffRouteAlertIndex(int i2) {
        this.causeCase_ = 3;
        this.cause_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIrregularEventId(long j2) {
        this.bitField0_ |= 1;
        this.irregularEventId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIrregularEventIndex(int i2) {
        this.insightCase_ = 1;
        this.insight_ = Integer.valueOf(i2);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0002\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u00017\u0000\u00027\u0001\u00037\u0001\u0004ဂ\u0000\u0005ဂ\u0001", new Object[]{"insight_", "insightCase_", "cause_", "causeCase_", "bitField0_", "irregularEventId_", "causingAlertId_"});
        }
        if (iOrdinal == 3) {
            return new sd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sb getCauseCase() {
        int i2 = this.causeCase_;
        if (i2 == 0) {
            return sb.f49029c;
        }
        if (i2 == 2) {
            return sb.f49027a;
        }
        if (i2 != 3) {
            return null;
        }
        return sb.f49028b;
    }

    public long getCausingAlertId() {
        return this.causingAlertId_;
    }

    public int getCausingAlertIndex() {
        if (this.causeCase_ == 2) {
            return ((Integer) this.cause_).intValue();
        }
        return 0;
    }

    public int getCausingOffRouteAlertIndex() {
        if (this.causeCase_ == 3) {
            return ((Integer) this.cause_).intValue();
        }
        return 0;
    }

    public sc getInsightCase() {
        int i2 = this.insightCase_;
        if (i2 == 0) {
            return sc.f49032b;
        }
        if (i2 != 1) {
            return null;
        }
        return sc.f49031a;
    }

    public long getIrregularEventId() {
        return this.irregularEventId_;
    }

    public int getIrregularEventIndex() {
        if (this.insightCase_ == 1) {
            return ((Integer) this.insight_).intValue();
        }
        return 0;
    }

    public boolean hasCausingAlertId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCausingAlertIndex() {
        return this.causeCase_ == 2;
    }

    public boolean hasCausingOffRouteAlertIndex() {
        return this.causeCase_ == 3;
    }

    public boolean hasIrregularEventId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIrregularEventIndex() {
        return this.insightCase_ == 1;
    }

    public static sa newBuilder(sd sdVar) {
        return (sa) DEFAULT_INSTANCE.createBuilder(sdVar);
    }

    public static sd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sd parseFrom(com.google.v.z zVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sd parseFrom(InputStream inputStream) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sd parseFrom(ByteBuffer byteBuffer) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sd parseFrom(byte[] bArr) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
