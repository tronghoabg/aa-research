package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ahc extends com.google.v.du<ahc, ahb> implements com.google.v.fj {
    private static final ahc DEFAULT_INSTANCE;
    public static final int IS_FIRST_SESSION_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ahc> PARSER;
    private boolean isFirstSession_;

    static {
        ahc ahcVar = new ahc();
        DEFAULT_INSTANCE = ahcVar;
        com.google.v.du.registerDefaultInstance(ahc.class, ahcVar);
    }

    private ahc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFirstSession() {
        this.isFirstSession_ = false;
    }

    public static ahc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ahb newBuilder() {
        return (ahb) DEFAULT_INSTANCE.createBuilder();
    }

    public static ahc parseDelimitedFrom(InputStream inputStream) {
        return (ahc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahc parseFrom(com.google.v.v vVar) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ahc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstSession(boolean z) {
        this.isFirstSession_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isFirstSession_"});
        }
        if (iOrdinal == 3) {
            return new ahc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ahb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ahc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ahc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsFirstSession() {
        return this.isFirstSession_;
    }

    public static ahb newBuilder(ahc ahcVar) {
        return (ahb) DEFAULT_INSTANCE.createBuilder(ahcVar);
    }

    public static ahc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ahc parseFrom(com.google.v.z zVar) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ahc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ahc parseFrom(InputStream inputStream) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ahc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ahc parseFrom(ByteBuffer byteBuffer) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ahc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ahc parseFrom(byte[] bArr) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ahc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ahc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
