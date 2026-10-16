package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class js extends com.google.v.du<js, jr> implements com.google.v.fj {
    private static final js DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<js> PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 7;
    public static final int POINT_INDICES_FIELD_NUMBER = 8;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<jp> points_ = emptyProtobufList();
    private com.google.v.ek pointIndices_ = emptyIntList();

    static {
        js jsVar = new js();
        DEFAULT_INSTANCE = jsVar;
        com.google.v.du.registerDefaultInstance(js.class, jsVar);
    }

    private js() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPointIndices(Iterable<? extends Integer> iterable) {
        ensurePointIndicesIsMutable();
        com.google.v.c.addAll(iterable, this.pointIndices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPoints(Iterable<? extends jp> iterable) {
        ensurePointsIsMutable();
        com.google.v.c.addAll(iterable, this.points_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPointIndices(int i2) {
        ensurePointIndicesIsMutable();
        this.pointIndices_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(int i2, jp jpVar) {
        Objects.requireNonNull(jpVar);
        ensurePointsIsMutable();
        this.points_.add(i2, jpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointIndices() {
        this.pointIndices_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoints() {
        this.points_ = emptyProtobufList();
    }

    private void ensurePointIndicesIsMutable() {
        com.google.v.ek ekVar = this.pointIndices_;
        if (ekVar.c()) {
            return;
        }
        this.pointIndices_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensurePointsIsMutable() {
        com.google.v.eo<jp> eoVar = this.points_;
        if (eoVar.c()) {
            return;
        }
        this.points_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static js getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jr newBuilder() {
        return (jr) DEFAULT_INSTANCE.createBuilder();
    }

    public static js parseDelimitedFrom(InputStream inputStream) {
        return (js) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static js parseFrom(com.google.v.v vVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<js> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePoints(int i2) {
        ensurePointsIsMutable();
        this.points_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointIndices(int i2, int i3) {
        ensurePointIndicesIsMutable();
        this.pointIndices_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoints(int i2, jp jpVar) {
        Objects.requireNonNull(jpVar);
        ensurePointsIsMutable();
        this.points_.set(i2, jpVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0007\b\u0002\u0000\u0002\u0001\u0007Л\b\u0016", new Object[]{"points_", jp.class, "pointIndices_"});
            case 3:
                return new js();
            case 4:
                return new jr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<js> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (js.class) {
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

    public int getPointIndices(int i2) {
        return this.pointIndices_.d(i2);
    }

    public int getPointIndicesCount() {
        return this.pointIndices_.size();
    }

    public List<Integer> getPointIndicesList() {
        return this.pointIndices_;
    }

    public jp getPoints(int i2) {
        return this.points_.get(i2);
    }

    public int getPointsCount() {
        return this.points_.size();
    }

    public List<jp> getPointsList() {
        return this.points_;
    }

    public jq getPointsOrBuilder(int i2) {
        return this.points_.get(i2);
    }

    public List<? extends jq> getPointsOrBuilderList() {
        return this.points_;
    }

    public static jr newBuilder(js jsVar) {
        return (jr) DEFAULT_INSTANCE.createBuilder(jsVar);
    }

    public static js parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (js) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static js parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static js parseFrom(com.google.v.z zVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static js parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoints(jp jpVar) {
        Objects.requireNonNull(jpVar);
        ensurePointsIsMutable();
        this.points_.add(jpVar);
    }

    public static js parseFrom(InputStream inputStream) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static js parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static js parseFrom(ByteBuffer byteBuffer) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static js parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static js parseFrom(byte[] bArr) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static js parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (js) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
