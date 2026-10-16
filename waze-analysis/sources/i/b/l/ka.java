package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ka extends com.google.v.du<ka, jz> implements com.google.v.fj {
    private static final ka DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ka> PARSER;

    static {
        ka kaVar = new ka();
        DEFAULT_INSTANCE = kaVar;
        com.google.v.du.registerDefaultInstance(ka.class, kaVar);
    }

    private ka() {
    }

    public static ka getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jz newBuilder() {
        return (jz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ka parseDelimitedFrom(InputStream inputStream) {
        return (ka) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ka parseFrom(com.google.v.v vVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ka> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ka();
        }
        if (iOrdinal == 4) {
            return new jz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ka> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ka.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static jz newBuilder(ka kaVar) {
        return (jz) DEFAULT_INSTANCE.createBuilder(kaVar);
    }

    public static ka parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ka) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ka parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ka parseFrom(com.google.v.z zVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ka parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ka parseFrom(InputStream inputStream) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ka parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ka parseFrom(ByteBuffer byteBuffer) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ka parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ka parseFrom(byte[] bArr) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ka parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
