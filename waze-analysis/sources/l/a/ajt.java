package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ajt extends com.google.v.du<ajt, ajs> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final ajt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ajt> PARSER;
    private int action_;

    static {
        ajt ajtVar = new ajt();
        DEFAULT_INSTANCE = ajtVar;
        com.google.v.du.registerDefaultInstance(ajt.class, ajtVar);
    }

    private ajt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static ajt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ajs newBuilder() {
        return (ajs) DEFAULT_INSTANCE.createBuilder();
    }

    public static ajt parseDelimitedFrom(InputStream inputStream) {
        return (ajt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajt parseFrom(com.google.v.v vVar) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ajt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ajr ajrVar) {
        this.action_ = ajrVar.getNumber();
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
            return new ajt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ajs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ajt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ajt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ajr getAction() {
        int i2 = this.action_;
        ajr ajrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ajr.SHARE : ajr.CLOSE : ajr.BACK : ajr.ACTION_UNSPECIFIED;
        return ajrVar == null ? ajr.UNRECOGNIZED : ajrVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static ajs newBuilder(ajt ajtVar) {
        return (ajs) DEFAULT_INSTANCE.createBuilder(ajtVar);
    }

    public static ajt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ajt parseFrom(com.google.v.z zVar) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ajt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ajt parseFrom(InputStream inputStream) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ajt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ajt parseFrom(ByteBuffer byteBuffer) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ajt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ajt parseFrom(byte[] bArr) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ajt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ajt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
