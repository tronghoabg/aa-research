package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ht extends com.google.v.du<ht, hs> implements com.google.v.fj {
    private static final ht DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ht> PARSER;

    static {
        ht htVar = new ht();
        DEFAULT_INSTANCE = htVar;
        com.google.v.du.registerDefaultInstance(ht.class, htVar);
    }

    private ht() {
    }

    public static ht getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hs newBuilder() {
        return (hs) DEFAULT_INSTANCE.createBuilder();
    }

    public static ht parseDelimitedFrom(InputStream inputStream) {
        return (ht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ht parseFrom(com.google.v.v vVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ht> parser() {
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
            return new ht();
        }
        if (iOrdinal == 4) {
            return new hs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ht> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ht.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static hs newBuilder(ht htVar) {
        return (hs) DEFAULT_INSTANCE.createBuilder(htVar);
    }

    public static ht parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ht) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ht parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ht parseFrom(com.google.v.z zVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ht parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ht parseFrom(InputStream inputStream) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ht parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ht parseFrom(ByteBuffer byteBuffer) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ht parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ht parseFrom(byte[] bArr) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ht parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ht) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
