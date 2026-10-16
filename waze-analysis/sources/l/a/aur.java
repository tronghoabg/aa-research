package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aur extends com.google.v.du<aur, auq> implements com.google.v.fj {
    private static final aur DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aur> PARSER;

    static {
        aur aurVar = new aur();
        DEFAULT_INSTANCE = aurVar;
        com.google.v.du.registerDefaultInstance(aur.class, aurVar);
    }

    private aur() {
    }

    public static aur getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static auq newBuilder() {
        return (auq) DEFAULT_INSTANCE.createBuilder();
    }

    public static aur parseDelimitedFrom(InputStream inputStream) {
        return (aur) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aur parseFrom(com.google.v.v vVar) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aur> parser() {
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
            return new aur();
        }
        if (iOrdinal == 4) {
            return new auq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aur> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aur.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static auq newBuilder(aur aurVar) {
        return (auq) DEFAULT_INSTANCE.createBuilder(aurVar);
    }

    public static aur parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aur) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aur parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aur parseFrom(com.google.v.z zVar) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aur parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aur parseFrom(InputStream inputStream) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aur parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aur parseFrom(ByteBuffer byteBuffer) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aur parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aur parseFrom(byte[] bArr) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aur parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aur) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
