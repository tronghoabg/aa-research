package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xt extends com.google.v.du<xt, xs> implements com.google.v.fj {
    private static final xt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<xt> PARSER;

    static {
        xt xtVar = new xt();
        DEFAULT_INSTANCE = xtVar;
        com.google.v.du.registerDefaultInstance(xt.class, xtVar);
    }

    private xt() {
    }

    public static xt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xs newBuilder() {
        return (xs) DEFAULT_INSTANCE.createBuilder();
    }

    public static xt parseDelimitedFrom(InputStream inputStream) {
        return (xt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xt parseFrom(com.google.v.v vVar) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xt> parser() {
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
            return new xt();
        }
        if (iOrdinal == 4) {
            return new xs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static xs newBuilder(xt xtVar) {
        return (xs) DEFAULT_INSTANCE.createBuilder(xtVar);
    }

    public static xt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xt parseFrom(com.google.v.z zVar) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xt parseFrom(InputStream inputStream) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xt parseFrom(ByteBuffer byteBuffer) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xt parseFrom(byte[] bArr) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
