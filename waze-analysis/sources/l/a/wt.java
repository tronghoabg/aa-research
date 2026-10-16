package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wt extends com.google.v.du<wt, ws> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final wt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<wt> PARSER;
    private int action_;

    static {
        wt wtVar = new wt();
        DEFAULT_INSTANCE = wtVar;
        com.google.v.du.registerDefaultInstance(wt.class, wtVar);
    }

    private wt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    public static wt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ws newBuilder() {
        return (ws) DEFAULT_INSTANCE.createBuilder();
    }

    public static wt parseDelimitedFrom(InputStream inputStream) {
        return (wt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wt parseFrom(com.google.v.v vVar) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(wr wrVar) {
        this.action_ = wrVar.getNumber();
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
            return new wt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ws(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public wr getAction() {
        int i2 = this.action_;
        wr wrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : wr.SKIP : wr.DONE : wr.TAXI : wr.PRIVATE : wr.MOTORCYCLE : wr.ACTION_UNSPECIFIED;
        return wrVar == null ? wr.UNRECOGNIZED : wrVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public static ws newBuilder(wt wtVar) {
        return (ws) DEFAULT_INSTANCE.createBuilder(wtVar);
    }

    public static wt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wt parseFrom(com.google.v.z zVar) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wt parseFrom(InputStream inputStream) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wt parseFrom(ByteBuffer byteBuffer) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wt parseFrom(byte[] bArr) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
