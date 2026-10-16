package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class az extends com.google.v.du<az, s> implements com.google.v.fj {
    public static final int APPEARANCE_FIELD_NUMBER = 5;
    public static final int CITY_OBJECTS_FIELD_NUMBER = 4;
    private static final az DEFAULT_INSTANCE;
    public static final int FLATTENED_VERTICES_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<az> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 1;
    private r appearance_;
    private int bitField0_;
    private ay transform_;
    private int flattenedVerticesMemoizedSerializedSize = -1;
    private com.google.v.ek flattenedVertices_ = emptyIntList();
    private com.google.v.eo<ar> cityObjects_ = emptyProtobufList();

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        com.google.v.du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCityObjects(Iterable<? extends ar> iterable) {
        ensureCityObjectsIsMutable();
        com.google.v.c.addAll(iterable, this.cityObjects_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFlattenedVertices(Iterable<? extends Integer> iterable) {
        ensureFlattenedVerticesIsMutable();
        com.google.v.c.addAll(iterable, this.flattenedVertices_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCityObjects(int i2, ar arVar) {
        Objects.requireNonNull(arVar);
        ensureCityObjectsIsMutable();
        this.cityObjects_.add(i2, arVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFlattenedVertices(int i2) {
        ensureFlattenedVerticesIsMutable();
        this.flattenedVertices_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppearance() {
        this.appearance_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCityObjects() {
        this.cityObjects_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlattenedVertices() {
        this.flattenedVertices_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransform() {
        this.transform_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureCityObjectsIsMutable() {
        com.google.v.eo<ar> eoVar = this.cityObjects_;
        if (eoVar.c()) {
            return;
        }
        this.cityObjects_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureFlattenedVerticesIsMutable() {
        com.google.v.ek ekVar = this.flattenedVertices_;
        if (ekVar.c()) {
            return;
        }
        this.flattenedVertices_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static az getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppearance(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.appearance_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            l lVarNewBuilder = r.newBuilder(rVar2);
            lVarNewBuilder.mergeFrom((l) rVar);
            rVar = lVarNewBuilder.buildPartial();
        }
        this.appearance_ = rVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransform(ay ayVar) {
        Objects.requireNonNull(ayVar);
        ay ayVar2 = this.transform_;
        if (ayVar2 != null && ayVar2 != ay.getDefaultInstance()) {
            at atVarNewBuilder = ay.newBuilder(ayVar2);
            atVarNewBuilder.mergeFrom((at) ayVar);
            ayVar = atVarNewBuilder.buildPartial();
        }
        this.transform_ = ayVar;
        this.bitField0_ |= 1;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<az> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCityObjects(int i2) {
        ensureCityObjectsIsMutable();
        this.cityObjects_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppearance(r rVar) {
        Objects.requireNonNull(rVar);
        this.appearance_ = rVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityObjects(int i2, ar arVar) {
        Objects.requireNonNull(arVar);
        ensureCityObjectsIsMutable();
        this.cityObjects_.set(i2, arVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlattenedVertices(int i2, int i3) {
        ensureFlattenedVerticesIsMutable();
        this.flattenedVertices_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransform(ay ayVar) {
        Objects.requireNonNull(ayVar);
        this.transform_ = ayVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002'\u0004\u001b\u0005ဉ\u0001", new Object[]{"bitField0_", "transform_", "flattenedVertices_", "cityObjects_", ar.class, "appearance_"});
        }
        if (iOrdinal == 3) {
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new s(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public r getAppearance() {
        r rVar = this.appearance_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    public ar getCityObjects(int i2) {
        return this.cityObjects_.get(i2);
    }

    public int getCityObjectsCount() {
        return this.cityObjects_.size();
    }

    public List<ar> getCityObjectsList() {
        return this.cityObjects_;
    }

    public as getCityObjectsOrBuilder(int i2) {
        return this.cityObjects_.get(i2);
    }

    public List<? extends as> getCityObjectsOrBuilderList() {
        return this.cityObjects_;
    }

    public int getFlattenedVertices(int i2) {
        return this.flattenedVertices_.d(i2);
    }

    public int getFlattenedVerticesCount() {
        return this.flattenedVertices_.size();
    }

    public List<Integer> getFlattenedVerticesList() {
        return this.flattenedVertices_;
    }

    public ay getTransform() {
        ay ayVar = this.transform_;
        return ayVar == null ? ay.getDefaultInstance() : ayVar;
    }

    public boolean hasAppearance() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTransform() {
        return (this.bitField0_ & 1) != 0;
    }

    public static s newBuilder(az azVar) {
        return (s) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCityObjects(ar arVar) {
        Objects.requireNonNull(arVar);
        ensureCityObjectsIsMutable();
        this.cityObjects_.add(arVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
