package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aye extends com.google.v.du<aye, ayd> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final aye DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<aye> PARSER;
    private int action_;

    static {
        aye ayeVar = new aye();
        DEFAULT_INSTANCE = ayeVar;
        com.google.v.du.registerDefaultInstance(aye.class, ayeVar);
    }

    private aye() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static aye getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ayd newBuilder() {
        return (ayd) DEFAULT_INSTANCE.createBuilder();
    }

    public static aye parseDelimitedFrom(InputStream inputStream) {
        return (aye) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aye parseFrom(com.google.v.v vVar) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aye> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ayc aycVar) {
        this.action_ = aycVar.getNumber();
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
            return new aye();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ayd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aye> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aye.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ayc getAction() {
        int i2 = this.action_;
        ayc aycVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ayc.CLOSE : ayc.SETTINGS : ayc.ACTION_UNSPECIFIED;
        return aycVar == null ? ayc.UNRECOGNIZED : aycVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static ayd newBuilder(aye ayeVar) {
        return (ayd) DEFAULT_INSTANCE.createBuilder(ayeVar);
    }

    public static aye parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aye) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aye parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aye parseFrom(com.google.v.z zVar) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aye parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aye parseFrom(InputStream inputStream) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aye parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aye parseFrom(ByteBuffer byteBuffer) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aye parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aye parseFrom(byte[] bArr) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aye parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aye) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
