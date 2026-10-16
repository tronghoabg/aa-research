package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajo extends com.google.v.du<ajo, ajn> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ajo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajo> PARSER;
    private int action_;

    static {
        ajo ajoVar = new ajo();
        DEFAULT_INSTANCE = ajoVar;
        com.google.v.du.registerDefaultInstance(ajo.class, ajoVar);
    }

    private ajo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static ajo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ajn newBuilder() {
        return (ajn) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajo parseDelimitedFrom(InputStream inputStream) {
        return (ajo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajo parseFrom(com.google.v.v vVar) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ajm ajmVar) {
        this.action_ = ajmVar.getNumber();
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
            return new ajo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ajn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ajm getAction() {
        int i2 = this.action_;
        ajm ajmVar = i2 != 0 ? i2 != 1 ? null : ajm.OK : ajm.ACTION_UNSPECIFIED;
        return ajmVar == null ? ajm.UNRECOGNIZED : ajmVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static ajn newBuilder(ajo ajoVar) {
        return (ajn) DEFAULT_INSTANCE.createBuilder(ajoVar);
    }

    public static ajo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajo parseFrom(com.google.v.z zVar) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajo parseFrom(InputStream inputStream) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajo parseFrom(ByteBuffer byteBuffer) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajo parseFrom(byte[] bArr) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
