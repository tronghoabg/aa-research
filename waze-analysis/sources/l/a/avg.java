package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class avg extends com.google.v.du<avg, avf> implements com.google.v.fj {
    private static final avg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<avg> PARSER;

    static {
        avg avgVar = new avg();
        DEFAULT_INSTANCE = avgVar;
        com.google.v.du.registerDefaultInstance(avg.class, avgVar);
    }

    private avg() {
    }

    public static avg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static avf newBuilder() {
        return (avf) DEFAULT_INSTANCE.createBuilder();
    }

    public static avg parseDelimitedFrom(InputStream inputStream) {
        return (avg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avg parseFrom(com.google.v.v vVar) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<avg> parser() {
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
            return new avg();
        }
        if (iOrdinal == 4) {
            return new avf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<avg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (avg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static avf newBuilder(avg avgVar) {
        return (avf) DEFAULT_INSTANCE.createBuilder(avgVar);
    }

    public static avg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static avg parseFrom(com.google.v.z zVar) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static avg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static avg parseFrom(InputStream inputStream) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static avg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static avg parseFrom(ByteBuffer byteBuffer) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static avg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static avg parseFrom(byte[] bArr) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static avg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (avg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
