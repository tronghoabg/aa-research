package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yb extends com.google.v.du<yb, ya> implements com.google.v.fj {
    private static final yb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<yb> PARSER;

    static {
        yb ybVar = new yb();
        DEFAULT_INSTANCE = ybVar;
        com.google.v.du.registerDefaultInstance(yb.class, ybVar);
    }

    private yb() {
    }

    public static yb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ya newBuilder() {
        return (ya) DEFAULT_INSTANCE.createBuilder();
    }

    public static yb parseDelimitedFrom(InputStream inputStream) {
        return (yb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yb parseFrom(com.google.v.v vVar) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<yb> parser() {
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
            return new yb();
        }
        if (iOrdinal == 4) {
            return new ya(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<yb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (yb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ya newBuilder(yb ybVar) {
        return (ya) DEFAULT_INSTANCE.createBuilder(ybVar);
    }

    public static yb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static yb parseFrom(com.google.v.z zVar) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static yb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static yb parseFrom(InputStream inputStream) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yb parseFrom(ByteBuffer byteBuffer) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static yb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static yb parseFrom(byte[] bArr) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static yb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (yb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
