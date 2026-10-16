package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ag extends com.google.v.du<ag, af> implements ah {
    public static final int CONNECTOR_TYPE_FIELD_NUMBER = 2;
    private static final ag DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MAX_POWER_KW_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ag> PARSER;
    private int bitField0_;
    private int connectorType_;
    private String id_ = "";
    private float maxPowerKw_;

    static {
        ag agVar = new ag();
        DEFAULT_INSTANCE = agVar;
        com.google.v.du.registerDefaultInstance(ag.class, agVar);
    }

    private ag() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectorType() {
        this.bitField0_ &= -3;
        this.connectorType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPowerKw() {
        this.bitField0_ &= -5;
        this.maxPowerKw_ = 0.0f;
    }

    public static ag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static af newBuilder() {
        return (af) DEFAULT_INSTANCE.createBuilder();
    }

    public static ag parseDelimitedFrom(InputStream inputStream) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(com.google.v.v vVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectorType(aq aqVar) {
        this.connectorType_ = aqVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPowerKw(float f2) {
        this.bitField0_ |= 4;
        this.maxPowerKw_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ခ\u0002", new Object[]{"bitField0_", "id_", "connectorType_", z.f49558e, "maxPowerKw_"});
        }
        if (iOrdinal == 3) {
            return new ag();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new af(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ag> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ag.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aq getConnectorType() {
        aq aqVarA = aq.a(this.connectorType_);
        return aqVarA == null ? aq.UNKNOWN : aqVarA;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
    }

    public float getMaxPowerKw() {
        return this.maxPowerKw_;
    }

    public boolean hasConnectorType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMaxPowerKw() {
        return (this.bitField0_ & 4) != 0;
    }

    public static af newBuilder(ag agVar) {
        return (af) DEFAULT_INSTANCE.createBuilder(agVar);
    }

    public static ag parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ag) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ag parseFrom(com.google.v.z zVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ag parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ag parseFrom(InputStream inputStream) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ag parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ag parseFrom(ByteBuffer byteBuffer) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ag parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ag parseFrom(byte[] bArr) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ag parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ag) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
