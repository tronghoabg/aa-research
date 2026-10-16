package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fu extends com.google.v.du<fu, fs> implements com.google.v.fj {
    private static final fu DEFAULT_INSTANCE;
    public static final int HORIZONTAL_ACCURACY_METERS_FIELD_NUMBER = 4;
    public static final int METHOD_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fu> PARSER = null;
    public static final int VISIT_ARRIVAL_TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int VISIT_DEPARTURE_TIMESTAMP_MS_FIELD_NUMBER = 2;
    public static final int WAKEUP_SESSION_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private long horizontalAccuracyMeters_;
    private int method_;
    private long visitArrivalTimestampMs_;
    private long visitDepartureTimestampMs_;
    private long wakeupSessionId_;

    static {
        fu fuVar = new fu();
        DEFAULT_INSTANCE = fuVar;
        com.google.v.du.registerDefaultInstance(fu.class, fuVar);
    }

    private fu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorizontalAccuracyMeters() {
        this.bitField0_ &= -5;
        this.horizontalAccuracyMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisitArrivalTimestampMs() {
        this.bitField0_ &= -3;
        this.visitArrivalTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisitDepartureTimestampMs() {
        this.bitField0_ &= -2;
        this.visitDepartureTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWakeupSessionId() {
        this.bitField0_ &= -9;
        this.wakeupSessionId_ = 0L;
    }

    public static fu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fs newBuilder() {
        return (fs) DEFAULT_INSTANCE.createBuilder();
    }

    public static fu parseDelimitedFrom(InputStream inputStream) {
        return (fu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fu parseFrom(com.google.v.v vVar) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalAccuracyMeters(long j2) {
        this.bitField0_ |= 4;
        this.horizontalAccuracyMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(ft ftVar) {
        this.method_ = ftVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodValue(int i2) {
        this.method_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisitArrivalTimestampMs(long j2) {
        this.bitField0_ |= 2;
        this.visitArrivalTimestampMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisitDepartureTimestampMs(long j2) {
        this.bitField0_ |= 1;
        this.visitDepartureTimestampMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWakeupSessionId(long j2) {
        this.bitField0_ |= 8;
        this.wakeupSessionId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003", new Object[]{"bitField0_", "method_", "visitDepartureTimestampMs_", "visitArrivalTimestampMs_", "horizontalAccuracyMeters_", "wakeupSessionId_"});
        }
        if (iOrdinal == 3) {
            return new fu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters_;
    }

    public ft getMethod() {
        int i2 = this.method_;
        ft ftVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ft.OTHER : ft.SLC : ft.VISITS : ft.METHOD_UNSPECIFIED;
        return ftVar == null ? ft.UNRECOGNIZED : ftVar;
    }

    public int getMethodValue() {
        return this.method_;
    }

    public long getVisitArrivalTimestampMs() {
        return this.visitArrivalTimestampMs_;
    }

    public long getVisitDepartureTimestampMs() {
        return this.visitDepartureTimestampMs_;
    }

    public long getWakeupSessionId() {
        return this.wakeupSessionId_;
    }

    public boolean hasHorizontalAccuracyMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVisitArrivalTimestampMs() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVisitDepartureTimestampMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWakeupSessionId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static fs newBuilder(fu fuVar) {
        return (fs) DEFAULT_INSTANCE.createBuilder(fuVar);
    }

    public static fu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fu parseFrom(com.google.v.z zVar) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fu parseFrom(InputStream inputStream) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fu parseFrom(ByteBuffer byteBuffer) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fu parseFrom(byte[] bArr) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
