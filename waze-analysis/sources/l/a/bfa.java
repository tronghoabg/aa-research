package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bfa extends com.google.v.du<bfa, bez> implements com.google.v.fj {
    private static final bfa DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bfa> PARSER;

    static {
        bfa bfaVar = new bfa();
        DEFAULT_INSTANCE = bfaVar;
        com.google.v.du.registerDefaultInstance(bfa.class, bfaVar);
    }

    private bfa() {
    }

    public static bfa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bez newBuilder() {
        return (bez) DEFAULT_INSTANCE.createBuilder();
    }

    public static bfa parseDelimitedFrom(InputStream inputStream) {
        return (bfa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfa parseFrom(com.google.v.v vVar) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bfa> parser() {
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
            return new bfa();
        }
        if (iOrdinal == 4) {
            return new bez(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bfa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bfa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bez newBuilder(bfa bfaVar) {
        return (bez) DEFAULT_INSTANCE.createBuilder(bfaVar);
    }

    public static bfa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bfa parseFrom(com.google.v.z zVar) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bfa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bfa parseFrom(InputStream inputStream) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bfa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bfa parseFrom(ByteBuffer byteBuffer) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bfa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bfa parseFrom(byte[] bArr) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bfa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bfa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
