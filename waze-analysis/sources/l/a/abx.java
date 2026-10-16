package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abx extends com.google.v.du<abx, abw> implements com.google.v.fj {
    private static final abx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<abx> PARSER;

    static {
        abx abxVar = new abx();
        DEFAULT_INSTANCE = abxVar;
        com.google.v.du.registerDefaultInstance(abx.class, abxVar);
    }

    private abx() {
    }

    public static abx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static abw newBuilder() {
        return (abw) DEFAULT_INSTANCE.createBuilder();
    }

    public static abx parseDelimitedFrom(InputStream inputStream) {
        return (abx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abx parseFrom(com.google.v.v vVar) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abx> parser() {
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
            return new abx();
        }
        if (iOrdinal == 4) {
            return new abw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static abw newBuilder(abx abxVar) {
        return (abw) DEFAULT_INSTANCE.createBuilder(abxVar);
    }

    public static abx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abx parseFrom(com.google.v.z zVar) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abx parseFrom(InputStream inputStream) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abx parseFrom(ByteBuffer byteBuffer) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abx parseFrom(byte[] bArr) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
