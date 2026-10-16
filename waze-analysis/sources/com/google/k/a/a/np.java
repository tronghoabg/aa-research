package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class np extends com.google.v.du<np, nl> implements nq {
    private static final np DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 1;
    public static final int OPERATION_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<np> PARSER = null;
    public static final int TERMS_FIELD_NUMBER = 6;
    public static final int TIME_SCHEDULE_FIELD_NUMBER = 3;
    public static final int TRAVEL_MODE_FIELD_NUMBER = 7;
    public static final int VEHICLE_ATTRIBUTE_FILTER_FIELD_NUMBER = 4;
    public static final int VEHICLE_OCCUPANCY_RANGE_FIELD_NUMBER = 5;
    private int bitField0_;
    private Object criterion_;
    private int operation_;
    private int criterionCase_ = 0;
    private int direction_ = 1;
    private com.google.v.eo<np> terms_ = emptyProtobufList();

    static {
        np npVar = new np();
        DEFAULT_INSTANCE = npVar;
        com.google.v.du.registerDefaultInstance(np.class, npVar);
    }

    private np() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTerms(Iterable<? extends np> iterable) {
        ensureTermsIsMutable();
        com.google.v.c.addAll(iterable, this.terms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTerms(int i2, np npVar) {
        Objects.requireNonNull(npVar);
        ensureTermsIsMutable();
        this.terms_.add(i2, npVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCriterion() {
        this.criterionCase_ = 0;
        this.criterion_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirection() {
        this.bitField0_ &= -2;
        this.direction_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperation() {
        this.bitField0_ &= -3;
        this.operation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTerms() {
        this.terms_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSchedule() {
        if (this.criterionCase_ == 3) {
            this.criterionCase_ = 0;
            this.criterion_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelMode() {
        if (this.criterionCase_ == 7) {
            this.criterionCase_ = 0;
            this.criterion_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleAttributeFilter() {
        if (this.criterionCase_ == 4) {
            this.criterionCase_ = 0;
            this.criterion_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleOccupancyRange() {
        if (this.criterionCase_ == 5) {
            this.criterionCase_ = 0;
            this.criterion_ = null;
        }
    }

    private void ensureTermsIsMutable() {
        com.google.v.eo<np> eoVar = this.terms_;
        if (eoVar.c()) {
            return;
        }
        this.terms_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static np getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeSchedule(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        if (this.criterionCase_ == 3 && this.criterion_ != com.google.k.a.a.b.kj.getDefaultInstance()) {
            com.google.k.a.a.b.ki kiVarNewBuilder = com.google.k.a.a.b.kj.newBuilder((com.google.k.a.a.b.kj) this.criterion_);
            kiVarNewBuilder.mergeFrom((com.google.k.a.a.b.ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.criterion_ = kjVar;
        this.criterionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleAttributeFilter(oc ocVar) {
        Objects.requireNonNull(ocVar);
        if (this.criterionCase_ == 4 && this.criterion_ != oc.getDefaultInstance()) {
            oa oaVarNewBuilder = oc.newBuilder((oc) this.criterion_);
            oaVarNewBuilder.mergeFrom((oa) ocVar);
            ocVar = oaVarNewBuilder.buildPartial();
        }
        this.criterion_ = ocVar;
        this.criterionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleOccupancyRange(of ofVar) {
        Objects.requireNonNull(ofVar);
        if (this.criterionCase_ == 5 && this.criterion_ != of.getDefaultInstance()) {
            oe oeVarNewBuilder = of.newBuilder((of) this.criterion_);
            oeVarNewBuilder.mergeFrom((oe) ofVar);
            ofVar = oeVarNewBuilder.buildPartial();
        }
        this.criterion_ = ofVar;
        this.criterionCase_ = 5;
    }

    public static nl newBuilder() {
        return (nl) DEFAULT_INSTANCE.createBuilder();
    }

    public static np parseDelimitedFrom(InputStream inputStream) {
        return (np) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static np parseFrom(com.google.v.v vVar) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<np> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTerms(int i2) {
        ensureTermsIsMutable();
        this.terms_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirection(nn nnVar) {
        this.direction_ = nnVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionValue(int i2) {
        this.bitField0_ |= 1;
        this.direction_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperation(no noVar) {
        this.operation_ = noVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationValue(int i2) {
        this.bitField0_ |= 2;
        this.operation_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTerms(int i2, np npVar) {
        Objects.requireNonNull(npVar);
        ensureTermsIsMutable();
        this.terms_.set(i2, npVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSchedule(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.criterion_ = kjVar;
        this.criterionCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelMode(nk nkVar) {
        this.criterion_ = Integer.valueOf(nkVar.getNumber());
        this.criterionCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelModeValue(int i2) {
        this.criterionCase_ = 7;
        this.criterion_ = Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleAttributeFilter(oc ocVar) {
        Objects.requireNonNull(ocVar);
        this.criterion_ = ocVar;
        this.criterionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleOccupancyRange(of ofVar) {
        Objects.requireNonNull(ofVar);
        this.criterion_ = ofVar;
        this.criterionCase_ = 5;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u001b\u0007?\u0000", new Object[]{"criterion_", "criterionCase_", "bitField0_", "direction_", "operation_", com.google.k.a.a.b.kj.class, oc.class, of.class, "terms_", np.class});
        }
        if (iOrdinal == 3) {
            return new np();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<np> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (np.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public nm getCriterionCase() {
        int i2 = this.criterionCase_;
        if (i2 == 0) {
            return nm.f12138e;
        }
        if (i2 == 7) {
            return nm.f12137d;
        }
        if (i2 == 3) {
            return nm.f12134a;
        }
        if (i2 == 4) {
            return nm.f12135b;
        }
        if (i2 != 5) {
            return null;
        }
        return nm.f12136c;
    }

    public nn getDirection() {
        int i2 = this.direction_;
        nn nnVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : nn.NOT : nn.IS : nn.DIRECTION_UNKNOWN;
        return nnVar == null ? nn.UNRECOGNIZED : nnVar;
    }

    public int getDirectionValue() {
        return this.direction_;
    }

    public no getOperation() {
        int i2 = this.operation_;
        no noVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 10 ? null : no.TRUE : no.ANY_OF : no.ALL_OF : no.MATCH : no.OPERATION_UNKNOWN;
        return noVar == null ? no.UNRECOGNIZED : noVar;
    }

    public int getOperationValue() {
        return this.operation_;
    }

    public np getTerms(int i2) {
        return this.terms_.get(i2);
    }

    public int getTermsCount() {
        return this.terms_.size();
    }

    public List<np> getTermsList() {
        return this.terms_;
    }

    public nq getTermsOrBuilder(int i2) {
        return this.terms_.get(i2);
    }

    public List<? extends nq> getTermsOrBuilderList() {
        return this.terms_;
    }

    public com.google.k.a.a.b.kj getTimeSchedule() {
        return this.criterionCase_ == 3 ? (com.google.k.a.a.b.kj) this.criterion_ : com.google.k.a.a.b.kj.getDefaultInstance();
    }

    public nk getTravelMode() {
        if (this.criterionCase_ != 7) {
            return nk.TRAVEL_MODE_UNSPECIFIED;
        }
        nk nkVarA = nk.a(((Integer) this.criterion_).intValue());
        return nkVarA == null ? nk.UNRECOGNIZED : nkVarA;
    }

    public int getTravelModeValue() {
        if (this.criterionCase_ == 7) {
            return ((Integer) this.criterion_).intValue();
        }
        return 0;
    }

    public oc getVehicleAttributeFilter() {
        return this.criterionCase_ == 4 ? (oc) this.criterion_ : oc.getDefaultInstance();
    }

    public of getVehicleOccupancyRange() {
        return this.criterionCase_ == 5 ? (of) this.criterion_ : of.getDefaultInstance();
    }

    public boolean hasDirection() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOperation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimeSchedule() {
        return this.criterionCase_ == 3;
    }

    public boolean hasTravelMode() {
        return this.criterionCase_ == 7;
    }

    public boolean hasVehicleAttributeFilter() {
        return this.criterionCase_ == 4;
    }

    public boolean hasVehicleOccupancyRange() {
        return this.criterionCase_ == 5;
    }

    public static nl newBuilder(np npVar) {
        return (nl) DEFAULT_INSTANCE.createBuilder(npVar);
    }

    public static np parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (np) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static np parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static np parseFrom(com.google.v.z zVar) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static np parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTerms(np npVar) {
        Objects.requireNonNull(npVar);
        ensureTermsIsMutable();
        this.terms_.add(npVar);
    }

    public static np parseFrom(InputStream inputStream) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static np parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static np parseFrom(ByteBuffer byteBuffer) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static np parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static np parseFrom(byte[] bArr) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static np parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (np) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
