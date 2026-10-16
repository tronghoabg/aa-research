package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ff extends com.google.v.du<ff, fe> implements com.google.v.fj {
    private static final ff DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ff> PARSER;

    static {
        ff ffVar = new ff();
        DEFAULT_INSTANCE = ffVar;
        com.google.v.du.registerDefaultInstance(ff.class, ffVar);
    }

    private ff() {
    }

    public static ff getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fe newBuilder() {
        return (fe) DEFAULT_INSTANCE.createBuilder();
    }

    public static ff parseDelimitedFrom(InputStream inputStream) {
        return (ff) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ff parseFrom(com.google.v.v vVar) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ff> parser() {
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
            return new ff();
        }
        if (iOrdinal == 4) {
            return new fe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ff> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ff.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fe newBuilder(ff ffVar) {
        return (fe) DEFAULT_INSTANCE.createBuilder(ffVar);
    }

    public static ff parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ff) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ff parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ff parseFrom(com.google.v.z zVar) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ff parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ff parseFrom(InputStream inputStream) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ff parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ff parseFrom(ByteBuffer byteBuffer) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ff parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ff parseFrom(byte[] bArr) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ff parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ff) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
