package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aai extends com.google.v.du<aai, aah> implements com.google.v.fj {
    private static final aai DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aai> PARSER;

    static {
        aai aaiVar = new aai();
        DEFAULT_INSTANCE = aaiVar;
        com.google.v.du.registerDefaultInstance(aai.class, aaiVar);
    }

    private aai() {
    }

    public static aai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aah newBuilder() {
        return (aah) DEFAULT_INSTANCE.createBuilder();
    }

    public static aai parseDelimitedFrom(InputStream inputStream) {
        return (aai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aai parseFrom(com.google.v.v vVar) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aai> parser() {
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
            return new aai();
        }
        if (iOrdinal == 4) {
            return new aah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aah newBuilder(aai aaiVar) {
        return (aah) DEFAULT_INSTANCE.createBuilder(aaiVar);
    }

    public static aai parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aai parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aai parseFrom(com.google.v.z zVar) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aai parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aai parseFrom(InputStream inputStream) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aai parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aai parseFrom(ByteBuffer byteBuffer) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aai parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aai parseFrom(byte[] bArr) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aai parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aai) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
