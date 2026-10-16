package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class sj extends com.google.v.du<sj, si> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final sj DEFAULT_INSTANCE;
    public static final int GOOGLE_ASSISTANT_AVAILABLE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<sj> PARSER;
    private int action_;
    private int bitField0_;
    private boolean googleAssistantAvailable_;

    static {
        sj sjVar = new sj();
        DEFAULT_INSTANCE = sjVar;
        com.google.v.du.registerDefaultInstance(sj.class, sjVar);
    }

    private sj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAssistantAvailable() {
        this.bitField0_ &= -2;
        this.googleAssistantAvailable_ = false;
    }

    public static sj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static si newBuilder() {
        return (si) DEFAULT_INSTANCE.createBuilder();
    }

    public static sj parseDelimitedFrom(InputStream inputStream) {
        return (sj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sj parseFrom(com.google.v.v vVar) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(sh shVar) {
        this.action_ = shVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAssistantAvailable(boolean z) {
        this.bitField0_ |= 1;
        this.googleAssistantAvailable_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000", new Object[]{"bitField0_", "action_", "googleAssistantAvailable_"});
        }
        if (iOrdinal == 3) {
            return new sj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new si(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<sj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (sj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public sh getAction() {
        int i2 = this.action_;
        sh shVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : sh.TRY_AGAIN : sh.CHANGE_LANGUAGE : sh.CLOSE : sh.ACTION_UNSPECIFIED;
        return shVar == null ? sh.UNRECOGNIZED : shVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getGoogleAssistantAvailable() {
        return this.googleAssistantAvailable_;
    }

    public boolean hasGoogleAssistantAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public static si newBuilder(sj sjVar) {
        return (si) DEFAULT_INSTANCE.createBuilder(sjVar);
    }

    public static sj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sj parseFrom(com.google.v.z zVar) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static sj parseFrom(InputStream inputStream) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sj parseFrom(ByteBuffer byteBuffer) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sj parseFrom(byte[] bArr) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
