package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ng extends com.google.v.du<ng, nf> implements nh {
    private static final ng DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INDEX_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ng> PARSER;
    private int bitField0_;
    private com.google.k.a.a.b.bw id_;
    private int index_;
    private byte memoizedIsInitialized = 2;

    static {
        ng ngVar = new ng();
        DEFAULT_INSTANCE = ngVar;
        com.google.v.du.registerDefaultInstance(ng.class, ngVar);
    }

    private ng() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -3;
        this.index_ = 0;
    }

    public static ng getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.id_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.id_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static nf newBuilder() {
        return (nf) DEFAULT_INSTANCE.createBuilder();
    }

    public static ng parseDelimitedFrom(InputStream inputStream) {
        return (ng) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ng parseFrom(com.google.v.v vVar) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ng> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.id_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 2;
        this.index_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003င\u0001", new Object[]{"bitField0_", "id_", "index_"});
            case 3:
                return new ng();
            case 4:
                return new nf(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ng> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ng.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public com.google.k.a.a.b.bw getId() {
        com.google.k.a.a.b.bw bwVar = this.id_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public int getIndex() {
        return this.index_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 2) != 0;
    }

    public static nf newBuilder(ng ngVar) {
        return (nf) DEFAULT_INSTANCE.createBuilder(ngVar);
    }

    public static ng parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ng) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ng parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ng parseFrom(com.google.v.z zVar) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ng parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ng parseFrom(InputStream inputStream) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ng parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ng parseFrom(ByteBuffer byteBuffer) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ng parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ng parseFrom(byte[] bArr) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ng parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ng) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
