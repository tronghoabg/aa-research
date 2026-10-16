package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class el extends com.google.v.du<el, ek> implements com.google.v.fj {
    private static final el DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<el> PARSER;

    static {
        el elVar = new el();
        DEFAULT_INSTANCE = elVar;
        com.google.v.du.registerDefaultInstance(el.class, elVar);
    }

    private el() {
    }

    public static el getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ek newBuilder() {
        return (ek) DEFAULT_INSTANCE.createBuilder();
    }

    public static el parseDelimitedFrom(InputStream inputStream) {
        return (el) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static el parseFrom(com.google.v.v vVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<el> parser() {
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
            return new el();
        }
        if (iOrdinal == 4) {
            return new ek(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<el> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (el.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ek newBuilder(el elVar) {
        return (ek) DEFAULT_INSTANCE.createBuilder(elVar);
    }

    public static el parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (el) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static el parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static el parseFrom(com.google.v.z zVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static el parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static el parseFrom(InputStream inputStream) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static el parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static el parseFrom(ByteBuffer byteBuffer) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static el parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static el parseFrom(byte[] bArr) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static el parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (el) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
