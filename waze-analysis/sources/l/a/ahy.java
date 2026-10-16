package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahy extends com.google.v.du<ahy, ahx> implements com.google.v.fj {
    private static final ahy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ahy> PARSER;

    static {
        ahy ahyVar = new ahy();
        DEFAULT_INSTANCE = ahyVar;
        com.google.v.du.registerDefaultInstance(ahy.class, ahyVar);
    }

    private ahy() {
    }

    public static ahy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ahx newBuilder() {
        return (ahx) DEFAULT_INSTANCE.createBuilder();
    }

    public static ahy parseDelimitedFrom(InputStream inputStream) {
        return (ahy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahy parseFrom(com.google.v.v vVar) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ahy> parser() {
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
            return new ahy();
        }
        if (iOrdinal == 4) {
            return new ahx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ahy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ahy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ahx newBuilder(ahy ahyVar) {
        return (ahx) DEFAULT_INSTANCE.createBuilder(ahyVar);
    }

    public static ahy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ahy parseFrom(com.google.v.z zVar) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ahy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ahy parseFrom(InputStream inputStream) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahy parseFrom(ByteBuffer byteBuffer) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ahy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ahy parseFrom(byte[] bArr) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ahy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ahy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
