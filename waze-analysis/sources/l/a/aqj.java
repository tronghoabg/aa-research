package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aqj extends com.google.v.du<aqj, aqi> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final aqj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aqj> PARSER = null;
    public static final int PASS_TYPE_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private String passType_ = "";

    static {
        aqj aqjVar = new aqj();
        DEFAULT_INSTANCE = aqjVar;
        com.google.v.du.registerDefaultInstance(aqj.class, aqjVar);
    }

    private aqj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassType() {
        this.bitField0_ &= -2;
        this.passType_ = getDefaultInstance().getPassType();
    }

    public static aqj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aqi newBuilder() {
        return (aqi) DEFAULT_INSTANCE.createBuilder();
    }

    public static aqj parseDelimitedFrom(InputStream inputStream) {
        return (aqj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqj parseFrom(com.google.v.v vVar) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aqj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aqh aqhVar) {
        this.action_ = aqhVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.passType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassTypeBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.passType_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"bitField0_", "action_", "passType_"});
        }
        if (iOrdinal == 3) {
            return new aqj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aqi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aqj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aqj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aqh getAction() {
        int i2 = this.action_;
        aqh aqhVar = i2 != 0 ? i2 != 1 ? null : aqh.ADD_PASS : aqh.ACTION_UNSPECIFIED;
        return aqhVar == null ? aqh.UNRECOGNIZED : aqhVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getPassType() {
        return this.passType_;
    }

    public com.google.v.v getPassTypeBytes() {
        return com.google.v.v.s(this.passType_);
    }

    public boolean hasPassType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aqi newBuilder(aqj aqjVar) {
        return (aqi) DEFAULT_INSTANCE.createBuilder(aqjVar);
    }

    public static aqj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aqj parseFrom(com.google.v.z zVar) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aqj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aqj parseFrom(InputStream inputStream) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aqj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aqj parseFrom(ByteBuffer byteBuffer) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aqj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aqj parseFrom(byte[] bArr) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aqj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aqj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
