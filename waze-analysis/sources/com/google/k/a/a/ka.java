package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ka extends com.google.v.du<ka, jz> implements kb {
    private static final ka DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ka> PARSER = null;
    public static final int TIME_SCHEDULE_FIELD_NUMBER = 1;
    public static final int VEHICLE_ATTRIBUTE_FIELD_NUMBER = 4;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 2;
    private static final com.google.v.el<og> vehicleType_converter_ = new fn(12);
    private int bitField0_;
    private com.google.k.a.a.b.kj timeSchedule_;
    private oc vehicleAttribute_;
    private com.google.v.ek vehicleType_ = emptyIntList();

    static {
        ka kaVar = new ka();
        DEFAULT_INSTANCE = kaVar;
        com.google.v.du.registerDefaultInstance(ka.class, kaVar);
    }

    private ka() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleType(Iterable<? extends og> iterable) {
        ensureVehicleTypeIsMutable();
        Iterator<? extends og> it = iterable.iterator();
        while (it.hasNext()) {
            this.vehicleType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleType(og ogVar) {
        Objects.requireNonNull(ogVar);
        ensureVehicleTypeIsMutable();
        this.vehicleType_.i(ogVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSchedule() {
        this.timeSchedule_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleAttribute() {
        this.vehicleAttribute_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.vehicleType_ = emptyIntList();
    }

    private void ensureVehicleTypeIsMutable() {
        com.google.v.ek ekVar = this.vehicleType_;
        if (ekVar.c()) {
            return;
        }
        this.vehicleType_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static ka getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeSchedule(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        com.google.k.a.a.b.kj kjVar2 = this.timeSchedule_;
        if (kjVar2 != null && kjVar2 != com.google.k.a.a.b.kj.getDefaultInstance()) {
            com.google.k.a.a.b.ki kiVarNewBuilder = com.google.k.a.a.b.kj.newBuilder(kjVar2);
            kiVarNewBuilder.mergeFrom((com.google.k.a.a.b.ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.timeSchedule_ = kjVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleAttribute(oc ocVar) {
        Objects.requireNonNull(ocVar);
        oc ocVar2 = this.vehicleAttribute_;
        if (ocVar2 != null && ocVar2 != oc.getDefaultInstance()) {
            oa oaVarNewBuilder = oc.newBuilder(ocVar2);
            oaVarNewBuilder.mergeFrom((oa) ocVar);
            ocVar = oaVarNewBuilder.buildPartial();
        }
        this.vehicleAttribute_ = ocVar;
        this.bitField0_ |= 2;
    }

    public static jz newBuilder() {
        return (jz) DEFAULT_INSTANCE.createBuilder();
    }

    public static ka parseDelimitedFrom(InputStream inputStream) {
        return (ka) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ka parseFrom(com.google.v.v vVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ka> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSchedule(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.timeSchedule_ = kjVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleAttribute(oc ocVar) {
        Objects.requireNonNull(ocVar);
        this.vehicleAttribute_ = ocVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(int i2, og ogVar) {
        Objects.requireNonNull(ogVar);
        ensureVehicleTypeIsMutable();
        this.vehicleType_.e(i2, ogVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ࠞ\u0004ဉ\u0001", new Object[]{"bitField0_", "timeSchedule_", "vehicleType_", lq.f12095h, "vehicleAttribute_"});
        }
        if (iOrdinal == 3) {
            return new ka();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ka> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ka.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.a.a.b.kj getTimeSchedule() {
        com.google.k.a.a.b.kj kjVar = this.timeSchedule_;
        return kjVar == null ? com.google.k.a.a.b.kj.getDefaultInstance() : kjVar;
    }

    public oc getVehicleAttribute() {
        oc ocVar = this.vehicleAttribute_;
        return ocVar == null ? oc.getDefaultInstance() : ocVar;
    }

    public og getVehicleType(int i2) {
        og ogVarA = og.a(this.vehicleType_.d(i2));
        return ogVarA == null ? og.UNKNOWN : ogVarA;
    }

    public int getVehicleTypeCount() {
        return this.vehicleType_.size();
    }

    public List<og> getVehicleTypeList() {
        return new com.google.v.em(this.vehicleType_, vehicleType_converter_);
    }

    public boolean hasTimeSchedule() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVehicleAttribute() {
        return (this.bitField0_ & 2) != 0;
    }

    public static jz newBuilder(ka kaVar) {
        return (jz) DEFAULT_INSTANCE.createBuilder(kaVar);
    }

    public static ka parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ka) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ka parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ka parseFrom(com.google.v.z zVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ka parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ka parseFrom(InputStream inputStream) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ka parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ka parseFrom(ByteBuffer byteBuffer) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ka parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ka parseFrom(byte[] bArr) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ka parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ka) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
