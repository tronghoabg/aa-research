package i.b.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes8.dex */
public final class aj extends com.google.v.du<aj, ai> implements ak {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final aj DEFAULT_INSTANCE;
    public static final int EVCHARGINGTYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aj> PARSER;
    private int bitField0_;
    private int count_;
    private int evChargingType_;

    static {
        aj ajVar = new aj();
        DEFAULT_INSTANCE = ajVar;
        com.google.v.du.registerDefaultInstance(aj.class, ajVar);
    }

    private aj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.bitField0_ &= -3;
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvChargingType() {
        this.bitField0_ &= -2;
        this.evChargingType_ = 0;
    }

    public static aj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ai newBuilder() {
        return (ai) DEFAULT_INSTANCE.createBuilder();
    }

    public static aj parseDelimitedFrom(InputStream inputStream) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(com.google.v.v vVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i2) {
        this.bitField0_ |= 2;
        this.count_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"bitField0_", "evChargingType_", z.f49558e, "count_"});
        }
        if (iOrdinal == 3) {
            return new aj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ai(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCount() {
        return this.count_;
    }

    public aq getEvChargingType() {
        aq aqVarA = aq.a(this.evChargingType_);
        return aqVarA == null ? aq.UNKNOWN : aqVarA;
    }

    public boolean hasCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEvChargingType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ai newBuilder(aj ajVar) {
        return (ai) DEFAULT_INSTANCE.createBuilder(ajVar);
    }

    public static aj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aj parseFrom(com.google.v.z zVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aj parseFrom(InputStream inputStream) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aj parseFrom(ByteBuffer byteBuffer) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aj parseFrom(byte[] bArr) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
