package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hr extends com.google.v.du<hr, hq> implements com.google.v.fj {
    private static final hr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hr> PARSER;

    static {
        hr hrVar = new hr();
        DEFAULT_INSTANCE = hrVar;
        com.google.v.du.registerDefaultInstance(hr.class, hrVar);
    }

    private hr() {
    }

    public static hr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hq newBuilder() {
        return (hq) DEFAULT_INSTANCE.createBuilder();
    }

    public static hr parseDelimitedFrom(InputStream inputStream) {
        return (hr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hr parseFrom(com.google.v.v vVar) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hr> parser() {
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
            return new hr();
        }
        if (iOrdinal == 4) {
            return new hq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public static hq newBuilder(hr hrVar) {
        return (hq) DEFAULT_INSTANCE.createBuilder(hrVar);
    }

    public static hr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hr parseFrom(com.google.v.z zVar) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hr parseFrom(InputStream inputStream) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hr parseFrom(ByteBuffer byteBuffer) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hr parseFrom(byte[] bArr) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
