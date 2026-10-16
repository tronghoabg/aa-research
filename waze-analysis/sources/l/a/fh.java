package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class fh extends com.google.v.du<fh, fg> implements com.google.v.fj {
    private static final fh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fh> PARSER;

    static {
        fh fhVar = new fh();
        DEFAULT_INSTANCE = fhVar;
        com.google.v.du.registerDefaultInstance(fh.class, fhVar);
    }

    private fh() {
    }

    public static fh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fg newBuilder() {
        return (fg) DEFAULT_INSTANCE.createBuilder();
    }

    public static fh parseDelimitedFrom(InputStream inputStream) {
        return (fh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fh parseFrom(com.google.v.v vVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fh> parser() {
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
            return new fh();
        }
        if (iOrdinal == 4) {
            return new fg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fg newBuilder(fh fhVar) {
        return (fg) DEFAULT_INSTANCE.createBuilder(fhVar);
    }

    public static fh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fh parseFrom(com.google.v.z zVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fh parseFrom(InputStream inputStream) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fh parseFrom(ByteBuffer byteBuffer) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fh parseFrom(byte[] bArr) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
