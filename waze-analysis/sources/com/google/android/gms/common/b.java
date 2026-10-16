package com.google.android.gms.common;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements eg {
    ANDROID_USER_TYPE_UNKNOWN(0),
    ANDROID_USER_TYPE_NON_SYSTEM(1),
    ANDROID_USER_TYPE_HEADLESS_SYSTEM(2),
    ANDROID_USER_TYPE_FULL_SYSTEM(3),
    ANDROID_USER_TYPE_FULL_SECONDARY(4),
    ANDROID_USER_TYPE_PROFILE_MANAGED(9),
    ANDROID_USER_TYPE_PROFILE_PRIVATE(10),
    ANDROID_USER_TYPE_PROFILE_CLONE(11),
    ANDROID_USER_TYPE_PROFILE_OTHER(12),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    private final int f4907l;

    b(int i2) {
        this.f4907l = i2;
    }

    public static b a(int i2) {
        if (i2 == 0) {
            return ANDROID_USER_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return ANDROID_USER_TYPE_NON_SYSTEM;
        }
        if (i2 == 2) {
            return ANDROID_USER_TYPE_HEADLESS_SYSTEM;
        }
        if (i2 == 3) {
            return ANDROID_USER_TYPE_FULL_SYSTEM;
        }
        if (i2 == 4) {
            return ANDROID_USER_TYPE_FULL_SECONDARY;
        }
        switch (i2) {
            case 9:
                return ANDROID_USER_TYPE_PROFILE_MANAGED;
            case 10:
                return ANDROID_USER_TYPE_PROFILE_PRIVATE;
            case 11:
                return ANDROID_USER_TYPE_PROFILE_CLONE;
            case 12:
                return ANDROID_USER_TYPE_PROFILE_OTHER;
            default:
                return null;
        }
    }

    public static ei b() {
        return a.f4660a;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f4907l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f4907l);
    }
}
