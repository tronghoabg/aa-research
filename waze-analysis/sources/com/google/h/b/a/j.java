package com.google.h.b.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum j implements eg {
    UNDEFINED(0),
    SSO_USER(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11028d;

    j(int i2) {
        this.f11028d = i2;
    }

    public static j a(int i2) {
        if (i2 == 0) {
            return UNDEFINED;
        }
        if (i2 != 1) {
            return null;
        }
        return SSO_USER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11028d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11028d);
    }
}
