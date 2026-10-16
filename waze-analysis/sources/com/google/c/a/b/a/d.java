package com.google.c.a.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum d implements eg {
    LOCATION_ALIAS_STATE_UNSPECIFIED(0),
    LOCATION_ALIAS_SET_IN_APP(1),
    LOCATION_ALIAS_UNSET_IN_APP(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f7158e;

    d(int i2) {
        this.f7158e = i2;
    }

    public static d a(int i2) {
        if (i2 == 0) {
            return LOCATION_ALIAS_STATE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return LOCATION_ALIAS_SET_IN_APP;
        }
        if (i2 != 2) {
            return null;
        }
        return LOCATION_ALIAS_UNSET_IN_APP;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f7158e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7158e);
    }
}
