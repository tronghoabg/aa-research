package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hf extends com.google.v.du<hf, he> implements com.google.v.fj {
    public static final int ALLOW_UNKNOWN_DIRECTIONS_FIELD_NUMBER = 4;
    public static final int AVOID_DANGEROUS_TURNS_FIELD_NUMBER = 12;
    public static final int AVOID_DANGER_ZONES_FIELD_NUMBER = 6;
    public static final int AVOID_FERRIES_FIELD_NUMBER = 7;
    public static final int AVOID_LONG_TRAILS_FIELD_NUMBER = 3;
    public static final int AVOID_PRIMARIES_FIELD_NUMBER = 1;
    public static final int AVOID_TOLL_ROADS_FIELD_NUMBER = 5;
    public static final int AVOID_TRAILS_FIELD_NUMBER = 2;
    private static final hf DEFAULT_INSTANCE;
    public static final int DESTINATION_IN_DANGER_ZONE_FIELD_NUMBER = 9;
    public static final int IGNORE_PREFERRED_ROUTES_FIELD_NUMBER = 13;
    public static final int ORIGIN_IN_DANGER_ZONE_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<hf> PARSER = null;
    public static final int RETURN_ONLY_SAFETY_INCIDENT_FREE_ALTERNATIVES_FIELD_NUMBER = 14;
    public static final int USE_PETA_FIELD_NUMBER = 10;
    private boolean allowUnknownDirections_;
    private boolean avoidDangerZones_;
    private boolean avoidDangerousTurns_;
    private boolean avoidFerries_;
    private boolean avoidLongTrails_;
    private boolean avoidPrimaries_;
    private boolean avoidTollRoads_;
    private boolean avoidTrails_;
    private int bitField0_;
    private boolean destinationInDangerZone_;
    private boolean ignorePreferredRoutes_;
    private boolean originInDangerZone_;
    private boolean returnOnlySafetyIncidentFreeAlternatives_;
    private boolean usePeta_;

    static {
        hf hfVar = new hf();
        DEFAULT_INSTANCE = hfVar;
        com.google.v.du.registerDefaultInstance(hf.class, hfVar);
    }

    private hf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowUnknownDirections() {
        this.bitField0_ &= -9;
        this.allowUnknownDirections_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidDangerZones() {
        this.bitField0_ &= -33;
        this.avoidDangerZones_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidDangerousTurns() {
        this.bitField0_ &= -1025;
        this.avoidDangerousTurns_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidFerries() {
        this.bitField0_ &= -65;
        this.avoidFerries_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidLongTrails() {
        this.bitField0_ &= -5;
        this.avoidLongTrails_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidPrimaries() {
        this.bitField0_ &= -2;
        this.avoidPrimaries_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidTollRoads() {
        this.bitField0_ &= -17;
        this.avoidTollRoads_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvoidTrails() {
        this.bitField0_ &= -3;
        this.avoidTrails_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationInDangerZone() {
        this.bitField0_ &= -257;
        this.destinationInDangerZone_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIgnorePreferredRoutes() {
        this.bitField0_ &= -2049;
        this.ignorePreferredRoutes_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginInDangerZone() {
        this.bitField0_ &= -129;
        this.originInDangerZone_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnOnlySafetyIncidentFreeAlternatives() {
        this.bitField0_ &= -4097;
        this.returnOnlySafetyIncidentFreeAlternatives_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsePeta() {
        this.bitField0_ &= -513;
        this.usePeta_ = false;
    }

    public static hf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static he newBuilder() {
        return (he) DEFAULT_INSTANCE.createBuilder();
    }

    public static hf parseDelimitedFrom(InputStream inputStream) {
        return (hf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hf parseFrom(com.google.v.v vVar) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowUnknownDirections(boolean z) {
        this.bitField0_ |= 8;
        this.allowUnknownDirections_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidDangerZones(boolean z) {
        this.bitField0_ |= 32;
        this.avoidDangerZones_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidDangerousTurns(boolean z) {
        this.bitField0_ |= 1024;
        this.avoidDangerousTurns_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidFerries(boolean z) {
        this.bitField0_ |= 64;
        this.avoidFerries_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidLongTrails(boolean z) {
        this.bitField0_ |= 4;
        this.avoidLongTrails_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidPrimaries(boolean z) {
        this.bitField0_ |= 1;
        this.avoidPrimaries_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidTollRoads(boolean z) {
        this.bitField0_ |= 16;
        this.avoidTollRoads_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvoidTrails(boolean z) {
        this.bitField0_ |= 2;
        this.avoidTrails_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationInDangerZone(boolean z) {
        this.bitField0_ |= 256;
        this.destinationInDangerZone_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIgnorePreferredRoutes(boolean z) {
        this.bitField0_ |= 2048;
        this.ignorePreferredRoutes_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginInDangerZone(boolean z) {
        this.bitField0_ |= 128;
        this.originInDangerZone_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnOnlySafetyIncidentFreeAlternatives(boolean z) {
        this.bitField0_ |= 4096;
        this.returnOnlySafetyIncidentFreeAlternatives_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsePeta(boolean z) {
        this.bitField0_ |= 512;
        this.usePeta_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\fဇ\n\rဇ\u000b\u000eဇ\f", new Object[]{"bitField0_", "avoidPrimaries_", "avoidTrails_", "avoidLongTrails_", "allowUnknownDirections_", "avoidTollRoads_", "avoidDangerZones_", "avoidFerries_", "originInDangerZone_", "destinationInDangerZone_", "usePeta_", "avoidDangerousTurns_", "ignorePreferredRoutes_", "returnOnlySafetyIncidentFreeAlternatives_"});
        }
        if (iOrdinal == 3) {
            return new hf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new he(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAllowUnknownDirections() {
        return this.allowUnknownDirections_;
    }

    public boolean getAvoidDangerZones() {
        return this.avoidDangerZones_;
    }

    public boolean getAvoidDangerousTurns() {
        return this.avoidDangerousTurns_;
    }

    public boolean getAvoidFerries() {
        return this.avoidFerries_;
    }

    public boolean getAvoidLongTrails() {
        return this.avoidLongTrails_;
    }

    public boolean getAvoidPrimaries() {
        return this.avoidPrimaries_;
    }

    public boolean getAvoidTollRoads() {
        return this.avoidTollRoads_;
    }

    public boolean getAvoidTrails() {
        return this.avoidTrails_;
    }

    public boolean getDestinationInDangerZone() {
        return this.destinationInDangerZone_;
    }

    public boolean getIgnorePreferredRoutes() {
        return this.ignorePreferredRoutes_;
    }

    public boolean getOriginInDangerZone() {
        return this.originInDangerZone_;
    }

    public boolean getReturnOnlySafetyIncidentFreeAlternatives() {
        return this.returnOnlySafetyIncidentFreeAlternatives_;
    }

    public boolean getUsePeta() {
        return this.usePeta_;
    }

    public boolean hasAllowUnknownDirections() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAvoidDangerZones() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasAvoidDangerousTurns() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasAvoidFerries() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasAvoidLongTrails() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAvoidPrimaries() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAvoidTollRoads() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAvoidTrails() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDestinationInDangerZone() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIgnorePreferredRoutes() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasOriginInDangerZone() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasReturnOnlySafetyIncidentFreeAlternatives() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasUsePeta() {
        return (this.bitField0_ & 512) != 0;
    }

    public static he newBuilder(hf hfVar) {
        return (he) DEFAULT_INSTANCE.createBuilder(hfVar);
    }

    public static hf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hf parseFrom(com.google.v.z zVar) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hf parseFrom(InputStream inputStream) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hf parseFrom(ByteBuffer byteBuffer) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hf parseFrom(byte[] bArr) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
