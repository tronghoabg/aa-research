package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wo extends com.google.v.du<wo, wn> implements com.google.v.fj {
    private static final wo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<wo> PARSER;

    static {
        wo woVar = new wo();
        DEFAULT_INSTANCE = woVar;
        com.google.v.du.registerDefaultInstance(wo.class, woVar);
    }

    private wo() {
    }

    public static wo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wn newBuilder() {
        return (wn) DEFAULT_INSTANCE.createBuilder();
    }

    public static wo parseDelimitedFrom(InputStream inputStream) {
        return (wo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wo parseFrom(com.google.v.v vVar) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wo> parser() {
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
            return new wo();
        }
        if (iOrdinal == 4) {
            return new wn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static wn newBuilder(wo woVar) {
        return (wn) DEFAULT_INSTANCE.createBuilder(woVar);
    }

    public static wo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wo parseFrom(com.google.v.z zVar) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wo parseFrom(InputStream inputStream) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wo parseFrom(ByteBuffer byteBuffer) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wo parseFrom(byte[] bArr) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
