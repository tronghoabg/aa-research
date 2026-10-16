package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class mp extends com.google.v.du<mp, mo> implements mq {
    public static final int CLUSTER_FIELD_NUMBER = 2;
    private static final mp DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<mp> PARSER;
    private int bitField0_;
    private com.google.k.a.a.b.bw cluster_;
    private int index_;
    private byte memoizedIsInitialized = 2;

    static {
        mp mpVar = new mp();
        DEFAULT_INSTANCE = mpVar;
        com.google.v.du.registerDefaultInstance(mp.class, mpVar);
    }

    private mp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCluster() {
        this.cluster_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0;
    }

    public static mp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCluster(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.cluster_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.cluster_ = bwVar;
        this.bitField0_ |= 2;
    }

    public static mo newBuilder() {
        return (mo) DEFAULT_INSTANCE.createBuilder();
    }

    public static mp parseDelimitedFrom(InputStream inputStream) {
        return (mp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mp parseFrom(com.google.v.v vVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<mp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCluster(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.cluster_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "index_", "cluster_"});
            case 3:
                return new mp();
            case 4:
                return new mo(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<mp> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (mp.class) {
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

    public com.google.k.a.a.b.bw getCluster() {
        com.google.k.a.a.b.bw bwVar = this.cluster_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public int getIndex() {
        return this.index_;
    }

    public boolean hasCluster() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mo newBuilder(mp mpVar) {
        return (mo) DEFAULT_INSTANCE.createBuilder(mpVar);
    }

    public static mp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static mp parseFrom(com.google.v.z zVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static mp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static mp parseFrom(InputStream inputStream) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static mp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static mp parseFrom(ByteBuffer byteBuffer) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static mp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static mp parseFrom(byte[] bArr) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static mp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (mp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
