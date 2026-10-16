package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajq extends com.google.v.du<ajq, ajp> implements com.google.v.fj {
    private static final ajq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajq> PARSER;

    static {
        ajq ajqVar = new ajq();
        DEFAULT_INSTANCE = ajqVar;
        com.google.v.du.registerDefaultInstance(ajq.class, ajqVar);
    }

    private ajq() {
    }

    public static ajq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ajp newBuilder() {
        return (ajp) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajq parseDelimitedFrom(InputStream inputStream) {
        return (ajq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajq parseFrom(com.google.v.v vVar) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajq> parser() {
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
            return new ajq();
        }
        if (iOrdinal == 4) {
            return new ajp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static ajp newBuilder(ajq ajqVar) {
        return (ajp) DEFAULT_INSTANCE.createBuilder(ajqVar);
    }

    public static ajq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajq parseFrom(com.google.v.z zVar) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajq parseFrom(InputStream inputStream) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajq parseFrom(ByteBuffer byteBuffer) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajq parseFrom(byte[] bArr) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
