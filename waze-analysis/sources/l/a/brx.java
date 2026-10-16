package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class brx extends com.google.v.du<brx, brw> implements com.google.v.fj {
    public static final int ANSWER_FIELD_NUMBER = 1;
    private static final brx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<brx> PARSER;
    private int answer_;

    static {
        brx brxVar = new brx();
        DEFAULT_INSTANCE = brxVar;
        com.google.v.du.registerDefaultInstance(brx.class, brxVar);
    }

    private brx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        this.answer_ = 0;
    }

    public static brx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static brw newBuilder() {
        return (brw) DEFAULT_INSTANCE.createBuilder();
    }

    public static brx parseDelimitedFrom(InputStream inputStream) {
        return (brx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brx parseFrom(com.google.v.v vVar) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<brx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswer(brv brvVar) {
        this.answer_ = brvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerValue(int i2) {
        this.answer_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"answer_"});
        }
        if (iOrdinal == 3) {
            return new brx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new brw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<brx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (brx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public brv getAnswer() {
        int i2 = this.answer_;
        brv brvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : brv.WAZE_ASKS_ANSWER_NO : brv.WAZE_ASKS_ANSWER_YES : brv.ANSWER_UNSPECIFIED;
        return brvVar == null ? brv.UNRECOGNIZED : brvVar;
    }

    public int getAnswerValue() {
        return this.answer_;
    }

    public static brw newBuilder(brx brxVar) {
        return (brw) DEFAULT_INSTANCE.createBuilder(brxVar);
    }

    public static brx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static brx parseFrom(com.google.v.z zVar) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static brx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static brx parseFrom(InputStream inputStream) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static brx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static brx parseFrom(ByteBuffer byteBuffer) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static brx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static brx parseFrom(byte[] bArr) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static brx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (brx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
