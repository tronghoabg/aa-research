package com.waze.u.a;

import com.google.v.eg;
import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum t implements eg {
    WAZE_VOICE_GENDER_UNSPECIFIED(0),
    WAZE_VOICE_GENDER_MALE(1),
    WAZE_VOICE_GENDER_FEMALE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f41638e;

    t(int i2) {
        this.f41638e = i2;
    }

    public static ei a() {
        return e.f41619d;
    }

    public static t b(int i2) {
        if (i2 == 0) {
            return WAZE_VOICE_GENDER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return WAZE_VOICE_GENDER_MALE;
        }
        if (i2 != 2) {
            return null;
        }
        return WAZE_VOICE_GENDER_FEMALE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f41638e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f41638e);
    }
}
