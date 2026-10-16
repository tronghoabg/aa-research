package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajj extends com.google.v.du<ajj, aji> implements com.google.v.fj {
    private static final ajj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajj> PARSER;

    static {
        ajj ajjVar = new ajj();
        DEFAULT_INSTANCE = ajjVar;
        com.google.v.du.registerDefaultInstance(ajj.class, ajjVar);
    }

    private ajj() {
    }

    public static ajj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aji newBuilder() {
        return (aji) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajj parseDelimitedFrom(InputStream inputStream) {
        return (ajj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajj parseFrom(com.google.v.v vVar) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajj> parser() {
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
            return new ajj();
        }
        if (iOrdinal == 4) {
            return new aji(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aji newBuilder(ajj ajjVar) {
        return (aji) DEFAULT_INSTANCE.createBuilder(ajjVar);
    }

    public static ajj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajj parseFrom(com.google.v.z zVar) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajj parseFrom(InputStream inputStream) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajj parseFrom(ByteBuffer byteBuffer) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajj parseFrom(byte[] bArr) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
