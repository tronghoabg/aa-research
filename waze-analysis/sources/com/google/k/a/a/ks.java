package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ks extends com.google.v.du<ks, kr> implements com.google.v.fj {
    private static final ks DEFAULT_INSTANCE;
    public static final int MONITORED_ROAD_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ks> PARSER;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> monitoredRoad_ = emptyProtobufList();

    static {
        ks ksVar = new ks();
        DEFAULT_INSTANCE = ksVar;
        com.google.v.du.registerDefaultInstance(ks.class, ksVar);
    }

    private ks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoredRoad(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureMonitoredRoadIsMutable();
        com.google.v.c.addAll(iterable, this.monitoredRoad_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredRoad(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureMonitoredRoadIsMutable();
        this.monitoredRoad_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoredRoad() {
        this.monitoredRoad_ = emptyProtobufList();
    }

    private void ensureMonitoredRoadIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.monitoredRoad_;
        if (eoVar.c()) {
            return;
        }
        this.monitoredRoad_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ks getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kr newBuilder() {
        return (kr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ks parseDelimitedFrom(InputStream inputStream) {
        return (ks) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ks parseFrom(com.google.v.v vVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ks> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMonitoredRoad(int i2) {
        ensureMonitoredRoadIsMutable();
        this.monitoredRoad_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoredRoad(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureMonitoredRoadIsMutable();
        this.monitoredRoad_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"monitoredRoad_", com.google.k.a.a.b.bw.class});
            case 3:
                return new ks();
            case 4:
                return new kr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ks> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ks.class) {
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

    public com.google.k.a.a.b.bw getMonitoredRoad(int i2) {
        return this.monitoredRoad_.get(i2);
    }

    public int getMonitoredRoadCount() {
        return this.monitoredRoad_.size();
    }

    public List<com.google.k.a.a.b.bw> getMonitoredRoadList() {
        return this.monitoredRoad_;
    }

    public com.google.k.a.a.b.bx getMonitoredRoadOrBuilder(int i2) {
        return this.monitoredRoad_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getMonitoredRoadOrBuilderList() {
        return this.monitoredRoad_;
    }

    public static kr newBuilder(ks ksVar) {
        return (kr) DEFAULT_INSTANCE.createBuilder(ksVar);
    }

    public static ks parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ks) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ks parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ks parseFrom(com.google.v.z zVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ks parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredRoad(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureMonitoredRoadIsMutable();
        this.monitoredRoad_.add(bwVar);
    }

    public static ks parseFrom(InputStream inputStream) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ks parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ks parseFrom(ByteBuffer byteBuffer) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ks parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ks parseFrom(byte[] bArr) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ks parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ks) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
