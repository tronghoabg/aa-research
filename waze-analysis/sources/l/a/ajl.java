package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajl extends com.google.v.du<ajl, ajk> implements com.google.v.fj {
    private static final ajl DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajl> PARSER;

    static {
        ajl ajlVar = new ajl();
        DEFAULT_INSTANCE = ajlVar;
        com.google.v.du.registerDefaultInstance(ajl.class, ajlVar);
    }

    private ajl() {
    }

    public static ajl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ajk newBuilder() {
        return (ajk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajl parseDelimitedFrom(InputStream inputStream) {
        return (ajl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajl parseFrom(com.google.v.v vVar) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajl> parser() {
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
            return new ajl();
        }
        if (iOrdinal == 4) {
            return new ajk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ajk newBuilder(ajl ajlVar) {
        return (ajk) DEFAULT_INSTANCE.createBuilder(ajlVar);
    }

    public static ajl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajl parseFrom(com.google.v.z zVar) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajl parseFrom(InputStream inputStream) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajl parseFrom(ByteBuffer byteBuffer) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajl parseFrom(byte[] bArr) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
