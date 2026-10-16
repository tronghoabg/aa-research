package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes4.dex */
public enum ISAdQualityInitError {
    AD_QUALITY_SDK_WAS_SHUTDOWN(0),
    ILLEGAL_USER_ID(1),
    ILLEGAL_APP_KEY(2),
    EXCEPTION_ON_INIT(3),
    NO_NETWORK_CONNECTION(4),
    CONFIG_LOAD_TIMEOUT(5),
    CONNECTOR_LOAD_TIMEOUT(6),
    AD_NETWORK_VERSION_NOT_SUPPORTED_YET(7),
    AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK(8),
    AD_QUALITY_ALREADY_INITIALIZED(9),
    NO_AD_NETWORKS(10);


    /* renamed from: a, reason: collision with root package name */
    public final int f28282a;

    ISAdQualityInitError(int i5) {
        this.f28282a = i5;
    }

    @Deprecated
    public static ISAdQualityInitError fromInt(int i5) {
        switch (i5) {
            case 0:
                return AD_QUALITY_SDK_WAS_SHUTDOWN;
            case 1:
                return ILLEGAL_USER_ID;
            case 2:
                return ILLEGAL_APP_KEY;
            case 3:
                return EXCEPTION_ON_INIT;
            case 4:
                return NO_NETWORK_CONNECTION;
            case 5:
                return CONFIG_LOAD_TIMEOUT;
            case 6:
                return CONNECTOR_LOAD_TIMEOUT;
            case 7:
                return AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
            case 8:
                return AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
            case 9:
                return AD_QUALITY_ALREADY_INITIALIZED;
            default:
                return null;
        }
    }

    @Deprecated
    public final int getValue() {
        return this.f28282a;
    }
}
