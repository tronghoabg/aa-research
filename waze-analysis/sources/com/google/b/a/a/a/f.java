package com.google.b.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum f implements eg {
    UNKNOWN_ORDER(0),
    KEY_ORDER(1),
    APPEND_PARENT_ENTRIES(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f6996e;

    f(int i2) {
        this.f6996e = i2;
    }

    public static f a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ORDER;
        }
        if (i2 == 1) {
            return KEY_ORDER;
        }
        if (i2 != 3) {
            return null;
        }
        return APPEND_PARENT_ENTRIES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f6996e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f6996e);
    }
}
