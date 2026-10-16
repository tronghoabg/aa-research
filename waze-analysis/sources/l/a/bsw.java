package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bsw extends com.google.v.du<bsw, bsv> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final bsw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bsw> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;

    static {
        bsw bswVar = new bsw();
        DEFAULT_INSTANCE = bswVar;
        com.google.v.du.registerDefaultInstance(bsw.class, bswVar);
    }

    private bsw() {
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

    public static bsw getDefaultInstance() {
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

    public static bsv newBuilder() {
        return (bsv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bsw parseDelimitedFrom(InputStream inputStream) {
        return (bsw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsw parseFrom(com.google.v.v vVar) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bsw> parser() {
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
            return new bsw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bsv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bsw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bsw.class) {
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

    public static bsv newBuilder(bsw bswVar) {
        return (bsv) DEFAULT_INSTANCE.createBuilder(bswVar);
    }

    public static bsw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bsw parseFrom(com.google.v.z zVar) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bsw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bsw parseFrom(InputStream inputStream) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bsw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bsw parseFrom(ByteBuffer byteBuffer) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bsw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bsw parseFrom(byte[] bArr) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bsw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bsw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
