package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qf extends com.google.v.du<qf, qe> implements com.google.v.fj {
    private static final qf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<qf> PARSER;

    static {
        qf qfVar = new qf();
        DEFAULT_INSTANCE = qfVar;
        com.google.v.du.registerDefaultInstance(qf.class, qfVar);
    }

    private qf() {
    }

    public static qf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qe newBuilder() {
        return (qe) DEFAULT_INSTANCE.createBuilder();
    }

    public static qf parseDelimitedFrom(InputStream inputStream) {
        return (qf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qf parseFrom(com.google.v.v vVar) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qf> parser() {
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
            return new qf();
        }
        if (iOrdinal == 4) {
            return new qe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static qe newBuilder(qf qfVar) {
        return (qe) DEFAULT_INSTANCE.createBuilder(qfVar);
    }

    public static qf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qf parseFrom(com.google.v.z zVar) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qf parseFrom(InputStream inputStream) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qf parseFrom(ByteBuffer byteBuffer) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qf parseFrom(byte[] bArr) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
