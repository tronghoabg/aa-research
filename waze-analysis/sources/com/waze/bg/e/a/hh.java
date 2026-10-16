package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hh extends com.google.v.du<hh, hg> implements com.google.v.fj {
    private static final hh DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<hh> PARSER = null;
    public static final int WAYPOINT_FIELD_NUMBER = 2;
    private int bitField0_;
    private long id_;
    private cx waypoint_;

    static {
        hh hhVar = new hh();
        DEFAULT_INSTANCE = hhVar;
        com.google.v.du.registerDefaultInstance(hh.class, hhVar);
    }

    private hh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = null;
        this.bitField0_ &= -3;
    }

    public static hh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaypoint(cx cxVar) {
        Objects.requireNonNull(cxVar);
        cx cxVar2 = this.waypoint_;
        if (cxVar2 != null && cxVar2 != cx.getDefaultInstance()) {
            cl clVarNewBuilder = cx.newBuilder(cxVar2);
            clVarNewBuilder.mergeFrom((cl) cxVar);
            cxVar = clVarNewBuilder.buildPartial();
        }
        this.waypoint_ = cxVar;
        this.bitField0_ |= 2;
    }

    public static hg newBuilder() {
        return (hg) DEFAULT_INSTANCE.createBuilder();
    }

    public static hh parseDelimitedFrom(InputStream inputStream) {
        return (hh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hh parseFrom(com.google.v.v vVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(cx cxVar) {
        Objects.requireNonNull(cxVar);
        this.waypoint_ = cxVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "id_", "waypoint_"});
        }
        if (iOrdinal == 3) {
            return new hh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getId() {
        return this.id_;
    }

    public cx getWaypoint() {
        cx cxVar = this.waypoint_;
        return cxVar == null ? cx.getDefaultInstance() : cxVar;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWaypoint() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hg newBuilder(hh hhVar) {
        return (hg) DEFAULT_INSTANCE.createBuilder(hhVar);
    }

    public static hh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hh parseFrom(com.google.v.z zVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hh parseFrom(InputStream inputStream) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hh parseFrom(ByteBuffer byteBuffer) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hh parseFrom(byte[] bArr) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
