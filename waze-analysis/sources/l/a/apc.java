package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apc extends com.google.v.du<apc, apb> implements com.google.v.fj {
    private static final apc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<apc> PARSER;

    static {
        apc apcVar = new apc();
        DEFAULT_INSTANCE = apcVar;
        com.google.v.du.registerDefaultInstance(apc.class, apcVar);
    }

    private apc() {
    }

    public static apc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static apb newBuilder() {
        return (apb) DEFAULT_INSTANCE.createBuilder();
    }

    public static apc parseDelimitedFrom(InputStream inputStream) {
        return (apc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apc parseFrom(com.google.v.v vVar) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apc> parser() {
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
            return new apc();
        }
        if (iOrdinal == 4) {
            return new apb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static apb newBuilder(apc apcVar) {
        return (apb) DEFAULT_INSTANCE.createBuilder(apcVar);
    }

    public static apc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apc parseFrom(com.google.v.z zVar) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apc parseFrom(InputStream inputStream) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apc parseFrom(ByteBuffer byteBuffer) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apc parseFrom(byte[] bArr) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
