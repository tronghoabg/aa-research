package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class je extends com.google.v.du<je, jd> implements com.google.v.fj {
    private static final je DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<je> PARSER;

    static {
        je jeVar = new je();
        DEFAULT_INSTANCE = jeVar;
        com.google.v.du.registerDefaultInstance(je.class, jeVar);
    }

    private je() {
    }

    public static je getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jd newBuilder() {
        return (jd) DEFAULT_INSTANCE.createBuilder();
    }

    public static je parseDelimitedFrom(InputStream inputStream) {
        return (je) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static je parseFrom(com.google.v.v vVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<je> parser() {
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
            return new je();
        }
        if (iOrdinal == 4) {
            return new jd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<je> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (je.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static jd newBuilder(je jeVar) {
        return (jd) DEFAULT_INSTANCE.createBuilder(jeVar);
    }

    public static je parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (je) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static je parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static je parseFrom(com.google.v.z zVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static je parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static je parseFrom(InputStream inputStream) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static je parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static je parseFrom(ByteBuffer byteBuffer) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static je parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static je parseFrom(byte[] bArr) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static je parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (je) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
