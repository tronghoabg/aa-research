package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class acj extends com.google.v.du<acj, aci> implements com.google.v.fj {
    private static final acj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<acj> PARSER;

    static {
        acj acjVar = new acj();
        DEFAULT_INSTANCE = acjVar;
        com.google.v.du.registerDefaultInstance(acj.class, acjVar);
    }

    private acj() {
    }

    public static acj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aci newBuilder() {
        return (aci) DEFAULT_INSTANCE.createBuilder();
    }

    public static acj parseDelimitedFrom(InputStream inputStream) {
        return (acj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acj parseFrom(com.google.v.v vVar) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<acj> parser() {
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
            return new acj();
        }
        if (iOrdinal == 4) {
            return new aci(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<acj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (acj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static aci newBuilder(acj acjVar) {
        return (aci) DEFAULT_INSTANCE.createBuilder(acjVar);
    }

    public static acj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static acj parseFrom(com.google.v.z zVar) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static acj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static acj parseFrom(InputStream inputStream) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static acj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static acj parseFrom(ByteBuffer byteBuffer) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static acj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static acj parseFrom(byte[] bArr) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static acj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (acj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
