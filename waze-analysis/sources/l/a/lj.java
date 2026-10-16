package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lj extends com.google.v.du<lj, li> implements com.google.v.fj {
    private static final lj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<lj> PARSER;

    static {
        lj ljVar = new lj();
        DEFAULT_INSTANCE = ljVar;
        com.google.v.du.registerDefaultInstance(lj.class, ljVar);
    }

    private lj() {
    }

    public static lj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static li newBuilder() {
        return (li) DEFAULT_INSTANCE.createBuilder();
    }

    public static lj parseDelimitedFrom(InputStream inputStream) {
        return (lj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lj parseFrom(com.google.v.v vVar) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lj> parser() {
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
            return new lj();
        }
        if (iOrdinal == 4) {
            return new li(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static li newBuilder(lj ljVar) {
        return (li) DEFAULT_INSTANCE.createBuilder(ljVar);
    }

    public static lj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lj parseFrom(com.google.v.z zVar) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lj parseFrom(InputStream inputStream) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lj parseFrom(ByteBuffer byteBuffer) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lj parseFrom(byte[] bArr) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
