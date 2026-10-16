package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh extends du<bh, bg> implements fj {
    public static final int BLUETOOTH_INFO_FIELD_NUMBER = 12;
    public static final int CPU_MANUFACTURER_FIELD_NUMBER = 10;
    public static final int CPU_NAME_FIELD_NUMBER = 11;
    private static final bh DEFAULT_INSTANCE;
    public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 2;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
    public static final int LOGICAL_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    public static final int OS_ARCHITECTURE_FIELD_NUMBER = 9;
    public static final int OS_NAME_FIELD_NUMBER = 7;
    public static final int OS_VERSION_FIELD_NUMBER = 8;
    private static volatile fo<bh> PARSER = null;
    public static final int PHYSICAL_MEMORY_FIELD_NUMBER = 4;
    public static final int PROCESSOR_COUNT_FIELD_NUMBER = 5;
    private int bitField0_;
    private bj bluetoothInfo_;
    private int deviceType_;
    private int logicalProcessorCount_;
    private long physicalMemory_;
    private int processorCount_;
    private String deviceManufacturer_ = "";
    private String deviceModel_ = "";
    private String osName_ = "";
    private String osVersion_ = "";
    private String osArchitecture_ = "";
    private String cpuManufacturer_ = "";
    private String cpuName_ = "";

    static {
        bh bhVar = new bh();
        DEFAULT_INSTANCE = bhVar;
        du.registerDefaultInstance(bh.class, bhVar);
    }

    private bh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothInfo() {
        this.bluetoothInfo_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuManufacturer() {
        this.bitField0_ &= -513;
        this.cpuManufacturer_ = getDefaultInstance().getCpuManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuName() {
        this.bitField0_ &= -1025;
        this.cpuName_ = getDefaultInstance().getCpuName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceManufacturer() {
        this.bitField0_ &= -3;
        this.deviceManufacturer_ = getDefaultInstance().getDeviceManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.bitField0_ &= -5;
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.bitField0_ &= -2;
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicalProcessorCount() {
        this.bitField0_ &= -33;
        this.logicalProcessorCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsArchitecture() {
        this.bitField0_ &= -257;
        this.osArchitecture_ = getDefaultInstance().getOsArchitecture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsName() {
        this.bitField0_ &= -65;
        this.osName_ = getDefaultInstance().getOsName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.bitField0_ &= -129;
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhysicalMemory() {
        this.bitField0_ &= -9;
        this.physicalMemory_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessorCount() {
        this.bitField0_ &= -17;
        this.processorCount_ = 0;
    }

    public static bh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothInfo(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.bluetoothInfo_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            bi biVarNewBuilder = bj.newBuilder(bjVar2);
            biVarNewBuilder.mergeFrom((bi) bjVar);
            bjVar = biVarNewBuilder.buildPartial();
        }
        this.bluetoothInfo_ = bjVar;
        this.bitField0_ |= 2048;
    }

    public static bg newBuilder() {
        return (bg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bh parseDelimitedFrom(InputStream inputStream) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(com.google.v.v vVar) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothInfo(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.bluetoothInfo_ = bjVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.cpuManufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuManufacturerBytes(com.google.v.v vVar) {
        this.cpuManufacturer_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.cpuName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuNameBytes(com.google.v.v vVar) {
        this.cpuName_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.deviceManufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceManufacturerBytes(com.google.v.v vVar) {
        this.deviceManufacturer_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(com.google.v.v vVar) {
        this.deviceModel_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(bf bfVar) {
        this.deviceType_ = bfVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalProcessorCount(int i2) {
        this.bitField0_ |= 32;
        this.logicalProcessorCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsArchitecture(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.osArchitecture_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsArchitectureBytes(com.google.v.v vVar) {
        this.osArchitecture_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.osName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsNameBytes(com.google.v.v vVar) {
        this.osName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(com.google.v.v vVar) {
        this.osVersion_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhysicalMemory(long j2) {
        this.bitField0_ |= 8;
        this.physicalMemory_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessorCount(int i2) {
        this.bitField0_ |= 16;
        this.processorCount_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဉ\u000b", new Object[]{"bitField0_", "deviceType_", i.n, "deviceManufacturer_", "deviceModel_", "physicalMemory_", "processorCount_", "logicalProcessorCount_", "osName_", "osVersion_", "osArchitecture_", "cpuManufacturer_", "cpuName_", "bluetoothInfo_"});
        }
        if (iOrdinal == 3) {
            return new bh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bj getBluetoothInfo() {
        bj bjVar = this.bluetoothInfo_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public String getCpuManufacturer() {
        return this.cpuManufacturer_;
    }

    public com.google.v.v getCpuManufacturerBytes() {
        return com.google.v.v.s(this.cpuManufacturer_);
    }

    public String getCpuName() {
        return this.cpuName_;
    }

    public com.google.v.v getCpuNameBytes() {
        return com.google.v.v.s(this.cpuName_);
    }

    public String getDeviceManufacturer() {
        return this.deviceManufacturer_;
    }

    public com.google.v.v getDeviceManufacturerBytes() {
        return com.google.v.v.s(this.deviceManufacturer_);
    }

    public String getDeviceModel() {
        return this.deviceModel_;
    }

    public com.google.v.v getDeviceModelBytes() {
        return com.google.v.v.s(this.deviceModel_);
    }

    public bf getDeviceType() {
        bf bfVarA = bf.a(this.deviceType_);
        return bfVarA == null ? bf.UNKNOWN_DEVICE_TYPE : bfVarA;
    }

    public int getLogicalProcessorCount() {
        return this.logicalProcessorCount_;
    }

    public String getOsArchitecture() {
        return this.osArchitecture_;
    }

    public com.google.v.v getOsArchitectureBytes() {
        return com.google.v.v.s(this.osArchitecture_);
    }

    public String getOsName() {
        return this.osName_;
    }

    public com.google.v.v getOsNameBytes() {
        return com.google.v.v.s(this.osName_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public com.google.v.v getOsVersionBytes() {
        return com.google.v.v.s(this.osVersion_);
    }

    public long getPhysicalMemory() {
        return this.physicalMemory_;
    }

    public int getProcessorCount() {
        return this.processorCount_;
    }

    public boolean hasBluetoothInfo() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasCpuManufacturer() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCpuName() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDeviceManufacturer() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeviceModel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDeviceType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLogicalProcessorCount() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOsArchitecture() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasOsName() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasPhysicalMemory() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasProcessorCount() {
        return (this.bitField0_ & 16) != 0;
    }

    public static bg newBuilder(bh bhVar) {
        return (bg) DEFAULT_INSTANCE.createBuilder(bhVar);
    }

    public static bh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bh parseFrom(com.google.v.z zVar) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bh parseFrom(InputStream inputStream) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(ByteBuffer byteBuffer) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bh parseFrom(byte[] bArr) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bh) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
