package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ol extends com.google.v.du<ol, ok> implements om {
    public static final int COMPARISON_FIELD_NUMBER = 1;
    public static final int COMPARISON_OPERATOR_FIELD_NUMBER = 3;
    private static final ol DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ol> PARSER = null;
    public static final int WEIGHT_WITH_UNIT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int comparisonOperator_;
    private int comparison_;
    private op weightWithUnit_;

    static {
        ol olVar = new ol();
        DEFAULT_INSTANCE = olVar;
        com.google.v.du.registerDefaultInstance(ol.class, olVar);
    }

    private ol() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComparison() {
        this.bitField0_ &= -2;
        this.comparison_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComparisonOperator() {
        this.bitField0_ &= -5;
        this.comparisonOperator_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeightWithUnit() {
        this.weightWithUnit_ = null;
        this.bitField0_ &= -3;
    }

    public static ol getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeightWithUnit(op opVar) {
        Objects.requireNonNull(opVar);
        op opVar2 = this.weightWithUnit_;
        if (opVar2 != null && opVar2 != op.getDefaultInstance()) {
            on onVarNewBuilder = op.newBuilder(opVar2);
            onVarNewBuilder.mergeFrom((on) opVar);
            opVar = onVarNewBuilder.buildPartial();
        }
        this.weightWithUnit_ = opVar;
        this.bitField0_ |= 2;
    }

    public static ok newBuilder() {
        return (ok) DEFAULT_INSTANCE.createBuilder();
    }

    public static ol parseDelimitedFrom(InputStream inputStream) {
        return (ol) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ol parseFrom(com.google.v.v vVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ol> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComparison(bk bkVar) {
        this.comparison_ = bkVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComparisonOperator(com.google.w.g.a.b bVar) {
        this.comparisonOperator_ = bVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeightWithUnit(op opVar) {
        Objects.requireNonNull(opVar);
        this.weightWithUnit_ = opVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "comparison_", h.f11876e, "weightWithUnit_", "comparisonOperator_", com.google.w.g.a.b.a()});
        }
        if (iOrdinal == 3) {
            return new ol();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ok(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ol> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ol.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bk getComparison() {
        bk bkVarA = bk.a(this.comparison_);
        return bkVarA == null ? bk.COMPARISONOPERATOR_UNKNOWN : bkVarA;
    }

    public com.google.w.g.a.b getComparisonOperator() {
        com.google.w.g.a.b bVarB = com.google.w.g.a.b.b(this.comparisonOperator_);
        return bVarB == null ? com.google.w.g.a.b.UNSPECIFIED : bVarB;
    }

    public op getWeightWithUnit() {
        op opVar = this.weightWithUnit_;
        return opVar == null ? op.getDefaultInstance() : opVar;
    }

    public boolean hasComparison() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasComparisonOperator() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWeightWithUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ok newBuilder(ol olVar) {
        return (ok) DEFAULT_INSTANCE.createBuilder(olVar);
    }

    public static ol parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ol) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ol parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ol parseFrom(com.google.v.z zVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ol parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ol parseFrom(InputStream inputStream) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ol parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ol parseFrom(ByteBuffer byteBuffer) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ol parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ol parseFrom(byte[] bArr) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ol parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
