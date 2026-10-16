package com.waze.jni.protos;

import com.waze.jni.protos.WazeApplicationInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeApplicationInfoKt {
    public static final WazeApplicationInfoKt INSTANCE = new WazeApplicationInfoKt();

    private WazeApplicationInfoKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final WazeApplicationInfo.Builder _builder;

        private Dsl(WazeApplicationInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ WazeApplicationInfo _build() {
            WazeApplicationInfo wazeApplicationInfoBuild = this._builder.build();
            x.e(wazeApplicationInfoBuild, "build(...)");
            return wazeApplicationInfoBuild;
        }

        public final void clearAppType() {
            this._builder.clearAppType();
        }

        public final void clearBuildSdkVersion() {
            this._builder.clearBuildSdkVersion();
        }

        public final void clearDeviceBrand() {
            this._builder.clearDeviceBrand();
        }

        public final void clearDeviceManufacturer() {
            this._builder.clearDeviceManufacturer();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearDeviceName() {
            this._builder.clearDeviceName();
        }

        public final void clearExternalPath() {
            this._builder.clearExternalPath();
        }

        public final void clearIsTestBuild() {
            this._builder.clearIsTestBuild();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearRomInfo() {
            this._builder.clearRomInfo();
        }

        public final void clearUserPath() {
            this._builder.clearUserPath();
        }

        public final void clearWebUserAgent() {
            this._builder.clearWebUserAgent();
        }

        public final WazeApplicationInfo.AppType getAppType() {
            WazeApplicationInfo.AppType appType = this._builder.getAppType();
            x.e(appType, "getAppType(...)");
            return appType;
        }

        public final int getAppTypeValue() {
            return this._builder.getAppTypeValue();
        }

        public final int getBuildSdkVersion() {
            return this._builder.getBuildSdkVersion();
        }

        public final String getDeviceBrand() {
            String deviceBrand = this._builder.getDeviceBrand();
            x.e(deviceBrand, "getDeviceBrand(...)");
            return deviceBrand;
        }

        public final String getDeviceManufacturer() {
            String deviceManufacturer = this._builder.getDeviceManufacturer();
            x.e(deviceManufacturer, "getDeviceManufacturer(...)");
            return deviceManufacturer;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            x.e(deviceModel, "getDeviceModel(...)");
            return deviceModel;
        }

        public final String getDeviceName() {
            String deviceName = this._builder.getDeviceName();
            x.e(deviceName, "getDeviceName(...)");
            return deviceName;
        }

        public final String getExternalPath() {
            String externalPath = this._builder.getExternalPath();
            x.e(externalPath, "getExternalPath(...)");
            return externalPath;
        }

        public final boolean getIsTestBuild() {
            return this._builder.getIsTestBuild();
        }

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            x.e(osVersion, "getOsVersion(...)");
            return osVersion;
        }

        public final String getRomInfo() {
            String romInfo = this._builder.getRomInfo();
            x.e(romInfo, "getRomInfo(...)");
            return romInfo;
        }

        public final String getUserPath() {
            String userPath = this._builder.getUserPath();
            x.e(userPath, "getUserPath(...)");
            return userPath;
        }

        public final String getWebUserAgent() {
            String webUserAgent = this._builder.getWebUserAgent();
            x.e(webUserAgent, "getWebUserAgent(...)");
            return webUserAgent;
        }

        public final void setAppType(WazeApplicationInfo.AppType appType) {
            x.f(appType, "value");
            this._builder.setAppType(appType);
        }

        public final void setAppTypeValue(int i2) {
            this._builder.setAppTypeValue(i2);
        }

        public final void setBuildSdkVersion(int i2) {
            this._builder.setBuildSdkVersion(i2);
        }

        public final void setDeviceBrand(String str) {
            x.f(str, "value");
            this._builder.setDeviceBrand(str);
        }

        public final void setDeviceManufacturer(String str) {
            x.f(str, "value");
            this._builder.setDeviceManufacturer(str);
        }

        public final void setDeviceModel(String str) {
            x.f(str, "value");
            this._builder.setDeviceModel(str);
        }

        public final void setDeviceName(String str) {
            x.f(str, "value");
            this._builder.setDeviceName(str);
        }

        public final void setExternalPath(String str) {
            x.f(str, "value");
            this._builder.setExternalPath(str);
        }

        public final void setIsTestBuild(boolean z) {
            this._builder.setIsTestBuild(z);
        }

        public final void setOsVersion(String str) {
            x.f(str, "value");
            this._builder.setOsVersion(str);
        }

        public final void setRomInfo(String str) {
            x.f(str, "value");
            this._builder.setRomInfo(str);
        }

        public final void setUserPath(String str) {
            x.f(str, "value");
            this._builder.setUserPath(str);
        }

        public final void setWebUserAgent(String str) {
            x.f(str, "value");
            this._builder.setWebUserAgent(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(WazeApplicationInfo.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(WazeApplicationInfo.Builder builder, o oVar) {
            this(builder);
        }
    }
}
