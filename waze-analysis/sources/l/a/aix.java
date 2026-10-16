package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aix extends com.google.v.du<aix, aiw> implements com.google.v.fj {
    private static final aix DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aix> PARSER;

    static {
        aix aixVar = new aix();
        DEFAULT_INSTANCE = aixVar;
        com.google.v.du.registerDefaultInstance(aix.class, aixVar);
    }

    private aix() {
    }

    public static aix getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aiw newBuilder() {
        return (aiw) DEFAULT_INSTANCE.createBuilder();
    }

    public static aix parseDelimitedFrom(InputStream inputStream) {
        return (aix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aix parseFrom(com.google.v.v vVar) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aix> parser() {
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
            return new aix();
        }
        if (iOrdinal == 4) {
            return new aiw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aix> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aix.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aiw newBuilder(aix aixVar) {
        return (aiw) DEFAULT_INSTANCE.createBuilder(aixVar);
    }

    public static aix parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aix) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aix parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aix parseFrom(com.google.v.z zVar) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aix parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aix parseFrom(InputStream inputStream) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aix parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aix parseFrom(ByteBuffer byteBuffer) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aix parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aix parseFrom(byte[] bArr) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aix parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aix) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
