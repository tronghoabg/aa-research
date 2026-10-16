package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abn extends com.google.v.du<abn, abm> implements com.google.v.fj {
    private static final abn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<abn> PARSER;

    static {
        abn abnVar = new abn();
        DEFAULT_INSTANCE = abnVar;
        com.google.v.du.registerDefaultInstance(abn.class, abnVar);
    }

    private abn() {
    }

    public static abn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static abm newBuilder() {
        return (abm) DEFAULT_INSTANCE.createBuilder();
    }

    public static abn parseDelimitedFrom(InputStream inputStream) {
        return (abn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abn parseFrom(com.google.v.v vVar) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abn> parser() {
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
            return new abn();
        }
        if (iOrdinal == 4) {
            return new abm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static abm newBuilder(abn abnVar) {
        return (abm) DEFAULT_INSTANCE.createBuilder(abnVar);
    }

    public static abn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abn parseFrom(com.google.v.z zVar) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abn parseFrom(InputStream inputStream) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abn parseFrom(ByteBuffer byteBuffer) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abn parseFrom(byte[] bArr) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
