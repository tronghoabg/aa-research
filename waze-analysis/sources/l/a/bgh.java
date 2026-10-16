package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgh extends com.google.v.du<bgh, bgg> implements com.google.v.fj {
    private static final bgh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bgh> PARSER;

    static {
        bgh bghVar = new bgh();
        DEFAULT_INSTANCE = bghVar;
        com.google.v.du.registerDefaultInstance(bgh.class, bghVar);
    }

    private bgh() {
    }

    public static bgh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bgg newBuilder() {
        return (bgg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgh parseDelimitedFrom(InputStream inputStream) {
        return (bgh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgh parseFrom(com.google.v.v vVar) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgh> parser() {
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
            return new bgh();
        }
        if (iOrdinal == 4) {
            return new bgg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bgg newBuilder(bgh bghVar) {
        return (bgg) DEFAULT_INSTANCE.createBuilder(bghVar);
    }

    public static bgh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgh parseFrom(com.google.v.z zVar) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgh parseFrom(InputStream inputStream) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgh parseFrom(ByteBuffer byteBuffer) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgh parseFrom(byte[] bArr) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
