package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class kz extends com.google.v.du<kz, ky> implements com.google.v.fj {
    private static final kz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<kz> PARSER;

    static {
        kz kzVar = new kz();
        DEFAULT_INSTANCE = kzVar;
        com.google.v.du.registerDefaultInstance(kz.class, kzVar);
    }

    private kz() {
    }

    public static kz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ky newBuilder() {
        return (ky) DEFAULT_INSTANCE.createBuilder();
    }

    public static kz parseDelimitedFrom(InputStream inputStream) {
        return (kz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kz parseFrom(com.google.v.v vVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kz> parser() {
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
            return new kz();
        }
        if (iOrdinal == 4) {
            return new ky(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<kz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (kz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ky newBuilder(kz kzVar) {
        return (ky) DEFAULT_INSTANCE.createBuilder(kzVar);
    }

    public static kz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kz parseFrom(com.google.v.z zVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kz parseFrom(InputStream inputStream) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kz parseFrom(ByteBuffer byteBuffer) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kz parseFrom(byte[] bArr) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
