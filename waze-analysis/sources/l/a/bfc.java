package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfc extends com.google.v.du<bfc, bfb> implements com.google.v.fj {
    private static final bfc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bfc> PARSER;

    static {
        bfc bfcVar = new bfc();
        DEFAULT_INSTANCE = bfcVar;
        com.google.v.du.registerDefaultInstance(bfc.class, bfcVar);
    }

    private bfc() {
    }

    public static bfc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfb newBuilder() {
        return (bfb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfc parseDelimitedFrom(InputStream inputStream) {
        return (bfc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfc parseFrom(com.google.v.v vVar) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfc> parser() {
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
            return new bfc();
        }
        if (iOrdinal == 4) {
            return new bfb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bfb newBuilder(bfc bfcVar) {
        return (bfb) DEFAULT_INSTANCE.createBuilder(bfcVar);
    }

    public static bfc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfc parseFrom(com.google.v.z zVar) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfc parseFrom(InputStream inputStream) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfc parseFrom(ByteBuffer byteBuffer) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfc parseFrom(byte[] bArr) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
