package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aft extends com.google.v.du<aft, afs> implements com.google.v.fj {
    private static final aft DEFAULT_INSTANCE;
    public static final int ESTIMATED_ARRIVAL_TIMESTAMP_UNIX_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aft> PARSER;
    private int bitField0_;
    private long estimatedArrivalTimestampUnixSeconds_;

    static {
        aft aftVar = new aft();
        DEFAULT_INSTANCE = aftVar;
        com.google.v.du.registerDefaultInstance(aft.class, aftVar);
    }

    private aft() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEstimatedArrivalTimestampUnixSeconds() {
        this.bitField0_ &= -2;
        this.estimatedArrivalTimestampUnixSeconds_ = 0L;
    }

    public static aft getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afs newBuilder() {
        return (afs) DEFAULT_INSTANCE.createBuilder();
    }

    public static aft parseDelimitedFrom(InputStream inputStream) {
        return (aft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aft parseFrom(com.google.v.v vVar) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aft> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEstimatedArrivalTimestampUnixSeconds(long j2) {
        this.bitField0_ |= 1;
        this.estimatedArrivalTimestampUnixSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "estimatedArrivalTimestampUnixSeconds_"});
        }
        if (iOrdinal == 3) {
            return new aft();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aft> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aft.class) {
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

    public boolean hasEstimatedArrivalTimestampUnixSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static afs newBuilder(aft aftVar) {
        return (afs) DEFAULT_INSTANCE.createBuilder(aftVar);
    }

    public static aft parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aft) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aft parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aft parseFrom(com.google.v.z zVar) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aft parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aft parseFrom(InputStream inputStream) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aft parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aft parseFrom(ByteBuffer byteBuffer) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aft parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aft parseFrom(byte[] bArr) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aft parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aft) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
