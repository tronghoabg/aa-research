package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsj extends com.google.v.du<bsj, bsi> implements com.google.v.fj {
    private static final bsj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bsj> PARSER;

    static {
        bsj bsjVar = new bsj();
        DEFAULT_INSTANCE = bsjVar;
        com.google.v.du.registerDefaultInstance(bsj.class, bsjVar);
    }

    private bsj() {
    }

    public static bsj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bsi newBuilder() {
        return (bsi) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsj parseDelimitedFrom(InputStream inputStream) {
        return (bsj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsj parseFrom(com.google.v.v vVar) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsj> parser() {
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
            return new bsj();
        }
        if (iOrdinal == 4) {
            return new bsi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bsi newBuilder(bsj bsjVar) {
        return (bsi) DEFAULT_INSTANCE.createBuilder(bsjVar);
    }

    public static bsj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsj parseFrom(com.google.v.z zVar) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsj parseFrom(InputStream inputStream) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsj parseFrom(ByteBuffer byteBuffer) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsj parseFrom(byte[] bArr) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
