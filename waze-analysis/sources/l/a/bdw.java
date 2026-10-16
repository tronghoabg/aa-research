package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bdw extends com.google.v.du<bdw, bdv> implements com.google.v.fj {
    private static final bdw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bdw> PARSER;

    static {
        bdw bdwVar = new bdw();
        DEFAULT_INSTANCE = bdwVar;
        com.google.v.du.registerDefaultInstance(bdw.class, bdwVar);
    }

    private bdw() {
    }

    public static bdw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bdv newBuilder() {
        return (bdv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bdw parseDelimitedFrom(InputStream inputStream) {
        return (bdw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdw parseFrom(com.google.v.v vVar) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bdw> parser() {
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
            return new bdw();
        }
        if (iOrdinal == 4) {
            return new bdv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bdw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bdw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bdv newBuilder(bdw bdwVar) {
        return (bdv) DEFAULT_INSTANCE.createBuilder(bdwVar);
    }

    public static bdw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bdw parseFrom(com.google.v.z zVar) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bdw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bdw parseFrom(InputStream inputStream) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bdw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bdw parseFrom(ByteBuffer byteBuffer) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bdw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bdw parseFrom(byte[] bArr) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bdw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bdw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
