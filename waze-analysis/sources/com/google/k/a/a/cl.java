package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cl extends com.google.v.du<cl, ck> implements cm {
    public static final int COMPARISON_OPERATOR_FIELD_NUMBER = 1;
    private static final cl DEFAULT_INSTANCE;
    public static final int DIMENSION_WITH_UNIT_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<cl> PARSER;
    private int bitField0_;
    private int comparisonOperator_;
    private cp dimensionWithUnit_;

    static {
        cl clVar = new cl();
        DEFAULT_INSTANCE = clVar;
        com.google.v.du.registerDefaultInstance(cl.class, clVar);
    }

    private cl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComparisonOperator() {
        this.bitField0_ &= -2;
        this.comparisonOperator_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDimensionWithUnit() {
        this.dimensionWithUnit_ = null;
        this.bitField0_ &= -3;
    }

    public static cl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDimensionWithUnit(cp cpVar) {
        Objects.requireNonNull(cpVar);
        cp cpVar2 = this.dimensionWithUnit_;
        if (cpVar2 != null && cpVar2 != cp.getDefaultInstance()) {
            cn cnVarNewBuilder = cp.newBuilder(cpVar2);
            cnVarNewBuilder.mergeFrom((cn) cpVar);
            cpVar = cnVarNewBuilder.buildPartial();
        }
        this.dimensionWithUnit_ = cpVar;
        this.bitField0_ |= 2;
    }

    public static ck newBuilder() {
        return (ck) DEFAULT_INSTANCE.createBuilder();
    }

    public static cl parseDelimitedFrom(InputStream inputStream) {
        return (cl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cl parseFrom(com.google.v.v vVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComparisonOperator(com.google.w.g.a.b bVar) {
        this.comparisonOperator_ = bVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDimensionWithUnit(cp cpVar) {
        Objects.requireNonNull(cpVar);
        this.dimensionWithUnit_ = cpVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "comparisonOperator_", com.google.w.g.a.b.a(), "dimensionWithUnit_"});
        }
        if (iOrdinal == 3) {
            return new cl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ck(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.w.g.a.b getComparisonOperator() {
        com.google.w.g.a.b bVarB = com.google.w.g.a.b.b(this.comparisonOperator_);
        return bVarB == null ? com.google.w.g.a.b.UNSPECIFIED : bVarB;
    }

    public cp getDimensionWithUnit() {
        cp cpVar = this.dimensionWithUnit_;
        return cpVar == null ? cp.getDefaultInstance() : cpVar;
    }

    public boolean hasComparisonOperator() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDimensionWithUnit() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ck newBuilder(cl clVar) {
        return (ck) DEFAULT_INSTANCE.createBuilder(clVar);
    }

    public static cl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cl parseFrom(com.google.v.z zVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cl parseFrom(InputStream inputStream) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cl parseFrom(ByteBuffer byteBuffer) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cl parseFrom(byte[] bArr) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
