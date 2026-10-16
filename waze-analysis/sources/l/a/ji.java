package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ji extends com.google.v.du<ji, jh> implements com.google.v.fj {
    private static final ji DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ji> PARSER;

    static {
        ji jiVar = new ji();
        DEFAULT_INSTANCE = jiVar;
        com.google.v.du.registerDefaultInstance(ji.class, jiVar);
    }

    private ji() {
    }

    public static ji getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jh newBuilder() {
        return (jh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ji parseDelimitedFrom(InputStream inputStream) {
        return (ji) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ji parseFrom(com.google.v.v vVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ji> parser() {
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
            return new ji();
        }
        if (iOrdinal == 4) {
            return new jh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ji> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ji.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static jh newBuilder(ji jiVar) {
        return (jh) DEFAULT_INSTANCE.createBuilder(jiVar);
    }

    public static ji parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ji) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ji parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ji parseFrom(com.google.v.z zVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ji parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ji parseFrom(InputStream inputStream) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ji parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ji parseFrom(ByteBuffer byteBuffer) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ji parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ji parseFrom(byte[] bArr) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ji parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ji) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
