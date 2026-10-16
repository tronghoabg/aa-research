package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ew extends com.google.v.du<ew, ev> implements com.google.v.fj {
    private static final ew DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ew> PARSER;

    static {
        ew ewVar = new ew();
        DEFAULT_INSTANCE = ewVar;
        com.google.v.du.registerDefaultInstance(ew.class, ewVar);
    }

    private ew() {
    }

    public static ew getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ev newBuilder() {
        return (ev) DEFAULT_INSTANCE.createBuilder();
    }

    public static ew parseDelimitedFrom(InputStream inputStream) {
        return (ew) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ew parseFrom(com.google.v.v vVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ew> parser() {
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
            return new ew();
        }
        if (iOrdinal == 4) {
            return new ev(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ew> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ew.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ev newBuilder(ew ewVar) {
        return (ev) DEFAULT_INSTANCE.createBuilder(ewVar);
    }

    public static ew parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ew) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ew parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ew parseFrom(com.google.v.z zVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ew parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ew parseFrom(InputStream inputStream) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ew parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ew parseFrom(ByteBuffer byteBuffer) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ew parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ew parseFrom(byte[] bArr) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ew parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ew) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
