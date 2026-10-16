package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class arh extends com.google.v.du<arh, arg> implements com.google.v.fj {
    private static final arh DEFAULT_INSTANCE;
    public static final int ELIGIBLE_STOPS_COUNT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<arh> PARSER = null;
    public static final int STOPS_SHOWN_COUNT_FIELD_NUMBER = 2;
    private int bitField0_;
    private long eligibleStopsCount_;
    private long stopsShownCount_;

    static {
        arh arhVar = new arh();
        DEFAULT_INSTANCE = arhVar;
        com.google.v.du.registerDefaultInstance(arh.class, arhVar);
    }

    private arh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEligibleStopsCount() {
        this.bitField0_ &= -2;
        this.eligibleStopsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStopsShownCount() {
        this.bitField0_ &= -3;
        this.stopsShownCount_ = 0L;
    }

    public static arh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static arg newBuilder() {
        return (arg) DEFAULT_INSTANCE.createBuilder();
    }

    public static arh parseDelimitedFrom(InputStream inputStream) {
        return (arh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arh parseFrom(com.google.v.v vVar) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<arh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEligibleStopsCount(long j2) {
        this.bitField0_ |= 1;
        this.eligibleStopsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStopsShownCount(long j2) {
        this.bitField0_ |= 2;
        this.stopsShownCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "eligibleStopsCount_", "stopsShownCount_"});
        }
        if (iOrdinal == 3) {
            return new arh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new arg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<arh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (arh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getEligibleStopsCount() {
        return this.eligibleStopsCount_;
    }

    public long getStopsShownCount() {
        return this.stopsShownCount_;
    }

    public boolean hasEligibleStopsCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStopsShownCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static arg newBuilder(arh arhVar) {
        return (arg) DEFAULT_INSTANCE.createBuilder(arhVar);
    }

    public static arh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static arh parseFrom(com.google.v.z zVar) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static arh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static arh parseFrom(InputStream inputStream) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static arh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static arh parseFrom(ByteBuffer byteBuffer) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static arh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static arh parseFrom(byte[] bArr) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static arh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (arh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
