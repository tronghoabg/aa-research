package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ns extends com.google.v.du<ns, nr> implements com.google.v.fj {
    private static final ns DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ns> PARSER;

    static {
        ns nsVar = new ns();
        DEFAULT_INSTANCE = nsVar;
        com.google.v.du.registerDefaultInstance(ns.class, nsVar);
    }

    private ns() {
    }

    public static ns getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nr newBuilder() {
        return (nr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ns parseDelimitedFrom(InputStream inputStream) {
        return (ns) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ns parseFrom(com.google.v.v vVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ns> parser() {
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
            return new ns();
        }
        if (iOrdinal == 4) {
            return new nr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ns> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ns.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static nr newBuilder(ns nsVar) {
        return (nr) DEFAULT_INSTANCE.createBuilder(nsVar);
    }

    public static ns parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ns) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ns parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ns parseFrom(com.google.v.z zVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ns parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ns parseFrom(InputStream inputStream) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ns parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ns parseFrom(ByteBuffer byteBuffer) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ns parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ns parseFrom(byte[] bArr) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ns parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ns) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
