package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeApplicationInfo extends du<WazeApplicationInfo, Builder> implements WazeApplicationInfoOrBuilder {
    public static final int APP_TYPE_FIELD_NUMBER = 11;
    public static final int BUILD_SDK_VERSION_FIELD_NUMBER = 1;
    private static final WazeApplicationInfo DEFAULT_INSTANCE;
    public static final int DEVICE_BRAND_FIELD_NUMBER = 12;
    public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 4;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 3;
    public static final int DEVICE_NAME_FIELD_NUMBER = 2;
    public static final int EXTERNAL_PATH_FIELD_NUMBER = 8;
    public static final int IS_TEST_BUILD_FIELD_NUMBER = 13;
    public static final int OS_VERSION_FIELD_NUMBER = 6;
    private static volatile fo<WazeApplicationInfo> PARSER = null;
    public static final int ROM_INFO_FIELD_NUMBER = 5;
    public static final int USER_PATH_FIELD_NUMBER = 7;
    public static final int WEB_USER_AGENT_FIELD_NUMBER = 9;
    private int appType_;
    private int buildSdkVersion_;
    private boolean isTestBuild_;
    private String deviceName_ = "";
    private String deviceModel_ = "";
    private String deviceManufacturer_ = "";
    private String romInfo_ = "";
    private String osVersion_ = "";
    private String userPath_ = "";
    private String externalPath_ = "";
    private String webUserAgent_ = "";
    private String deviceBrand_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.WazeApplicationInfo$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: WazeSource */
    public enum AppType implements eg {
        WAZE_MOBILE(0),
        WAZE_AUTOMOTIVE(1),
        UNRECOGNIZED(-1);

        public static final int WAZE_AUTOMOTIVE_VALUE = 1;
        public static final int WAZE_MOBILE_VALUE = 0;
        private static final eh<AppType> internalValueMap = new eh<AppType>() { // from class: com.waze.jni.protos.WazeApplicationInfo.AppType.1
            @Override // com.google.v.eh
            public AppType findValueByNumber(int i2) {
                return AppType.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class AppTypeVerifier implements ei {
            static final ei INSTANCE = new AppTypeVerifier();

            private AppTypeVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return AppType.forNumber(i2) != null;
            }
        }

        AppType(int i2) {
            this.value = i2;
        }

        public static AppType forNumber(int i2) {
            if (i2 == 0) {
                return WAZE_MOBILE;
            }
            if (i2 != 1) {
                return null;
            }
            return WAZE_AUTOMOTIVE;
        }

        public static eh<AppType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return AppTypeVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<WazeApplicationInfo, Builder> implements WazeApplicationInfoOrBuilder {
        private Builder() {
            super(WazeApplicationInfo.DEFAULT_INSTANCE);
        }

        public Builder clearAppType() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearAppType();
            return this;
        }

        public Builder clearBuildSdkVersion() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearBuildSdkVersion();
            return this;
        }

        public Builder clearDeviceBrand() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearDeviceBrand();
            return this;
        }

        public Builder clearDeviceManufacturer() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearDeviceManufacturer();
            return this;
        }

        public Builder clearDeviceModel() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearDeviceModel();
            return this;
        }

        public Builder clearDeviceName() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearDeviceName();
            return this;
        }

        public Builder clearExternalPath() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearExternalPath();
            return this;
        }

        public Builder clearIsTestBuild() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearIsTestBuild();
            return this;
        }

        public Builder clearOsVersion() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearOsVersion();
            return this;
        }

        public Builder clearRomInfo() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearRomInfo();
            return this;
        }

        public Builder clearUserPath() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearUserPath();
            return this;
        }

        public Builder clearWebUserAgent() {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).clearWebUserAgent();
            return this;
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public AppType getAppType() {
            return ((WazeApplicationInfo) this.instance).getAppType();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public int getAppTypeValue() {
            return ((WazeApplicationInfo) this.instance).getAppTypeValue();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public int getBuildSdkVersion() {
            return ((WazeApplicationInfo) this.instance).getBuildSdkVersion();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getDeviceBrand() {
            return ((WazeApplicationInfo) this.instance).getDeviceBrand();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getDeviceBrandBytes() {
            return ((WazeApplicationInfo) this.instance).getDeviceBrandBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getDeviceManufacturer() {
            return ((WazeApplicationInfo) this.instance).getDeviceManufacturer();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getDeviceManufacturerBytes() {
            return ((WazeApplicationInfo) this.instance).getDeviceManufacturerBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getDeviceModel() {
            return ((WazeApplicationInfo) this.instance).getDeviceModel();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getDeviceModelBytes() {
            return ((WazeApplicationInfo) this.instance).getDeviceModelBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getDeviceName() {
            return ((WazeApplicationInfo) this.instance).getDeviceName();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getDeviceNameBytes() {
            return ((WazeApplicationInfo) this.instance).getDeviceNameBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getExternalPath() {
            return ((WazeApplicationInfo) this.instance).getExternalPath();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getExternalPathBytes() {
            return ((WazeApplicationInfo) this.instance).getExternalPathBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public boolean getIsTestBuild() {
            return ((WazeApplicationInfo) this.instance).getIsTestBuild();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getOsVersion() {
            return ((WazeApplicationInfo) this.instance).getOsVersion();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getOsVersionBytes() {
            return ((WazeApplicationInfo) this.instance).getOsVersionBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getRomInfo() {
            return ((WazeApplicationInfo) this.instance).getRomInfo();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getRomInfoBytes() {
            return ((WazeApplicationInfo) this.instance).getRomInfoBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getUserPath() {
            return ((WazeApplicationInfo) this.instance).getUserPath();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getUserPathBytes() {
            return ((WazeApplicationInfo) this.instance).getUserPathBytes();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public String getWebUserAgent() {
            return ((WazeApplicationInfo) this.instance).getWebUserAgent();
        }

        @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
        public v getWebUserAgentBytes() {
            return ((WazeApplicationInfo) this.instance).getWebUserAgentBytes();
        }

        public Builder setAppType(AppType appType) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setAppType(appType);
            return this;
        }

        public Builder setAppTypeValue(int i2) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setAppTypeValue(i2);
            return this;
        }

        public Builder setBuildSdkVersion(int i2) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setBuildSdkVersion(i2);
            return this;
        }

        public Builder setDeviceBrand(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceBrand(str);
            return this;
        }

        public Builder setDeviceBrandBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceBrandBytes(vVar);
            return this;
        }

        public Builder setDeviceManufacturer(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceManufacturer(str);
            return this;
        }

        public Builder setDeviceManufacturerBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceManufacturerBytes(vVar);
            return this;
        }

        public Builder setDeviceModel(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceModel(str);
            return this;
        }

        public Builder setDeviceModelBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceModelBytes(vVar);
            return this;
        }

        public Builder setDeviceName(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceName(str);
            return this;
        }

        public Builder setDeviceNameBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setDeviceNameBytes(vVar);
            return this;
        }

        public Builder setExternalPath(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setExternalPath(str);
            return this;
        }

        public Builder setExternalPathBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setExternalPathBytes(vVar);
            return this;
        }

        public Builder setIsTestBuild(boolean z) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setIsTestBuild(z);
            return this;
        }

        public Builder setOsVersion(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setOsVersion(str);
            return this;
        }

        public Builder setOsVersionBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setOsVersionBytes(vVar);
            return this;
        }

        public Builder setRomInfo(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setRomInfo(str);
            return this;
        }

        public Builder setRomInfoBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setRomInfoBytes(vVar);
            return this;
        }

        public Builder setUserPath(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setUserPath(str);
            return this;
        }

        public Builder setUserPathBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setUserPathBytes(vVar);
            return this;
        }

        public Builder setWebUserAgent(String str) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setWebUserAgent(str);
            return this;
        }

        public Builder setWebUserAgentBytes(v vVar) {
            copyOnWrite();
            ((WazeApplicationInfo) this.instance).setWebUserAgentBytes(vVar);
            return this;
        }
    }

    static {
        WazeApplicationInfo wazeApplicationInfo = new WazeApplicationInfo();
        DEFAULT_INSTANCE = wazeApplicationInfo;
        du.registerDefaultInstance(WazeApplicationInfo.class, wazeApplicationInfo);
    }

    private WazeApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppType() {
        this.appType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildSdkVersion() {
        this.buildSdkVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceBrand() {
        this.deviceBrand_ = getDefaultInstance().getDeviceBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceManufacturer() {
        this.deviceManufacturer_ = getDefaultInstance().getDeviceManufacturer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceName() {
        this.deviceName_ = getDefaultInstance().getDeviceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalPath() {
        this.externalPath_ = getDefaultInstance().getExternalPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTestBuild() {
        this.isTestBuild_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRomInfo() {
        this.romInfo_ = getDefaultInstance().getRomInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPath() {
        this.userPath_ = getDefaultInstance().getUserPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebUserAgent() {
        this.webUserAgent_ = getDefaultInstance().getWebUserAgent();
    }

    public static WazeApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WazeApplicationInfo parseDelimitedFrom(InputStream inputStream) {
        return (WazeApplicationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeApplicationInfo parseFrom(v vVar) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<WazeApplicationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppType(AppType appType) {
        this.appType_ = appType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppTypeValue(int i2) {
        this.appType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildSdkVersion(int i2) {
        this.buildSdkVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBrand(String str) {
        Objects.requireNonNull(str);
        this.deviceBrand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceBrandBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deviceBrand_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceManufacturer(String str) {
        Objects.requireNonNull(str);
        this.deviceManufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceManufacturerBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deviceManufacturer_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        Objects.requireNonNull(str);
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deviceModel_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceName(String str) {
        Objects.requireNonNull(str);
        this.deviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.deviceName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalPath(String str) {
        Objects.requireNonNull(str);
        this.externalPath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalPathBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.externalPath_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTestBuild(boolean z) {
        this.isTestBuild_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        Objects.requireNonNull(str);
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.osVersion_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRomInfo(String str) {
        Objects.requireNonNull(str);
        this.romInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRomInfoBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.romInfo_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPath(String str) {
        Objects.requireNonNull(str);
        this.userPath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPathBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.userPath_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebUserAgent(String str) {
        Objects.requireNonNull(str);
        this.webUserAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebUserAgentBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.webUserAgent_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\u000b\f\fȈ\r\u0007", new Object[]{"buildSdkVersion_", "deviceName_", "deviceModel_", "deviceManufacturer_", "romInfo_", "osVersion_", "userPath_", "externalPath_", "webUserAgent_", "appType_", "deviceBrand_", "isTestBuild_"});
        }
        if (iOrdinal == 3) {
            return new WazeApplicationInfo();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<WazeApplicationInfo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (WazeApplicationInfo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public AppType getAppType() {
        AppType appTypeForNumber = AppType.forNumber(this.appType_);
        return appTypeForNumber == null ? AppType.UNRECOGNIZED : appTypeForNumber;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public int getAppTypeValue() {
        return this.appType_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public int getBuildSdkVersion() {
        return this.buildSdkVersion_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getDeviceBrand() {
        return this.deviceBrand_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getDeviceBrandBytes() {
        return v.s(this.deviceBrand_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getDeviceManufacturer() {
        return this.deviceManufacturer_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getDeviceManufacturerBytes() {
        return v.s(this.deviceManufacturer_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getDeviceModel() {
        return this.deviceModel_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getDeviceModelBytes() {
        return v.s(this.deviceModel_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getDeviceName() {
        return this.deviceName_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getDeviceNameBytes() {
        return v.s(this.deviceName_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getExternalPath() {
        return this.externalPath_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getExternalPathBytes() {
        return v.s(this.externalPath_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public boolean getIsTestBuild() {
        return this.isTestBuild_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getOsVersionBytes() {
        return v.s(this.osVersion_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getRomInfo() {
        return this.romInfo_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getRomInfoBytes() {
        return v.s(this.romInfo_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getUserPath() {
        return this.userPath_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getUserPathBytes() {
        return v.s(this.userPath_);
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public String getWebUserAgent() {
        return this.webUserAgent_;
    }

    @Override // com.waze.jni.protos.WazeApplicationInfoOrBuilder
    public v getWebUserAgentBytes() {
        return v.s(this.webUserAgent_);
    }

    public static Builder newBuilder(WazeApplicationInfo wazeApplicationInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(wazeApplicationInfo);
    }

    public static WazeApplicationInfo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (WazeApplicationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeApplicationInfo parseFrom(v vVar, de deVar) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static WazeApplicationInfo parseFrom(z zVar) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static WazeApplicationInfo parseFrom(z zVar, de deVar) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static WazeApplicationInfo parseFrom(InputStream inputStream) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WazeApplicationInfo parseFrom(InputStream inputStream, de deVar) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static WazeApplicationInfo parseFrom(ByteBuffer byteBuffer) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static WazeApplicationInfo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static WazeApplicationInfo parseFrom(byte[] bArr) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WazeApplicationInfo parseFrom(byte[] bArr, de deVar) {
        return (WazeApplicationInfo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
