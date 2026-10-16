package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wv extends com.google.v.du<wv, wu> implements com.google.v.fj {
    private static final wv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<wv> PARSER;

    static {
        wv wvVar = new wv();
        DEFAULT_INSTANCE = wvVar;
        com.google.v.du.registerDefaultInstance(wv.class, wvVar);
    }

    private wv() {
    }

    public static wv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wu newBuilder() {
        return (wu) DEFAULT_INSTANCE.createBuilder();
    }

    public static wv parseDelimitedFrom(InputStream inputStream) {
        return (wv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wv parseFrom(com.google.v.v vVar) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wv> parser() {
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
            return new wv();
        }
        if (iOrdinal == 4) {
            return new wu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static wu newBuilder(wv wvVar) {
        return (wu) DEFAULT_INSTANCE.createBuilder(wvVar);
    }

    public static wv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wv parseFrom(com.google.v.z zVar) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wv parseFrom(InputStream inputStream) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wv parseFrom(ByteBuffer byteBuffer) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wv parseFrom(byte[] bArr) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
