package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yj extends com.google.v.du<yj, yh> implements com.google.v.fj {
    private static final yj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<yj> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    public static final int VIEW_FIELD_NUMBER = 2;
    private int bitField0_;
    private auc regulationFlags_;
    private int view_;

    static {
        yj yjVar = new yj();
        DEFAULT_INSTANCE = yjVar;
        com.google.v.du.registerDefaultInstance(yj.class, yjVar);
    }

    private yj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearView() {
        this.view_ = 0;
    }

    public static yj getDefaultInstance() {
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

    public static yh newBuilder() {
        return (yh) DEFAULT_INSTANCE.createBuilder();
    }

    public static yj parseDelimitedFrom(InputStream inputStream) {
        return (yj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yj parseFrom(com.google.v.v vVar) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<yj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegulationFlags(auc aucVar) {
        Objects.requireNonNull(aucVar);
        this.regulationFlags_ = aucVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setView(yi yiVar) {
        this.view_ = yiVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewValue(int i2) {
        this.view_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "regulationFlags_", "view_"});
        }
        if (iOrdinal == 3) {
            return new yj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new yh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<yj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (yj.class) {
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

    public yi getView() {
        int i2 = this.view_;
        yi yiVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : yi.UNDER_18 : yi.REGULAR : yi.VIEW_UNSPECIFIED;
        return yiVar == null ? yi.UNRECOGNIZED : yiVar;
    }

    public int getViewValue() {
        return this.view_;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static yh newBuilder(yj yjVar) {
        return (yh) DEFAULT_INSTANCE.createBuilder(yjVar);
    }

    public static yj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static yj parseFrom(com.google.v.z zVar) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static yj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static yj parseFrom(InputStream inputStream) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yj parseFrom(ByteBuffer byteBuffer) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static yj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static yj parseFrom(byte[] bArr) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static yj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (yj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
