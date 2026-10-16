package com.waze.bg.a.b;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum e implements eg {
    GENDER_UNSPECIFIED(0),
    GENDER_MALE(1),
    GENDER_FEMALE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f16346e;

    e(int i2) {
        this.f16346e = i2;
    }

    public static e a(int i2) {
        if (i2 == 0) {
            return GENDER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return GENDER_MALE;
        }
        if (i2 != 2) {
            return null;
        }
        return GENDER_FEMALE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16346e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16346e);
    }
}
