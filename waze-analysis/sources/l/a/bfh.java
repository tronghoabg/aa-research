package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfh extends com.google.v.du<bfh, bfg> implements com.google.v.fj {
    private static final bfh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bfh> PARSER;

    static {
        bfh bfhVar = new bfh();
        DEFAULT_INSTANCE = bfhVar;
        com.google.v.du.registerDefaultInstance(bfh.class, bfhVar);
    }

    private bfh() {
    }

    public static bfh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfg newBuilder() {
        return (bfg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfh parseDelimitedFrom(InputStream inputStream) {
        return (bfh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfh parseFrom(com.google.v.v vVar) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfh> parser() {
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
            return new bfh();
        }
        if (iOrdinal == 4) {
            return new bfg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bfg newBuilder(bfh bfhVar) {
        return (bfg) DEFAULT_INSTANCE.createBuilder(bfhVar);
    }

    public static bfh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfh parseFrom(com.google.v.z zVar) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfh parseFrom(InputStream inputStream) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfh parseFrom(ByteBuffer byteBuffer) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfh parseFrom(byte[] bArr) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
