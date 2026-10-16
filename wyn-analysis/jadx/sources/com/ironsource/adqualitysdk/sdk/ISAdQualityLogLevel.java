package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes4.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* renamed from: a, reason: collision with root package name */
    public final int f28284a;

    ISAdQualityLogLevel(int i5) {
        this.f28284a = i5;
    }

    @Deprecated
    public static ISAdQualityLogLevel fromInt(int i5) {
        if (i5 == 0) {
            return NONE;
        }
        if (i5 == 1) {
            return ERROR;
        }
        if (i5 == 2) {
            return WARNING;
        }
        if (i5 == 3) {
            return INFO;
        }
        if (i5 == 4) {
            return DEBUG;
        }
        if (i5 != 5) {
            return null;
        }
        return VERBOSE;
    }

    @Deprecated
    public final int getValue() {
        return this.f28284a;
    }

    @Deprecated
    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i5 = NONE.f28284a;
        int i10 = this.f28284a;
        return i10 != i5 && i10 >= iSAdQualityLogLevel.f28284a;
    }
}
