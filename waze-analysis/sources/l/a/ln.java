package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ln extends com.google.v.du<ln, lm> implements com.google.v.fj {
    private static final ln DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ln> PARSER;

    static {
        ln lnVar = new ln();
        DEFAULT_INSTANCE = lnVar;
        com.google.v.du.registerDefaultInstance(ln.class, lnVar);
    }

    private ln() {
    }

    public static ln getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lm newBuilder() {
        return (lm) DEFAULT_INSTANCE.createBuilder();
    }

    public static ln parseDelimitedFrom(InputStream inputStream) {
        return (ln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ln parseFrom(com.google.v.v vVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ln> parser() {
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
            return new ln();
        }
        if (iOrdinal == 4) {
            return new lm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ln> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ln.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static lm newBuilder(ln lnVar) {
        return (lm) DEFAULT_INSTANCE.createBuilder(lnVar);
    }

    public static ln parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ln) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ln parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ln parseFrom(com.google.v.z zVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ln parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ln parseFrom(InputStream inputStream) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ln parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ln parseFrom(ByteBuffer byteBuffer) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ln parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ln parseFrom(byte[] bArr) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ln parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ln) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
