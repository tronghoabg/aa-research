package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pn extends com.google.v.du<pn, pm> implements com.google.v.fj {
    private static final pn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<pn> PARSER;

    static {
        pn pnVar = new pn();
        DEFAULT_INSTANCE = pnVar;
        com.google.v.du.registerDefaultInstance(pn.class, pnVar);
    }

    private pn() {
    }

    public static pn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static pm newBuilder() {
        return (pm) DEFAULT_INSTANCE.createBuilder();
    }

    public static pn parseDelimitedFrom(InputStream inputStream) {
        return (pn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pn parseFrom(com.google.v.v vVar) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pn> parser() {
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
            return new pn();
        }
        if (iOrdinal == 4) {
            return new pm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static pm newBuilder(pn pnVar) {
        return (pm) DEFAULT_INSTANCE.createBuilder(pnVar);
    }

    public static pn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pn parseFrom(com.google.v.z zVar) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pn parseFrom(InputStream inputStream) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pn parseFrom(ByteBuffer byteBuffer) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pn parseFrom(byte[] bArr) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
