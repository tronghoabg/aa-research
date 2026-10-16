package com.google.c.a.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum b implements eg {
    USER_CONSENT_STATE_UNKNOWN(0),
    USER_HAS_GIVEN_CONSENT_FOR_DRIVING_INFO_SHARING(1),
    USER_HAS_NOT_GIVEN_CONSENT_FOR_DRIVING_INFO_SHARING(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f7149e;

    b(int i2) {
        this.f7149e = i2;
    }

    public static b a(int i2) {
        if (i2 == 0) {
            return USER_CONSENT_STATE_UNKNOWN;
        }
        if (i2 == 1) {
            return USER_HAS_GIVEN_CONSENT_FOR_DRIVING_INFO_SHARING;
        }
        if (i2 != 2) {
            return null;
        }
        return USER_HAS_NOT_GIVEN_CONSENT_FOR_DRIVING_INFO_SHARING;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f7149e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7149e);
    }
}
