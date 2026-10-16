package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bqn extends com.google.v.du<bqn, bqm> implements com.google.v.fj {
    private static final bqn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bqn> PARSER;

    static {
        bqn bqnVar = new bqn();
        DEFAULT_INSTANCE = bqnVar;
        com.google.v.du.registerDefaultInstance(bqn.class, bqnVar);
    }

    private bqn() {
    }

    public static bqn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bqm newBuilder() {
        return (bqm) DEFAULT_INSTANCE.createBuilder();
    }

    public static bqn parseDelimitedFrom(InputStream inputStream) {
        return (bqn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqn parseFrom(com.google.v.v vVar) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bqn> parser() {
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
            return new bqn();
        }
        if (iOrdinal == 4) {
            return new bqm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bqn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bqn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bqm newBuilder(bqn bqnVar) {
        return (bqm) DEFAULT_INSTANCE.createBuilder(bqnVar);
    }

    public static bqn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bqn parseFrom(com.google.v.z zVar) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bqn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bqn parseFrom(InputStream inputStream) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bqn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bqn parseFrom(ByteBuffer byteBuffer) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bqn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bqn parseFrom(byte[] bArr) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bqn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bqn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
