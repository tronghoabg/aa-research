package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class fn extends com.google.v.du<fn, fm> implements com.google.v.fj {
    private static final fn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<fn> PARSER;

    static {
        fn fnVar = new fn();
        DEFAULT_INSTANCE = fnVar;
        com.google.v.du.registerDefaultInstance(fn.class, fnVar);
    }

    private fn() {
    }

    public static fn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fm newBuilder() {
        return (fm) DEFAULT_INSTANCE.createBuilder();
    }

    public static fn parseDelimitedFrom(InputStream inputStream) {
        return (fn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fn parseFrom(com.google.v.v vVar) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fn> parser() {
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
            return new fn();
        }
        if (iOrdinal == 4) {
            return new fm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static fm newBuilder(fn fnVar) {
        return (fm) DEFAULT_INSTANCE.createBuilder(fnVar);
    }

    public static fn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fn parseFrom(com.google.v.z zVar) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fn parseFrom(InputStream inputStream) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fn parseFrom(ByteBuffer byteBuffer) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fn parseFrom(byte[] bArr) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
