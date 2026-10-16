package i.b.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fx extends com.google.v.du<fx, fw> implements com.google.v.fj {
    private static final fx DEFAULT_INSTANCE;
    public static final int FORCE_HOUSE_NUMBER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fx> PARSER;
    private int bitField0_;
    private boolean forceHouseNumber_;

    static {
        fx fxVar = new fx();
        DEFAULT_INSTANCE = fxVar;
        com.google.v.du.registerDefaultInstance(fx.class, fxVar);
    }

    private fx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceHouseNumber() {
        this.bitField0_ &= -2;
        this.forceHouseNumber_ = false;
    }

    public static fx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fw newBuilder() {
        return (fw) DEFAULT_INSTANCE.createBuilder();
    }

    public static fx parseDelimitedFrom(InputStream inputStream) {
        return (fx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fx parseFrom(com.google.v.v vVar) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceHouseNumber(boolean z) {
        this.bitField0_ |= 1;
        this.forceHouseNumber_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "forceHouseNumber_"});
        }
        if (iOrdinal == 3) {
            return new fx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new fw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getForceHouseNumber() {
        return this.forceHouseNumber_;
    }

    public boolean hasForceHouseNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fw newBuilder(fx fxVar) {
        return (fw) DEFAULT_INSTANCE.createBuilder(fxVar);
    }

    public static fx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fx parseFrom(com.google.v.z zVar) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fx parseFrom(InputStream inputStream) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fx parseFrom(ByteBuffer byteBuffer) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fx parseFrom(byte[] bArr) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
