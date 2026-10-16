package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gp extends com.google.v.du<gp, go> implements com.google.v.fj {
    public static final int ALLOWANCE_FIELD_NUMBER = 5;
    private static final gp DEFAULT_INSTANCE;
    public static final int OPENING_HOURS_FIELD_NUMBER = 2;
    public static final int PARKING_ASSOCIATION_FIELD_NUMBER = 6;
    public static final int PARKING_AVAILABLE_FIELD_NUMBER = 4;
    public static final int PARKING_PROVIDER_FEATURE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gp> PARSER = null;
    public static final int RESTRICTION_FIELD_NUMBER = 3;
    private int bitField0_;
    private ge openingHours_;
    private boolean parkingAvailable_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> parkingProviderFeature_ = emptyProtobufList();
    private com.google.v.eo<gm> parkingAssociation_ = emptyProtobufList();
    private com.google.v.eo<gj> allowance_ = emptyProtobufList();
    private com.google.v.eo<gs> restriction_ = emptyProtobufList();

    static {
        gp gpVar = new gp();
        DEFAULT_INSTANCE = gpVar;
        com.google.v.du.registerDefaultInstance(gp.class, gpVar);
    }

    private gp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowance(Iterable<? extends gj> iterable) {
        ensureAllowanceIsMutable();
        com.google.v.c.addAll(iterable, this.allowance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParkingAssociation(Iterable<? extends gm> iterable) {
        ensureParkingAssociationIsMutable();
        com.google.v.c.addAll(iterable, this.parkingAssociation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParkingProviderFeature(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureParkingProviderFeatureIsMutable();
        com.google.v.c.addAll(iterable, this.parkingProviderFeature_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestriction(Iterable<? extends gs> iterable) {
        ensureRestrictionIsMutable();
        com.google.v.c.addAll(iterable, this.restriction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowance(int i2, gj gjVar) {
        Objects.requireNonNull(gjVar);
        ensureAllowanceIsMutable();
        this.allowance_.add(i2, gjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParkingAssociation(int i2, gm gmVar) {
        Objects.requireNonNull(gmVar);
        ensureParkingAssociationIsMutable();
        this.parkingAssociation_.add(i2, gmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParkingProviderFeature(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureParkingProviderFeatureIsMutable();
        this.parkingProviderFeature_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(int i2, gs gsVar) {
        Objects.requireNonNull(gsVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(i2, gsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowance() {
        this.allowance_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpeningHours() {
        this.openingHours_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingAssociation() {
        this.parkingAssociation_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingAvailable() {
        this.bitField0_ &= -2;
        this.parkingAvailable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingProviderFeature() {
        this.parkingProviderFeature_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = emptyProtobufList();
    }

    private void ensureAllowanceIsMutable() {
        com.google.v.eo<gj> eoVar = this.allowance_;
        if (eoVar.c()) {
            return;
        }
        this.allowance_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureParkingAssociationIsMutable() {
        com.google.v.eo<gm> eoVar = this.parkingAssociation_;
        if (eoVar.c()) {
            return;
        }
        this.parkingAssociation_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureParkingProviderFeatureIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.parkingProviderFeature_;
        if (eoVar.c()) {
            return;
        }
        this.parkingProviderFeature_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRestrictionIsMutable() {
        com.google.v.eo<gs> eoVar = this.restriction_;
        if (eoVar.c()) {
            return;
        }
        this.restriction_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOpeningHours(ge geVar) {
        Objects.requireNonNull(geVar);
        ge geVar2 = this.openingHours_;
        if (geVar2 != null && geVar2 != ge.getDefaultInstance()) {
            gd gdVarNewBuilder = ge.newBuilder(geVar2);
            gdVarNewBuilder.mergeFrom((gd) geVar);
            geVar = gdVarNewBuilder.buildPartial();
        }
        this.openingHours_ = geVar;
        this.bitField0_ |= 2;
    }

    public static go newBuilder() {
        return (go) DEFAULT_INSTANCE.createBuilder();
    }

    public static gp parseDelimitedFrom(InputStream inputStream) {
        return (gp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gp parseFrom(com.google.v.v vVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllowance(int i2) {
        ensureAllowanceIsMutable();
        this.allowance_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParkingAssociation(int i2) {
        ensureParkingAssociationIsMutable();
        this.parkingAssociation_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParkingProviderFeature(int i2) {
        ensureParkingProviderFeatureIsMutable();
        this.parkingProviderFeature_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRestriction(int i2) {
        ensureRestrictionIsMutable();
        this.restriction_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowance(int i2, gj gjVar) {
        Objects.requireNonNull(gjVar);
        ensureAllowanceIsMutable();
        this.allowance_.set(i2, gjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningHours(ge geVar) {
        Objects.requireNonNull(geVar);
        this.openingHours_ = geVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingAssociation(int i2, gm gmVar) {
        Objects.requireNonNull(gmVar);
        ensureParkingAssociationIsMutable();
        this.parkingAssociation_.set(i2, gmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingAvailable(boolean z) {
        this.bitField0_ |= 1;
        this.parkingAvailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingProviderFeature(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureParkingProviderFeatureIsMutable();
        this.parkingProviderFeature_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(int i2, gs gsVar) {
        Objects.requireNonNull(gsVar);
        ensureRestrictionIsMutable();
        this.restriction_.set(i2, gsVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0004\u0004\u0001Л\u0002ᐉ\u0001\u0003\u001b\u0004ဇ\u0000\u0005Л\u0006Л", new Object[]{"bitField0_", "parkingProviderFeature_", com.google.k.a.a.b.bw.class, "openingHours_", "restriction_", gs.class, "parkingAvailable_", "allowance_", gj.class, "parkingAssociation_", gm.class});
            case 3:
                return new gp();
            case 4:
                return new go(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gp> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gp.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public gj getAllowance(int i2) {
        return this.allowance_.get(i2);
    }

    public int getAllowanceCount() {
        return this.allowance_.size();
    }

    public List<gj> getAllowanceList() {
        return this.allowance_;
    }

    public gk getAllowanceOrBuilder(int i2) {
        return this.allowance_.get(i2);
    }

    public List<? extends gk> getAllowanceOrBuilderList() {
        return this.allowance_;
    }

    public ge getOpeningHours() {
        ge geVar = this.openingHours_;
        return geVar == null ? ge.getDefaultInstance() : geVar;
    }

    public gm getParkingAssociation(int i2) {
        return this.parkingAssociation_.get(i2);
    }

    public int getParkingAssociationCount() {
        return this.parkingAssociation_.size();
    }

    public List<gm> getParkingAssociationList() {
        return this.parkingAssociation_;
    }

    public gn getParkingAssociationOrBuilder(int i2) {
        return this.parkingAssociation_.get(i2);
    }

    public List<? extends gn> getParkingAssociationOrBuilderList() {
        return this.parkingAssociation_;
    }

    public boolean getParkingAvailable() {
        return this.parkingAvailable_;
    }

    public com.google.k.a.a.b.bw getParkingProviderFeature(int i2) {
        return this.parkingProviderFeature_.get(i2);
    }

    public int getParkingProviderFeatureCount() {
        return this.parkingProviderFeature_.size();
    }

    public List<com.google.k.a.a.b.bw> getParkingProviderFeatureList() {
        return this.parkingProviderFeature_;
    }

    public com.google.k.a.a.b.bx getParkingProviderFeatureOrBuilder(int i2) {
        return this.parkingProviderFeature_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getParkingProviderFeatureOrBuilderList() {
        return this.parkingProviderFeature_;
    }

    public gs getRestriction(int i2) {
        return this.restriction_.get(i2);
    }

    public int getRestrictionCount() {
        return this.restriction_.size();
    }

    public List<gs> getRestrictionList() {
        return this.restriction_;
    }

    public gt getRestrictionOrBuilder(int i2) {
        return this.restriction_.get(i2);
    }

    public List<? extends gt> getRestrictionOrBuilderList() {
        return this.restriction_;
    }

    public boolean hasOpeningHours() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParkingAvailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public static go newBuilder(gp gpVar) {
        return (go) DEFAULT_INSTANCE.createBuilder(gpVar);
    }

    public static gp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gp parseFrom(com.google.v.z zVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowance(gj gjVar) {
        Objects.requireNonNull(gjVar);
        ensureAllowanceIsMutable();
        this.allowance_.add(gjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParkingAssociation(gm gmVar) {
        Objects.requireNonNull(gmVar);
        ensureParkingAssociationIsMutable();
        this.parkingAssociation_.add(gmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParkingProviderFeature(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureParkingProviderFeatureIsMutable();
        this.parkingProviderFeature_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(gs gsVar) {
        Objects.requireNonNull(gsVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(gsVar);
    }

    public static gp parseFrom(InputStream inputStream) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gp parseFrom(ByteBuffer byteBuffer) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gp parseFrom(byte[] bArr) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
