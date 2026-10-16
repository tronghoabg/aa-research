package i.b.v;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class bl extends com.google.v.du<bl, bk> implements com.google.v.fj {
    private static final bl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bl> PARSER;

    static {
        bl blVar = new bl();
        DEFAULT_INSTANCE = blVar;
        com.google.v.du.registerDefaultInstance(bl.class, blVar);
    }

    private bl() {
    }

    public static bl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bk newBuilder() {
        return (bk) DEFAULT_INSTANCE.createBuilder();
    }

    public static bl parseDelimitedFrom(InputStream inputStream) {
        return (bl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bl parseFrom(com.google.v.v vVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bl> parser() {
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
            return new bl();
        }
        if (iOrdinal == 4) {
            return new bk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bk newBuilder(bl blVar) {
        return (bk) DEFAULT_INSTANCE.createBuilder(blVar);
    }

    public static bl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bl parseFrom(com.google.v.z zVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bl parseFrom(InputStream inputStream) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bl parseFrom(ByteBuffer byteBuffer) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bl parseFrom(byte[] bArr) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
