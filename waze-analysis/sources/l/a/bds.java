package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bds extends com.google.v.du<bds, bdr> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final bds DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bds> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;
    private int type_;

    static {
        bds bdsVar = new bds();
        DEFAULT_INSTANCE = bdsVar;
        com.google.v.du.registerDefaultInstance(bds.class, bdsVar);
    }

    private bds() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static bds getDefaultInstance() {
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

    public static bdr newBuilder() {
        return (bdr) DEFAULT_INSTANCE.createBuilder();
    }

    public static bds parseDelimitedFrom(InputStream inputStream) {
        return (bds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bds parseFrom(com.google.v.v vVar) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bds> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bdq bdqVar) {
        this.action_ = bdqVar.getNumber();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(aol aolVar) {
        this.type_ = aolVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f\u0004\f", new Object[]{"bitField0_", "regulationFlags_", "context_", "type_", "action_"});
        }
        if (iOrdinal == 3) {
            return new bds();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bdr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bds> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bds.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bdq getAction() {
        int i2 = this.action_;
        bdq bdqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bdq.GOOGLE : bdq.EMAIL : bdq.CONTINUE_AS_GUEST : bdq.CLOSE : bdq.BACK : bdq.ACTION_UNSPECIFIED;
        return bdqVar == null ? bdq.UNRECOGNIZED : bdqVar;
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

    public aol getType() {
        aol aolVarA = aol.a(this.type_);
        return aolVarA == null ? aol.UNRECOGNIZED : aolVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bdr newBuilder(bds bdsVar) {
        return (bdr) DEFAULT_INSTANCE.createBuilder(bdsVar);
    }

    public static bds parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bds parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bds parseFrom(com.google.v.z zVar) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bds parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bds parseFrom(InputStream inputStream) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bds parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bds parseFrom(ByteBuffer byteBuffer) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bds parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bds parseFrom(byte[] bArr) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bds parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
