package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aia extends com.google.v.du<aia, ahz> implements com.google.v.fj {
    private static final aia DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aia> PARSER;

    static {
        aia aiaVar = new aia();
        DEFAULT_INSTANCE = aiaVar;
        com.google.v.du.registerDefaultInstance(aia.class, aiaVar);
    }

    private aia() {
    }

    public static aia getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ahz newBuilder() {
        return (ahz) DEFAULT_INSTANCE.createBuilder();
    }

    public static aia parseDelimitedFrom(InputStream inputStream) {
        return (aia) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aia parseFrom(com.google.v.v vVar) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aia> parser() {
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
            return new aia();
        }
        if (iOrdinal == 4) {
            return new ahz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aia> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aia.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ahz newBuilder(aia aiaVar) {
        return (ahz) DEFAULT_INSTANCE.createBuilder(aiaVar);
    }

    public static aia parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aia) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aia parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aia parseFrom(com.google.v.z zVar) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aia parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aia parseFrom(InputStream inputStream) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aia parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aia parseFrom(ByteBuffer byteBuffer) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aia parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aia parseFrom(byte[] bArr) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aia parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aia) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
