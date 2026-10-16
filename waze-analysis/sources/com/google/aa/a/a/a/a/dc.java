package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dc extends du<dc, cv> implements fj {
    public static final int BLE_EXTD_ADV_SUPPORTED_FIELD_NUMBER = 15;
    public static final int BLUETOOTH_DRIVER_INFOS_FIELD_NUMBER = 13;
    public static final int BLUETOOTH_INFO_FIELD_NUMBER = 16;
    public static final int CPU_MANUFACTURER_FIELD_NUMBER = 11;
    public static final int CPU_NAME_FIELD_NUMBER = 12;
    private static final dc DEFAULT_INSTANCE;
    public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 2;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
    public static final int LOGICAL_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    public static final int NETWORK_DRIVER_INFOS_FIELD_NUMBER = 14;
    public static final int OS_ARCHITECTURE_FIELD_NUMBER = 9;
    public static final int OS_LANGUAGE_CODE_FIELD_NUMBER = 10;
    public static final int OS_NAME_FIELD_NUMBER = 7;
    public static final int OS_VERSION_FIELD_NUMBER = 8;
    private static volatile fo<dc> PARSER = null;
    public static final int PHYSICAL_MEMORY_FIELD_NUMBER = 4;
    public static final int PROCESSOR_COUNT_FIELD_NUMBER = 5;
    public static final int USAGE_TYPE_FIELD_NUMBER = 17;
    private int bitField0_;
    private boolean bleExtdAdvSupported_;
    private cu bluetoothInfo_;
    private int deviceType_;
    private int logicalProcessorCount_;
    private long physicalMemory_;
    private int processorCount_;
    private int usageType_;
    private String deviceManufacturer_ = "";
    private String deviceModel_ = "";
    private String osName_ = "";
    private String osVersion_ = "";
    private String osArchitecture_ = "";
    private String osLanguageCode_ = "";
    private String cpuManufacturer_ = "";
    private String cpuName_ = "";
    private eo<cz> bluetoothDriverInfos_ = emptyProtobufList();
    private eo<cz> networkDriverInfos_ = emptyProtobufList();

    static {
        dc dcVar = new dc();
        DEFAULT_INSTANCE = dcVar;
        du.registerDefaultInstance(dc.class, dcVar);
    }

    private dc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBluetoothDriverInfos(Iterable<? extends cz> iterable) {
        ensureBluetoothDriverInfosIsMutable();
        com.google.v.c.addAll(iterable, this.bluetoothDriverInfos_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNetworkDriverInfos(Iterable<? extends cz> iterable) {
        ensureNetworkDriverInfosIsMutable();
        com.google.v.c.addAll(iterable, this.networkDriverInfos_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBluetoothDriverInfos(int i2, cz czVar) {
        Objects.requireNonNull(czVar);
        ensureBluetoothDriverInfosIsMutable();
        this.bluetoothDriverInfos_.add(i2, czVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNetworkDriverInfos(int i2, cz czVar) {
        Objects.requireNonNull(czVar);
        ensureNetworkDriverInfosIsMutable();
        this.networkDriverInfos_.add(i2, czVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBleExtdAdvSupported() {
        this.bitField0_ &= -4097;
        this.bleExtdAdvSupported_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothDriverInfos() {
        this.bluetoothDriverInfos_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBluetoothInfo() {
        this.bluetoothInfo_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuManufacturer() {
        this.bitField0_ &= -1025;
        this.cpuManufacturer_ = getDefaultInstance().getCpuManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuName() {
        this.bitField0_ &= -2049;
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
    public void clearNetworkDriverInfos() {
        this.networkDriverInfos_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsArchitecture() {
        this.bitField0_ &= -257;
        this.osArchitecture_ = getDefaultInstance().getOsArchitecture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsLanguageCode() {
        this.bitField0_ &= -513;
        this.osLanguageCode_ = getDefaultInstance().getOsLanguageCode();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsageType() {
        this.bitField0_ &= -16385;
        this.usageType_ = 0;
    }

    private void ensureBluetoothDriverInfosIsMutable() {
        eo<cz> eoVar = this.bluetoothDriverInfos_;
        if (eoVar.c()) {
            return;
        }
        this.bluetoothDriverInfos_ = du.mutableCopy(eoVar);
    }

    private void ensureNetworkDriverInfosIsMutable() {
        eo<cz> eoVar = this.networkDriverInfos_;
        if (eoVar.c()) {
            return;
        }
        this.networkDriverInfos_ = du.mutableCopy(eoVar);
    }

    public static dc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBluetoothInfo(cu cuVar) {
        Objects.requireNonNull(cuVar);
        cu cuVar2 = this.bluetoothInfo_;
        if (cuVar2 != null && cuVar2 != cu.getDefaultInstance()) {
            ct ctVarNewBuilder = cu.newBuilder(cuVar2);
            ctVarNewBuilder.mergeFrom((ct) cuVar);
            cuVar = ctVarNewBuilder.buildPartial();
        }
        this.bluetoothInfo_ = cuVar;
        this.bitField0_ |= 8192;
    }

    public static cv newBuilder() {
        return (cv) DEFAULT_INSTANCE.createBuilder();
    }

    public static dc parseDelimitedFrom(InputStream inputStream) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(com.google.v.v vVar) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBluetoothDriverInfos(int i2) {
        ensureBluetoothDriverInfosIsMutable();
        this.bluetoothDriverInfos_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNetworkDriverInfos(int i2) {
        ensureNetworkDriverInfosIsMutable();
        this.networkDriverInfos_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBleExtdAdvSupported(boolean z) {
        this.bitField0_ |= 4096;
        this.bleExtdAdvSupported_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothDriverInfos(int i2, cz czVar) {
        Objects.requireNonNull(czVar);
        ensureBluetoothDriverInfosIsMutable();
        this.bluetoothDriverInfos_.set(i2, czVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBluetoothInfo(cu cuVar) {
        Objects.requireNonNull(cuVar);
        this.bluetoothInfo_ = cuVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.cpuManufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuManufacturerBytes(com.google.v.v vVar) {
        this.cpuManufacturer_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.cpuName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuNameBytes(com.google.v.v vVar) {
        this.cpuName_ = vVar.u();
        this.bitField0_ |= 2048;
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
    public void setDeviceType(cx cxVar) {
        this.deviceType_ = cxVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalProcessorCount(int i2) {
        this.bitField0_ |= 32;
        this.logicalProcessorCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkDriverInfos(int i2, cz czVar) {
        Objects.requireNonNull(czVar);
        ensureNetworkDriverInfosIsMutable();
        this.networkDriverInfos_.set(i2, czVar);
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
    public void setOsLanguageCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.osLanguageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsLanguageCodeBytes(com.google.v.v vVar) {
        this.osLanguageCode_ = vVar.u();
        this.bitField0_ |= 512;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsageType(db dbVar) {
        this.usageType_ = dbVar.getNumber();
        this.bitField0_ |= 16384;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\r\u001b\u000e\u001b\u000fဇ\f\u0010ဉ\r\u0011᠌\u000e", new Object[]{"bitField0_", "deviceType_", cw.f3753a, "deviceManufacturer_", "deviceModel_", "physicalMemory_", "processorCount_", "logicalProcessorCount_", "osName_", "osVersion_", "osArchitecture_", "osLanguageCode_", "cpuManufacturer_", "cpuName_", "bluetoothDriverInfos_", cz.class, "networkDriverInfos_", cz.class, "bleExtdAdvSupported_", "bluetoothInfo_", "usageType_", cw.f3755c});
        }
        if (iOrdinal == 3) {
            return new dc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public boolean getBleExtdAdvSupported() {
        return this.bleExtdAdvSupported_;
    }

    public cz getBluetoothDriverInfos(int i2) {
        return this.bluetoothDriverInfos_.get(i2);
    }

    public int getBluetoothDriverInfosCount() {
        return this.bluetoothDriverInfos_.size();
    }

    public List<cz> getBluetoothDriverInfosList() {
        return this.bluetoothDriverInfos_;
    }

    public da getBluetoothDriverInfosOrBuilder(int i2) {
        return this.bluetoothDriverInfos_.get(i2);
    }

    public List<? extends da> getBluetoothDriverInfosOrBuilderList() {
        return this.bluetoothDriverInfos_;
    }

    public cu getBluetoothInfo() {
        cu cuVar = this.bluetoothInfo_;
        return cuVar == null ? cu.getDefaultInstance() : cuVar;
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

    public cx getDeviceType() {
        cx cxVarA = cx.a(this.deviceType_);
        return cxVarA == null ? cx.UNKNOWN_DEVICE_TYPE : cxVarA;
    }

    public int getLogicalProcessorCount() {
        return this.logicalProcessorCount_;
    }

    public cz getNetworkDriverInfos(int i2) {
        return this.networkDriverInfos_.get(i2);
    }

    public int getNetworkDriverInfosCount() {
        return this.networkDriverInfos_.size();
    }

    public List<cz> getNetworkDriverInfosList() {
        return this.networkDriverInfos_;
    }

    public da getNetworkDriverInfosOrBuilder(int i2) {
        return this.networkDriverInfos_.get(i2);
    }

    public List<? extends da> getNetworkDriverInfosOrBuilderList() {
        return this.networkDriverInfos_;
    }

    public String getOsArchitecture() {
        return this.osArchitecture_;
    }

    public com.google.v.v getOsArchitectureBytes() {
        return com.google.v.v.s(this.osArchitecture_);
    }

    public String getOsLanguageCode() {
        return this.osLanguageCode_;
    }

    public com.google.v.v getOsLanguageCodeBytes() {
        return com.google.v.v.s(this.osLanguageCode_);
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

    public db getUsageType() {
        db dbVarA = db.a(this.usageType_);
        return dbVarA == null ? db.UNKNOWN_USAGE_TYPE : dbVarA;
    }

    @Deprecated
    public boolean hasBleExtdAdvSupported() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasBluetoothInfo() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasCpuManufacturer() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasCpuName() {
        return (this.bitField0_ & 2048) != 0;
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

    public boolean hasOsLanguageCode() {
        return (this.bitField0_ & 512) != 0;
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

    public boolean hasUsageType() {
        return (this.bitField0_ & 16384) != 0;
    }

    public static cv newBuilder(dc dcVar) {
        return (cv) DEFAULT_INSTANCE.createBuilder(dcVar);
    }

    public static dc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dc parseFrom(com.google.v.z zVar) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBluetoothDriverInfos(cz czVar) {
        Objects.requireNonNull(czVar);
        ensureBluetoothDriverInfosIsMutable();
        this.bluetoothDriverInfos_.add(czVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNetworkDriverInfos(cz czVar) {
        Objects.requireNonNull(czVar);
        ensureNetworkDriverInfosIsMutable();
        this.networkDriverInfos_.add(czVar);
    }

    public static dc parseFrom(InputStream inputStream) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(ByteBuffer byteBuffer) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dc parseFrom(byte[] bArr) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dc) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
