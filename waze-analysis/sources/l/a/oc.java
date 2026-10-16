package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oc extends com.google.v.du<oc, ob> implements com.google.v.fj {
    private static final oc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<oc> PARSER;

    static {
        oc ocVar = new oc();
        DEFAULT_INSTANCE = ocVar;
        com.google.v.du.registerDefaultInstance(oc.class, ocVar);
    }

    private oc() {
    }

    public static oc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ob newBuilder() {
        return (ob) DEFAULT_INSTANCE.createBuilder();
    }

    public static oc parseDelimitedFrom(InputStream inputStream) {
        return (oc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oc parseFrom(com.google.v.v vVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oc> parser() {
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
            return new oc();
        }
        if (iOrdinal == 4) {
            return new ob(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ob newBuilder(oc ocVar) {
        return (ob) DEFAULT_INSTANCE.createBuilder(ocVar);
    }

    public static oc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oc parseFrom(com.google.v.z zVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static oc parseFrom(InputStream inputStream) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oc parseFrom(ByteBuffer byteBuffer) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oc parseFrom(byte[] bArr) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
