package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cz extends du<cz, cy> implements da {
    private static final cz DEFAULT_INSTANCE;
    public static final int DEVICE_NAME_FIELD_NUMBER = 2;
    public static final int DRIVER_DATE_FIELD_NUMBER = 5;
    public static final int DRIVER_PROVIDER_NAME_FIELD_NUMBER = 3;
    public static final int DRIVER_VERSION_FIELD_NUMBER = 4;
    public static final int MANUFACTURER_FIELD_NUMBER = 1;
    private static volatile fo<cz> PARSER;
    private int bitField0_;
    private String manufacturer_ = "";
    private String deviceName_ = "";
    private String driverProviderName_ = "";
    private String driverVersion_ = "";
    private String driverDate_ = "";

    static {
        cz czVar = new cz();
        DEFAULT_INSTANCE = czVar;
        du.registerDefaultInstance(cz.class, czVar);
    }

    private cz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceName() {
        this.bitField0_ &= -3;
        this.deviceName_ = getDefaultInstance().getDeviceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriverDate() {
        this.bitField0_ &= -17;
        this.driverDate_ = getDefaultInstance().getDriverDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriverProviderName() {
        this.bitField0_ &= -5;
        this.driverProviderName_ = getDefaultInstance().getDriverProviderName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriverVersion() {
        this.bitField0_ &= -9;
        this.driverVersion_ = getDefaultInstance().getDriverVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManufacturer() {
        this.bitField0_ &= -2;
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    public static cz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cy newBuilder() {
        return (cy) DEFAULT_INSTANCE.createBuilder();
    }

    public static cz parseDelimitedFrom(InputStream inputStream) {
        return (cz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cz parseFrom(com.google.v.v vVar) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.deviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceNameBytes(com.google.v.v vVar) {
        this.deviceName_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriverDate(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.driverDate_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriverDateBytes(com.google.v.v vVar) {
        this.driverDate_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriverProviderName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.driverProviderName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriverProviderNameBytes(com.google.v.v vVar) {
        this.driverProviderName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriverVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.driverVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriverVersionBytes(com.google.v.v vVar) {
        this.driverVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturerBytes(com.google.v.v vVar) {
        this.manufacturer_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "manufacturer_", "deviceName_", "driverProviderName_", "driverVersion_", "driverDate_"});
        }
        if (iOrdinal == 3) {
            return new cz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDeviceName() {
        return this.deviceName_;
    }

    public com.google.v.v getDeviceNameBytes() {
        return com.google.v.v.s(this.deviceName_);
    }

    public String getDriverDate() {
        return this.driverDate_;
    }

    public com.google.v.v getDriverDateBytes() {
        return com.google.v.v.s(this.driverDate_);
    }

    public String getDriverProviderName() {
        return this.driverProviderName_;
    }

    public com.google.v.v getDriverProviderNameBytes() {
        return com.google.v.v.s(this.driverProviderName_);
    }

    public String getDriverVersion() {
        return this.driverVersion_;
    }

    public com.google.v.v getDriverVersionBytes() {
        return com.google.v.v.s(this.driverVersion_);
    }

    public String getManufacturer() {
        return this.manufacturer_;
    }

    public com.google.v.v getManufacturerBytes() {
        return com.google.v.v.s(this.manufacturer_);
    }

    public boolean hasDeviceName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDriverDate() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasDriverProviderName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDriverVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasManufacturer() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cy newBuilder(cz czVar) {
        return (cy) DEFAULT_INSTANCE.createBuilder(czVar);
    }

    public static cz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cz parseFrom(com.google.v.z zVar) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cz parseFrom(InputStream inputStream) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cz parseFrom(ByteBuffer byteBuffer) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cz parseFrom(byte[] bArr) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cz) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
