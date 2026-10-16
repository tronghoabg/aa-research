package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class es extends com.google.v.du<es, er> implements com.google.v.fj {
    private static final es DEFAULT_INSTANCE;
    public static final int DEFINES_GEOMETRY_FOR_FIELD_NUMBER = 3;
    public static final int GEOMETRY_COMPOSITION_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<es> PARSER;
    private int bitField0_;
    private ee geometryComposition_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> definesGeometryFor_ = emptyProtobufList();

    static {
        es esVar = new es();
        DEFAULT_INSTANCE = esVar;
        com.google.v.du.registerDefaultInstance(es.class, esVar);
    }

    private es() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDefinesGeometryFor(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureDefinesGeometryForIsMutable();
        com.google.v.c.addAll(iterable, this.definesGeometryFor_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDefinesGeometryFor(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureDefinesGeometryForIsMutable();
        this.definesGeometryFor_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefinesGeometryFor() {
        this.definesGeometryFor_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometryComposition() {
        this.geometryComposition_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureDefinesGeometryForIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.definesGeometryFor_;
        if (eoVar.c()) {
            return;
        }
        this.definesGeometryFor_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static es getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometryComposition(ee eeVar) {
        Objects.requireNonNull(eeVar);
        ee eeVar2 = this.geometryComposition_;
        if (eeVar2 != null && eeVar2 != ee.getDefaultInstance()) {
            ed edVarNewBuilder = ee.newBuilder(eeVar2);
            edVarNewBuilder.mergeFrom((ed) eeVar);
            eeVar = edVarNewBuilder.buildPartial();
        }
        this.geometryComposition_ = eeVar;
        this.bitField0_ |= 1;
    }

    public static er newBuilder() {
        return (er) DEFAULT_INSTANCE.createBuilder();
    }

    public static es parseDelimitedFrom(InputStream inputStream) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(com.google.v.v vVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<es> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDefinesGeometryFor(int i2) {
        ensureDefinesGeometryForIsMutable();
        this.definesGeometryFor_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefinesGeometryFor(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureDefinesGeometryForIsMutable();
        this.definesGeometryFor_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometryComposition(ee eeVar) {
        Objects.requireNonNull(eeVar);
        this.geometryComposition_ = eeVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0002\u0003Л\u0004ᐉ\u0000", new Object[]{"bitField0_", "definesGeometryFor_", com.google.k.a.a.b.bw.class, "geometryComposition_"});
            case 3:
                return new es();
            case 4:
                return new er(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<es> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (es.class) {
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

    public com.google.k.a.a.b.bw getDefinesGeometryFor(int i2) {
        return this.definesGeometryFor_.get(i2);
    }

    public int getDefinesGeometryForCount() {
        return this.definesGeometryFor_.size();
    }

    public List<com.google.k.a.a.b.bw> getDefinesGeometryForList() {
        return this.definesGeometryFor_;
    }

    public com.google.k.a.a.b.bx getDefinesGeometryForOrBuilder(int i2) {
        return this.definesGeometryFor_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getDefinesGeometryForOrBuilderList() {
        return this.definesGeometryFor_;
    }

    public ee getGeometryComposition() {
        ee eeVar = this.geometryComposition_;
        return eeVar == null ? ee.getDefaultInstance() : eeVar;
    }

    public boolean hasGeometryComposition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static er newBuilder(es esVar) {
        return (er) DEFAULT_INSTANCE.createBuilder(esVar);
    }

    public static es parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static es parseFrom(com.google.v.z zVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static es parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDefinesGeometryFor(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureDefinesGeometryForIsMutable();
        this.definesGeometryFor_.add(bwVar);
    }

    public static es parseFrom(InputStream inputStream) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static es parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static es parseFrom(ByteBuffer byteBuffer) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static es parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static es parseFrom(byte[] bArr) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static es parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (es) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
