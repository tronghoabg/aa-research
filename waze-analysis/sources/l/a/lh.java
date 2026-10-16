package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lh extends com.google.v.du<lh, lg> implements com.google.v.fj {
    private static final lh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<lh> PARSER;

    static {
        lh lhVar = new lh();
        DEFAULT_INSTANCE = lhVar;
        com.google.v.du.registerDefaultInstance(lh.class, lhVar);
    }

    private lh() {
    }

    public static lh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lg newBuilder() {
        return (lg) DEFAULT_INSTANCE.createBuilder();
    }

    public static lh parseDelimitedFrom(InputStream inputStream) {
        return (lh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lh parseFrom(com.google.v.v vVar) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lh> parser() {
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
            return new lh();
        }
        if (iOrdinal == 4) {
            return new lg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static lg newBuilder(lh lhVar) {
        return (lg) DEFAULT_INSTANCE.createBuilder(lhVar);
    }

    public static lh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lh parseFrom(com.google.v.z zVar) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lh parseFrom(InputStream inputStream) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lh parseFrom(ByteBuffer byteBuffer) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lh parseFrom(byte[] bArr) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
