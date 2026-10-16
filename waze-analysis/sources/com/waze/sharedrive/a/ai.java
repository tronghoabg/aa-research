package com.waze.sharedrive.a;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.gb;
import com.google.v.gc;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends du<ai, ah> implements fj {
    private static final ai DEFAULT_INSTANCE;
    public static final int ETA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile fo<ai> PARSER = null;
    public static final int ROUTE_ID_FIELD_NUMBER = 3;
    public static final int ROUTE_UUID_FIELD_NUMBER = 4;
    private int bitField0_;
    private gc eta_;
    private String name_ = "";
    private String routeId_ = "";
    private String routeUuid_ = "";

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEta() {
        this.eta_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteId() {
        this.routeId_ = getDefaultInstance().getRouteId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUuid() {
        this.routeUuid_ = getDefaultInstance().getRouteUuid();
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEta(gc gcVar) {
        Objects.requireNonNull(gcVar);
        gc gcVar2 = this.eta_;
        if (gcVar2 != null && gcVar2 != gc.getDefaultInstance()) {
            gb gbVarNewBuilder = gc.newBuilder(gcVar2);
            gbVarNewBuilder.mergeFrom((gb) gcVar);
            gcVar = gbVarNewBuilder.buildPartial();
        }
        this.eta_ = gcVar;
        this.bitField0_ |= 1;
    }

    public static ah newBuilder() {
        return (ah) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEta(gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.eta_ = gcVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.routeUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routeUuid_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "name_", "eta_", "routeId_", "routeUuid_"});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gc getEta() {
        gc gcVar = this.eta_;
        return gcVar == null ? gc.getDefaultInstance() : gcVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getRouteId() {
        return this.routeId_;
    }

    public com.google.v.v getRouteIdBytes() {
        return com.google.v.v.s(this.routeId_);
    }

    public String getRouteUuid() {
        return this.routeUuid_;
    }

    public com.google.v.v getRouteUuidBytes() {
        return com.google.v.v.s(this.routeUuid_);
    }

    public boolean hasEta() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ah newBuilder(ai aiVar) {
        return (ah) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
