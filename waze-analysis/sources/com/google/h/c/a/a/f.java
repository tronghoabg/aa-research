package com.google.h.c.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum f implements eg {
    ROLLOUT_STATE_UNKNOWN(0),
    ROLLOUT_DISABLED_KEEP_OVERRIDES(1),
    ROLLOUT_ENABLED_KEEP_OVERRIDES(2),
    ROLLOUT_ENABLED_REMOVE_OVERRIDES(3),
    ROLLOUT_DISABLED_REMOVE_OVERRIDES(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11039g;

    f(int i2) {
        this.f11039g = i2;
    }

    public static f a(int i2) {
        if (i2 == 0) {
            return ROLLOUT_STATE_UNKNOWN;
        }
        if (i2 == 1) {
            return ROLLOUT_DISABLED_KEEP_OVERRIDES;
        }
        if (i2 == 2) {
            return ROLLOUT_ENABLED_KEEP_OVERRIDES;
        }
        if (i2 == 3) {
            return ROLLOUT_ENABLED_REMOVE_OVERRIDES;
        }
        if (i2 != 4) {
            return null;
        }
        return ROLLOUT_DISABLED_REMOVE_OVERRIDES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11039g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11039g);
    }
}
