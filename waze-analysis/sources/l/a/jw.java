package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class jw extends com.google.v.du<jw, jv> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final jw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jw> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;

    static {
        jw jwVar = new jw();
        DEFAULT_INSTANCE = jwVar;
        com.google.v.du.registerDefaultInstance(jw.class, jwVar);
    }

    private jw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -2;
    }

    public static jw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegulationFlags(auc aucVar) {
        Objects.requireNonNull(aucVar);
        auc aucVar2 = this.regulationFlags_;
        if (aucVar2 != null && aucVar2 != auc.getDefaultInstance()) {
            aub aubVarNewBuilder = auc.newBuilder(aucVar2);
            aubVarNewBuilder.mergeFrom((aub) aucVar);
            aucVar = aubVarNewBuilder.buildPartial();
        }
        this.regulationFlags_ = aucVar;
        this.bitField0_ |= 1;
    }

    public static jv newBuilder() {
        return (jv) DEFAULT_INSTANCE.createBuilder();
    }

    public static jw parseDelimitedFrom(InputStream inputStream) {
        return (jw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jw parseFrom(com.google.v.v vVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ju juVar) {
        this.action_ = juVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(aoh aohVar) {
        this.context_ = aohVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegulationFlags(auc aucVar) {
        Objects.requireNonNull(aucVar);
        this.regulationFlags_ = aucVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "regulationFlags_", "action_", "context_"});
        }
        if (iOrdinal == 3) {
            return new jw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ju getAction() {
        int i2 = this.action_;
        ju juVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ju.CONTINUE : ju.CANCEL : ju.ACTION_UNSPECIFIED;
        return juVar == null ? ju.UNRECOGNIZED : juVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public aoh getContext() {
        aoh aohVarA = aoh.a(this.context_);
        return aohVarA == null ? aoh.UNRECOGNIZED : aohVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public auc getRegulationFlags() {
        auc aucVar = this.regulationFlags_;
        return aucVar == null ? auc.getDefaultInstance() : aucVar;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jv newBuilder(jw jwVar) {
        return (jv) DEFAULT_INSTANCE.createBuilder(jwVar);
    }

    public static jw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jw parseFrom(com.google.v.z zVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jw parseFrom(InputStream inputStream) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jw parseFrom(ByteBuffer byteBuffer) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jw parseFrom(byte[] bArr) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
