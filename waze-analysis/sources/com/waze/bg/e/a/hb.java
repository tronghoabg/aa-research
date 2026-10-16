package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hb extends com.google.v.du<hb, ha> implements com.google.v.fj {
    private static final hb DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hb> PARSER = null;
    public static final int SEGMENTS_FIELD_NUMBER = 1;
    private com.google.v.eo<hj> segments_ = emptyProtobufList();

    static {
        hb hbVar = new hb();
        DEFAULT_INSTANCE = hbVar;
        com.google.v.du.registerDefaultInstance(hb.class, hbVar);
    }

    private hb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegments(Iterable<? extends hj> iterable) {
        ensureSegmentsIsMutable();
        com.google.v.c.addAll(iterable, this.segments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(int i2, hj hjVar) {
        Objects.requireNonNull(hjVar);
        ensureSegmentsIsMutable();
        this.segments_.add(i2, hjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        this.segments_ = emptyProtobufList();
    }

    private void ensureSegmentsIsMutable() {
        com.google.v.eo<hj> eoVar = this.segments_;
        if (eoVar.c()) {
            return;
        }
        this.segments_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ha newBuilder() {
        return (ha) DEFAULT_INSTANCE.createBuilder();
    }

    public static hb parseDelimitedFrom(InputStream inputStream) {
        return (hb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hb parseFrom(com.google.v.v vVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegments(int i2) {
        ensureSegmentsIsMutable();
        this.segments_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(int i2, hj hjVar) {
        Objects.requireNonNull(hjVar);
        ensureSegmentsIsMutable();
        this.segments_.set(i2, hjVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"segments_", hj.class});
        }
        if (iOrdinal == 3) {
            return new hb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ha(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hj getSegments(int i2) {
        return this.segments_.get(i2);
    }

    public int getSegmentsCount() {
        return this.segments_.size();
    }

    public List<hj> getSegmentsList() {
        return this.segments_;
    }

    public hk getSegmentsOrBuilder(int i2) {
        return this.segments_.get(i2);
    }

    public List<? extends hk> getSegmentsOrBuilderList() {
        return this.segments_;
    }

    public static ha newBuilder(hb hbVar) {
        return (ha) DEFAULT_INSTANCE.createBuilder(hbVar);
    }

    public static hb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hb parseFrom(com.google.v.z zVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(hj hjVar) {
        Objects.requireNonNull(hjVar);
        ensureSegmentsIsMutable();
        this.segments_.add(hjVar);
    }

    public static hb parseFrom(InputStream inputStream) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hb parseFrom(ByteBuffer byteBuffer) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hb parseFrom(byte[] bArr) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hb) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
