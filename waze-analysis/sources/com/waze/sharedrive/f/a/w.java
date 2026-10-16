package com.waze.sharedrive.f.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends du<w, r> implements fj {
    private static final w DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    private static volatile fo<w> PARSER = null;
    public static final int ROUTE_GEOMETRY_FIELD_NUMBER = 3;
    public static final int ROUTE_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private t destination_;
    private v routeGeometry_;
    private String routeId_ = "";

    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        du.registerDefaultInstance(w.class, wVar);
    }

    private w() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteGeometry() {
        this.routeGeometry_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteId() {
        this.routeId_ = getDefaultInstance().getRouteId();
    }

    public static w getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(t tVar) {
        Objects.requireNonNull(tVar);
        t tVar2 = this.destination_;
        if (tVar2 != null && tVar2 != t.getDefaultInstance()) {
            s sVarNewBuilder = t.newBuilder(tVar2);
            sVarNewBuilder.mergeFrom((s) tVar);
            tVar = sVarNewBuilder.buildPartial();
        }
        this.destination_ = tVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteGeometry(v vVar) {
        Objects.requireNonNull(vVar);
        v vVar2 = this.routeGeometry_;
        if (vVar2 != null && vVar2 != v.getDefaultInstance()) {
            u uVarNewBuilder = v.newBuilder(vVar2);
            uVarNewBuilder.mergeFrom((u) vVar);
            vVar = uVarNewBuilder.buildPartial();
        }
        this.routeGeometry_ = vVar;
        this.bitField0_ |= 2;
    }

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static w parseDelimitedFrom(InputStream inputStream) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(com.google.v.v vVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<w> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(t tVar) {
        Objects.requireNonNull(tVar);
        this.destination_ = tVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteGeometry(v vVar) {
        Objects.requireNonNull(vVar);
        this.routeGeometry_ = vVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteId(String str) {
        Objects.requireNonNull(str);
        this.routeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routeId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "routeId_", "destination_", "routeGeometry_"});
        }
        if (iOrdinal == 3) {
            return new w();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new r(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<w> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (w.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public t getDestination() {
        t tVar = this.destination_;
        return tVar == null ? t.getDefaultInstance() : tVar;
    }

    public v getRouteGeometry() {
        v vVar = this.routeGeometry_;
        return vVar == null ? v.getDefaultInstance() : vVar;
    }

    public String getRouteId() {
        return this.routeId_;
    }

    public com.google.v.v getRouteIdBytes() {
        return com.google.v.v.s(this.routeId_);
    }

    @Deprecated
    public boolean hasDestination() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRouteGeometry() {
        return (this.bitField0_ & 2) != 0;
    }

    public static r newBuilder(w wVar) {
        return (r) DEFAULT_INSTANCE.createBuilder(wVar);
    }

    public static w parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (w) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(com.google.v.v vVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static w parseFrom(com.google.v.z zVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static w parseFrom(com.google.v.z zVar, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static w parseFrom(InputStream inputStream) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static w parseFrom(InputStream inputStream, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static w parseFrom(ByteBuffer byteBuffer) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static w parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static w parseFrom(byte[] bArr) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static w parseFrom(byte[] bArr, de deVar) {
        return (w) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
