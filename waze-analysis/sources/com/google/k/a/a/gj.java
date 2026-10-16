package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gj extends com.google.v.du<gj, gh> implements gk {
    public static final int ALLOWANCE_TYPE_FIELD_NUMBER = 1;
    private static final gj DEFAULT_INSTANCE;
    public static final int IS_DISCOUNT_FIELD_NUMBER = 5;
    public static final int MIN_PURCHASE_FOR_VALIDATION_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<gj> PARSER = null;
    public static final int PERMIT_TYPE_FIELD_NUMBER = 3;
    public static final int SERVICE_TYPE_FIELD_NUMBER = 7;
    public static final int TIME_BASED_RATE_FIELD_NUMBER = 6;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 2;
    private static final com.google.v.el<gv> serviceType_converter_ = new fn(2);
    private int allowanceType_;
    private int bitField0_;
    private boolean isDiscount_;
    private int vehicleType_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.ek serviceType_ = emptyIntList();
    private com.google.v.eo<com.google.k.a.a.b.dv> permitType_ = emptyProtobufList();
    private com.google.v.eo<com.google.i.s> minPurchaseForValidation_ = emptyProtobufList();
    private com.google.v.eo<mf> timeBasedRate_ = emptyProtobufList();

    static {
        gj gjVar = new gj();
        DEFAULT_INSTANCE = gjVar;
        com.google.v.du.registerDefaultInstance(gj.class, gjVar);
    }

    private gj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMinPurchaseForValidation(Iterable<? extends com.google.i.s> iterable) {
        ensureMinPurchaseForValidationIsMutable();
        com.google.v.c.addAll(iterable, this.minPurchaseForValidation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPermitType(Iterable<? extends com.google.k.a.a.b.dv> iterable) {
        ensurePermitTypeIsMutable();
        com.google.v.c.addAll(iterable, this.permitType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServiceType(Iterable<? extends gv> iterable) {
        ensureServiceTypeIsMutable();
        Iterator<? extends gv> it = iterable.iterator();
        while (it.hasNext()) {
            this.serviceType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimeBasedRate(Iterable<? extends mf> iterable) {
        ensureTimeBasedRateIsMutable();
        com.google.v.c.addAll(iterable, this.timeBasedRate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMinPurchaseForValidation(int i2, com.google.i.s sVar) {
        Objects.requireNonNull(sVar);
        ensureMinPurchaseForValidationIsMutable();
        this.minPurchaseForValidation_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermitType(int i2, com.google.k.a.a.b.dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensurePermitTypeIsMutable();
        this.permitType_.add(i2, dvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServiceType(gv gvVar) {
        Objects.requireNonNull(gvVar);
        ensureServiceTypeIsMutable();
        this.serviceType_.i(gvVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimeBasedRate(int i2, mf mfVar) {
        Objects.requireNonNull(mfVar);
        ensureTimeBasedRateIsMutable();
        this.timeBasedRate_.add(i2, mfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowanceType() {
        this.bitField0_ &= -2;
        this.allowanceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDiscount() {
        this.bitField0_ &= -5;
        this.isDiscount_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinPurchaseForValidation() {
        this.minPurchaseForValidation_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermitType() {
        this.permitType_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceType() {
        this.serviceType_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeBasedRate() {
        this.timeBasedRate_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.bitField0_ &= -3;
        this.vehicleType_ = 0;
    }

    private void ensureMinPurchaseForValidationIsMutable() {
        com.google.v.eo<com.google.i.s> eoVar = this.minPurchaseForValidation_;
        if (eoVar.c()) {
            return;
        }
        this.minPurchaseForValidation_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePermitTypeIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.dv> eoVar = this.permitType_;
        if (eoVar.c()) {
            return;
        }
        this.permitType_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureServiceTypeIsMutable() {
        com.google.v.ek ekVar = this.serviceType_;
        if (ekVar.c()) {
            return;
        }
        this.serviceType_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureTimeBasedRateIsMutable() {
        com.google.v.eo<mf> eoVar = this.timeBasedRate_;
        if (eoVar.c()) {
            return;
        }
        this.timeBasedRate_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static gj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gh newBuilder() {
        return (gh) DEFAULT_INSTANCE.createBuilder();
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
    public void removeMinPurchaseForValidation(int i2) {
        ensureMinPurchaseForValidationIsMutable();
        this.minPurchaseForValidation_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePermitType(int i2) {
        ensurePermitTypeIsMutable();
        this.permitType_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTimeBasedRate(int i2) {
        ensureTimeBasedRateIsMutable();
        this.timeBasedRate_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowanceType(gi giVar) {
        this.allowanceType_ = giVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDiscount(boolean z) {
        this.bitField0_ |= 4;
        this.isDiscount_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinPurchaseForValidation(int i2, com.google.i.s sVar) {
        Objects.requireNonNull(sVar);
        ensureMinPurchaseForValidationIsMutable();
        this.minPurchaseForValidation_.set(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermitType(int i2, com.google.k.a.a.b.dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensurePermitTypeIsMutable();
        this.permitType_.set(i2, dvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceType(int i2, gv gvVar) {
        Objects.requireNonNull(gvVar);
        ensureServiceTypeIsMutable();
        this.serviceType_.e(i2, gvVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBasedRate(int i2, mf mfVar) {
        Objects.requireNonNull(mfVar);
        ensureTimeBasedRateIsMutable();
        this.timeBasedRate_.set(i2, mfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(gu guVar) {
        this.vehicleType_ = guVar.getNumber();
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0002\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004Л\u0005ဇ\u0002\u0006Л\u0007ࠞ", new Object[]{"bitField0_", "allowanceType_", h.r, "vehicleType_", h.t, "permitType_", com.google.k.a.a.b.dv.class, "minPurchaseForValidation_", com.google.i.s.class, "isDiscount_", "timeBasedRate_", mf.class, "serviceType_", h.u});
            case 3:
                return new gj();
            case 4:
                return new gh(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
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
            default:
                throw null;
        }
    }

    public gi getAllowanceType() {
        gi giVarA = gi.a(this.allowanceType_);
        return giVarA == null ? gi.STANDARD : giVarA;
    }

    public boolean getIsDiscount() {
        return this.isDiscount_;
    }

    public com.google.i.s getMinPurchaseForValidation(int i2) {
        return this.minPurchaseForValidation_.get(i2);
    }

    public int getMinPurchaseForValidationCount() {
        return this.minPurchaseForValidation_.size();
    }

    public List<com.google.i.s> getMinPurchaseForValidationList() {
        return this.minPurchaseForValidation_;
    }

    public com.google.i.t getMinPurchaseForValidationOrBuilder(int i2) {
        return this.minPurchaseForValidation_.get(i2);
    }

    public List<? extends com.google.i.t> getMinPurchaseForValidationOrBuilderList() {
        return this.minPurchaseForValidation_;
    }

    public com.google.k.a.a.b.dv getPermitType(int i2) {
        return this.permitType_.get(i2);
    }

    public int getPermitTypeCount() {
        return this.permitType_.size();
    }

    public List<com.google.k.a.a.b.dv> getPermitTypeList() {
        return this.permitType_;
    }

    public com.google.k.a.a.b.dw getPermitTypeOrBuilder(int i2) {
        return this.permitType_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.dw> getPermitTypeOrBuilderList() {
        return this.permitType_;
    }

    public gv getServiceType(int i2) {
        gv gvVarA = gv.a(this.serviceType_.d(i2));
        return gvVarA == null ? gv.SERVICE_ALL : gvVarA;
    }

    public int getServiceTypeCount() {
        return this.serviceType_.size();
    }

    public List<gv> getServiceTypeList() {
        return new com.google.v.em(this.serviceType_, serviceType_converter_);
    }

    public mf getTimeBasedRate(int i2) {
        return this.timeBasedRate_.get(i2);
    }

    public int getTimeBasedRateCount() {
        return this.timeBasedRate_.size();
    }

    public List<mf> getTimeBasedRateList() {
        return this.timeBasedRate_;
    }

    public mg getTimeBasedRateOrBuilder(int i2) {
        return this.timeBasedRate_.get(i2);
    }

    public List<? extends mg> getTimeBasedRateOrBuilderList() {
        return this.timeBasedRate_;
    }

    public gu getVehicleType() {
        gu guVarA = gu.a(this.vehicleType_);
        return guVarA == null ? gu.ANY : guVarA;
    }

    public boolean hasAllowanceType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsDiscount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVehicleType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gh newBuilder(gj gjVar) {
        return (gh) DEFAULT_INSTANCE.createBuilder(gjVar);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void addMinPurchaseForValidation(com.google.i.s sVar) {
        Objects.requireNonNull(sVar);
        ensureMinPurchaseForValidationIsMutable();
        this.minPurchaseForValidation_.add(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermitType(com.google.k.a.a.b.dv dvVar) {
        Objects.requireNonNull(dvVar);
        ensurePermitTypeIsMutable();
        this.permitType_.add(dvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimeBasedRate(mf mfVar) {
        Objects.requireNonNull(mfVar);
        ensureTimeBasedRateIsMutable();
        this.timeBasedRate_.add(mfVar);
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
