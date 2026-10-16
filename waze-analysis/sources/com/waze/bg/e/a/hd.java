package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hd extends com.google.v.du<hd, hc> implements com.google.v.fj {
    private static final hd DEFAULT_INSTANCE;
    public static final int INVALID_FOR_PRIVATE_VEHICLE_FIELD_NUMBER = 3;
    public static final int IS_VIGNETTE_FIELD_NUMBER = 6;
    public static final int LICENSE_PLATE_RESTRICTED_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<hd> PARSER = null;
    public static final int REQUIRED_PERMITS_FIELD_NUMBER = 1;
    public static final int RESTRICTED_AREAS_FIELD_NUMBER = 2;
    public static final int ZONE_RESTRICTED_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean invalidForPrivateVehicle_;
    private boolean isVignette_;
    private boolean licensePlateRestricted_;
    private com.google.v.eo<String> requiredPermits_ = emptyProtobufList();
    private com.google.v.eo<gl> restrictedAreas_ = emptyProtobufList();
    private boolean zoneRestricted_;

    static {
        hd hdVar = new hd();
        DEFAULT_INSTANCE = hdVar;
        com.google.v.du.registerDefaultInstance(hd.class, hdVar);
    }

    private hd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequiredPermits(Iterable<String> iterable) {
        ensureRequiredPermitsIsMutable();
        com.google.v.c.addAll(iterable, this.requiredPermits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestrictedAreas(Iterable<? extends gl> iterable) {
        ensureRestrictedAreasIsMutable();
        com.google.v.c.addAll(iterable, this.restrictedAreas_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermits(String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermitsBytes(com.google.v.v vVar) {
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictedAreas(int i2, gl glVar) {
        Objects.requireNonNull(glVar);
        ensureRestrictedAreasIsMutable();
        this.restrictedAreas_.add(i2, glVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInvalidForPrivateVehicle() {
        this.bitField0_ &= -2;
        this.invalidForPrivateVehicle_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsVignette() {
        this.bitField0_ &= -9;
        this.isVignette_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLicensePlateRestricted() {
        this.bitField0_ &= -5;
        this.licensePlateRestricted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiredPermits() {
        this.requiredPermits_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictedAreas() {
        this.restrictedAreas_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZoneRestricted() {
        this.bitField0_ &= -3;
        this.zoneRestricted_ = false;
    }

    private void ensureRequiredPermitsIsMutable() {
        com.google.v.eo<String> eoVar = this.requiredPermits_;
        if (eoVar.c()) {
            return;
        }
        this.requiredPermits_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRestrictedAreasIsMutable() {
        com.google.v.eo<gl> eoVar = this.restrictedAreas_;
        if (eoVar.c()) {
            return;
        }
        this.restrictedAreas_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static hd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hc newBuilder() {
        return (hc) DEFAULT_INSTANCE.createBuilder();
    }

    public static hd parseDelimitedFrom(InputStream inputStream) {
        return (hd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hd parseFrom(com.google.v.v vVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRestrictedAreas(int i2) {
        ensureRestrictedAreasIsMutable();
        this.restrictedAreas_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvalidForPrivateVehicle(boolean z) {
        this.bitField0_ |= 1;
        this.invalidForPrivateVehicle_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsVignette(boolean z) {
        this.bitField0_ |= 8;
        this.isVignette_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateRestricted(boolean z) {
        this.bitField0_ |= 4;
        this.licensePlateRestricted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiredPermits(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictedAreas(int i2, gl glVar) {
        Objects.requireNonNull(glVar);
        ensureRestrictedAreasIsMutable();
        this.restrictedAreas_.set(i2, glVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZoneRestricted(boolean z) {
        this.bitField0_ |= 2;
        this.zoneRestricted_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001a\u0002\u001b\u0003ဇ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0003", new Object[]{"bitField0_", "requiredPermits_", "restrictedAreas_", gl.class, "invalidForPrivateVehicle_", "zoneRestricted_", "licensePlateRestricted_", "isVignette_"});
        }
        if (iOrdinal == 3) {
            return new hd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getInvalidForPrivateVehicle() {
        return this.invalidForPrivateVehicle_;
    }

    public boolean getIsVignette() {
        return this.isVignette_;
    }

    public boolean getLicensePlateRestricted() {
        return this.licensePlateRestricted_;
    }

    public String getRequiredPermits(int i2) {
        return this.requiredPermits_.get(i2);
    }

    public com.google.v.v getRequiredPermitsBytes(int i2) {
        return com.google.v.v.s(this.requiredPermits_.get(i2));
    }

    public int getRequiredPermitsCount() {
        return this.requiredPermits_.size();
    }

    public List<String> getRequiredPermitsList() {
        return this.requiredPermits_;
    }

    public gl getRestrictedAreas(int i2) {
        return this.restrictedAreas_.get(i2);
    }

    public int getRestrictedAreasCount() {
        return this.restrictedAreas_.size();
    }

    public List<gl> getRestrictedAreasList() {
        return this.restrictedAreas_;
    }

    public gm getRestrictedAreasOrBuilder(int i2) {
        return this.restrictedAreas_.get(i2);
    }

    public List<? extends gm> getRestrictedAreasOrBuilderList() {
        return this.restrictedAreas_;
    }

    public boolean getZoneRestricted() {
        return this.zoneRestricted_;
    }

    public boolean hasInvalidForPrivateVehicle() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsVignette() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLicensePlateRestricted() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasZoneRestricted() {
        return (this.bitField0_ & 2) != 0;
    }

    public static hc newBuilder(hd hdVar) {
        return (hc) DEFAULT_INSTANCE.createBuilder(hdVar);
    }

    public static hd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hd parseFrom(com.google.v.z zVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestrictedAreas(gl glVar) {
        Objects.requireNonNull(glVar);
        ensureRestrictedAreasIsMutable();
        this.restrictedAreas_.add(glVar);
    }

    public static hd parseFrom(InputStream inputStream) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hd parseFrom(ByteBuffer byteBuffer) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hd parseFrom(byte[] bArr) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
