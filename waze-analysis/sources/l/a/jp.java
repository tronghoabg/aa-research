package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jp extends com.google.v.du<jp, jo> implements com.google.v.fj {
    private static final jp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jp> PARSER;

    static {
        jp jpVar = new jp();
        DEFAULT_INSTANCE = jpVar;
        com.google.v.du.registerDefaultInstance(jp.class, jpVar);
    }

    private jp() {
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
            return new jp();
        }
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
