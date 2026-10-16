package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbo extends com.google.v.du<bbo, bbn> implements com.google.v.fj {
    private static final bbo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bbo> PARSER;

    static {
        bbo bboVar = new bbo();
        DEFAULT_INSTANCE = bboVar;
        com.google.v.du.registerDefaultInstance(bbo.class, bboVar);
    }

    private bbo() {
    }

    public static bbo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bbn newBuilder() {
        return (bbn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bbo parseDelimitedFrom(InputStream inputStream) {
        return (bbo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbo parseFrom(com.google.v.v vVar) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bbo> parser() {
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
            return new bbo();
        }
        if (iOrdinal == 4) {
            return new bbn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bbo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bbo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bbn newBuilder(bbo bboVar) {
        return (bbn) DEFAULT_INSTANCE.createBuilder(bboVar);
    }

    public static bbo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bbo parseFrom(com.google.v.z zVar) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bbo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bbo parseFrom(InputStream inputStream) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbo parseFrom(ByteBuffer byteBuffer) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bbo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bbo parseFrom(byte[] bArr) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bbo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bbo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
