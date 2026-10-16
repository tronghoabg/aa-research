package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bey extends com.google.v.du<bey, bex> implements com.google.v.fj {
    private static final bey DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bey> PARSER;

    static {
        bey beyVar = new bey();
        DEFAULT_INSTANCE = beyVar;
        com.google.v.du.registerDefaultInstance(bey.class, beyVar);
    }

    private bey() {
    }

    public static bey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bex newBuilder() {
        return (bex) DEFAULT_INSTANCE.createBuilder();
    }

    public static bey parseDelimitedFrom(InputStream inputStream) {
        return (bey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bey parseFrom(com.google.v.v vVar) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bey> parser() {
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
            return new bey();
        }
        if (iOrdinal == 4) {
            return new bex(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bey> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bey.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bex newBuilder(bey beyVar) {
        return (bex) DEFAULT_INSTANCE.createBuilder(beyVar);
    }

    public static bey parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bey parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bey parseFrom(com.google.v.z zVar) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bey parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bey parseFrom(InputStream inputStream) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bey parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bey parseFrom(ByteBuffer byteBuffer) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bey parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bey parseFrom(byte[] bArr) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bey parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
