package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kg extends com.google.v.du<kg, kf> implements com.google.v.fj {
    public static final int ALERTER_TYPE_FIELD_NUMBER = 1;
    private static final kg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kg> PARSER = null;
    public static final int TIMEOUT_SECONDS_FIELD_NUMBER = 2;
    private int alerterType_;
    private int bitField0_;
    private long timeoutSeconds_;

    static {
        kg kgVar = new kg();
        DEFAULT_INSTANCE = kgVar;
        com.google.v.du.registerDefaultInstance(kg.class, kgVar);
    }

    private kg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterType() {
        this.alerterType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutSeconds() {
        this.bitField0_ &= -2;
        this.timeoutSeconds_ = 0L;
    }

    public static kg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kf newBuilder() {
        return (kf) DEFAULT_INSTANCE.createBuilder();
    }

    public static kg parseDelimitedFrom(InputStream inputStream) {
        return (kg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kg parseFrom(com.google.v.v vVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterType(ke keVar) {
        this.alerterType_ = keVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterTypeValue(int i2) {
        this.alerterType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutSeconds(long j2) {
        this.bitField0_ |= 1;
        this.timeoutSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000", new Object[]{"bitField0_", "alerterType_", "timeoutSeconds_"});
        }
        if (iOrdinal == 3) {
            return new kg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new kf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ke getAlerterType() {
        int i2 = this.alerterType_;
        ke keVar = i2 != 0 ? i2 != 1 ? null : ke.NO_NETWORK : ke.ALERTER_TYPE_UNSPECIFIED;
        return keVar == null ? ke.UNRECOGNIZED : keVar;
    }

    public int getAlerterTypeValue() {
        return this.alerterType_;
    }

    public long getTimeoutSeconds() {
        return this.timeoutSeconds_;
    }

    public boolean hasTimeoutSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static kf newBuilder(kg kgVar) {
        return (kf) DEFAULT_INSTANCE.createBuilder(kgVar);
    }

    public static kg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kg parseFrom(com.google.v.z zVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kg parseFrom(InputStream inputStream) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kg parseFrom(ByteBuffer byteBuffer) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kg parseFrom(byte[] bArr) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
