package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ey extends com.google.v.du<ey, ex> implements com.google.v.fj {
    private static final ey DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ey> PARSER;

    static {
        ey eyVar = new ey();
        DEFAULT_INSTANCE = eyVar;
        com.google.v.du.registerDefaultInstance(ey.class, eyVar);
    }

    private ey() {
    }

    public static ey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ex newBuilder() {
        return (ex) DEFAULT_INSTANCE.createBuilder();
    }

    public static ey parseDelimitedFrom(InputStream inputStream) {
        return (ey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ey parseFrom(com.google.v.v vVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ey> parser() {
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
            return new ey();
        }
        if (iOrdinal == 4) {
            return new ex(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ey> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ey.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ex newBuilder(ey eyVar) {
        return (ex) DEFAULT_INSTANCE.createBuilder(eyVar);
    }

    public static ey parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ey) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ey parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ey parseFrom(com.google.v.z zVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ey parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ey parseFrom(InputStream inputStream) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ey parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ey parseFrom(ByteBuffer byteBuffer) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ey parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ey parseFrom(byte[] bArr) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ey parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ey) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
