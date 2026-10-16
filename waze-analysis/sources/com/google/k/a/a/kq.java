package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kq extends com.google.v.du<kq, kc> implements com.google.v.fj {
    public static final int AFFECTED_INTERSECTION_TRAVERSALS_FIELD_NUMBER = 8;
    public static final int AFFECTED_SEGMENT_PORTIONS_FIELD_NUMBER = 7;
    public static final int AFFECTED_TRAVEL_MODES_FIELD_NUMBER = 12;
    public static final int AFFECTED_VEHICLE_FILTER_FIELD_NUMBER = 13;
    public static final int CAUSE_FIELD_NUMBER = 1;
    public static final int CURRENT_STATE_FIELD_NUMBER = 3;
    private static final kq DEFAULT_INSTANCE;
    public static final int FUTURE_STATE_FIELD_NUMBER = 4;
    public static final int LAST_ACTIVE_START_DATETIME_FIELD_NUMBER = 5;
    public static final int LAST_INACTIVE_START_DATETIME_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<kq> PARSER = null;
    public static final int PLANNED_SCHEDULE_FIELD_NUMBER = 2;
    public static final int SAFETY_ALERT_DETAILS_FIELD_NUMBER = 20;
    public static final int SCHEDULE_RESUMPTION_TIME_FIELD_NUMBER = 9;
    private static final com.google.v.el<nk> affectedTravelModes_converter_ = new fn(13);
    private oc affectedVehicleFilter_;
    private int bitField0_;
    private kg cause_;
    private kp currentState_;
    private kp futureState_;
    private com.google.k.a.a.b.au lastActiveStartDatetime_;
    private com.google.k.a.a.b.au lastInactiveStartDatetime_;
    private com.google.k.a.a.b.kj plannedSchedule_;
    private km safetyAlertDetails_;
    private com.google.k.a.a.b.au scheduleResumptionTime_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<kv> affectedSegmentPortions_ = emptyProtobufList();
    private com.google.v.eo<ki> affectedIntersectionTraversals_ = emptyProtobufList();
    private com.google.v.ek affectedTravelModes_ = emptyIntList();

    static {
        kq kqVar = new kq();
        DEFAULT_INSTANCE = kqVar;
        com.google.v.du.registerDefaultInstance(kq.class, kqVar);
    }

    private kq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAffectedIntersectionTraversals(int i2, ki kiVar) {
        Objects.requireNonNull(kiVar);
        ensureAffectedIntersectionTraversalsIsMutable();
        this.affectedIntersectionTraversals_.add(i2, kiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAffectedSegmentPortions(int i2, kv kvVar) {
        Objects.requireNonNull(kvVar);
        ensureAffectedSegmentPortionsIsMutable();
        this.affectedSegmentPortions_.add(i2, kvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAffectedTravelModes(nk nkVar) {
        Objects.requireNonNull(nkVar);
        ensureAffectedTravelModesIsMutable();
        this.affectedTravelModes_.i(nkVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAffectedIntersectionTraversals(Iterable<? extends ki> iterable) {
        ensureAffectedIntersectionTraversalsIsMutable();
        com.google.v.c.addAll(iterable, this.affectedIntersectionTraversals_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAffectedSegmentPortions(Iterable<? extends kv> iterable) {
        ensureAffectedSegmentPortionsIsMutable();
        com.google.v.c.addAll(iterable, this.affectedSegmentPortions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAffectedTravelModes(Iterable<? extends nk> iterable) {
        ensureAffectedTravelModesIsMutable();
        Iterator<? extends nk> it = iterable.iterator();
        while (it.hasNext()) {
            this.affectedTravelModes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAffectedIntersectionTraversals() {
        this.affectedIntersectionTraversals_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAffectedSegmentPortions() {
        this.affectedSegmentPortions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAffectedTravelModes() {
        this.affectedTravelModes_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAffectedVehicleFilter() {
        this.affectedVehicleFilter_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCause() {
        this.cause_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentState() {
        this.currentState_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFutureState() {
        this.futureState_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastActiveStartDatetime() {
        this.lastActiveStartDatetime_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastInactiveStartDatetime() {
        this.lastInactiveStartDatetime_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlannedSchedule() {
        this.plannedSchedule_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSafetyAlertDetails() {
        this.safetyAlertDetails_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScheduleResumptionTime() {
        this.scheduleResumptionTime_ = null;
        this.bitField0_ &= -17;
    }

    private void ensureAffectedIntersectionTraversalsIsMutable() {
        com.google.v.eo<ki> eoVar = this.affectedIntersectionTraversals_;
        if (eoVar.c()) {
            return;
        }
        this.affectedIntersectionTraversals_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAffectedSegmentPortionsIsMutable() {
        com.google.v.eo<kv> eoVar = this.affectedSegmentPortions_;
        if (eoVar.c()) {
            return;
        }
        this.affectedSegmentPortions_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAffectedTravelModesIsMutable() {
        com.google.v.ek ekVar = this.affectedTravelModes_;
        if (ekVar.c()) {
            return;
        }
        this.affectedTravelModes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static kq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAffectedVehicleFilter(oc ocVar) {
        Objects.requireNonNull(ocVar);
        oc ocVar2 = this.affectedVehicleFilter_;
        if (ocVar2 != null && ocVar2 != oc.getDefaultInstance()) {
            oa oaVarNewBuilder = oc.newBuilder(ocVar2);
            oaVarNewBuilder.mergeFrom((oa) ocVar);
            ocVar = oaVarNewBuilder.buildPartial();
        }
        this.affectedVehicleFilter_ = ocVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCause(kg kgVar) {
        Objects.requireNonNull(kgVar);
        kg kgVar2 = this.cause_;
        if (kgVar2 != null && kgVar2 != kg.getDefaultInstance()) {
            kd kdVarNewBuilder = kg.newBuilder(kgVar2);
            kdVarNewBuilder.mergeFrom((kd) kgVar);
            kgVar = kdVarNewBuilder.buildPartial();
        }
        this.cause_ = kgVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentState(kp kpVar) {
        Objects.requireNonNull(kpVar);
        kp kpVar2 = this.currentState_;
        if (kpVar2 != null && kpVar2 != kp.getDefaultInstance()) {
            kn knVarNewBuilder = kp.newBuilder(kpVar2);
            knVarNewBuilder.mergeFrom((kn) kpVar);
            kpVar = knVarNewBuilder.buildPartial();
        }
        this.currentState_ = kpVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFutureState(kp kpVar) {
        Objects.requireNonNull(kpVar);
        kp kpVar2 = this.futureState_;
        if (kpVar2 != null && kpVar2 != kp.getDefaultInstance()) {
            kn knVarNewBuilder = kp.newBuilder(kpVar2);
            knVarNewBuilder.mergeFrom((kn) kpVar);
            kpVar = knVarNewBuilder.buildPartial();
        }
        this.futureState_ = kpVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastActiveStartDatetime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        com.google.k.a.a.b.au auVar2 = this.lastActiveStartDatetime_;
        if (auVar2 != null && auVar2 != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.lastActiveStartDatetime_ = auVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastInactiveStartDatetime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        com.google.k.a.a.b.au auVar2 = this.lastInactiveStartDatetime_;
        if (auVar2 != null && auVar2 != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.lastInactiveStartDatetime_ = auVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlannedSchedule(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        com.google.k.a.a.b.kj kjVar2 = this.plannedSchedule_;
        if (kjVar2 != null && kjVar2 != com.google.k.a.a.b.kj.getDefaultInstance()) {
            com.google.k.a.a.b.ki kiVarNewBuilder = com.google.k.a.a.b.kj.newBuilder(kjVar2);
            kiVarNewBuilder.mergeFrom((com.google.k.a.a.b.ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.plannedSchedule_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSafetyAlertDetails(km kmVar) {
        Objects.requireNonNull(kmVar);
        km kmVar2 = this.safetyAlertDetails_;
        if (kmVar2 != null && kmVar2 != km.getDefaultInstance()) {
            kk kkVarNewBuilder = km.newBuilder(kmVar2);
            kkVarNewBuilder.mergeFrom((kk) kmVar);
            kmVar = kkVarNewBuilder.buildPartial();
        }
        this.safetyAlertDetails_ = kmVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScheduleResumptionTime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        com.google.k.a.a.b.au auVar2 = this.scheduleResumptionTime_;
        if (auVar2 != null && auVar2 != com.google.k.a.a.b.au.getDefaultInstance()) {
            com.google.k.a.a.b.as asVarNewBuilder = com.google.k.a.a.b.au.newBuilder(auVar2);
            asVarNewBuilder.mergeFrom((com.google.k.a.a.b.as) auVar);
            auVar = asVarNewBuilder.buildPartial();
        }
        this.scheduleResumptionTime_ = auVar;
        this.bitField0_ |= 16;
    }

    public static kc newBuilder() {
        return (kc) DEFAULT_INSTANCE.createBuilder();
    }

    public static kq parseDelimitedFrom(InputStream inputStream) {
        return (kq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kq parseFrom(com.google.v.v vVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAffectedIntersectionTraversals(int i2) {
        ensureAffectedIntersectionTraversalsIsMutable();
        this.affectedIntersectionTraversals_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAffectedSegmentPortions(int i2) {
        ensureAffectedSegmentPortionsIsMutable();
        this.affectedSegmentPortions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedIntersectionTraversals(int i2, ki kiVar) {
        Objects.requireNonNull(kiVar);
        ensureAffectedIntersectionTraversalsIsMutable();
        this.affectedIntersectionTraversals_.set(i2, kiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedSegmentPortions(int i2, kv kvVar) {
        Objects.requireNonNull(kvVar);
        ensureAffectedSegmentPortionsIsMutable();
        this.affectedSegmentPortions_.set(i2, kvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedTravelModes(int i2, nk nkVar) {
        Objects.requireNonNull(nkVar);
        ensureAffectedTravelModesIsMutable();
        this.affectedTravelModes_.e(i2, nkVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAffectedVehicleFilter(oc ocVar) {
        Objects.requireNonNull(ocVar);
        this.affectedVehicleFilter_ = ocVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCause(kg kgVar) {
        Objects.requireNonNull(kgVar);
        this.cause_ = kgVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentState(kp kpVar) {
        Objects.requireNonNull(kpVar);
        this.currentState_ = kpVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFutureState(kp kpVar) {
        Objects.requireNonNull(kpVar);
        this.futureState_ = kpVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastActiveStartDatetime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.lastActiveStartDatetime_ = auVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastInactiveStartDatetime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.lastInactiveStartDatetime_ = auVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlannedSchedule(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.plannedSchedule_ = kjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSafetyAlertDetails(km kmVar) {
        Objects.requireNonNull(kmVar);
        this.safetyAlertDetails_ = kmVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheduleResumptionTime(com.google.k.a.a.b.au auVar) {
        Objects.requireNonNull(auVar);
        this.scheduleResumptionTime_ = auVar;
        this.bitField0_ |= 16;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\u0014\f\u0000\u0003\u0003\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0005\u0006ဉ\u0006\u0007Л\bЛ\tဉ\u0004\fࠞ\rဉ\u0007\u0014ဉ\b", new Object[]{"bitField0_", "cause_", "plannedSchedule_", "currentState_", "futureState_", "lastActiveStartDatetime_", "lastInactiveStartDatetime_", "affectedSegmentPortions_", kv.class, "affectedIntersectionTraversals_", ki.class, "scheduleResumptionTime_", "affectedTravelModes_", lq.f12091d, "affectedVehicleFilter_", "safetyAlertDetails_"});
            case 3:
                return new kq();
            case 4:
                return new kc(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<kq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (kq.class) {
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

    public ki getAffectedIntersectionTraversals(int i2) {
        return this.affectedIntersectionTraversals_.get(i2);
    }

    public int getAffectedIntersectionTraversalsCount() {
        return this.affectedIntersectionTraversals_.size();
    }

    public List<ki> getAffectedIntersectionTraversalsList() {
        return this.affectedIntersectionTraversals_;
    }

    public kj getAffectedIntersectionTraversalsOrBuilder(int i2) {
        return this.affectedIntersectionTraversals_.get(i2);
    }

    public List<? extends kj> getAffectedIntersectionTraversalsOrBuilderList() {
        return this.affectedIntersectionTraversals_;
    }

    public kv getAffectedSegmentPortions(int i2) {
        return this.affectedSegmentPortions_.get(i2);
    }

    public int getAffectedSegmentPortionsCount() {
        return this.affectedSegmentPortions_.size();
    }

    public List<kv> getAffectedSegmentPortionsList() {
        return this.affectedSegmentPortions_;
    }

    public kw getAffectedSegmentPortionsOrBuilder(int i2) {
        return this.affectedSegmentPortions_.get(i2);
    }

    public List<? extends kw> getAffectedSegmentPortionsOrBuilderList() {
        return this.affectedSegmentPortions_;
    }

    public nk getAffectedTravelModes(int i2) {
        nk nkVarA = nk.a(this.affectedTravelModes_.d(i2));
        return nkVarA == null ? nk.TRAVEL_MODE_UNSPECIFIED : nkVarA;
    }

    public int getAffectedTravelModesCount() {
        return this.affectedTravelModes_.size();
    }

    public List<nk> getAffectedTravelModesList() {
        return new com.google.v.em(this.affectedTravelModes_, affectedTravelModes_converter_);
    }

    public oc getAffectedVehicleFilter() {
        oc ocVar = this.affectedVehicleFilter_;
        return ocVar == null ? oc.getDefaultInstance() : ocVar;
    }

    public kg getCause() {
        kg kgVar = this.cause_;
        return kgVar == null ? kg.getDefaultInstance() : kgVar;
    }

    public kp getCurrentState() {
        kp kpVar = this.currentState_;
        return kpVar == null ? kp.getDefaultInstance() : kpVar;
    }

    public kp getFutureState() {
        kp kpVar = this.futureState_;
        return kpVar == null ? kp.getDefaultInstance() : kpVar;
    }

    public com.google.k.a.a.b.au getLastActiveStartDatetime() {
        com.google.k.a.a.b.au auVar = this.lastActiveStartDatetime_;
        return auVar == null ? com.google.k.a.a.b.au.getDefaultInstance() : auVar;
    }

    public com.google.k.a.a.b.au getLastInactiveStartDatetime() {
        com.google.k.a.a.b.au auVar = this.lastInactiveStartDatetime_;
        return auVar == null ? com.google.k.a.a.b.au.getDefaultInstance() : auVar;
    }

    public com.google.k.a.a.b.kj getPlannedSchedule() {
        com.google.k.a.a.b.kj kjVar = this.plannedSchedule_;
        return kjVar == null ? com.google.k.a.a.b.kj.getDefaultInstance() : kjVar;
    }

    public km getSafetyAlertDetails() {
        km kmVar = this.safetyAlertDetails_;
        return kmVar == null ? km.getDefaultInstance() : kmVar;
    }

    public com.google.k.a.a.b.au getScheduleResumptionTime() {
        com.google.k.a.a.b.au auVar = this.scheduleResumptionTime_;
        return auVar == null ? com.google.k.a.a.b.au.getDefaultInstance() : auVar;
    }

    public boolean hasAffectedVehicleFilter() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCause() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCurrentState() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFutureState() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLastActiveStartDatetime() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLastInactiveStartDatetime() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPlannedSchedule() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSafetyAlertDetails() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasScheduleResumptionTime() {
        return (this.bitField0_ & 16) != 0;
    }

    public static kc newBuilder(kq kqVar) {
        return (kc) DEFAULT_INSTANCE.createBuilder(kqVar);
    }

    public static kq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kq parseFrom(com.google.v.z zVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAffectedIntersectionTraversals(ki kiVar) {
        Objects.requireNonNull(kiVar);
        ensureAffectedIntersectionTraversalsIsMutable();
        this.affectedIntersectionTraversals_.add(kiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAffectedSegmentPortions(kv kvVar) {
        Objects.requireNonNull(kvVar);
        ensureAffectedSegmentPortionsIsMutable();
        this.affectedSegmentPortions_.add(kvVar);
    }

    public static kq parseFrom(InputStream inputStream) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kq parseFrom(ByteBuffer byteBuffer) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kq parseFrom(byte[] bArr) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
