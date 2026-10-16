package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsy extends com.google.v.du<bsy, bsx> implements com.google.v.fj {
    private static final bsy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bsy> PARSER;

    static {
        bsy bsyVar = new bsy();
        DEFAULT_INSTANCE = bsyVar;
        com.google.v.du.registerDefaultInstance(bsy.class, bsyVar);
    }

    private bsy() {
    }

    public static bsy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bsx newBuilder() {
        return (bsx) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsy parseDelimitedFrom(InputStream inputStream) {
        return (bsy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsy parseFrom(com.google.v.v vVar) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsy> parser() {
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
            return new bsy();
        }
        if (iOrdinal == 4) {
            return new bsx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bsx newBuilder(bsy bsyVar) {
        return (bsx) DEFAULT_INSTANCE.createBuilder(bsyVar);
    }

    public static bsy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsy parseFrom(com.google.v.z zVar) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsy parseFrom(InputStream inputStream) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsy parseFrom(ByteBuffer byteBuffer) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsy parseFrom(byte[] bArr) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
