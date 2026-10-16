package com.google.android.gms.h.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum h implements eg {
    UNKNOWN(0),
    ZERO_PARTY(1),
    FIRST_PARTY(2),
    THIRD_PARTY(3),
    FIRST_PARTY_PRIVILEGE(4),
    FIRST_PARTY_COMMON(5),
    SYSTEM(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f5497i;

    h(int i2) {
        this.f5497i = i2;
    }

    public static h a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return ZERO_PARTY;
            case 2:
                return FIRST_PARTY;
            case 3:
                return THIRD_PARTY;
            case 4:
                return FIRST_PARTY_PRIVILEGE;
            case 5:
                return FIRST_PARTY_COMMON;
            case 6:
                return SYSTEM;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f5497i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f5497i);
    }
}
