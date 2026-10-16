package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class btc extends com.google.v.du<btc, btb> implements com.google.v.fj {
    private static final btc DEFAULT_INSTANCE;
    public static final int ELIGIBLE_TAKEOVERS_COUNT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<btc> PARSER;
    private int bitField0_;
    private long eligibleTakeoversCount_;

    static {
        btc btcVar = new btc();
        DEFAULT_INSTANCE = btcVar;
        com.google.v.du.registerDefaultInstance(btc.class, btcVar);
    }

    private btc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligibleTakeoversCount() {
        this.bitField0_ &= -2;
        this.eligibleTakeoversCount_ = 0L;
    }

    public static btc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static btb newBuilder() {
        return (btb) DEFAULT_INSTANCE.createBuilder();
    }

    public static btc parseDelimitedFrom(InputStream inputStream) {
        return (btc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static btc parseFrom(com.google.v.v vVar) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<btc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligibleTakeoversCount(long j2) {
        this.bitField0_ |= 1;
        this.eligibleTakeoversCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "eligibleTakeoversCount_"});
        }
        if (iOrdinal == 3) {
            return new btc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new btb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<btc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (btc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEligibleTakeoversCount() {
        return this.eligibleTakeoversCount_;
    }

    public boolean hasEligibleTakeoversCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static btb newBuilder(btc btcVar) {
        return (btb) DEFAULT_INSTANCE.createBuilder(btcVar);
    }

    public static btc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (btc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static btc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static btc parseFrom(com.google.v.z zVar) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static btc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static btc parseFrom(InputStream inputStream) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static btc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static btc parseFrom(ByteBuffer byteBuffer) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static btc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static btc parseFrom(byte[] bArr) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static btc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (btc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
