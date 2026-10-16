package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajh extends com.google.v.du<ajh, ajg> implements com.google.v.fj {
    private static final ajh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajh> PARSER;

    static {
        ajh ajhVar = new ajh();
        DEFAULT_INSTANCE = ajhVar;
        com.google.v.du.registerDefaultInstance(ajh.class, ajhVar);
    }

    private ajh() {
    }

    public static ajh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ajg newBuilder() {
        return (ajg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajh parseDelimitedFrom(InputStream inputStream) {
        return (ajh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajh parseFrom(com.google.v.v vVar) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajh> parser() {
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
            return new ajh();
        }
        if (iOrdinal == 4) {
            return new ajg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ajg newBuilder(ajh ajhVar) {
        return (ajg) DEFAULT_INSTANCE.createBuilder(ajhVar);
    }

    public static ajh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajh parseFrom(com.google.v.z zVar) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajh parseFrom(InputStream inputStream) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajh parseFrom(ByteBuffer byteBuffer) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajh parseFrom(byte[] bArr) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
