package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class io extends com.google.v.du<io, in> implements com.google.v.fj {
    private static final io DEFAULT_INSTANCE;
    public static final int IS_SHORT_TIMEOUT_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<io> PARSER;
    private int bitField0_;
    private boolean isShortTimeout_;

    static {
        io ioVar = new io();
        DEFAULT_INSTANCE = ioVar;
        com.google.v.du.registerDefaultInstance(io.class, ioVar);
    }

    private io() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsShortTimeout() {
        this.bitField0_ &= -2;
        this.isShortTimeout_ = false;
    }

    public static io getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static in newBuilder() {
        return (in) DEFAULT_INSTANCE.createBuilder();
    }

    public static io parseDelimitedFrom(InputStream inputStream) {
        return (io) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static io parseFrom(com.google.v.v vVar) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<io> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsShortTimeout(boolean z) {
        this.bitField0_ |= 1;
        this.isShortTimeout_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isShortTimeout_"});
        }
        if (iOrdinal == 3) {
            return new io();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new in(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<io> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (io.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsShortTimeout() {
        return this.isShortTimeout_;
    }

    public boolean hasIsShortTimeout() {
        return (this.bitField0_ & 1) != 0;
    }

    public static in newBuilder(io ioVar) {
        return (in) DEFAULT_INSTANCE.createBuilder(ioVar);
    }

    public static io parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (io) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static io parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static io parseFrom(com.google.v.z zVar) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static io parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static io parseFrom(InputStream inputStream) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static io parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static io parseFrom(ByteBuffer byteBuffer) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static io parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static io parseFrom(byte[] bArr) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static io parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (io) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
