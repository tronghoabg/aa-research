package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gj extends com.google.v.du<gj, gi> implements com.google.v.fj {
    public static final int ADDITIONAL_LOCATION_INFO_FIELD_NUMBER = 2;
    private static final gj DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gj> PARSER = null;
    public static final int SNAPPED_LOCATION_FIELD_NUMBER = 1;
    private i.c.a.a.l additionalLocationInfo_;
    private int bitField0_;
    private ei snappedLocation_;

    static {
        gj gjVar = new gj();
        DEFAULT_INSTANCE = gjVar;
        com.google.v.du.registerDefaultInstance(gj.class, gjVar);
    }

    private gj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalLocationInfo() {
        this.additionalLocationInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnappedLocation() {
        this.snappedLocation_ = null;
        this.bitField0_ &= -2;
    }

    public static gj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdditionalLocationInfo(i.c.a.a.l lVar) {
        Objects.requireNonNull(lVar);
        i.c.a.a.l lVar2 = this.additionalLocationInfo_;
        if (lVar2 != null && lVar2 != i.c.a.a.l.getDefaultInstance()) {
            i.c.a.a.e eVarNewBuilder = i.c.a.a.l.newBuilder(lVar2);
            eVarNewBuilder.mergeFrom((i.c.a.a.e) lVar);
            lVar = eVarNewBuilder.buildPartial();
        }
        this.additionalLocationInfo_ = lVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSnappedLocation(ei eiVar) {
        Objects.requireNonNull(eiVar);
        ei eiVar2 = this.snappedLocation_;
        if (eiVar2 != null && eiVar2 != ei.getDefaultInstance()) {
            eh ehVarNewBuilder = ei.newBuilder(eiVar2);
            ehVarNewBuilder.mergeFrom((eh) eiVar);
            eiVar = ehVarNewBuilder.buildPartial();
        }
        this.snappedLocation_ = eiVar;
        this.bitField0_ |= 1;
    }

    public static gi newBuilder() {
        return (gi) DEFAULT_INSTANCE.createBuilder();
    }

    public static gj parseDelimitedFrom(InputStream inputStream) {
        return (gj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gj parseFrom(com.google.v.v vVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalLocationInfo(i.c.a.a.l lVar) {
        Objects.requireNonNull(lVar);
        this.additionalLocationInfo_ = lVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnappedLocation(ei eiVar) {
        Objects.requireNonNull(eiVar);
        this.snappedLocation_ = eiVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "snappedLocation_", "additionalLocationInfo_"});
        }
        if (iOrdinal == 3) {
            return new gj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.c.a.a.l getAdditionalLocationInfo() {
        i.c.a.a.l lVar = this.additionalLocationInfo_;
        return lVar == null ? i.c.a.a.l.getDefaultInstance() : lVar;
    }

    public ei getSnappedLocation() {
        ei eiVar = this.snappedLocation_;
        return eiVar == null ? ei.getDefaultInstance() : eiVar;
    }

    public boolean hasAdditionalLocationInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSnappedLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gi newBuilder(gj gjVar) {
        return (gi) DEFAULT_INSTANCE.createBuilder(gjVar);
    }

    public static gj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gj parseFrom(com.google.v.z zVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gj parseFrom(InputStream inputStream) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gj parseFrom(ByteBuffer byteBuffer) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gj parseFrom(byte[] bArr) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
