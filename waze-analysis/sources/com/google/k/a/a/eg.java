package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eg extends com.google.v.du<eg, ef> implements com.google.v.fj {
    private static final eg DEFAULT_INSTANCE;
    public static final int FOOTPRINT_FIELD_NUMBER = 3;
    public static final int GEOMETRY_FIELD_NUMBER = 2;
    public static final int GEOMETRY_ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<eg> PARSER;
    private int bitField0_;
    private az geometry_;
    private String geometryId_ = "";
    private com.google.v.v footprint_ = com.google.v.v.f13054a;

    static {
        eg egVar = new eg();
        DEFAULT_INSTANCE = egVar;
        com.google.v.du.registerDefaultInstance(eg.class, egVar);
    }

    private eg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFootprint() {
        this.bitField0_ &= -5;
        this.footprint_ = getDefaultInstance().getFootprint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry() {
        this.geometry_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometryId() {
        this.bitField0_ &= -2;
        this.geometryId_ = getDefaultInstance().getGeometryId();
    }

    public static eg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometry(az azVar) {
        Objects.requireNonNull(azVar);
        az azVar2 = this.geometry_;
        if (azVar2 != null && azVar2 != az.getDefaultInstance()) {
            s sVarNewBuilder = az.newBuilder(azVar2);
            sVarNewBuilder.mergeFrom((s) azVar);
            azVar = sVarNewBuilder.buildPartial();
        }
        this.geometry_ = azVar;
        this.bitField0_ |= 2;
    }

    public static ef newBuilder() {
        return (ef) DEFAULT_INSTANCE.createBuilder();
    }

    public static eg parseDelimitedFrom(InputStream inputStream) {
        return (eg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eg parseFrom(com.google.v.v vVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFootprint(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 4;
        this.footprint_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometry(az azVar) {
        Objects.requireNonNull(azVar);
        this.geometry_ = azVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometryId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.geometryId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometryIdBytes(com.google.v.v vVar) {
        this.geometryId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "geometryId_", "geometry_", "footprint_"});
        }
        if (iOrdinal == 3) {
            return new eg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ef(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<eg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (eg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getFootprint() {
        return this.footprint_;
    }

    public az getGeometry() {
        az azVar = this.geometry_;
        return azVar == null ? az.getDefaultInstance() : azVar;
    }

    public String getGeometryId() {
        return this.geometryId_;
    }

    public com.google.v.v getGeometryIdBytes() {
        return com.google.v.v.s(this.geometryId_);
    }

    public boolean hasFootprint() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGeometry() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasGeometryId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ef newBuilder(eg egVar) {
        return (ef) DEFAULT_INSTANCE.createBuilder(egVar);
    }

    public static eg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eg parseFrom(com.google.v.z zVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eg parseFrom(InputStream inputStream) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eg parseFrom(ByteBuffer byteBuffer) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eg parseFrom(byte[] bArr) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
