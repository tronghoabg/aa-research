package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum at implements com.google.v.eg {
    PRECISION_CENTURY(100),
    PRECISION_DECADE(200),
    PRECISION_YEAR(300),
    PRECISION_MONTH(DisplayStrings.DS_NIGHT),
    PRECISION_DAY(500),
    PRECISION_HOUR(600),
    PRECISION_MINUTE(700),
    PRECISION_SECOND(DisplayStrings.DS_STREETSROAD_WITHOUT_A_NAME);


    /* renamed from: j, reason: collision with root package name */
    private final int f11136j;

    at(int i2) {
        this.f11136j = i2;
    }

    public static at a(int i2) {
        if (i2 == 100) {
            return PRECISION_CENTURY;
        }
        if (i2 == 200) {
            return PRECISION_DECADE;
        }
        if (i2 == 300) {
            return PRECISION_YEAR;
        }
        if (i2 == 400) {
            return PRECISION_MONTH;
        }
        if (i2 == 500) {
            return PRECISION_DAY;
        }
        if (i2 == 600) {
            return PRECISION_HOUR;
        }
        if (i2 == 700) {
            return PRECISION_MINUTE;
        }
        if (i2 != 800) {
            return null;
        }
        return PRECISION_SECOND;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11136j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11136j);
    }
}
