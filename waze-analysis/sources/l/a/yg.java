package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yg extends com.google.v.du<yg, yf> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final yg DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<yg> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 2;
    private int action_;
    private int bitField0_;
    private auc regulationFlags_;

    static {
        yg ygVar = new yg();
        DEFAULT_INSTANCE = ygVar;
        com.google.v.du.registerDefaultInstance(yg.class, ygVar);
    }

    private yg() {
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

    public static yg getDefaultInstance() {
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

    public static yf newBuilder() {
        return (yf) DEFAULT_INSTANCE.createBuilder();
    }

    public static yg parseDelimitedFrom(InputStream inputStream) {
        return (yg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yg parseFrom(com.google.v.v vVar) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<yg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ye yeVar) {
        this.action_ = yeVar.getNumber();
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
            return new yg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new yf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<yg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (yg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ye getAction() {
        int i2 = this.action_;
        ye yeVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ye.DECLINE : ye.BACK : ye.ACCEPT : ye.ACTION_UNSPECIFIED;
        return yeVar == null ? ye.UNRECOGNIZED : yeVar;
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

    public static yf newBuilder(yg ygVar) {
        return (yf) DEFAULT_INSTANCE.createBuilder(ygVar);
    }

    public static yg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static yg parseFrom(com.google.v.z zVar) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static yg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static yg parseFrom(InputStream inputStream) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yg parseFrom(ByteBuffer byteBuffer) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static yg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static yg parseFrom(byte[] bArr) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static yg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (yg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
