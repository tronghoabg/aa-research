package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bkh extends com.google.v.du<bkh, bkg> implements com.google.v.fj {
    private static final bkh DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bkh> PARSER;

    static {
        bkh bkhVar = new bkh();
        DEFAULT_INSTANCE = bkhVar;
        com.google.v.du.registerDefaultInstance(bkh.class, bkhVar);
    }

    private bkh() {
    }

    public static bkh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bkg newBuilder() {
        return (bkg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bkh parseDelimitedFrom(InputStream inputStream) {
        return (bkh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkh parseFrom(com.google.v.v vVar) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bkh> parser() {
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
            return new bkh();
        }
        if (iOrdinal == 4) {
            return new bkg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bkh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bkh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static bkg newBuilder(bkh bkhVar) {
        return (bkg) DEFAULT_INSTANCE.createBuilder(bkhVar);
    }

    public static bkh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bkh parseFrom(com.google.v.z zVar) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bkh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bkh parseFrom(InputStream inputStream) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bkh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bkh parseFrom(ByteBuffer byteBuffer) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bkh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bkh parseFrom(byte[] bArr) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bkh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bkh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
