package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jt extends com.google.v.du<jt, js> implements com.google.v.fj {
    private static final jt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jt> PARSER;

    static {
        jt jtVar = new jt();
        DEFAULT_INSTANCE = jtVar;
        com.google.v.du.registerDefaultInstance(jt.class, jtVar);
    }

    private jt() {
    }

    public static jt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static js newBuilder() {
        return (js) DEFAULT_INSTANCE.createBuilder();
    }

    public static jt parseDelimitedFrom(InputStream inputStream) {
        return (jt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jt parseFrom(com.google.v.v vVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jt> parser() {
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
            return new jt();
        }
        if (iOrdinal == 4) {
            return new js(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static js newBuilder(jt jtVar) {
        return (js) DEFAULT_INSTANCE.createBuilder(jtVar);
    }

    public static jt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jt parseFrom(com.google.v.z zVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jt parseFrom(InputStream inputStream) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jt parseFrom(ByteBuffer byteBuffer) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jt parseFrom(byte[] bArr) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
