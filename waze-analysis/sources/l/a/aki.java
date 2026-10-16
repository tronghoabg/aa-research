package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aki extends com.google.v.du<aki, akh> implements com.google.v.fj {
    private static final aki DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aki> PARSER;

    static {
        aki akiVar = new aki();
        DEFAULT_INSTANCE = akiVar;
        com.google.v.du.registerDefaultInstance(aki.class, akiVar);
    }

    private aki() {
    }

    public static aki getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static akh newBuilder() {
        return (akh) DEFAULT_INSTANCE.createBuilder();
    }

    public static aki parseDelimitedFrom(InputStream inputStream) {
        return (aki) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aki parseFrom(com.google.v.v vVar) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aki> parser() {
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
            return new aki();
        }
        if (iOrdinal == 4) {
            return new akh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aki> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aki.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static akh newBuilder(aki akiVar) {
        return (akh) DEFAULT_INSTANCE.createBuilder(akiVar);
    }

    public static aki parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aki) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aki parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aki parseFrom(com.google.v.z zVar) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aki parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aki parseFrom(InputStream inputStream) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aki parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aki parseFrom(ByteBuffer byteBuffer) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aki parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aki parseFrom(byte[] bArr) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aki parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aki) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
