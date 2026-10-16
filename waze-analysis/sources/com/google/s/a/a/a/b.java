package com.google.s.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum b implements eg {
    NONE(0),
    LAST_MODIFIED_BY_USER(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f12533d;

    b(int i2) {
        this.f12533d = i2;
    }

    public static b a(int i2) {
        if (i2 == 0) {
            return NONE;
        }
        if (i2 != 1) {
            return null;
        }
        return LAST_MODIFIED_BY_USER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12533d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12533d);
    }
}
