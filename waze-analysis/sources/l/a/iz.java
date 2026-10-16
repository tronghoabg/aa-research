package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class iz extends com.google.v.du<iz, iy> implements com.google.v.fj {
    private static final iz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<iz> PARSER;

    static {
        iz izVar = new iz();
        DEFAULT_INSTANCE = izVar;
        com.google.v.du.registerDefaultInstance(iz.class, izVar);
    }

    private iz() {
    }

    public static iz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static iy newBuilder() {
        return (iy) DEFAULT_INSTANCE.createBuilder();
    }

    public static iz parseDelimitedFrom(InputStream inputStream) {
        return (iz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iz parseFrom(com.google.v.v vVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iz> parser() {
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
            return new iz();
        }
        if (iOrdinal == 4) {
            return new iy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<iz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (iz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static iy newBuilder(iz izVar) {
        return (iy) DEFAULT_INSTANCE.createBuilder(izVar);
    }

    public static iz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iz parseFrom(com.google.v.z zVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static iz parseFrom(InputStream inputStream) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iz parseFrom(ByteBuffer byteBuffer) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iz parseFrom(byte[] bArr) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
