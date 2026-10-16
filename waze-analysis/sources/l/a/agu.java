package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class agu extends com.google.v.du<agu, agt> implements com.google.v.fj {
    private static final agu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<agu> PARSER = null;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
    private int requestType_;

    static {
        agu aguVar = new agu();
        DEFAULT_INSTANCE = aguVar;
        com.google.v.du.registerDefaultInstance(agu.class, aguVar);
    }

    private agu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestType() {
        this.requestType_ = 0;
    }

    public static agu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static agt newBuilder() {
        return (agt) DEFAULT_INSTANCE.createBuilder();
    }

    public static agu parseDelimitedFrom(InputStream inputStream) {
        return (agu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agu parseFrom(com.google.v.v vVar) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<agu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestType(agv agvVar) {
        this.requestType_ = agvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeValue(int i2) {
        this.requestType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"requestType_"});
        }
        if (iOrdinal == 3) {
            return new agu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new agt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<agu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (agu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public agv getRequestType() {
        agv agvVarA = agv.a(this.requestType_);
        return agvVarA == null ? agv.UNRECOGNIZED : agvVarA;
    }

    public int getRequestTypeValue() {
        return this.requestType_;
    }

    public static agt newBuilder(agu aguVar) {
        return (agt) DEFAULT_INSTANCE.createBuilder(aguVar);
    }

    public static agu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static agu parseFrom(com.google.v.z zVar) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static agu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static agu parseFrom(InputStream inputStream) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static agu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static agu parseFrom(ByteBuffer byteBuffer) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static agu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static agu parseFrom(byte[] bArr) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static agu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (agu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
