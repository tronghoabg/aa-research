package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ath extends com.google.v.du<ath, atg> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final ath DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ath> PARSER;
    private int action_;
    private int context_;

    static {
        ath athVar = new ath();
        DEFAULT_INSTANCE = athVar;
        com.google.v.du.registerDefaultInstance(ath.class, athVar);
    }

    private ath() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    public static ath getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static atg newBuilder() {
        return (atg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ath parseDelimitedFrom(InputStream inputStream) {
        return (ath) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ath parseFrom(com.google.v.v vVar) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ath> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(atf atfVar) {
        this.action_ = atfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(atk atkVar) {
        this.context_ = atkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"action_", "context_"});
        }
        if (iOrdinal == 3) {
            return new ath();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new atg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ath> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ath.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public atf getAction() {
        int i2 = this.action_;
        atf atfVar = i2 != 0 ? i2 != 1 ? null : atf.VIEW_ALL_NAVIGATION_SETTINGS : atf.ACTION_UNSPECIFIED;
        return atfVar == null ? atf.UNRECOGNIZED : atfVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public atk getContext() {
        atk atkVarA = atk.a(this.context_);
        return atkVarA == null ? atk.UNRECOGNIZED : atkVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public static atg newBuilder(ath athVar) {
        return (atg) DEFAULT_INSTANCE.createBuilder(athVar);
    }

    public static ath parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ath) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ath parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ath parseFrom(com.google.v.z zVar) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ath parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ath parseFrom(InputStream inputStream) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ath parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ath parseFrom(ByteBuffer byteBuffer) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ath parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ath parseFrom(byte[] bArr) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ath parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ath) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
