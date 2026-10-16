package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ms extends com.google.v.du<ms, mr> implements com.google.v.fj {
    private static final ms DEFAULT_INSTANCE;
    public static final int INDEXED_TOLL_CLUSTERS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ms> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<mp> indexedTollClusters_ = emptyProtobufList();

    static {
        ms msVar = new ms();
        DEFAULT_INSTANCE = msVar;
        com.google.v.du.registerDefaultInstance(ms.class, msVar);
    }

    private ms() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIndexedTollClusters(Iterable<? extends mp> iterable) {
        ensureIndexedTollClustersIsMutable();
        com.google.v.c.addAll(iterable, this.indexedTollClusters_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIndexedTollClusters(int i2, mp mpVar) {
        Objects.requireNonNull(mpVar);
        ensureIndexedTollClustersIsMutable();
        this.indexedTollClusters_.add(i2, mpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndexedTollClusters() {
        this.indexedTollClusters_ = emptyProtobufList();
    }

    private void ensureIndexedTollClustersIsMutable() {
        com.google.v.eo<mp> eoVar = this.indexedTollClusters_;
        if (eoVar.c()) {
            return;
        }
        this.indexedTollClusters_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ms getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static mr newBuilder() {
        return (mr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ms parseDelimitedFrom(InputStream inputStream) {
        return (ms) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ms parseFrom(com.google.v.v vVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ms> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIndexedTollClusters(int i2) {
        ensureIndexedTollClustersIsMutable();
        this.indexedTollClusters_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndexedTollClusters(int i2, mp mpVar) {
        Objects.requireNonNull(mpVar);
        ensureIndexedTollClustersIsMutable();
        this.indexedTollClusters_.set(i2, mpVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"indexedTollClusters_", mp.class});
            case 3:
                return new ms();
            case 4:
                return new mr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ms> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ms.class) {
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

    public mp getIndexedTollClusters(int i2) {
        return this.indexedTollClusters_.get(i2);
    }

    public int getIndexedTollClustersCount() {
        return this.indexedTollClusters_.size();
    }

    public List<mp> getIndexedTollClustersList() {
        return this.indexedTollClusters_;
    }

    public mq getIndexedTollClustersOrBuilder(int i2) {
        return this.indexedTollClusters_.get(i2);
    }

    public List<? extends mq> getIndexedTollClustersOrBuilderList() {
        return this.indexedTollClusters_;
    }

    public static mr newBuilder(ms msVar) {
        return (mr) DEFAULT_INSTANCE.createBuilder(msVar);
    }

    public static ms parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ms) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ms parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ms parseFrom(com.google.v.z zVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ms parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIndexedTollClusters(mp mpVar) {
        Objects.requireNonNull(mpVar);
        ensureIndexedTollClustersIsMutable();
        this.indexedTollClusters_.add(mpVar);
    }

    public static ms parseFrom(InputStream inputStream) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ms parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ms parseFrom(ByteBuffer byteBuffer) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ms parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ms parseFrom(byte[] bArr) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ms parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ms) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
