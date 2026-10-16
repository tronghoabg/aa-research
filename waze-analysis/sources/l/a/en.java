package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class en extends com.google.v.du<en, em> implements com.google.v.fj {
    private static final en DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<en> PARSER;

    static {
        en enVar = new en();
        DEFAULT_INSTANCE = enVar;
        com.google.v.du.registerDefaultInstance(en.class, enVar);
    }

    private en() {
    }

    public static en getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static em newBuilder() {
        return (em) DEFAULT_INSTANCE.createBuilder();
    }

    public static en parseDelimitedFrom(InputStream inputStream) {
        return (en) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static en parseFrom(com.google.v.v vVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<en> parser() {
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
            return new en();
        }
        if (iOrdinal == 4) {
            return new em(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<en> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (en.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static em newBuilder(en enVar) {
        return (em) DEFAULT_INSTANCE.createBuilder(enVar);
    }

    public static en parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (en) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static en parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static en parseFrom(com.google.v.z zVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static en parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static en parseFrom(InputStream inputStream) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static en parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static en parseFrom(ByteBuffer byteBuffer) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static en parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static en parseFrom(byte[] bArr) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static en parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (en) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
