package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gw extends com.google.v.du<gw, gv> implements gx {
    public static final int ALTERNATIVE_WITH_HOV_FIELD_NUMBER = 2;
    private static final gw DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gw> PARSER = null;
    public static final int PRIMARY_ROUTE_FIELD_NUMBER = 1;
    private ih alternativeWithHov_;
    private int bitField0_;
    private ih primaryRoute_;

    static {
        gw gwVar = new gw();
        DEFAULT_INSTANCE = gwVar;
        com.google.v.du.registerDefaultInstance(gw.class, gwVar);
    }

    private gw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeWithHov() {
        this.alternativeWithHov_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryRoute() {
        this.primaryRoute_ = null;
        this.bitField0_ &= -2;
    }

    public static gw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlternativeWithHov(ih ihVar) {
        Objects.requireNonNull(ihVar);
        ih ihVar2 = this.alternativeWithHov_;
        if (ihVar2 != null && ihVar2 != ih.getDefaultInstance()) {
            ig igVarNewBuilder = ih.newBuilder(ihVar2);
            igVarNewBuilder.mergeFrom((ig) ihVar);
            ihVar = igVarNewBuilder.buildPartial();
        }
        this.alternativeWithHov_ = ihVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrimaryRoute(ih ihVar) {
        Objects.requireNonNull(ihVar);
        ih ihVar2 = this.primaryRoute_;
        if (ihVar2 != null && ihVar2 != ih.getDefaultInstance()) {
            ig igVarNewBuilder = ih.newBuilder(ihVar2);
            igVarNewBuilder.mergeFrom((ig) ihVar);
            ihVar = igVarNewBuilder.buildPartial();
        }
        this.primaryRoute_ = ihVar;
        this.bitField0_ |= 1;
    }

    public static gv newBuilder() {
        return (gv) DEFAULT_INSTANCE.createBuilder();
    }

    public static gw parseDelimitedFrom(InputStream inputStream) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(com.google.v.v vVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeWithHov(ih ihVar) {
        Objects.requireNonNull(ihVar);
        this.alternativeWithHov_ = ihVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryRoute(ih ihVar) {
        Objects.requireNonNull(ihVar);
        this.primaryRoute_ = ihVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "primaryRoute_", "alternativeWithHov_"});
        }
        if (iOrdinal == 3) {
            return new gw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ih getAlternativeWithHov() {
        ih ihVar = this.alternativeWithHov_;
        return ihVar == null ? ih.getDefaultInstance() : ihVar;
    }

    public ih getPrimaryRoute() {
        ih ihVar = this.primaryRoute_;
        return ihVar == null ? ih.getDefaultInstance() : ihVar;
    }

    public boolean hasAlternativeWithHov() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPrimaryRoute() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gv newBuilder(gw gwVar) {
        return (gv) DEFAULT_INSTANCE.createBuilder(gwVar);
    }

    public static gw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gw parseFrom(com.google.v.z zVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gw parseFrom(InputStream inputStream) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gw parseFrom(ByteBuffer byteBuffer) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gw parseFrom(byte[] bArr) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
