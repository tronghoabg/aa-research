package com.waze.bg.e.a;

import i.b.l.om;
import i.b.l.on;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ck extends com.google.v.du<ck, ch> implements com.google.v.fj {
    private static final ck DEFAULT_INSTANCE;
    public static final int EV_DATA_FIELD_NUMBER = 2;
    public static final int LICENSE_PLATE_SUFFIX_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ck> PARSER = null;
    public static final int PERMIT_IDS_FIELD_NUMBER = 4;
    public static final int VEHICLE_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private on evData_;
    private String licensePlateSuffix_ = "";
    private com.google.v.eo<String> permitIds_ = emptyProtobufList();
    private int vehicleType_;

    static {
        ck ckVar = new ck();
        DEFAULT_INSTANCE = ckVar;
        com.google.v.du.registerDefaultInstance(ck.class, ckVar);
    }

    private ck() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPermitIds(Iterable<String> iterable) {
        ensurePermitIdsIsMutable();
        com.google.v.c.addAll(iterable, this.permitIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermitIds(String str) {
        Objects.requireNonNull(str);
        ensurePermitIdsIsMutable();
        this.permitIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermitIdsBytes(com.google.v.v vVar) {
        ensurePermitIdsIsMutable();
        this.permitIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvData() {
        this.evData_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLicensePlateSuffix() {
        this.bitField0_ &= -5;
        this.licensePlateSuffix_ = getDefaultInstance().getLicensePlateSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermitIds() {
        this.permitIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.bitField0_ &= -2;
        this.vehicleType_ = 0;
    }

    private void ensurePermitIdsIsMutable() {
        com.google.v.eo<String> eoVar = this.permitIds_;
        if (eoVar.c()) {
            return;
        }
        this.permitIds_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ck getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static ch newBuilder() {
        return (ch) DEFAULT_INSTANCE.createBuilder();
    }

    public static ck parseDelimitedFrom(InputStream inputStream) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(com.google.v.v vVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ck> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvData(on onVar) {
        Objects.requireNonNull(onVar);
        this.evData_ = onVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateSuffix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.licensePlateSuffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateSuffixBytes(com.google.v.v vVar) {
        this.licensePlateSuffix_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermitIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePermitIdsIsMutable();
        this.permitIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(cj cjVar) {
        this.vehicleType_ = cjVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"bitField0_", "vehicleType_", ci.f16635a, "evData_", "licensePlateSuffix_", "permitIds_"});
        }
        if (iOrdinal == 3) {
            return new ck();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ch(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ck> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ck.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
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

    public String getPermitIds(int i2) {
        return this.permitIds_.get(i2);
    }

    public com.google.v.v getPermitIdsBytes(int i2) {
        return com.google.v.v.s(this.permitIds_.get(i2));
    }

    public int getPermitIdsCount() {
        return this.permitIds_.size();
    }

    public List<String> getPermitIdsList() {
        return this.permitIds_;
    }

    public cj getVehicleType() {
        cj cjVarA = cj.a(this.vehicleType_);
        return cjVarA == null ? cj.VEHICLE_TYPE_UNSPECIFIED : cjVarA;
    }

    public boolean hasEvData() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLicensePlateSuffix() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVehicleType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ch newBuilder(ck ckVar) {
        return (ch) DEFAULT_INSTANCE.createBuilder(ckVar);
    }

    public static ck parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ck) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ck parseFrom(com.google.v.z zVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ck parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ck parseFrom(InputStream inputStream) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ck parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ck parseFrom(ByteBuffer byteBuffer) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ck parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ck parseFrom(byte[] bArr) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ck parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ck) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
