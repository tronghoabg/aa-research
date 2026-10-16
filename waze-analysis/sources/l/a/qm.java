package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qm extends com.google.v.du<qm, qk> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final qm DEFAULT_INSTANCE;
    public static final int FALLBACK_REASON_FIELD_NUMBER = 5;
    public static final int FALLBACK_TO_LOCAL_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<qm> PARSER = null;
    public static final int TOTAL_CARDS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int context_;
    private int fallbackReason_;
    private boolean fallbackToLocal_;
    private long totalCards_;

    static {
        qm qmVar = new qm();
        DEFAULT_INSTANCE = qmVar;
        com.google.v.du.registerDefaultInstance(qm.class, qmVar);
    }

    private qm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFallbackReason() {
        this.fallbackReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFallbackToLocal() {
        this.bitField0_ &= -3;
        this.fallbackToLocal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalCards() {
        this.bitField0_ &= -2;
        this.totalCards_ = 0L;
    }

    public static qm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qk newBuilder() {
        return (qk) DEFAULT_INSTANCE.createBuilder();
    }

    public static qm parseDelimitedFrom(InputStream inputStream) {
        return (qm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qm parseFrom(com.google.v.v vVar) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(qg qgVar) {
        this.context_ = qgVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallbackReason(ql qlVar) {
        this.fallbackReason_ = qlVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallbackReasonValue(int i2) {
        this.fallbackReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallbackToLocal(boolean z) {
        this.bitField0_ |= 2;
        this.fallbackToLocal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalCards(long j2) {
        this.bitField0_ |= 1;
        this.totalCards_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0003ဂ\u0000\u0004ဇ\u0001\u0005\f", new Object[]{"bitField0_", "context_", "totalCards_", "fallbackToLocal_", "fallbackReason_"});
        }
        if (iOrdinal == 3) {
            return new qm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public qg getContext() {
        qg qgVarA = qg.a(this.context_);
        return qgVarA == null ? qg.UNRECOGNIZED : qgVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public ql getFallbackReason() {
        int i2 = this.fallbackReason_;
        ql qlVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ql.SUGGESTIONS_DISABLED : ql.LOADING_ERROR : ql.TIMEOUT : ql.FALLBACK_REASON_UNSPECIFIED;
        return qlVar == null ? ql.UNRECOGNIZED : qlVar;
    }

    public int getFallbackReasonValue() {
        return this.fallbackReason_;
    }

    public boolean getFallbackToLocal() {
        return this.fallbackToLocal_;
    }

    public long getTotalCards() {
        return this.totalCards_;
    }

    public boolean hasFallbackToLocal() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTotalCards() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qk newBuilder(qm qmVar) {
        return (qk) DEFAULT_INSTANCE.createBuilder(qmVar);
    }

    public static qm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qm parseFrom(com.google.v.z zVar) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qm parseFrom(InputStream inputStream) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qm parseFrom(ByteBuffer byteBuffer) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qm parseFrom(byte[] bArr) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
