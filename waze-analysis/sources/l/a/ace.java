package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ace extends com.google.v.du<ace, acd> implements com.google.v.fj {
    private static final ace DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ace> PARSER;

    static {
        ace aceVar = new ace();
        DEFAULT_INSTANCE = aceVar;
        com.google.v.du.registerDefaultInstance(ace.class, aceVar);
    }

    private ace() {
    }

    public static ace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static acd newBuilder() {
        return (acd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ace parseDelimitedFrom(InputStream inputStream) {
        return (ace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ace parseFrom(com.google.v.v vVar) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ace> parser() {
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
            return new ace();
        }
        if (iOrdinal == 4) {
            return new acd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ace> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ace.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static acd newBuilder(ace aceVar) {
        return (acd) DEFAULT_INSTANCE.createBuilder(aceVar);
    }

    public static ace parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ace) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ace parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ace parseFrom(com.google.v.z zVar) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ace parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ace parseFrom(InputStream inputStream) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ace parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ace parseFrom(ByteBuffer byteBuffer) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ace parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ace parseFrom(byte[] bArr) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ace parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ace) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
