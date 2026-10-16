package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axc extends com.google.v.du<axc, axb> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final axc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<axc> PARSER = null;
    public static final int SET_HOME_AVAILABLE_FIELD_NUMBER = 2;
    public static final int SET_WORK_AVAILABLE_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private boolean setHomeAvailable_;
    private boolean setWorkAvailable_;

    static {
        axc axcVar = new axc();
        DEFAULT_INSTANCE = axcVar;
        com.google.v.du.registerDefaultInstance(axc.class, axcVar);
    }

    private axc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetHomeAvailable() {
        this.bitField0_ &= -2;
        this.setHomeAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetWorkAvailable() {
        this.bitField0_ &= -3;
        this.setWorkAvailable_ = false;
    }

    public static axc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axb newBuilder() {
        return (axb) DEFAULT_INSTANCE.createBuilder();
    }

    public static axc parseDelimitedFrom(InputStream inputStream) {
        return (axc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axc parseFrom(com.google.v.v vVar) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(axa axaVar) {
        this.action_ = axaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetHomeAvailable(boolean z) {
        this.bitField0_ |= 1;
        this.setHomeAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetWorkAvailable(boolean z) {
        this.bitField0_ |= 2;
        this.setWorkAvailable_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"bitField0_", "action_", "setHomeAvailable_", "setWorkAvailable_"});
        }
        if (iOrdinal == 3) {
            return new axc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public axa getAction() {
        int i2 = this.action_;
        axa axaVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : axa.CANCEL : axa.SET_WORK : axa.SET_HOME : axa.SET_FAVORITE : axa.ACTION_UNSPECIFIED;
        return axaVar == null ? axa.UNRECOGNIZED : axaVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getSetHomeAvailable() {
        return this.setHomeAvailable_;
    }

    public boolean getSetWorkAvailable() {
        return this.setWorkAvailable_;
    }

    public boolean hasSetHomeAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSetWorkAvailable() {
        return (this.bitField0_ & 2) != 0;
    }

    public static axb newBuilder(axc axcVar) {
        return (axb) DEFAULT_INSTANCE.createBuilder(axcVar);
    }

    public static axc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axc parseFrom(com.google.v.z zVar) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axc parseFrom(InputStream inputStream) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axc parseFrom(ByteBuffer byteBuffer) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axc parseFrom(byte[] bArr) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
