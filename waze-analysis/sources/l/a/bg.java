package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bg extends com.google.v.du<bg, bf> implements com.google.v.fj {
    private static final bg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bg> PARSER;

    static {
        bg bgVar = new bg();
        DEFAULT_INSTANCE = bgVar;
        com.google.v.du.registerDefaultInstance(bg.class, bgVar);
    }

    private bg() {
    }

    public static bg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bf newBuilder() {
        return (bf) DEFAULT_INSTANCE.createBuilder();
    }

    public static bg parseDelimitedFrom(InputStream inputStream) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(com.google.v.v vVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bg> parser() {
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
            return new bg();
        }
        if (iOrdinal == 4) {
            return new bf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bf newBuilder(bg bgVar) {
        return (bf) DEFAULT_INSTANCE.createBuilder(bgVar);
    }

    public static bg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bg parseFrom(com.google.v.z zVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bg parseFrom(InputStream inputStream) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bg parseFrom(ByteBuffer byteBuffer) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bg parseFrom(byte[] bArr) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
