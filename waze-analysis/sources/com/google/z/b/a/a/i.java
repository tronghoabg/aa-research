package com.google.z.b.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum i implements eg {
    REQUIRES_CITATION(1),
    REQUIRES_PCOUNSEL_REVIEW(2),
    REQUIRES_ACCESS_CONTROL(3),
    UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f13522f;

    i(int i2) {
        this.f13522f = i2;
    }

    public static i a(int i2) {
        if (i2 == 1) {
            return REQUIRES_CITATION;
        }
        if (i2 == 2) {
            return REQUIRES_PCOUNSEL_REVIEW;
        }
        if (i2 == 3) {
            return REQUIRES_ACCESS_CONTROL;
        }
        if (i2 != 4) {
            return null;
        }
        return UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13522f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13522f);
    }
}
