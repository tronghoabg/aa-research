package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jn extends com.google.v.du<jn, jm> implements com.google.v.fj {
    private static final jn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jn> PARSER;

    static {
        jn jnVar = new jn();
        DEFAULT_INSTANCE = jnVar;
        com.google.v.du.registerDefaultInstance(jn.class, jnVar);
    }

    private jn() {
    }

    public static jn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jm newBuilder() {
        return (jm) DEFAULT_INSTANCE.createBuilder();
    }

    public static jn parseDelimitedFrom(InputStream inputStream) {
        return (jn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jn parseFrom(com.google.v.v vVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jn> parser() {
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
            return new jn();
        }
        if (iOrdinal == 4) {
            return new jm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static jm newBuilder(jn jnVar) {
        return (jm) DEFAULT_INSTANCE.createBuilder(jnVar);
    }

    public static jn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jn parseFrom(com.google.v.z zVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jn parseFrom(InputStream inputStream) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jn parseFrom(ByteBuffer byteBuffer) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jn parseFrom(byte[] bArr) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
