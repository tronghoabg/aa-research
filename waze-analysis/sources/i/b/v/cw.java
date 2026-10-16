package i.b.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class cw extends com.google.v.du<cw, cl> implements com.google.v.fj {
    public static final int CANEXITWHILECLOSED_FIELD_NUMBER = 950;
    public static final int COSTTYPE_FIELD_NUMBER = 953;
    public static final int CURRENTAVAILABILITY_FIELD_NUMBER = 961;
    private static final cw DEFAULT_INSTANCE;
    public static final int ESTIMATEDNUMBEROFSPOTS_FIELD_NUMBER = 956;
    public static final int GENERALAVAILABILITY_FIELD_NUMBER = 960;
    public static final int HASTBR_FIELD_NUMBER = 957;
    public static final int LOTTYPELIST_FIELD_NUMBER = 955;
    public static final int NUMBEROFSPOTS_FIELD_NUMBER = 952;
    public static final int PARKINGTYPE_FIELD_NUMBER = 951;
    private static volatile com.google.v.fo<cw> PARSER = null;
    public static final int PAYMENTTYPELIST_FIELD_NUMBER = 954;
    public static final int PRICESDATA_FIELD_NUMBER = 959;
    public static final int PUBLICPARKINGSUBTYPE_FIELD_NUMBER = 958;
    private int bitField0_;
    private boolean canExitWhileClosed_;
    private int costType_;
    private int estimatedNumberOfSpots_;
    private boolean hasTBR_;
    private cq lotTypeList_;
    private int numberOfSpots_;
    private int parkingType_;
    private cu paymentTypeList_;
    private int publicParkingSubtype_;
    private String pricesData_ = "";
    private com.google.v.eo<b> generalAvailability_ = emptyProtobufList();
    private com.google.v.eo<b> currentAvailability_ = emptyProtobufList();

    static {
        cw cwVar = new cw();
        DEFAULT_INSTANCE = cwVar;
        com.google.v.du.registerDefaultInstance(cw.class, cwVar);
    }

    private cw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCurrentAvailability(Iterable<? extends b> iterable) {
        ensureCurrentAvailabilityIsMutable();
        com.google.v.c.addAll(iterable, this.currentAvailability_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGeneralAvailability(Iterable<? extends b> iterable) {
        ensureGeneralAvailabilityIsMutable();
        com.google.v.c.addAll(iterable, this.generalAvailability_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentAvailability(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureCurrentAvailabilityIsMutable();
        this.currentAvailability_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeneralAvailability(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureGeneralAvailabilityIsMutable();
        this.generalAvailability_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanExitWhileClosed() {
        this.bitField0_ &= -2;
        this.canExitWhileClosed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCostType() {
        this.bitField0_ &= -17;
        this.costType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentAvailability() {
        this.currentAvailability_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEstimatedNumberOfSpots() {
        this.bitField0_ &= -9;
        this.estimatedNumberOfSpots_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeneralAvailability() {
        this.generalAvailability_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasTBR() {
        this.bitField0_ &= -129;
        this.hasTBR_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLotTypeList() {
        this.lotTypeList_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberOfSpots() {
        this.bitField0_ &= -5;
        this.numberOfSpots_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingType() {
        this.bitField0_ &= -3;
        this.parkingType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaymentTypeList() {
        this.paymentTypeList_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPricesData() {
        this.bitField0_ &= -513;
        this.pricesData_ = getDefaultInstance().getPricesData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicParkingSubtype() {
        this.bitField0_ &= -257;
        this.publicParkingSubtype_ = 0;
    }

    private void ensureCurrentAvailabilityIsMutable() {
        com.google.v.eo<b> eoVar = this.currentAvailability_;
        if (eoVar.c()) {
            return;
        }
        this.currentAvailability_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureGeneralAvailabilityIsMutable() {
        com.google.v.eo<b> eoVar = this.generalAvailability_;
        if (eoVar.c()) {
            return;
        }
        this.generalAvailability_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLotTypeList(cq cqVar) {
        Objects.requireNonNull(cqVar);
        cq cqVar2 = this.lotTypeList_;
        if (cqVar2 != null && cqVar2 != cq.getDefaultInstance()) {
            cp cpVarNewBuilder = cq.newBuilder(cqVar2);
            cpVarNewBuilder.mergeFrom((cp) cqVar);
            cqVar = cpVarNewBuilder.buildPartial();
        }
        this.lotTypeList_ = cqVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePaymentTypeList(cu cuVar) {
        Objects.requireNonNull(cuVar);
        cu cuVar2 = this.paymentTypeList_;
        if (cuVar2 != null && cuVar2 != cu.getDefaultInstance()) {
            ct ctVarNewBuilder = cu.newBuilder(cuVar2);
            ctVarNewBuilder.mergeFrom((ct) cuVar);
            cuVar = ctVarNewBuilder.buildPartial();
        }
        this.paymentTypeList_ = cuVar;
        this.bitField0_ |= 32;
    }

    public static cl newBuilder() {
        return (cl) DEFAULT_INSTANCE.createBuilder();
    }

    public static cw parseDelimitedFrom(InputStream inputStream) {
        return (cw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cw parseFrom(com.google.v.v vVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCurrentAvailability(int i2) {
        ensureCurrentAvailabilityIsMutable();
        this.currentAvailability_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGeneralAvailability(int i2) {
        ensureGeneralAvailabilityIsMutable();
        this.generalAvailability_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanExitWhileClosed(boolean z) {
        this.bitField0_ |= 1;
        this.canExitWhileClosed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCostType(cm cmVar) {
        this.costType_ = cmVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAvailability(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureCurrentAvailabilityIsMutable();
        this.currentAvailability_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEstimatedNumberOfSpots(cn cnVar) {
        this.estimatedNumberOfSpots_ = cnVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeneralAvailability(int i2, b bVar) {
        Objects.requireNonNull(bVar);
        ensureGeneralAvailabilityIsMutable();
        this.generalAvailability_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasTBR(boolean z) {
        this.bitField0_ |= 128;
        this.hasTBR_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLotTypeList(cq cqVar) {
        Objects.requireNonNull(cqVar);
        this.lotTypeList_ = cqVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberOfSpots(int i2) {
        this.bitField0_ |= 4;
        this.numberOfSpots_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingType(cr crVar) {
        this.parkingType_ = crVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaymentTypeList(cu cuVar) {
        Objects.requireNonNull(cuVar);
        this.paymentTypeList_ = cuVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPricesData(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.pricesData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPricesDataBytes(com.google.v.v vVar) {
        this.pricesData_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicParkingSubtype(cv cvVar) {
        this.publicParkingSubtype_ = cvVar.getNumber();
        this.bitField0_ |= 256;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001ζρ\f\u0000\u0002\u0000ζဇ\u0000η᠌\u0001θင\u0002ι᠌\u0004κဉ\u0005λဉ\u0006μ᠌\u0003νဇ\u0007ξ᠌\bοဈ\tπ\u001bρ\u001b", new Object[]{"bitField0_", "canExitWhileClosed_", "parkingType_", z.o, "numberOfSpots_", "costType_", z.f49565l, "paymentTypeList_", "lotTypeList_", "estimatedNumberOfSpots_", z.m, "hasTBR_", "publicParkingSubtype_", z.q, "pricesData_", "generalAvailability_", b.class, "currentAvailability_", b.class});
        }
        if (iOrdinal == 3) {
            return new cw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getCanExitWhileClosed() {
        return this.canExitWhileClosed_;
    }

    public cm getCostType() {
        cm cmVarA = cm.a(this.costType_);
        return cmVarA == null ? cm.FREE : cmVarA;
    }

    public b getCurrentAvailability(int i2) {
        return this.currentAvailability_.get(i2);
    }

    public int getCurrentAvailabilityCount() {
        return this.currentAvailability_.size();
    }

    public List<b> getCurrentAvailabilityList() {
        return this.currentAvailability_;
    }

    public c getCurrentAvailabilityOrBuilder(int i2) {
        return this.currentAvailability_.get(i2);
    }

    public List<? extends c> getCurrentAvailabilityOrBuilderList() {
        return this.currentAvailability_;
    }

    public cn getEstimatedNumberOfSpots() {
        cn cnVarA = cn.a(this.estimatedNumberOfSpots_);
        return cnVarA == null ? cn.R_1_TO_10 : cnVarA;
    }

    public b getGeneralAvailability(int i2) {
        return this.generalAvailability_.get(i2);
    }

    public int getGeneralAvailabilityCount() {
        return this.generalAvailability_.size();
    }

    public List<b> getGeneralAvailabilityList() {
        return this.generalAvailability_;
    }

    public c getGeneralAvailabilityOrBuilder(int i2) {
        return this.generalAvailability_.get(i2);
    }

    public List<? extends c> getGeneralAvailabilityOrBuilderList() {
        return this.generalAvailability_;
    }

    public boolean getHasTBR() {
        return this.hasTBR_;
    }

    public cq getLotTypeList() {
        cq cqVar = this.lotTypeList_;
        return cqVar == null ? cq.getDefaultInstance() : cqVar;
    }

    public int getNumberOfSpots() {
        return this.numberOfSpots_;
    }

    public cr getParkingType() {
        cr crVarA = cr.a(this.parkingType_);
        return crVarA == null ? cr.PUBLIC : crVarA;
    }

    public cu getPaymentTypeList() {
        cu cuVar = this.paymentTypeList_;
        return cuVar == null ? cu.getDefaultInstance() : cuVar;
    }

    public String getPricesData() {
        return this.pricesData_;
    }

    public com.google.v.v getPricesDataBytes() {
        return com.google.v.v.s(this.pricesData_);
    }

    public cv getPublicParkingSubtype() {
        cv cvVarA = cv.a(this.publicParkingSubtype_);
        return cvVarA == null ? cv.PUBLIC_AIRPORT_ONLY : cvVarA;
    }

    public boolean hasCanExitWhileClosed() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCostType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEstimatedNumberOfSpots() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasHasTBR() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasLotTypeList() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasNumberOfSpots() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasParkingType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPaymentTypeList() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPricesData() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasPublicParkingSubtype() {
        return (this.bitField0_ & 256) != 0;
    }

    public static cl newBuilder(cw cwVar) {
        return (cl) DEFAULT_INSTANCE.createBuilder(cwVar);
    }

    public static cw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cw parseFrom(com.google.v.z zVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentAvailability(b bVar) {
        Objects.requireNonNull(bVar);
        ensureCurrentAvailabilityIsMutable();
        this.currentAvailability_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeneralAvailability(b bVar) {
        Objects.requireNonNull(bVar);
        ensureGeneralAvailabilityIsMutable();
        this.generalAvailability_.add(bVar);
    }

    public static cw parseFrom(InputStream inputStream) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cw parseFrom(ByteBuffer byteBuffer) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cw parseFrom(byte[] bArr) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
