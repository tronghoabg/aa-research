package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmu extends com.google.v.du<bmu, bmt> implements com.google.v.fj {
    private static final bmu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bmu> PARSER;

    static {
        bmu bmuVar = new bmu();
        DEFAULT_INSTANCE = bmuVar;
        com.google.v.du.registerDefaultInstance(bmu.class, bmuVar);
    }

    private bmu() {
    }

    public static bmu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bmt newBuilder() {
        return (bmt) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmu parseDelimitedFrom(InputStream inputStream) {
        return (bmu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmu parseFrom(com.google.v.v vVar) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmu> parser() {
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
            return new bmu();
        }
        if (iOrdinal == 4) {
            return new bmt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bmt newBuilder(bmu bmuVar) {
        return (bmt) DEFAULT_INSTANCE.createBuilder(bmuVar);
    }

    public static bmu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmu parseFrom(com.google.v.z zVar) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmu parseFrom(InputStream inputStream) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmu parseFrom(ByteBuffer byteBuffer) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmu parseFrom(byte[] bArr) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
