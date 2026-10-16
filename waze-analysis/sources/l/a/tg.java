package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class tg extends com.google.v.du<tg, tf> implements com.google.v.fj {
    private static final tg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<tg> PARSER;

    static {
        tg tgVar = new tg();
        DEFAULT_INSTANCE = tgVar;
        com.google.v.du.registerDefaultInstance(tg.class, tgVar);
    }

    private tg() {
    }

    public static tg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tf newBuilder() {
        return (tf) DEFAULT_INSTANCE.createBuilder();
    }

    public static tg parseDelimitedFrom(InputStream inputStream) {
        return (tg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tg parseFrom(com.google.v.v vVar) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tg> parser() {
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
            return new tg();
        }
        if (iOrdinal == 4) {
            return new tf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static tf newBuilder(tg tgVar) {
        return (tf) DEFAULT_INSTANCE.createBuilder(tgVar);
    }

    public static tg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tg parseFrom(com.google.v.z zVar) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tg parseFrom(InputStream inputStream) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tg parseFrom(ByteBuffer byteBuffer) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tg parseFrom(byte[] bArr) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
