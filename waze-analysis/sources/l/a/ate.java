package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ate extends com.google.v.du<ate, atd> implements com.google.v.fj {
    private static final ate DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ate> PARSER;

    static {
        ate ateVar = new ate();
        DEFAULT_INSTANCE = ateVar;
        com.google.v.du.registerDefaultInstance(ate.class, ateVar);
    }

    private ate() {
    }

    public static ate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static atd newBuilder() {
        return (atd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ate parseDelimitedFrom(InputStream inputStream) {
        return (ate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ate parseFrom(com.google.v.v vVar) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ate> parser() {
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
            return new ate();
        }
        if (iOrdinal == 4) {
            return new atd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ate> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ate.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static atd newBuilder(ate ateVar) {
        return (atd) DEFAULT_INSTANCE.createBuilder(ateVar);
    }

    public static ate parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ate) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ate parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ate parseFrom(com.google.v.z zVar) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ate parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ate parseFrom(InputStream inputStream) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ate parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ate parseFrom(ByteBuffer byteBuffer) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ate parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ate parseFrom(byte[] bArr) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ate parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ate) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
