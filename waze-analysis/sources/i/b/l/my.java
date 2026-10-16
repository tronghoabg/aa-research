package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class my extends com.google.v.du<my, mq> implements com.google.v.fj {
    private static final my DEFAULT_INSTANCE;
    public static final int EVDATA_FIELD_NUMBER = 6;
    public static final int LICENSE_PLATE_SUFFIX_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<my> PARSER = null;
    public static final int PERMITS_FIELD_NUMBER = 4;
    public static final int ROUTE_DURATION_REQUESTS_FIELD_NUMBER = 1;
    public static final int ROUTING_OPTIONS_FIELD_NUMBER = 5;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private on evData_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<mw> routeDurationRequests_ = emptyProtobufList();
    private String vehicleType_ = "";
    private String licensePlateSuffix_ = "";
    private com.google.v.eo<String> permits_ = emptyProtobufList();
    private com.google.v.eo<i.c.a.a.o> routingOptions_ = emptyProtobufList();

    static {
        my myVar = new my();
        DEFAULT_INSTANCE = myVar;
        com.google.v.du.registerDefaultInstance(my.class, myVar);
    }

    private my() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPermits(Iterable<String> iterable) {
        ensurePermitsIsMutable();
        com.google.v.c.addAll(iterable, this.permits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteDurationRequests(Iterable<? extends mw> iterable) {
        ensureRouteDurationRequestsIsMutable();
        com.google.v.c.addAll(iterable, this.routeDurationRequests_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoutingOptions(Iterable<? extends i.c.a.a.o> iterable) {
        ensureRoutingOptionsIsMutable();
        com.google.v.c.addAll(iterable, this.routingOptions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermits(String str) {
        Objects.requireNonNull(str);
        ensurePermitsIsMutable();
        this.permits_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermitsBytes(com.google.v.v vVar) {
        ensurePermitsIsMutable();
        this.permits_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteDurationRequests(int i2, mw mwVar) {
        Objects.requireNonNull(mwVar);
        ensureRouteDurationRequestsIsMutable();
        this.routeDurationRequests_.add(i2, mwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutingOptions(int i2, i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvData() {
        this.evData_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLicensePlateSuffix() {
        this.bitField0_ &= -3;
        this.licensePlateSuffix_ = getDefaultInstance().getLicensePlateSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermits() {
        this.permits_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDurationRequests() {
        this.routeDurationRequests_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingOptions() {
        this.routingOptions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.bitField0_ &= -2;
        this.vehicleType_ = getDefaultInstance().getVehicleType();
    }

    private void ensurePermitsIsMutable() {
        com.google.v.eo<String> eoVar = this.permits_;
        if (eoVar.c()) {
            return;
        }
        this.permits_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRouteDurationRequestsIsMutable() {
        com.google.v.eo<mw> eoVar = this.routeDurationRequests_;
        if (eoVar.c()) {
            return;
        }
        this.routeDurationRequests_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRoutingOptionsIsMutable() {
        com.google.v.eo<i.c.a.a.o> eoVar = this.routingOptions_;
        if (eoVar.c()) {
            return;
        }
        this.routingOptions_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static my getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvData(on onVar) {
        Objects.requireNonNull(onVar);
        on onVar2 = this.evData_;
        if (onVar2 != null && onVar2 != on.getDefaultInstance()) {
            om omVarNewBuilder = on.newBuilder(onVar2);
            omVarNewBuilder.mergeFrom((om) onVar);
            onVar = omVarNewBuilder.buildPartial();
        }
        this.evData_ = onVar;
        this.bitField0_ |= 4;
    }

    public static mq newBuilder() {
        return (mq) DEFAULT_INSTANCE.createBuilder();
    }

    public static my parseDelimitedFrom(InputStream inputStream) {
        return (my) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static my parseFrom(com.google.v.v vVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<my> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRouteDurationRequests(int i2) {
        ensureRouteDurationRequestsIsMutable();
        this.routeDurationRequests_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoutingOptions(int i2) {
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvData(on onVar) {
        Objects.requireNonNull(onVar);
        this.evData_ = onVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateSuffix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.licensePlateSuffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateSuffixBytes(com.google.v.v vVar) {
        this.licensePlateSuffix_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermits(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePermitsIsMutable();
        this.permits_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDurationRequests(int i2, mw mwVar) {
        Objects.requireNonNull(mwVar);
        ensureRouteDurationRequestsIsMutable();
        this.routeDurationRequests_.set(i2, mwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingOptions(int i2, i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.vehicleType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleTypeBytes(com.google.v.v vVar) {
        this.vehicleType_ = vVar.u();
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0001\u0001Л\u0002ဈ\u0000\u0003ဈ\u0001\u0004\u001a\u0005\u001b\u0006ဉ\u0002", new Object[]{"bitField0_", "routeDurationRequests_", mw.class, "vehicleType_", "licensePlateSuffix_", "permits_", "routingOptions_", i.c.a.a.o.class, "evData_"});
            case 3:
                return new my();
            case 4:
                return new mq(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<my> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (my.class) {
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

    public on getEvData() {
        on onVar = this.evData_;
        return onVar == null ? on.getDefaultInstance() : onVar;
    }

    public String getLicensePlateSuffix() {
        return this.licensePlateSuffix_;
    }

    public com.google.v.v getLicensePlateSuffixBytes() {
        return com.google.v.v.s(this.licensePlateSuffix_);
    }

    public String getPermits(int i2) {
        return this.permits_.get(i2);
    }

    public com.google.v.v getPermitsBytes(int i2) {
        return com.google.v.v.s(this.permits_.get(i2));
    }

    public int getPermitsCount() {
        return this.permits_.size();
    }

    public List<String> getPermitsList() {
        return this.permits_;
    }

    public mw getRouteDurationRequests(int i2) {
        return this.routeDurationRequests_.get(i2);
    }

    public int getRouteDurationRequestsCount() {
        return this.routeDurationRequests_.size();
    }

    public List<mw> getRouteDurationRequestsList() {
        return this.routeDurationRequests_;
    }

    public mx getRouteDurationRequestsOrBuilder(int i2) {
        return this.routeDurationRequests_.get(i2);
    }

    public List<? extends mx> getRouteDurationRequestsOrBuilderList() {
        return this.routeDurationRequests_;
    }

    public i.c.a.a.o getRoutingOptions(int i2) {
        return this.routingOptions_.get(i2);
    }

    public int getRoutingOptionsCount() {
        return this.routingOptions_.size();
    }

    public List<i.c.a.a.o> getRoutingOptionsList() {
        return this.routingOptions_;
    }

    public i.c.a.a.p getRoutingOptionsOrBuilder(int i2) {
        return this.routingOptions_.get(i2);
    }

    public List<? extends i.c.a.a.p> getRoutingOptionsOrBuilderList() {
        return this.routingOptions_;
    }

    public String getVehicleType() {
        return this.vehicleType_;
    }

    public com.google.v.v getVehicleTypeBytes() {
        return com.google.v.v.s(this.vehicleType_);
    }

    public boolean hasEvData() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLicensePlateSuffix() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVehicleType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static mq newBuilder(my myVar) {
        return (mq) DEFAULT_INSTANCE.createBuilder(myVar);
    }

    public static my parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (my) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static my parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static my parseFrom(com.google.v.z zVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static my parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteDurationRequests(mw mwVar) {
        Objects.requireNonNull(mwVar);
        ensureRouteDurationRequestsIsMutable();
        this.routeDurationRequests_.add(mwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutingOptions(i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.add(oVar);
    }

    public static my parseFrom(InputStream inputStream) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static my parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static my parseFrom(ByteBuffer byteBuffer) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static my parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static my parseFrom(byte[] bArr) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static my parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (my) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
