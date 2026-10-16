package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ds extends com.google.v.du<ds, dr> implements com.google.v.fj {
    private static final ds DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ds> PARSER;

    static {
        ds dsVar = new ds();
        DEFAULT_INSTANCE = dsVar;
        com.google.v.du.registerDefaultInstance(ds.class, dsVar);
    }

    private ds() {
    }

    public static ds getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dr newBuilder() {
        return (dr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ds parseDelimitedFrom(InputStream inputStream) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(com.google.v.v vVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ds> parser() {
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
            return new ds();
        }
        if (iOrdinal == 4) {
            return new dr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ds> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ds.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static dr newBuilder(ds dsVar) {
        return (dr) DEFAULT_INSTANCE.createBuilder(dsVar);
    }

    public static ds parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ds parseFrom(com.google.v.z zVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ds parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ds parseFrom(InputStream inputStream) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(ByteBuffer byteBuffer) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ds parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ds parseFrom(byte[] bArr) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ds parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
