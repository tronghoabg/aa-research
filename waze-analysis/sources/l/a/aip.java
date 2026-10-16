package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aip extends com.google.v.du<aip, aio> implements com.google.v.fj {
    private static final aip DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aip> PARSER;

    static {
        aip aipVar = new aip();
        DEFAULT_INSTANCE = aipVar;
        com.google.v.du.registerDefaultInstance(aip.class, aipVar);
    }

    private aip() {
    }

    public static aip getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aio newBuilder() {
        return (aio) DEFAULT_INSTANCE.createBuilder();
    }

    public static aip parseDelimitedFrom(InputStream inputStream) {
        return (aip) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aip parseFrom(com.google.v.v vVar) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aip> parser() {
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
            return new aip();
        }
        if (iOrdinal == 4) {
            return new aio(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aip> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aip.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aio newBuilder(aip aipVar) {
        return (aio) DEFAULT_INSTANCE.createBuilder(aipVar);
    }

    public static aip parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aip) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aip parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aip parseFrom(com.google.v.z zVar) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aip parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aip parseFrom(InputStream inputStream) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aip parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aip parseFrom(ByteBuffer byteBuffer) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aip parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aip parseFrom(byte[] bArr) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aip parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aip) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
