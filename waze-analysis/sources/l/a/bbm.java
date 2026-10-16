package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bbm extends com.google.v.du<bbm, bbl> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final bbm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bbm> PARSER;
    private int action_;

    static {
        bbm bbmVar = new bbm();
        DEFAULT_INSTANCE = bbmVar;
        com.google.v.du.registerDefaultInstance(bbm.class, bbmVar);
    }

    private bbm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static bbm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bbl newBuilder() {
        return (bbl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bbm parseDelimitedFrom(InputStream inputStream) {
        return (bbm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbm parseFrom(com.google.v.v vVar) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bbm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bbk bbkVar) {
        this.action_ = bbkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"action_"});
        }
        if (iOrdinal == 3) {
            return new bbm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bbl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bbm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bbm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bbk getAction() {
        int i2 = this.action_;
        bbk bbkVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bbk.DONE : bbk.SKIP : bbk.SET_WORK : bbk.SET_HOME : bbk.ACTION_UNSPECIFIED;
        return bbkVar == null ? bbk.UNRECOGNIZED : bbkVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static bbl newBuilder(bbm bbmVar) {
        return (bbl) DEFAULT_INSTANCE.createBuilder(bbmVar);
    }

    public static bbm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bbm parseFrom(com.google.v.z zVar) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bbm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bbm parseFrom(InputStream inputStream) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bbm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bbm parseFrom(ByteBuffer byteBuffer) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bbm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bbm parseFrom(byte[] bArr) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bbm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bbm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
