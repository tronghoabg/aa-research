package i.b.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes8.dex */
public final class ac extends com.google.v.du<ac, ab> implements ad {
    public static final int AVAILABLECOUNT_FIELD_NUMBER = 2;
    private static final ac DEFAULT_INSTANCE;
    public static final int EVCHARGINGTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ac> PARSER;
    private int availableCount_;
    private int bitField0_;
    private int evChargingType_;

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        com.google.v.du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableCount() {
        this.bitField0_ &= -3;
        this.availableCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvChargingType() {
        this.bitField0_ &= -2;
        this.evChargingType_ = 0;
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ab newBuilder() {
        return (ab) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableCount(int i2) {
        this.bitField0_ |= 2;
        this.availableCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvChargingType(aq aqVar) {
        this.evChargingType_ = aqVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"bitField0_", "evChargingType_", z.f49558e, "availableCount_"});
        }
        if (iOrdinal == 3) {
            return new ac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ab(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getAvailableCount() {
        return this.availableCount_;
    }

    public aq getEvChargingType() {
        aq aqVarA = aq.a(this.evChargingType_);
        return aqVarA == null ? aq.UNKNOWN : aqVarA;
    }

    public boolean hasAvailableCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEvChargingType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ab newBuilder(ac acVar) {
        return (ab) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ac) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
