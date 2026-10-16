package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ok extends com.google.v.du<ok, oj> implements com.google.v.fj {
    public static final int CONVERSATION_ID_FIELD_NUMBER = 2;
    private static final ok DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ok> PARSER = null;
    public static final int UGC_CONTEXT_ID_FIELD_NUMBER = 1;
    private int mode_;
    private String ugcContextId_ = "";
    private String conversationId_ = "";

    static {
        ok okVar = new ok();
        DEFAULT_INSTANCE = okVar;
        com.google.v.du.registerDefaultInstance(ok.class, okVar);
    }

    private ok() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConversationId() {
        this.conversationId_ = getDefaultInstance().getConversationId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.mode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUgcContextId() {
        this.ugcContextId_ = getDefaultInstance().getUgcContextId();
    }

    public static ok getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oj newBuilder() {
        return (oj) DEFAULT_INSTANCE.createBuilder();
    }

    public static ok parseDelimitedFrom(InputStream inputStream) {
        return (ok) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ok parseFrom(com.google.v.v vVar) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ok> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationId(String str) {
        Objects.requireNonNull(str);
        this.conversationId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConversationIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.conversationId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMode(os osVar) {
        this.mode_ = osVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeValue(int i2) {
        this.mode_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextId(String str) {
        Objects.requireNonNull(str);
        this.ugcContextId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUgcContextIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ugcContextId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"ugcContextId_", "conversationId_", "mode_"});
        }
        if (iOrdinal == 3) {
            return new ok();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new oj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ok> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ok.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getConversationId() {
        return this.conversationId_;
    }

    public com.google.v.v getConversationIdBytes() {
        return com.google.v.v.s(this.conversationId_);
    }

    public os getMode() {
        os osVarA = os.a(this.mode_);
        return osVarA == null ? os.UNRECOGNIZED : osVarA;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public String getUgcContextId() {
        return this.ugcContextId_;
    }

    public com.google.v.v getUgcContextIdBytes() {
        return com.google.v.v.s(this.ugcContextId_);
    }

    public static oj newBuilder(ok okVar) {
        return (oj) DEFAULT_INSTANCE.createBuilder(okVar);
    }

    public static ok parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ok) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ok parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ok parseFrom(com.google.v.z zVar) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ok parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ok parseFrom(InputStream inputStream) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ok parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ok parseFrom(ByteBuffer byteBuffer) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ok parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ok parseFrom(byte[] bArr) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ok parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
