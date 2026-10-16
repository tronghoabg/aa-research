package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ia extends com.google.v.du<ia, hz> implements com.google.v.fj {
    public static final int BEACONS_AROUND_FIELD_NUMBER = 1;
    private static final ia DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ia> PARSER;
    private boolean beaconsAround_;
    private int bitField0_;

    static {
        ia iaVar = new ia();
        DEFAULT_INSTANCE = iaVar;
        com.google.v.du.registerDefaultInstance(ia.class, iaVar);
    }

    private ia() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconsAround() {
        this.bitField0_ &= -2;
        this.beaconsAround_ = false;
    }

    public static ia getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hz newBuilder() {
        return (hz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ia parseDelimitedFrom(InputStream inputStream) {
        return (ia) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ia parseFrom(com.google.v.v vVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ia> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconsAround(boolean z) {
        this.bitField0_ |= 1;
        this.beaconsAround_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "beaconsAround_"});
        }
        if (iOrdinal == 3) {
            return new ia();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ia> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ia.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBeaconsAround() {
        return this.beaconsAround_;
    }

    public boolean hasBeaconsAround() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hz newBuilder(ia iaVar) {
        return (hz) DEFAULT_INSTANCE.createBuilder(iaVar);
    }

    public static ia parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ia) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ia parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ia parseFrom(com.google.v.z zVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ia parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ia parseFrom(InputStream inputStream) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ia parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ia parseFrom(ByteBuffer byteBuffer) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ia parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ia parseFrom(byte[] bArr) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ia parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
