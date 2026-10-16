package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class tv extends com.google.v.du<tv, tu> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final tv DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<tv> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;

    static {
        tv tvVar = new tv();
        DEFAULT_INSTANCE = tvVar;
        com.google.v.du.registerDefaultInstance(tv.class, tvVar);
    }

    private tv() {
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

    public static tv getDefaultInstance() {
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

    public static tu newBuilder() {
        return (tu) DEFAULT_INSTANCE.createBuilder();
    }

    public static tv parseDelimitedFrom(InputStream inputStream) {
        return (tv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tv parseFrom(com.google.v.v vVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<tv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(tt ttVar) {
        this.action_ = ttVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f", new Object[]{"bitField0_", "regulationFlags_", "context_", "action_"});
        }
        if (iOrdinal == 3) {
            return new tv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new tu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<tv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (tv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public tt getAction() {
        int i2 = this.action_;
        tt ttVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : tt.CONTACT_SUPPORT : tt.RESEND_EMAIL : tt.ACTION_UNSPECIFIED;
        return ttVar == null ? tt.UNRECOGNIZED : ttVar;
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

    public static tu newBuilder(tv tvVar) {
        return (tu) DEFAULT_INSTANCE.createBuilder(tvVar);
    }

    public static tv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static tv parseFrom(com.google.v.z zVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static tv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static tv parseFrom(InputStream inputStream) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static tv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static tv parseFrom(ByteBuffer byteBuffer) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static tv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static tv parseFrom(byte[] bArr) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static tv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (tv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
