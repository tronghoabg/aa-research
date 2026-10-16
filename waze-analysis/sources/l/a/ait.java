package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ait extends com.google.v.du<ait, ais> implements com.google.v.fj {
    private static final ait DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ait> PARSER;

    static {
        ait aitVar = new ait();
        DEFAULT_INSTANCE = aitVar;
        com.google.v.du.registerDefaultInstance(ait.class, aitVar);
    }

    private ait() {
    }

    public static ait getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ais newBuilder() {
        return (ais) DEFAULT_INSTANCE.createBuilder();
    }

    public static ait parseDelimitedFrom(InputStream inputStream) {
        return (ait) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ait parseFrom(com.google.v.v vVar) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ait> parser() {
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
            return new ait();
        }
        if (iOrdinal == 4) {
            return new ais(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ait> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ait.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ais newBuilder(ait aitVar) {
        return (ais) DEFAULT_INSTANCE.createBuilder(aitVar);
    }

    public static ait parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ait) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ait parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ait parseFrom(com.google.v.z zVar) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ait parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ait parseFrom(InputStream inputStream) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ait parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ait parseFrom(ByteBuffer byteBuffer) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ait parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ait parseFrom(byte[] bArr) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ait parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ait) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
