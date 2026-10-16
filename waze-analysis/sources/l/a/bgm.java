package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgm extends com.google.v.du<bgm, bgl> implements com.google.v.fj {
    private static final bgm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bgm> PARSER;

    static {
        bgm bgmVar = new bgm();
        DEFAULT_INSTANCE = bgmVar;
        com.google.v.du.registerDefaultInstance(bgm.class, bgmVar);
    }

    private bgm() {
    }

    public static bgm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bgl newBuilder() {
        return (bgl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgm parseDelimitedFrom(InputStream inputStream) {
        return (bgm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgm parseFrom(com.google.v.v vVar) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgm> parser() {
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
            return new bgm();
        }
        if (iOrdinal == 4) {
            return new bgl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bgl newBuilder(bgm bgmVar) {
        return (bgl) DEFAULT_INSTANCE.createBuilder(bgmVar);
    }

    public static bgm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgm parseFrom(com.google.v.z zVar) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgm parseFrom(InputStream inputStream) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgm parseFrom(ByteBuffer byteBuffer) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgm parseFrom(byte[] bArr) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
