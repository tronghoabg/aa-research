package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aql extends com.google.v.du<aql, aqk> implements com.google.v.fj {
    private static final aql DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aql> PARSER = null;
    public static final int PIN_TYPE_FIELD_NUMBER = 2;
    public static final int TOOLTIP_FIELD_NUMBER = 1;
    private int bitField0_;
    private int pinType_;
    private boolean tooltip_;

    static {
        aql aqlVar = new aql();
        DEFAULT_INSTANCE = aqlVar;
        com.google.v.du.registerDefaultInstance(aql.class, aqlVar);
    }

    private aql() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinType() {
        this.pinType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTooltip() {
        this.bitField0_ &= -2;
        this.tooltip_ = false;
    }

    public static aql getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aqk newBuilder() {
        return (aqk) DEFAULT_INSTANCE.createBuilder();
    }

    public static aql parseDelimitedFrom(InputStream inputStream) {
        return (aql) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aql parseFrom(com.google.v.v vVar) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aql> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinType(aqp aqpVar) {
        this.pinType_ = aqpVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinTypeValue(int i2) {
        this.pinType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTooltip(boolean z) {
        this.bitField0_ |= 1;
        this.tooltip_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002\f", new Object[]{"bitField0_", "tooltip_", "pinType_"});
        }
        if (iOrdinal == 3) {
            return new aql();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aql> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aql.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aqp getPinType() {
        aqp aqpVarA = aqp.a(this.pinType_);
        return aqpVarA == null ? aqp.UNRECOGNIZED : aqpVarA;
    }

    public int getPinTypeValue() {
        return this.pinType_;
    }

    public boolean getTooltip() {
        return this.tooltip_;
    }

    public boolean hasTooltip() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aqk newBuilder(aql aqlVar) {
        return (aqk) DEFAULT_INSTANCE.createBuilder(aqlVar);
    }

    public static aql parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aql) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aql parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aql parseFrom(com.google.v.z zVar) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aql parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aql parseFrom(InputStream inputStream) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aql parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aql parseFrom(ByteBuffer byteBuffer) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aql parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aql parseFrom(byte[] bArr) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aql parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
