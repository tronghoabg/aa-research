package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afr extends com.google.v.du<afr, afq> implements com.google.v.fj {
    private static final afr DEFAULT_INSTANCE;
    public static final int ESTIMATED_ARRIVAL_TIMESTAMP_UNIX_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<afr> PARSER = null;
    public static final int TIME_TO_CROSS_SECONDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private long estimatedArrivalTimestampUnixSeconds_;
    private long timeToCrossSeconds_;

    static {
        afr afrVar = new afr();
        DEFAULT_INSTANCE = afrVar;
        com.google.v.du.registerDefaultInstance(afr.class, afrVar);
    }

    private afr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEstimatedArrivalTimestampUnixSeconds() {
        this.bitField0_ &= -2;
        this.estimatedArrivalTimestampUnixSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToCrossSeconds() {
        this.bitField0_ &= -3;
        this.timeToCrossSeconds_ = 0L;
    }

    public static afr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afq newBuilder() {
        return (afq) DEFAULT_INSTANCE.createBuilder();
    }

    public static afr parseDelimitedFrom(InputStream inputStream) {
        return (afr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afr parseFrom(com.google.v.v vVar) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEstimatedArrivalTimestampUnixSeconds(long j2) {
        this.bitField0_ |= 1;
        this.estimatedArrivalTimestampUnixSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToCrossSeconds(long j2) {
        this.bitField0_ |= 2;
        this.timeToCrossSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "estimatedArrivalTimestampUnixSeconds_", "timeToCrossSeconds_"});
        }
        if (iOrdinal == 3) {
            return new afr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEstimatedArrivalTimestampUnixSeconds() {
        return this.estimatedArrivalTimestampUnixSeconds_;
    }

    public long getTimeToCrossSeconds() {
        return this.timeToCrossSeconds_;
    }

    public boolean hasEstimatedArrivalTimestampUnixSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeToCrossSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public static afq newBuilder(afr afrVar) {
        return (afq) DEFAULT_INSTANCE.createBuilder(afrVar);
    }

    public static afr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afr parseFrom(com.google.v.z zVar) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afr parseFrom(InputStream inputStream) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afr parseFrom(ByteBuffer byteBuffer) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afr parseFrom(byte[] bArr) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
