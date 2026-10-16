package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class air extends com.google.v.du<air, aiq> implements com.google.v.fj {
    private static final air DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<air> PARSER;

    static {
        air airVar = new air();
        DEFAULT_INSTANCE = airVar;
        com.google.v.du.registerDefaultInstance(air.class, airVar);
    }

    private air() {
    }

    public static air getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aiq newBuilder() {
        return (aiq) DEFAULT_INSTANCE.createBuilder();
    }

    public static air parseDelimitedFrom(InputStream inputStream) {
        return (air) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static air parseFrom(com.google.v.v vVar) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<air> parser() {
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
            return new air();
        }
        if (iOrdinal == 4) {
            return new aiq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<air> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (air.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aiq newBuilder(air airVar) {
        return (aiq) DEFAULT_INSTANCE.createBuilder(airVar);
    }

    public static air parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (air) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static air parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static air parseFrom(com.google.v.z zVar) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static air parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static air parseFrom(InputStream inputStream) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static air parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static air parseFrom(ByteBuffer byteBuffer) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static air parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static air parseFrom(byte[] bArr) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static air parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (air) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
