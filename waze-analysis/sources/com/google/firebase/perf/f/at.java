package com.google.firebase.perf.f;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum at implements eg {
    VISIBILITY_STATE_UNKNOWN(0),
    VISIBLE(1),
    HIDDEN(2),
    PRERENDER(3),
    UNLOADED(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f10446g;

    at(int i2) {
        this.f10446g = i2;
    }

    public static at a(int i2) {
        if (i2 == 0) {
            return VISIBILITY_STATE_UNKNOWN;
        }
        if (i2 == 1) {
            return VISIBLE;
        }
        if (i2 == 2) {
            return HIDDEN;
        }
        if (i2 == 3) {
            return PRERENDER;
        }
        if (i2 != 4) {
            return null;
        }
        return UNLOADED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f10446g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10446g);
    }
}
