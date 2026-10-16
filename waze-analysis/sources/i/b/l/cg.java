package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cg extends com.google.v.du<cg, cf> implements com.google.v.fj {
    private static final cg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cg> PARSER;

    static {
        cg cgVar = new cg();
        DEFAULT_INSTANCE = cgVar;
        com.google.v.du.registerDefaultInstance(cg.class, cgVar);
    }

    private cg() {
    }

    public static cg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cf newBuilder() {
        return (cf) DEFAULT_INSTANCE.createBuilder();
    }

    public static cg parseDelimitedFrom(InputStream inputStream) {
        return (cg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cg parseFrom(com.google.v.v vVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cg> parser() {
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
        }
        if (iOrdinal == 3) {
            return new cg();
        }
        if (iOrdinal == 4) {
            return new cf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static cf newBuilder(cg cgVar) {
        return (cf) DEFAULT_INSTANCE.createBuilder(cgVar);
    }

    public static cg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cg parseFrom(com.google.v.z zVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cg parseFrom(InputStream inputStream) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cg parseFrom(ByteBuffer byteBuffer) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cg parseFrom(byte[] bArr) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
