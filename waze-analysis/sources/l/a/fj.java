package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fj extends com.google.v.du<fj, fi> implements com.google.v.fj {
    private static final fj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fj> PARSER;

    static {
        fj fjVar = new fj();
        DEFAULT_INSTANCE = fjVar;
        com.google.v.du.registerDefaultInstance(fj.class, fjVar);
    }

    private fj() {
    }

    public static fj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fi newBuilder() {
        return (fi) DEFAULT_INSTANCE.createBuilder();
    }

    public static fj parseDelimitedFrom(InputStream inputStream) {
        return (fj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fj parseFrom(com.google.v.v vVar) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fj> parser() {
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
            return new fj();
        }
        if (iOrdinal == 4) {
            return new fi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fi newBuilder(fj fjVar) {
        return (fi) DEFAULT_INSTANCE.createBuilder(fjVar);
    }

    public static fj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fj parseFrom(com.google.v.z zVar) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fj parseFrom(InputStream inputStream) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fj parseFrom(ByteBuffer byteBuffer) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fj parseFrom(byte[] bArr) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
