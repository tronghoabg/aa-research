package com.google.k.a.a.a.a;

import com.google.k.a.a.jx;
import com.google.k.a.a.jy;
import com.google.k.a.a.nu;
import com.google.k.a.a.nv;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends du<b, a> implements fj {
    private static final b DEFAULT_INSTANCE;
    private static volatile fo<b> PARSER = null;
    public static final int POLYGON_SHAPE_ID_FIELD_NUMBER = 13;
    public static final int REST_OF_WORLD_POLYGON_SHAPE_ID_FIELD_NUMBER = 16;
    public static final int RIGHTS_STATUS_FIELD_NUMBER = 12;
    public static final int SELF_POLYGON_SHAPE_ID_FIELD_NUMBER = 15;
    public static final int TRUST_FIELD_NUMBER = 4;
    public static final int WATER_REMOVED_POLYGON_SHAPE_ID_FIELD_NUMBER = 14;
    private int bitField0_;
    private jy rightsStatus_;
    private nv trust_;
    private String polygonShapeId_ = "";
    private String waterRemovedPolygonShapeId_ = "";
    private String selfPolygonShapeId_ = "";
    private String restOfWorldPolygonShapeId_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonShapeId() {
        this.bitField0_ &= -5;
        this.polygonShapeId_ = getDefaultInstance().getPolygonShapeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestOfWorldPolygonShapeId() {
        this.bitField0_ &= -33;
        this.restOfWorldPolygonShapeId_ = getDefaultInstance().getRestOfWorldPolygonShapeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRightsStatus() {
        this.rightsStatus_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelfPolygonShapeId() {
        this.bitField0_ &= -17;
        this.selfPolygonShapeId_ = getDefaultInstance().getSelfPolygonShapeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrust() {
        this.trust_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaterRemovedPolygonShapeId() {
        this.bitField0_ &= -9;
        this.waterRemovedPolygonShapeId_ = getDefaultInstance().getWaterRemovedPolygonShapeId();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRightsStatus(jy jyVar) {
        Objects.requireNonNull(jyVar);
        jy jyVar2 = this.rightsStatus_;
        if (jyVar2 != null && jyVar2 != jy.getDefaultInstance()) {
            jx jxVarNewBuilder = jy.newBuilder(jyVar2);
            jxVarNewBuilder.mergeFrom((jx) jyVar);
            jyVar = jxVarNewBuilder.buildPartial();
        }
        this.rightsStatus_ = jyVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrust(nv nvVar) {
        Objects.requireNonNull(nvVar);
        nv nvVar2 = this.trust_;
        if (nvVar2 != null && nvVar2 != nv.getDefaultInstance()) {
            nu nuVarNewBuilder = nv.newBuilder(nvVar2);
            nuVarNewBuilder.mergeFrom((nu) nvVar);
            nvVar = nuVarNewBuilder.buildPartial();
        }
        this.trust_ = nvVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonShapeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.polygonShapeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonShapeIdBytes(v vVar) {
        this.polygonShapeId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestOfWorldPolygonShapeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.restOfWorldPolygonShapeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestOfWorldPolygonShapeIdBytes(v vVar) {
        this.restOfWorldPolygonShapeId_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRightsStatus(jy jyVar) {
        Objects.requireNonNull(jyVar);
        this.rightsStatus_ = jyVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelfPolygonShapeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.selfPolygonShapeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelfPolygonShapeIdBytes(v vVar) {
        this.selfPolygonShapeId_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrust(nv nvVar) {
        Objects.requireNonNull(nvVar);
        this.trust_ = nvVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaterRemovedPolygonShapeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.waterRemovedPolygonShapeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaterRemovedPolygonShapeIdBytes(v vVar) {
        this.waterRemovedPolygonShapeId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0004\u0010\u0006\u0000\u0000\u0000\u0004ဉ\u0000\fဉ\u0001\rဈ\u0002\u000eဈ\u0003\u000fဈ\u0004\u0010ဈ\u0005", new Object[]{"bitField0_", "trust_", "rightsStatus_", "polygonShapeId_", "waterRemovedPolygonShapeId_", "selfPolygonShapeId_", "restOfWorldPolygonShapeId_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPolygonShapeId() {
        return this.polygonShapeId_;
    }

    public v getPolygonShapeIdBytes() {
        return v.s(this.polygonShapeId_);
    }

    public String getRestOfWorldPolygonShapeId() {
        return this.restOfWorldPolygonShapeId_;
    }

    public v getRestOfWorldPolygonShapeIdBytes() {
        return v.s(this.restOfWorldPolygonShapeId_);
    }

    public jy getRightsStatus() {
        jy jyVar = this.rightsStatus_;
        return jyVar == null ? jy.getDefaultInstance() : jyVar;
    }

    public String getSelfPolygonShapeId() {
        return this.selfPolygonShapeId_;
    }

    public v getSelfPolygonShapeIdBytes() {
        return v.s(this.selfPolygonShapeId_);
    }

    public nv getTrust() {
        nv nvVar = this.trust_;
        return nvVar == null ? nv.getDefaultInstance() : nvVar;
    }

    public String getWaterRemovedPolygonShapeId() {
        return this.waterRemovedPolygonShapeId_;
    }

    public v getWaterRemovedPolygonShapeIdBytes() {
        return v.s(this.waterRemovedPolygonShapeId_);
    }

    public boolean hasPolygonShapeId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRestOfWorldPolygonShapeId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRightsStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSelfPolygonShapeId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTrust() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWaterRemovedPolygonShapeId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
