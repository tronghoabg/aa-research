package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bss extends com.google.v.du<bss, bsr> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final bss DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bss> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    private int action_;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;

    static {
        bss bssVar = new bss();
        DEFAULT_INSTANCE = bssVar;
        com.google.v.du.registerDefaultInstance(bss.class, bssVar);
    }

    private bss() {
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

    public static bss getDefaultInstance() {
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

    public static bsr newBuilder() {
        return (bsr) DEFAULT_INSTANCE.createBuilder();
    }

    public static bss parseDelimitedFrom(InputStream inputStream) {
        return (bss) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bss parseFrom(com.google.v.v vVar) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bss> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bsq bsqVar) {
        this.action_ = bsqVar.getNumber();
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
            return new bss();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bsr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bss> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bss.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bsq getAction() {
        bsq bsqVar;
        switch (this.action_) {
            case 0:
                bsqVar = bsq.ACTION_UNSPECIFIED;
                break;
            case 1:
                bsqVar = bsq.BACK;
                break;
            case 2:
                bsqVar = bsq.GET_STARTED;
                break;
            case 3:
                bsqVar = bsq.LOGIN;
                break;
            case 4:
                bsqVar = bsq.PRIVACY_POLICY;
                break;
            case 5:
                bsqVar = bsq.TERMS_OF_SERVICE;
                break;
            case 6:
                bsqVar = bsq.CLICK;
                break;
            case 7:
                bsqVar = bsq.SWIPE;
                break;
            default:
                bsqVar = null;
                break;
        }
        return bsqVar == null ? bsq.UNRECOGNIZED : bsqVar;
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

    public static bsr newBuilder(bss bssVar) {
        return (bsr) DEFAULT_INSTANCE.createBuilder(bssVar);
    }

    public static bss parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bss) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bss parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bss parseFrom(com.google.v.z zVar) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bss parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bss parseFrom(InputStream inputStream) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bss parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bss parseFrom(ByteBuffer byteBuffer) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bss parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bss parseFrom(byte[] bArr) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bss parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
