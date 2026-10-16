package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aym extends com.google.v.du<aym, ayl> implements com.google.v.fj {
    private static final aym DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aym> PARSER;

    static {
        aym aymVar = new aym();
        DEFAULT_INSTANCE = aymVar;
        com.google.v.du.registerDefaultInstance(aym.class, aymVar);
    }

    private aym() {
    }

    public static aym getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayl newBuilder() {
        return (ayl) DEFAULT_INSTANCE.createBuilder();
    }

    public static aym parseDelimitedFrom(InputStream inputStream) {
        return (aym) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aym parseFrom(com.google.v.v vVar) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aym> parser() {
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
            return new aym();
        }
        if (iOrdinal == 4) {
            return new ayl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aym> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aym.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ayl newBuilder(aym aymVar) {
        return (ayl) DEFAULT_INSTANCE.createBuilder(aymVar);
    }

    public static aym parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aym) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aym parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aym parseFrom(com.google.v.z zVar) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aym parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aym parseFrom(InputStream inputStream) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aym parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aym parseFrom(ByteBuffer byteBuffer) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aym parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aym parseFrom(byte[] bArr) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aym parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aym) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
