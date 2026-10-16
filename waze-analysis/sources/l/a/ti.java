package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ti extends com.google.v.du<ti, th> implements com.google.v.fj {
    private static final ti DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ti> PARSER;

    static {
        ti tiVar = new ti();
        DEFAULT_INSTANCE = tiVar;
        com.google.v.du.registerDefaultInstance(ti.class, tiVar);
    }

    private ti() {
    }

    public static ti getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static th newBuilder() {
        return (th) DEFAULT_INSTANCE.createBuilder();
    }

    public static ti parseDelimitedFrom(InputStream inputStream) {
        return (ti) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ti parseFrom(com.google.v.v vVar) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ti> parser() {
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
            return new ti();
        }
        if (iOrdinal == 4) {
            return new th(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ti> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ti.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static th newBuilder(ti tiVar) {
        return (th) DEFAULT_INSTANCE.createBuilder(tiVar);
    }

    public static ti parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ti) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ti parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ti parseFrom(com.google.v.z zVar) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ti parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ti parseFrom(InputStream inputStream) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ti parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ti parseFrom(ByteBuffer byteBuffer) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ti parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ti parseFrom(byte[] bArr) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ti parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ti) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
