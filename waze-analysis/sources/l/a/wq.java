package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wq extends com.google.v.du<wq, wp> implements com.google.v.fj {
    private static final wq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<wq> PARSER;

    static {
        wq wqVar = new wq();
        DEFAULT_INSTANCE = wqVar;
        com.google.v.du.registerDefaultInstance(wq.class, wqVar);
    }

    private wq() {
    }

    public static wq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wp newBuilder() {
        return (wp) DEFAULT_INSTANCE.createBuilder();
    }

    public static wq parseDelimitedFrom(InputStream inputStream) {
        return (wq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wq parseFrom(com.google.v.v vVar) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wq> parser() {
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
            return new wq();
        }
        if (iOrdinal == 4) {
            return new wp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static wp newBuilder(wq wqVar) {
        return (wp) DEFAULT_INSTANCE.createBuilder(wqVar);
    }

    public static wq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wq parseFrom(com.google.v.z zVar) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wq parseFrom(InputStream inputStream) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wq parseFrom(ByteBuffer byteBuffer) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wq parseFrom(byte[] bArr) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
