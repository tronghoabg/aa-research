package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ape extends com.google.v.du<ape, apd> implements com.google.v.fj {
    private static final ape DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ape> PARSER;

    static {
        ape apeVar = new ape();
        DEFAULT_INSTANCE = apeVar;
        com.google.v.du.registerDefaultInstance(ape.class, apeVar);
    }

    private ape() {
    }

    public static ape getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static apd newBuilder() {
        return (apd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ape parseDelimitedFrom(InputStream inputStream) {
        return (ape) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ape parseFrom(com.google.v.v vVar) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ape> parser() {
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
            return new ape();
        }
        if (iOrdinal == 4) {
            return new apd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ape> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ape.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static apd newBuilder(ape apeVar) {
        return (apd) DEFAULT_INSTANCE.createBuilder(apeVar);
    }

    public static ape parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ape) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ape parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ape parseFrom(com.google.v.z zVar) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ape parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ape parseFrom(InputStream inputStream) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ape parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ape parseFrom(ByteBuffer byteBuffer) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ape parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ape parseFrom(byte[] bArr) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ape parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ape) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
