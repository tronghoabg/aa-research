package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfm extends com.google.v.du<bfm, bfl> implements com.google.v.fj {
    private static final bfm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bfm> PARSER;

    static {
        bfm bfmVar = new bfm();
        DEFAULT_INSTANCE = bfmVar;
        com.google.v.du.registerDefaultInstance(bfm.class, bfmVar);
    }

    private bfm() {
    }

    public static bfm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bfl newBuilder() {
        return (bfl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfm parseDelimitedFrom(InputStream inputStream) {
        return (bfm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfm parseFrom(com.google.v.v vVar) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfm> parser() {
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
            return new bfm();
        }
        if (iOrdinal == 4) {
            return new bfl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bfl newBuilder(bfm bfmVar) {
        return (bfl) DEFAULT_INSTANCE.createBuilder(bfmVar);
    }

    public static bfm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfm parseFrom(com.google.v.z zVar) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfm parseFrom(InputStream inputStream) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfm parseFrom(ByteBuffer byteBuffer) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfm parseFrom(byte[] bArr) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
