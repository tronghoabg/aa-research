package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class lb extends com.google.v.du<lb, la> implements com.google.v.fj {
    private static final lb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<lb> PARSER;

    static {
        lb lbVar = new lb();
        DEFAULT_INSTANCE = lbVar;
        com.google.v.du.registerDefaultInstance(lb.class, lbVar);
    }

    private lb() {
    }

    public static lb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static la newBuilder() {
        return (la) DEFAULT_INSTANCE.createBuilder();
    }

    public static lb parseDelimitedFrom(InputStream inputStream) {
        return (lb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lb parseFrom(com.google.v.v vVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lb> parser() {
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
            return new lb();
        }
        if (iOrdinal == 4) {
            return new la(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static la newBuilder(lb lbVar) {
        return (la) DEFAULT_INSTANCE.createBuilder(lbVar);
    }

    public static lb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lb parseFrom(com.google.v.z zVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lb parseFrom(InputStream inputStream) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lb parseFrom(ByteBuffer byteBuffer) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lb parseFrom(byte[] bArr) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
