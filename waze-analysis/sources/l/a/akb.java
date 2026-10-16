package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class akb extends com.google.v.du<akb, aka> implements com.google.v.fj {
    private static final akb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<akb> PARSER;

    static {
        akb akbVar = new akb();
        DEFAULT_INSTANCE = akbVar;
        com.google.v.du.registerDefaultInstance(akb.class, akbVar);
    }

    private akb() {
    }

    public static akb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aka newBuilder() {
        return (aka) DEFAULT_INSTANCE.createBuilder();
    }

    public static akb parseDelimitedFrom(InputStream inputStream) {
        return (akb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akb parseFrom(com.google.v.v vVar) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<akb> parser() {
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
            return new akb();
        }
        if (iOrdinal == 4) {
            return new aka(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<akb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (akb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aka newBuilder(akb akbVar) {
        return (aka) DEFAULT_INSTANCE.createBuilder(akbVar);
    }

    public static akb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static akb parseFrom(com.google.v.z zVar) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static akb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static akb parseFrom(InputStream inputStream) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static akb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static akb parseFrom(ByteBuffer byteBuffer) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static akb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static akb parseFrom(byte[] bArr) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static akb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (akb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
