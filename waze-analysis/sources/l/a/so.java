package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class so extends com.google.v.du<so, sn> implements com.google.v.fj {
    private static final so DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<so> PARSER;

    static {
        so soVar = new so();
        DEFAULT_INSTANCE = soVar;
        com.google.v.du.registerDefaultInstance(so.class, soVar);
    }

    private so() {
    }

    public static so getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sn newBuilder() {
        return (sn) DEFAULT_INSTANCE.createBuilder();
    }

    public static so parseDelimitedFrom(InputStream inputStream) {
        return (so) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static so parseFrom(com.google.v.v vVar) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<so> parser() {
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
            return new so();
        }
        if (iOrdinal == 4) {
            return new sn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<so> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (so.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static sn newBuilder(so soVar) {
        return (sn) DEFAULT_INSTANCE.createBuilder(soVar);
    }

    public static so parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (so) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static so parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static so parseFrom(com.google.v.z zVar) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static so parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static so parseFrom(InputStream inputStream) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static so parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static so parseFrom(ByteBuffer byteBuffer) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static so parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static so parseFrom(byte[] bArr) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static so parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (so) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
