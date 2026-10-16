package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bm extends com.google.v.du<bm, bl> implements bn {
    public static final int COMPARISON_OPERATOR_FIELD_NUMBER = 1;
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final bm DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bm> PARSER;
    private int bitField0_;
    private int comparisonOperator_;
    private int count_;

    static {
        bm bmVar = new bm();
        DEFAULT_INSTANCE = bmVar;
        com.google.v.du.registerDefaultInstance(bm.class, bmVar);
    }

    private bm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearComparisonOperator() {
        this.bitField0_ &= -2;
        this.comparisonOperator_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.bitField0_ &= -3;
        this.count_ = 0;
    }

    public static bm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bl newBuilder() {
        return (bl) DEFAULT_INSTANCE.createBuilder();
    }

    public static bm parseDelimitedFrom(InputStream inputStream) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(com.google.v.v vVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComparisonOperator(com.google.w.g.a.b bVar) {
        this.comparisonOperator_ = bVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i2) {
        this.bitField0_ |= 2;
        this.count_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"bitField0_", "comparisonOperator_", com.google.w.g.a.b.a(), "count_"});
        }
        if (iOrdinal == 3) {
            return new bm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bm.class) {
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

    public int getCount() {
        return this.count_;
    }

    public boolean hasComparisonOperator() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bl newBuilder(bm bmVar) {
        return (bl) DEFAULT_INSTANCE.createBuilder(bmVar);
    }

    public static bm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bm parseFrom(com.google.v.z zVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bm parseFrom(InputStream inputStream) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(ByteBuffer byteBuffer) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bm parseFrom(byte[] bArr) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
