package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nj extends com.google.v.du<nj, ni> implements com.google.v.fj {
    private static final nj DEFAULT_INSTANCE;
    public static final int LINE_CONCEPT_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<nj> PARSER = null;
    public static final int STOPS_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.k.a.a.b.bw lineConcept_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<ng> stops_ = emptyProtobufList();

    static {
        nj njVar = new nj();
        DEFAULT_INSTANCE = njVar;
        com.google.v.du.registerDefaultInstance(nj.class, njVar);
    }

    private nj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStops(Iterable<? extends ng> iterable) {
        ensureStopsIsMutable();
        com.google.v.c.addAll(iterable, this.stops_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStops(int i2, ng ngVar) {
        Objects.requireNonNull(ngVar);
        ensureStopsIsMutable();
        this.stops_.add(i2, ngVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLineConcept() {
        this.lineConcept_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStops() {
        this.stops_ = emptyProtobufList();
    }

    private void ensureStopsIsMutable() {
        com.google.v.eo<ng> eoVar = this.stops_;
        if (eoVar.c()) {
            return;
        }
        this.stops_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static nj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLineConcept(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.lineConcept_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.lineConcept_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static ni newBuilder() {
        return (ni) DEFAULT_INSTANCE.createBuilder();
    }

    public static nj parseDelimitedFrom(InputStream inputStream) {
        return (nj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nj parseFrom(com.google.v.v vVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStops(int i2) {
        ensureStopsIsMutable();
        this.stops_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLineConcept(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.lineConcept_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStops(int i2, ng ngVar) {
        Objects.requireNonNull(ngVar);
        ensureStopsIsMutable();
        this.stops_.set(i2, ngVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"bitField0_", "stops_", ng.class, "lineConcept_"});
            case 3:
                return new nj();
            case 4:
                return new ni(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<nj> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (nj.class) {
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

    public com.google.k.a.a.b.bw getLineConcept() {
        com.google.k.a.a.b.bw bwVar = this.lineConcept_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public ng getStops(int i2) {
        return this.stops_.get(i2);
    }

    public int getStopsCount() {
        return this.stops_.size();
    }

    public List<ng> getStopsList() {
        return this.stops_;
    }

    public nh getStopsOrBuilder(int i2) {
        return this.stops_.get(i2);
    }

    public List<? extends nh> getStopsOrBuilderList() {
        return this.stops_;
    }

    public boolean hasLineConcept() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ni newBuilder(nj njVar) {
        return (ni) DEFAULT_INSTANCE.createBuilder(njVar);
    }

    public static nj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nj parseFrom(com.google.v.z zVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStops(ng ngVar) {
        Objects.requireNonNull(ngVar);
        ensureStopsIsMutable();
        this.stops_.add(ngVar);
    }

    public static nj parseFrom(InputStream inputStream) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nj parseFrom(ByteBuffer byteBuffer) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nj parseFrom(byte[] bArr) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
