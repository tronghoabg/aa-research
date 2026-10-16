package com.google.w.r.a;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    OS_TYPE_UNKNOWN(0),
    OS_TYPE_ANDROID(3),
    OS_TYPE_ANDROID_TV(5),
    OS_TYPE_CAST_OS(1),
    OS_TYPE_FUCHSIA(2),
    OS_TYPE_NEST_LINUX(6),
    OS_TYPE_PARTNER_LINUX(4),
    OS_TYPE_IOS(7),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    private final int f13349k;

    b(int i2) {
        this.f13349k = i2;
    }

    public static ei a() {
        return a.f13338a;
    }

    public static b b(int i2) {
        switch (i2) {
            case 0:
                return OS_TYPE_UNKNOWN;
            case 1:
                return OS_TYPE_CAST_OS;
            case 2:
                return OS_TYPE_FUCHSIA;
            case 3:
                return OS_TYPE_ANDROID;
            case 4:
                return OS_TYPE_PARTNER_LINUX;
            case 5:
                return OS_TYPE_ANDROID_TV;
            case 6:
                return OS_TYPE_NEST_LINUX;
            case 7:
                return OS_TYPE_IOS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13349k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13349k);
    }
}
