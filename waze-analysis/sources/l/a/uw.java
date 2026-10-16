package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class uw extends com.google.v.du<uw, uv> implements com.google.v.fj {
    private static final uw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<uw> PARSER;

    static {
        uw uwVar = new uw();
        DEFAULT_INSTANCE = uwVar;
        com.google.v.du.registerDefaultInstance(uw.class, uwVar);
    }

    private uw() {
    }

    public static uw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static uv newBuilder() {
        return (uv) DEFAULT_INSTANCE.createBuilder();
    }

    public static uw parseDelimitedFrom(InputStream inputStream) {
        return (uw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uw parseFrom(com.google.v.v vVar) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<uw> parser() {
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
            return new uw();
        }
        if (iOrdinal == 4) {
            return new uv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<uw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (uw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static uv newBuilder(uw uwVar) {
        return (uv) DEFAULT_INSTANCE.createBuilder(uwVar);
    }

    public static uw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static uw parseFrom(com.google.v.z zVar) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static uw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static uw parseFrom(InputStream inputStream) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uw parseFrom(ByteBuffer byteBuffer) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static uw parseFrom(byte[] bArr) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static uw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (uw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
