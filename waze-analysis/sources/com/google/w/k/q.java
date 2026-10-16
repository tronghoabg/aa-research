package com.google.w.k;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum q implements eg {
    REQUIRES_CITATION(1),
    REQUIRES_PCOUNSEL_REVIEW(2),
    UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f13262e;

    q(int i2) {
        this.f13262e = i2;
    }

    public static q a(int i2) {
        if (i2 == 1) {
            return REQUIRES_CITATION;
        }
        if (i2 == 2) {
            return REQUIRES_PCOUNSEL_REVIEW;
        }
        if (i2 != 3) {
            return null;
        }
        return UNRESTRICTED_WITHIN_GOOGLE_NO_3P_USE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13262e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13262e);
    }
}
