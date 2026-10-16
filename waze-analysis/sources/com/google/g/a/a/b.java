package com.google.g.a.a;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements eg {
    UNKNOWN(0),
    SHARED_PREFS(1),
    CONTENT_PROVIDER(2),
    FILE(6),
    TIKTOK(4),
    DEVICE_CONFIG(5),
    PROCESS_STABLE_CONTENT_PROVIDER(3);


    /* renamed from: i, reason: collision with root package name */
    private final int f11013i;

    b(int i2) {
        this.f11013i = i2;
    }

    public static b a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return SHARED_PREFS;
            case 2:
                return CONTENT_PROVIDER;
            case 3:
                return PROCESS_STABLE_CONTENT_PROVIDER;
            case 4:
                return TIKTOK;
            case 5:
                return DEVICE_CONFIG;
            case 6:
                return FILE;
            default:
                return null;
        }
    }

    public static ei b() {
        return a.f11004a;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11013i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11013i);
    }
}
