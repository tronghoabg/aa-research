package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes4.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f28280a;

    ISAdQualityDeviceIdType(int i5) {
        this.f28280a = i5;
    }

    @Deprecated
    public static ISAdQualityDeviceIdType fromInt(int i5) {
        if (i5 == 0) {
            return NONE;
        }
        if (i5 == 1) {
            return GAID;
        }
        if (i5 != 2) {
            return null;
        }
        return IDFA;
    }

    @Deprecated
    public final int getValue() {
        return this.f28280a;
    }
}
