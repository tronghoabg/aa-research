package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends com.google.v.du<bj, ba> implements com.google.v.fj {
    private static final bj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bj> PARSER = null;
    public static final int TRS_AFFINE_TRANSFORM_FIELD_NUMBER = 1;
    private int bitField0_;
    private bi trsAffineTransform_;

    static {
        bj bjVar = new bj();
        DEFAULT_INSTANCE = bjVar;
        com.google.v.du.registerDefaultInstance(bj.class, bjVar);
    }

    private bj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrsAffineTransform() {
        this.trsAffineTransform_ = null;
        this.bitField0_ &= -2;
    }

    public static bj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrsAffineTransform(bi biVar) {
        Objects.requireNonNull(biVar);
        bi biVar2 = this.trsAffineTransform_;
        if (biVar2 != null && biVar2 != bi.getDefaultInstance()) {
            bb bbVarNewBuilder = bi.newBuilder(biVar2);
            bbVarNewBuilder.mergeFrom((bb) biVar);
            biVar = bbVarNewBuilder.buildPartial();
        }
        this.trsAffineTransform_ = biVar;
        this.bitField0_ |= 1;
    }

    public static ba newBuilder() {
        return (ba) DEFAULT_INSTANCE.createBuilder();
    }

    public static bj parseDelimitedFrom(InputStream inputStream) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(com.google.v.v vVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrsAffineTransform(bi biVar) {
        Objects.requireNonNull(biVar);
        this.trsAffineTransform_ = biVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "trsAffineTransform_"});
        }
        if (iOrdinal == 3) {
            return new bj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ba(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bi getTrsAffineTransform() {
        bi biVar = this.trsAffineTransform_;
        return biVar == null ? bi.getDefaultInstance() : biVar;
    }

    public boolean hasTrsAffineTransform() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ba newBuilder(bj bjVar) {
        return (ba) DEFAULT_INSTANCE.createBuilder(bjVar);
    }

    public static bj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bj parseFrom(com.google.v.z zVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bj parseFrom(InputStream inputStream) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(ByteBuffer byteBuffer) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bj parseFrom(byte[] bArr) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
