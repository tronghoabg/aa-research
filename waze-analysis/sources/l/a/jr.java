package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jr extends com.google.v.du<jr, jq> implements com.google.v.fj {
    private static final jr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jr> PARSER;

    static {
        jr jrVar = new jr();
        DEFAULT_INSTANCE = jrVar;
        com.google.v.du.registerDefaultInstance(jr.class, jrVar);
    }

    private jr() {
    }

    public static jr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jq newBuilder() {
        return (jq) DEFAULT_INSTANCE.createBuilder();
    }

    public static jr parseDelimitedFrom(InputStream inputStream) {
        return (jr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jr parseFrom(com.google.v.v vVar) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jr> parser() {
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
            return new jr();
        }
        if (iOrdinal == 4) {
            return new jq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static jq newBuilder(jr jrVar) {
        return (jq) DEFAULT_INSTANCE.createBuilder(jrVar);
    }

    public static jr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jr parseFrom(com.google.v.z zVar) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jr parseFrom(InputStream inputStream) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jr parseFrom(ByteBuffer byteBuffer) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jr parseFrom(byte[] bArr) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
