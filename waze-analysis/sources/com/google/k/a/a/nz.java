package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class nz extends com.google.v.du<nz, ny> implements com.google.v.fj {
    private static final nz DEFAULT_INSTANCE;
    public static final int FALLBACK_SPEED_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<nz> PARSER;
    private int bitField0_;
    private ls fallbackSpeed_;

    static {
        nz nzVar = new nz();
        DEFAULT_INSTANCE = nzVar;
        com.google.v.du.registerDefaultInstance(nz.class, nzVar);
    }

    private nz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFallbackSpeed() {
        this.fallbackSpeed_ = null;
        this.bitField0_ &= -2;
    }

    public static nz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFallbackSpeed(ls lsVar) {
        Objects.requireNonNull(lsVar);
        ls lsVar2 = this.fallbackSpeed_;
        if (lsVar2 != null && lsVar2 != ls.getDefaultInstance()) {
            lp lpVarNewBuilder = ls.newBuilder(lsVar2);
            lpVarNewBuilder.mergeFrom((lp) lsVar);
            lsVar = lpVarNewBuilder.buildPartial();
        }
        this.fallbackSpeed_ = lsVar;
        this.bitField0_ |= 1;
    }

    public static ny newBuilder() {
        return (ny) DEFAULT_INSTANCE.createBuilder();
    }

    public static nz parseDelimitedFrom(InputStream inputStream) {
        return (nz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nz parseFrom(com.google.v.v vVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFallbackSpeed(ls lsVar) {
        Objects.requireNonNull(lsVar);
        this.fallbackSpeed_ = lsVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "fallbackSpeed_"});
        }
        if (iOrdinal == 3) {
            return new nz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ny(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ls getFallbackSpeed() {
        ls lsVar = this.fallbackSpeed_;
        return lsVar == null ? ls.getDefaultInstance() : lsVar;
    }

    public boolean hasFallbackSpeed() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ny newBuilder(nz nzVar) {
        return (ny) DEFAULT_INSTANCE.createBuilder(nzVar);
    }

    public static nz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nz parseFrom(com.google.v.z zVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nz parseFrom(InputStream inputStream) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nz parseFrom(ByteBuffer byteBuffer) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nz parseFrom(byte[] bArr) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
