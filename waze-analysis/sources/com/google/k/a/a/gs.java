package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gs extends com.google.v.du<gs, gq> implements gt {
    private static final gs DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gs> PARSER = null;
    public static final int RESTRICTED_HOURS_FIELD_NUMBER = 1;
    public static final int RESTRICTION_TYPE_FIELD_NUMBER = 3;
    public static final int SERVICE_TYPE_FIELD_NUMBER = 2;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 4;
    private static final com.google.v.el<gv> serviceType_converter_ = new fn(3);
    private static final com.google.v.el<gu> vehicleType_converter_ = new fn(4);
    private int bitField0_;
    private com.google.k.a.a.b.kj restrictedHours_;
    private int restrictionType_;
    private com.google.v.ek serviceType_ = emptyIntList();
    private com.google.v.ek vehicleType_ = emptyIntList();

    static {
        gs gsVar = new gs();
        DEFAULT_INSTANCE = gsVar;
        com.google.v.du.registerDefaultInstance(gs.class, gsVar);
    }

    private gs() {
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
    public void addAllVehicleType(Iterable<? extends gu> iterable) {
        ensureVehicleTypeIsMutable();
        Iterator<? extends gu> it = iterable.iterator();
        while (it.hasNext()) {
            this.vehicleType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServiceType(gv gvVar) {
        Objects.requireNonNull(gvVar);
        ensureServiceTypeIsMutable();
        this.serviceType_.i(gvVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVehicleType(gu guVar) {
        Objects.requireNonNull(guVar);
        ensureVehicleTypeIsMutable();
        this.vehicleType_.i(guVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictedHours() {
        this.restrictedHours_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictionType() {
        this.bitField0_ &= -3;
        this.restrictionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceType() {
        this.serviceType_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.vehicleType_ = emptyIntList();
    }

    private void ensureServiceTypeIsMutable() {
        com.google.v.ek ekVar = this.serviceType_;
        if (ekVar.c()) {
            return;
        }
        this.serviceType_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureVehicleTypeIsMutable() {
        com.google.v.ek ekVar = this.vehicleType_;
        if (ekVar.c()) {
            return;
        }
        this.vehicleType_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static gs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestrictedHours(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        com.google.k.a.a.b.kj kjVar2 = this.restrictedHours_;
        if (kjVar2 != null && kjVar2 != com.google.k.a.a.b.kj.getDefaultInstance()) {
            com.google.k.a.a.b.ki kiVarNewBuilder = com.google.k.a.a.b.kj.newBuilder(kjVar2);
            kiVarNewBuilder.mergeFrom((com.google.k.a.a.b.ki) kjVar);
            kjVar = kiVarNewBuilder.buildPartial();
        }
        this.restrictedHours_ = kjVar;
        this.bitField0_ |= 1;
    }

    public static gq newBuilder() {
        return (gq) DEFAULT_INSTANCE.createBuilder();
    }

    public static gs parseDelimitedFrom(InputStream inputStream) {
        return (gs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gs parseFrom(com.google.v.v vVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictedHours(com.google.k.a.a.b.kj kjVar) {
        Objects.requireNonNull(kjVar);
        this.restrictedHours_ = kjVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionType(gr grVar) {
        this.restrictionType_ = grVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceType(int i2, gv gvVar) {
        Objects.requireNonNull(gvVar);
        ensureServiceTypeIsMutable();
        this.serviceType_.e(i2, gvVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(int i2, gu guVar) {
        Objects.requireNonNull(guVar);
        ensureVehicleTypeIsMutable();
        this.vehicleType_.e(i2, guVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ࠞ\u0003᠌\u0001\u0004ࠞ", new Object[]{"bitField0_", "restrictedHours_", "serviceType_", h.u, "restrictionType_", h.s, "vehicleType_", h.t});
        }
        if (iOrdinal == 3) {
            return new gs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.k.a.a.b.kj getRestrictedHours() {
        com.google.k.a.a.b.kj kjVar = this.restrictedHours_;
        return kjVar == null ? com.google.k.a.a.b.kj.getDefaultInstance() : kjVar;
    }

    public gr getRestrictionType() {
        gr grVarA = gr.a(this.restrictionType_);
        return grVarA == null ? gr.RESTRICTION_UNKNOWN : grVarA;
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

    public gu getVehicleType(int i2) {
        gu guVarA = gu.a(this.vehicleType_.d(i2));
        return guVarA == null ? gu.ANY : guVarA;
    }

    public int getVehicleTypeCount() {
        return this.vehicleType_.size();
    }

    public List<gu> getVehicleTypeList() {
        return new com.google.v.em(this.vehicleType_, vehicleType_converter_);
    }

    public boolean hasRestrictedHours() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRestrictionType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gq newBuilder(gs gsVar) {
        return (gq) DEFAULT_INSTANCE.createBuilder(gsVar);
    }

    public static gs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gs parseFrom(com.google.v.z zVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gs parseFrom(InputStream inputStream) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gs parseFrom(ByteBuffer byteBuffer) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gs parseFrom(byte[] bArr) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
