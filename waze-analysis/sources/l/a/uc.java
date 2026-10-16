package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class uc extends com.google.v.du<uc, ub> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final uc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<uc> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;

    static {
        uc ucVar = new uc();
        DEFAULT_INSTANCE = ucVar;
        com.google.v.du.registerDefaultInstance(uc.class, ucVar);
    }

    private uc() {
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

    public static uc getDefaultInstance() {
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

    public static ub newBuilder() {
        return (ub) DEFAULT_INSTANCE.createBuilder();
    }

    public static uc parseDelimitedFrom(InputStream inputStream) {
        return (uc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uc parseFrom(com.google.v.v vVar) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<uc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "regulationFlags_", "context_"});
        }
        if (iOrdinal == 3) {
            return new uc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ub(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<uc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (uc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
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

    public static ub newBuilder(uc ucVar) {
        return (ub) DEFAULT_INSTANCE.createBuilder(ucVar);
    }

    public static uc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static uc parseFrom(com.google.v.z zVar) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static uc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static uc parseFrom(InputStream inputStream) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static uc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static uc parseFrom(ByteBuffer byteBuffer) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static uc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static uc parseFrom(byte[] bArr) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static uc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (uc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
