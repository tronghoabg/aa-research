package com.waze.jni.protos;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.WazeApplicationInfo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface WazeApplicationInfoOrBuilder extends fj {
    WazeApplicationInfo.AppType getAppType();

    int getAppTypeValue();

    int getBuildSdkVersion();

    String getDeviceBrand();

    v getDeviceBrandBytes();

    String getDeviceManufacturer();

    v getDeviceManufacturerBytes();

    String getDeviceModel();

    v getDeviceModelBytes();

    String getDeviceName();

    v getDeviceNameBytes();

    String getExternalPath();

    v getExternalPathBytes();

    boolean getIsTestBuild();

    String getOsVersion();

    v getOsVersionBytes();

    String getRomInfo();

    v getRomInfoBytes();

    String getUserPath();

    v getUserPathBytes();

    String getWebUserAgent();

    v getWebUserAgentBytes();
}
