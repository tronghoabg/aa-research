package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nd extends com.google.v.du<nd, nc> implements com.google.v.fj {
    public static final int ARRIVAL_EPOCH_SECONDS_FIELD_NUMBER = 2;
    private static final nd DEFAULT_INSTANCE;
    public static final int DEPARTURE_EPOCH_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<nd> PARSER;
    private long arrivalEpochSeconds_;
    private int bitField0_;
    private long departureEpochSeconds_;

    static {
        nd ndVar = new nd();
        DEFAULT_INSTANCE = ndVar;
        com.google.v.du.registerDefaultInstance(nd.class, ndVar);
    }

    private nd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrivalEpochSeconds() {
        this.bitField0_ &= -3;
        this.arrivalEpochSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepartureEpochSeconds() {
        this.bitField0_ &= -2;
        this.departureEpochSeconds_ = 0L;
    }

    public static nd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nc newBuilder() {
        return (nc) DEFAULT_INSTANCE.createBuilder();
    }

    public static nd parseDelimitedFrom(InputStream inputStream) {
        return (nd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nd parseFrom(com.google.v.v vVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrivalEpochSeconds(long j2) {
        this.bitField0_ |= 2;
        this.arrivalEpochSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepartureEpochSeconds(long j2) {
        this.bitField0_ |= 1;
        this.departureEpochSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "departureEpochSeconds_", "arrivalEpochSeconds_"});
        }
        if (iOrdinal == 3) {
            return new nd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getArrivalEpochSeconds() {
        return this.arrivalEpochSeconds_;
    }

    public long getDepartureEpochSeconds() {
        return this.departureEpochSeconds_;
    }

    public boolean hasArrivalEpochSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDepartureEpochSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nc newBuilder(nd ndVar) {
        return (nc) DEFAULT_INSTANCE.createBuilder(ndVar);
    }

    public static nd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nd parseFrom(com.google.v.z zVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nd parseFrom(InputStream inputStream) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nd parseFrom(ByteBuffer byteBuffer) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nd parseFrom(byte[] bArr) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
