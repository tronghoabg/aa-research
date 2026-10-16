package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ayg extends com.google.v.du<ayg, ayf> implements com.google.v.fj {
    private static final ayg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ayg> PARSER;

    static {
        ayg aygVar = new ayg();
        DEFAULT_INSTANCE = aygVar;
        com.google.v.du.registerDefaultInstance(ayg.class, aygVar);
    }

    private ayg() {
    }

    public static ayg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayf newBuilder() {
        return (ayf) DEFAULT_INSTANCE.createBuilder();
    }

    public static ayg parseDelimitedFrom(InputStream inputStream) {
        return (ayg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayg parseFrom(com.google.v.v vVar) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ayg> parser() {
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
            return new ayg();
        }
        if (iOrdinal == 4) {
            return new ayf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ayg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ayg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ayf newBuilder(ayg aygVar) {
        return (ayf) DEFAULT_INSTANCE.createBuilder(aygVar);
    }

    public static ayg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ayg parseFrom(com.google.v.z zVar) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ayg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ayg parseFrom(InputStream inputStream) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ayg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ayg parseFrom(ByteBuffer byteBuffer) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ayg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ayg parseFrom(byte[] bArr) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ayg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ayg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
