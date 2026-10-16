package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class amz extends com.google.v.du<amz, amy> implements com.google.v.fj {
    private static final amz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<amz> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    private int bitField0_;
    private auc regulationFlags_;

    static {
        amz amzVar = new amz();
        DEFAULT_INSTANCE = amzVar;
        com.google.v.du.registerDefaultInstance(amz.class, amzVar);
    }

    private amz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -2;
    }

    public static amz getDefaultInstance() {
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

    public static amy newBuilder() {
        return (amy) DEFAULT_INSTANCE.createBuilder();
    }

    public static amz parseDelimitedFrom(InputStream inputStream) {
        return (amz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amz parseFrom(com.google.v.v vVar) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<amz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "regulationFlags_"});
        }
        if (iOrdinal == 3) {
            return new amz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<amz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (amz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public auc getRegulationFlags() {
        auc aucVar = this.regulationFlags_;
        return aucVar == null ? auc.getDefaultInstance() : aucVar;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static amy newBuilder(amz amzVar) {
        return (amy) DEFAULT_INSTANCE.createBuilder(amzVar);
    }

    public static amz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static amz parseFrom(com.google.v.z zVar) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static amz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static amz parseFrom(InputStream inputStream) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amz parseFrom(ByteBuffer byteBuffer) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static amz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static amz parseFrom(byte[] bArr) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static amz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (amz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
