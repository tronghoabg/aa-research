package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aoq extends com.google.v.du<aoq, aop> implements com.google.v.fj {
    private static final aoq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aoq> PARSER;

    static {
        aoq aoqVar = new aoq();
        DEFAULT_INSTANCE = aoqVar;
        com.google.v.du.registerDefaultInstance(aoq.class, aoqVar);
    }

    private aoq() {
    }

    public static aoq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aop newBuilder() {
        return (aop) DEFAULT_INSTANCE.createBuilder();
    }

    public static aoq parseDelimitedFrom(InputStream inputStream) {
        return (aoq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aoq parseFrom(com.google.v.v vVar) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aoq> parser() {
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
            return new aoq();
        }
        if (iOrdinal == 4) {
            return new aop(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aoq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aoq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aop newBuilder(aoq aoqVar) {
        return (aop) DEFAULT_INSTANCE.createBuilder(aoqVar);
    }

    public static aoq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aoq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aoq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aoq parseFrom(com.google.v.z zVar) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aoq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aoq parseFrom(InputStream inputStream) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aoq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aoq parseFrom(ByteBuffer byteBuffer) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aoq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aoq parseFrom(byte[] bArr) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aoq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aoq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
