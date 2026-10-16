package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class tv extends com.google.v.du<tv, tu> implements com.google.v.fj {
    private static final tv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<tv> PARSER;

    static {
        tv tvVar = new tv();
        DEFAULT_INSTANCE = tvVar;
        com.google.v.du.registerDefaultInstance(tv.class, tvVar);
    }

    private tv() {
    }

    public static tv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tu newBuilder() {
        return (tu) DEFAULT_INSTANCE.createBuilder();
    }

    public static tv parseDelimitedFrom(InputStream inputStream) {
        return (tv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tv parseFrom(com.google.v.v vVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tv> parser() {
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
            return new tv();
        }
        if (iOrdinal == 4) {
            return new tu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static tu newBuilder(tv tvVar) {
        return (tu) DEFAULT_INSTANCE.createBuilder(tvVar);
    }

    public static tv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tv parseFrom(com.google.v.z zVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tv parseFrom(InputStream inputStream) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tv parseFrom(ByteBuffer byteBuffer) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tv parseFrom(byte[] bArr) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
