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
public final class ai extends du<ai, ah> implements fj {
    public static final int ACP_VERSION_FIELD_NUMBER = 16;
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final int BACKEND_TYPE_FIELD_NUMBER = 8;
    public static final int BUILD_TYPE_FIELD_NUMBER = 6;
    private static final ai DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 9;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 1;
    public static final int DEVICE_PRODUCT_NAME_FIELD_NUMBER = 20;
    public static final int FACTORY_COUNTRY_FIELD_NUMBER = 5;
    public static final int FUCHSIA_VERSION_FIELD_NUMBER = 22;
    public static final int LOCALE_FIELD_NUMBER = 11;
    public static final int MANUFACTURER_FIELD_NUMBER = 3;
    public static final int ONTOLOGICAL_SURFACE_TYPE_FIELD_NUMBER = 19;
    public static final int ON_DEVICE_ASSISTANT_ENABLED_FIELD_NUMBER = 12;
    public static final int OPAL_VERSION_FIELD_NUMBER = 18;
    public static final int OPTED_IN_METRICS_LOGGING_FIELD_NUMBER = 15;
    public static final int OS_TYPE_FIELD_NUMBER = 14;
    public static final int OS_TYPE_REPLICATED_FIELD_NUMBER = 21;
    private static volatile fo<ai> PARSER = null;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 4;
    public static final int SURFACE_TYPE_FIELD_NUMBER = 13;
    public static final int SYSTEM_BUILD_FIELD_NUMBER = 7;
    public static final int VIRTUAL_RELEASE_CHANNEL_FIELD_NUMBER = 17;
    private int backendType_;
    private int bitField0_;
    private boolean onDeviceAssistantEnabled_;
    private int ontologicalSurfaceType_;
    private boolean optedInMetricsLogging_;
    private int osTypeReplicated_;
    private int osType_;
    private int surfaceType_;
    private String deviceId_ = "";
    private String deviceModel_ = "";
    private String appVersion_ = "";
    private String acpVersion_ = "";
    private String opalVersion_ = "";
    private String fuchsiaVersion_ = "";
    private String virtualReleaseChannel_ = "";
    private String manufacturer_ = "";
    private String productName_ = "";
    private String factoryCountry_ = "";
    private String buildType_ = "";
    private String systemBuild_ = "";
    private String locale_ = "";
    private String deviceProductName_ = "";

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcpVersion() {
        this.bitField0_ &= -9;
        this.acpVersion_ = getDefaultInstance().getAcpVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.bitField0_ &= -5;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackendType() {
        this.bitField0_ &= -4097;
        this.backendType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildType() {
        this.bitField0_ &= -1025;
        this.buildType_ = getDefaultInstance().getBuildType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.bitField0_ &= -2;
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.bitField0_ &= -3;
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceProductName() {
        this.bitField0_ &= -524289;
        this.deviceProductName_ = getDefaultInstance().getDeviceProductName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFactoryCountry() {
        this.bitField0_ &= -513;
        this.factoryCountry_ = getDefaultInstance().getFactoryCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFuchsiaVersion() {
        this.bitField0_ &= -33;
        this.fuchsiaVersion_ = getDefaultInstance().getFuchsiaVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -8193;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearManufacturer() {
        this.bitField0_ &= -129;
        this.manufacturer_ = getDefaultInstance().getManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnDeviceAssistantEnabled() {
        this.bitField0_ &= -16385;
        this.onDeviceAssistantEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOntologicalSurfaceType() {
        this.bitField0_ &= -262145;
        this.ontologicalSurfaceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpalVersion() {
        this.bitField0_ &= -17;
        this.opalVersion_ = getDefaultInstance().getOpalVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptedInMetricsLogging() {
        this.bitField0_ &= -131073;
        this.optedInMetricsLogging_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsType() {
        this.bitField0_ &= -65537;
        this.osType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsTypeReplicated() {
        this.bitField0_ &= -1048577;
        this.osTypeReplicated_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductName() {
        this.bitField0_ &= -257;
        this.productName_ = getDefaultInstance().getProductName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfaceType() {
        this.bitField0_ &= -32769;
        this.surfaceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemBuild() {
        this.bitField0_ &= -2049;
        this.systemBuild_ = getDefaultInstance().getSystemBuild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVirtualReleaseChannel() {
        this.bitField0_ &= -65;
        this.virtualReleaseChannel_ = getDefaultInstance().getVirtualReleaseChannel();
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ah newBuilder() {
        return (ah) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcpVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.acpVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcpVersionBytes(com.google.v.v vVar) {
        this.acpVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionBytes(com.google.v.v vVar) {
        this.appVersion_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackendType(ag agVar) {
        this.backendType_ = agVar.getNumber();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.buildType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildTypeBytes(com.google.v.v vVar) {
        this.buildType_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(com.google.v.v vVar) {
        this.deviceId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(com.google.v.v vVar) {
        this.deviceModel_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceProductName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 524288;
        this.deviceProductName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceProductNameBytes(com.google.v.v vVar) {
        this.deviceProductName_ = vVar.u();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFactoryCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.factoryCountry_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFactoryCountryBytes(com.google.v.v vVar) {
        this.factoryCountry_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFuchsiaVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.fuchsiaVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFuchsiaVersionBytes(com.google.v.v vVar) {
        this.fuchsiaVersion_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturerBytes(com.google.v.v vVar) {
        this.manufacturer_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnDeviceAssistantEnabled(boolean z) {
        this.bitField0_ |= 16384;
        this.onDeviceAssistantEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOntologicalSurfaceType(com.google.c.a.c.f fVar) {
        this.ontologicalSurfaceType_ = fVar.getNumber();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpalVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.opalVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpalVersionBytes(com.google.v.v vVar) {
        this.opalVersion_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptedInMetricsLogging(boolean z) {
        this.bitField0_ |= 131072;
        this.optedInMetricsLogging_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsType(com.google.w.r.a.b bVar) {
        this.osType_ = bVar.getNumber();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsTypeReplicated(com.google.w.r.a.b bVar) {
        this.osTypeReplicated_ = bVar.getNumber();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.productName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductNameBytes(com.google.v.v vVar) {
        this.productName_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceType(com.google.c.a.c.a aVar) {
        this.surfaceType_ = aVar.getNumber();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemBuild(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.systemBuild_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemBuildBytes(com.google.v.v vVar) {
        this.systemBuild_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVirtualReleaseChannel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.virtualReleaseChannel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVirtualReleaseChannelBytes(com.google.v.v vVar) {
        this.virtualReleaseChannel_ = vVar.u();
        this.bitField0_ |= 64;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0007\u0004ဈ\b\u0005ဈ\t\u0006ဈ\n\u0007ဈ\u000b\b᠌\f\tဈ\u0000\u000bဈ\r\fဇ\u000e\r᠌\u000f\u000e᠌\u0010\u000fဇ\u0011\u0010ဈ\u0003\u0011ဈ\u0006\u0012ဈ\u0004\u0013᠌\u0012\u0014ဈ\u0013\u0015᠌\u0014\u0016ဈ\u0005", new Object[]{"bitField0_", "deviceModel_", "appVersion_", "manufacturer_", "productName_", "factoryCountry_", "buildType_", "systemBuild_", "backendType_", i.f3791i, "deviceId_", "locale_", "onDeviceAssistantEnabled_", "surfaceType_", com.google.c.a.c.a.b(), "osType_", com.google.w.r.a.b.a(), "optedInMetricsLogging_", "acpVersion_", "virtualReleaseChannel_", "opalVersion_", "ontologicalSurfaceType_", com.google.c.a.c.f.b(), "deviceProductName_", "osTypeReplicated_", com.google.w.r.a.b.a(), "fuchsiaVersion_"});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAcpVersion() {
        return this.acpVersion_;
    }

    public com.google.v.v getAcpVersionBytes() {
        return com.google.v.v.s(this.acpVersion_);
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public com.google.v.v getAppVersionBytes() {
        return com.google.v.v.s(this.appVersion_);
    }

    public ag getBackendType() {
        ag agVarA = ag.a(this.backendType_);
        return agVarA == null ? ag.BACKEND_TYPE_UNKNOWN : agVarA;
    }

    public String getBuildType() {
        return this.buildType_;
    }

    public com.google.v.v getBuildTypeBytes() {
        return com.google.v.v.s(this.buildType_);
    }

    public String getDeviceId() {
        return this.deviceId_;
    }

    public com.google.v.v getDeviceIdBytes() {
        return com.google.v.v.s(this.deviceId_);
    }

    public String getDeviceModel() {
        return this.deviceModel_;
    }

    public com.google.v.v getDeviceModelBytes() {
        return com.google.v.v.s(this.deviceModel_);
    }

    @Deprecated
    public String getDeviceProductName() {
        return this.deviceProductName_;
    }

    @Deprecated
    public com.google.v.v getDeviceProductNameBytes() {
        return com.google.v.v.s(this.deviceProductName_);
    }

    public String getFactoryCountry() {
        return this.factoryCountry_;
    }

    public com.google.v.v getFactoryCountryBytes() {
        return com.google.v.v.s(this.factoryCountry_);
    }

    public String getFuchsiaVersion() {
        return this.fuchsiaVersion_;
    }

    public com.google.v.v getFuchsiaVersionBytes() {
        return com.google.v.v.s(this.fuchsiaVersion_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public String getManufacturer() {
        return this.manufacturer_;
    }

    public com.google.v.v getManufacturerBytes() {
        return com.google.v.v.s(this.manufacturer_);
    }

    public boolean getOnDeviceAssistantEnabled() {
        return this.onDeviceAssistantEnabled_;
    }

    public com.google.c.a.c.f getOntologicalSurfaceType() {
        com.google.c.a.c.f fVarA = com.google.c.a.c.f.a(this.ontologicalSurfaceType_);
        return fVarA == null ? com.google.c.a.c.f.UNKNOWN_TYPE : fVarA;
    }

    public String getOpalVersion() {
        return this.opalVersion_;
    }

    public com.google.v.v getOpalVersionBytes() {
        return com.google.v.v.s(this.opalVersion_);
    }

    public boolean getOptedInMetricsLogging() {
        return this.optedInMetricsLogging_;
    }

    public com.google.w.r.a.b getOsType() {
        com.google.w.r.a.b bVarB = com.google.w.r.a.b.b(this.osType_);
        return bVarB == null ? com.google.w.r.a.b.OS_TYPE_UNKNOWN : bVarB;
    }

    public com.google.w.r.a.b getOsTypeReplicated() {
        com.google.w.r.a.b bVarB = com.google.w.r.a.b.b(this.osTypeReplicated_);
        return bVarB == null ? com.google.w.r.a.b.OS_TYPE_UNKNOWN : bVarB;
    }

    public String getProductName() {
        return this.productName_;
    }

    public com.google.v.v getProductNameBytes() {
        return com.google.v.v.s(this.productName_);
    }

    public com.google.c.a.c.a getSurfaceType() {
        com.google.c.a.c.a aVarA = com.google.c.a.c.a.a(this.surfaceType_);
        return aVarA == null ? com.google.c.a.c.a.UNKNOWN : aVarA;
    }

    public String getSystemBuild() {
        return this.systemBuild_;
    }

    public com.google.v.v getSystemBuildBytes() {
        return com.google.v.v.s(this.systemBuild_);
    }

    public String getVirtualReleaseChannel() {
        return this.virtualReleaseChannel_;
    }

    public com.google.v.v getVirtualReleaseChannelBytes() {
        return com.google.v.v.s(this.virtualReleaseChannel_);
    }

    public boolean hasAcpVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBackendType() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasBuildType() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDeviceId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeviceModel() {
        return (this.bitField0_ & 2) != 0;
    }

    @Deprecated
    public boolean hasDeviceProductName() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasFactoryCountry() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasFuchsiaVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasManufacturer() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasOnDeviceAssistantEnabled() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasOntologicalSurfaceType() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasOpalVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOptedInMetricsLogging() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasOsType() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasOsTypeReplicated() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasProductName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasSurfaceType() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasSystemBuild() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasVirtualReleaseChannel() {
        return (this.bitField0_ & 64) != 0;
    }

    public static ah newBuilder(ai aiVar) {
        return (ah) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
