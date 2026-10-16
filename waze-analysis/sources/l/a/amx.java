package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class amx extends com.google.v.du<amx, amw> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final amx DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<amx> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private auc regulationFlags_;

    static {
        amx amxVar = new amx();
        DEFAULT_INSTANCE = amxVar;
        com.google.v.du.registerDefaultInstance(amx.class, amxVar);
    }

    private amx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -2;
    }

    public static amx getDefaultInstance() {
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

    public static amw newBuilder() {
        return (amw) DEFAULT_INSTANCE.createBuilder();
    }

    public static amx parseDelimitedFrom(InputStream inputStream) {
        return (amx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amx parseFrom(com.google.v.v vVar) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<amx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(amv amvVar) {
        this.action_ = amvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "action_", "regulationFlags_"});
        }
        if (iOrdinal == 3) {
            return new amx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new amw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<amx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (amx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public amv getAction() {
        int i2 = this.action_;
        amv amvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : amv.URL_CLICKED : amv.CANCEL : amv.AGREE : amv.ACTION_UNSPECIFIED;
        return amvVar == null ? amv.UNRECOGNIZED : amvVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public auc getRegulationFlags() {
        auc aucVar = this.regulationFlags_;
        return aucVar == null ? auc.getDefaultInstance() : aucVar;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static amw newBuilder(amx amxVar) {
        return (amw) DEFAULT_INSTANCE.createBuilder(amxVar);
    }

    public static amx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static amx parseFrom(com.google.v.z zVar) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static amx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static amx parseFrom(InputStream inputStream) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static amx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static amx parseFrom(ByteBuffer byteBuffer) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static amx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static amx parseFrom(byte[] bArr) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static amx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (amx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
