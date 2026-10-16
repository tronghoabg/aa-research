package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class anp extends com.google.v.du<anp, ann> implements com.google.v.fj {
    private static final anp DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<anp> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private long errorCode_;
    private int reason_;

    static {
        anp anpVar = new anp();
        DEFAULT_INSTANCE = anpVar;
        com.google.v.du.registerDefaultInstance(anp.class, anpVar);
    }

    private anp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.bitField0_ &= -2;
        this.errorCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static anp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ann newBuilder() {
        return (ann) DEFAULT_INSTANCE.createBuilder();
    }

    public static anp parseDelimitedFrom(InputStream inputStream) {
        return (anp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anp parseFrom(com.google.v.v vVar) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<anp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(long j2) {
        this.bitField0_ |= 1;
        this.errorCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(ano anoVar) {
        this.reason_ = anoVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002\f", new Object[]{"bitField0_", "errorCode_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new anp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ann(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<anp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (anp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getErrorCode() {
        return this.errorCode_;
    }

    public ano getReason() {
        ano anoVar;
        switch (this.reason_) {
            case 0:
                anoVar = ano.REASON_UNSPECIFIED;
                break;
            case 1:
                anoVar = ano.CAR_WASH;
                break;
            case 2:
                anoVar = ano.CHARGING_STATION;
                break;
            case 3:
                anoVar = ano.GAS_STATION;
                break;
            case 4:
                anoVar = ano.PARKING_LOT;
                break;
            case 5:
                anoVar = ano.HOME;
                break;
            case 6:
                anoVar = ano.WORK;
                break;
            case 7:
                anoVar = ano.NO_RESULTS;
                break;
            case 8:
                anoVar = ano.NETWORK_ERROR;
                break;
            default:
                anoVar = null;
                break;
        }
        return anoVar == null ? ano.UNRECOGNIZED : anoVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ann newBuilder(anp anpVar) {
        return (ann) DEFAULT_INSTANCE.createBuilder(anpVar);
    }

    public static anp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static anp parseFrom(com.google.v.z zVar) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static anp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static anp parseFrom(InputStream inputStream) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static anp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static anp parseFrom(ByteBuffer byteBuffer) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static anp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static anp parseFrom(byte[] bArr) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static anp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (anp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
