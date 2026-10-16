package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class oa extends com.google.v.du<oa, nz> implements com.google.v.fj {
    private static final oa DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<oa> PARSER;

    static {
        oa oaVar = new oa();
        DEFAULT_INSTANCE = oaVar;
        com.google.v.du.registerDefaultInstance(oa.class, oaVar);
    }

    private oa() {
    }

    public static oa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nz newBuilder() {
        return (nz) DEFAULT_INSTANCE.createBuilder();
    }

    public static oa parseDelimitedFrom(InputStream inputStream) {
        return (oa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oa parseFrom(com.google.v.v vVar) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<oa> parser() {
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
            return new oa();
        }
        if (iOrdinal == 4) {
            return new nz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<oa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (oa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static nz newBuilder(oa oaVar) {
        return (nz) DEFAULT_INSTANCE.createBuilder(oaVar);
    }

    public static oa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static oa parseFrom(com.google.v.z zVar) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static oa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static oa parseFrom(InputStream inputStream) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static oa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static oa parseFrom(ByteBuffer byteBuffer) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static oa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static oa parseFrom(byte[] bArr) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static oa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (oa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
