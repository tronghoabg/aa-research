package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends com.google.v.du<f, d> implements g {
    private static final f DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<f> PARSER = null;
    public static final int SPEED_LIMIT_FIELD_NUMBER = 1;
    public static final int TRUST_LEVEL_FIELD_NUMBER = 2;
    private int bitField0_;
    private lo speedLimit_;
    private int trustLevel_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.v.du.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimit() {
        this.speedLimit_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrustLevel() {
        this.bitField0_ &= -3;
        this.trustLevel_ = 0;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedLimit(lo loVar) {
        Objects.requireNonNull(loVar);
        lo loVar2 = this.speedLimit_;
        if (loVar2 != null && loVar2 != lo.getDefaultInstance()) {
            lk lkVarNewBuilder = lo.newBuilder(loVar2);
            lkVarNewBuilder.mergeFrom((lk) loVar);
            loVar = lkVarNewBuilder.buildPartial();
        }
        this.speedLimit_ = loVar;
        this.bitField0_ |= 1;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(com.google.v.v vVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<f> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimit(lo loVar) {
        Objects.requireNonNull(loVar);
        this.speedLimit_ = loVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrustLevel(e eVar) {
        this.trustLevel_ = eVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "speedLimit_", "trustLevel_", h.f11873b});
        }
        if (iOrdinal == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new d(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<f> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (f.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public lo getSpeedLimit() {
        lo loVar = this.speedLimit_;
        return loVar == null ? lo.getDefaultInstance() : loVar;
    }

    public e getTrustLevel() {
        e eVarA = e.a(this.trustLevel_);
        return eVarA == null ? e.SPEED_LIMIT_TRUST_LEVEL_UNKNOWN : eVarA;
    }

    public boolean hasSpeedLimit() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrustLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static d newBuilder(f fVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (f) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static f parseFrom(com.google.v.z zVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static f parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static f parseFrom(InputStream inputStream) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static f parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static f parseFrom(byte[] bArr) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (f) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
