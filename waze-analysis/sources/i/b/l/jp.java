package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class jp extends com.google.v.du<jp, jo> implements com.google.v.fj {
    private static final jp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jp> PARSER = null;
    public static final int SEE_ME_LEVEL_FIELD_NUMBER = 1;
    private int bitField0_;
    private int seeMeLevel_;

    static {
        jp jpVar = new jp();
        DEFAULT_INSTANCE = jpVar;
        com.google.v.du.registerDefaultInstance(jp.class, jpVar);
    }

    private jp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeeMeLevel() {
        this.bitField0_ &= -2;
        this.seeMeLevel_ = 0;
    }

    public static jp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jo newBuilder() {
        return (jo) DEFAULT_INSTANCE.createBuilder();
    }

    public static jp parseDelimitedFrom(InputStream inputStream) {
        return (jp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jp parseFrom(com.google.v.v vVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeeMeLevel(int i2) {
        this.bitField0_ |= 1;
        this.seeMeLevel_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "seeMeLevel_"});
        }
        if (iOrdinal == 3) {
            return new jp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getSeeMeLevel() {
        return this.seeMeLevel_;
    }

    public boolean hasSeeMeLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jo newBuilder(jp jpVar) {
        return (jo) DEFAULT_INSTANCE.createBuilder(jpVar);
    }

    public static jp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jp parseFrom(com.google.v.z zVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jp parseFrom(InputStream inputStream) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jp parseFrom(ByteBuffer byteBuffer) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jp parseFrom(byte[] bArr) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
