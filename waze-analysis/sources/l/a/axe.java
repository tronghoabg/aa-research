package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class axe extends com.google.v.du<axe, axd> implements com.google.v.fj {
    private static final axe DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<axe> PARSER = null;
    public static final int SET_HOME_AVAILABLE_FIELD_NUMBER = 1;
    public static final int SET_WORK_AVAILABLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean setHomeAvailable_;
    private boolean setWorkAvailable_;

    static {
        axe axeVar = new axe();
        DEFAULT_INSTANCE = axeVar;
        com.google.v.du.registerDefaultInstance(axe.class, axeVar);
    }

    private axe() {
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

    public static axe getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static axd newBuilder() {
        return (axd) DEFAULT_INSTANCE.createBuilder();
    }

    public static axe parseDelimitedFrom(InputStream inputStream) {
        return (axe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axe parseFrom(com.google.v.v vVar) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<axe> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "setHomeAvailable_", "setWorkAvailable_"});
        }
        if (iOrdinal == 3) {
            return new axe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new axd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<axe> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (axe.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
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

    public static axd newBuilder(axe axeVar) {
        return (axd) DEFAULT_INSTANCE.createBuilder(axeVar);
    }

    public static axe parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axe) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axe parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static axe parseFrom(com.google.v.z zVar) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static axe parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static axe parseFrom(InputStream inputStream) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static axe parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static axe parseFrom(ByteBuffer byteBuffer) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static axe parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static axe parseFrom(byte[] bArr) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static axe parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (axe) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
