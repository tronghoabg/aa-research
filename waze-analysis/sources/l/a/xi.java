package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xi extends com.google.v.du<xi, xh> implements com.google.v.fj {
    private static final xi DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<xi> PARSER;

    static {
        xi xiVar = new xi();
        DEFAULT_INSTANCE = xiVar;
        com.google.v.du.registerDefaultInstance(xi.class, xiVar);
    }

    private xi() {
    }

    public static xi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xh newBuilder() {
        return (xh) DEFAULT_INSTANCE.createBuilder();
    }

    public static xi parseDelimitedFrom(InputStream inputStream) {
        return (xi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xi parseFrom(com.google.v.v vVar) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xi> parser() {
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
            return new xi();
        }
        if (iOrdinal == 4) {
            return new xh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static xh newBuilder(xi xiVar) {
        return (xh) DEFAULT_INSTANCE.createBuilder(xiVar);
    }

    public static xi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xi parseFrom(com.google.v.z zVar) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xi parseFrom(InputStream inputStream) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xi parseFrom(ByteBuffer byteBuffer) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xi parseFrom(byte[] bArr) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
