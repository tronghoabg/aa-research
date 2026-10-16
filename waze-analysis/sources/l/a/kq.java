package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kq extends com.google.v.du<kq, kp> implements com.google.v.fj {
    private static final kq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kq> PARSER;

    static {
        kq kqVar = new kq();
        DEFAULT_INSTANCE = kqVar;
        com.google.v.du.registerDefaultInstance(kq.class, kqVar);
    }

    private kq() {
    }

    public static kq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kp newBuilder() {
        return (kp) DEFAULT_INSTANCE.createBuilder();
    }

    public static kq parseDelimitedFrom(InputStream inputStream) {
        return (kq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kq parseFrom(com.google.v.v vVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new kq();
        }
        if (iOrdinal == 4) {
            return new kp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static kp newBuilder(kq kqVar) {
        return (kp) DEFAULT_INSTANCE.createBuilder(kqVar);
    }

    public static kq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kq parseFrom(com.google.v.z zVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kq parseFrom(InputStream inputStream) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kq parseFrom(ByteBuffer byteBuffer) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kq parseFrom(byte[] bArr) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
