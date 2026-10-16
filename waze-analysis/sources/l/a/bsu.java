package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsu extends com.google.v.du<bsu, bst> implements com.google.v.fj {
    private static final bsu DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bsu> PARSER;

    static {
        bsu bsuVar = new bsu();
        DEFAULT_INSTANCE = bsuVar;
        com.google.v.du.registerDefaultInstance(bsu.class, bsuVar);
    }

    private bsu() {
    }

    public static bsu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bst newBuilder() {
        return (bst) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsu parseDelimitedFrom(InputStream inputStream) {
        return (bsu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsu parseFrom(com.google.v.v vVar) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsu> parser() {
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
            return new bsu();
        }
        if (iOrdinal == 4) {
            return new bst(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bst newBuilder(bsu bsuVar) {
        return (bst) DEFAULT_INSTANCE.createBuilder(bsuVar);
    }

    public static bsu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsu parseFrom(com.google.v.z zVar) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsu parseFrom(InputStream inputStream) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsu parseFrom(ByteBuffer byteBuffer) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsu parseFrom(byte[] bArr) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
