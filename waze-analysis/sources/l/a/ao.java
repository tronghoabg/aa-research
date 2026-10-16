package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ao extends com.google.v.du<ao, an> implements com.google.v.fj {
    private static final ao DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ao> PARSER;

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        com.google.v.du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
    }

    public static ao getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(com.google.v.v vVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ao> parser() {
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
            return new ao();
        }
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ao> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ao.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static an newBuilder(ao aoVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(com.google.v.z zVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ao) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
