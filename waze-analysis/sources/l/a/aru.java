package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aru extends com.google.v.du<aru, art> implements com.google.v.fj {
    private static final aru DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aru> PARSER;

    static {
        aru aruVar = new aru();
        DEFAULT_INSTANCE = aruVar;
        com.google.v.du.registerDefaultInstance(aru.class, aruVar);
    }

    private aru() {
    }

    public static aru getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static art newBuilder() {
        return (art) DEFAULT_INSTANCE.createBuilder();
    }

    public static aru parseDelimitedFrom(InputStream inputStream) {
        return (aru) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aru parseFrom(com.google.v.v vVar) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aru> parser() {
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
            return new aru();
        }
        if (iOrdinal == 4) {
            return new art(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aru> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aru.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static art newBuilder(aru aruVar) {
        return (art) DEFAULT_INSTANCE.createBuilder(aruVar);
    }

    public static aru parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aru) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aru parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aru parseFrom(com.google.v.z zVar) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aru parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aru parseFrom(InputStream inputStream) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aru parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aru parseFrom(ByteBuffer byteBuffer) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aru parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aru parseFrom(byte[] bArr) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aru parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aru) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
