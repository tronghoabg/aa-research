package com.waze.ap.b.a.a;

import com.google.v.ek;
import com.google.v.el;
import com.google.v.em;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends com.google.v.du<g, f> implements fj {
    private static final g DEFAULT_INSTANCE;
    private static volatile fo<g> PARSER = null;
    public static final int SPEED_CONDITION_FIELD_NUMBER = 3;
    public static final int TRAFFIC_CONDITION_FIELD_NUMBER = 2;
    public static final int VEHICLE_TYPES_FIELD_NUMBER = 1;
    private static final el<dn> vehicleTypes_converter_ = new e();
    private int bitField0_;
    private int speedCondition_;
    private int trafficCondition_;
    private int vehicleTypesMemoizedSerializedSize;
    private ek vehicleTypes_ = emptyIntList();

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.google.v.du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleTypes(Iterable<? extends dn> iterable) {
        ensureVehicleTypesIsMutable();
        Iterator<? extends dn> it = iterable.iterator();
        while (it.hasNext()) {
            this.vehicleTypes_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVehicleTypesValue(Iterable<Integer> iterable) {
        ensureVehicleTypesIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.vehicleTypes_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleTypes(dn dnVar) {
        Objects.requireNonNull(dnVar);
        ensureVehicleTypesIsMutable();
        this.vehicleTypes_.i(dnVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleTypesValue(int i2) {
        ensureVehicleTypesIsMutable();
        this.vehicleTypes_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedCondition() {
        this.bitField0_ &= -3;
        this.speedCondition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficCondition() {
        this.bitField0_ &= -2;
        this.trafficCondition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleTypes() {
        this.vehicleTypes_ = emptyIntList();
    }

    private void ensureVehicleTypesIsMutable() {
        ek ekVar = this.vehicleTypes_;
        if (ekVar.c()) {
            return;
        }
        this.vehicleTypes_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(com.google.v.v vVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedCondition(cz czVar) {
        this.speedCondition_ = czVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedConditionValue(int i2) {
        this.bitField0_ |= 2;
        this.speedCondition_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficCondition(dk dkVar) {
        this.trafficCondition_ = dkVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficConditionValue(int i2) {
        this.bitField0_ |= 1;
        this.trafficCondition_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleTypes(int i2, dn dnVar) {
        Objects.requireNonNull(dnVar);
        ensureVehicleTypesIsMutable();
        this.vehicleTypes_.e(i2, dnVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleTypesValue(int i2, int i3) {
        ensureVehicleTypesIsMutable();
        this.vehicleTypes_.e(i2, i3);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001,\u0002ဌ\u0000\u0003ဌ\u0001", new Object[]{"bitField0_", "vehicleTypes_", "trafficCondition_", "speedCondition_"});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cz getSpeedCondition() {
        int i2 = this.speedCondition_;
        cz czVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : cz.SPEED_CONDITION_LOW : cz.SPEED_CONDITION_HIGH : cz.SPEED_CONDITION_UNSPECIFIED;
        return czVar == null ? cz.UNRECOGNIZED : czVar;
    }

    public int getSpeedConditionValue() {
        return this.speedCondition_;
    }

    public dk getTrafficCondition() {
        int i2 = this.trafficCondition_;
        dk dkVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : dk.TRAFFIC_CONDITION_LOW : dk.TRAFFIC_CONDITION_HIGH : dk.TRAFFIC_CONDITION_UNSPECIFIED;
        return dkVar == null ? dk.UNRECOGNIZED : dkVar;
    }

    public int getTrafficConditionValue() {
        return this.trafficCondition_;
    }

    public dn getVehicleTypes(int i2) {
        dn dnVarA = dn.a(this.vehicleTypes_.d(i2));
        return dnVarA == null ? dn.UNRECOGNIZED : dnVarA;
    }

    public int getVehicleTypesCount() {
        return this.vehicleTypes_.size();
    }

    public List<dn> getVehicleTypesList() {
        return new em(this.vehicleTypes_, vehicleTypes_converter_);
    }

    public int getVehicleTypesValue(int i2) {
        return this.vehicleTypes_.d(i2);
    }

    public List<Integer> getVehicleTypesValueList() {
        return this.vehicleTypes_;
    }

    public boolean hasSpeedCondition() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrafficCondition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(com.google.v.z zVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
