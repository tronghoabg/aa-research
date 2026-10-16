package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class go extends com.google.v.du<go, gn> implements com.google.v.fj {
    public static final int CROSSES_DANGER_ZONE_FIELD_NUMBER = 3;
    public static final int CROSSES_INTERNATIONAL_BORDER_FIELD_NUMBER = 2;
    private static final go DEFAULT_INSTANCE;
    public static final int INCLUDES_FERRY_RIDE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<go> PARSER;
    private int bitField0_;
    private boolean crossesDangerZone_;
    private boolean crossesInternationalBorder_;
    private boolean includesFerryRide_;

    static {
        go goVar = new go();
        DEFAULT_INSTANCE = goVar;
        com.google.v.du.registerDefaultInstance(go.class, goVar);
    }

    private go() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossesDangerZone() {
        this.bitField0_ &= -5;
        this.crossesDangerZone_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossesInternationalBorder() {
        this.bitField0_ &= -3;
        this.crossesInternationalBorder_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludesFerryRide() {
        this.bitField0_ &= -2;
        this.includesFerryRide_ = false;
    }

    public static go getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gn newBuilder() {
        return (gn) DEFAULT_INSTANCE.createBuilder();
    }

    public static go parseDelimitedFrom(InputStream inputStream) {
        return (go) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static go parseFrom(com.google.v.v vVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<go> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossesDangerZone(boolean z) {
        this.bitField0_ |= 4;
        this.crossesDangerZone_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossesInternationalBorder(boolean z) {
        this.bitField0_ |= 2;
        this.crossesInternationalBorder_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludesFerryRide(boolean z) {
        this.bitField0_ |= 1;
        this.includesFerryRide_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "includesFerryRide_", "crossesInternationalBorder_", "crossesDangerZone_"});
        }
        if (iOrdinal == 3) {
            return new go();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<go> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (go.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCrossesDangerZone() {
        return this.crossesDangerZone_;
    }

    public boolean getCrossesInternationalBorder() {
        return this.crossesInternationalBorder_;
    }

    public boolean getIncludesFerryRide() {
        return this.includesFerryRide_;
    }

    public boolean hasCrossesDangerZone() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCrossesInternationalBorder() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIncludesFerryRide() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gn newBuilder(go goVar) {
        return (gn) DEFAULT_INSTANCE.createBuilder(goVar);
    }

    public static go parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (go) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static go parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static go parseFrom(com.google.v.z zVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static go parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static go parseFrom(InputStream inputStream) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static go parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static go parseFrom(ByteBuffer byteBuffer) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static go parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static go parseFrom(byte[] bArr) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static go parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (go) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
